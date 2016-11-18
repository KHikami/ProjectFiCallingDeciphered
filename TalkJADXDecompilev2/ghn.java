package defpackage;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.SwitchPreference;

final class ghn implements OnPreferenceClickListener {
    final /* synthetic */ SwitchPreference a;
    final /* synthetic */ ghj b;

    ghn(ghj ghj, SwitchPreference switchPreference) {
        this.b = ghj;
        this.a = switchPreference;
    }

    public boolean onPreferenceClick(Preference preference) {
        ggc.a(this.b.getActivity()).c(this.a.isChecked());
        this.b.b();
        return true;
    }
}
