package p000;

import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.List;

public class C0259t extends ai<s> {
    int f35121a;
    private boolean f35122c;
    private boolean f35123d;
    private az f35124e;
    private int f35125f = -1;
    private boolean f35126g;
    private float f35127h;
    private WeakReference<View> f35128i;
    private C0260u f35129j;

    /* synthetic */ int m40692a(View view) {
        return m40718c((s) view);
    }

    public /* bridge */ /* synthetic */ void m40696a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4) {
        m40699a(coordinatorLayout, (s) view, i4);
    }

    public /* synthetic */ boolean m40704a(CoordinatorLayout coordinatorLayout, View view, int i) {
        return m40717b(coordinatorLayout, (s) view, i);
    }

    public /* bridge */ /* synthetic */ int m40712b() {
        return super.b();
    }

    /* synthetic */ boolean m40719c(View view) {
        return m40711a((s) view);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m40710a(CoordinatorLayout coordinatorLayout, s sVar, View view, int i) {
        boolean z = true;
        if ((i & 2) != 0) {
            boolean z2;
            if (sVar.a() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
            }
        }
        z = false;
        if (z && this.f35124e != null) {
            this.f35124e.d();
        }
        this.f35128i = null;
        return z;
    }

    public void m40700a(CoordinatorLayout coordinatorLayout, s sVar, int i, int[] iArr) {
        int i2 = 0;
        if (i != 0 && !this.f35122c) {
            int i3;
            if (i < 0) {
                int i4;
                i3 = -sVar.a();
                if (sVar.a != -1) {
                    i4 = sVar.a;
                } else {
                    int childCount = sVar.getChildCount() - 1;
                    int i5 = 0;
                    while (childCount >= 0) {
                        View childAt = sVar.getChildAt(childCount);
                        C0262w c0262w = (C0262w) childAt.getLayoutParams();
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i6 = c0262w.f35420a;
                        if ((i6 & 5) != 5) {
                            if (i5 > 0) {
                                break;
                            }
                            i4 = i5;
                        } else {
                            i4 = (c0262w.bottomMargin + c0262w.topMargin) + i5;
                            if ((i6 & 8) != 0) {
                                i4 += oa.m37365l(childAt);
                            } else if ((i6 & 2) != 0) {
                                i4 += measuredHeight - oa.m37365l(childAt);
                            } else {
                                i4 += measuredHeight;
                            }
                        }
                        childCount--;
                        i5 = i4;
                    }
                    i4 = Math.max(0, i5);
                    sVar.a = i4;
                }
                i2 = i3 + i4;
            } else {
                i3 = -sVar.a();
            }
            iArr[1] = b(coordinatorLayout, sVar, i, i3, i2);
        }
    }

    public void m40699a(CoordinatorLayout coordinatorLayout, s sVar, int i) {
        if (i < 0) {
            int i2;
            if (sVar.b != -1) {
                i2 = sVar.b;
            } else {
                int childCount = sVar.getChildCount();
                int i3 = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = sVar.getChildAt(i4);
                    C0262w c0262w = (C0262w) childAt.getLayoutParams();
                    int measuredHeight = childAt.getMeasuredHeight() + (c0262w.topMargin + c0262w.bottomMargin);
                    i2 = c0262w.f35420a;
                    if ((i2 & 1) == 0) {
                        break;
                    }
                    i3 += measuredHeight;
                    if ((i2 & 2) != 0) {
                        i2 = i3 - (oa.m37365l(childAt) + sVar.b());
                        break;
                    }
                }
                i2 = i3;
                i2 = Math.max(0, i2);
                sVar.b = i2;
            }
            b(coordinatorLayout, sVar, i, -i2, 0);
            this.f35122c = true;
            return;
        }
        this.f35122c = false;
    }

    public void m40702a(CoordinatorLayout coordinatorLayout, s sVar, View view) {
        if (!this.f35123d) {
            m40687c(coordinatorLayout, sVar);
        }
        this.f35122c = false;
        this.f35123d = false;
        this.f35128i = new WeakReference(view);
    }

    public boolean m40708a(CoordinatorLayout coordinatorLayout, s sVar, float f, boolean z) {
        boolean z2 = false;
        if (!z) {
            z2 = a(coordinatorLayout, sVar, -sVar.a(), 0, -f);
        } else if (f < 0.0f) {
            int i = -sVar.a();
            if (sVar.a != -1) {
                r0 = sVar.a;
            } else {
                int childCount = sVar.getChildCount() - 1;
                int i2 = 0;
                while (childCount >= 0) {
                    View childAt = sVar.getChildAt(childCount);
                    C0262w c0262w = (C0262w) childAt.getLayoutParams();
                    int measuredHeight = childAt.getMeasuredHeight();
                    int i3 = c0262w.f35420a;
                    if ((i3 & 5) != 5) {
                        if (i2 > 0) {
                            break;
                        }
                        r0 = i2;
                    } else {
                        r0 = (c0262w.bottomMargin + c0262w.topMargin) + i2;
                        if ((i3 & 8) != 0) {
                            r0 += oa.m37365l(childAt);
                        } else if ((i3 & 2) != 0) {
                            r0 += measuredHeight - oa.m37365l(childAt);
                        } else {
                            r0 += measuredHeight;
                        }
                    }
                    childCount--;
                    i2 = r0;
                }
                r0 = Math.max(0, i2);
                sVar.a = r0;
            }
            r0 += i;
            if (m40689a() < r0) {
                m40686a(coordinatorLayout, sVar, r0, f);
                z2 = true;
            }
        } else {
            r0 = -sVar.a();
            if (m40689a() > r0) {
                m40686a(coordinatorLayout, sVar, r0, f);
                z2 = true;
            }
        }
        this.f35123d = z2;
        return z2;
    }

    private void m40686a(CoordinatorLayout coordinatorLayout, s sVar, int i, float f) {
        int abs = Math.abs(m40689a() - i);
        float abs2 = Math.abs(f);
        if (abs2 > 0.0f) {
            abs = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
        } else {
            abs = (int) (((((float) abs) / ((float) sVar.getHeight())) + 1.0f) * 150.0f);
        }
        int a = m40689a();
        if (a != i) {
            if (this.f35124e == null) {
                this.f35124e = br.a.a();
                this.f35124e.a(C0258r.f35044e);
                this.f35124e.a(new oto(this, coordinatorLayout, sVar));
            } else {
                this.f35124e.d();
            }
            this.f35124e.a((long) Math.min(abs, 600));
            this.f35124e.a(a, i);
            this.f35124e.a();
        } else if (this.f35124e != null && this.f35124e.b()) {
            this.f35124e.d();
        }
    }

    private void m40687c(CoordinatorLayout coordinatorLayout, s sVar) {
        int i;
        int a = m40689a();
        int childCount = sVar.getChildCount();
        for (i = 0; i < childCount; i++) {
            View childAt = sVar.getChildAt(i);
            if (childAt.getTop() <= (-a) && childAt.getBottom() >= (-a)) {
                childCount = i;
                break;
            }
        }
        childCount = -1;
        if (childCount >= 0) {
            View childAt2 = sVar.getChildAt(childCount);
            int a2 = ((C0262w) childAt2.getLayoutParams()).m41102a();
            if ((a2 & 17) == 17) {
                int i2 = -childAt2.getTop();
                i = -childAt2.getBottom();
                if (childCount == sVar.getChildCount() - 1) {
                    i += sVar.b();
                }
                if (C0259t.m40688g(a2, 2)) {
                    i += oa.m37365l(childAt2);
                    childCount = i2;
                } else if (C0259t.m40688g(a2, 5)) {
                    childCount = oa.m37365l(childAt2) + i;
                    if (a >= childCount) {
                        i = childCount;
                        childCount = i2;
                    }
                } else {
                    childCount = i2;
                }
                if (a >= (i + childCount) / 2) {
                    i = childCount;
                }
                m40686a(coordinatorLayout, sVar, gwb.a(i, -sVar.a(), 0), 0.0f);
            }
        }
    }

    private static boolean m40688g(int i, int i2) {
        return (i & i2) == i2;
    }

    public boolean m40709a(CoordinatorLayout coordinatorLayout, s sVar, int i, int i2, int i3, int i4) {
        if (((ae) sVar.getLayoutParams()).height != -2) {
            return super.a(coordinatorLayout, sVar, i, i2, i3, i4);
        }
        coordinatorLayout.a(sVar, i, i2, MeasureSpec.makeMeasureSpec(0, 0), i4);
        return true;
    }

    public boolean m40717b(CoordinatorLayout coordinatorLayout, s sVar, int i) {
        int i2;
        boolean a = super.a(coordinatorLayout, sVar, i);
        int i3 = sVar.d;
        if (i3 != 0) {
            i2 = (i3 & 4) != 0 ? 1 : 0;
            if ((i3 & 2) != 0) {
                i3 = -sVar.a();
                if (i2 != 0) {
                    m40686a(coordinatorLayout, sVar, i3, 0.0f);
                } else {
                    a_(coordinatorLayout, sVar, i3);
                }
            } else if ((i3 & 1) != 0) {
                if (i2 != 0) {
                    m40686a(coordinatorLayout, sVar, 0, 0.0f);
                } else {
                    a_(coordinatorLayout, sVar, 0);
                }
            }
        } else if (this.f35125f >= 0) {
            View childAt = sVar.getChildAt(this.f35125f);
            i3 = -childAt.getBottom();
            if (this.f35126g) {
                i2 = oa.m37365l(childAt) + i3;
            } else {
                i2 = Math.round(((float) childAt.getHeight()) * this.f35127h) + i3;
            }
            m40703a(i2);
        }
        sVar.d = 0;
        this.f35125f = -1;
        m40703a(gwb.a(m40712b(), -sVar.a(), 0));
        m40712b();
        if (sVar.e != null) {
            i3 = sVar.e.size();
            for (i2 = 0; i2 < i3; i2++) {
                sVar.e.get(i2);
            }
        }
        return a;
    }

    boolean m40711a(s sVar) {
        if (this.f35129j != null) {
            return this.f35129j.m40865a();
        }
        if (this.f35128i == null) {
            return true;
        }
        View view = (View) this.f35128i.get();
        return (view == null || !view.isShown() || oa.m37346b(view, -1)) ? false : true;
    }

    void m40698a(CoordinatorLayout coordinatorLayout, s sVar) {
        m40687c(coordinatorLayout, sVar);
    }

    int m40718c(s sVar) {
        return sVar.a();
    }

    int m40691a(CoordinatorLayout coordinatorLayout, s sVar, int i, int i2, int i3) {
        int a = m40689a();
        if (i2 == 0 || a < i2 || a > i3) {
            this.f35121a = 0;
            return 0;
        }
        int a2 = gwb.a(i, i2, i3);
        if (a == a2) {
            return 0;
        }
        int abs;
        int childCount;
        int i4;
        int height;
        View view;
        if (sVar.c) {
            abs = Math.abs(a2);
            childCount = sVar.getChildCount();
            i4 = 0;
            while (i4 < childCount) {
                View childAt = sVar.getChildAt(i4);
                C0262w c0262w = (C0262w) childAt.getLayoutParams();
                Interpolator b = c0262w.m41103b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i4++;
                } else {
                    if (b != null) {
                        childCount = c0262w.m41102a();
                        if ((childCount & 1) != 0) {
                            height = (c0262w.bottomMargin + (childAt.getHeight() + c0262w.topMargin)) + 0;
                            if ((childCount & 2) != 0) {
                                height -= oa.m37365l(childAt);
                            }
                        } else {
                            height = 0;
                        }
                        if (oa.m37369p(childAt)) {
                            height -= sVar.b();
                        }
                        if (height > 0) {
                            height = (Math.round(b.getInterpolation(((float) (abs - childAt.getTop())) / ((float) height)) * ((float) height)) + childAt.getTop()) * Integer.signum(a2);
                        }
                    }
                    height = a2;
                }
            }
            height = a2;
        } else {
            height = a2;
        }
        boolean a3 = m40703a(height);
        abs = a - a2;
        this.f35121a = a2 - height;
        if (!a3 && sVar.c) {
            coordinatorLayout.b(sVar);
        }
        m40712b();
        if (sVar.e != null) {
            i4 = sVar.e.size();
            for (height = 0; height < i4; height++) {
                sVar.e.get(height);
            }
        }
        if (a2 < a) {
            Object obj = -1;
        } else {
            i4 = 1;
        }
        childCount = Math.abs(a2);
        int childCount2 = sVar.getChildCount();
        for (a = 0; a < childCount2; a++) {
            View childAt2 = sVar.getChildAt(a);
            if (childCount >= childAt2.getTop() && childCount <= childAt2.getBottom()) {
                view = childAt2;
                break;
            }
        }
        view = null;
        if (view != null) {
            Object obj2;
            childCount = ((C0262w) view.getLayoutParams()).m41102a();
            boolean z = false;
            if ((childCount & 1) != 0) {
                childCount2 = oa.m37365l(view);
                if (obj > null && (childCount & 12) != 0) {
                    z = (-a2) >= (view.getBottom() - childCount2) - sVar.b();
                } else if ((childCount & 2) != 0) {
                    z = (-a2) >= (view.getBottom() - childCount2) - sVar.b();
                }
            }
            if (sVar.f != z) {
                sVar.f = z;
                sVar.refreshDrawableState();
                obj2 = 1;
            } else {
                obj2 = null;
            }
            if (obj2 != null && VERSION.SDK_INT >= 11) {
                List d = coordinatorLayout.d(sVar);
                a = d.size();
                i4 = 0;
                while (i4 < a) {
                    gwb a4 = ((ae) ((View) d.get(i4)).getLayoutParams()).a();
                    if (a4 instanceof C0263x) {
                        if (((C0263x) a4).d != 0) {
                            obj2 = 1;
                        } else {
                            obj2 = null;
                        }
                        if (obj2 != null) {
                            sVar.jumpDrawablesToCurrentState();
                        }
                    } else {
                        i4++;
                    }
                }
                obj2 = null;
                if (obj2 != null) {
                    sVar.jumpDrawablesToCurrentState();
                }
            }
        }
        return abs;
    }

    int m40689a() {
        return m40712b() + this.f35121a;
    }

    public Parcelable m40716b(CoordinatorLayout coordinatorLayout, s sVar) {
        boolean z = false;
        Parcelable b = super.b(coordinatorLayout, sVar);
        int b2 = m40712b();
        int childCount = sVar.getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = sVar.getChildAt(i);
            int bottom = childAt.getBottom() + b2;
            if (childAt.getTop() + b2 > 0 || bottom < 0) {
                i++;
            } else {
                C0261v c0261v = new C0261v(b);
                c0261v.f35358a = i;
                if (bottom == oa.m37365l(childAt)) {
                    z = true;
                }
                c0261v.f35360c = z;
                c0261v.f35359b = ((float) bottom) / ((float) childAt.getHeight());
                return c0261v;
            }
        }
        return b;
    }

    public void m40701a(CoordinatorLayout coordinatorLayout, s sVar, Parcelable parcelable) {
        if (parcelable instanceof C0261v) {
            C0261v c0261v = (C0261v) parcelable;
            super.a(coordinatorLayout, sVar, c0261v.e);
            this.f35125f = c0261v.f35358a;
            this.f35127h = c0261v.f35359b;
            this.f35126g = c0261v.f35360c;
            return;
        }
        super.a(coordinatorLayout, sVar, parcelable);
        this.f35125f = -1;
    }

    int m40714b(s sVar) {
        int i;
        if (sVar.b != -1) {
            i = sVar.b;
        } else {
            int childCount = sVar.getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = sVar.getChildAt(i3);
                C0262w c0262w = (C0262w) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + (c0262w.topMargin + c0262w.bottomMargin);
                i = c0262w.f35420a;
                if ((i & 1) == 0) {
                    break;
                }
                i2 += measuredHeight;
                if ((i & 2) != 0) {
                    i = i2 - (oa.m37365l(childAt) + sVar.b());
                    break;
                }
            }
            i = i2;
            i = Math.max(0, i);
            sVar.b = i;
        }
        return -i;
    }
}
