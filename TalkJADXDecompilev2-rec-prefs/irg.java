package p000;

import android.util.LruCache;

public final class irg {
    private final LruCache<Object, Long> f18761a = new LruCache(90);
    private final String f18762b;
    private long f18763c;
    private long f18764d;
    private int f18765e;
    private long f18766f;
    private long f18767g;

    public irg(String str) {
        this.f18762b = str;
        m23034c();
    }

    public void m23031a(Object obj, long j) {
        this.f18761a.put(obj, Long.valueOf(j));
    }

    public void m23033b(Object obj, long j) {
        Long l = (Long) this.f18761a.remove(obj);
        if (l != null) {
            m23030a(j - l.longValue());
        }
    }

    public void m23030a(long j) {
        this.f18763c += j;
        this.f18764d += j * j;
        if (j > this.f18766f) {
            this.f18766f = j;
        }
        if (j < this.f18767g) {
            this.f18767g = j;
        }
        this.f18765e++;
    }

    private double m23025d() {
        return this.f18765e == 0 ? 0.0d : (double) (this.f18763c / ((long) this.f18765e));
    }

    public int m23029a() {
        return this.f18765e;
    }

    private long m23026e() {
        return this.f18766f;
    }

    private long m23027f() {
        return this.f18767g;
    }

    private double m23028g() {
        return Math.sqrt(this.f18765e == 0 ? 0.0d : (double) (((this.f18764d * ((long) this.f18765e)) - (this.f18763c * this.f18763c)) / ((long) (this.f18765e * this.f18765e))));
    }

    public lle m23032b() {
        lle lle = new lle();
        lle.f25326c = Integer.valueOf((int) m23025d());
        lle.f25328e = Integer.valueOf(m23029a());
        lle.f25325b = Integer.valueOf((int) m23026e());
        lle.f25324a = Integer.valueOf((int) m23027f());
        lle.f25327d = Integer.valueOf((int) m23028g());
        itx.m23279a(3, "vclib", "%s: Histogram created: %s", this.f18762b, lle);
        return lle;
    }

    public void m23034c() {
        this.f18763c = 0;
        this.f18764d = 0;
        this.f18765e = 0;
        this.f18766f = -1;
        this.f18767g = Long.MAX_VALUE;
    }
}
