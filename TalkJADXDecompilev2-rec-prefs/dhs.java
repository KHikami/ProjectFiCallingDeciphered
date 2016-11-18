package p000;

import android.content.Intent;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.apps.hangouts.hangout.HangoutFragment;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.List;
import java.util.Set;

public final class dhs extends itg {
    final /* synthetic */ HangoutFragment f9769a;

    public dhs(HangoutFragment hangoutFragment) {
        this.f9769a = hangoutFragment;
        super('\u0000');
    }

    public void mo1539a(Intent intent) {
        if (this.f9769a.al == 2) {
            intent.setFlags(intent.getFlags() & -268435457);
            this.f9769a.an = true;
            this.f9769a.startActivityForResult(intent, 0);
        }
    }

    public void mo1386a(itk itk) {
        this.f9769a.f6343e = this.f9769a.f6344f.m11727s().m11981e();
        ((dqc) this.f9769a.binder.m25443a(dqc.class)).mo1652a(((jca) this.f9769a.binder.m25443a(jca.class)).mo2317a(), dqd.CALL_JOINED);
        this.f9769a.f6342d.F_();
    }

    public void mo1570h() {
        this.f9769a.m8586b(false);
    }

    public void mo1568a(isr isr, Set<isq> set) {
        this.f9769a.m8596w();
        this.f9769a.m8581a(isr, (Set) set);
    }

    public void mo1540a(itm itm) {
        int i;
        switch (dhr.f9767a[itm.m23255a().ordinal()]) {
            case 1:
                i = 2477;
                bko v = gwb.m2370v();
                iry l = this.f9769a.f6344f.m11720l();
                if (!(this.f9769a.aq || l == null || v == null)) {
                    if (fdq.f12810z.m14370b(v.m5638g())) {
                        this.f9769a.aq = true;
                        this.f9769a.m8584a(false);
                        Toast.makeText(this.f9769a.getActivity(), bc.tY, 1).show();
                        l.m23059a(false);
                        break;
                    }
                }
                break;
            case 2:
                i = 2478;
                break;
            default:
                String valueOf = String.valueOf(itm.m23255a());
                glk.m17982e("Babel_calls", new StringBuilder(String.valueOf(valueOf).length() + 39).append("Error: invalid quality event reported: ").append(valueOf).toString(), new Object[0]);
                return;
        }
        gwb.m2198f(i);
    }

    public void mo1566a(dgc dgc) {
        iry l = this.f9769a.f6344f.m11720l();
        if (l != null) {
            bko v = gwb.m2370v();
            if (v != null) {
                if (fdq.f12763E.m14370b(v.m5638g())) {
                    if (l.mo1322g() && !this.f9769a.ar && dgc == dgc.POWER_SAVE_MODE_ACTIVATED) {
                        this.f9769a.m8584a(false);
                        Toast.makeText(this.f9769a.getActivity(), bc.tW, 1).show();
                        l.m23059a(false);
                        this.f9769a.ar = true;
                    } else if (!l.mo1322g() && this.f9769a.ar && dgc == dgc.POWER_SAVE_MODE_DEACTIVATED) {
                        ((doh) jyn.m25426a(this.f9769a.context, doh.class)).mo1630a(gwb.m2338r(this.f9769a.context));
                        this.f9769a.ar = false;
                    }
                }
            }
        }
        int a = gwb.m1508a((Integer) dgb.f9663a.get(dgc), -1);
        if (a != -1) {
            gwb.m2198f(a);
        }
    }

    public void mo1546b(itl itl) {
        if (itl.m23242f()) {
            this.f9769a.m8585b();
        }
    }

    public void mo1549d(itl itl) {
        if (itl.m23242f()) {
            this.f9769a.m8585b();
        }
    }

    public void mo1547c(itl itl) {
        if (itl.m23242f()) {
            this.f9769a.m8585b();
        }
    }

    public void mo1564a(String str) {
        new Object[1][0] = str;
        if (this.f9769a.al == 2) {
            this.f9769a.f6343e = this.f9769a.f6344f.m11727s().m11981e();
        }
    }

    public void mo1565b(int i) {
        this.f9769a.m8596w();
        if ((i & 1) == 0) {
            this.f9769a.m8583a(null, false);
        }
    }

    public void mo1567a(did did) {
        int i = 0;
        new StringBuilder(27).append("onHangoutEnded: ").append(this.f9769a.al);
        if (this.f9769a.al != 3) {
            int O = did.m11949O();
            if (glk.m17973a("Babel_calls", 3)) {
                glk.m17970a("Babel_calls", "HangoutFragment.onHangoutEnded: reason=" + O, new Object[0]);
            }
            eei eei = (eei) this.f9769a.binder.m25443a(eei.class);
            if (!this.f9769a.f6346h) {
                i = eei.mo1854a(this.f9769a.ak.m5638g());
                if (i == 0) {
                    gwb.m2198f(3266);
                }
            }
            if (!HangoutFragment.m8572b(O)) {
                this.f9769a.m8580a(3);
                if (O == 11014) {
                    if (!(this.f9769a.getActivity().J_().mo1844a("out_of_balance_dialog_fragment_tag") instanceof djq)) {
                        new djq().mo2341a(this.f9769a.getFragmentManager(), "out_of_balance_dialog_fragment_tag");
                        return;
                    }
                    return;
                } else if (O == 10019) {
                    m11831a(new djp());
                    return;
                } else {
                    this.f9769a.m8582a(did.m11950P(), O);
                }
            } else if (i != 0) {
                this.f9769a.m8580a(3);
                m11831a(eei.mo1855b(this.f9769a.ak.m5638g()));
                return;
            } else {
                this.f9769a.f6342d.m8568n();
            }
            dhe.m11806a(this.f9769a.f6342d, this.f9769a.f6343e);
        }
    }

    private void m11831a(dq dqVar) {
        this.f9769a.an = true;
        this.f9769a.ap = this.f9769a.f6344f.m11717i();
        dqVar.mo2341a(this.f9769a.getFragmentManager(), null);
    }

    public void mo1561f() {
        new StringBuilder(29).append("onHangoutExiting: ").append(this.f9769a.al);
        if (this.f9769a.al != 3) {
            int O = this.f9769a.f6344f.m11727s().m11949O();
            eei eei = (eei) this.f9769a.binder.m25454b(eei.class);
            Object obj;
            if (eei == null || !eei.mo1854a(this.f9769a.ak.m5638g())) {
                obj = null;
            } else {
                obj = 1;
            }
            if (HangoutFragment.m8572b(O) && r0 == null) {
                this.f9769a.f6342d.m8568n();
            }
        }
    }

    public boolean mo1569c(int i) {
        if (i != 7) {
            return false;
        }
        return true;
    }

    public void mo1562g() {
        Intent intent = this.f9769a.f6342d.getIntent();
        if (intent.hasExtra("recent_call_timestamp")) {
            Object s = this.f9769a.f6344f.m11727s();
            iil.m21875b("Expected non-null", s);
            List F = s.m11941F();
            if (s.m11945J() == 1 && F.size() == 1) {
                List T = s.m11954T();
                if (T.size() == 1) {
                    String b = ((dii) T.get(0)).m12006b();
                    RealTimeChatService.m8995a(this.f9769a.ak.m5638g(), intent.getLongExtra("recent_call_timestamp", 0), b, TextUtils.isEmpty(b));
                }
            }
        }
    }

    public void mo1557a(boolean z) {
        if (!z) {
            this.f9769a.m8592s();
        }
        this.f9769a.m8596w();
    }
}
