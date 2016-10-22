package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: hcn */
final class hcn implements Cloneable {
    private hcl<?, ?> a;
    private Object b;
    private List<hcr> c;

    hcn() {
        this.c = new ArrayList();
    }

    private byte[] b() {
        byte[] bArr = new byte[a()];
        a(hcj.a(bArr, 0, bArr.length));
        return bArr;
    }

    private hcn c() {
        hcn hcn = new hcn();
        try {
            hcn.a = this.a;
            if (this.c == null) {
                hcn.c = null;
            } else {
                hcn.c.addAll(this.c);
            }
            if (this.b != null) {
                if (this.b instanceof hcq) {
                    hcn.b = (hcq) ((hcq) this.b).clone();
                } else if (this.b instanceof byte[]) {
                    hcn.b = ((byte[]) this.b).clone();
                } else if (this.b instanceof byte[][]) {
                    byte[][] bArr = (byte[][]) this.b;
                    r4 = new byte[bArr.length][];
                    hcn.b = r4;
                    for (r2 = 0; r2 < bArr.length; r2++) {
                        r4[r2] = (byte[]) bArr[r2].clone();
                    }
                } else if (this.b instanceof boolean[]) {
                    hcn.b = ((boolean[]) this.b).clone();
                } else if (this.b instanceof int[]) {
                    hcn.b = ((int[]) this.b).clone();
                } else if (this.b instanceof long[]) {
                    hcn.b = ((long[]) this.b).clone();
                } else if (this.b instanceof float[]) {
                    hcn.b = ((float[]) this.b).clone();
                } else if (this.b instanceof double[]) {
                    hcn.b = ((double[]) this.b).clone();
                } else if (this.b instanceof hcq[]) {
                    hcq[] hcqArr = (hcq[]) this.b;
                    r4 = new hcq[hcqArr.length];
                    hcn.b = r4;
                    for (r2 = 0; r2 < hcqArr.length; r2++) {
                        r4[r2] = (hcq) hcqArr[r2].clone();
                    }
                }
            }
            return hcn;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    int a() {
        if (this.b != null) {
            return this.a.a(this.b);
        }
        int i = 0;
        for (hcr a : this.c) {
            i = a.a() + i;
        }
        return i;
    }

    void a(hcj hcj) {
        if (this.b != null) {
            this.a.a(this.b, hcj);
            return;
        }
        for (hcr a : this.c) {
            a.a(hcj);
        }
    }

    void a(hcr hcr) {
        this.c.add(hcr);
    }

    public /* synthetic */ Object clone() {
        return c();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hcn)) {
            return false;
        }
        hcn hcn = (hcn) obj;
        if (this.b != null && hcn.b != null) {
            return this.a == hcn.a ? !this.a.b.isArray() ? this.b.equals(hcn.b) : this.b instanceof byte[] ? Arrays.equals((byte[]) this.b, (byte[]) hcn.b) : this.b instanceof int[] ? Arrays.equals((int[]) this.b, (int[]) hcn.b) : this.b instanceof long[] ? Arrays.equals((long[]) this.b, (long[]) hcn.b) : this.b instanceof float[] ? Arrays.equals((float[]) this.b, (float[]) hcn.b) : this.b instanceof double[] ? Arrays.equals((double[]) this.b, (double[]) hcn.b) : this.b instanceof boolean[] ? Arrays.equals((boolean[]) this.b, (boolean[]) hcn.b) : Arrays.deepEquals((Object[]) this.b, (Object[]) hcn.b) : false;
        } else {
            if (this.c != null && hcn.c != null) {
                return this.c.equals(hcn.c);
            }
            try {
                return Arrays.equals(b(), hcn.b());
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public int hashCode() {
        try {
            return Arrays.hashCode(b()) + 527;
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }
}
