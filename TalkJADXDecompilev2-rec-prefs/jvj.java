package p000;

import java.util.concurrent.TimeUnit;

final class jvj extends jvg {
    static final long f21129a = TimeUnit.HOURS.toMillis(1);
    private final lo<String, jvh> f21130b = new lo();
    private final icq f21131c;

    jvj(icq icq) {
        this.f21131c = icq;
    }

    public synchronized jvh mo3614a(String str) {
        jvh jvh;
        jvh = (jvh) this.f21130b.get(str);
        if (jvh == null) {
            jvh = new jvh(str, this.f21131c);
            this.f21130b.put(str, jvh);
        }
        return jvh;
    }
}
