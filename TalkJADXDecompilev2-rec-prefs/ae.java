package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public final class ae extends MarginLayoutParams {
    gwb f364a;
    public boolean f365b = false;
    public int f366c = 0;
    public int f367d = 0;
    public int f368e = -1;
    int f369f = -1;
    public int f370g = 0;
    public int f371h = 0;
    public int f372i;
    public int f373j;
    public View f374k;
    public View f375l;
    final Rect f376m = new Rect();
    Object f377n;
    private boolean f378o;
    private boolean f379p;
    private boolean f380q;

    public ae(int i, int i2) {
        super(-2, -2);
    }

    public ae(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.E);
        this.f366c = obtainStyledAttributes.getInteger(o.F, 0);
        this.f369f = obtainStyledAttributes.getResourceId(o.G, -1);
        this.f367d = obtainStyledAttributes.getInteger(o.H, 0);
        this.f368e = obtainStyledAttributes.getInteger(o.L, -1);
        this.f370g = obtainStyledAttributes.getInt(o.K, 0);
        this.f371h = obtainStyledAttributes.getInt(o.J, 0);
        this.f365b = obtainStyledAttributes.hasValue(o.I);
        if (this.f365b) {
            this.f364a = CoordinatorLayout.m3111a(context, attributeSet, obtainStyledAttributes.getString(o.I));
        }
        obtainStyledAttributes.recycle();
        if (this.f364a != null) {
            this.f364a.m2405a(this);
        }
    }

    public ae(ae aeVar) {
        super(aeVar);
    }

    public ae(MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public ae(LayoutParams layoutParams) {
        super(layoutParams);
    }

    public gwb m759a() {
        return this.f364a;
    }

    public void m761a(gwb gwb) {
        if (this.f364a != gwb) {
            this.f364a = gwb;
            this.f377n = null;
            this.f365b = true;
            if (gwb != null) {
                gwb.m2405a(this);
            }
        }
    }

    public void m760a(Rect rect) {
        this.f376m.set(rect);
    }

    public Rect m765b() {
        return this.f376m;
    }

    public boolean m768c() {
        return this.f374k == null && this.f369f != -1;
    }

    public boolean m769d() {
        if (this.f364a == null) {
            this.f378o = false;
        }
        return this.f378o;
    }

    public boolean m763a(CoordinatorLayout coordinatorLayout, View view) {
        if (this.f378o) {
            return true;
        }
        boolean c = (this.f364a != null ? this.f364a.m2421c(coordinatorLayout, view) : 0) | this.f378o;
        this.f378o = c;
        return c;
    }

    public void m770e() {
        this.f378o = false;
    }

    public void m771f() {
        this.f379p = false;
    }

    public void m762a(boolean z) {
        this.f379p = z;
    }

    public boolean m772g() {
        return this.f379p;
    }

    public boolean m773h() {
        return this.f380q;
    }

    public void m767b(boolean z) {
        this.f380q = z;
    }

    public void m774i() {
        this.f380q = false;
    }

    public boolean m764a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view2 != this.f375l) {
            Object obj;
            int d = oa.d(coordinatorLayout);
            int a = mj.m32250a(((ae) view2.getLayoutParams()).f370g, d);
            if (a == 0 || (mj.m32250a(this.f371h, d) & a) != a) {
                obj = null;
            } else {
                obj = 1;
            }
            if (obj == null && (this.f364a == null || !this.f364a.a_(view2))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public View m766b(CoordinatorLayout coordinatorLayout, View view) {
        if (this.f369f == -1) {
            this.f375l = null;
            this.f374k = null;
            return null;
        }
        View view2;
        View parent;
        if (this.f374k != null) {
            Object obj;
            if (this.f374k.getId() != this.f369f) {
                obj = null;
            } else {
                view2 = this.f374k;
                parent = this.f374k.getParent();
                while (parent != coordinatorLayout) {
                    if (parent == null || parent == view) {
                        this.f375l = null;
                        this.f374k = null;
                        obj = null;
                        break;
                    }
                    if (parent instanceof View) {
                        view2 = parent;
                    }
                    parent = parent.getParent();
                }
                this.f375l = view2;
                obj = 1;
            }
        }
        this.f374k = coordinatorLayout.findViewById(this.f369f);
        if (this.f374k != null) {
            if (this.f374k != coordinatorLayout) {
                view2 = this.f374k;
                parent = this.f374k.getParent();
                while (parent != coordinatorLayout && parent != null) {
                    if (parent != view) {
                        if (parent instanceof View) {
                            view2 = parent;
                        }
                        parent = parent.getParent();
                    } else if (coordinatorLayout.isInEditMode()) {
                        this.f375l = null;
                        this.f374k = null;
                    } else {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                }
                this.f375l = view2;
            } else if (coordinatorLayout.isInEditMode()) {
                this.f375l = null;
                this.f374k = null;
            } else {
                throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
            }
        } else if (coordinatorLayout.isInEditMode()) {
            this.f375l = null;
            this.f374k = null;
        } else {
            throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f369f) + " to anchor view " + view);
        }
        return this.f374k;
    }
}
