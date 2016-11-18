package defpackage;

@Deprecated
public final class gll {
    private final long a = glj.b();
    private final String b;
    private long c = this.a;

    public gll(String str) {
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
