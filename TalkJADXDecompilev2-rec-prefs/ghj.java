package p000;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.SwitchPreference;

public final class ghj extends PreferenceFragment implements ghr {
    public void onCreate(Bundle bundle) {
        boolean z;
        boolean z2 = true;
        super.onCreate(bundle);
        addPreferencesFromResource(gwb.wk);
        if (gwb.m1906a(getActivity(), "babel_hutch_launched", false)) {
            getActivity().setTitle(gwb.wa);
        } else {
            getActivity().setTitle(gwb.vZ);
        }
        SwitchPreference switchPreference = (SwitchPreference) findPreference("wifi_calling_enabled_key");
        if (gwb.m1906a(getActivity(), "babel_hutch_launched", false)) {
            switchPreference.setTitle(gwb.wj);
            switchPreference.setSummary(gwb.wi);
        } else {
            switchPreference.setTitle(gwb.wf);
            switchPreference.setSummary(gwb.we);
        }
        switchPreference.setOnPreferenceClickListener(new ghk(this, switchPreference));
        Preference findPreference = findPreference("account_key");
        ggc.m17608a(getActivity());
        if (ggc.m17610a().length <= 1) {
            z = false;
        } else {
            if ("hangouts_testing_users".equals(gwb.m1998b(getActivity(), "babel_user_to_allow_wifi_calling_for", "tycho_users"))) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            findPreference.setOnPreferenceClickListener(new ghl(this));
        } else {
            getPreferenceScreen().removePreference(findPreference);
        }
        switchPreference = (SwitchPreference) findPreference("ask_each_call_key");
        if (!ggc.m17608a(getActivity()).m17629e()) {
            if (!"hangouts_testing_users".equals(gwb.m1998b(getActivity(), "babel_user_to_allow_wifi_calling_for", "tycho_users"))) {
                z2 = false;
            }
        }
        if (z2) {
            switchPreference.setOnPreferenceClickListener(new ghm(this, switchPreference));
        } else {
            getPreferenceScreen().removePreference(switchPreference);
        }
        switchPreference = (SwitchPreference) findPreference("request_feedback_key");
        if (gwb.m1906a(getActivity(), "babel_request_call_feedback", false)) {
            switchPreference.setOnPreferenceClickListener(new ghn(this, switchPreference));
        } else {
            getPreferenceScreen().removePreference(switchPreference);
        }
        m17704b();
    }

    public void mo2273a() {
        if (getActivity() != null) {
            m17704b();
        }
    }

    void m17704b() {
        ggc a = ggc.m17608a(getActivity());
        boolean c = a.m17626c();
        ((SwitchPreference) findPreference("wifi_calling_enabled_key")).setChecked(c);
        Preference findPreference = findPreference("account_key");
        if (findPreference != null) {
            findPreference.setSummary(fde.m14995a(getActivity(), a.m17618b()));
            findPreference.setEnabled(c);
        }
        SwitchPreference switchPreference = (SwitchPreference) findPreference("ask_each_call_key");
        if (switchPreference != null) {
            switchPreference.setChecked(a.m17629e());
            switchPreference.setEnabled(c);
        }
        switchPreference = (SwitchPreference) findPreference("request_feedback_key");
        if (switchPreference != null) {
            switchPreference.setChecked(a.m17634j());
            switchPreference.setEnabled(c);
        }
    }
}
