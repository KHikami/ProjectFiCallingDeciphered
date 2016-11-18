package p000;

import android.net.Uri;
import android.text.TextUtils;

final class fvi implements jwm {
    final /* synthetic */ ftv f14092a;
    final /* synthetic */ int f14093b;
    final /* synthetic */ jca f14094c;
    final /* synthetic */ String f14095d;

    fvi(ftv ftv, int i, jca jca, String str) {
        this.f14092a = ftv;
        this.f14093b = i;
        this.f14094c = jca;
        this.f14095d = str;
    }

    public boolean mo1377a(jwi jwi, Object obj) {
        String str = (String) obj;
        Uri b = this.f14092a.m16233b();
        boolean z = b == null;
        boolean isEmpty = TextUtils.isEmpty(str);
        if (this.f14093b == 1 && !(z == isEmpty && (b == null || b.equals(Uri.parse(str))))) {
            gwb.m1823a(fde.m15018e(this.f14094c.mo2317a()), 1599);
        }
        ((jcf) jyn.m25426a(this.f14092a.m5166x(), jcf.class)).mo3464b(this.f14094c.mo2317a()).m23879b(this.f14095d, str).m23891d();
        this.f14092a.m16232a(str);
        return true;
    }
}
