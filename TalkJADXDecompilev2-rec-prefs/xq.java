package p000;

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
    final Handler f35708a;
    final List<xu> f35709b = new ArrayList();
    View f35710c;
    boolean f35711d;
    private final Context f35712e;
    private final int f35713f;
    private final int f35714g;
    private final int f35715h;
    private final boolean f35716i;
    private final List<xy> f35717j = new LinkedList();
    private final OnGlobalLayoutListener f35718k = new xr(this);
    private final adn f35719l = new xs(this);
    private int f35720m = 0;
    private int f35721n = 0;
    private View f35722o;
    private int f35723p;
    private boolean f35724q;
    private boolean f35725r;
    private int f35726s;
    private int f35727t;
    private boolean f35728u;
    private boolean f35729v;
    private yo f35730w;
    private ViewTreeObserver f35731x;
    private OnDismissListener f35732y;

    public xq(Context context, View view, int i, int i2, boolean z) {
        this.f35712e = context;
        this.f35722o = view;
        this.f35714g = i;
        this.f35715h = i2;
        this.f35716i = z;
        this.f35728u = false;
        this.f35723p = m41362h();
        Resources resources = context.getResources();
        this.f35713f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(gwb.ar));
        this.f35708a = new Handler();
    }

    public void mo4522a(boolean z) {
        this.f35728u = z;
    }

    public void mo4517a() {
        if (!mo4527d()) {
            for (xy c : this.f35717j) {
                m41361c(c);
            }
            this.f35717j.clear();
            this.f35710c = this.f35722o;
            if (this.f35710c != null) {
                Object obj = this.f35731x == null ? 1 : null;
                this.f35731x = this.f35710c.getViewTreeObserver();
                if (obj != null) {
                    this.f35731x.addOnGlobalLayoutListener(this.f35718k);
                }
            }
        }
    }

    public void mo4524c() {
        int size = this.f35709b.size();
        if (size > 0) {
            xu[] xuVarArr = (xu[]) this.f35709b.toArray(new xu[size]);
            for (size--; size >= 0; size--) {
                xu xuVar = xuVarArr[size];
                if (xuVar.f35739a.d()) {
                    xuVar.f35739a.c();
                }
            }
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        mo4524c();
        return true;
    }

    private int m41362h() {
        if (oa.m37351d(this.f35722o) == 1) {
            return 0;
        }
        return 1;
    }

    public void mo4521a(xy xyVar) {
        xyVar.m41416a((yn) this, this.f35712e);
        if (mo4527d()) {
            m41361c(xyVar);
        } else {
            this.f35717j.add(xyVar);
        }
    }

    private void m41361c(xy xyVar) {
        int size;
        int i;
        View view;
        xu xuVar;
        LayoutInflater from = LayoutInflater.from(this.f35712e);
        Object xxVar = new xx(xyVar, from, this.f35716i);
        if (!mo4527d() && this.f35728u) {
            xxVar.m41399a(true);
        } else if (mo4527d()) {
            xxVar.m41399a(yk.m41346b(xyVar));
        }
        int a = yk.m41344a(xxVar, null, this.f35712e, this.f35713f);
        ado ado = new ado(this.f35712e, null, this.f35714g, this.f35715h);
        ado.a(this.f35719l);
        ado.a(this);
        ado.a(this);
        ado.a(this.f35722o);
        ado.e(this.f35721n);
        ado.a(true);
        ado.a(xxVar);
        ado.g(a);
        ado.e(this.f35721n);
        if (this.f35709b.size() > 0) {
            int i2;
            MenuItem menuItem;
            View view2;
            xu xuVar2 = (xu) this.f35709b.get(this.f35709b.size() - 1);
            xy xyVar2 = xuVar2.f35740b;
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
                ListView a2 = xuVar2.m41383a();
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
                    if (menuItem == xxVar2.m41398a(i3)) {
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
            ListView a3 = ((xu) this.f35709b.get(this.f35709b.size() - 1)).m41383a();
            int[] iArr = new int[2];
            a3.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.f35710c.getWindowVisibleDisplayFrame(rect);
            if (this.f35723p == 1) {
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
            this.f35723p = i;
            iArr = new int[2];
            view.getLocationInWindow(iArr);
            size = xuVar.f35739a.j() + iArr[0];
            i = iArr[1] + xuVar.f35739a.k();
            if ((this.f35721n & 5) == 5) {
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
            if (this.f35724q) {
                ado.c(this.f35726s);
            }
            if (this.f35725r) {
                ado.d(this.f35727t);
            }
            ado.a(m41360g());
        }
        this.f35709b.add(new xu(ado, xyVar, this.f35723p));
        ado.a();
        if (xuVar == null && this.f35729v && xyVar.m41444o() != null) {
            ViewGroup e = ado.e();
            FrameLayout frameLayout = (FrameLayout) from.inflate(gwb.bX, e, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            frameLayout.setEnabled(false);
            textView.setText(xyVar.m41444o());
            e.addHeaderView(frameLayout, null, false);
            ado.a();
        }
    }

    public boolean mo4527d() {
        return this.f35709b.size() > 0 && ((xu) this.f35709b.get(0)).f35739a.d();
    }

    public void onDismiss() {
        xu xuVar;
        int size = this.f35709b.size();
        for (int i = 0; i < size; i++) {
            xuVar = (xu) this.f35709b.get(i);
            if (!xuVar.f35739a.d()) {
                break;
            }
        }
        xuVar = null;
        if (xuVar != null) {
            xuVar.f35740b.m41417a(false);
        }
    }

    public void mo4513b(boolean z) {
        for (xu a : this.f35709b) {
            yk.m41345a(a.m41383a().getAdapter()).notifyDataSetChanged();
        }
    }

    public void mo4511a(yo yoVar) {
        this.f35730w = yoVar;
    }

    public boolean mo4512a(yv yvVar) {
        for (xu xuVar : this.f35709b) {
            if (yvVar == xuVar.f35740b) {
                xuVar.m41383a().requestFocus();
                return true;
            }
        }
        if (!yvVar.hasVisibleItems()) {
            return false;
        }
        mo4521a((xy) yvVar);
        if (this.f35730w != null) {
            this.f35730w.mo4442a(yvVar);
        }
        return true;
    }

    public boolean mo4514b() {
        return false;
    }

    public void mo4518a(int i) {
        if (this.f35720m != i) {
            this.f35720m = i;
            this.f35721n = mj.a(i, oa.m37351d(this.f35722o));
        }
    }

    public void mo4519a(View view) {
        if (this.f35722o != view) {
            this.f35722o = view;
            this.f35721n = mj.a(this.f35720m, oa.m37351d(this.f35722o));
        }
    }

    public void mo4520a(OnDismissListener onDismissListener) {
        this.f35732y = onDismissListener;
    }

    public ListView mo4528e() {
        if (this.f35709b.isEmpty()) {
            return null;
        }
        return ((xu) this.f35709b.get(this.f35709b.size() - 1)).m41383a();
    }

    public void mo4523b(int i) {
        this.f35724q = true;
        this.f35726s = i;
    }

    public void mo4525c(int i) {
        this.f35725r = true;
        this.f35727t = i;
    }

    public void mo4526c(boolean z) {
        this.f35729v = z;
    }

    protected boolean mo4529f() {
        return false;
    }

    public void mo4510a(xy xyVar, boolean z) {
        int size = this.f35709b.size();
        int i = 0;
        while (i < size) {
            if (xyVar == ((xu) this.f35709b.get(i)).f35740b) {
                break;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            int i2 = i + 1;
            if (i2 < this.f35709b.size()) {
                ((xu) this.f35709b.get(i2)).f35740b.m41417a(false);
            }
            xu xuVar = (xu) this.f35709b.remove(i);
            xuVar.f35740b.m41424b((yn) this);
            if (this.f35711d) {
                xuVar.f35739a.b(null);
                xuVar.f35739a.b(0);
            }
            xuVar.f35739a.c();
            i = this.f35709b.size();
            if (i > 0) {
                this.f35723p = ((xu) this.f35709b.get(i - 1)).f35741c;
            } else {
                this.f35723p = m41362h();
            }
            if (i == 0) {
                mo4524c();
                if (this.f35730w != null) {
                    this.f35730w.mo4441a(xyVar, true);
                }
                if (this.f35731x != null) {
                    if (this.f35731x.isAlive()) {
                        this.f35731x.removeGlobalOnLayoutListener(this.f35718k);
                    }
                    this.f35731x = null;
                }
                this.f35732y.onDismiss();
            } else if (z) {
                ((xu) this.f35709b.get(0)).f35740b.m41417a(false);
            }
        }
    }
}
