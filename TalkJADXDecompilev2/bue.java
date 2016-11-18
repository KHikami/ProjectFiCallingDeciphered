package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.google.android.apps.hangouts.views.OverlayedAvatarView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class bue extends afi {
    final List<aer> a = new ArrayList();
    final ky<aer, buk> b = new ky();
    final List<aer> c = new ArrayList();
    private final int d;
    private final btu e;
    private final List<aer> f = new ArrayList();
    private final Map<aer, buk> g = new ky();
    private final List<aer> i = new ArrayList();
    private Long j;
    private RecyclerView k;

    bue(Context context) {
        this.d = context.getResources().getInteger(gwb.kq);
        b((long) context.getResources().getInteger(gwb.kp));
        a((long) context.getResources().getInteger(gwb.kp));
        this.e = (btu) jyn.b(context, btu.class);
    }

    void a(RecyclerView recyclerView) {
        this.k = recyclerView;
    }

    void c(long j) {
        d(j);
    }

    private void d(long j) {
        if (this.j == null) {
            this.j = Long.valueOf(j);
        }
    }

    public boolean g(aer aer) {
        return true;
    }

    public void a() {
        if (!this.f.isEmpty()) {
            new Object[1][0] = Integer.valueOf(this.f.size());
            for (aer aer : this.f) {
                this.a.add(aer);
                View view = aer.a;
                view.animate().alpha(1.0f).translationY(0.0f).setInterpolator(gwb.aw()).setDuration(f()).setListener(new buf(this, aer, view)).start();
            }
            this.f.clear();
        }
        if (!this.i.isEmpty()) {
            new Object[1][0] = Integer.valueOf(this.i.size());
            for (aer aer2 : this.i) {
                this.c.add(aer2);
                view = aer2.a;
                view.animate().translationX(0.0f).translationY(0.0f).setInterpolator(gwb.ay()).setDuration(e()).setListener(new bug(this, aer2, view)).start();
            }
            this.i.clear();
        }
        if (!this.g.isEmpty()) {
            new Object[1][0] = Integer.valueOf(this.g.size());
            for (aer aer22 : this.g.keySet()) {
                int i;
                int i2;
                ViewPropertyAnimator duration;
                buk buk = (buk) this.g.get(aer22);
                ba.a(aer22 instanceof bxi);
                this.b.put(aer22, buk);
                ViewGroup v = ((bxi) aer22).v();
                int childCount = buk.b.isEmpty() ? 0 : v.getChildCount();
                View view2 = aer22.a;
                if (view2.getTranslationX() == 0.0f && view2.getTranslationY() == 0.0f) {
                    i = 0;
                } else {
                    i = 1;
                }
                if (i != 0) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                bui bui = new bui(this, aer22, buk, i2 + childCount);
                if (i != 0) {
                    duration = view2.animate().translationX(0.0f).translationY(0.0f).setInterpolator(gwb.ay()).setDuration(e());
                    bui.getClass();
                    duration.setListener(new buj(bui, view2)).start();
                }
                for (i2 = 0; i2 < childCount; i2++) {
                    TimeInterpolator ax;
                    View childAt = v.getChildAt(i2);
                    bul bul = (bul) buk.b.get(childAt);
                    ViewPropertyAnimator alpha = childAt.animate().translationX(0.0f).translationY(0.0f).alpha(bul.b);
                    switch (buh.a[bul.a - 1]) {
                        case 1:
                            ax = gwb.ax();
                            break;
                        case 2:
                            ax = gwb.aw();
                            break;
                        default:
                            ax = gwb.ay();
                            break;
                    }
                    duration = alpha.setInterpolator(ax).setDuration((long) this.d);
                    bui.getClass();
                    duration.setListener(new buj(bui, childAt)).start();
                }
            }
            this.g.clear();
        }
    }

    public boolean b(aer aer) {
        if (aer instanceof bwd) {
            int i;
            bwd bwd = (bwd) aer;
            h(bwd);
            View view = bwd.a;
            int i2 = this.k.c().i(view);
            int g = this.k.c().g(view);
            if (bwd.x() <= gwb.a(this.j, 0)) {
                i = 1;
            } else {
                boolean z = false;
            }
            if (i != 0) {
                view.setTranslationY((float) ((this.k.getTop() - g) - i2));
            } else {
                view.setTranslationY((float) (this.k.getHeight() - i2));
            }
            d(bwd.x());
            view.setAlpha(0.0f);
            this.f.add(bwd);
            new Object[1][0] = Integer.valueOf(bwd.e());
            return true;
        }
        f(aer);
        new Object[1][0] = Integer.valueOf(aer.e());
        return false;
    }

    public boolean a(aer aer, int i, int i2, int i3, int i4) {
        View view = aer.a;
        float translationX = ((float) i3) - (((float) i) + view.getTranslationX());
        float translationY = ((float) i4) - (((float) i2) + view.getTranslationY());
        if (translationX == 0.0f && translationY == 0.0f) {
            f(aer);
            new Object[1][0] = Integer.valueOf(aer.e());
            return false;
        }
        h(aer);
        view.setTranslationX(-translationX);
        view.setTranslationY(-translationY);
        this.i.add(aer);
        new Object[1][0] = Integer.valueOf(aer.e());
        return true;
    }

    public boolean a(aer aer, aer aer2, int i, int i2, int i3, int i4) {
        throw new UnsupportedOperationException();
    }

    public boolean a(aer aer, aer aer2, aed aed, aed aed2) {
        if (aer != aer2) {
            glk.e("Babel_MsgListAnim", "Unexpected that these don't equal: old %s new %s", aer, aer2);
            h(aer);
            f(aer);
        }
        if (aer2 instanceof bxi) {
            Object obj;
            View view = aer2.a;
            Object obj2 = null;
            buk buk = new buk(view);
            float translationY = ((float) aed.b) + view.getTranslationY();
            float translationX = ((float) aed2.a) - (((float) aed.a) + view.getTranslationX());
            translationY = ((float) aed2.b) - translationY;
            if (!(translationX == 0.0f && translationY == 0.0f)) {
                obj2 = 1;
                h(aer2);
                view.setTranslationX(-translationX);
                view.setTranslationY(-translationY);
            }
            Object obj3 = obj2;
            bun bun = (bun) aed;
            bun bun2 = (bun) aed2;
            if (bun.f) {
                obj = obj3;
            } else {
                ViewGroup v = ((bxi) aer2).v();
                ky kyVar = new ky(bun.e);
                kyVar.a(bun2.e.keySet());
                for (View view2 : kyVar.keySet()) {
                    new Object[1][0] = view2;
                    v.addView(view2);
                }
                if (v.getChildCount() > 0) {
                    obj3 = 1;
                    h(aer2);
                }
                obj = obj3;
                for (int i = 0; i < v.getChildCount(); i++) {
                    OverlayedAvatarView overlayedAvatarView = (OverlayedAvatarView) v.getChildAt(i);
                    buo buo = (buo) bun.e.get(overlayedAvatarView);
                    buo buo2 = (buo) bun2.e.get(overlayedAvatarView);
                    if (buo2 == null) {
                        float f;
                        if (overlayedAvatarView.d() || overlayedAvatarView.e()) {
                            overlayedAvatarView.setLeft(buo.c);
                            overlayedAvatarView.setRight(buo.d);
                            int i2 = buo.b - buo.a;
                            overlayedAvatarView.setTop(buo.a + i2);
                            overlayedAvatarView.setBottom(i2 + buo.b);
                            overlayedAvatarView.setY((float) buo.a);
                            f = 1.0f;
                        } else {
                            overlayedAvatarView.setLeft(buo.c);
                            overlayedAvatarView.setRight(buo.d);
                            overlayedAvatarView.setTop(buo.a);
                            overlayedAvatarView.setBottom(buo.b);
                            overlayedAvatarView.setAlpha(1.0f);
                            f = 0.0f;
                        }
                        buk.b.put(overlayedAvatarView, new bul(bum.a, f));
                    } else if (buo == null) {
                        if (overlayedAvatarView.d() || overlayedAvatarView.e()) {
                            overlayedAvatarView.setTranslationY((float) (buo2.b - buo2.a));
                        } else {
                            overlayedAvatarView.setAlpha(0.0f);
                        }
                        buk.b.put(overlayedAvatarView, new bul(bum.b, 1.0f));
                    } else {
                        overlayedAvatarView.setX((float) buo.c);
                        buk.b.put(overlayedAvatarView, new bul(bum.c, 1.0f));
                    }
                    Object[] objArr = new Object[]{overlayedAvatarView, buk.b.get(overlayedAvatarView)};
                }
            }
            if (obj != null) {
                this.g.put(aer2, buk);
                new Object[1][0] = Integer.valueOf(aer2.e());
                return true;
            }
        }
        new Object[1][0] = Integer.valueOf(aer2.e());
        f(aer2);
        return false;
    }

    public void d() {
        int size;
        for (size = this.a.size() - 1; size >= 0; size--) {
            Object[] objArr = new Object[]{Integer.valueOf(((aer) this.a.get(size)).e()), Integer.valueOf(size)};
            ((aer) this.a.get(size)).a.animate().cancel();
            this.a.size();
        }
        this.a.clear();
        for (aer aer : this.f) {
            new Object[1][0] = Integer.valueOf(aer.e());
            aer.a.setTranslationY(0.0f);
            aer.a.setAlpha(1.0f);
            f(aer);
        }
        this.f.clear();
        for (size = this.c.size() - 1; size >= 0; size--) {
            objArr = new Object[]{Integer.valueOf(((aer) this.c.get(size)).e()), Integer.valueOf(size)};
            ((aer) this.c.get(size)).a.animate().cancel();
            this.c.size();
        }
        this.c.clear();
        for (aer aer2 : this.i) {
            new Object[1][0] = Integer.valueOf(aer2.e());
            aer2.a.setTranslationX(0.0f);
            aer2.a.setTranslationY(0.0f);
            f(aer2);
        }
        this.i.clear();
        for (size = this.b.size() - 1; size >= 0; size--) {
            objArr = new Object[]{Integer.valueOf(((aer) this.b.b(size)).e()), Integer.valueOf(size)};
            ((buk) this.b.c(size)).b();
            this.b.size();
        }
        this.b.clear();
        for (aer aer22 : this.g.keySet()) {
            new Object[1][0] = Integer.valueOf(aer22.e());
            ((buk) this.g.get(aer22)).a();
            f(aer22);
        }
        this.g.clear();
        i();
    }

    public void c(aer aer) {
        h(aer);
    }

    private void h(aer aer) {
        if (this.a.contains(aer)) {
            new Object[1][0] = Integer.valueOf(aer.e());
            aer.a.animate().cancel();
            this.a.remove(aer);
        }
        if (this.f.remove(aer)) {
            new Object[1][0] = Integer.valueOf(aer.e());
            aer.a.setTranslationY(0.0f);
            aer.a.setAlpha(1.0f);
            f(aer);
        }
        if (this.i.remove(aer)) {
            new Object[1][0] = Integer.valueOf(aer.e());
            aer.a.setTranslationY(0.0f);
            aer.a.setAlpha(1.0f);
            f(aer);
        }
        if (this.c.contains(aer)) {
            new Object[1][0] = Integer.valueOf(aer.e());
            aer.a.animate().cancel();
            this.c.remove(aer);
        }
        buk buk = (buk) this.g.remove(aer);
        if (buk != null) {
            new Object[1][0] = Integer.valueOf(aer.e());
            buk.a();
            f(aer);
        }
        buk = (buk) this.b.get(aer);
        if (buk != null) {
            new Object[1][0] = Integer.valueOf(aer.e());
            buk.b();
            this.b.remove(aer);
        }
        c();
    }

    public boolean b() {
        return (this.f.isEmpty() && this.a.isEmpty() && this.i.isEmpty() && this.c.isEmpty() && this.g.isEmpty() && this.b.isEmpty()) ? false : true;
    }

    void c() {
        if (!b()) {
            i();
        }
    }

    public aed b(aer aer, List<Object> list) {
        boolean z;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (gwb.b((Boolean) it.next())) {
                z = true;
                break;
            }
        }
        z = false;
        aed bun = new bun(z);
        bun.a(aer);
        return bun;
    }

    public aed d(aer aer) {
        aed bun = new bun(false);
        bun.a(aer);
        return bun;
    }

    public boolean a(aer aer) {
        f(aer);
        return false;
    }
}
