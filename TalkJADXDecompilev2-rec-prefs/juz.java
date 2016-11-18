package p000;

public final class juz {
    private long f21101a = -1;
    private long f21102b = -1;
    private int f21103c = 0;
    private String f21104d;
    private long f21105e = 0;
    private lo<String, Long> f21106f = new lo();
    private String f21107g;

    public void m25275a(long j) {
        this.f21101a = j;
    }

    public void m25278b(long j) {
        this.f21102b = j;
    }

    public void m25276a(String str) {
        this.f21104d = str;
    }

    public void m25279b(String str) {
        this.f21107g = str;
    }

    public long m25274a() {
        return this.f21102b;
    }

    public long m25277b() {
        return this.f21101a;
    }

    public String m25280c() {
        return this.f21104d;
    }

    public void m25281d() {
        this.f21103c++;
    }

    public int m25282e() {
        return this.f21103c;
    }

    public long m25283f() {
        return this.f21105e;
    }

    public String m25284g() {
        return this.f21107g;
    }

    public lo<String, Long> m25285h() {
        return this.f21106f;
    }

    public void m25286i() {
        this.f21101a = -1;
        this.f21102b = -1;
        this.f21103c = 0;
        this.f21105e = 0;
        this.f21106f.clear();
    }
}
