@Deprecated
public final class gll {
    private final long a;
    private final String b;
    private long c;

    public gll(String str) {
        this.a = glj.b();
        this.c = this.a;
        this.b = str;
    }

    public void a(String str) {
        long b = glj.b();
        long j = b - this.a;
        long j2 = b - this.c;
        this.c = b;
        glk.c("Babel_timeline", "%s: %s in %d ms, total: %d ms", this.b, str, Long.valueOf(j2), Long.valueOf(j));
    }
}
