package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

public final class gxl {
    private static Object f16326a = new Object();
    private static boolean f16327b;
    private static String f16328c;
    private static int f16329d;

    public static int m18915a(Context context) {
        synchronized (f16326a) {
            if (f16327b) {
            } else {
                f16327b = true;
                try {
                    Bundle bundle = hhg.f16968a.m19794a(context).m19791a(context.getPackageName(), 128).metaData;
                    if (bundle == null) {
                    } else {
                        f16328c = bundle.getString("com.google.app.id");
                        f16329d = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (Throwable e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
        return f16329d;
    }
}
