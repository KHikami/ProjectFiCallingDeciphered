import java.util.ArrayList;
import java.util.List;

public class jio implements kcg, kco, kcp, kcq {
    private final List<jiq> a;
    private boolean b;
    private boolean c;

    public jio(kbu kbu) {
        this.a = new ArrayList();
        kbu.a((kcq) this);
    }

    public synchronized ggn a(Runnable runnable) {
        return a(runnable, 0);
    }

    public synchronized ggn a(Runnable runnable, long j) {
        ggn ggn;
        if (this.c) {
            ggn = null;
        } else {
            ggn = new jiq(this, runnable, 0);
            this.a.add(ggn);
            if (this.b) {
                ggn.a();
            }
        }
        return ggn;
    }

    public synchronized void a(ggn ggn) {
        if (ggn != null) {
            ggn.d();
        }
    }

    public synchronized void z_() {
        this.b = true;
        for (int i = 0; i < this.a.size(); i++) {
            ((jiq) this.a.get(i)).a();
        }
    }

    public synchronized void A_() {
        this.b = false;
        for (int i = 0; i < this.a.size(); i++) {
            ((jiq) this.a.get(i)).b();
        }
    }

    public synchronized void o_() {
        this.c = true;
        for (int i = 0; i < this.a.size(); i++) {
            ((jiq) this.a.get(i)).d();
        }
        this.a.clear();
    }

    synchronized void a(jiq jiq) {
        this.a.remove(jiq);
    }

    synchronized void b(jiq jiq) {
        this.a.remove(jiq);
    }
}
