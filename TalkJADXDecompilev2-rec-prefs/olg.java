package p000;

import java.util.Arrays;

final class olg {
    Object f33152a;
    olf f33153b;
    boolean f33154c;
    byte[] f33155d;

    olg(olf<?> olf_, Object obj) {
        this.f33152a = bm.a(obj, "parsed");
        this.f33153b = (olf) bm.a(olf_, "key");
        this.f33154c = olf_ instanceof old;
    }

    olg(boolean z, byte[] bArr) {
        bm.a(bArr, "serialized");
        this.f33155d = bArr;
        this.f33154c = z;
    }

    olg(olg olg) {
        this.f33152a = olg.f33152a;
        this.f33153b = olg.f33153b;
        this.f33154c = olg.f33154c;
        this.f33155d = olg.f33155d;
    }

    public <T> T m38671a(olf<T> olf_T) {
        T t = this.f33152a;
        if (t != null) {
            if (this.f33153b != olf_T) {
                this.f33155d = this.f33153b.mo4168a((Object) t);
            }
            return t;
        }
        this.f33153b = olf_T;
        if (this.f33155d != null) {
            t = olf_T.mo4167a(this.f33155d);
        }
        this.f33152a = t;
        return t;
    }

    public byte[] m38672a() {
        byte[] a = this.f33155d == null ? this.f33153b.mo4168a(this.f33152a) : this.f33155d;
        this.f33155d = a;
        return a;
    }

    public String toString() {
        if (!this.f33154c) {
            return new String(m38672a(), mes.a);
        }
        if (this.f33152a == null) {
            return Arrays.toString(this.f33155d);
        }
        String valueOf = String.valueOf(this.f33152a);
        return new StringBuilder(String.valueOf(valueOf).length() + 0).append(valueOf).toString();
    }
}
