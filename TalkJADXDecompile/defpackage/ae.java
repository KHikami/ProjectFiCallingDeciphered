package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import o;
import oa;

/* renamed from: ae */
public final class ae extends MarginLayoutParams {
    gwb a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public View k;
    public View l;
    final Rect m;
    Object n;
    private boolean o;
    private boolean p;
    private boolean q;

    public ae(int i, int i2) {
        super(-2, -2);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.m = new Rect();
    }

    public ae(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.m = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.E);
        this.c = obtainStyledAttributes.getInteger(o.F, 0);
        this.f = obtainStyledAttributes.getResourceId(o.G, -1);
        this.d = obtainStyledAttributes.getInteger(o.H, 0);
        this.e = obtainStyledAttributes.getInteger(o.L, -1);
        this.g = obtainStyledAttributes.getInt(o.K, 0);
        this.h = obtainStyledAttributes.getInt(o.J, 0);
        this.b = obtainStyledAttributes.hasValue(o.I);
        if (this.b) {
            this.a = CoordinatorLayout.a(context, attributeSet, obtainStyledAttributes.getString(o.I));
        }
        obtainStyledAttributes.recycle();
        if (this.a != null) {
            this.a.a(this);
        }
    }

    public ae(ae aeVar) {
        super(aeVar);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.m = new Rect();
    }

    public ae(MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.m = new Rect();
    }

    public ae(LayoutParams layoutParams) {
        super(layoutParams);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.m = new Rect();
    }

    public gwb a() {
        return this.a;
    }

    public void a(gwb gwb) {
        if (this.a != gwb) {
            this.a = gwb;
            this.n = null;
            this.b = true;
            if (gwb != null) {
                gwb.a(this);
            }
        }
    }

    public void a(Rect rect) {
        this.m.set(rect);
    }

    public Rect b() {
        return this.m;
    }

    public boolean c() {
        return this.k == null && this.f != -1;
    }

    public boolean d() {
        if (this.a == null) {
            this.o = false;
        }
        return this.o;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, View view) {
        if (this.o) {
            return true;
        }
        boolean c = (this.a != null ? this.a.c(coordinatorLayout, view) : 0) | this.o;
        this.o = c;
        return c;
    }

    public void e() {
        this.o = false;
    }

    public void f() {
        this.p = false;
    }

    public void a(boolean z) {
        this.p = z;
    }

    public boolean g() {
        return this.p;
    }

    public boolean h() {
        return this.q;
    }

    public void b(boolean z) {
        this.q = z;
    }

    public void i() {
        this.q = false;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view2 != this.l) {
            Object obj;
            int d = oa.d(coordinatorLayout);
            int a = mj.a(((ae) view2.getLayoutParams()).g, d);
            if (a == 0 || (mj.a(this.h, d) & a) != a) {
                obj = null;
            } else {
                obj = 1;
            }
            if (obj == null && (this.a == null || !this.a.a_(view2))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View b(android.support.design.widget.CoordinatorLayout r6, android.view.View r7) {
        /*
        r5 = this;
        r3 = 0;
        r2 = 0;
        r0 = r5.f;
        r1 = -1;
        if (r0 != r1) goto L_0x000d;
    L_0x0007:
        r5.l = r2;
        r5.k = r2;
        r0 = r2;
    L_0x000c:
        return r0;
    L_0x000d:
        r0 = r5.k;
        if (r0 == 0) goto L_0x001e;
    L_0x0011:
        r0 = r5.k;
        r0 = r0.getId();
        r1 = r5.f;
        if (r0 == r1) goto L_0x003b;
    L_0x001b:
        r0 = r3;
    L_0x001c:
        if (r0 != 0) goto L_0x0038;
    L_0x001e:
        r0 = r5.f;
        r0 = r6.findViewById(r0);
        r5.k = r0;
        r0 = r5.k;
        if (r0 == 0) goto L_0x0097;
    L_0x002a:
        r0 = r5.k;
        if (r0 != r6) goto L_0x0067;
    L_0x002e:
        r0 = r6.isInEditMode();
        if (r0 == 0) goto L_0x005f;
    L_0x0034:
        r5.l = r2;
        r5.k = r2;
    L_0x0038:
        r0 = r5.k;
        goto L_0x000c;
    L_0x003b:
        r0 = r5.k;
        r1 = r5.k;
        r1 = r1.getParent();
    L_0x0043:
        if (r1 == r6) goto L_0x005b;
    L_0x0045:
        if (r1 == 0) goto L_0x0049;
    L_0x0047:
        if (r1 != r7) goto L_0x004f;
    L_0x0049:
        r5.l = r2;
        r5.k = r2;
        r0 = r3;
        goto L_0x001c;
    L_0x004f:
        r4 = r1 instanceof android.view.View;
        if (r4 == 0) goto L_0x0056;
    L_0x0053:
        r0 = r1;
        r0 = (android.view.View) r0;
    L_0x0056:
        r1 = r1.getParent();
        goto L_0x0043;
    L_0x005b:
        r5.l = r0;
        r0 = 1;
        goto L_0x001c;
    L_0x005f:
        r0 = new java.lang.IllegalStateException;
        r1 = "View can not be anchored to the the parent CoordinatorLayout";
        r0.<init>(r1);
        throw r0;
    L_0x0067:
        r0 = r5.k;
        r1 = r5.k;
        r1 = r1.getParent();
    L_0x006f:
        if (r1 == r6) goto L_0x0094;
    L_0x0071:
        if (r1 == 0) goto L_0x0094;
    L_0x0073:
        if (r1 != r7) goto L_0x0088;
    L_0x0075:
        r0 = r6.isInEditMode();
        if (r0 == 0) goto L_0x0080;
    L_0x007b:
        r5.l = r2;
        r5.k = r2;
        goto L_0x0038;
    L_0x0080:
        r0 = new java.lang.IllegalStateException;
        r1 = "Anchor must not be a descendant of the anchored view";
        r0.<init>(r1);
        throw r0;
    L_0x0088:
        r3 = r1 instanceof android.view.View;
        if (r3 == 0) goto L_0x008f;
    L_0x008c:
        r0 = r1;
        r0 = (android.view.View) r0;
    L_0x008f:
        r1 = r1.getParent();
        goto L_0x006f;
    L_0x0094:
        r5.l = r0;
        goto L_0x0038;
    L_0x0097:
        r0 = r6.isInEditMode();
        if (r0 == 0) goto L_0x00a2;
    L_0x009d:
        r5.l = r2;
        r5.k = r2;
        goto L_0x0038;
    L_0x00a2:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r2 = "Could not find CoordinatorLayout descendant view with id ";
        r1.<init>(r2);
        r2 = r6.getResources();
        r3 = r5.f;
        r2 = r2.getResourceName(r3);
        r1 = r1.append(r2);
        r2 = " to anchor view ";
        r1 = r1.append(r2);
        r1 = r1.append(r7);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.b(android.support.design.widget.CoordinatorLayout, android.view.View):android.view.View");
    }
}
