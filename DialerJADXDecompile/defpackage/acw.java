package defpackage;

import android.util.Log;
import java.util.Properties;

/* compiled from: PG */
/* renamed from: acw */
public final class acw {
    public static Properties a;
    public static acv b;
    private static String c;

    static {
        c = "ExtensionsFactory";
        a = null;
        b = null;
    }

    public static Object a(String str) {
        try {
            return Class.forName(str).newInstance();
        } catch (Throwable e) {
            Log.e(c, String.valueOf(str).concat(": unable to create instance."), e);
            return null;
        } catch (Throwable e2) {
            Log.e(c, String.valueOf(str).concat(": unable to create instance."), e2);
            return null;
        } catch (Throwable e22) {
            Log.e(c, String.valueOf(str).concat(": unable to create instance."), e22);
            return null;
        }
    }
}
