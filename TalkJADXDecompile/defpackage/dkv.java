package defpackage;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.google.android.apps.hangouts.hangout.FocusedParticipantView;
import com.google.android.apps.hangouts.hangout.ParticipantTrayView;
import java.util.Collection;

/* renamed from: dkv */
public final class dkv extends dkf implements fqx {
    private final dkw p;
    private bke q;
    private dks r;

    public dkv(djd djd, itl itl, ParticipantTrayView participantTrayView, FocusedParticipantView focusedParticipantView) {
        super(djd, itl, participantTrayView, focusedParticipantView);
        this.p = new dkw(this);
        a(itl.b());
    }

    public void a(dhu dhu) {
        super.a(dhu);
        this.b.a(this.p);
        p();
    }

    void c() {
        if (this.q != null) {
            this.q.b();
            this.q = null;
        }
        this.b.b(this.p);
        super.c();
    }

    private void p() {
        if (this.m == null) {
            if (this.a.j()) {
                dks n = n();
                if (n != null && n.c() != null) {
                    c(n.c());
                    return;
                }
                return;
            }
            String g = this.a.g();
            if (this.q != null) {
                this.q.b();
            }
            fqu a = fqu.a(this.c.a());
            this.q = new bke(g, (fqx) this);
            a.a(this.q);
        }
    }

    Bitmap k() {
        if (this.m == null && this.a.j()) {
            int d;
            iil.a("Expected condition to be true", this.a.j());
            dks n = n();
            if (n != null) {
                d = n.d();
            } else {
                d = 0;
            }
            if (d == 1) {
                return blc.g();
            }
        }
        return super.k();
    }

    public dks n() {
        if (this.r == null && this.a != null) {
            ikd b = inx.a().b();
            if (b != null) {
                Collection<iqo> j = b.j();
                if (j != null) {
                    for (iqo iqo : j) {
                        if (iqo.a().equals(this.a.a())) {
                            if (iqo.p() instanceof dks) {
                                this.r = (dks) iqo.p();
                            }
                        }
                    }
                }
            }
        }
        return this.r;
    }

    public void a(String str, String str2, bke bke, String str3, bko bko) {
        this.q = null;
        if (this.a.b().equals(str)) {
            b(str3);
        }
        if (!TextUtils.isEmpty(str2)) {
            c(str2);
        }
    }

    public void a(bke bke) {
        this.q = null;
    }

    protected void d(int i) {
        int i2 = this.g;
        super.d(i);
        if (i2 != 1 && i == 1) {
            p();
        }
        if (i2 != 3 && i == 3) {
            did s = this.b.s();
            if (s != null) {
                s.w();
            }
        }
    }

    void o() {
        this.i.setFocusable(false);
        this.i.setClickable(false);
        if (i()) {
            this.e.g();
        }
        this.e.a((dkf) this);
    }

    protected String m() {
        return this.a.a();
    }
}
