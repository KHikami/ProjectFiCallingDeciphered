package p000;

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
    Context f5498b;
    cgr f5499c;
    final wt<cjs> f5500d;
    int[] f5501e;
    private final ams<Drawable> f5502f;
    private final View f5503g;
    private final View f5504h;
    private final int f5505i;
    private final Set<String> f5506j = new HashSet();

    public /* synthetic */ int[] mo706a(Object obj, int i, int i2) {
        return m7847c();
    }

    cki(Context context, wt<cjs> wtVar, View view, amu amu) {
        this.f5504h = view.findViewById(gwb.mF);
        this.f5503g = view.findViewById(gwb.my);
        this.f5498b = context;
        this.f5500d = wtVar;
        ams h = amu.m2982h();
        if (azl.f2610v == null) {
            azl.f2610v = (azl) ((azl) new azl().m4438c(context.getApplicationContext())).m4437c();
        }
        this.f5502f = h.m2964a(azl.f2610v);
        m743a(true);
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.f5505i = (point.x * 60) / 100;
        this.f5499c = (cgr) jyn.m25426a(context, cgr.class);
        m7846a(this.f5499c.mo955l());
    }

    public aer mo738a(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(ba.jh, viewGroup, false);
        inflate.getLayoutParams().width = this.f5505i;
        if (this.f5501e == null) {
            inflate.getViewTreeObserver().addOnPreDrawListener(new ckj(this, inflate));
        }
        return new ckm(inflate);
    }

    public void mo740a(aer aer, int i) {
        if (this.f5504h != null) {
            this.f5504h.setVisibility(8);
        }
        cjs cjs = (cjs) this.f5500d.a(i);
        if (this.f5506j.contains(cjs.f5443a)) {
            cjs.f5450h = true;
            this.f5506j.remove(cjs.f5443a);
        }
        ckm ckm = (ckm) aer;
        ckm.m7859b(false);
        ckm.f5514p = cjs;
        this.f5502f.m2961a().m2964a(azl.m4456b(new baf(cjs.f5448f, 0, 0))).m2963a(cjs.f5447e).m2968a(ckm.f5516r);
        if (cjs.f5444b == cju.VIDEO) {
            ckm.f5520v.setText(DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(cjs.f5451i)));
            ckm.f5520v.setVisibility(0);
        }
        ckm.f5515q.m8356a((View) ckm.f5515q.getParent(), cjs, false);
        ckm.f5515q.setOnClickListener(new ckk(this, i));
    }

    public long mo741b(int i) {
        return ((long) ((cjs) this.f5500d.a(i)).f5444b.ordinal()) + (2 * ((cjs) this.f5500d.a(i)).f5446d);
    }

    public int mo736a() {
        return this.f5500d.a();
    }

    public int mo737a(int i) {
        return 0;
    }

    public List<cjs> mo707c(int i) {
        return Collections.singletonList((cjs) this.f5500d.a(i));
    }

    private ams<Drawable> m7845a(cjs cjs) {
        return this.f5502f.m2961a().m2964a(azl.m4456b(new baf(cjs.f5448f, 0, 0))).m2963a(cjs.f5447e);
    }

    private int[] m7847c() {
        return this.f5501e;
    }

    synchronized mjq<cjs> m7856b() {
        mjs mjs;
        mjs = new mjs();
        for (int i = 0; i < this.f5500d.a(); i++) {
            cjs cjs = (cjs) this.f5500d.a(i);
            if (this.f5506j.contains(cjs.f5443a)) {
                cjs.f5450h = true;
                this.f5506j.remove(cjs.f5443a);
            }
            if (cjs.f5450h) {
                mjs.m32366c(cjs);
            }
        }
        return mjs.m32364a();
    }

    int m7850a(cju cju) {
        int i = 0;
        for (int i2 = 0; i2 < this.f5500d.a(); i2++) {
            cjs cjs = (cjs) this.f5500d.a(i2);
            if (cjs.f5450h && cjs.f5444b.equals(cju)) {
                i++;
            }
        }
        return i;
    }

    private <T extends bxn> void m7846a(List<T> list) {
        for (T t : list) {
            this.f5506j.add(t.f4740b);
        }
        m7857b(!list.isEmpty());
    }

    void m7857b(boolean z) {
        if (z) {
            this.f5503g.setVisibility(8);
        } else {
            this.f5503g.setVisibility(0);
        }
    }
}
