import android.content.Context;
import android.widget.Toast;

class cdn {
    final /* synthetic */ cdr a;

    public void a(CharSequence charSequence) {
        String a = blo.a(this.a.av.g(), 3);
        boolean b = this.a.f.b();
        this.a.f.a();
        Runnable cfn = new cfn(this, charSequence, a, b);
        if (this.a.G()) {
            cfn.run();
            return;
        }
        this.a.aT.add(cfn);
        cdr cdr = this.a;
        if (cdr.G()) {
            for (Runnable a2 : cdr.aT) {
                gwb.a(a2);
            }
            cdr.aT.clear();
        }
        dvm b2 = ba.c().b(a);
        bpd a3 = this.a.i.a();
        if (a3 == null) {
            ba.a(this.a.av.g(), glj.b(), 10, b2.a(213));
        } else {
            b2.a(a3.a);
        }
        if (this.a.bA == null) {
            ba.a(this.a.av.g(), glj.b(), 10, b2.a(215));
        }
        Toast.makeText(this.a.context, bc.kc, 0).show();
        this.a.c("Queueing message");
    }

    public void a(int i) {
        this.a.a(new cfo(this, i));
    }

    public void a() {
        this.a.I();
    }

    public void b() {
        if (!this.a.E()) {
            if (this.a.br) {
                int i;
                bpd a = this.a.i.a();
                Context context = this.a.context;
                if (a == null || !a.g) {
                    i = bc.tz;
                } else {
                    i = bc.tA;
                }
                Toast.makeText(context, i, 0).show();
            } else if (!(this.a.bA == null || this.a.bA.a())) {
                this.a.bA.a(this.a.context, null, false);
            }
        }
        this.a.aW.b();
        this.a.b(false);
    }

    public boolean c() {
        this.a.b(true);
        return false;
    }

    cdn(cdr cdr) {
        this.a = cdr;
    }
}
