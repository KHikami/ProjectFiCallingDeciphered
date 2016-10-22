import android.content.Context;
import android.net.Uri;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class jtq {
    private static jtq a;
    private final Context b;
    private final Map<String, Integer> c;
    private ihf d;

    public static synchronized jtq a(Context context) {
        jtq jtq;
        synchronized (jtq.class) {
            if (a == null) {
                a = new jtq(context);
            }
            jtq = a;
        }
        return jtq;
    }

    private jtq(Context context) {
        this.c = new ConcurrentHashMap();
        this.b = context.getApplicationContext();
    }

    public void a(Uri uri, String str, jtt jtt, jts jts) {
        Map map = this.c;
        String valueOf = String.valueOf(uri);
        Integer num = (Integer) map.get(new StringBuilder((String.valueOf(valueOf).length() + 0) + String.valueOf(str).length()).append(valueOf).append(str).toString());
        if (num != null) {
            jtt.b(num.intValue());
            return;
        }
        if (kdj.a(uri)) {
            this.b.grantUriPermission("com.google.android.gms", jts.a(uri), 1);
        }
        if (this.d == null) {
            this.d = (ihf) jyn.a(this.b, ihf.class);
        }
        ihf ihf = this.d;
        jtr jtr = new jtr(this, uri, str, jtt);
    }
}
