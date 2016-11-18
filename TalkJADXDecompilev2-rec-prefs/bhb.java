package p000;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

public final class bhb implements Serializable {
    private static final AtomicInteger f3339a = new AtomicInteger(1);
    private final String f3340b;
    private final String f3341c;
    private boolean f3342d = false;

    public synchronized void m5244a() {
        this.f3342d = true;
    }

    public bhb(String str) {
        bm.m6122a((Object) str);
        this.f3340b = str;
        long b = glj.m17963b();
        String valueOf = String.valueOf("_");
        this.f3341c = new StringBuilder(String.valueOf(valueOf).length() + 31).append(b).append(valueOf).append(f3339a.getAndIncrement()).toString();
    }

    private boolean m5243c() {
        return !TextUtils.isEmpty(this.f3340b);
    }

    public String m5245b() {
        if (m5243c()) {
            return this.f3340b;
        }
        return toString();
    }

    public int hashCode() {
        return this.f3341c.hashCode() + this.f3340b.hashCode();
    }

    public boolean equals(Object obj) {
        bhb bhb = (bhb) obj;
        if (bhb != null) {
            return bhb.f3340b.equals(this.f3340b) && bhb.f3341c.equals(this.f3341c);
        } else {
            return super.equals(obj);
        }
    }

    public String toString() {
        String str = this.f3340b;
        String valueOf = String.valueOf("_");
        String str2 = this.f3341c;
        return new StringBuilder(((String.valueOf(str).length() + 0) + String.valueOf(valueOf).length()) + String.valueOf(str2).length()).append(str).append(valueOf).append(str2).toString();
    }
}
