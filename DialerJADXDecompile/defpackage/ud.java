package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.widget.ActionMenuView;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: ud */
public final class ud extends sj implements iw {
    ug f;
    int g;
    boolean h;
    ui i;
    public ue j;
    uf k;
    final uj l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private final SparseBooleanArray r;
    private View s;
    private si t;

    public ud(Context context) {
        super(context, buf.bK, buf.bJ);
        this.r = new SparseBooleanArray();
        this.l = new uj(this);
    }

    public final void a(Context context, su suVar) {
        boolean z = true;
        super.a(context, suVar);
        Resources resources = context.getResources();
        rs a = rs.a(context);
        if (!this.n) {
            if (VERSION.SDK_INT < 19 && kz.a(ViewConfiguration.get(a.a))) {
                z = false;
            }
            this.m = z;
        }
        this.o = a.a.getResources().getDisplayMetrics().widthPixels / 2;
        this.g = a.a();
        int i = this.o;
        if (this.m) {
            if (this.f == null) {
                this.f = new ug(this, this.a);
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
                this.f.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f.getMeasuredWidth();
        } else {
            this.f = null;
        }
        this.p = i;
        this.q = (int) (56.0f * resources.getDisplayMetrics().density);
        this.s = null;
    }

    public final void c(boolean z) {
        this.m = true;
        this.n = true;
    }

    public final tl a(ViewGroup viewGroup) {
        tl tlVar = this.e;
        tl a = super.a(viewGroup);
        if (tlVar != a) {
            ((ActionMenuView) a).a(this);
        }
        return a;
    }

    public final View a(sy syVar, View view, ViewGroup viewGroup) {
        View actionView = syVar.getActionView();
        if (actionView == null || syVar.i()) {
            actionView = super.a(syVar, view, viewGroup);
        }
        actionView.setVisibility(syVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.a(layoutParams));
        }
        return actionView;
    }

    public final void a(sy syVar, tm tmVar) {
        tmVar.a(syVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) tmVar;
        actionMenuItemView.b = (ActionMenuView) this.e;
        if (this.t == null) {
            this.t = new si();
        }
        actionMenuItemView.c = this.t;
    }

    public final boolean a(sy syVar) {
        return syVar.f();
    }

    public final void b(boolean z) {
        int i;
        int i2 = 0;
        ((View) this.e).getParent();
        super.b(z);
        ((View) this.e).requestLayout();
        if (this.c != null) {
            su suVar = this.c;
            suVar.i();
            ArrayList arrayList = suVar.d;
            int size = arrayList.size();
            for (i = 0; i < size; i++) {
                iv ivVar = ((sy) arrayList.get(i)).d;
                if (ivVar != null) {
                    ivVar.a = this;
                }
            }
        }
        ArrayList j = this.c != null ? this.c.j() : null;
        if (this.m && j != null) {
            i = j.size();
            if (i == 1) {
                boolean z2;
                if (((sy) j.get(0)).isActionViewExpanded()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                i2 = z2;
            } else if (i > 0) {
                i2 = 1;
            }
        }
        if (i2 != 0) {
            if (this.f == null) {
                this.f = new ug(this, this.a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f.getParent();
            if (viewGroup != this.e) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.e;
                View view = this.f;
                LayoutParams a = ActionMenuView.a();
                a.a = true;
                actionMenuView.addView(view, a);
            }
        } else if (this.f != null && this.f.getParent() == this.e) {
            ((ViewGroup) this.e).removeView(this.f);
        }
        ((ActionMenuView) this.e).b = this.m;
    }

    public final boolean a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f) {
            return false;
        }
        return super.a(viewGroup, i);
    }

    public final boolean a(tr trVar) {
        if (!trVar.hasVisibleItems()) {
            return false;
        }
        View childAt;
        tr trVar2 = trVar;
        while (trVar2.k != this.c) {
            trVar2 = (tr) trVar2.k;
        }
        sy item = trVar2.getItem();
        ViewGroup viewGroup = (ViewGroup) this.e;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof tm) && ((tm) childAt).a() == item) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt == null) {
            return false;
        }
        boolean z;
        trVar.getItem().getItemId();
        int size = trVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item2 = trVar.getItem(i2);
            if (item2.isVisible() && item2.getIcon() != null) {
                z = true;
                break;
            }
        }
        z = false;
        this.j = new ue(this, this.b, trVar, childAt);
        this.j.a(z);
        if (this.j.b()) {
            super.a(trVar);
            return true;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }

    public final boolean b() {
        if (!this.m || f() || this.c == null || this.e == null || this.k != null || this.c.j().isEmpty()) {
            return false;
        }
        this.k = new uf(this, new ui(this, this.b, this.c, this.f, true));
        ((View) this.e).post(this.k);
        super.a(null);
        return true;
    }

    public final boolean c() {
        if (this.k == null || this.e == null) {
            th thVar = this.i;
            if (thVar == null) {
                return false;
            }
            thVar.c();
            return true;
        }
        ((View) this.e).removeCallbacks(this.k);
        this.k = null;
        return true;
    }

    public final boolean d() {
        return c() | e();
    }

    public final boolean e() {
        if (this.j == null) {
            return false;
        }
        this.j.c();
        return true;
    }

    public final boolean f() {
        return this.i != null && this.i.e();
    }

    public final boolean a() {
        int size;
        ArrayList arrayList;
        if (this.c != null) {
            ArrayList h = this.c.h();
            size = h.size();
            arrayList = h;
        } else {
            size = 0;
            arrayList = null;
        }
        int i = this.g;
        int i2 = this.p;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.e;
        int i3 = 0;
        int i4 = 0;
        Object obj = null;
        int i5 = 0;
        while (i5 < size) {
            int i6;
            sy syVar = (sy) arrayList.get(i5);
            if (syVar.h()) {
                i3++;
            } else if (syVar.g()) {
                i4++;
            } else {
                obj = 1;
            }
            if (this.h && syVar.isActionViewExpanded()) {
                i6 = 0;
            } else {
                i6 = i;
            }
            i5++;
            i = i6;
        }
        if (this.m && (r3 != null || i3 + i4 > i)) {
            i--;
        }
        i4 = i - i3;
        SparseBooleanArray sparseBooleanArray = this.r;
        sparseBooleanArray.clear();
        i5 = 0;
        i3 = i2;
        int i7 = i4;
        i4 = 0;
        while (i5 < size) {
            int measuredWidth;
            syVar = (sy) arrayList.get(i5);
            View a;
            if (syVar.h()) {
                a = a(syVar, this.s, viewGroup);
                if (this.s == null) {
                    this.s = a;
                }
                a.measure(makeMeasureSpec, makeMeasureSpec);
                measuredWidth = a.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i4 != 0) {
                    measuredWidth = i4;
                }
                i4 = syVar.getGroupId();
                if (i4 != 0) {
                    sparseBooleanArray.put(i4, true);
                }
                syVar.d(true);
                i6 = i3;
                i4 = i7;
            } else if (syVar.g()) {
                boolean z;
                int groupId = syVar.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId);
                boolean z3 = (i7 > 0 || z2) && i3 > 0;
                if (z3) {
                    a = a(syVar, this.s, viewGroup);
                    if (this.s == null) {
                        this.s = a;
                    }
                    a.measure(makeMeasureSpec, makeMeasureSpec);
                    measuredWidth = a.getMeasuredWidth();
                    i2 = i3 - measuredWidth;
                    if (i4 == 0) {
                        i3 = measuredWidth;
                    } else {
                        i3 = i4;
                    }
                    boolean z4 = (i2 + i3 > 0 ? 1 : 0) & z3;
                    i = i2;
                    z = z4;
                } else {
                    z = z3;
                    i = i3;
                    i3 = i4;
                }
                if (z && groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                    measuredWidth = i7;
                } else if (z2) {
                    sparseBooleanArray.put(groupId, false);
                    i4 = i7;
                    for (i7 = 0; i7 < i5; i7++) {
                        sy syVar2 = (sy) arrayList.get(i7);
                        if (syVar2.getGroupId() == groupId) {
                            if (syVar2.f()) {
                                i4++;
                            }
                            syVar2.d(false);
                        }
                    }
                    measuredWidth = i4;
                } else {
                    measuredWidth = i7;
                }
                if (z) {
                    measuredWidth--;
                }
                syVar.d(z);
                i6 = i;
                i4 = measuredWidth;
                measuredWidth = i3;
            } else {
                syVar.d(false);
                measuredWidth = i4;
                i6 = i3;
                i4 = i7;
            }
            i5++;
            i7 = i4;
            i3 = i6;
            i4 = measuredWidth;
        }
        return true;
    }

    public final void a(su suVar, boolean z) {
        d();
        super.a(suVar, z);
    }

    public final void a(boolean z) {
        if (z) {
            super.a(null);
        } else if (this.c != null) {
            this.c.a(false);
        }
    }

    public final void a(ActionMenuView actionMenuView) {
        this.e = actionMenuView;
        actionMenuView.a = this.c;
    }
}
