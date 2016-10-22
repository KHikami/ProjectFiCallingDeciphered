public final class cqv {
    private int a;
    private String b;
    private int c;
    private String d;
    private String e;
    private String f;
    private int g;
    private long h;
    private long i;
    private long j;
    private String k;
    private String l;
    private int m;
    private float n;
    private int o;

    public cqv a(int i) {
        this.a = i;
        return this;
    }

    public cqv a(String str) {
        this.b = str;
        return this;
    }

    public cqv b(int i) {
        this.c = i;
        return this;
    }

    public cqv b(String str) {
        this.d = str;
        return this;
    }

    public cqv c(String str) {
        this.e = str;
        return this;
    }

    public cqv d(String str) {
        this.f = str;
        return this;
    }

    public cqv c(int i) {
        this.g = i;
        return this;
    }

    public cqv a(long j) {
        this.h = j;
        return this;
    }

    public cqv b(long j) {
        this.i = j;
        return this;
    }

    public cqv c(long j) {
        this.j = j;
        return this;
    }

    public cqv e(String str) {
        this.k = str;
        return this;
    }

    public cqv f(String str) {
        this.l = str;
        return this;
    }

    public cqv d(int i) {
        this.m = i;
        return this;
    }

    public cqv a(float f) {
        this.n = 0.0f;
        return this;
    }

    public cqv e(int i) {
        this.o = -1;
        return this;
    }

    public cqu a() {
        return new cqu(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
    }
}
