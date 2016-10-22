package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: xx */
public class xx implements to {
    private static Method a;
    private static Method b;
    private static Method c;
    private final yc A;
    private final ya B;
    private final Rect C;
    private Context d;
    public xj e;
    public int f;
    public int g;
    public int h;
    int i;
    int j;
    public View k;
    public OnItemClickListener l;
    final ye m;
    final Handler n;
    public Rect o;
    public boolean p;
    public PopupWindow q;
    private ListAdapter r;
    private int s;
    private int t;
    private int u;
    private boolean v;
    private boolean w;
    private boolean x;
    private DataSetObserver y;
    private final yd z;

    static {
        try {
            a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException e) {
        }
        try {
            b = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
        } catch (NoSuchMethodException e2) {
        }
        try {
            c = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
        } catch (NoSuchMethodException e3) {
        }
    }

    public xx(Context context) {
        this(context, null, buf.S);
    }

    public xx(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public xx(Context context, AttributeSet attributeSet, int i, int i2) {
        this.s = -2;
        this.f = -2;
        this.u = 1002;
        this.h = 0;
        this.w = false;
        this.x = false;
        this.i = Integer.MAX_VALUE;
        this.j = 0;
        this.m = new ye(this);
        this.z = new yd(this);
        this.A = new yc(this);
        this.B = new ya(this);
        this.C = new Rect();
        this.d = context;
        this.n = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rk.aF, i, i2);
        this.g = obtainStyledAttributes.getDimensionPixelOffset(rk.aG, 0);
        this.t = obtainStyledAttributes.getDimensionPixelOffset(rk.aH, 0);
        if (this.t != 0) {
            this.v = true;
        }
        obtainStyledAttributes.recycle();
        if (VERSION.SDK_INT >= 11) {
            this.q = new vs(context, attributeSet, i, i2);
        } else {
            this.q = new vs(context, attributeSet, i);
        }
        this.q.setInputMethodMode(1);
    }

    public void a(ListAdapter listAdapter) {
        if (this.y == null) {
            this.y = new yb(this);
        } else if (this.r != null) {
            this.r.unregisterDataSetObserver(this.y);
        }
        this.r = listAdapter;
        if (this.r != null) {
            listAdapter.registerDataSetObserver(this.y);
        }
        if (this.e != null) {
            this.e.setAdapter(this.r);
        }
    }

    public final void a(boolean z) {
        this.p = true;
        this.q.setFocusable(true);
    }

    public final void a(Drawable drawable) {
        this.q.setBackgroundDrawable(drawable);
    }

    public final int f() {
        if (this.v) {
            return this.t;
        }
        return 0;
    }

    public final void a(int i) {
        this.t = i;
        this.v = true;
    }

    public final void b(int i) {
        Drawable background = this.q.getBackground();
        if (background != null) {
            background.getPadding(this.C);
            this.f = (this.C.left + this.C.right) + i;
            return;
        }
        this.f = i;
    }

    public void b() {
        int i;
        boolean z;
        int makeMeasureSpec;
        int i2 = 0;
        if (this.e == null) {
            Context context = this.d;
            xy xyVar = new xy(this);
            this.e = a(context, !this.p);
            this.e.setAdapter(this.r);
            this.e.setOnItemClickListener(this.l);
            this.e.setFocusable(true);
            this.e.setFocusableInTouchMode(true);
            this.e.setOnItemSelectedListener(new xz(this));
            this.e.setOnScrollListener(this.A);
            this.q.setContentView(this.e);
        } else {
            this.q.getContentView();
        }
        Drawable background = this.q.getBackground();
        if (background != null) {
            background.getPadding(this.C);
            i = this.C.top + this.C.bottom;
            if (!this.v) {
                this.t = -this.C.top;
            }
        } else {
            this.C.setEmpty();
            i = 0;
        }
        if (this.q.getInputMethodMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        int a = a(this.k, this.t, z);
        if (this.s == -1) {
            i += a;
        } else {
            switch (this.f) {
                case -2:
                    makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.d.getResources().getDisplayMetrics().widthPixels - (this.C.left + this.C.right), oe.INVALID_ID);
                    break;
                case oe.HOST_ID /*-1*/:
                    makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.d.getResources().getDisplayMetrics().widthPixels - (this.C.left + this.C.right), 1073741824);
                    break;
                default:
                    makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f, 1073741824);
                    break;
            }
            makeMeasureSpec = this.e.a(makeMeasureSpec, a, -1);
            if (makeMeasureSpec > 0) {
                i = (i + (this.e.getPaddingTop() + this.e.getPaddingBottom())) + 0;
            } else {
                i = 0;
            }
            i += makeMeasureSpec;
        }
        boolean h = h();
        oq.a(this.q, this.u);
        if (this.q.isShowing()) {
            int i3;
            PopupWindow popupWindow;
            if (this.f == -1) {
                a = -1;
            } else if (this.f == -2) {
                a = this.k.getWidth();
            } else {
                a = this.f;
            }
            if (this.s == -1) {
                if (h) {
                    makeMeasureSpec = i;
                } else {
                    makeMeasureSpec = -1;
                }
                if (h) {
                    PopupWindow popupWindow2 = this.q;
                    if (this.f == -1) {
                        i = -1;
                    } else {
                        i = 0;
                    }
                    popupWindow2.setWidth(i);
                    this.q.setHeight(0);
                    i3 = makeMeasureSpec;
                } else {
                    popupWindow = this.q;
                    if (this.f == -1) {
                        i2 = -1;
                    }
                    popupWindow.setWidth(i2);
                    this.q.setHeight(-1);
                    i3 = makeMeasureSpec;
                }
            } else if (this.s == -2) {
                i3 = i;
            } else {
                i3 = this.s;
            }
            this.q.setOutsideTouchable(true);
            popupWindow = this.q;
            View view = this.k;
            i2 = this.g;
            makeMeasureSpec = this.t;
            if (a < 0) {
                a = -1;
            }
            if (i3 < 0) {
                i3 = -1;
            }
            popupWindow.update(view, i2, makeMeasureSpec, a, i3);
            return;
        }
        if (this.f == -1) {
            i2 = -1;
        } else if (this.f == -2) {
            i2 = this.k.getWidth();
        } else {
            i2 = this.f;
        }
        if (this.s == -1) {
            i = -1;
        } else if (this.s != -2) {
            i = this.s;
        }
        this.q.setWidth(i2);
        this.q.setHeight(i);
        if (a != null) {
            try {
                a.invoke(this.q, new Object[]{Boolean.valueOf(true)});
            } catch (Exception e) {
            }
        }
        this.q.setOutsideTouchable(true);
        this.q.setTouchInterceptor(this.z);
        if (c != null) {
            try {
                c.invoke(this.q, new Object[]{this.o});
            } catch (Throwable e2) {
                Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
            }
        }
        oq.a.a(this.q, this.k, this.g, this.t, this.h);
        this.e.setSelection(-1);
        if (!this.p || this.e.isInTouchMode()) {
            g();
        }
        if (!this.p) {
            this.n.post(this.B);
        }
    }

    public final void c() {
        this.q.dismiss();
        this.q.setContentView(null);
        this.e = null;
        this.n.removeCallbacks(this.m);
    }

    public final void a(OnDismissListener onDismissListener) {
        this.q.setOnDismissListener(onDismissListener);
    }

    public final void c(int i) {
        this.q.setInputMethodMode(2);
    }

    public final void g() {
        xj xjVar = this.e;
        if (xjVar != null) {
            xjVar.a = true;
            xjVar.requestLayout();
        }
    }

    public final boolean d() {
        return this.q.isShowing();
    }

    public final boolean h() {
        return this.q.getInputMethodMode() == 2;
    }

    public final ListView e() {
        return this.e;
    }

    xj a(Context context, boolean z) {
        return new xj(context, z);
    }

    private final int a(View view, int i, boolean z) {
        if (b != null) {
            try {
                return ((Integer) b.invoke(this.q, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
            } catch (Exception e) {
            }
        }
        return this.q.getMaxAvailableHeight(view, i);
    }
}
