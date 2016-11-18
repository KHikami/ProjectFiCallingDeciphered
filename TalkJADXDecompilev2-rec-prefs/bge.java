package p000;

import android.content.Context;

final class bge implements ffw {
    private final Context f3298a;

    bge(Context context) {
        this.f3298a = context;
    }

    public void mo536a(jck jck, eyc eyc) {
        int b = ((jcf) jyn.m25426a(this.f3298a, jcf.class)).mo3461b(jck.mo3440b("account_name"));
        if (b != -1) {
            try {
                loa[] loaArr = new loa[eyc.m14772m().length];
                for (int i = 0; i < loaArr.length; i++) {
                    loaArr[i] = (loa) nzf.m1027a(new loa(), eyc.m14772m()[i]);
                }
                for (fed bgf : jyn.m25438c(this.f3298a, fed.class)) {
                    iiq.execute(new bgf(this, bgf, b, loaArr));
                }
            } catch (nzd e) {
            }
        }
    }
}
