package p000;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.SwitchPreference;

final class ghm implements OnPreferenceClickListener {
    final /* synthetic */ SwitchPreference f15279a;
    final /* synthetic */ ghj f15280b;

    ghm(ghj ghj, SwitchPreference switchPreference) {
        this.f15280b = ghj;
        this.f15279a = switchPreference;
    }

    public boolean onPreferenceClick(Preference preference) {
        ggc.m17608a(this.f15280b.getActivity()).m17623b(this.f15279a.isChecked());
        this.f15280b.m17704b();
        return true;
    }
}
