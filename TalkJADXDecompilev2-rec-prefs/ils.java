package p000;

import android.content.Context;

final class ils {
    final Context f18003a;
    private final iti f18004b;

    ils(Context context, iti iti) {
        this.f18003a = context;
        this.f18004b = iti;
    }

    void m22260a(itf itf, mav mav) {
        iiq.m4948a(new ilt(this, m22258a(itf.m23189o()), mav, itf.m23169d()));
    }

    private iiu m22258a(String str) {
        return ((iiv) jyn.m25435b(this.f18003a).m25443a(iiv.class)).m21904a(str);
    }

    protected ijh m22259a(String str, loh loh, loe loe, off off) {
        ijh ipg = new ipg(this.f18003a, this.f18004b, str);
        ipg.mo3361a(loh);
        ipg.mo3360a(loe);
        ipg.mo3362a(off);
        return ipg;
    }
}
