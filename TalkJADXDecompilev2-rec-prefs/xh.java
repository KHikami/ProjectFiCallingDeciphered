package p000;

import android.view.animation.Interpolator;
import java.util.ArrayList;

public final class xh {
    final ArrayList<pn> f35672a = new ArrayList();
    py f35673b;
    boolean f35674c;
    private long f35675d = -1;
    private Interpolator f35676e;
    private final pz f35677f = new xi(this);

    public xh m41300a(pn pnVar) {
        if (!this.f35674c) {
            this.f35672a.add(pnVar);
        }
        return this;
    }

    public xh m41301a(pn pnVar, pn pnVar2) {
        this.f35672a.add(pnVar);
        pnVar2.m40278b(pnVar.m40271a());
        this.f35672a.add(pnVar2);
        return this;
    }

    public void m41303a() {
        if (!this.f35674c) {
            ArrayList arrayList = this.f35672a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                pn pnVar = (pn) obj;
                if (this.f35675d >= 0) {
                    pnVar.m40273a(this.f35675d);
                }
                if (this.f35676e != null) {
                    pnVar.m40274a(this.f35676e);
                }
                if (this.f35673b != null) {
                    pnVar.m40275a(this.f35677f);
                }
                pnVar.m40281c();
            }
            this.f35674c = true;
        }
    }

    public void m41304b() {
        if (this.f35674c) {
            ArrayList arrayList = this.f35672a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((pn) obj).m40279b();
            }
            this.f35674c = false;
        }
    }

    public xh m41298a(long j) {
        if (!this.f35674c) {
            this.f35675d = 250;
        }
        return this;
    }

    public xh m41299a(Interpolator interpolator) {
        if (!this.f35674c) {
            this.f35676e = interpolator;
        }
        return this;
    }

    public xh m41302a(py pyVar) {
        if (!this.f35674c) {
            this.f35673b = pyVar;
        }
        return this;
    }
}
