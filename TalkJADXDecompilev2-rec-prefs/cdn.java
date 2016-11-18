package p000;

import android.content.Context;
import android.widget.Toast;

class cdn {
    final /* synthetic */ cdr f5078a;

    public void m7282a(CharSequence charSequence) {
        String a = blo.m5856a(this.f5078a.av.m5638g(), 3);
        boolean b = this.f5078a.f5103f.m16725b();
        this.f5078a.f5103f.m16722a();
        Runnable cfn = new cfn(this, charSequence, a, b);
        if (this.f5078a.m7354G()) {
            cfn.run();
            return;
        }
        this.f5078a.aT.add(cfn);
        cdr cdr = this.f5078a;
        if (cdr.m7354G()) {
            for (Runnable a2 : cdr.aT) {
                gwb.m1863a(a2);
            }
            cdr.aT.clear();
        }
        dvm b2 = ba.m4618c().m12794b(a);
        bpd a3 = this.f5078a.f5106i.mo931a();
        if (a3 == null) {
            ba.m4548a(this.f5078a.av.m5638g(), glj.m17963b(), 10, b2.m12786a(213));
        } else {
            b2.m12789a(a3.f4146a);
        }
        if (this.f5078a.bA == null) {
            ba.m4548a(this.f5078a.av.m5638g(), glj.m17963b(), 10, b2.m12786a(215));
        }
        Toast.makeText(this.f5078a.context, bc.kc, 0).show();
        this.f5078a.m7406c("Queueing message");
    }

    public void m7281a(int i) {
        this.f5078a.m7381a(new cfo(this, i));
    }

    public void m7280a() {
        this.f5078a.m7356I();
    }

    public void m7283b() {
        if (!this.f5078a.m7352E()) {
            if (this.f5078a.br) {
                int i;
                bpd a = this.f5078a.f5106i.mo931a();
                Context context = this.f5078a.context;
                if (a == null || !a.f4152g) {
                    i = bc.tz;
                } else {
                    i = bc.tA;
                }
                Toast.makeText(context, i, 0).show();
            } else if (!(this.f5078a.bA == null || this.f5078a.bA.m14964a())) {
                this.f5078a.bA.m14963a(this.f5078a.context, null, false);
            }
        }
        this.f5078a.aW.mo813b();
        this.f5078a.m7400b(false);
    }

    public boolean m7284c() {
        this.f5078a.m7400b(true);
        return false;
    }

    cdn(cdr cdr) {
        this.f5078a = cdr;
    }
}
