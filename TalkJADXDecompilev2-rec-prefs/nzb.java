package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class nzb implements Cloneable {
    private nyy<?, ?> f31304a;
    private Object f31305b;
    private List<nzj> f31306c;

    public /* synthetic */ Object clone() {
        return m37237b();
    }

    <T> nzb(nyy<?, T> nyy___T, T t) {
        this.f31304a = nyy___T;
        this.f31305b = t;
    }

    nzb() {
        this.f31306c = new ArrayList();
    }

    void m37236a(nzj nzj) {
        this.f31306c.add(nzj);
    }

    <T> T m37233a(nyy<?, T> nyy___T) {
        if (this.f31305b == null) {
            this.f31304a = nyy___T;
            this.f31305b = nyy___T.m37206a(this.f31306c);
            this.f31306c = null;
        } else if (!this.f31304a.equals(nyy___T)) {
            throw new IllegalStateException("Tried to getExtension with a different Extension.");
        }
        return this.f31305b;
    }

    <T> void m37235a(nyy<?, T> nyy___T, T t) {
        this.f31304a = nyy___T;
        this.f31305b = t;
        this.f31306c = null;
    }

    int m37232a() {
        if (this.f31305b != null) {
            return this.f31304a.m37205a(this.f31305b);
        }
        int i = 0;
        for (nzj a : this.f31306c) {
            i = a.m37257a() + i;
        }
        return i;
    }

    void m37234a(nyu nyu) {
        if (this.f31305b != null) {
            this.f31304a.m37208a(this.f31305b, nyu);
            return;
        }
        for (nzj a : this.f31306c) {
            a.m37258a(nyu);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nzb)) {
            return false;
        }
        nzb nzb = (nzb) obj;
        if (this.f31305b == null || nzb.f31305b == null) {
            if (this.f31306c != null && nzb.f31306c != null) {
                return this.f31306c.equals(nzb.f31306c);
            }
            try {
                return Arrays.equals(m37231c(), nzb.m37231c());
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        } else if (this.f31304a != nzb.f31304a) {
            return false;
        } else {
            if (!this.f31304a.f31294b.isArray()) {
                return this.f31305b.equals(nzb.f31305b);
            }
            if (this.f31305b instanceof byte[]) {
                return Arrays.equals((byte[]) this.f31305b, (byte[]) nzb.f31305b);
            }
            if (this.f31305b instanceof int[]) {
                return Arrays.equals((int[]) this.f31305b, (int[]) nzb.f31305b);
            }
            if (this.f31305b instanceof long[]) {
                return Arrays.equals((long[]) this.f31305b, (long[]) nzb.f31305b);
            }
            if (this.f31305b instanceof float[]) {
                return Arrays.equals((float[]) this.f31305b, (float[]) nzb.f31305b);
            }
            if (this.f31305b instanceof double[]) {
                return Arrays.equals((double[]) this.f31305b, (double[]) nzb.f31305b);
            }
            if (this.f31305b instanceof boolean[]) {
                return Arrays.equals((boolean[]) this.f31305b, (boolean[]) nzb.f31305b);
            }
            return Arrays.deepEquals((Object[]) this.f31305b, (Object[]) nzb.f31305b);
        }
    }

    public int hashCode() {
        try {
            return Arrays.hashCode(m37231c()) + 527;
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    private byte[] m37231c() {
        byte[] bArr = new byte[m37232a()];
        m37234a(nyu.m37131a(bArr, 0, bArr.length));
        return bArr;
    }

    public final nzb m37237b() {
        int i = 0;
        nzb nzb = new nzb();
        try {
            nzb.f31304a = this.f31304a;
            if (this.f31306c == null) {
                nzb.f31306c = null;
            } else {
                nzb.f31306c.addAll(this.f31306c);
            }
            if (this.f31305b != null) {
                if (this.f31305b instanceof nzf) {
                    nzb.f31305b = ((nzf) this.f31305b).f();
                } else if (this.f31305b instanceof byte[]) {
                    nzb.f31305b = ((byte[]) this.f31305b).clone();
                } else if (this.f31305b instanceof byte[][]) {
                    byte[][] bArr = (byte[][]) this.f31305b;
                    Object obj = new byte[bArr.length][];
                    nzb.f31305b = obj;
                    for (int i2 = 0; i2 < bArr.length; i2++) {
                        obj[i2] = (byte[]) bArr[i2].clone();
                    }
                } else if (this.f31305b instanceof boolean[]) {
                    nzb.f31305b = ((boolean[]) this.f31305b).clone();
                } else if (this.f31305b instanceof int[]) {
                    nzb.f31305b = ((int[]) this.f31305b).clone();
                } else if (this.f31305b instanceof long[]) {
                    nzb.f31305b = ((long[]) this.f31305b).clone();
                } else if (this.f31305b instanceof float[]) {
                    nzb.f31305b = ((float[]) this.f31305b).clone();
                } else if (this.f31305b instanceof double[]) {
                    nzb.f31305b = ((double[]) this.f31305b).clone();
                } else if (this.f31305b instanceof nzf[]) {
                    nzf[] nzfArr = (nzf[]) this.f31305b;
                    Object obj2 = new nzf[nzfArr.length];
                    nzb.f31305b = obj2;
                    while (i < nzfArr.length) {
                        obj2[i] = nzfArr[i].f();
                        i++;
                    }
                }
            }
            return nzb;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
