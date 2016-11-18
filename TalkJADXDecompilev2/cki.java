package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.format.DateUtils;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class cki extends ady<aer> implements amm<cjs>, amn<cjs> {
    Context b;
    cgr c;
    final wt<cjs> d;
    int[] e;
    private final ams<Drawable> f;
    private final View g;
    private final View h;
    private final int i;
    private final Set<String> j = new HashSet();

    public /* synthetic */ int[] a(Object obj, int i, int i2) {
        return c();
    }

    cki(Context context, wt<cjs> wtVar, View view, amu amu) {
        this.h = view.findViewById(gwb.mF);
        this.g = view.findViewById(gwb.my);
        this.b = context;
        this.d = wtVar;
        ams h = amu.h();
        if (azl.v == null) {
            azl.v = (azl) ((azl) new azl().c(context.getApplicationContext())).c();
        }
        this.f = h.a(azl.v);
        a(true);
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.i = (point.x * 60) / 100;
        this.c = (cgr) jyn.a(context, cgr.class);
        a(this.c.l());
    }

    public aer a(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(ba.jh, viewGroup, false);
        inflate.getLayoutParams().width = this.i;
        if (this.e == null) {
            inflate.getViewTreeObserver().addOnPreDrawListener(new ckj(this, inflate));
        }
        return new ckm(inflate);
    }

    public void a(aer aer, int i) {
        if (this.h != null) {
            this.h.setVisibility(8);
        }
        cjs cjs = (cjs) this.d.a(i);
        if (this.j.contains(cjs.a)) {
            cjs.h = true;
            this.j.remove(cjs.a);
        }
        ckm ckm = (ckm) aer;
        ckm.b(false);
        ckm.p = cjs;
        this.f.a().a(azl.b(new baf(cjs.f, 0, 0))).a(cjs.e).a(ckm.r);
        if (cjs.b == cju.VIDEO) {
            ckm.v.setText(DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(cjs.i)));
            ckm.v.setVisibility(0);
        }
        ckm.q.a((View) ckm.q.getParent(), cjs, false);
        ckm.q.setOnClickListener(new ckk(this, i));
    }

    public long b(int i) {
        return ((long) ((cjs) this.d.a(i)).b.ordinal()) + (2 * ((cjs) this.d.a(i)).d);
    }

    public int a() {
        return this.d.a();
    }

    public int a(int i) {
        return 0;
    }

    public List<cjs> c(int i) {
        return Collections.singletonList((cjs) this.d.a(i));
    }

    private ams<Drawable> a(cjs cjs) {
        return this.f.a().a(azl.b(new baf(cjs.f, 0, 0))).a(cjs.e);
    }

    private int[] c() {
        return this.e;
    }

    synchronized mjq<cjs> b() {
        mjs mjs;
        mjs = new mjs();
        for (int i = 0; i < this.d.a(); i++) {
            cjs cjs = (cjs) this.d.a(i);
            if (this.j.contains(cjs.a)) {
                cjs.h = true;
                this.j.remove(cjs.a);
            }
            if (cjs.h) {
                mjs.c(cjs);
            }
        }
        return mjs.a();
    }

    int a(cju cju) {
        int i = 0;
        for (int i2 = 0; i2 < this.d.a(); i2++) {
            cjs cjs = (cjs) this.d.a(i2);
            if (cjs.h && cjs.b.equals(cju)) {
                i++;
            }
        }
        return i;
    }

    private <T extends bxn> void a(List<T> list) {
        for (T t : list) {
            this.j.add(t.b);
        }
        b(!list.isEmpty());
    }

    void b(boolean z) {
        if (z) {
            this.g.setVisibility(8);
        } else {
            this.g.setVisibility(0);
        }
    }
}
