package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

final class xq extends yk implements OnKeyListener, OnDismissListener, yn {
    final Handler a;
    final List<xu> b = new ArrayList();
    View c;
    boolean d;
    private final Context e;
    private final int f;
    private final int g;
    private final int h;
    private final boolean i;
    private final List<xy> j = new LinkedList();
    private final OnGlobalLayoutListener k = new xr(this);
    private final adn l = new xs(this);
    private int m = 0;
    private int n = 0;
    private View o;
    private int p;
    private boolean q;
    private boolean r;
    private int s;
    private int t;
    private boolean u;
    private boolean v;
    private yo w;
    private ViewTreeObserver x;
    private OnDismissListener y;

    public xq(Context context, View view, int i, int i2, boolean z) {
        this.e = context;
        this.o = view;
        this.g = i;
        this.h = i2;
        this.i = z;
        this.u = false;
        this.p = h();
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(gwb.ar));
        this.a = new Handler();
    }

    public void a(boolean z) {
        this.u = z;
    }

    public void a() {
        if (!d()) {
            for (xy c : this.j) {
                c(c);
            }
            this.j.clear();
            this.c = this.o;
            if (this.c != null) {
                Object obj = this.x == null ? 1 : null;
                this.x = this.c.getViewTreeObserver();
                if (obj != null) {
                    this.x.addOnGlobalLayoutListener(this.k);
                }
            }
        }
    }

    public void c() {
        int size = this.b.size();
        if (size > 0) {
            xu[] xuVarArr = (xu[]) this.b.toArray(new xu[size]);
            for (size--; size >= 0; size--) {
                xu xuVar = xuVarArr[size];
                if (xuVar.a.d()) {
                    xuVar.a.c();
                }
            }
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        c();
        return true;
    }

    private int h() {
        if (oa.d(this.o) == 1) {
            return 0;
        }
        return 1;
    }

    public void a(xy xyVar) {
        xyVar.a((yn) this, this.e);
        if (d()) {
            c(xyVar);
        } else {
            this.j.add(xyVar);
        }
    }

    private void c(xy xyVar) {
        int size;
        int i;
        View view;
        xu xuVar;
        LayoutInflater from = LayoutInflater.from(this.e);
        Object xxVar = new xx(xyVar, from, this.i);
        if (!d() && this.u) {
            xxVar.a(true);
        } else if (d()) {
            xxVar.a(yk.b(xyVar));
        }
        int a = yk.a(xxVar, null, this.e, this.f);
        ado ado = new ado(this.e, null, this.g, this.h);
        ado.a(this.l);
        ado.a(this);
        ado.a(this);
        ado.a(this.o);
        ado.e(this.n);
        ado.a(true);
        ado.a(xxVar);
        ado.g(a);
        ado.e(this.n);
        if (this.b.size() > 0) {
            int i2;
            MenuItem menuItem;
            View view2;
            xu xuVar2 = (xu) this.b.get(this.b.size() - 1);
            xy xyVar2 = xuVar2.b;
            size = xyVar2.size();
            for (i2 = 0; i2 < size; i2++) {
                MenuItem item = xyVar2.getItem(i2);
                if (item.hasSubMenu() && xyVar == item.getSubMenu()) {
                    menuItem = item;
                    break;
                }
            }
            menuItem = null;
            if (menuItem == null) {
                view2 = null;
            } else {
                xx xxVar2;
                ListView a2 = xuVar2.a();
                ListAdapter adapter = a2.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i2 = headerViewListAdapter.getHeadersCount();
                    xxVar2 = (xx) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i2 = 0;
                    xxVar2 = (xx) adapter;
                }
                int count = xxVar2.getCount();
                for (int i3 = 0; i3 < count; i3++) {
                    if (menuItem == xxVar2.a(i3)) {
                        i = i3;
                        break;
                    }
                }
                i = -1;
                if (i == -1) {
                    view2 = null;
                } else {
                    i = (i + i2) - a2.getFirstVisiblePosition();
                    if (i < 0 || i >= a2.getChildCount()) {
                        view2 = null;
                    } else {
                        view2 = a2.getChildAt(i);
                    }
                }
            }
            view = view2;
            xuVar = xuVar2;
        } else {
            view = null;
            xuVar = null;
        }
        if (view != null) {
            int i4;
            ado.b(false);
            ado.a(null);
            ListView a3 = ((xu) this.b.get(this.b.size() - 1)).a();
            int[] iArr = new int[2];
            a3.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.c.getWindowVisibleDisplayFrame(rect);
            if (this.p == 1) {
                if ((a3.getWidth() + iArr[0]) + a <= rect.right) {
                    i = 1;
                }
                i = 0;
            } else {
                if (iArr[0] - a < 0) {
                    i = 1;
                }
                i = 0;
            }
            xxVar = i == 1 ? 1 : null;
            this.p = i;
            iArr = new int[2];
            view.getLocationInWindow(iArr);
            size = xuVar.a.j() + iArr[0];
            i = iArr[1] + xuVar.a.k();
            if ((this.n & 5) == 5) {
                if (xxVar != null) {
                    i4 = size + a;
                } else {
                    i4 = size - view.getWidth();
                }
            } else if (xxVar != null) {
                i4 = view.getWidth() + size;
            } else {
                i4 = size - a;
            }
            ado.c(i4);
            ado.d(i);
        } else {
            if (this.q) {
                ado.c(this.s);
            }
            if (this.r) {
                ado.d(this.t);
            }
            ado.a(g());
        }
        this.b.add(new xu(ado, xyVar, this.p));
        ado.a();
        if (xuVar == null && this.v && xyVar.o() != null) {
            ViewGroup e = ado.e();
            FrameLayout frameLayout = (FrameLayout) from.inflate(gwb.bX, e, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            frameLayout.setEnabled(false);
            textView.setText(xyVar.o());
            e.addHeaderView(frameLayout, null, false);
            ado.a();
        }
    }

    public boolean d() {
        return this.b.size() > 0 && ((xu) this.b.get(0)).a.d();
    }

    public void onDismiss() {
        xu xuVar;
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            xuVar = (xu) this.b.get(i);
            if (!xuVar.a.d()) {
                break;
            }
        }
        xuVar = null;
        if (xuVar != null) {
            xuVar.b.a(false);
        }
    }

    public void b(boolean z) {
        for (xu a : this.b) {
            yk.a(a.a().getAdapter()).notifyDataSetChanged();
        }
    }

    public void a(yo yoVar) {
        this.w = yoVar;
    }

    public boolean a(yv yvVar) {
        for (xu xuVar : this.b) {
            if (yvVar == xuVar.b) {
                xuVar.a().requestFocus();
                return true;
            }
        }
        if (!yvVar.hasVisibleItems()) {
            return false;
        }
        a((xy) yvVar);
        if (this.w != null) {
            this.w.a(yvVar);
        }
        return true;
    }

    public boolean b() {
        return false;
    }

    public void a(int i) {
        if (this.m != i) {
            this.m = i;
            this.n = mj.a(i, oa.d(this.o));
        }
    }

    public void a(View view) {
        if (this.o != view) {
            this.o = view;
            this.n = mj.a(this.m, oa.d(this.o));
        }
    }

    public void a(OnDismissListener onDismissListener) {
        this.y = onDismissListener;
    }

    public ListView e() {
        if (this.b.isEmpty()) {
            return null;
        }
        return ((xu) this.b.get(this.b.size() - 1)).a();
    }

    public void b(int i) {
        this.q = true;
        this.s = i;
    }

    public void c(int i) {
        this.r = true;
        this.t = i;
    }

    public void c(boolean z) {
        this.v = z;
    }

    protected boolean f() {
        return false;
    }

    public void a(xy xyVar, boolean z) {
        int size = this.b.size();
        int i = 0;
        while (i < size) {
            if (xyVar == ((xu) this.b.get(i)).b) {
                break;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            int i2 = i + 1;
            if (i2 < this.b.size()) {
                ((xu) this.b.get(i2)).b.a(false);
            }
            xu xuVar = (xu) this.b.remove(i);
            xuVar.b.b((yn) this);
            if (this.d) {
                xuVar.a.b(null);
                xuVar.a.b(0);
            }
            xuVar.a.c();
            i = this.b.size();
            if (i > 0) {
                this.p = ((xu) this.b.get(i - 1)).c;
            } else {
                this.p = h();
            }
            if (i == 0) {
                c();
                if (this.w != null) {
                    this.w.a(xyVar, true);
                }
                if (this.x != null) {
                    if (this.x.isAlive()) {
                        this.x.removeGlobalOnLayoutListener(this.k);
                    }
                    this.x = null;
                }
                this.y.onDismiss();
            } else if (z) {
                ((xu) this.b.get(0)).b.a(false);
            }
        }
    }
}
