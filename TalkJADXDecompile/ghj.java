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
        if (gwb.a(getActivity(), "babel_hutch_launched", false)) {
            getActivity().setTitle(gwb.wa);
        } else {
            getActivity().setTitle(gwb.vZ);
        }
        SwitchPreference switchPreference = (SwitchPreference) findPreference("wifi_calling_enabled_key");
        if (gwb.a(getActivity(), "babel_hutch_launched", false)) {
            switchPreference.setTitle(gwb.wj);
            switchPreference.setSummary(gwb.wi);
        } else {
            switchPreference.setTitle(gwb.wf);
            switchPreference.setSummary(gwb.we);
        }
        switchPreference.setOnPreferenceClickListener(new ghk(this, switchPreference));
        Preference findPreference = findPreference("account_key");
        ggc.a(getActivity());
        if (ggc.a().length <= 1) {
            z = false;
        } else {
            if ("hangouts_testing_users".equals(gwb.b(getActivity(), "babel_user_to_allow_wifi_calling_for", "tycho_users"))) {
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
        if (!ggc.a(getActivity()).e()) {
            if (!"hangouts_testing_users".equals(gwb.b(getActivity(), "babel_user_to_allow_wifi_calling_for", "tycho_users"))) {
                z2 = false;
            }
        }
        if (z2) {
            switchPreference.setOnPreferenceClickListener(new ghm(this, switchPreference));
        } else {
            getPreferenceScreen().removePreference(switchPreference);
        }
        switchPreference = (SwitchPreference) findPreference("request_feedback_key");
        if (gwb.a(getActivity(), "babel_request_call_feedback", false)) {
            switchPreference.setOnPreferenceClickListener(new ghn(this, switchPreference));
        } else {
            getPreferenceScreen().removePreference(switchPreference);
        }
        b();
    }

    public void a() {
        if (getActivity() != null) {
            b();
        }
    }

    void b() {
        ggc a = ggc.a(getActivity());
        boolean c = a.c();
        ((SwitchPreference) findPreference("wifi_calling_enabled_key")).setChecked(c);
        Preference findPreference = findPreference("account_key");
        if (findPreference != null) {
            findPreference.setSummary(fde.a(getActivity(), a.b()));
            findPreference.setEnabled(c);
        }
        SwitchPreference switchPreference = (SwitchPreference) findPreference("ask_each_call_key");
        if (switchPreference != null) {
            switchPreference.setChecked(a.e());
            switchPreference.setEnabled(c);
        }
        switchPreference = (SwitchPreference) findPreference("request_feedback_key");
        if (switchPreference != null) {
            switchPreference.setChecked(a.j());
            switchPreference.setEnabled(c);
        }
    }
}
