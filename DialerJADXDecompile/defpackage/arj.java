package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.preference.CheckBoxPreference;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.PreferenceFragment;
import android.preference.PreferenceScreen;
import android.provider.Settings.System;
import android.telephony.CarrierConfigManager;
import android.telephony.TelephonyManager;
import android.widget.Toast;

/* compiled from: PG */
/* renamed from: arj */
public class arj extends PreferenceFragment implements OnPreferenceChangeListener {
    Preference a;
    final Handler b;
    private final Runnable c;
    private CheckBoxPreference d;
    private CheckBoxPreference e;
    private ListPreference f;

    public arj() {
        this.b = new ark(this);
        this.c = new arl(this);
    }

    public Context getContext() {
        return getActivity();
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        addPreferencesFromResource(buf.hW);
        Context activity = getActivity();
        this.a = findPreference(activity.getString(cob.cJ));
        this.d = (CheckBoxPreference) findPreference(activity.getString(cob.ds));
        this.e = (CheckBoxPreference) findPreference(activity.getString(cob.cG));
        this.f = (ListPreference) findPreference(activity.getString(cob.ce));
        if (a()) {
            this.d.setOnPreferenceChangeListener(this);
        } else {
            getPreferenceScreen().removePreference(this.d);
            this.d = null;
        }
        this.e.setOnPreferenceChangeListener(this);
        CheckBoxPreference checkBoxPreference = this.e;
        if (System.getInt(getActivity().getContentResolver(), "dtmf_tone", 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        checkBoxPreference.setChecked(z);
        TelephonyManager telephonyManager = (TelephonyManager) getActivity().getSystemService("phone");
        if (buf.i() < 23 || !telephonyManager.canChangeDtmfToneLength() || (!telephonyManager.isWorldPhone() && ((CarrierConfigManager) getActivity().getSystemService("carrier_config")).getConfig().getBoolean("hide_carrier_network_settings_bool"))) {
            getPreferenceScreen().removePreference(this.f);
            this.f = null;
            return;
        }
        this.f.setOnPreferenceChangeListener(this);
        this.f.setValueIndex(System.getInt(activity.getContentResolver(), "dtmf_tone_type", 0));
    }

    public void onResume() {
        boolean z = true;
        super.onResume();
        if (System.canWrite(getContext())) {
            if (this.d != null) {
                CheckBoxPreference checkBoxPreference = this.d;
                int i = System.getInt(getActivity().getContentResolver(), "vibrate_when_ringing", 0);
                if (!(a() && i == 1)) {
                    z = false;
                }
                checkBoxPreference.setChecked(z);
            }
            new Thread(this.c).start();
            return;
        }
        getActivity().onBackPressed();
    }

    public boolean onPreferenceChange(Preference preference, Object obj) {
        int i = 0;
        if (!System.canWrite(getContext())) {
            Toast.makeText(getContext(), getResources().getString(cob.dg), 0).show();
        } else if (preference == this.d) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            ContentResolver contentResolver = getActivity().getContentResolver();
            String str = "vibrate_when_ringing";
            if (booleanValue) {
                i = 1;
            }
            System.putInt(contentResolver, str, i);
        } else if (preference == this.f) {
            System.putInt(getActivity().getContentResolver(), "dtmf_tone_type", this.f.findIndexOfValue((String) obj));
        }
        return true;
    }

    public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) {
        int i = 0;
        if (!System.canWrite(getContext())) {
            Toast.makeText(getContext(), getResources().getString(cob.dg), 0).show();
        } else if (preference == this.e) {
            ContentResolver contentResolver = getActivity().getContentResolver();
            String str = "dtmf_tone";
            if (this.e.isChecked()) {
                i = 1;
            }
            System.putInt(contentResolver, str, i);
        }
        return true;
    }

    private final boolean a() {
        Vibrator vibrator = (Vibrator) getActivity().getSystemService("vibrator");
        return vibrator != null && vibrator.hasVibrator();
    }
}
