package p000;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.provider.Settings.Secure;
import java.util.HashSet;
import java.util.Set;

public final class gw {
    static final int f16259a = f16265i.mo2427a();
    private static final Object f16260b = new Object();
    private static String f16261c;
    private static Set<String> f16262d = new HashSet();
    private static final Object f16263g = new Object();
    private static hd f16264h;
    private static final gy f16265i;
    private final Context f16266e;
    private final NotificationManager f16267f = ((NotificationManager) this.f16266e.getSystemService("notification"));

    static {
        if (gwb.m2107c()) {
            f16265i = new gz();
        } else if (VERSION.SDK_INT >= 19) {
            f16265i = new ha((byte) 0);
        } else if (VERSION.SDK_INT >= 14) {
            f16265i = new ha();
        } else {
            f16265i = new gy();
        }
    }

    public static gw m18748a(Context context) {
        return new gw(context);
    }

    private gw(Context context) {
        this.f16266e = context;
    }

    public void m18751a(String str, int i) {
        f16265i.m18938a(this.f16267f, str, i);
        if (VERSION.SDK_INT <= 19) {
            m18749a(new gx(this.f16266e.getPackageName(), i, str));
        }
    }

    public static Set<String> m18750b(Context context) {
        String string = Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f16260b) {
            if (string != null) {
                if (!string.equals(f16261c)) {
                    String[] split = string.split(":");
                    Set hashSet = new HashSet(split.length);
                    for (String unflattenFromString : split) {
                        ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                        if (unflattenFromString2 != null) {
                            hashSet.add(unflattenFromString2.getPackageName());
                        }
                    }
                    f16262d = hashSet;
                    f16261c = string;
                }
            }
        }
        return f16262d;
    }

    private void m18749a(hf hfVar) {
        synchronized (f16263g) {
            if (f16264h == null) {
                f16264h = new hd(this.f16266e.getApplicationContext());
            }
            f16264h.m19392a(hfVar);
        }
    }

    public void m18752a(String str, int i, Notification notification) {
        Object obj;
        Bundle a = fq.f13726a.mo2204a(notification);
        if (a == null || !a.getBoolean("android.support.useSideChannel")) {
            obj = null;
        } else {
            obj = 1;
        }
        if (obj != null) {
            m18749a(new hb(this.f16266e.getPackageName(), i, str, notification));
            f16265i.m18938a(this.f16267f, str, i);
            return;
        }
        f16265i.m18939a(this.f16267f, str, i, notification);
    }
}
