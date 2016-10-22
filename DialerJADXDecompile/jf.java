import android.os.Build.VERSION;
import android.view.LayoutInflater;

/* compiled from: PG */
public final class jf {
    public static final jg a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            a = new ji();
        } else if (i >= 11) {
            a = new jh();
        } else {
            a = new jg();
        }
    }

    public static void a(LayoutInflater layoutInflater, jl jlVar) {
        a.a(layoutInflater, jlVar);
    }
}
