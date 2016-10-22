import android.os.SystemClock;

/* compiled from: PG */
public abstract class cva {
    final cxa a;
    final cve b;
    final boolean c;
    final cwj d;

    protected abstract void b(String str, dln dln);

    public void a(dln dln) {
        a(null, dln);
    }

    public void a(String str, dln dln) {
        this.b.a(str, dln);
        cxa cxa = this.a;
        synchronized (cxa.a) {
            cxa.b++;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - cxa.c > 1000) {
                cxa.b = 0;
                cxa.c = elapsedRealtime;
            }
        }
    }

    public boolean a() {
        return (this.d.c || !this.c || this.a.a()) ? false : true;
    }

    cva(cuy cuy, int i) {
        this.d = cwj.a;
        this.a = new cxa(cuy.b());
        if (cvf.a == i) {
            this.b = new cvd(this);
        } else {
            this.b = new cvb(this);
        }
        this.c = cuy.a();
    }
}
