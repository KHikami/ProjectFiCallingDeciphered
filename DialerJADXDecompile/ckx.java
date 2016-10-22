public final class ckx implements Cloneable {
    private static final cky c;
    cky[] a;
    int b;
    private boolean d;
    private int[] e;

    static {
        c = new cky();
    }

    ckx() {
        this(10);
    }

    private ckx(int i) {
        this.d = false;
        int a = a(i << 2) / 4;
        this.e = new int[a];
        this.a = new cky[a];
        this.b = 0;
    }

    private static int a(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            if (i <= (1 << i2) - 12) {
                return (1 << i2) - 12;
            }
        }
        return i;
    }

    public final ckx b() {
        int i = 0;
        int i2 = this.b;
        ckx ckx = new ckx(i2);
        System.arraycopy(this.e, 0, ckx.e, 0, i2);
        while (i < i2) {
            if (this.a[i] != null) {
                ckx.a[i] = this.a[i].b();
            }
            i++;
        }
        ckx.b = i2;
        return ckx;
    }

    public final /* synthetic */ Object clone() {
        return b();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ckx)) {
            return false;
        }
        ckx ckx = (ckx) obj;
        if (this.b != ckx.b) {
            return false;
        }
        int i;
        boolean z;
        int[] iArr = this.e;
        int[] iArr2 = ckx.e;
        int i2 = this.b;
        for (i = 0; i < i2; i++) {
            if (iArr[i] != iArr2[i]) {
                z = false;
                break;
            }
        }
        z = true;
        if (z) {
            cky[] ckyArr = this.a;
            cky[] ckyArr2 = ckx.a;
            i2 = this.b;
            for (i = 0; i < i2; i++) {
                if (!ckyArr[i].equals(ckyArr2[i])) {
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
        for (int i2 = 0; i2 < this.b; i2++) {
            i = (((i * 31) + this.e[i2]) * 31) + this.a[i2].hashCode();
        }
        return i;
    }

    public final boolean a() {
        return this.b == 0;
    }
}
