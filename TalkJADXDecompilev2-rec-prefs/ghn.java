package p000;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.SwitchPreference;

final class ghn implements OnPreferenceClickListener {
    final /* synthetic */ SwitchPreference f15281a;
    final /* synthetic */ ghj f15282b;

    ghn(ghj ghj, SwitchPreference switchPreference) {
        this.f15282b = ghj;
        this.f15281a = switchPreference;
    }

    public boolean onPreferenceClick(Preference preference) {
        ggc.m17608a(this.f15282b.getActivity()).m17625c(this.f15281a.isChecked());
        this.f15282b.m17704b();
        return true;
    }
}
