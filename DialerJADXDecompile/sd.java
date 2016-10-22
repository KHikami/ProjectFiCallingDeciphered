import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
public final class sd {
    public final ArrayList a;
    mg b;
    boolean c;
    private long d;
    private Interpolator e;
    private final mh f;

    public sd() {
        this.d = -1;
        this.f = new se(this);
        this.a = new ArrayList();
    }

    public final sd a(lv lvVar) {
        if (!this.c) {
            this.a.add(lvVar);
        }
        return this;
    }

    public final void a() {
        if (!this.c) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                lv lvVar = (lv) it.next();
                if (this.d >= 0) {
                    lvVar.a(this.d);
                }
                if (this.e != null) {
                    lvVar.a(this.e);
                }
                if (this.b != null) {
                    lvVar.a(this.f);
                }
                lvVar.b();
            }
            this.c = true;
        }
    }

    public final void b() {
        if (this.c) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((lv) it.next()).a();
            }
            this.c = false;
        }
    }

    public final sd a(long j) {
        if (!this.c) {
            this.d = 250;
        }
        return this;
    }

    public final sd a(Interpolator interpolator) {
        if (!this.c) {
            this.e = interpolator;
        }
        return this;
    }

    public final sd a(mg mgVar) {
        if (!this.c) {
            this.b = mgVar;
        }
        return this;
    }
}
