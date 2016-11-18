package defpackage;

import android.view.animation.Interpolator;
import java.util.ArrayList;

public final class xh {
    final ArrayList<pn> a = new ArrayList();
    py b;
    boolean c;
    private long d = -1;
    private Interpolator e;
    private final pz f = new xi(this);

    public xh a(pn pnVar) {
        if (!this.c) {
            this.a.add(pnVar);
        }
        return this;
    }

    public xh a(pn pnVar, pn pnVar2) {
        this.a.add(pnVar);
        pnVar2.b(pnVar.a());
        this.a.add(pnVar2);
        return this;
    }

    public void a() {
        if (!this.c) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                pn pnVar = (pn) obj;
                if (this.d >= 0) {
                    pnVar.a(this.d);
                }
                if (this.e != null) {
                    pnVar.a(this.e);
                }
                if (this.b != null) {
                    pnVar.a(this.f);
                }
                pnVar.c();
            }
            this.c = true;
        }
    }

    public void b() {
        if (this.c) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((pn) obj).b();
            }
            this.c = false;
        }
    }

    public xh a(long j) {
        if (!this.c) {
            this.d = 250;
        }
        return this;
    }

    public xh a(Interpolator interpolator) {
        if (!this.c) {
            this.e = interpolator;
        }
        return this;
    }

    public xh a(py pyVar) {
        if (!this.c) {
            this.b = pyVar;
        }
        return this;
    }
}
