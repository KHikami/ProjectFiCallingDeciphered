import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;

final class dgl extends itw {
    final /* synthetic */ dgg a;

    dgl(dgg dgg) {
        this.a = dgg;
    }

    public void a(itk itk) {
        boolean z = true;
        this.a.e = itk;
        ijb ijb = (ijb) this.a.p().a(ijb.class);
        lyh a = ijb.a();
        if (a != null) {
            dgg dgg = this.a;
            dgg.q.r();
            if (dgg.q.e().g() == null) {
                dgg.q.a(a.a);
            }
            if (a.h != null) {
                dgg.q.b(a.h.a);
            }
            int a2 = gwb.a(a.b, -1);
            if (a2 == 3) {
                dgg.q.b(true);
                dgg.q.c(a.l);
            } else {
                did did = dgg.q;
                boolean z2 = a2 == 1 || a2 == 2;
                did.c(z2);
            }
            ((iix) dgg.p().a(iix.class)).a(new dgk(dgg));
        }
        ijb.a(new dgm(this));
        this.a.q.v();
        if (this.a.q.u()) {
            dgg dgg2 = this.a;
            iil.a("Expected condition to be true", dgg2.q.u());
            List t = dgg2.q.t();
            if (t == null) {
                t = new ArrayList();
            }
            dgg2.a(t);
            dgg2.q.B();
        } else {
            dgg dgg3 = this.a;
            if (!(dgg3.q != null && dgg3.q.G() && dgg3.q.H() == 0)) {
                z = false;
            }
            if (z) {
                long a3;
                glk.c("Babel_calls", "No one in hangout, will leave on timeout.", new Object[0]);
                if (this.a.q.j()) {
                    a3 = gwb.a(this.a.c, "babel_nova_pstn_lonely_hangout_timeout_ms", fls.s);
                } else {
                    a3 = gwb.a(this.a.c, "babel_lonely_hangout_timeout_ms", fls.r);
                }
                this.a.p.postDelayed(this.a.b, a3);
            }
        }
        super.a(itk);
    }

    public void a(int i) {
        this.a.p.removeCallbacks(this.a.b);
        if (this.a.q != null) {
            bko k = this.a.q.k();
            gwb.f(2176);
            if (gwb.d(k)) {
                String[] split = gwb.b(gwb.H(), "babel_hangout_upload_end_causes", "6,10,29,47").split(",");
                if (Arrays.asList(split).contains(Integer.toString(this.a.q.p().n()))) {
                    this.a.q.e("");
                }
                if (this.a.q.Q()) {
                    RealTimeChatService.k(k, this.a.q.R());
                }
            }
            dhe.a(this.a.c, this.a.q.e(), i, false);
            this.a.a(this.a.q.p());
        }
        dgg dgg = this.a;
        if (dgg.o != null) {
            dgg.o.b();
        }
        dgg.o = null;
        dgg.k = null;
        dgg.l = true;
        dgg.m = true;
        dgg.e = null;
        dgg.g = null;
        dgg.j.clear();
        dgg.n = null;
        dgg.i = null;
        super.a(i);
        glk.c("Babel_calls", "Call ended with " + this.a.a.size() + " active CallServiceListeners", new Object[0]);
    }

    public void b(itl itl) {
        if (this.a.j.containsKey(itl.a())) {
            String str = "Babel_calls";
            String str2 = "Map dup: already has participant: ";
            String valueOf = String.valueOf(itl.toString());
            glk.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
            for (Entry entry : this.a.j.entrySet()) {
                str = (String) entry.getKey();
                valueOf = String.valueOf(((itl) entry.getValue()).toString());
                glk.e("Babel_calls", new StringBuilder((String.valueOf(str).length() + 20) + String.valueOf(valueOf).length()).append("Map dup: key=").append(str).append(" value=").append(valueOf).toString(), new Object[0]);
            }
            iil.a("Map dup: already has participant");
        }
        if (itl.f()) {
            this.a.n = itl;
        }
        this.a.j.put(itl.a(), itl);
        super.b(itl);
    }

    public void c(itl itl) {
        iil.a("Expected condition to be true", this.a.j.containsKey(itl.a()));
        if (itl.f()) {
            this.a.n = null;
        }
        this.a.j.remove(itl.a());
        super.c(itl);
    }

    public void d(itl itl) {
        iil.a("Expected condition to be true", this.a.j.containsKey(itl.a()));
        this.a.j.put(itl.a(), itl);
        if (itl.i()) {
            this.a.k = itl;
        }
        if (itl.f()) {
            this.a.l = itl.d();
            this.a.n = itl;
        }
        super.d(itl);
    }

    public void a(itl itl) {
        this.a.k = itl;
        super.a(itl);
    }

    public void b() {
        super.b();
        this.a.q.q();
    }

    public void a(mav mav) {
        String str = null;
        int i = 0;
        super.a(mav);
        gwb.f(2677);
        if (this.a.q == null) {
            gwb.f(2011);
            return;
        }
        gwb.H();
        if (fde.d(this.a.q.k())) {
            gwb.f(2589);
        }
        int l = this.a.q.p().l();
        if (l == 10019 || l == 10026) {
            gwb.f(2012);
            return;
        }
        llf llf;
        dgg dgg = this.a;
        if (dgg.h == null) {
            llf = null;
        } else {
            llf llf2 = new llf();
            int i2 = dgg.h.b;
            switch (i2) {
                case wi.w /*0*/:
                case wi.l /*2*/:
                case wi.z /*3*/:
                case wi.h /*4*/:
                case wi.p /*5*/:
                    i = 5;
                    break;
                case wi.j /*1*/:
                    i = 2;
                    break;
                case wi.s /*6*/:
                    i = 3;
                    break;
                case wi.q /*7*/:
                    i = 4;
                    break;
                case wi.m /*8*/:
                case wi.dK /*17*/:
                    break;
                case wi.n /*9*/:
                    i = 1;
                    break;
                default:
                    glk.d("Babel_calls", "Unknown connectivity manager network type: " + i2, new Object[0]);
                    break;
            }
            llf2.a = Integer.valueOf(i);
            llf2.b = Integer.valueOf(dgg.h.c);
            llf2.c = Long.valueOf(dgg.h.d);
            llf2.d = Long.valueOf(dgg.h.e);
            llf = llf2;
        }
        mav.l = llf;
        if (mav.k != null) {
            edk S = this.a.q.S();
            if (S != null) {
                str = S.f();
            }
            if (str != null) {
                llg llg = mav.k.c;
                if (llg == null) {
                    llg = new llg();
                    mav.k.c = llg;
                }
                llg.b = new llh();
                llg.b.a = str;
            }
        }
    }
}
