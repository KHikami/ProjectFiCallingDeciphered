package defpackage;

import android.support.design.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;

public class oto implements bb {
    public static final int c = 2130772046;
    public static final int d = 2130772047;
    public final WeakReference<a> a;
    public int b;
    public final /* synthetic */ CoordinatorLayout e;
    public final /* synthetic */ s f;
    public final /* synthetic */ t g;
    private int h;
    private otu<Object> i;

    private oto() {
        this.h = 6;
        this.i = new otu();
    }

    public int a() {
        return this.h;
    }

    public boolean a(a aVar) {
        return aVar != null && this.a.get() == aVar;
    }

    public oto(t tVar, CoordinatorLayout coordinatorLayout, s sVar) {
        this.g = tVar;
        this.e = coordinatorLayout;
        this.f = sVar;
    }

    public void a(az azVar) {
        this.g.a_(this.e, this.f, azVar.c());
    }
}
