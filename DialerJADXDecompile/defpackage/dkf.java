package defpackage;

/* compiled from: PG */
/* renamed from: dkf */
public final class dkf {
    int a;
    int b;
    int c;
    public final int[] d;

    public dkf() {
        this.d = new int[10];
    }

    public final boolean a(int i) {
        if (((1 << i) & this.a) != 0) {
            return true;
        }
        return false;
    }

    final int a() {
        return (this.a & 2) != 0 ? this.d[1] : -1;
    }
}
