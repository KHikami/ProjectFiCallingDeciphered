import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Set;

public abstract class gwg<T extends IInterface> extends gvo<T> implements gug, gwi {
    private final gwa e;
    private final Set<Scope> f;
    private final Account g;

    public gwg(Context context, Looper looper, int i, gwa gwa, guk guk, gul gul) {
        this(context, looper, gwj.a(context), gtp.a, i, gwa, (guk) gwb.L((Object) guk), (gul) gwb.L((Object) gul));
    }

    protected Set<Scope> a(Set<Scope> set) {
        return set;
    }

    public final Account l() {
        return this.g;
    }

    protected final Set<Scope> q() {
        return this.f;
    }

    private gwg(Context context, Looper looper, gwj gwj, gtp gtp, int i, gwa gwa, guk guk, gul gul) {
        super(context, looper, gwj, gtp, i, guk == null ? null : new gvq(guk), gul == null ? null : new gvr(gul), gwa.g());
        this.e = gwa;
        this.g = gwa.a();
        Set d = gwa.d();
        Set<Scope> a = a(d);
        for (Scope contains : a) {
            if (!d.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f = a;
    }
}
