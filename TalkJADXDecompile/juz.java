public final class juz {
    private long a;
    private long b;
    private int c;
    private String d;
    private long e;
    private lo<String, Long> f;
    private String g;

    public juz() {
        this.a = -1;
        this.b = -1;
        this.c = 0;
        this.e = 0;
        this.f = new lo();
    }

    public void a(long j) {
        this.a = j;
    }

    public void b(long j) {
        this.b = j;
    }

    public void a(String str) {
        this.d = str;
    }

    public void b(String str) {
        this.g = str;
    }

    public long a() {
        return this.b;
    }

    public long b() {
        return this.a;
    }

    public String c() {
        return this.d;
    }

    public void d() {
        this.c++;
    }

    public int e() {
        return this.c;
    }

    public long f() {
        return this.e;
    }

    public String g() {
        return this.g;
    }

    public lo<String, Long> h() {
        return this.f;
    }

    public void i() {
        this.a = -1;
        this.b = -1;
        this.c = 0;
        this.e = 0;
        this.f.clear();
    }
}
