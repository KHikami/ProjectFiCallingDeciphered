import android.util.LruCache;

public final class irg {
    private final LruCache<Object, Long> a;
    private final String b;
    private long c;
    private long d;
    private int e;
    private long f;
    private long g;

    public irg(String str) {
        this.a = new LruCache(90);
        this.b = str;
        c();
    }

    public void a(Object obj, long j) {
        this.a.put(obj, Long.valueOf(j));
    }

    public void b(Object obj, long j) {
        Long l = (Long) this.a.remove(obj);
        if (l != null) {
            a(j - l.longValue());
        }
    }

    public void a(long j) {
        this.c += j;
        this.d += j * j;
        if (j > this.f) {
            this.f = j;
        }
        if (j < this.g) {
            this.g = j;
        }
        this.e++;
    }

    private double d() {
        return this.e == 0 ? 0.0d : (double) (this.c / ((long) this.e));
    }

    public int a() {
        return this.e;
    }

    private long e() {
        return this.f;
    }

    private long f() {
        return this.g;
    }

    private double g() {
        return Math.sqrt(this.e == 0 ? 0.0d : (double) (((this.d * ((long) this.e)) - (this.c * this.c)) / ((long) (this.e * this.e))));
    }

    public lle b() {
        lle lle = new lle();
        lle.c = Integer.valueOf((int) d());
        lle.e = Integer.valueOf(a());
        lle.b = Integer.valueOf((int) e());
        lle.a = Integer.valueOf((int) f());
        lle.d = Integer.valueOf((int) g());
        itx.a(3, "vclib", "%s: Histogram created: %s", this.b, lle);
        return lle;
    }

    public void c() {
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = -1;
        this.g = Long.MAX_VALUE;
    }
}
