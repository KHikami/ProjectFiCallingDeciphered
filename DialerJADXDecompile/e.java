import android.os.Parcelable;
import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

public class e extends t {
    int a;
    private boolean c;
    private boolean d;
    private ao e;
    private int f;
    private boolean g;
    private float h;
    private WeakReference i;

    final /* synthetic */ int a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        view = (d) view;
        int a = a();
        if (i2 == 0 || a < i2 || a > i3) {
            this.a = 0;
            return 0;
        }
        int a2 = buf.a(i, i2, i3);
        if (a == a2) {
            return 0;
        }
        int abs;
        int childCount;
        int i4;
        int height;
        int i5;
        View view2;
        View view3;
        if (view.c) {
            abs = Math.abs(a2);
            childCount = view.getChildCount();
            i4 = 0;
            while (i4 < childCount) {
                View childAt = view.getChildAt(i4);
                h hVar = (h) childAt.getLayoutParams();
                Interpolator interpolator = hVar.b;
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i4++;
                } else {
                    if (interpolator != null) {
                        childCount = hVar.a;
                        if ((childCount & 1) != 0) {
                            height = (hVar.bottomMargin + (childAt.getHeight() + hVar.topMargin)) + 0;
                            if ((childCount & 2) != 0) {
                                height -= kn.k(childAt);
                            }
                        } else {
                            height = 0;
                        }
                        if (kn.o(childAt)) {
                            if (height > 0) {
                                height = (Math.round(interpolator.getInterpolation(((float) (abs - childAt.getTop())) / ((float) height)) * ((float) height)) + childAt.getTop()) * Integer.signum(a2);
                            }
                        } else if (height > 0) {
                            height = (Math.round(interpolator.getInterpolation(((float) (abs - childAt.getTop())) / ((float) height)) * ((float) height)) + childAt.getTop()) * Integer.signum(a2);
                        }
                    }
                    height = a2;
                }
            }
            height = a2;
        } else {
            height = a2;
        }
        boolean a3 = super.a(height);
        childCount = a - a2;
        this.a = a2 - height;
        if (!a3 && view.c) {
            int size = coordinatorLayout.a.size();
            Object obj = null;
            i5 = 0;
            while (i5 < size) {
                Object obj2;
                view2 = (View) coordinatorLayout.a.get(i5);
                if (view2 == view) {
                    obj2 = 1;
                } else {
                    if (obj != null) {
                        p pVar = (p) view2.getLayoutParams();
                        buf buf = pVar.a;
                        if (buf != null && pVar.a(coordinatorLayout, view2, view)) {
                            buf.b(coordinatorLayout, view2, view);
                        }
                    }
                    obj2 = obj;
                }
                i5++;
                obj = obj2;
            }
        }
        super.b();
        if (a2 < a) {
            Object obj3 = -1;
        } else {
            i4 = 1;
        }
        i5 = Math.abs(a2);
        a = view.getChildCount();
        for (abs = 0; abs < a; abs++) {
            view2 = view.getChildAt(abs);
            if (i5 >= view2.getTop() && i5 <= view2.getBottom()) {
                view3 = view2;
                break;
            }
        }
        view3 = null;
        if (view3 != null) {
            i5 = ((h) view3.getLayoutParams()).a;
            boolean z = false;
            if ((i5 & 1) != 0) {
                a = kn.k(view3);
                if (obj3 > null && (i5 & 12) != 0) {
                    z = (-a2) >= view3.getBottom() - a;
                } else if ((i5 & 2) != 0) {
                    z = (-a2) >= view3.getBottom() - a;
                }
            }
            if (view.e != z) {
                view.e = z;
                view.refreshDrawableState();
            }
        }
        return childCount;
    }

    final /* synthetic */ int a(View view) {
        return ((d) view).a();
    }

    final /* synthetic */ void a(CoordinatorLayout coordinatorLayout, View view) {
        a(coordinatorLayout, (d) view);
    }

    public final /* synthetic */ void a(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        view = (d) view;
        if (parcelable instanceof g) {
            g gVar = (g) parcelable;
            super.a(coordinatorLayout, view, gVar.e);
            this.f = gVar.a;
            this.h = gVar.b;
            this.g = gVar.c;
            return;
        }
        super.a(coordinatorLayout, view, parcelable);
        this.f = -1;
    }

    public final /* synthetic */ void a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        d dVar = (d) view;
        if (!this.d) {
            a(coordinatorLayout, dVar);
        }
        this.c = false;
        this.d = false;
        this.i = new WeakReference(view2);
    }

    public final /* synthetic */ void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4) {
        d dVar = (d) view;
        if (i4 < 0) {
            int i5;
            if (dVar.b != -1) {
                i5 = dVar.b;
            } else {
                int i6 = 0;
                int childCount = dVar.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = dVar.getChildAt(i7);
                    h hVar = (h) childAt.getLayoutParams();
                    int measuredHeight = childAt.getMeasuredHeight() + (hVar.topMargin + hVar.bottomMargin);
                    i5 = hVar.a;
                    if ((i5 & 1) == 0) {
                        break;
                    }
                    i6 += measuredHeight;
                    if ((i5 & 2) != 0) {
                        i5 = i6 - kn.k(childAt);
                        break;
                    }
                }
                i5 = i6;
                i5 = Math.max(0, i5);
                dVar.b = i5;
            }
            b(coordinatorLayout, dVar, i4, -i5, 0);
            this.c = true;
            return;
        }
        this.c = false;
    }

    public final /* synthetic */ void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr) {
        d dVar = (d) view;
        if (i2 != 0 && !this.c) {
            int i3;
            int i4;
            if (i2 < 0) {
                int i5;
                i3 = -dVar.a();
                if (dVar.a != -1) {
                    i5 = dVar.a;
                } else {
                    int i6 = 0;
                    int childCount = dVar.getChildCount() - 1;
                    while (childCount >= 0) {
                        View childAt = dVar.getChildAt(childCount);
                        h hVar = (h) childAt.getLayoutParams();
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i7 = hVar.a;
                        if ((i7 & 5) != 5) {
                            if (i6 > 0) {
                                break;
                            }
                            i5 = i6;
                        } else {
                            i5 = (hVar.bottomMargin + hVar.topMargin) + i6;
                            if ((i7 & 8) != 0) {
                                i5 += kn.k(childAt);
                            } else if ((i7 & 2) != 0) {
                                i5 += measuredHeight - kn.k(childAt);
                            } else {
                                i5 += measuredHeight;
                            }
                        }
                        childCount--;
                        i6 = i5;
                    }
                    i5 = Math.max(0, i6);
                    dVar.a = i5;
                }
                i4 = i3 + i5;
            } else {
                i3 = -dVar.a();
                i4 = 0;
            }
            iArr[1] = b(coordinatorLayout, dVar, i2, i3, i4);
        }
    }

    public final /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, int i) {
        d dVar = (d) view;
        boolean a = super.a(coordinatorLayout, dVar, i);
        if (this.f >= 0) {
            int k;
            View childAt = dVar.getChildAt(this.f);
            int i2 = -childAt.getBottom();
            if (this.g) {
                k = kn.k(childAt) + i2;
            } else {
                k = Math.round(((float) childAt.getHeight()) * this.h) + i2;
            }
            super.a(k);
        }
        dVar.d = 0;
        this.f = -1;
        super.a(buf.a(super.b(), -dVar.a(), 0));
        super.b();
        return a;
    }

    public final /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View view2 = (d) view;
        if (((p) view2.getLayoutParams()).height != -2) {
            return super.a(coordinatorLayout, view2, i, i2, i3, i4);
        }
        coordinatorLayout.a(view2, i, i2, MeasureSpec.makeMeasureSpec(0, 0), i4);
        return true;
    }

    public final /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2, boolean z) {
        boolean z2;
        d dVar = (d) view;
        if (z) {
            int i;
            if (f2 < 0.0f) {
                int i2 = -dVar.a();
                if (dVar.a != -1) {
                    i = dVar.a;
                } else {
                    int i3 = 0;
                    int childCount = dVar.getChildCount() - 1;
                    while (childCount >= 0) {
                        View childAt = dVar.getChildAt(childCount);
                        h hVar = (h) childAt.getLayoutParams();
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i4 = hVar.a;
                        if ((i4 & 5) != 5) {
                            if (i3 > 0) {
                                break;
                            }
                            i = i3;
                        } else {
                            i = (hVar.bottomMargin + hVar.topMargin) + i3;
                            if ((i4 & 8) != 0) {
                                i += kn.k(childAt);
                            } else if ((i4 & 2) != 0) {
                                i += measuredHeight - kn.k(childAt);
                            } else {
                                i += measuredHeight;
                            }
                        }
                        childCount--;
                        i3 = i;
                    }
                    i = Math.max(0, i3);
                    dVar.a = i;
                }
                i += i2;
                if (a() < i) {
                    a(coordinatorLayout, dVar, i, f2);
                    z2 = true;
                }
            } else {
                i = -dVar.a();
                if (a() > i) {
                    a(coordinatorLayout, dVar, i, f2);
                    z2 = true;
                }
            }
            z2 = false;
        } else {
            z2 = a(coordinatorLayout, (View) dVar, -dVar.a(), 0, -f2);
        }
        this.d = z2;
        return z2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ boolean a(android.support.design.widget.CoordinatorLayout r5, android.view.View r6, android.view.View r7, android.view.View r8, int r9) {
        /*
        r4 = this;
        r0 = 1;
        r1 = 0;
        r6 = (d) r6;
        r2 = r9 & 2;
        if (r2 == 0) goto L_0x0033;
    L_0x0008:
        r2 = r6.a();
        if (r2 == 0) goto L_0x0031;
    L_0x000e:
        r2 = r0;
    L_0x000f:
        if (r2 == 0) goto L_0x0033;
    L_0x0011:
        r2 = r5.getHeight();
        r3 = r7.getHeight();
        r2 = r2 - r3;
        r3 = r6.getHeight();
        if (r2 > r3) goto L_0x0033;
    L_0x0020:
        if (r0 == 0) goto L_0x002d;
    L_0x0022:
        r1 = r4.e;
        if (r1 == 0) goto L_0x002d;
    L_0x0026:
        r1 = r4.e;
        r1 = r1.a;
        r1.d();
    L_0x002d:
        r1 = 0;
        r4.i = r1;
        return r0;
    L_0x0031:
        r2 = r1;
        goto L_0x000f;
    L_0x0033:
        r0 = r1;
        goto L_0x0020;
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.View, android.view.View, int):boolean");
    }

    public final /* bridge */ /* synthetic */ int b() {
        return super.b();
    }

    final /* synthetic */ int b(View view) {
        int i;
        d dVar = (d) view;
        if (dVar.b != -1) {
            i = dVar.b;
        } else {
            int childCount = dVar.getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = dVar.getChildAt(i3);
                h hVar = (h) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + (hVar.topMargin + hVar.bottomMargin);
                i = hVar.a;
                if ((i & 1) == 0) {
                    break;
                }
                i2 += measuredHeight;
                if ((i & 2) != 0) {
                    i = i2 - kn.k(childAt);
                    break;
                }
            }
            i = i2;
            i = Math.max(0, i);
            dVar.b = i;
        }
        return -i;
    }

    public final /* synthetic */ Parcelable b(CoordinatorLayout coordinatorLayout, View view) {
        boolean z = false;
        view = (d) view;
        Parcelable b = super.b(coordinatorLayout, view);
        int b2 = super.b();
        int childCount = view.getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = view.getChildAt(i);
            int bottom = childAt.getBottom() + b2;
            if (childAt.getTop() + b2 > 0 || bottom < 0) {
                i++;
            } else {
                g gVar = new g(b);
                gVar.a = i;
                if (bottom == kn.k(childAt)) {
                    z = true;
                }
                gVar.c = z;
                gVar.b = ((float) bottom) / ((float) childAt.getHeight());
                return gVar;
            }
        }
        return b;
    }

    final /* synthetic */ boolean c(View view) {
        d dVar = (d) view;
        if (this.i != null) {
            View view2 = (View) this.i.get();
            if (view2 == null || !view2.isShown() || kn.b(view2, -1)) {
                return false;
            }
        }
        return true;
    }

    private final void a(CoordinatorLayout coordinatorLayout, d dVar, int i, float f) {
        int abs = Math.abs(a() - i);
        float abs2 = Math.abs(f);
        if (abs2 > 0.0f) {
            abs = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
        } else {
            abs = (int) (((((float) abs) / ((float) dVar.getHeight())) + 1.0f) * 150.0f);
        }
        int a = a();
        if (a != i) {
            if (this.e == null) {
                this.e = be.a();
                this.e.a(c.d);
                this.e.a(new ew(this, coordinatorLayout, dVar));
            } else {
                this.e.a.d();
            }
            long min = (long) Math.min(abs, 600);
            this.e.a.a(min);
            this.e.a.a(a, i);
            this.e.a.a();
        } else if (this.e != null && this.e.a.b()) {
            this.e.a.d();
        }
    }

    private final void a(CoordinatorLayout coordinatorLayout, d dVar) {
        int i;
        int a = a();
        int childCount = dVar.getChildCount();
        for (i = 0; i < childCount; i++) {
            View childAt = dVar.getChildAt(i);
            if (childAt.getTop() <= (-a) && childAt.getBottom() >= (-a)) {
                childCount = i;
                break;
            }
        }
        childCount = -1;
        if (childCount >= 0) {
            View childAt2 = dVar.getChildAt(childCount);
            int i2 = ((h) childAt2.getLayoutParams()).a;
            if ((i2 & 17) == 17) {
                int i3 = -childAt2.getTop();
                i = -childAt2.getBottom();
                if (childCount == dVar.getChildCount() - 1) {
                }
                if (g(i2, 2)) {
                    i += kn.k(childAt2);
                    childCount = i3;
                } else if (g(i2, 5)) {
                    childCount = kn.k(childAt2) + i;
                    if (a >= childCount) {
                        i = childCount;
                        childCount = i3;
                    }
                } else {
                    childCount = i3;
                }
                if (a >= (i + childCount) / 2) {
                    i = childCount;
                }
                a(coordinatorLayout, dVar, buf.a(i, -dVar.a(), 0), 0.0f);
            }
        }
    }

    private static boolean g(int i, int i2) {
        return (i & i2) == i2;
    }

    final int a() {
        return super.b() + this.a;
    }
}
