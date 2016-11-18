package p000;

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
    final List<aer> f4489a = new ArrayList();
    final ky<aer, buk> f4490b = new ky();
    final List<aer> f4491c = new ArrayList();
    private final int f4492d;
    private final btu f4493e;
    private final List<aer> f4494f = new ArrayList();
    private final Map<aer, buk> f4495g = new ky();
    private final List<aer> f4496i = new ArrayList();
    private Long f4497j;
    private RecyclerView f4498k;

    bue(Context context) {
        this.f4492d = context.getResources().getInteger(gwb.kq);
        m318b((long) context.getResources().getInteger(gwb.kp));
        m312a((long) context.getResources().getInteger(gwb.kp));
        this.f4493e = (btu) jyn.m25433b(context, btu.class);
    }

    void m6700a(RecyclerView recyclerView) {
        this.f4498k = recyclerView;
    }

    void m6709c(long j) {
        m6697d(j);
    }

    private void m6697d(long j) {
        if (this.f4497j == null) {
            this.f4497j = Long.valueOf(j);
        }
    }

    public boolean mo27g(aer aer) {
        return true;
    }

    public void mo28a() {
        if (!this.f4494f.isEmpty()) {
            new Object[1][0] = Integer.valueOf(this.f4494f.size());
            for (aer aer : this.f4494f) {
                this.f4489a.add(aer);
                View view = aer.f438a;
                view.animate().alpha(1.0f).translationY(0.0f).setInterpolator(gwb.aw()).setDuration(m326f()).setListener(new buf(this, aer, view)).start();
            }
            this.f4494f.clear();
        }
        if (!this.f4496i.isEmpty()) {
            new Object[1][0] = Integer.valueOf(this.f4496i.size());
            for (aer aer2 : this.f4496i) {
                this.f4491c.add(aer2);
                view = aer2.f438a;
                view.animate().translationX(0.0f).translationY(0.0f).setInterpolator(gwb.ay()).setDuration(m325e()).setListener(new bug(this, aer2, view)).start();
            }
            this.f4496i.clear();
        }
        if (!this.f4495g.isEmpty()) {
            new Object[1][0] = Integer.valueOf(this.f4495g.size());
            for (aer aer22 : this.f4495g.keySet()) {
                int i;
                int i2;
                ViewPropertyAnimator duration;
                buk buk = (buk) this.f4495g.get(aer22);
                ba.m4577a(aer22 instanceof bxi);
                this.f4490b.put(aer22, buk);
                ViewGroup v = ((bxi) aer22).mo710v();
                int childCount = buk.f4514b.isEmpty() ? 0 : v.getChildCount();
                View view2 = aer22.f438a;
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
                    duration = view2.animate().translationX(0.0f).translationY(0.0f).setInterpolator(gwb.ay()).setDuration(m325e());
                    bui.getClass();
                    duration.setListener(new buj(bui, view2)).start();
                }
                for (i2 = 0; i2 < childCount; i2++) {
                    TimeInterpolator ax;
                    View childAt = v.getChildAt(i2);
                    bul bul = (bul) buk.f4514b.get(childAt);
                    ViewPropertyAnimator alpha = childAt.animate().translationX(0.0f).translationY(0.0f).alpha(bul.f4516b);
                    switch (buh.f4505a[bul.f4515a - 1]) {
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
                    duration = alpha.setInterpolator(ax).setDuration((long) this.f4492d);
                    bui.getClass();
                    duration.setListener(new buj(bui, childAt)).start();
                }
            }
            this.f4495g.clear();
        }
    }

    public boolean mo34b(aer aer) {
        if (aer instanceof bwd) {
            int i;
            bwd bwd = (bwd) aer;
            m6698h(bwd);
            View view = bwd.a;
            int i2 = this.f4498k.m3072c().m489i(view);
            int g = this.f4498k.m3072c().m482g(view);
            if (bwd.m6812x() <= gwb.m1524a(this.f4497j, 0)) {
                i = 1;
            } else {
                boolean z = false;
            }
            if (i != 0) {
                view.setTranslationY((float) ((this.f4498k.getTop() - g) - i2));
            } else {
                view.setTranslationY((float) (this.f4498k.getHeight() - i2));
            }
            m6697d(bwd.m6812x());
            view.setAlpha(0.0f);
            this.f4494f.add(bwd);
            new Object[1][0] = Integer.valueOf(bwd.m865e());
            return true;
        }
        m327f(aer);
        new Object[1][0] = Integer.valueOf(aer.m865e());
        return false;
    }

    public boolean mo30a(aer aer, int i, int i2, int i3, int i4) {
        View view = aer.f438a;
        float translationX = ((float) i3) - (((float) i) + view.getTranslationX());
        float translationY = ((float) i4) - (((float) i2) + view.getTranslationY());
        if (translationX == 0.0f && translationY == 0.0f) {
            m327f(aer);
            new Object[1][0] = Integer.valueOf(aer.m865e());
            return false;
        }
        m6698h(aer);
        view.setTranslationX(-translationX);
        view.setTranslationY(-translationY);
        this.f4496i.add(aer);
        new Object[1][0] = Integer.valueOf(aer.m865e());
        return true;
    }

    public boolean mo31a(aer aer, aer aer2, int i, int i2, int i3, int i4) {
        throw new UnsupportedOperationException();
    }

    public boolean mo24a(aer aer, aer aer2, aed aed, aed aed2) {
        if (aer != aer2) {
            glk.m17982e("Babel_MsgListAnim", "Unexpected that these don't equal: old %s new %s", aer, aer2);
            m6698h(aer);
            m327f(aer);
        }
        if (aer2 instanceof bxi) {
            Object obj;
            View view = aer2.f438a;
            Object obj2 = null;
            buk buk = new buk(view);
            float translationY = ((float) aed.f383b) + view.getTranslationY();
            float translationX = ((float) aed2.f382a) - (((float) aed.f382a) + view.getTranslationX());
            translationY = ((float) aed2.f383b) - translationY;
            if (!(translationX == 0.0f && translationY == 0.0f)) {
                obj2 = 1;
                m6698h(aer2);
                view.setTranslationX(-translationX);
                view.setTranslationY(-translationY);
            }
            Object obj3 = obj2;
            bun bun = (bun) aed;
            bun bun2 = (bun) aed2;
            if (bun.f4522f) {
                obj = obj3;
            } else {
                ViewGroup v = ((bxi) aer2).mo710v();
                ky kyVar = new ky(bun.f4521e);
                kyVar.m28021a(bun2.f4521e.keySet());
                for (View view2 : kyVar.keySet()) {
                    new Object[1][0] = view2;
                    v.addView(view2);
                }
                if (v.getChildCount() > 0) {
                    obj3 = 1;
                    m6698h(aer2);
                }
                obj = obj3;
                for (int i = 0; i < v.getChildCount(); i++) {
                    OverlayedAvatarView overlayedAvatarView = (OverlayedAvatarView) v.getChildAt(i);
                    buo buo = (buo) bun.f4521e.get(overlayedAvatarView);
                    buo buo2 = (buo) bun2.f4521e.get(overlayedAvatarView);
                    if (buo2 == null) {
                        float f;
                        if (overlayedAvatarView.m9556d() || overlayedAvatarView.m9558e()) {
                            overlayedAvatarView.setLeft(buo.f4525c);
                            overlayedAvatarView.setRight(buo.f4526d);
                            int i2 = buo.f4524b - buo.f4523a;
                            overlayedAvatarView.setTop(buo.f4523a + i2);
                            overlayedAvatarView.setBottom(i2 + buo.f4524b);
                            overlayedAvatarView.setY((float) buo.f4523a);
                            f = 1.0f;
                        } else {
                            overlayedAvatarView.setLeft(buo.f4525c);
                            overlayedAvatarView.setRight(buo.f4526d);
                            overlayedAvatarView.setTop(buo.f4523a);
                            overlayedAvatarView.setBottom(buo.f4524b);
                            overlayedAvatarView.setAlpha(1.0f);
                            f = 0.0f;
                        }
                        buk.f4514b.put(overlayedAvatarView, new bul(bum.f4517a, f));
                    } else if (buo == null) {
                        if (overlayedAvatarView.m9556d() || overlayedAvatarView.m9558e()) {
                            overlayedAvatarView.setTranslationY((float) (buo2.f4524b - buo2.f4523a));
                        } else {
                            overlayedAvatarView.setAlpha(0.0f);
                        }
                        buk.f4514b.put(overlayedAvatarView, new bul(bum.f4518b, 1.0f));
                    } else {
                        overlayedAvatarView.setX((float) buo.f4525c);
                        buk.f4514b.put(overlayedAvatarView, new bul(bum.f4519c, 1.0f));
                    }
                    Object[] objArr = new Object[]{overlayedAvatarView, buk.f4514b.get(overlayedAvatarView)};
                }
            }
            if (obj != null) {
                this.f4495g.put(aer2, buk);
                new Object[1][0] = Integer.valueOf(aer2.m865e());
                return true;
            }
        }
        new Object[1][0] = Integer.valueOf(aer2.m865e());
        m327f(aer2);
        return false;
    }

    public void mo36d() {
        int size;
        for (size = this.f4489a.size() - 1; size >= 0; size--) {
            Object[] objArr = new Object[]{Integer.valueOf(((aer) this.f4489a.get(size)).m865e()), Integer.valueOf(size)};
            ((aer) this.f4489a.get(size)).f438a.animate().cancel();
            this.f4489a.size();
        }
        this.f4489a.clear();
        for (aer aer : this.f4494f) {
            new Object[1][0] = Integer.valueOf(aer.m865e());
            aer.f438a.setTranslationY(0.0f);
            aer.f438a.setAlpha(1.0f);
            m327f(aer);
        }
        this.f4494f.clear();
        for (size = this.f4491c.size() - 1; size >= 0; size--) {
            objArr = new Object[]{Integer.valueOf(((aer) this.f4491c.get(size)).m865e()), Integer.valueOf(size)};
            ((aer) this.f4491c.get(size)).f438a.animate().cancel();
            this.f4491c.size();
        }
        this.f4491c.clear();
        for (aer aer2 : this.f4496i) {
            new Object[1][0] = Integer.valueOf(aer2.m865e());
            aer2.f438a.setTranslationX(0.0f);
            aer2.f438a.setTranslationY(0.0f);
            m327f(aer2);
        }
        this.f4496i.clear();
        for (size = this.f4490b.size() - 1; size >= 0; size--) {
            objArr = new Object[]{Integer.valueOf(((aer) this.f4490b.m28017b(size)).m865e()), Integer.valueOf(size)};
            ((buk) this.f4490b.m28018c(size)).m6716b();
            this.f4490b.size();
        }
        this.f4490b.clear();
        for (aer aer22 : this.f4495g.keySet()) {
            new Object[1][0] = Integer.valueOf(aer22.m865e());
            ((buk) this.f4495g.get(aer22)).m6714a();
            m327f(aer22);
        }
        this.f4495g.clear();
        m331i();
    }

    public void mo35c(aer aer) {
        m6698h(aer);
    }

    private void m6698h(aer aer) {
        if (this.f4489a.contains(aer)) {
            new Object[1][0] = Integer.valueOf(aer.m865e());
            aer.f438a.animate().cancel();
            this.f4489a.remove(aer);
        }
        if (this.f4494f.remove(aer)) {
            new Object[1][0] = Integer.valueOf(aer.m865e());
            aer.f438a.setTranslationY(0.0f);
            aer.f438a.setAlpha(1.0f);
            m327f(aer);
        }
        if (this.f4496i.remove(aer)) {
            new Object[1][0] = Integer.valueOf(aer.m865e());
            aer.f438a.setTranslationY(0.0f);
            aer.f438a.setAlpha(1.0f);
            m327f(aer);
        }
        if (this.f4491c.contains(aer)) {
            new Object[1][0] = Integer.valueOf(aer.m865e());
            aer.f438a.animate().cancel();
            this.f4491c.remove(aer);
        }
        buk buk = (buk) this.f4495g.remove(aer);
        if (buk != null) {
            new Object[1][0] = Integer.valueOf(aer.m865e());
            buk.m6714a();
            m327f(aer);
        }
        buk = (buk) this.f4490b.get(aer);
        if (buk != null) {
            new Object[1][0] = Integer.valueOf(aer.m865e());
            buk.m6716b();
            this.f4490b.remove(aer);
        }
        m6708c();
    }

    public boolean mo33b() {
        return (this.f4494f.isEmpty() && this.f4489a.isEmpty() && this.f4496i.isEmpty() && this.f4491c.isEmpty() && this.f4495g.isEmpty() && this.f4490b.isEmpty()) ? false : true;
    }

    void m6708c() {
        if (!mo33b()) {
            m331i();
        }
    }

    public aed mo743b(aer aer, List<Object> list) {
        boolean z;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (gwb.m2061b((Boolean) it.next())) {
                z = true;
                break;
            }
        }
        z = false;
        aed bun = new bun(z);
        bun.mo745a(aer);
        return bun;
    }

    public aed mo744d(aer aer) {
        aed bun = new bun(false);
        bun.mo745a(aer);
        return bun;
    }

    public boolean mo29a(aer aer) {
        m327f(aer);
        return false;
    }
}
