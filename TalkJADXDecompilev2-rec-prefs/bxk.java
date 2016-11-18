package p000;

final class bxk implements Comparable<bxk> {
    public final edk f4733a;
    public final boolean f4734b;
    public final int f4735c;

    public /* synthetic */ int compareTo(Object obj) {
        return m6890a((bxk) obj);
    }

    public bxk(edk edk, boolean z, int i) {
        this.f4733a = edk;
        this.f4734b = z;
        this.f4735c = i;
    }

    private int m6890a(bxk bxk) {
        int i = 1;
        if (bxk.f4733a.equals(this.f4733a)) {
            return 0;
        }
        int i2;
        if (bxk.f4734b) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (!this.f4734b) {
            i = 0;
        }
        i2 -= i;
        if (i2 == 0) {
            i2 = Long.signum((long) (bxk.f4735c - this.f4735c));
        }
        return i2;
    }

    public String toString() {
        return new StringBuilder(this.f4733a.f11216e).append(" (").append(this.f4734b ? "F|T" : "W").append(")").toString();
    }
}
