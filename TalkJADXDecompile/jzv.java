import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class jzv implements kbl, kco, kcp, kcq {
    private List<a> a;
    private boolean b;
    private boolean c;
    private boolean d;

    jzv(kbu kbu) {
        this.a = new ArrayList();
        this.d = true;
        kbu.a((kcq) this);
    }

    jzv(kbu kbu, byte b) {
        this.a = new ArrayList();
        this.d = true;
        kbu.a((kcq) this);
    }

    public void a(boolean z) {
        this.d = z;
        b();
    }

    public void z_() {
        this.b = true;
        b();
    }

    public void A_() {
        this.b = false;
        b();
    }

    private void b() {
        boolean z = this.b && this.d;
        if (z != this.c) {
            this.c = z;
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
