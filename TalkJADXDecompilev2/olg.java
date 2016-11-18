package defpackage;

import java.util.Arrays;

final class olg {
    Object a;
    olf b;
    boolean c;
    byte[] d;

    olg(olf<?> olf_, Object obj) {
        this.a = bm.a(obj, "parsed");
        this.b = (olf) bm.a(olf_, "key");
        this.c = olf_ instanceof old;
    }

    olg(boolean z, byte[] bArr) {
        bm.a(bArr, "serialized");
        this.d = bArr;
        this.c = z;
    }

    olg(olg olg) {
        this.a = olg.a;
        this.b = olg.b;
        this.c = olg.c;
        this.d = olg.d;
    }

    public <T> T a(olf<T> olf_T) {
        T t = this.a;
        if (t != null) {
            if (this.b != olf_T) {
                this.d = this.b.a((Object) t);
            }
            return t;
        }
        this.b = olf_T;
        if (this.d != null) {
            t = olf_T.a(this.d);
        }
        this.a = t;
        return t;
    }

    public byte[] a() {
        byte[] a = this.d == null ? this.b.a(this.a) : this.d;
        this.d = a;
        return a;
    }

    public String toString() {
        if (!this.c) {
            return new String(a(), mes.a);
        }
        if (this.a == null) {
            return Arrays.toString(this.d);
        }
        String valueOf = String.valueOf(this.a);
        return new StringBuilder(String.valueOf(valueOf).length() + 0).append(valueOf).toString();
    }
}
