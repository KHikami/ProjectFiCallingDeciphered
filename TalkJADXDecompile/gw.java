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
    static final int a;
    private static final Object b;
    private static String c;
    private static Set<String> d;
    private static final Object g;
    private static hd h;
    private static final gy i;
    private final Context e;
    private final NotificationManager f;

    static {
        b = new Object();
        d = new HashSet();
        g = new Object();
        if (gwb.c()) {
            i = new gz();
        } else if (VERSION.SDK_INT >= 19) {
            i = new ha((byte) 0);
        } else if (VERSION.SDK_INT >= 14) {
            i = new ha();
        } else {
            i = new gy();
        }
        a = i.a();
    }

    public static gw a(Context context) {
        return new gw(context);
    }

    private gw(Context context) {
        this.e = context;
        this.f = (NotificationManager) this.e.getSystemService("notification");
    }

    public void a(String str, int i) {
        i.a(this.f, str, i);
        if (VERSION.SDK_INT <= 19) {
            a(new gx(this.e.getPackageName(), i, str));
        }
    }

    public static Set<String> b(Context context) {
        String string = Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (b) {
            if (string != null) {
                if (!string.equals(c)) {
                    String[] split = string.split(":");
                    Set hashSet = new HashSet(split.length);
                    for (String unflattenFromString : split) {
                        ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                        if (unflattenFromString2 != null) {
                            hashSet.add(unflattenFromString2.getPackageName());
                        }
                    }
                    d = hashSet;
                    c = string;
                }
            }
        }
        return d;
    }

    private void a(hf hfVar) {
        synchronized (g) {
            if (h == null) {
                h = new hd(this.e.getApplicationContext());
            }
            h.a(hfVar);
        }
    }

    public void a(String str, int i, Notification notification) {
        Object obj;
        Bundle a = fq.a.a(notification);
        if (a == null || !a.getBoolean("android.support.useSideChannel")) {
            obj = null;
        } else {
            obj = 1;
        }
        if (obj != null) {
            a(new hb(this.e.getPackageName(), i, str, notification));
            i.a(this.f, str, i);
            return;
        }
        i.a(this.f, str, i, notification);
    }
}
