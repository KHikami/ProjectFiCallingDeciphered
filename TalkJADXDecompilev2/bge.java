package defpackage;

import android.content.Context;

final class bge implements ffw {
    private final Context a;

    bge(Context context) {
        this.a = context;
    }

    public void a(jck jck, eyc eyc) {
        int b = ((jcf) jyn.a(this.a, jcf.class)).b(jck.b("account_name"));
        if (b != -1) {
            try {
                loa[] loaArr = new loa[eyc.m().length];
                for (int i = 0; i < loaArr.length; i++) {
                    loaArr[i] = (loa) nzf.a(new loa(), eyc.m()[i]);
                }
                for (fed bgf : jyn.c(this.a, fed.class)) {
                    iiq.execute(new bgf(this, bgf, b, loaArr));
                }
            } catch (nzd e) {
            }
        }
    }
}
