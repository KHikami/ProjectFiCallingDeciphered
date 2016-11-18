package p000;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.google.android.apps.hangouts.hangout.FocusedParticipantView;
import com.google.android.apps.hangouts.hangout.ParticipantTrayView;
import java.util.Collection;

public final class dkv extends dkf implements fqx {
    private final dkw f10046p = new dkw(this);
    private bke f10047q;
    private dks f10048r;

    public dkv(djd djd, itl itl, ParticipantTrayView participantTrayView, FocusedParticipantView focusedParticipantView) {
        super(djd, itl, participantTrayView, focusedParticipantView);
        m12100a(itl.m23232b());
    }

    public void mo1110a(dhu dhu) {
        super.mo1110a(dhu);
        this.b.m11701a(this.f10046p);
        m12159p();
    }

    void mo1585c() {
        if (this.f10047q != null) {
            this.f10047q.mo607b();
            this.f10047q = null;
        }
        this.b.m11705b(this.f10046p);
        super.mo1585c();
    }

    private void m12159p() {
        if (this.m == null) {
            if (this.a.m23249j()) {
                dks n = mo1589n();
                if (n != null && n.m12140c() != null) {
                    m12107c(n.m12140c());
                    return;
                }
                return;
            }
            String g = this.a.m23244g();
            if (this.f10047q != null) {
                this.f10047q.mo607b();
            }
            fqu a = fqu.m16000a(this.c.m11848a());
            this.f10047q = new bke(g, (fqx) this);
            a.mo2072a(this.f10047q);
        }
    }

    Bitmap mo1587k() {
        if (this.m == null && this.a.m23249j()) {
            int d;
            iil.m21874a("Expected condition to be true", this.a.m23249j());
            dks n = mo1589n();
            if (n != null) {
                d = n.m12141d();
            } else {
                d = 0;
            }
            if (d == 1) {
                return blc.m5749g();
            }
        }
        return super.mo1587k();
    }

    public dks mo1589n() {
        if (this.f10048r == null && this.a != null) {
            ikd b = inx.m22408a().m22417b();
            if (b != null) {
                Collection<iqo> j = b.m22138j();
                if (j != null) {
                    for (iqo iqo : j) {
                        if (iqo.m22949a().equals(this.a.m23229a())) {
                            if (iqo.m22974p() instanceof dks) {
                                this.f10048r = (dks) iqo.m22974p();
                            }
                        }
                    }
                }
            }
        }
        return this.f10048r;
    }

    public void mo1118a(String str, String str2, bke bke, String str3, bko bko) {
        this.f10047q = null;
        if (this.a.m23232b().equals(str)) {
            m12104b(str3);
        }
        if (!TextUtils.isEmpty(str2)) {
            m12107c(str2);
        }
    }

    public void mo1114a(bke bke) {
        this.f10047q = null;
    }

    protected void mo1586d(int i) {
        int i2 = this.g;
        super.mo1586d(i);
        if (i2 != 1 && i == 1) {
            m12159p();
        }
        if (i2 != 3 && i == 3) {
            did s = this.b.m11727s();
            if (s != null) {
                s.m12001w();
            }
        }
    }

    void mo1590o() {
        this.i.setFocusable(false);
        this.i.setClickable(false);
        if (m12114i()) {
            this.e.m8669g();
        }
        this.e.m8661a((dkf) this);
    }

    protected String mo1588m() {
        return this.a.m23229a();
    }
}
