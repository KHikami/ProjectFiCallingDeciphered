package p000;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;

final class dgl extends itw {
    final /* synthetic */ dgg f9704a;

    dgl(dgg dgg) {
        this.f9704a = dgg;
    }

    public void mo1386a(itk itk) {
        boolean z = true;
        this.f9704a.f9682e = itk;
        ijb ijb = (ijb) this.f9704a.m11724p().m21926a(ijb.class);
        lyh a = ijb.mo3375a();
        if (a != null) {
            dgg dgg = this.f9704a;
            dgg.f9694q.m11996r();
            if (dgg.f9694q.m11981e().m11897g() == null) {
                dgg.f9694q.m11965a(a.f26866a);
            }
            if (a.f26873h != null) {
                dgg.f9694q.m11975b(a.f26873h.f25931a);
            }
            int a2 = gwb.m1508a(a.f26867b, -1);
            if (a2 == 3) {
                dgg.f9694q.m11976b(true);
                dgg.f9694q.m11977c(a.f26877l);
            } else {
                did did = dgg.f9694q;
                boolean z2 = a2 == 1 || a2 == 2;
                did.m11978c(z2);
            }
            ((iix) dgg.m11724p().m21926a(iix.class)).mo3363a(new dgk(dgg));
        }
        ijb.mo3363a(new dgm(this));
        this.f9704a.f9694q.m12000v();
        if (this.f9704a.f9694q.m11999u()) {
            dgg dgg2 = this.f9704a;
            iil.m21874a("Expected condition to be true", dgg2.f9694q.m11999u());
            List t = dgg2.f9694q.m11998t();
            if (t == null) {
                t = new ArrayList();
            }
            dgg2.m11702a(t);
            dgg2.f9694q.m11939B();
        } else {
            dgg dgg3 = this.f9704a;
            if (!(dgg3.f9694q != null && dgg3.f9694q.m11942G() && dgg3.f9694q.m11943H() == 0)) {
                z = false;
            }
            if (z) {
                long a3;
                glk.m17979c("Babel_calls", "No one in hangout, will leave on timeout.", new Object[0]);
                if (this.f9704a.f9694q.m11988j()) {
                    a3 = gwb.m1519a(this.f9704a.f9680c, "babel_nova_pstn_lonely_hangout_timeout_ms", fls.f13442s);
                } else {
                    a3 = gwb.m1519a(this.f9704a.f9680c, "babel_lonely_hangout_timeout_ms", fls.f13441r);
                }
                this.f9704a.f9693p.postDelayed(this.f9704a.f9679b, a3);
            }
        }
        super.mo1386a(itk);
    }

    public void mo1385a(int i) {
        this.f9704a.f9693p.removeCallbacks(this.f9704a.f9679b);
        if (this.f9704a.f9694q != null) {
            bko k = this.f9704a.f9694q.m11989k();
            gwb.m2198f(2176);
            if (gwb.m2155d(k)) {
                String[] split = gwb.m1998b(gwb.m1400H(), "babel_hangout_upload_end_causes", "6,10,29,47").split(",");
                if (Arrays.asList(split).contains(Integer.toString(this.f9704a.f9694q.m11994p().m22142n()))) {
                    this.f9704a.f9694q.m11982e("");
                }
                if (this.f9704a.f9694q.m11951Q()) {
                    RealTimeChatService.m9122k(k, this.f9704a.f9694q.m11952R());
                }
            }
            dhe.m11807a(this.f9704a.f9680c, this.f9704a.f9694q.m11981e(), i, false);
            this.f9704a.m11698a(this.f9704a.f9694q.m11994p());
        }
        dgg dgg = this.f9704a;
        if (dgg.f9692o != null) {
            dgg.f9692o.m11687b();
        }
        dgg.f9692o = null;
        dgg.f9688k = null;
        dgg.f9689l = true;
        dgg.f9690m = true;
        dgg.f9682e = null;
        dgg.f9684g = null;
        dgg.f9687j.clear();
        dgg.f9691n = null;
        dgg.f9686i = null;
        super.mo1385a(i);
        glk.m17979c("Babel_calls", "Call ended with " + this.f9704a.f9678a.size() + " active CallServiceListeners", new Object[0]);
    }

    public void mo1546b(itl itl) {
        if (this.f9704a.f9687j.containsKey(itl.m23229a())) {
            String str = "Babel_calls";
            String str2 = "Map dup: already has participant: ";
            String valueOf = String.valueOf(itl.toString());
            glk.m17982e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
            for (Entry entry : this.f9704a.f9687j.entrySet()) {
                str = (String) entry.getKey();
                valueOf = String.valueOf(((itl) entry.getValue()).toString());
                glk.m17982e("Babel_calls", new StringBuilder((String.valueOf(str).length() + 20) + String.valueOf(valueOf).length()).append("Map dup: key=").append(str).append(" value=").append(valueOf).toString(), new Object[0]);
            }
            iil.m21870a("Map dup: already has participant");
        }
        if (itl.m23242f()) {
            this.f9704a.f9691n = itl;
        }
        this.f9704a.f9687j.put(itl.m23229a(), itl);
        super.mo1546b(itl);
    }

    public void mo1547c(itl itl) {
        iil.m21874a("Expected condition to be true", this.f9704a.f9687j.containsKey(itl.m23229a()));
        if (itl.m23242f()) {
            this.f9704a.f9691n = null;
        }
        this.f9704a.f9687j.remove(itl.m23229a());
        super.mo1547c(itl);
    }

    public void mo1549d(itl itl) {
        iil.m21874a("Expected condition to be true", this.f9704a.f9687j.containsKey(itl.m23229a()));
        this.f9704a.f9687j.put(itl.m23229a(), itl);
        if (itl.m23248i()) {
            this.f9704a.f9688k = itl;
        }
        if (itl.m23242f()) {
            this.f9704a.f9689l = itl.m23238d();
            this.f9704a.f9691n = itl;
        }
        super.mo1549d(itl);
    }

    public void mo1427a(itl itl) {
        this.f9704a.f9688k = itl;
        super.mo1427a(itl);
    }

    public void mo1545b() {
        super.mo1545b();
        this.f9704a.f9694q.m11995q();
    }

    public void mo1543a(mav mav) {
        String str = null;
        int i = 0;
        super.mo1543a(mav);
        gwb.m2198f(2677);
        if (this.f9704a.f9694q == null) {
            gwb.m2198f(2011);
            return;
        }
        gwb.m1400H();
        if (fde.m15015d(this.f9704a.f9694q.m11989k())) {
            gwb.m2198f(2589);
        }
        int l = this.f9704a.f9694q.m11994p().m22140l();
        if (l == 10019 || l == 10026) {
            gwb.m2198f(2012);
            return;
        }
        llf llf;
        dgg dgg = this.f9704a;
        if (dgg.f9685h == null) {
            llf = null;
        } else {
            llf llf2 = new llf();
            int i2 = dgg.f9685h.f7503b;
            switch (i2) {
                case 0:
                case 2:
                case 3:
                case 4:
                case 5:
                    i = 5;
                    break;
                case 1:
                    i = 2;
                    break;
                case 6:
                    i = 3;
                    break;
                case 7:
                    i = 4;
                    break;
                case 8:
                case wi.dK /*17*/:
                    break;
                case 9:
                    i = 1;
                    break;
                default:
                    glk.m17981d("Babel_calls", "Unknown connectivity manager network type: " + i2, new Object[0]);
                    break;
            }
            llf2.f25329a = Integer.valueOf(i);
            llf2.f25330b = Integer.valueOf(dgg.f9685h.f7504c);
            llf2.f25331c = Long.valueOf(dgg.f9685h.f7505d);
            llf2.f25332d = Long.valueOf(dgg.f9685h.f7506e);
            llf = llf2;
        }
        mav.f27169l = llf;
        if (mav.f27168k != null) {
            edk S = this.f9704a.f9694q.m11953S();
            if (S != null) {
                str = S.m13596f();
            }
            if (str != null) {
                llg llg = mav.f27168k.f25278c;
                if (llg == null) {
                    llg = new llg();
                    mav.f27168k.f25278c = llg;
                }
                llg.f25334b = new llh();
                llg.f25334b.f25336a = str;
            }
        }
    }
}
