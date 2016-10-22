public final class cqu implements Comparable<cqu> {
    private final int a;
    private final String b;
    private final int c;
    private final String d;
    private final String e;
    private final String f;
    private final int g;
    private final long h;
    private final long i;
    private final long j;
    private final String k;
    private final String l;
    private final int m;
    private float n;
    private int o;

    public /* synthetic */ int compareTo(Object obj) {
        return a((cqu) obj);
    }

    cqu(int i, String str, int i2, String str2, String str3, String str4, int i3, long j, long j2, long j3, String str5, String str6, int i4, float f, int i5) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = i3;
        this.h = j;
        this.i = j2;
        this.j = j3;
        this.k = str5;
        this.l = str6;
        this.m = i4;
        this.n = f;
        this.o = i5;
    }

    public int a() {
        return this.g;
    }

    public long b() {
        return this.h;
    }

    public void a(float f) {
        this.n = f;
    }

    public void a(int i) {
        this.o = i;
    }

    public Object[] c() {
        return new Object[]{Integer.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, this.e, this.f, Integer.valueOf(this.g), Long.valueOf(this.h), Long.valueOf(this.i), Long.valueOf(this.j), this.k, this.l, Integer.valueOf(this.m), Float.valueOf(this.n), Integer.valueOf(this.o)};
    }

    private int a(cqu cqu) {
        return mix.a.a(cqu.n, this.n).a(cqu.i, this.i).a();
    }
}
