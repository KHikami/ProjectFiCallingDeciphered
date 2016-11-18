package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.apps.hangouts.hangout.HangoutFragment;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.List;
import java.util.Set;

public final class dhs extends itg {
    final /* synthetic */ HangoutFragment a;

    public dhs(HangoutFragment hangoutFragment) {
        this.a = hangoutFragment;
        super('\u0000');
    }

    public void a(Intent intent) {
        if (this.a.al == 2) {
            intent.setFlags(intent.getFlags() & -268435457);
            this.a.an = true;
            this.a.startActivityForResult(intent, 0);
        }
    }

    public void a(itk itk) {
        this.a.e = this.a.f.s().e();
        ((dqc) this.a.binder.a(dqc.class)).a(((jca) this.a.binder.a(jca.class)).a(), dqd.CALL_JOINED);
        this.a.d.F_();
    }

    public void h() {
        this.a.b(false);
    }

    public void a(isr isr, Set<isq> set) {
        this.a.w();
        this.a.a(isr, (Set) set);
    }

    public void a(itm itm) {
        int i;
        switch (dhr.a[itm.a().ordinal()]) {
            case 1:
                i = 2477;
                bko v = gwb.v();
                iry l = this.a.f.l();
                if (!(this.a.aq || l == null || v == null)) {
                    if (fdq.z.b(v.g())) {
                        this.a.aq = true;
                        this.a.a(false);
                        Toast.makeText(this.a.getActivity(), bc.tY, 1).show();
                        l.a(false);
                        break;
                    }
                }
                break;
            case 2:
                i = 2478;
                break;
            default:
                String valueOf = String.valueOf(itm.a());
                glk.e("Babel_calls", new StringBuilder(String.valueOf(valueOf).length() + 39).append("Error: invalid quality event reported: ").append(valueOf).toString(), new Object[0]);
                return;
        }
        gwb.f(i);
    }

    public void a(dgc dgc) {
        iry l = this.a.f.l();
        if (l != null) {
            bko v = gwb.v();
            if (v != null) {
                if (fdq.E.b(v.g())) {
                    if (l.g() && !this.a.ar && dgc == dgc.POWER_SAVE_MODE_ACTIVATED) {
                        this.a.a(false);
                        Toast.makeText(this.a.getActivity(), bc.tW, 1).show();
                        l.a(false);
                        this.a.ar = true;
                    } else if (!l.g() && this.a.ar && dgc == dgc.POWER_SAVE_MODE_DEACTIVATED) {
                        ((doh) jyn.a(this.a.context, doh.class)).a(gwb.r(this.a.context));
                        this.a.ar = false;
                    }
                }
            }
        }
        int a = gwb.a((Integer) dgb.a.get(dgc), -1);
        if (a != -1) {
            gwb.f(a);
        }
    }

    public void b(itl itl) {
        if (itl.f()) {
            this.a.b();
        }
    }

    public void d(itl itl) {
        if (itl.f()) {
            this.a.b();
        }
    }

    public void c(itl itl) {
        if (itl.f()) {
            this.a.b();
        }
    }

    public void a(String str) {
        new Object[1][0] = str;
        if (this.a.al == 2) {
            this.a.e = this.a.f.s().e();
        }
    }

    public void b(int i) {
        this.a.w();
        if ((i & 1) == 0) {
            this.a.a(null, false);
        }
    }

    public void a(did did) {
        int i = 0;
        new StringBuilder(27).append("onHangoutEnded: ").append(this.a.al);
        if (this.a.al != 3) {
            int O = did.O();
            if (glk.a("Babel_calls", 3)) {
                glk.a("Babel_calls", "HangoutFragment.onHangoutEnded: reason=" + O, new Object[0]);
            }
            eei eei = (eei) this.a.binder.a(eei.class);
            if (!this.a.h) {
                i = eei.a(this.a.ak.g());
                if (i == 0) {
                    gwb.f(3266);
                }
            }
            if (!HangoutFragment.b(O)) {
                this.a.a(3);
                if (O == 11014) {
                    if (!(this.a.getActivity().J_().a("out_of_balance_dialog_fragment_tag") instanceof djq)) {
                        new djq().a(this.a.getFragmentManager(), "out_of_balance_dialog_fragment_tag");
                        return;
                    }
                    return;
                } else if (O == 10019) {
                    a(new djp());
                    return;
                } else {
                    this.a.a(did.P(), O);
                }
            } else if (i != 0) {
                this.a.a(3);
                a(eei.b(this.a.ak.g()));
                return;
            } else {
                this.a.d.n();
            }
            dhe.a(this.a.d, this.a.e);
        }
    }

    private void a(dq dqVar) {
        this.a.an = true;
        this.a.ap = this.a.f.i();
        dqVar.a(this.a.getFragmentManager(), null);
    }

    public void f() {
        new StringBuilder(29).append("onHangoutExiting: ").append(this.a.al);
        if (this.a.al != 3) {
            int O = this.a.f.s().O();
            eei eei = (eei) this.a.binder.b(eei.class);
            Object obj;
            if (eei == null || !eei.a(this.a.ak.g())) {
                obj = null;
            } else {
                obj = 1;
            }
            if (HangoutFragment.b(O) && r0 == null) {
                this.a.d.n();
            }
        }
    }

    public boolean c(int i) {
        if (i != 7) {
            return false;
        }
        return true;
    }

    public void g() {
        Intent intent = this.a.d.getIntent();
        if (intent.hasExtra("recent_call_timestamp")) {
            Object s = this.a.f.s();
            iil.b("Expected non-null", s);
            List F = s.F();
            if (s.J() == 1 && F.size() == 1) {
                List T = s.T();
                if (T.size() == 1) {
                    String b = ((dii) T.get(0)).b();
                    RealTimeChatService.a(this.a.ak.g(), intent.getLongExtra("recent_call_timestamp", 0), b, TextUtils.isEmpty(b));
                }
            }
        }
    }

    public void a(boolean z) {
        if (!z) {
            this.a.s();
        }
        this.a.w();
    }
}
