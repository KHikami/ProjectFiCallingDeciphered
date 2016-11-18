package p000;

import android.content.Context;
import android.net.Uri;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class jtq {
    private static jtq f21042a;
    private final Context f21043b;
    private final Map<String, Integer> f21044c = new ConcurrentHashMap();
    private ihf f21045d;

    public static synchronized jtq m25206a(Context context) {
        jtq jtq;
        synchronized (jtq.class) {
            if (f21042a == null) {
                f21042a = new jtq(context);
            }
            jtq = f21042a;
        }
        return jtq;
    }

    private jtq(Context context) {
        this.f21043b = context.getApplicationContext();
    }

    public void m25207a(Uri uri, String str, jtt jtt, jts jts) {
        Map map = this.f21044c;
        String valueOf = String.valueOf(uri);
        Integer num = (Integer) map.get(new StringBuilder((String.valueOf(valueOf).length() + 0) + String.valueOf(str).length()).append(valueOf).append(str).toString());
        if (num != null) {
            jtt.mo3584b(num.intValue());
            return;
        }
        if (kdj.m25587a(uri)) {
            this.f21043b.grantUriPermission("com.google.android.gms", jts.mo3583a(uri), 1);
        }
        if (this.f21045d == null) {
            this.f21045d = (ihf) jyn.m25426a(this.f21043b, ihf.class);
        }
        ihf ihf = this.f21045d;
        jtr jtr = new jtr(this, uri, str, jtt);
    }
}
