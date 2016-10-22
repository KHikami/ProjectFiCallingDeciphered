package defpackage;

/* renamed from: bxk */
final class bxk implements Comparable<bxk> {
    public final edk a;
    public final boolean b;
    public final int c;

    public /* synthetic */ int compareTo(Object obj) {
        return a((bxk) obj);
    }

    public bxk(edk edk, boolean z, int i) {
        this.a = edk;
        this.b = z;
        this.c = i;
    }

    private int a(bxk bxk) {
        int i = 1;
        if (bxk.a.equals(this.a)) {
            return 0;
        }
        int i2;
        if (bxk.b) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (!this.b) {
            i = 0;
        }
        i2 -= i;
        if (i2 == 0) {
            i2 = Long.signum((long) (bxk.c - this.c));
        }
        return i2;
    }

    public String toString() {
        return new StringBuilder(this.a.e).append(" (").append(this.b ? "F|T" : "W").append(")").toString();
    }
}
