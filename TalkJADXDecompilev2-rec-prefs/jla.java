package p000;

public final class jla {
    final int f20394a;
    final int f20395b;
    final long f20396c;
    private final jlb f20397d;

    jla(int i, int i2, long j, jlb jlb) {
        this.f20395b = i;
        this.f20394a = i2;
        this.f20396c = j;
        this.f20397d = jlb;
    }

    jla(int i, int i2, jlb jlb) {
        this(i, i2, (((long) i) * ((long) i2)) << 2, jlb);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof jla)) {
            return false;
        }
        return this.f20397d.mo3563a(this, (jla) obj);
    }

    public int hashCode() {
        return this.f20397d.mo3562a(this);
    }

    public String toString() {
        int i = this.f20395b;
        return "BitmapKey(" + i + ", " + this.f20394a + ")";
    }
}
