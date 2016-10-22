import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
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

/* compiled from: PG */
final class sm extends tg implements OnKeyListener, OnDismissListener, tj {
    final Handler a;
    final List b;
    View c;
    boolean d;
    private final Context f;
    private final int g;
    private final int h;
    private final int i;
    private final boolean j;
    private final List k;
    private final OnGlobalLayoutListener l;
    private final yh m;
    private int n;
    private int o;
    private View p;
    private int q;
    private boolean r;
    private boolean s;
    private int t;
    private int u;
    private boolean v;
    private boolean w;
    private tk x;
    private ViewTreeObserver y;
    private OnDismissListener z;

    public sm(Context context, View view, int i, int i2, boolean z) {
        this.k = new LinkedList();
        this.b = new ArrayList();
        this.l = new sn(this);
        this.m = new so(this);
        this.n = 0;
        this.o = 0;
        this.f = context;
        this.p = view;
        this.h = i;
        this.i = i2;
        this.j = z;
        this.v = false;
        this.q = f();
        Resources resources = context.getResources();
        this.g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(buf.an));
        this.a = new Handler();
    }

    public final void a(boolean z) {
        this.v = z;
    }

    public final void b() {
        if (!d()) {
            for (su c : this.k) {
                c(c);
            }
            this.k.clear();
            this.c = this.p;
            if (this.c != null) {
                Object obj = this.y == null ? 1 : null;
                this.y = this.c.getViewTreeObserver();
                if (obj != null) {
                    this.y.addOnGlobalLayoutListener(this.l);
                }
            }
        }
    }

    public final void c() {
        int size = this.b.size();
        if (size > 0) {
            sq[] sqVarArr = (sq[]) this.b.toArray(new sq[size]);
            for (size--; size >= 0; size--) {
                sq sqVar = sqVarArr[size];
                if (sqVar.a.q.isShowing()) {
                    sqVar.a.c();
                }
            }
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        c();
        return true;
    }

    private final int f() {
        if (kn.f(this.p) == 1) {
            return 0;
        }
        return 1;
    }

    public final void a(su suVar) {
        suVar.a((tj) this, this.f);
        if (d()) {
            c(suVar);
        } else {
            this.k.add(suVar);
        }
    }

    private final void c(su suVar) {
        int size;
        int i;
        View view;
        sq sqVar;
        LayoutInflater from = LayoutInflater.from(this.f);
        Object stVar = new st(suVar, from, this.j);
        if (!d() && this.v) {
            stVar.b = true;
        } else if (d()) {
            stVar.b = tg.b(suVar);
        }
        int a = tg.a(stVar, null, this.f, this.g);
        xx yiVar = new yi(this.f, null, this.h, this.i);
        yiVar.b = this.m;
        yiVar.l = this;
        yiVar.a((OnDismissListener) this);
        yiVar.k = this.p;
        yiVar.h = this.o;
        yiVar.a(true);
        yiVar.a((ListAdapter) stVar);
        yiVar.f = a;
        yiVar.h = this.o;
        if (this.b.size() > 0) {
            int i2;
            MenuItem menuItem;
            View view2;
            sq sqVar2 = (sq) this.b.get(this.b.size() - 1);
            su suVar2 = sqVar2.b;
            size = suVar2.size();
            for (i2 = 0; i2 < size; i2++) {
                MenuItem item = suVar2.getItem(i2);
                if (item.hasSubMenu() && suVar == item.getSubMenu()) {
                    menuItem = item;
                    break;
                }
            }
            menuItem = null;
            if (menuItem == null) {
                view2 = null;
            } else {
                st stVar2;
                ListView listView = sqVar2.a.e;
                ListAdapter adapter = listView.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i2 = headerViewListAdapter.getHeadersCount();
                    stVar2 = (st) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i2 = 0;
                    stVar2 = (st) adapter;
                }
                int count = stVar2.getCount();
                for (int i3 = 0; i3 < count; i3++) {
                    if (menuItem == stVar2.a(i3)) {
                        i = i3;
                        break;
                    }
                }
                i = -1;
                if (i == -1) {
                    view2 = null;
                } else {
                    i = (i + i2) - listView.getFirstVisiblePosition();
                    if (i < 0 || i >= listView.getChildCount()) {
                        view2 = null;
                    } else {
                        view2 = listView.getChildAt(i);
                    }
                }
            }
            view = view2;
            sqVar = sqVar2;
        } else {
            view = null;
            sqVar = null;
        }
        if (view != null) {
            int i4;
            if (yi.a != null) {
                try {
                    yi.a.invoke(yiVar.q, new Object[]{Boolean.valueOf(false)});
                } catch (Exception e) {
                }
            }
            if (VERSION.SDK_INT >= 23) {
                yiVar.q.setEnterTransition(null);
            }
            ListView listView2 = ((sq) this.b.get(this.b.size() - 1)).a.e;
            int[] iArr = new int[2];
            listView2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.c.getWindowVisibleDisplayFrame(rect);
            if (this.q == 1) {
                if ((listView2.getWidth() + iArr[0]) + a <= rect.right) {
                    i = 1;
                }
                i = 0;
            } else {
                if (iArr[0] - a < 0) {
                    i = 1;
                }
                i = 0;
            }
            stVar = i == 1 ? 1 : null;
            this.q = i;
            iArr = new int[2];
            view.getLocationInWindow(iArr);
            size = sqVar.a.g + iArr[0];
            i = iArr[1] + sqVar.a.f();
            if ((this.o & 5) == 5) {
                if (stVar != null) {
                    i4 = size + a;
                } else {
                    i4 = size - view.getWidth();
                }
            } else if (stVar != null) {
                i4 = view.getWidth() + size;
            } else {
                i4 = size - a;
            }
            yiVar.g = i4;
            yiVar.a(i);
        } else {
            if (this.r) {
                yiVar.g = this.t;
            }
            if (this.s) {
                yiVar.a(this.u);
            }
            yiVar.o = this.e;
        }
        this.b.add(new sq(yiVar, suVar, this.q));
        yiVar.b();
        if (sqVar == null && this.w && suVar.f != null) {
            ViewGroup viewGroup = yiVar.e;
            FrameLayout frameLayout = (FrameLayout) from.inflate(buf.bU, viewGroup, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            frameLayout.setEnabled(false);
            textView.setText(suVar.f);
            viewGroup.addHeaderView(frameLayout, null, false);
            yiVar.b();
        }
    }

    public final boolean d() {
        return this.b.size() > 0 && ((sq) this.b.get(0)).a.q.isShowing();
    }

    public final void onDismiss() {
        sq sqVar;
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            sqVar = (sq) this.b.get(i);
            if (!sqVar.a.q.isShowing()) {
                break;
            }
        }
        sqVar = null;
        if (sqVar != null) {
            sqVar.b.a(false);
        }
    }

    public final void b(boolean z) {
        for (sq sqVar : this.b) {
            tg.a(sqVar.a.e.getAdapter()).notifyDataSetChanged();
        }
    }

    public final void a(tk tkVar) {
        this.x = tkVar;
    }

    public final boolean a(tr trVar) {
        for (sq sqVar : this.b) {
            if (trVar == sqVar.b) {
                sqVar.a.e.requestFocus();
                return true;
            }
        }
        if (!trVar.hasVisibleItems()) {
            return false;
        }
        a((su) trVar);
        if (this.x != null) {
            this.x.a(trVar);
        }
        return true;
    }

    public final void a(su suVar, boolean z) {
        int size = this.b.size();
        int i = 0;
        while (i < size) {
            if (suVar == ((sq) this.b.get(i)).b) {
                break;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            int i2 = i + 1;
            if (i2 < this.b.size()) {
                ((sq) this.b.get(i2)).b.a(false);
            }
            sq sqVar = (sq) this.b.remove(i);
            sqVar.b.b((tj) this);
            if (this.d) {
                yi yiVar = sqVar.a;
                if (VERSION.SDK_INT >= 23) {
                    yiVar.q.setExitTransition(null);
                }
                sqVar.a.q.setAnimationStyle(0);
            }
            sqVar.a.c();
            i = this.b.size();
            if (i > 0) {
                this.q = ((sq) this.b.get(i - 1)).c;
            } else {
                this.q = f();
            }
            if (i == 0) {
                c();
                if (this.x != null) {
                    this.x.a(suVar, true);
                }
                if (this.y != null) {
                    if (this.y.isAlive()) {
                        this.y.removeGlobalOnLayoutListener(this.l);
                    }
                    this.y = null;
                }
                this.z.onDismiss();
            } else if (z) {
                ((sq) this.b.get(0)).b.a(false);
            }
        }
    }

    public final boolean a() {
        return false;
    }

    public final void a(int i) {
        if (this.n != i) {
            this.n = i;
            this.o = iy.a(i, kn.f(this.p));
        }
    }

    public final void a(View view) {
        if (this.p != view) {
            this.p = view;
            this.o = iy.a(this.n, kn.f(this.p));
        }
    }

    public final void a(OnDismissListener onDismissListener) {
        this.z = onDismissListener;
    }

    public final ListView e() {
        if (this.b.isEmpty()) {
            return null;
        }
        return ((sq) this.b.get(this.b.size() - 1)).a.e;
    }

    public final void b(int i) {
        this.r = true;
        this.t = i;
    }

    public final void c(int i) {
        this.s = true;
        this.u = i;
    }

    public final void c(boolean z) {
        this.w = z;
    }
}
