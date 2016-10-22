import android.text.TextUtils;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

public final class bhb implements Serializable {
    private static final AtomicInteger a;
    private final String b;
    private final String c;
    private boolean d;

    static {
        a = new AtomicInteger(1);
    }

    public synchronized void a() {
        this.d = true;
    }

    public bhb(String str) {
        this.d = false;
        bm.a((Object) str);
        this.b = str;
        long b = glj.b();
        String valueOf = String.valueOf("_");
        this.c = new StringBuilder(String.valueOf(valueOf).length() + 31).append(b).append(valueOf).append(a.getAndIncrement()).toString();
    }

    private boolean c() {
        return !TextUtils.isEmpty(this.b);
    }

    public String b() {
        if (c()) {
            return this.b;
        }
        return toString();
    }

    public int hashCode() {
        return this.c.hashCode() + this.b.hashCode();
    }

    public boolean equals(Object obj) {
        bhb bhb = (bhb) obj;
        if (bhb != null) {
            return bhb.b.equals(this.b) && bhb.c.equals(this.c);
        } else {
            return super.equals(obj);
        }
    }

    public String toString() {
        String str = this.b;
        String valueOf = String.valueOf("_");
        String str2 = this.c;
        return new StringBuilder(((String.valueOf(str).length() + 0) + String.valueOf(valueOf).length()) + String.valueOf(str2).length()).append(str).append(valueOf).append(str2).toString();
    }
}
