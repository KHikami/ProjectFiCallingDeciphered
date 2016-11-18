package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import java.util.List;

final class esg implements jcc, kbm, kcm, kcq {
    private final List<erx> a;
    private int b;
    private Class<?> c;
    private jca d;
    private View e;
    private Bundle f;

    esg(jyn jyn, kbu kbu, List<erx> list, int i) {
        glk.a("Babel_BannerPromo", "BannerPromoMixinImpl", new Object[0]);
        this.b = i;
        this.a = list;
        this.d = ((jmj) jyn.a(jmj.class)).b((jcc) this);
        kbu.a((kcq) this);
    }

    public void a(View view, Bundle bundle) {
        glk.a("Babel_BannerPromo", "onViewCreated", new Object[0]);
        this.e = view;
        this.f = bundle;
    }

    public void R_() {
        glk.c("Babel_BannerPromo", "resume", new Object[0]);
        b(this.e, this.f);
    }

    public void a(boolean z, jcb jcb, jcb jcb2, int i, int i2) {
        if (jcb2 == jcb.VALID) {
            glk.c("Babel_BannerPromo", "new valid account", new Object[0]);
            if (this.e != null) {
                b(this.e, this.f);
            }
        }
    }

    private void b(View view, Bundle bundle) {
        View findViewById = view.getRootView().findViewById(this.b);
        if (findViewById instanceof ViewStub) {
            this.c = null;
            if (this.d.b()) {
                for (erx erx : this.a) {
                    String valueOf = String.valueOf(erx);
                    glk.c("Babel", new StringBuilder(String.valueOf(valueOf).length() + 9).append("checking:").append(valueOf).toString(), new Object[0]);
                    if (erx.a()) {
                        String valueOf2 = String.valueOf(erx.getClass());
                        glk.c("Babel", new StringBuilder(String.valueOf(valueOf2).length() + 10).append("will show ").append(valueOf2).toString(), new Object[0]);
                        erx.a(this.b, view);
                        this.c = erx.getClass();
                        return;
                    }
                }
                return;
            }
            glk.c("Babel_BannerPromo", "no account", new Object[0]);
            return;
        }
        glk.c("Babel_BannerPromo", "view already inflated.", new Object[0]);
        if (findViewById.getVisibility() != 8) {
            for (erx erx2 : this.a) {
                if (erx2.getClass().equals(this.c)) {
                    valueOf = String.valueOf(erx2);
                    glk.c("Babel", new StringBuilder(String.valueOf(valueOf).length() + 11).append("revalidate:").append(valueOf).toString(), new Object[0]);
                    if (!erx2.a()) {
                        glk.c("Babel", "hiding", new Object[0]);
                        findViewById.setVisibility(8);
                        this.c = null;
                        return;
                    }
                    return;
                }
            }
            String valueOf3 = String.valueOf(this.c);
            glk.e("Babel", new StringBuilder(String.valueOf(valueOf3).length() + 10).append("not found:").append(valueOf3).toString(), new Object[0]);
        }
    }
}
