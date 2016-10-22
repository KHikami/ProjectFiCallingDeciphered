package defpackage;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

/* compiled from: PG */
/* renamed from: bkb */
final class bkb implements OnPreferenceClickListener {
    private /* synthetic */ bka a;

    bkb(bka bka) {
        this.a = bka;
    }

    public final boolean onPreferenceClick(Preference preference) {
        this.a.a();
        return true;
    }
}
