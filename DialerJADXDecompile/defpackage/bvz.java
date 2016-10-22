package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.stats.WakeLockEvent;
import java.util.List;

/* renamed from: bvz */
public final class bvz {
    public static bvz a;
    private static String b;
    private static Integer c;

    static {
        b = "WakeLockTracker";
        a = new bvz();
    }

    private static int a() {
        try {
            return buf.r() ? ((Integer) bvu.a.b()).intValue() : bvv.b;
        } catch (SecurityException e) {
            return bvv.b;
        }
    }

    public final void a(Context context, String str, int i, String str2, String str3, int i2, List list) {
        bvz.a(context, str, 8, str2, str3, i2, list, 0);
    }

    public static void a(Context context, String str, int i, String str2, String str3, int i2, List list, long j) {
        if (c == null) {
            c = Integer.valueOf(bvz.a());
        }
        if ((c.intValue() != bvv.b ? 1 : null) != null) {
            if (TextUtils.isEmpty(str)) {
                Log.e(b, "missing wakeLock key. " + str);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (7 == i || 8 == i || 10 == i || 11 == i) {
                try {
                    context.startService(new Intent().setComponent(bvv.a).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", new WakeLockEvent(currentTimeMillis, i, str2, i2, list, str, SystemClock.elapsedRealtime(), bwc.a(context), str3, context.getPackageName(), bwc.b(context), j)));
                } catch (Throwable e) {
                    Log.wtf(b, e);
                }
            }
        }
    }
}
