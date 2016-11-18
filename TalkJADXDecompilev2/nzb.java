package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class nzb implements Cloneable {
    private nyy<?, ?> a;
    private Object b;
    private List<nzj> c;

    public /* synthetic */ Object clone() {
        return b();
    }

    <T> nzb(nyy<?, T> nyy___T, T t) {
        this.a = nyy___T;
        this.b = t;
    }

    nzb() {
        this.c = new ArrayList();
    }

    void a(nzj nzj) {
        this.c.add(nzj);
    }

    <T> T a(nyy<?, T> nyy___T) {
        if (this.b == null) {
            this.a = nyy___T;
            this.b = nyy___T.a(this.c);
            this.c = null;
        } else if (!this.a.equals(nyy___T)) {
            throw new IllegalStateException("Tried to getExtension with a different Extension.");
        }
        return this.b;
    }

    <T> void a(nyy<?, T> nyy___T, T t) {
        this.a = nyy___T;
        this.b = t;
        this.c = null;
    }

    int a() {
        if (this.b != null) {
            return this.a.a(this.b);
        }
        int i = 0;
        for (nzj a : this.c) {
            i = a.a() + i;
        }
        return i;
    }

    void a(nyu nyu) {
        if (this.b != null) {
            this.a.a(this.b, nyu);
            return;
        }
        for (nzj a : this.c) {
            a.a(nyu);
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
        if (this.b == null || nzb.b == null) {
            if (this.c != null && nzb.c != null) {
                return this.c.equals(nzb.c);
            }
            try {
                return Arrays.equals(c(), nzb.c());
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        } else if (this.a != nzb.a) {
            return false;
        } else {
            if (!this.a.b.isArray()) {
                return this.b.equals(nzb.b);
            }
            if (this.b instanceof byte[]) {
                return Arrays.equals((byte[]) this.b, (byte[]) nzb.b);
            }
            if (this.b instanceof int[]) {
                return Arrays.equals((int[]) this.b, (int[]) nzb.b);
            }
            if (this.b instanceof long[]) {
                return Arrays.equals((long[]) this.b, (long[]) nzb.b);
            }
            if (this.b instanceof float[]) {
                return Arrays.equals((float[]) this.b, (float[]) nzb.b);
            }
            if (this.b instanceof double[]) {
                return Arrays.equals((double[]) this.b, (double[]) nzb.b);
            }
            if (this.b instanceof boolean[]) {
                return Arrays.equals((boolean[]) this.b, (boolean[]) nzb.b);
            }
            return Arrays.deepEquals((Object[]) this.b, (Object[]) nzb.b);
        }
    }

    public int hashCode() {
        try {
            return Arrays.hashCode(c()) + 527;
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    private byte[] c() {
        byte[] bArr = new byte[a()];
        a(nyu.a(bArr, 0, bArr.length));
        return bArr;
    }

    public final nzb b() {
        int i = 0;
        nzb nzb = new nzb();
        try {
            nzb.a = this.a;
            if (this.c == null) {
                nzb.c = null;
            } else {
                nzb.c.addAll(this.c);
            }
            if (this.b != null) {
                if (this.b instanceof nzf) {
                    nzb.b = ((nzf) this.b).f();
                } else if (this.b instanceof byte[]) {
                    nzb.b = ((byte[]) this.b).clone();
                } else if (this.b instanceof byte[][]) {
                    byte[][] bArr = (byte[][]) this.b;
                    Object obj = new byte[bArr.length][];
                    nzb.b = obj;
                    for (int i2 = 0; i2 < bArr.length; i2++) {
                        obj[i2] = (byte[]) bArr[i2].clone();
                    }
                } else if (this.b instanceof boolean[]) {
                    nzb.b = ((boolean[]) this.b).clone();
                } else if (this.b instanceof int[]) {
                    nzb.b = ((int[]) this.b).clone();
                } else if (this.b instanceof long[]) {
                    nzb.b = ((long[]) this.b).clone();
                } else if (this.b instanceof float[]) {
                    nzb.b = ((float[]) this.b).clone();
                } else if (this.b instanceof double[]) {
                    nzb.b = ((double[]) this.b).clone();
                } else if (this.b instanceof nzf[]) {
                    nzf[] nzfArr = (nzf[]) this.b;
                    Object obj2 = new nzf[nzfArr.length];
                    nzb.b = obj2;
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
