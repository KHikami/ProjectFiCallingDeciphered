package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: cky */
final class cky implements Cloneable {
    private ckw a;
    private Object b;
    private List c;

    cky() {
        this.c = new ArrayList();
    }

    private final byte[] c() {
        byte[] bArr = new byte[a()];
        a(ckt.a(bArr, 0, bArr.length));
        return bArr;
    }

    final int a() {
        if (this.b != null) {
            return this.a.a(this.b);
        }
        int i = 0;
        for (clb clb : this.c) {
            Object[] objArr = null;
            i = ((ckt.d(0) + 0) + objArr.length) + i;
        }
        return i;
    }

    final void a(ckt ckt) {
        if (this.b != null) {
            this.a.a(this.b, ckt);
            return;
        }
        for (clb clb : this.c) {
            ckt.c(0);
            ckt.b(null);
        }
    }

    public final cky b() {
        int i = 0;
        cky cky = new cky();
        try {
            cky.a = this.a;
            if (this.c == null) {
                cky.c = null;
            } else {
                cky.c.addAll(this.c);
            }
            if (this.b != null) {
                if (this.b instanceof cla) {
                    cky.b = ((cla) this.b).b();
                } else if (this.b instanceof byte[]) {
                    cky.b = ((byte[]) this.b).clone();
                } else if (this.b instanceof byte[][]) {
                    byte[][] bArr = (byte[][]) this.b;
                    Object obj = new byte[bArr.length][];
                    cky.b = obj;
                    for (int i2 = 0; i2 < bArr.length; i2++) {
                        obj[i2] = (byte[]) bArr[i2].clone();
                    }
                } else if (this.b instanceof boolean[]) {
                    cky.b = ((boolean[]) this.b).clone();
                } else if (this.b instanceof int[]) {
                    cky.b = ((int[]) this.b).clone();
                } else if (this.b instanceof long[]) {
                    cky.b = ((long[]) this.b).clone();
                } else if (this.b instanceof float[]) {
                    cky.b = ((float[]) this.b).clone();
                } else if (this.b instanceof double[]) {
                    cky.b = ((double[]) this.b).clone();
                } else if (this.b instanceof cla[]) {
                    cla[] claArr = (cla[]) this.b;
                    Object obj2 = new cla[claArr.length];
                    cky.b = obj2;
                    while (i < claArr.length) {
                        obj2[i] = claArr[i].b();
                        i++;
                    }
                }
            }
            return cky;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final /* synthetic */ Object clone() {
        return b();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cky)) {
            return false;
        }
        cky cky = (cky) obj;
        if (this.b == null || cky.b == null) {
            if (this.c != null && cky.c != null) {
                return this.c.equals(cky.c);
            }
            try {
                return Arrays.equals(c(), cky.c());
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        } else if (this.a != cky.a) {
            return false;
        } else {
            Class cls = null;
            return !cls.isArray() ? this.b.equals(cky.b) : this.b instanceof byte[] ? Arrays.equals((byte[]) this.b, (byte[]) cky.b) : this.b instanceof int[] ? Arrays.equals((int[]) this.b, (int[]) cky.b) : this.b instanceof long[] ? Arrays.equals((long[]) this.b, (long[]) cky.b) : this.b instanceof float[] ? Arrays.equals((float[]) this.b, (float[]) cky.b) : this.b instanceof double[] ? Arrays.equals((double[]) this.b, (double[]) cky.b) : this.b instanceof boolean[] ? Arrays.equals((boolean[]) this.b, (boolean[]) cky.b) : Arrays.deepEquals((Object[]) this.b, (Object[]) cky.b);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(c()) + 527;
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }
}
