package p000;

final class bot implements Comparable<bot> {
    private static long f4120e;
    public final long f4121a;
    public final long f4122b;
    public final edo f4123c;
    public final fqj f4124d;

    public /* synthetic */ int compareTo(Object obj) {
        return m6326a((bot) obj);
    }

    public bot(fqj fqj) {
        this.f4124d = fqj;
        this.f4121a = fqj.m15832c();
        this.f4123c = fqj.m15831b();
        long a = glj.m17956a() * 100;
        if (a <= f4120e) {
            a = f4120e + 1;
        }
        f4120e = a;
        this.f4122b = a;
    }

    public bot(long j) {
        this.f4121a = j;
        this.f4123c = null;
        this.f4122b = -1;
        this.f4124d = null;
    }

    private int m6326a(bot bot) {
        long j = this.f4121a - bot.f4121a;
        if (j != 0) {
            return (int) (j / Math.abs(j));
        }
        j = this.f4122b - bot.f4122b;
        if (j == 0) {
            return 0;
        }
        return (int) (j / Math.abs(j));
    }
}
