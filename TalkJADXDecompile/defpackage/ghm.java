package defpackage;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.SwitchPreference;

/* renamed from: ghm */
final class ghm implements OnPreferenceClickListener {
    final /* synthetic */ SwitchPreference a;
    final /* synthetic */ ghj b;

    ghm(ghj ghj, SwitchPreference switchPreference) {
        this.b = ghj;
        this.a = switchPreference;
    }

    public boolean onPreferenceClick(Preference preference) {
        ggc.a(this.b.getActivity()).b(this.a.isChecked());
        this.b.b();
        return true;
    }
}
