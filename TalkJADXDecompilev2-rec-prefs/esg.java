package p000;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import java.util.List;

final class esg implements jcc, kbm, kcm, kcq {
    private final List<erx> f12150a;
    private int f12151b;
    private Class<?> f12152c;
    private jca f12153d;
    private View f12154e;
    private Bundle f12155f;

    esg(jyn jyn, kbu kbu, List<erx> list, int i) {
        glk.m17970a("Babel_BannerPromo", "BannerPromoMixinImpl", new Object[0]);
        this.f12151b = i;
        this.f12150a = list;
        this.f12153d = ((jmj) jyn.m25443a(jmj.class)).m24702b((jcc) this);
        kbu.m25514a((kcq) this);
    }

    public void mo917a(View view, Bundle bundle) {
        glk.m17970a("Babel_BannerPromo", "onViewCreated", new Object[0]);
        this.f12154e = view;
        this.f12155f = bundle;
    }

    public void R_() {
        glk.m17979c("Babel_BannerPromo", "resume", new Object[0]);
        m14343b(this.f12154e, this.f12155f);
    }

    public void mo1133a(boolean z, jcb jcb, jcb jcb2, int i, int i2) {
        if (jcb2 == jcb.VALID) {
            glk.m17979c("Babel_BannerPromo", "new valid account", new Object[0]);
            if (this.f12154e != null) {
                m14343b(this.f12154e, this.f12155f);
            }
        }
    }

    private void m14343b(View view, Bundle bundle) {
        View findViewById = view.getRootView().findViewById(this.f12151b);
        if (findViewById instanceof ViewStub) {
            this.f12152c = null;
            if (this.f12153d.mo2319b()) {
                for (erx erx : this.f12150a) {
                    String valueOf = String.valueOf(erx);
                    glk.m17979c("Babel", new StringBuilder(String.valueOf(valueOf).length() + 9).append("checking:").append(valueOf).toString(), new Object[0]);
                    if (erx.mo480a()) {
                        String valueOf2 = String.valueOf(erx.getClass());
                        glk.m17979c("Babel", new StringBuilder(String.valueOf(valueOf2).length() + 10).append("will show ").append(valueOf2).toString(), new Object[0]);
                        erx.mo478a(this.f12151b, view);
                        this.f12152c = erx.getClass();
                        return;
                    }
                }
                return;
            }
            glk.m17979c("Babel_BannerPromo", "no account", new Object[0]);
            return;
        }
        glk.m17979c("Babel_BannerPromo", "view already inflated.", new Object[0]);
        if (findViewById.getVisibility() != 8) {
            for (erx erx2 : this.f12150a) {
                if (erx2.getClass().equals(this.f12152c)) {
                    valueOf = String.valueOf(erx2);
                    glk.m17979c("Babel", new StringBuilder(String.valueOf(valueOf).length() + 11).append("revalidate:").append(valueOf).toString(), new Object[0]);
                    if (!erx2.mo480a()) {
                        glk.m17979c("Babel", "hiding", new Object[0]);
                        findViewById.setVisibility(8);
                        this.f12152c = null;
                        return;
                    }
                    return;
                }
            }
            String valueOf3 = String.valueOf(this.f12152c);
            glk.m17982e("Babel", new StringBuilder(String.valueOf(valueOf3).length() + 10).append("not found:").append(valueOf3).toString(), new Object[0]);
        }
    }
}
