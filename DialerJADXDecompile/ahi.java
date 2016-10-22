import android.content.Context;
import android.util.Log;

/* compiled from: PG */
public final class ahi extends agf {
    private ahi(Context context, String str) {
        this.a = null;
        this.b = null;
        this.e = buf.dA;
        this.f = buf.dy;
        this.c = null;
        this.d = null;
        try {
            h();
            c(context);
            i();
            d(context);
            e(context);
            f(context);
            g(context);
            h(context);
            i(context);
            j(context);
            k(context);
            l(context);
            j();
            k();
            this.g = true;
        } catch (Throwable e) {
            Log.e("FallbackAccountType", "Problem building account type", e);
        }
    }

    public ahi(Context context) {
        this(context, null);
    }

    public final boolean b() {
        return true;
    }
}
