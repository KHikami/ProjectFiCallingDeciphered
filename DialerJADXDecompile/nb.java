import android.os.Build.VERSION;
import android.os.Bundle;
import java.util.List;

/* compiled from: PG */
public class nb {
    private static final nc b;
    public final Object a;

    static {
        if (VERSION.SDK_INT >= 19) {
            b = new ne();
        } else if (VERSION.SDK_INT >= 16) {
            b = new nd();
        } else {
            b = new nc();
        }
    }

    public nb() {
        this.a = b.a(this);
    }

    public nb(Object obj) {
        this.a = obj;
    }

    public mr a(int i) {
        return null;
    }

    public boolean a(int i, int i2, Bundle bundle) {
        return false;
    }

    public static List a() {
        return null;
    }

    public static mr b() {
        return null;
    }
}
