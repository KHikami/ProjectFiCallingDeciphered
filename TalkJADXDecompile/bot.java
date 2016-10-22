final class bot implements Comparable<bot> {
    private static long e;
    public final long a;
    public final long b;
    public final edo c;
    public final fqj d;

    public /* synthetic */ int compareTo(Object obj) {
        return a((bot) obj);
    }

    public bot(fqj fqj) {
        this.d = fqj;
        this.a = fqj.c();
        this.c = fqj.b();
        long a = glj.a() * 100;
        if (a <= e) {
            a = e + 1;
        }
        e = a;
        this.b = a;
    }

    public bot(long j) {
        this.a = j;
        this.c = null;
        this.b = -1;
        this.d = null;
    }

    private int a(bot bot) {
        long j = this.a - bot.a;
        if (j != 0) {
            return (int) (j / Math.abs(j));
        }
        j = this.b - bot.b;
        if (j == 0) {
            return 0;
        }
        return (int) (j / Math.abs(j));
    }
}
