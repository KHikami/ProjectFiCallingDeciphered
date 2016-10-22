package defpackage;

/* renamed from: jla */
public final class jla {
    final int a;
    final int b;
    final long c;
    private final jlb d;

    jla(int i, int i2, long j, jlb jlb) {
        this.b = i;
        this.a = i2;
        this.c = j;
        this.d = jlb;
    }

    jla(int i, int i2, jlb jlb) {
        this(i, i2, (((long) i) * ((long) i2)) << 2, jlb);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof jla)) {
            return false;
        }
        return this.d.a(this, (jla) obj);
    }

    public int hashCode() {
        return this.d.a(this);
    }

    public String toString() {
        int i = this.b;
        return "BitmapKey(" + i + ", " + this.a + ")";
    }
}
