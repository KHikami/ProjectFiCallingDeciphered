package defpackage;

import android.content.Context;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: adq */
public final class adq extends adp {
    private final Context b;
    private final List c;
    private adn d;

    public adq(Context context) {
        this.c = new ArrayList();
        this.b = context;
        this.d = adn.a(PreferenceManager.getDefaultSharedPreferences(this.b));
        a(true);
    }

    private final void a(adn adn, boolean z, boolean z2) {
        if (!adn.equals(this.d)) {
            this.d = adn;
            if (z) {
                adn.a(PreferenceManager.getDefaultSharedPreferences(this.b), this.d);
            }
            if (z2 && !this.c.isEmpty()) {
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    public final void a(boolean z) {
        if (this.d != null) {
            switch (this.d.a) {
                case -6:
                    a(adn.a(PreferenceManager.getDefaultSharedPreferences(this.b)), false, true);
                case rl.c /*0*/:
                    boolean z2;
                    afb a = afb.a(this.b);
                    agd agd = new agd(this.d.c, this.d.b, this.d.d);
                    for (agd equals : a.a(false)) {
                        if (agd.equals(equals)) {
                            z2 = true;
                            if (!z2) {
                                a(adn.a(-2), true, true);
                            }
                        }
                    }
                    z2 = false;
                    if (!z2) {
                        a(adn.a(-2), true, true);
                    }
                default:
            }
        }
    }
}
