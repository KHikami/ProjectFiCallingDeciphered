package p000;

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
    private xm f35884A;
    zk f35885g;
    zm f35886h;
    public zi f35887i;
    zj f35888j;
    final zn f35889k = new zn(this);
    int f35890l;
    private Drawable f35891m;
    private boolean f35892n;
    private boolean f35893o;
    private boolean f35894p;
    private int f35895q;
    private int f35896r;
    private int f35897s;
    private boolean f35898t;
    private boolean f35899u;
    private boolean f35900v;
    private boolean f35901w;
    private int f35902x;
    private final SparseBooleanArray f35903y = new SparseBooleanArray();
    private View f35904z;

    public zh(Context context) {
        super(context, gwb.bO, gwb.bN);
    }

    public void mo4509a(Context context, xy xyVar) {
        super.mo4509a(context, xyVar);
        Resources resources = context.getResources();
        ww a = ww.m41243a(context);
        if (!this.f35894p) {
            this.f35893o = a.m41245b();
        }
        if (!this.f35900v) {
            this.f35895q = a.m41246c();
        }
        if (!this.f35898t) {
            this.f35897s = a.m41244a();
        }
        int i = this.f35895q;
        if (this.f35893o) {
            if (this.f35885g == null) {
                this.f35885g = new zk(this, this.a);
                if (this.f35892n) {
                    this.f35885g.setImageDrawable(this.f35891m);
                    this.f35891m = null;
                    this.f35892n = false;
                }
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
                this.f35885g.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f35885g.getMeasuredWidth();
        } else {
            this.f35885g = null;
        }
        this.f35896r = i;
        this.f35902x = (int) (56.0f * resources.getDisplayMetrics().density);
        this.f35904z = null;
    }

    public void m41577c() {
        if (!this.f35898t) {
            this.f35897s = ww.m41243a(this.b).m41244a();
        }
        if (this.c != null) {
            this.c.m41425b(true);
        }
    }

    public void m41578c(boolean z) {
        this.f35893o = true;
        this.f35894p = true;
    }

    public void m41579d(boolean z) {
        this.f35901w = z;
    }

    public yp mo4545a(ViewGroup viewGroup) {
        yp ypVar = this.f;
        yp a = super.mo4545a(viewGroup);
        if (ypVar != a) {
            ((ActionMenuView) a).a(this);
        }
        return a;
    }

    public View mo4544a(yc ycVar, View view, ViewGroup viewGroup) {
        View actionView = ycVar.getActionView();
        if (actionView == null || ycVar.m41494m()) {
            actionView = super.mo4544a(ycVar, view, viewGroup);
        }
        actionView.setVisibility(ycVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.a(layoutParams));
        }
        return actionView;
    }

    public void mo4546a(yc ycVar, yq yqVar) {
        yqVar.m41523a(ycVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) yqVar;
        actionMenuItemView.a((ActionMenuView) this.f);
        if (this.f35884A == null) {
            this.f35884A = new xm();
        }
        actionMenuItemView.a(this.f35884A);
    }

    public boolean mo4548a(yc ycVar) {
        return ycVar.m41490i();
    }

    public void mo4513b(boolean z) {
        int i;
        int i2 = 1;
        int i3 = 0;
        ((View) this.f).getParent();
        super.mo4513b(z);
        ((View) this.f).requestLayout();
        if (this.c != null) {
            ArrayList m = this.c.m41442m();
            int size = m.size();
            for (i = 0; i < size; i++) {
                mb a = ((yc) m.get(i)).m41475a();
                if (a != null) {
                    a.a(this);
                }
            }
        }
        ArrayList n = this.c != null ? this.c.m41443n() : null;
        if (this.f35893o && n != null) {
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
            if (this.f35885g == null) {
                this.f35885g = new zk(this, this.a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f35885g.getParent();
            if (viewGroup != this.f) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f35885g);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f;
                actionMenuView.addView(this.f35885g, actionMenuView.c());
            }
        } else if (this.f35885g != null && this.f35885g.getParent() == this.f) {
            ((ViewGroup) this.f).removeView(this.f35885g);
        }
        ((ActionMenuView) this.f).a(this.f35893o);
    }

    public boolean mo4547a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f35885g) {
            return false;
        }
        return super.mo4547a(viewGroup, i);
    }

    public boolean mo4512a(yv yvVar) {
        if (!yvVar.hasVisibleItems()) {
            return false;
        }
        View childAt;
        yv yvVar2 = yvVar;
        while (yvVar2.m41550u() != this.c) {
            yvVar2 = (yv) yvVar2.m41550u();
        }
        yc item = yvVar2.getItem();
        ViewGroup viewGroup = (ViewGroup) this.f;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof yq) && ((yq) childAt).m41522a() == item) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt == null) {
            return false;
        }
        boolean z;
        this.f35890l = yvVar.getItem().getItemId();
        int size = yvVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item2 = yvVar.getItem(i2);
            if (item2.isVisible() && item2.getIcon() != null) {
                z = true;
                break;
            }
        }
        z = false;
        this.f35887i = new zi(this, this.b, yvVar, childAt);
        this.f35887i.m41514a(z);
        this.f35887i.m41509a();
        super.mo4512a(yvVar);
        return true;
    }

    public boolean m41580d() {
        if (!this.f35893o || m41584h() || this.c == null || this.f == null || this.f35888j != null || this.c.m41443n().isEmpty()) {
            return false;
        }
        this.f35888j = new zj(this, new zm(this, this.b, this.c, this.f35885g, true));
        ((View) this.f).post(this.f35888j);
        super.mo4512a(null);
        return true;
    }

    public boolean m41581e() {
        if (this.f35888j == null || this.f == null) {
            yl ylVar = this.f35886h;
            if (ylVar == null) {
                return false;
            }
            ylVar.m41518d();
            return true;
        }
        ((View) this.f).removeCallbacks(this.f35888j);
        this.f35888j = null;
        return true;
    }

    public boolean m41582f() {
        return m41581e() | m41583g();
    }

    public boolean m41583g() {
        if (this.f35887i == null) {
            return false;
        }
        this.f35887i.m41518d();
        return true;
    }

    public boolean m41584h() {
        return this.f35886h != null && this.f35886h.m41520f();
    }

    public boolean m41585i() {
        return this.f35888j != null || m41584h();
    }

    public boolean mo4514b() {
        int size;
        ArrayList arrayList;
        int i;
        if (this.c != null) {
            ArrayList k = this.c.m41440k();
            size = k.size();
            arrayList = k;
        } else {
            size = 0;
            arrayList = null;
        }
        int i2 = this.f35897s;
        int i3 = this.f35896r;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f;
        int i4 = 0;
        int i5 = 0;
        Object obj = null;
        int i6 = 0;
        while (i6 < size) {
            yc ycVar = (yc) arrayList.get(i6);
            if (ycVar.m41492k()) {
                i4++;
            } else if (ycVar.m41491j()) {
                i5++;
            } else {
                obj = 1;
            }
            if (this.f35901w && ycVar.isActionViewExpanded()) {
                i = 0;
            } else {
                i = i2;
            }
            i6++;
            i2 = i;
        }
        if (this.f35893o && (r4 != null || i4 + i5 > i2)) {
            i2--;
        }
        i6 = i2 - i4;
        SparseBooleanArray sparseBooleanArray = this.f35903y;
        sparseBooleanArray.clear();
        i = 0;
        if (this.f35899u) {
            i = i3 / this.f35902x;
            i5 = ((i3 % this.f35902x) / i) + this.f35902x;
        } else {
            i5 = 0;
        }
        int i7 = 0;
        i2 = 0;
        int i8 = i;
        while (i7 < size) {
            ycVar = (yc) arrayList.get(i7);
            int i9;
            if (ycVar.m41492k()) {
                View a = mo4544a(ycVar, this.f35904z, viewGroup);
                if (this.f35904z == null) {
                    this.f35904z = a;
                }
                if (this.f35899u) {
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
                ycVar.m41484d(true);
                i = i9;
                i2 = i6;
            } else if (ycVar.m41491j()) {
                boolean z;
                int groupId = ycVar.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId);
                boolean z3 = (i6 > 0 || z2) && i3 > 0 && (!this.f35899u || i8 > 0);
                if (z3) {
                    View a2 = mo4544a(ycVar, this.f35904z, viewGroup);
                    if (this.f35904z == null) {
                        this.f35904z = a2;
                    }
                    boolean z4;
                    if (this.f35899u) {
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
                    if (this.f35899u) {
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
                            if (ycVar2.m41490i()) {
                                i4++;
                            }
                            ycVar2.m41484d(false);
                        }
                    }
                    i8 = i4;
                } else {
                    i8 = i6;
                }
                if (z) {
                    i8--;
                }
                ycVar.m41484d(z);
                i4 = i9;
                i = i3;
                int i10 = i2;
                i2 = i8;
                i8 = i10;
            } else {
                ycVar.m41484d(false);
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

    public void mo4510a(xy xyVar, boolean z) {
        m41582f();
        super.mo4510a(xyVar, z);
    }

    public void m41571a(boolean z) {
        if (z) {
            super.mo4512a(null);
        } else if (this.c != null) {
            this.c.m41417a(false);
        }
    }

    public void m41568a(ActionMenuView actionMenuView) {
        this.f = actionMenuView;
        actionMenuView.a(this.c);
    }
}
