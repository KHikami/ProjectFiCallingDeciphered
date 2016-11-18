package p000;

import android.support.design.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;

public class oto implements bb {
    public static final int f34261c = 2130772046;
    public static final int f34262d = 2130772047;
    public final WeakReference<a> f34263a;
    public int f34264b;
    public final /* synthetic */ CoordinatorLayout f34265e;
    public final /* synthetic */ s f34266f;
    public final /* synthetic */ C0259t f34267g;
    private int f34268h;
    private otu<Object> f34269i;

    private oto() {
        this.f34268h = 6;
        this.f34269i = new otu();
    }

    public int m39705a() {
        return this.f34268h;
    }

    public boolean m39707a(a aVar) {
        return aVar != null && this.f34263a.get() == aVar;
    }

    public oto(C0259t c0259t, CoordinatorLayout coordinatorLayout, s sVar) {
        this.f34267g = c0259t;
        this.f34265e = coordinatorLayout;
        this.f34266f = sVar;
    }

    public void m39706a(az azVar) {
        this.f34267g.a_(this.f34265e, this.f34266f, azVar.c());
    }
}
