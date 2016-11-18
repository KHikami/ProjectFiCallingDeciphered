package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class hcn implements Cloneable {
    private hcl<?, ?> f16617a;
    private Object f16618b;
    private List<hcr> f16619c = new ArrayList();

    hcn() {
    }

    private byte[] m19330b() {
        byte[] bArr = new byte[m19332a()];
        m19333a(hcj.m19272a(bArr, 0, bArr.length));
        return bArr;
    }

    private hcn m19331c() {
        hcn hcn = new hcn();
        try {
            hcn.f16617a = this.f16617a;
            if (this.f16619c == null) {
                hcn.f16619c = null;
            } else {
                hcn.f16619c.addAll(this.f16619c);
            }
            if (this.f16618b != null) {
                if (this.f16618b instanceof hcq) {
                    hcn.f16618b = (hcq) ((hcq) this.f16618b).clone();
                } else if (this.f16618b instanceof byte[]) {
                    hcn.f16618b = ((byte[]) this.f16618b).clone();
                } else if (this.f16618b instanceof byte[][]) {
                    byte[][] bArr = (byte[][]) this.f16618b;
                    r4 = new byte[bArr.length][];
                    hcn.f16618b = r4;
                    for (r2 = 0; r2 < bArr.length; r2++) {
                        r4[r2] = (byte[]) bArr[r2].clone();
                    }
                } else if (this.f16618b instanceof boolean[]) {
                    hcn.f16618b = ((boolean[]) this.f16618b).clone();
                } else if (this.f16618b instanceof int[]) {
                    hcn.f16618b = ((int[]) this.f16618b).clone();
                } else if (this.f16618b instanceof long[]) {
                    hcn.f16618b = ((long[]) this.f16618b).clone();
                } else if (this.f16618b instanceof float[]) {
                    hcn.f16618b = ((float[]) this.f16618b).clone();
                } else if (this.f16618b instanceof double[]) {
                    hcn.f16618b = ((double[]) this.f16618b).clone();
                } else if (this.f16618b instanceof hcq[]) {
                    hcq[] hcqArr = (hcq[]) this.f16618b;
                    r4 = new hcq[hcqArr.length];
                    hcn.f16618b = r4;
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

    int m19332a() {
        if (this.f16618b != null) {
            return this.f16617a.m19320a(this.f16618b);
        }
        int i = 0;
        for (hcr a : this.f16619c) {
            i = a.m19349a() + i;
        }
        return i;
    }

    void m19333a(hcj hcj) {
        if (this.f16618b != null) {
            this.f16617a.m19321a(this.f16618b, hcj);
            return;
        }
        for (hcr a : this.f16619c) {
            a.m19350a(hcj);
        }
    }

    void m19334a(hcr hcr) {
        this.f16619c.add(hcr);
    }

    public /* synthetic */ Object clone() {
        return m19331c();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hcn)) {
            return false;
        }
        hcn hcn = (hcn) obj;
        if (this.f16618b != null && hcn.f16618b != null) {
            return this.f16617a == hcn.f16617a ? !this.f16617a.f16609b.isArray() ? this.f16618b.equals(hcn.f16618b) : this.f16618b instanceof byte[] ? Arrays.equals((byte[]) this.f16618b, (byte[]) hcn.f16618b) : this.f16618b instanceof int[] ? Arrays.equals((int[]) this.f16618b, (int[]) hcn.f16618b) : this.f16618b instanceof long[] ? Arrays.equals((long[]) this.f16618b, (long[]) hcn.f16618b) : this.f16618b instanceof float[] ? Arrays.equals((float[]) this.f16618b, (float[]) hcn.f16618b) : this.f16618b instanceof double[] ? Arrays.equals((double[]) this.f16618b, (double[]) hcn.f16618b) : this.f16618b instanceof boolean[] ? Arrays.equals((boolean[]) this.f16618b, (boolean[]) hcn.f16618b) : Arrays.deepEquals((Object[]) this.f16618b, (Object[]) hcn.f16618b) : false;
        } else {
            if (this.f16619c != null && hcn.f16619c != null) {
                return this.f16619c.equals(hcn.f16619c);
            }
            try {
                return Arrays.equals(m19330b(), hcn.m19330b());
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public int hashCode() {
        try {
            return Arrays.hashCode(m19330b()) + 527;
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }
}
