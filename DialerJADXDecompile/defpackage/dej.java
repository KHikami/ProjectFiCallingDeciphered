package defpackage;

/* compiled from: PG */
/* renamed from: dej */
public final class dej implements Cloneable {
    static final dek a;
    int[] b;
    dek[] c;
    int d;
    private boolean e;

    public final /* synthetic */ Object clone() {
        return a();
    }

    static {
        a = new dek();
    }

    dej() {
        this(10);
    }

    private dej(int i) {
        this.e = false;
        int a = a(i);
        this.b = new int[a];
        this.c = new dek[a];
        this.d = 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dej)) {
            return false;
        }
        dej dej = (dej) obj;
        if (this.d != dej.d) {
            return false;
        }
        int i;
        boolean z;
        int[] iArr = this.b;
        int[] iArr2 = dej.b;
        int i2 = this.d;
        for (i = 0; i < i2; i++) {
            if (iArr[i] != iArr2[i]) {
                z = false;
                break;
            }
        }
        z = true;
        if (z) {
            dek[] dekArr = this.c;
            dek[] dekArr2 = dej.c;
            i2 = this.d;
            for (i = 0; i < i2; i++) {
                if (!dekArr[i].equals(dekArr2[i])) {
                    z = false;
                    break;
                }
            }
            z = true;
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (((i * 31) + this.b[i2]) * 31) + this.c[i2].hashCode();
        }
        return i;
    }

    final int a(int i) {
        int i2 = i << 2;
        for (int i3 = 4; i3 < 32; i3++) {
            if (i2 <= (1 << i3) - 12) {
                i2 = (1 << i3) - 12;
                break;
            }
        }
        return i2 / 4;
    }

    final int b(int i) {
        int i2 = 0;
        int i3 = this.d - 1;
        while (i2 <= i3) {
            int i4 = (i2 + i3) >>> 1;
            int i5 = this.b[i4];
            if (i5 < i) {
                i2 = i4 + 1;
            } else if (i5 <= i) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return i2 ^ -1;
    }

    public final dej a() {
        int i = 0;
        int i2 = this.d;
        dej dej = new dej(i2);
        System.arraycopy(this.b, 0, dej.b, 0, i2);
        while (i < i2) {
            if (this.c[i] != null) {
                dej.c[i] = this.c[i].b();
            }
            i++;
        }
        dej.d = i2;
        return dej;
    }
}
