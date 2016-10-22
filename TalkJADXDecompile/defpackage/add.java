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
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import java.lang.reflect.Method;
import sz;
import ys;

/* renamed from: add */
public class add implements ys {
    private static Method a;
    private static Method b;
    private static Method c;
    private OnItemSelectedListener A;
    private final adj B;
    private final adi C;
    private final adg D;
    private Runnable E;
    private final Rect F;
    private Rect G;
    private boolean H;
    acj d;
    int e;
    final adk f;
    final Handler g;
    PopupWindow h;
    private Context i;
    private ListAdapter j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private boolean q;
    private int r;
    private boolean s;
    private boolean t;
    private View u;
    private int v;
    private DataSetObserver w;
    private View x;
    private Drawable y;
    private OnItemClickListener z;

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

    public add(Context context) {
        this(context, null, gwb.V);
    }

    public add(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public add(Context context, AttributeSet attributeSet, int i, int i2) {
        this.k = -2;
        this.l = -2;
        this.o = 1002;
        this.q = true;
        this.r = 0;
        this.s = false;
        this.t = false;
        this.e = Integer.MAX_VALUE;
        this.v = 0;
        this.f = new adk(this);
        this.B = new adj(this);
        this.C = new adi(this);
        this.D = new adg(this);
        this.F = new Rect();
        this.i = context;
        this.g = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wi.bt, i, i2);
        this.m = obtainStyledAttributes.getDimensionPixelOffset(wi.bu, 0);
        this.n = obtainStyledAttributes.getDimensionPixelOffset(wi.bv, 0);
        if (this.n != 0) {
            this.p = true;
        }
        obtainStyledAttributes.recycle();
        if (VERSION.SDK_INT >= 11) {
            this.h = new aar(context, attributeSet, i, i2);
        } else {
            this.h = new aar(context, attributeSet, i);
        }
        this.h.setInputMethodMode(1);
    }

    public void a(ListAdapter listAdapter) {
        if (this.w == null) {
            this.w = new adh(this);
        } else if (this.j != null) {
            this.j.unregisterDataSetObserver(this.w);
        }
        this.j = listAdapter;
        if (this.j != null) {
            listAdapter.registerDataSetObserver(this.w);
        }
        if (this.d != null) {
            this.d.setAdapter(this.j);
        }
    }

    public void a(int i) {
        this.v = 0;
    }

    public void a(boolean z) {
        this.H = true;
        this.h.setFocusable(true);
    }

    public boolean g() {
        return this.H;
    }

    public Drawable h() {
        return this.h.getBackground();
    }

    public void a(Drawable drawable) {
        this.h.setBackgroundDrawable(drawable);
    }

    public void b(int i) {
        this.h.setAnimationStyle(0);
    }

    public View i() {
        return this.x;
    }

    public void a(View view) {
        this.x = view;
    }

    public int j() {
        return this.m;
    }

    public void c(int i) {
        this.m = i;
    }

    public int k() {
        if (this.p) {
            return this.n;
        }
        return 0;
    }

    public void d(int i) {
        this.n = i;
        this.p = true;
    }

    public void a(Rect rect) {
        this.G = rect;
    }

    public void e(int i) {
        this.r = i;
    }

    public int l() {
        return this.l;
    }

    public void f(int i) {
        this.l = i;
    }

    public void g(int i) {
        Drawable background = this.h.getBackground();
        if (background != null) {
            background.getPadding(this.F);
            this.l = (this.F.left + this.F.right) + i;
            return;
        }
        f(i);
    }

    public void a(OnItemClickListener onItemClickListener) {
        this.z = onItemClickListener;
    }

    public void c() {
        this.h.dismiss();
        if (this.u != null) {
            ViewParent parent = this.u.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.u);
            }
        }
        this.h.setContentView(null);
        this.d = null;
        this.g.removeCallbacks(this.f);
    }

    public void a(OnDismissListener onDismissListener) {
        this.h.setOnDismissListener(onDismissListener);
    }

    public void h(int i) {
        this.h.setInputMethodMode(2);
    }

    public void i(int i) {
        acj acj = this.d;
        if (d() && acj != null) {
            acj.a(false);
            acj.setSelection(i);
            if (VERSION.SDK_INT >= 11 && acj.getChoiceMode() != 0) {
                acj.setItemChecked(i, true);
            }
        }
    }

    public void m() {
        acj acj = this.d;
        if (acj != null) {
            acj.a(true);
            acj.requestLayout();
        }
    }

    public boolean d() {
        return this.h.isShowing();
    }

    public boolean n() {
        return this.h.getInputMethodMode() == 2;
    }

    public ListView e() {
        return this.d;
    }

    acj a(Context context, boolean z) {
        return new acj(context, z);
    }

    private int a(View view, int i, boolean z) {
        if (b != null) {
            try {
                return ((Integer) b.invoke(this.h, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
            } catch (Exception e) {
            }
        }
        return this.h.getMaxAvailableHeight(view, i);
    }

    public void a() {
        int i;
        int i2;
        boolean z;
        int makeMeasureSpec;
        boolean z2 = true;
        LayoutParams layoutParams;
        View view;
        if (this.d == null) {
            Context context = this.i;
            this.E = new ade(this);
            this.d = a(context, !this.H);
            if (this.y != null) {
                this.d.setSelector(this.y);
            }
            this.d.setAdapter(this.j);
            this.d.setOnItemClickListener(this.z);
            this.d.setFocusable(true);
            this.d.setFocusableInTouchMode(true);
            this.d.setOnItemSelectedListener(new adf(this));
            this.d.setOnScrollListener(this.C);
            if (this.A != null) {
                this.d.setOnItemSelectedListener(this.A);
            }
            View view2 = this.d;
            View view3 = this.u;
            if (view3 != null) {
                View linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams2 = new LayoutParams(-1, 0, 1.0f);
                switch (this.v) {
                    case wi.w /*0*/:
                        linearLayout.addView(view3);
                        linearLayout.addView(view2, layoutParams2);
                        break;
                    case wi.j /*1*/:
                        linearLayout.addView(view2, layoutParams2);
                        linearLayout.addView(view3);
                        break;
                    default:
                        Log.e("ListPopupWindow", "Invalid hint position " + this.v);
                        break;
                }
                if (this.l >= 0) {
                    i = this.l;
                    i2 = nzf.UNSET_ENUM_VALUE;
                } else {
                    i2 = 0;
                    i = 0;
                }
                view3.measure(MeasureSpec.makeMeasureSpec(i, i2), 0);
                layoutParams = (LayoutParams) view3.getLayoutParams();
                i2 = layoutParams.bottomMargin + (view3.getMeasuredHeight() + layoutParams.topMargin);
                view = linearLayout;
            } else {
                view = view2;
                i2 = 0;
            }
            this.h.setContentView(view);
        } else {
            this.h.getContentView();
            view = this.u;
            if (view != null) {
                layoutParams = (LayoutParams) view.getLayoutParams();
                i2 = layoutParams.bottomMargin + (view.getMeasuredHeight() + layoutParams.topMargin);
            } else {
                i2 = 0;
            }
        }
        Drawable background = this.h.getBackground();
        if (background != null) {
            background.getPadding(this.F);
            i = this.F.top + this.F.bottom;
            if (!this.p) {
                this.n = -this.F.top;
            }
        } else {
            this.F.setEmpty();
            i = 0;
        }
        if (this.h.getInputMethodMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        int a = a(i(), this.n, z);
        if (this.s || this.k == -1) {
            i2 = a + i;
        } else {
            switch (this.l) {
                case -2:
                    makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.i.getResources().getDisplayMetrics().widthPixels - (this.F.left + this.F.right), nzf.UNSET_ENUM_VALUE);
                    break;
                case -1:
                    makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.i.getResources().getDisplayMetrics().widthPixels - (this.F.left + this.F.right), 1073741824);
                    break;
                default:
                    makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.l, 1073741824);
                    break;
            }
            makeMeasureSpec = this.d.a(makeMeasureSpec, a - i2, -1);
            if (makeMeasureSpec > 0) {
                i2 += i + (this.d.getPaddingTop() + this.d.getPaddingBottom());
            }
            i2 += makeMeasureSpec;
        }
        z = n();
        sz.a(this.h, this.o);
        if (this.h.isShowing()) {
            if (this.l == -1) {
                i = -1;
            } else if (this.l == -2) {
                i = i().getWidth();
            } else {
                i = this.l;
            }
            if (this.k == -1) {
                if (z) {
                    makeMeasureSpec = i2;
                } else {
                    makeMeasureSpec = -1;
                }
                PopupWindow popupWindow;
                if (z) {
                    popupWindow = this.h;
                    if (this.l == -1) {
                        i2 = -1;
                    } else {
                        i2 = 0;
                    }
                    popupWindow.setWidth(i2);
                    this.h.setHeight(0);
                    a = makeMeasureSpec;
                } else {
                    popupWindow = this.h;
                    if (this.l == -1) {
                        i2 = -1;
                    } else {
                        i2 = 0;
                    }
                    popupWindow.setWidth(i2);
                    this.h.setHeight(-1);
                    a = makeMeasureSpec;
                }
            } else if (this.k == -2) {
                a = i2;
            } else {
                a = this.k;
            }
            PopupWindow popupWindow2 = this.h;
            if (this.t || this.s) {
                z2 = false;
            }
            popupWindow2.setOutsideTouchable(z2);
            popupWindow2 = this.h;
            View i3 = i();
            int i4 = this.m;
            makeMeasureSpec = this.n;
            if (i < 0) {
                i = -1;
            }
            if (a < 0) {
                a = -1;
            }
            popupWindow2.update(i3, i4, makeMeasureSpec, i, a);
            return;
        }
        if (this.l == -1) {
            makeMeasureSpec = -1;
        } else if (this.l == -2) {
            makeMeasureSpec = i().getWidth();
        } else {
            makeMeasureSpec = this.l;
        }
        if (this.k == -1) {
            i2 = -1;
        } else if (this.k != -2) {
            i2 = this.k;
        }
        this.h.setWidth(makeMeasureSpec);
        this.h.setHeight(i2);
        if (a != null) {
            try {
                a.invoke(this.h, new Object[]{Boolean.valueOf(true)});
            } catch (Exception e) {
            }
        }
        popupWindow2 = this.h;
        if (this.t || this.s) {
            z2 = false;
        }
        popupWindow2.setOutsideTouchable(z2);
        this.h.setTouchInterceptor(this.B);
        if (c != null) {
            try {
                c.invoke(this.h, new Object[]{this.G});
            } catch (Throwable e2) {
                Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
            }
        }
        sz.a.a(this.h, i(), this.m, this.n, this.r);
        this.d.setSelection(-1);
        if (!this.H || this.d.isInTouchMode()) {
            m();
        }
        if (!this.H) {
            this.g.post(this.D);
        }
    }
}
