package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.widget.ActionMenuView;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;

public final class zh extends xn implements mc {
    private xm A;
    zk g;
    zm h;
    public zi i;
    zj j;
    final zn k = new zn(this);
    int l;
    private Drawable m;
    private boolean n;
    private boolean o;
    private boolean p;
    private int q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private int x;
    private final SparseBooleanArray y = new SparseBooleanArray();
    private View z;

    public zh(Context context) {
        super(context, gwb.bO, gwb.bN);
    }

    public void a(Context context, xy xyVar) {
        super.a(context, xyVar);
        Resources resources = context.getResources();
        ww a = ww.a(context);
        if (!this.p) {
            this.o = a.b();
        }
        if (!this.v) {
            this.q = a.c();
        }
        if (!this.t) {
            this.s = a.a();
        }
        int i = this.q;
        if (this.o) {
            if (this.g == null) {
                this.g = new zk(this, this.a);
                if (this.n) {
                    this.g.setImageDrawable(this.m);
                    this.m = null;
                    this.n = false;
                }
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
                this.g.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.g.getMeasuredWidth();
        } else {
            this.g = null;
        }
        this.r = i;
        this.x = (int) (56.0f * resources.getDisplayMetrics().density);
        this.z = null;
    }

    public void c() {
        if (!this.t) {
            this.s = ww.a(this.b).a();
        }
        if (this.c != null) {
            this.c.b(true);
        }
    }

    public void c(boolean z) {
        this.o = true;
        this.p = true;
    }

    public void d(boolean z) {
        this.w = z;
    }

    public yp a(ViewGroup viewGroup) {
        yp ypVar = this.f;
        yp a = super.a(viewGroup);
        if (ypVar != a) {
            ((ActionMenuView) a).a(this);
        }
        return a;
    }

    public View a(yc ycVar, View view, ViewGroup viewGroup) {
        View actionView = ycVar.getActionView();
        if (actionView == null || ycVar.m()) {
            actionView = super.a(ycVar, view, viewGroup);
        }
        actionView.setVisibility(ycVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.a(layoutParams));
        }
        return actionView;
    }

    public void a(yc ycVar, yq yqVar) {
        yqVar.a(ycVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) yqVar;
        actionMenuItemView.a((ActionMenuView) this.f);
        if (this.A == null) {
            this.A = new xm();
        }
        actionMenuItemView.a(this.A);
    }

    public boolean a(yc ycVar) {
        return ycVar.i();
    }

    public void b(boolean z) {
        int i;
        int i2 = 1;
        int i3 = 0;
        ((View) this.f).getParent();
        super.b(z);
        ((View) this.f).requestLayout();
        if (this.c != null) {
            ArrayList m = this.c.m();
            int size = m.size();
            for (i = 0; i < size; i++) {
                mb a = ((yc) m.get(i)).a();
                if (a != null) {
                    a.a(this);
                }
            }
        }
        ArrayList n = this.c != null ? this.c.n() : null;
        if (this.o && n != null) {
            i = n.size();
            if (i == 1) {
                int i4;
                if (((yc) n.get(0)).isActionViewExpanded()) {
                    i4 = 0;
                } else {
                    i4 = 1;
                }
                i3 = i4;
            } else {
                if (i <= 0) {
                    i2 = 0;
                }
                i3 = i2;
            }
        }
        if (i3 != 0) {
            if (this.g == null) {
                this.g = new zk(this, this.a);
            }
            ViewGroup viewGroup = (ViewGroup) this.g.getParent();
            if (viewGroup != this.f) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.g);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f;
                actionMenuView.addView(this.g, actionMenuView.c());
            }
        } else if (this.g != null && this.g.getParent() == this.f) {
            ((ViewGroup) this.f).removeView(this.g);
        }
        ((ActionMenuView) this.f).a(this.o);
    }

    public boolean a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.g) {
            return false;
        }
        return super.a(viewGroup, i);
    }

    public boolean a(yv yvVar) {
        if (!yvVar.hasVisibleItems()) {
            return false;
        }
        View childAt;
        yv yvVar2 = yvVar;
        while (yvVar2.u() != this.c) {
            yvVar2 = (yv) yvVar2.u();
        }
        yc item = yvVar2.getItem();
        ViewGroup viewGroup = (ViewGroup) this.f;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof yq) && ((yq) childAt).a() == item) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt == null) {
            return false;
        }
        boolean z;
        this.l = yvVar.getItem().getItemId();
        int size = yvVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item2 = yvVar.getItem(i2);
            if (item2.isVisible() && item2.getIcon() != null) {
                z = true;
                break;
            }
        }
        z = false;
        this.i = new zi(this, this.b, yvVar, childAt);
        this.i.a(z);
        this.i.a();
        super.a(yvVar);
        return true;
    }

    public boolean d() {
        if (!this.o || h() || this.c == null || this.f == null || this.j != null || this.c.n().isEmpty()) {
            return false;
        }
        this.j = new zj(this, new zm(this, this.b, this.c, this.g, true));
        ((View) this.f).post(this.j);
        super.a(null);
        return true;
    }

    public boolean e() {
        if (this.j == null || this.f == null) {
            yl ylVar = this.h;
            if (ylVar == null) {
                return false;
            }
            ylVar.d();
            return true;
        }
        ((View) this.f).removeCallbacks(this.j);
        this.j = null;
        return true;
    }

    public boolean f() {
        return e() | g();
    }

    public boolean g() {
        if (this.i == null) {
            return false;
        }
        this.i.d();
        return true;
    }

    public boolean h() {
        return this.h != null && this.h.f();
    }

    public boolean i() {
        return this.j != null || h();
    }

    public boolean b() {
        int size;
        ArrayList arrayList;
        int i;
        if (this.c != null) {
            ArrayList k = this.c.k();
            size = k.size();
            arrayList = k;
        } else {
            size = 0;
            arrayList = null;
        }
        int i2 = this.s;
        int i3 = this.r;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f;
        int i4 = 0;
        int i5 = 0;
        Object obj = null;
        int i6 = 0;
        while (i6 < size) {
            yc ycVar = (yc) arrayList.get(i6);
            if (ycVar.k()) {
                i4++;
            } else if (ycVar.j()) {
                i5++;
            } else {
                obj = 1;
            }
            if (this.w && ycVar.isActionViewExpanded()) {
                i = 0;
            } else {
                i = i2;
            }
            i6++;
            i2 = i;
        }
        if (this.o && (r4 != null || i4 + i5 > i2)) {
            i2--;
        }
        i6 = i2 - i4;
        SparseBooleanArray sparseBooleanArray = this.y;
        sparseBooleanArray.clear();
        i = 0;
        if (this.u) {
            i = i3 / this.x;
            i5 = ((i3 % this.x) / i) + this.x;
        } else {
            i5 = 0;
        }
        int i7 = 0;
        i2 = 0;
        int i8 = i;
        while (i7 < size) {
            ycVar = (yc) arrayList.get(i7);
            int i9;
            if (ycVar.k()) {
                View a = a(ycVar, this.z, viewGroup);
                if (this.z == null) {
                    this.z = a;
                }
                if (this.u) {
                    i8 -= ActionMenuView.a(a, i5, i8, makeMeasureSpec, 0);
                } else {
                    a.measure(makeMeasureSpec, makeMeasureSpec);
                }
                i4 = a.getMeasuredWidth();
                i9 = i3 - i4;
                if (i2 != 0) {
                    i4 = i2;
                }
                i2 = ycVar.getGroupId();
                if (i2 != 0) {
                    sparseBooleanArray.put(i2, true);
                }
                ycVar.d(true);
                i = i9;
                i2 = i6;
            } else if (ycVar.j()) {
                boolean z;
                int groupId = ycVar.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId);
                boolean z3 = (i6 > 0 || z2) && i3 > 0 && (!this.u || i8 > 0);
                if (z3) {
                    View a2 = a(ycVar, this.z, viewGroup);
                    if (this.z == null) {
                        this.z = a2;
                    }
                    boolean z4;
                    if (this.u) {
                        int a3 = ActionMenuView.a(a2, i5, i8, makeMeasureSpec, 0);
                        i9 = i8 - a3;
                        if (a3 == 0) {
                            i8 = 0;
                        } else {
                            z4 = z3;
                        }
                        i4 = i9;
                    } else {
                        a2.measure(makeMeasureSpec, makeMeasureSpec);
                        boolean z5 = z3;
                        i4 = i8;
                        z4 = z5;
                    }
                    i9 = a2.getMeasuredWidth();
                    i3 -= i9;
                    if (i2 == 0) {
                        i2 = i9;
                    }
                    if (this.u) {
                        z = i8 & (i3 >= 0 ? 1 : 0);
                        i9 = i2;
                        i2 = i4;
                    } else {
                        z = i8 & (i3 + i2 > 0 ? 1 : 0);
                        i9 = i2;
                        i2 = i4;
                    }
                } else {
                    z = z3;
                    i9 = i2;
                    i2 = i8;
                }
                if (z && groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                    i8 = i6;
                } else if (z2) {
                    sparseBooleanArray.put(groupId, false);
                    i4 = i6;
                    for (i6 = 0; i6 < i7; i6++) {
                        yc ycVar2 = (yc) arrayList.get(i6);
                        if (ycVar2.getGroupId() == groupId) {
                            if (ycVar2.i()) {
                                i4++;
                            }
                            ycVar2.d(false);
                        }
                    }
                    i8 = i4;
                } else {
                    i8 = i6;
                }
                if (z) {
                    i8--;
                }
                ycVar.d(z);
                i4 = i9;
                i = i3;
                int i10 = i2;
                i2 = i8;
                i8 = i10;
            } else {
                ycVar.d(false);
                i4 = i2;
                i = i3;
                i2 = i6;
            }
            i7++;
            i3 = i;
            i6 = i2;
            i2 = i4;
        }
        return true;
    }

    public void a(xy xyVar, boolean z) {
        f();
        super.a(xyVar, z);
    }

    public void a(boolean z) {
        if (z) {
            super.a(null);
        } else if (this.c != null) {
            this.c.a(false);
        }
    }

    public void a(ActionMenuView actionMenuView) {
        this.f = actionMenuView;
        actionMenuView.a(this.c);
    }
}
