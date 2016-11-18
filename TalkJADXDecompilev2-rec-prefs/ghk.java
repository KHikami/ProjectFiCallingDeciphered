package p000;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.SwitchPreference;

final class ghk implements OnPreferenceClickListener {
    final /* synthetic */ SwitchPreference f15276a;
    final /* synthetic */ ghj f15277b;

    ghk(ghj ghj, SwitchPreference switchPreference) {
        this.f15277b = ghj;
        this.f15276a = switchPreference;
    }

    public boolean onPreferenceClick(Preference preference) {
        boolean isChecked = this.f15276a.isChecked();
        ggc.m17608a(this.f15277b.getActivity()).m17617a(isChecked);
        if (isChecked) {
            ((ghq) jyn.m25426a(this.f15277b.getActivity(), ghq.class)).mo2251a(this.f15277b.getActivity(), this.f15277b);
        } else {
            this.f15277b.m17704b();
        }
        return true;
    }
}
