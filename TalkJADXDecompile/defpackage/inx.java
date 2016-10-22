package defpackage;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Deprecated
/* renamed from: inx */
public final class inx {
    private static inx b;
    final List<ikf> a;
    private final ikf c;
    private ijt d;

    static {
        b = new inx();
    }

    private inx() {
        this.a = new CopyOnWriteArrayList();
        this.c = new ilc(this);
    }

    public static inx a() {
        iil.b("Expected non-null", b);
        iil.a();
        return b;
    }

    void a(ijt ijt) {
        this.d = ijt;
        if (ijt != null) {
            ijt.a(this.c);
        }
    }

    public void a(ikf ikf) {
        iil.a();
        this.a.add(ikf);
    }

    public ikd b() {
        iil.a();
        if (this.d == null) {
            return null;
        }
        return this.d.a();
    }

    public void a(byte[] bArr) {
        iil.a();
        if (this.d != null) {
            this.d.a(bArr);
        }
    }

    public void a(String[] strArr, int i, boolean z, boolean z2, String str) {
        iil.a();
        iil.a();
        if (this.d != null) {
            this.d.a(false, strArr, 1, true, false, null);
        }
    }

    public void a(String str, String str2, boolean z, boolean z2, boolean z3, byte[] bArr) {
        iil.a();
        if (this.d != null) {
            this.d.a(str, str2, false, z2, z3, bArr);
        }
    }

    public void a(char c, int i, String str) {
        iil.a();
        if (this.d != null) {
            this.d.a(c, i, str);
        }
    }

    public void a(String str) {
        iil.a();
        if (this.d != null) {
            this.d.c(str);
        }
    }

    public static void b(String str) {
        if (b.d != null) {
            b.d.d(str);
        }
    }
}
