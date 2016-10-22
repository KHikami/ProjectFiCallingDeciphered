package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: dhb */
public final class dhb {
    public dha a;
    private Object b;
    private boolean c;
    private byte[] d;

    dhb(dha dha, Object obj) {
        this.b = cob.i(obj);
        this.a = (dha) cob.i((Object) dha);
        this.c = dha instanceof dgy;
    }

    dhb(boolean z, byte[] bArr) {
        cob.i((Object) bArr);
        this.d = bArr;
        this.c = z;
    }

    public dhb(dhb dhb) {
        this.b = dhb.b;
        this.a = dhb.a;
        this.c = dhb.c;
        this.d = dhb.d;
    }

    public final Object a(dha dha) {
        Object obj = this.b;
        if (obj != null) {
            if (this.a != dha) {
                this.d = this.a.a(obj);
            }
            return obj;
        }
        this.a = dha;
        if (this.d != null) {
            obj = dha.a(this.d);
        }
        this.b = obj;
        return obj;
    }

    public final byte[] a() {
        byte[] a = this.d == null ? this.a.a(this.b) : this.d;
        this.d = a;
        return a;
    }

    public final String toString() {
        if (!this.c) {
            return new String(a(), cyg.a);
        }
        if (this.b == null) {
            return Arrays.toString(this.d);
        }
        String valueOf = String.valueOf(this.b);
        return new StringBuilder(String.valueOf(valueOf).length() + 0).append(valueOf).toString();
    }
}
