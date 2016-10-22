import java.util.concurrent.TimeUnit;

final class jvj extends jvg {
    static final long a;
    private final lo<String, jvh> b;
    private final icq c;

    static {
        a = TimeUnit.HOURS.toMillis(1);
    }

    jvj(icq icq) {
        this.b = new lo();
        this.c = icq;
    }

    public synchronized jvh a(String str) {
        jvh jvh;
        jvh = (jvh) this.b.get(str);
        if (jvh == null) {
            jvh = new jvh(str, this.c);
            this.b.put(str, jvh);
        }
        return jvh;
    }
}
