import android.content.Context;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
public abstract class afb {
    private static final Object a;
    private static afb b;

    public abstract afv a(agc agc);

    public abstract List a();

    public abstract List a(boolean z);

    public abstract Map b();

    static {
        a = new Object();
    }

    public static afb a(Context context) {
        synchronized (a) {
            if (b == null) {
                b = new afc(context.getApplicationContext());
            }
        }
        return b;
    }

    public final afv a(String str, String str2) {
        return a(agc.a(str, str2));
    }
}
