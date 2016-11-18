package defpackage;

import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.List;

public class t extends ai<s> {
    int a;
    private boolean c;
    private boolean d;
    private az e;
    private int f = -1;
    private boolean g;
    private float h;
    private WeakReference<View> i;
    private u j;

    /* synthetic */ int a(View view) {
        return c((s) view);
    }

    public /* bridge */ /* synthetic */ void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4) {
        a(coordinatorLayout, (s) view, i4);
    }

    public /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, int i) {
        return b(coordinatorLayout, (s) view, i);
    }

    public /* bridge */ /* synthetic */ int b() {
        return super.b();
    }

    /* synthetic */ boolean c(View view) {
        return a((s) view);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(android.support.design.widget.CoordinatorLayout r5, s r6, android.view.View r7, int r8) {
        /*
        r4 = this;
        r0 = 1;
        r1 = 0;
        r2 = r8 & 2;
        if (r2 == 0) goto L_0x002f;
    L_0x0006:
        r2 = r6.a();
        if (r2 == 0) goto L_0x002d;
    L_0x000c:
        r2 = r0;
    L_0x000d:
        if (r2 == 0) goto L_0x002f;
    L_0x000f:
        r2 = r5.getHeight();
        r3 = r7.getHeight();
        r2 = r2 - r3;
        r3 = r6.getHeight();
        if (r2 > r3) goto L_0x002f;
    L_0x001e:
        if (r0 == 0) goto L_0x0029;
    L_0x0020:
        r1 = r4.e;
        if (r1 == 0) goto L_0x0029;
    L_0x0024:
        r1 = r4.e;
        r1.d();
    L_0x0029:
        r1 = 0;
        r4.i = r1;
        return r0;
    L_0x002d:
        r2 = r1;
        goto L_0x000d;
    L_0x002f:
        r0 = r1;
        goto L_0x001e;
        */
        throw new UnsupportedOperationException("Method not decompiled: t.a(android.support.design.widget.CoordinatorLayout, s, android.view.View, int):boolean");
    }

    public void a(CoordinatorLayout coordinatorLayout, s sVar, int i, int[] iArr) {
        int i2 = 0;
        if (i != 0 && !this.c) {
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
                        w wVar = (w) childAt.getLayoutParams();
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i6 = wVar.a;
                        if ((i6 & 5) != 5) {
                            if (i5 > 0) {
                                break;
                            }
                            i4 = i5;
                        } else {
                            i4 = (wVar.bottomMargin + wVar.topMargin) + i5;
                            if ((i6 & 8) != 0) {
                                i4 += oa.l(childAt);
                            } else if ((i6 & 2) != 0) {
                                i4 += measuredHeight - oa.l(childAt);
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

    public void a(CoordinatorLayout coordinatorLayout, s sVar, int i) {
        if (i < 0) {
            int i2;
            if (sVar.b != -1) {
                i2 = sVar.b;
            } else {
                int childCount = sVar.getChildCount();
                int i3 = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = sVar.getChildAt(i4);
                    w wVar = (w) childAt.getLayoutParams();
                    int measuredHeight = childAt.getMeasuredHeight() + (wVar.topMargin + wVar.bottomMargin);
                    i2 = wVar.a;
                    if ((i2 & 1) == 0) {
                        break;
                    }
                    i3 += measuredHeight;
                    if ((i2 & 2) != 0) {
                        i2 = i3 - (oa.l(childAt) + sVar.b());
                        break;
                    }
                }
                i2 = i3;
                i2 = Math.max(0, i2);
                sVar.b = i2;
            }
            b(coordinatorLayout, sVar, i, -i2, 0);
            this.c = true;
            return;
        }
        this.c = false;
    }

    public void a(CoordinatorLayout coordinatorLayout, s sVar, View view) {
        if (!this.d) {
            c(coordinatorLayout, sVar);
        }
        this.c = false;
        this.d = false;
        this.i = new WeakReference(view);
    }

    public boolean a(CoordinatorLayout coordinatorLayout, s sVar, float f, boolean z) {
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
                    w wVar = (w) childAt.getLayoutParams();
                    int measuredHeight = childAt.getMeasuredHeight();
                    int i3 = wVar.a;
                    if ((i3 & 5) != 5) {
                        if (i2 > 0) {
                            break;
                        }
                        r0 = i2;
                    } else {
                        r0 = (wVar.bottomMargin + wVar.topMargin) + i2;
                        if ((i3 & 8) != 0) {
                            r0 += oa.l(childAt);
                        } else if ((i3 & 2) != 0) {
                            r0 += measuredHeight - oa.l(childAt);
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
            if (a() < r0) {
                a(coordinatorLayout, sVar, r0, f);
                z2 = true;
            }
        } else {
            r0 = -sVar.a();
            if (a() > r0) {
                a(coordinatorLayout, sVar, r0, f);
                z2 = true;
            }
        }
        this.d = z2;
        return z2;
    }

    private void a(CoordinatorLayout coordinatorLayout, s sVar, int i, float f) {
        int abs = Math.abs(a() - i);
        float abs2 = Math.abs(f);
        if (abs2 > 0.0f) {
            abs = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
        } else {
            abs = (int) (((((float) abs) / ((float) sVar.getHeight())) + 1.0f) * 150.0f);
        }
        int a = a();
        if (a != i) {
            if (this.e == null) {
                this.e = br.a.a();
                this.e.a(r.e);
                this.e.a(new oto(this, coordinatorLayout, sVar));
            } else {
                this.e.d();
            }
            this.e.a((long) Math.min(abs, 600));
            this.e.a(a, i);
            this.e.a();
        } else if (this.e != null && this.e.b()) {
            this.e.d();
        }
    }

    private void c(CoordinatorLayout coordinatorLayout, s sVar) {
        int i;
        int a = a();
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
            int a2 = ((w) childAt2.getLayoutParams()).a();
            if ((a2 & 17) == 17) {
                int i2 = -childAt2.getTop();
                i = -childAt2.getBottom();
                if (childCount == sVar.getChildCount() - 1) {
                    i += sVar.b();
                }
                if (t.g(a2, 2)) {
                    i += oa.l(childAt2);
                    childCount = i2;
                } else if (t.g(a2, 5)) {
                    childCount = oa.l(childAt2) + i;
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
                a(coordinatorLayout, sVar, gwb.a(i, -sVar.a(), 0), 0.0f);
            }
        }
    }

    private static boolean g(int i, int i2) {
        return (i & i2) == i2;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, s sVar, int i, int i2, int i3, int i4) {
        if (((ae) sVar.getLayoutParams()).height != -2) {
            return super.a(coordinatorLayout, sVar, i, i2, i3, i4);
        }
        coordinatorLayout.a(sVar, i, i2, MeasureSpec.makeMeasureSpec(0, 0), i4);
        return true;
    }

    public boolean b(CoordinatorLayout coordinatorLayout, s sVar, int i) {
        int i2;
        boolean a = super.a(coordinatorLayout, sVar, i);
        int i3 = sVar.d;
        if (i3 != 0) {
            i2 = (i3 & 4) != 0 ? 1 : 0;
            if ((i3 & 2) != 0) {
                i3 = -sVar.a();
                if (i2 != 0) {
                    a(coordinatorLayout, sVar, i3, 0.0f);
                } else {
                    a_(coordinatorLayout, sVar, i3);
                }
            } else if ((i3 & 1) != 0) {
                if (i2 != 0) {
                    a(coordinatorLayout, sVar, 0, 0.0f);
                } else {
                    a_(coordinatorLayout, sVar, 0);
                }
            }
        } else if (this.f >= 0) {
            View childAt = sVar.getChildAt(this.f);
            i3 = -childAt.getBottom();
            if (this.g) {
                i2 = oa.l(childAt) + i3;
            } else {
                i2 = Math.round(((float) childAt.getHeight()) * this.h) + i3;
            }
            a(i2);
        }
        sVar.d = 0;
        this.f = -1;
        a(gwb.a(b(), -sVar.a(), 0));
        b();
        if (sVar.e != null) {
            i3 = sVar.e.size();
            for (i2 = 0; i2 < i3; i2++) {
                sVar.e.get(i2);
            }
        }
        return a;
    }

    boolean a(s sVar) {
        if (this.j != null) {
            return this.j.a();
        }
        if (this.i == null) {
            return true;
        }
        View view = (View) this.i.get();
        return (view == null || !view.isShown() || oa.b(view, -1)) ? false : true;
    }

    void a(CoordinatorLayout coordinatorLayout, s sVar) {
        c(coordinatorLayout, sVar);
    }

    int c(s sVar) {
        return sVar.a();
    }

    int a(CoordinatorLayout coordinatorLayout, s sVar, int i, int i2, int i3) {
        int a = a();
        if (i2 == 0 || a < i2 || a > i3) {
            this.a = 0;
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
                w wVar = (w) childAt.getLayoutParams();
                Interpolator b = wVar.b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i4++;
                } else {
                    if (b != null) {
                        childCount = wVar.a();
                        if ((childCount & 1) != 0) {
                            height = (wVar.bottomMargin + (childAt.getHeight() + wVar.topMargin)) + 0;
                            if ((childCount & 2) != 0) {
                                height -= oa.l(childAt);
                            }
                        } else {
                            height = 0;
                        }
                        if (oa.p(childAt)) {
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
        boolean a3 = a(height);
        abs = a - a2;
        this.a = a2 - height;
        if (!a3 && sVar.c) {
            coordinatorLayout.b(sVar);
        }
        b();
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
            childCount = ((w) view.getLayoutParams()).a();
            boolean z = false;
            if ((childCount & 1) != 0) {
                childCount2 = oa.l(view);
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
                    if (a4 instanceof x) {
                        if (((x) a4).d != 0) {
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

    int a() {
        return b() + this.a;
    }

    public Parcelable b(CoordinatorLayout coordinatorLayout, s sVar) {
        boolean z = false;
        Parcelable b = super.b(coordinatorLayout, sVar);
        int b2 = b();
        int childCount = sVar.getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = sVar.getChildAt(i);
            int bottom = childAt.getBottom() + b2;
            if (childAt.getTop() + b2 > 0 || bottom < 0) {
                i++;
            } else {
                v vVar = new v(b);
                vVar.a = i;
                if (bottom == oa.l(childAt)) {
                    z = true;
                }
                vVar.c = z;
                vVar.b = ((float) bottom) / ((float) childAt.getHeight());
                return vVar;
            }
        }
        return b;
    }

    public void a(CoordinatorLayout coordinatorLayout, s sVar, Parcelable parcelable) {
        if (parcelable instanceof v) {
            v vVar = (v) parcelable;
            super.a(coordinatorLayout, sVar, vVar.e);
            this.f = vVar.a;
            this.h = vVar.b;
            this.g = vVar.c;
            return;
        }
        super.a(coordinatorLayout, sVar, parcelable);
        this.f = -1;
    }

    int b(s sVar) {
        int i;
        if (sVar.b != -1) {
            i = sVar.b;
        } else {
            int childCount = sVar.getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = sVar.getChildAt(i3);
                w wVar = (w) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + (wVar.topMargin + wVar.bottomMargin);
                i = wVar.a;
                if ((i & 1) == 0) {
                    break;
                }
                i2 += measuredHeight;
                if ((i & 2) != 0) {
                    i = i2 - (oa.l(childAt) + sVar.b());
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
