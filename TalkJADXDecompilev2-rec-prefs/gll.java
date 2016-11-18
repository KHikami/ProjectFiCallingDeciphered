package p000;

@Deprecated
public final class gll {
    private final long f15580a = glj.m17963b();
    private final String f15581b;
    private long f15582c = this.f15580a;

    public gll(String str) {
        this.f15581b = str;
    }

    public void m17983a(String str) {
        long b = glj.m17963b();
        long j = b - this.f15580a;
        long j2 = b - this.f15582c;
        this.f15582c = b;
        glk.m17979c("Babel_timeline", "%s: %s in %d ms, total: %d ms", this.f15581b, str, Long.valueOf(j2), Long.valueOf(j));
    }
}
