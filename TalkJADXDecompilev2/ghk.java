package defpackage;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.SwitchPreference;

final class ghk implements OnPreferenceClickListener {
    final /* synthetic */ SwitchPreference a;
    final /* synthetic */ ghj b;

    ghk(ghj ghj, SwitchPreference switchPreference) {
        this.b = ghj;
        this.a = switchPreference;
    }

    public boolean onPreferenceClick(Preference preference) {
        boolean isChecked = this.a.isChecked();
        ggc.a(this.b.getActivity()).a(isChecked);
        if (isChecked) {
            ((ghq) jyn.a(this.b.getActivity(), ghq.class)).a(this.b.getActivity(), this.b);
        } else {
            this.b.b();
        }
        return true;
    }
}
