package p000;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Deprecated
public final class inx {
    private static inx f18198b = new inx();
    final List<ikf> f18199a = new CopyOnWriteArrayList();
    private final ikf f18200c = new ilc(this);
    private ijt f18201d;

    private inx() {
    }

    public static inx m22408a() {
        iil.m21875b("Expected non-null", f18198b);
        iil.m21867a();
        return f18198b;
    }

    void m22411a(ijt ijt) {
        this.f18201d = ijt;
        if (ijt != null) {
            ijt.m22037a(this.f18200c);
        }
    }

    public void m22412a(ikf ikf) {
        iil.m21867a();
        this.f18199a.add(ikf);
    }

    public ikd m22417b() {
        iil.m21867a();
        if (this.f18201d == null) {
            return null;
        }
        return this.f18201d.m22029a();
    }

    public void m22415a(byte[] bArr) {
        iil.m21867a();
        if (this.f18201d != null) {
            this.f18201d.m22047a(bArr);
        }
    }

    public void m22416a(String[] strArr, int i, boolean z, boolean z2, String str) {
        iil.m21867a();
        iil.m21867a();
        if (this.f18201d != null) {
            this.f18201d.m22046a(false, strArr, 1, true, false, null);
        }
    }

    public void m22414a(String str, String str2, boolean z, boolean z2, boolean z3, byte[] bArr) {
        iil.m21867a();
        if (this.f18201d != null) {
            this.f18201d.m22043a(str, str2, false, z2, z3, bArr);
        }
    }

    public void m22410a(char c, int i, String str) {
        iil.m21867a();
        if (this.f18201d != null) {
            this.f18201d.m22030a(c, i, str);
        }
    }

    public void m22413a(String str) {
        iil.m21867a();
        if (this.f18201d != null) {
            this.f18201d.m22064c(str);
        }
    }

    public static void m22409b(String str) {
        if (f18198b.f18201d != null) {
            f18198b.f18201d.m22069d(str);
        }
    }
}
