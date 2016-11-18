package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Set;

public abstract class gwg<T extends IInterface> extends gvo<T> implements gug, gwi {
    private final gwa f16238e;
    private final Set<Scope> f16239f;
    private final Account f16240g;

    public gwg(Context context, Looper looper, int i, gwa gwa, guk guk, gul gul) {
        this(context, looper, gwj.m18777a(context), gtp.f16131a, i, gwa, (guk) gwb.m1419L((Object) guk), (gul) gwb.m1419L((Object) gul));
    }

    protected Set<Scope> m18717a(Set<Scope> set) {
        return set;
    }

    public final Account mo2343l() {
        return this.f16240g;
    }

    protected final Set<Scope> mo2344q() {
        return this.f16239f;
    }

    private gwg(Context context, Looper looper, gwj gwj, gtp gtp, int i, gwa gwa, guk guk, gul gul) {
        super(context, looper, gwj, gtp, i, guk == null ? null : new gvq(guk), gul == null ? null : new gvr(gul), gwa.m18761g());
        this.f16238e = gwa;
        this.f16240g = gwa.m18754a();
        Set d = gwa.m18758d();
        Set<Scope> a = m18717a(d);
        for (Scope contains : a) {
            if (!d.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f16239f = a;
    }
}
