package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

/* renamed from: gxl */
public final class gxl {
    private static Object a;
    private static boolean b;
    private static String c;
    private static int d;

    static {
        a = new Object();
    }

    public static int a(Context context) {
        synchronized (a) {
            if (b) {
            } else {
                b = true;
                try {
                    Bundle bundle = hhg.a.a(context).a(context.getPackageName(), 128).metaData;
                    if (bundle == null) {
                    } else {
                        c = bundle.getString("com.google.app.id");
                        d = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (Throwable e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
        return d;
    }
}
