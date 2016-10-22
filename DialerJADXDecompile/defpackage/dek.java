package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: dek */
final class dek implements Cloneable {
    List a;
    private dei b;
    private Object c;

    public final /* synthetic */ Object clone() {
        return b();
    }

    dek() {
        this.a = new ArrayList();
    }

    final int a() {
        if (this.c != null) {
            return this.b.a(this.c);
        }
        int i = 0;
        for (deo deo : this.a) {
            i = (deo.b.length + (def.d(deo.a) + 0)) + i;
        }
        return i;
    }

    final void a(def def) {
        if (this.c != null) {
            this.b.a(this.c, def);
            return;
        }
        for (deo deo : this.a) {
            def.c(deo.a);
            byte[] bArr = deo.b;
            int length = bArr.length;
            if (def.a.remaining() >= length) {
                def.a.put(bArr, 0, length);
            } else {
                throw new deg(def.a.position(), def.a.limit());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dek)) {
            return false;
        }
        dek dek = (dek) obj;
        if (this.c == null || dek.c == null) {
            if (this.a != null && dek.a != null) {
                return this.a.equals(dek.a);
            }
            try {
                return Arrays.equals(c(), dek.c());
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        } else if (this.b != dek.b) {
            return false;
        } else {
            Class cls = null;
            if (!cls.isArray()) {
                return this.c.equals(dek.c);
            }
            if (this.c instanceof byte[]) {
                return Arrays.equals((byte[]) this.c, (byte[]) dek.c);
            }
            if (this.c instanceof int[]) {
                return Arrays.equals((int[]) this.c, (int[]) dek.c);
            }
            if (this.c instanceof long[]) {
                return Arrays.equals((long[]) this.c, (long[]) dek.c);
            }
            if (this.c instanceof float[]) {
                return Arrays.equals((float[]) this.c, (float[]) dek.c);
            }
            if (this.c instanceof double[]) {
                return Arrays.equals((double[]) this.c, (double[]) dek.c);
            }
            if (this.c instanceof boolean[]) {
                return Arrays.equals((boolean[]) this.c, (boolean[]) dek.c);
            }
            return Arrays.deepEquals((Object[]) this.c, (Object[]) dek.c);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(c()) + 527;
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    private final byte[] c() {
        byte[] bArr = new byte[a()];
        a(def.a(bArr, 0, bArr.length));
        return bArr;
    }

    public final dek b() {
        int i = 0;
        dek dek = new dek();
        try {
            dek.b = this.b;
            if (this.a == null) {
                dek.a = null;
            } else {
                dek.a.addAll(this.a);
            }
            if (this.c != null) {
                if (this.c instanceof dem) {
                    dek.c = ((dem) this.c).b();
                } else if (this.c instanceof byte[]) {
                    dek.c = ((byte[]) this.c).clone();
                } else if (this.c instanceof byte[][]) {
                    byte[][] bArr = (byte[][]) this.c;
                    Object obj = new byte[bArr.length][];
                    dek.c = obj;
                    for (int i2 = 0; i2 < bArr.length; i2++) {
                        obj[i2] = (byte[]) bArr[i2].clone();
                    }
                } else if (this.c instanceof boolean[]) {
                    dek.c = ((boolean[]) this.c).clone();
                } else if (this.c instanceof int[]) {
                    dek.c = ((int[]) this.c).clone();
                } else if (this.c instanceof long[]) {
                    dek.c = ((long[]) this.c).clone();
                } else if (this.c instanceof float[]) {
                    dek.c = ((float[]) this.c).clone();
                } else if (this.c instanceof double[]) {
                    dek.c = ((double[]) this.c).clone();
                } else if (this.c instanceof dem[]) {
                    dem[] demArr = (dem[]) this.c;
                    Object obj2 = new dem[demArr.length];
                    dek.c = obj2;
                    while (i < demArr.length) {
                        obj2[i] = demArr[i].b();
                        i++;
                    }
                }
            }
            return dek;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
