package p000;

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

public class add implements ys {
    private static Method f103a;
    private static Method f104b;
    private static Method f105c;
    private OnItemSelectedListener f106A;
    private final adj f107B;
    private final adi f108C;
    private final adg f109D;
    private Runnable f110E;
    private final Rect f111F;
    private Rect f112G;
    private boolean f113H;
    acj f114d;
    int f115e;
    final adk f116f;
    final Handler f117g;
    PopupWindow f118h;
    private Context f119i;
    private ListAdapter f120j;
    private int f121k;
    private int f122l;
    private int f123m;
    private int f124n;
    private int f125o;
    private boolean f126p;
    private boolean f127q;
    private int f128r;
    private boolean f129s;
    private boolean f130t;
    private View f131u;
    private int f132v;
    private DataSetObserver f133w;
    private View f134x;
    private Drawable f135y;
    private OnItemClickListener f136z;

    static {
        try {
            f103a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException e) {
        }
        try {
            f104b = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
        } catch (NoSuchMethodException e2) {
        }
        try {
            f105c = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
        } catch (NoSuchMethodException e3) {
        }
    }

    public add(Context context) {
        this(context, null, gwb.f876V);
    }

    public add(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public add(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f121k = -2;
        this.f122l = -2;
        this.f125o = 1002;
        this.f127q = true;
        this.f128r = 0;
        this.f129s = false;
        this.f130t = false;
        this.f115e = Integer.MAX_VALUE;
        this.f132v = 0;
        this.f116f = new adk(this);
        this.f107B = new adj(this);
        this.f108C = new adi(this);
        this.f109D = new adg(this);
        this.f111F = new Rect();
        this.f119i = context;
        this.f117g = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wi.bt, i, i2);
        this.f123m = obtainStyledAttributes.getDimensionPixelOffset(wi.bu, 0);
        this.f124n = obtainStyledAttributes.getDimensionPixelOffset(wi.bv, 0);
        if (this.f124n != 0) {
            this.f126p = true;
        }
        obtainStyledAttributes.recycle();
        if (VERSION.SDK_INT >= 11) {
            this.f118h = new aar(context, attributeSet, i, i2);
        } else {
            this.f118h = new aar(context, attributeSet, i);
        }
        this.f118h.setInputMethodMode(1);
    }

    public void mo15a(ListAdapter listAdapter) {
        if (this.f133w == null) {
            this.f133w = new adh(this);
        } else if (this.f120j != null) {
            this.f120j.unregisterDataSetObserver(this.f133w);
        }
        this.f120j = listAdapter;
        if (this.f120j != null) {
            listAdapter.registerDataSetObserver(this.f133w);
        }
        if (this.f114d != null) {
            this.f114d.setAdapter(this.f120j);
        }
    }

    public void m145a(int i) {
        this.f132v = 0;
    }

    public void m152a(boolean z) {
        this.f113H = true;
        this.f118h.setFocusable(true);
    }

    public boolean m162g() {
        return this.f113H;
    }

    public Drawable m163h() {
        return this.f118h.getBackground();
    }

    public void m147a(Drawable drawable) {
        this.f118h.setBackgroundDrawable(drawable);
    }

    public void m153b(int i) {
        this.f118h.setAnimationStyle(0);
    }

    public View m165i() {
        return this.f134x;
    }

    public void m148a(View view) {
        this.f134x = view;
    }

    public int m167j() {
        return this.f123m;
    }

    public void m155c(int i) {
        this.f123m = i;
    }

    public int m168k() {
        if (this.f126p) {
            return this.f124n;
        }
        return 0;
    }

    public void m156d(int i) {
        this.f124n = i;
        this.f126p = true;
    }

    public void m146a(Rect rect) {
        this.f112G = rect;
    }

    public void m159e(int i) {
        this.f128r = i;
    }

    public int m169l() {
        return this.f122l;
    }

    public void m160f(int i) {
        this.f122l = i;
    }

    public void m161g(int i) {
        Drawable background = this.f118h.getBackground();
        if (background != null) {
            background.getPadding(this.f111F);
            this.f122l = (this.f111F.left + this.f111F.right) + i;
            return;
        }
        m160f(i);
    }

    public void m149a(OnItemClickListener onItemClickListener) {
        this.f136z = onItemClickListener;
    }

    public void m154c() {
        this.f118h.dismiss();
        if (this.f131u != null) {
            ViewParent parent = this.f131u.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f131u);
            }
        }
        this.f118h.setContentView(null);
        this.f114d = null;
        this.f117g.removeCallbacks(this.f116f);
    }

    public void m151a(OnDismissListener onDismissListener) {
        this.f118h.setOnDismissListener(onDismissListener);
    }

    public void m164h(int i) {
        this.f118h.setInputMethodMode(2);
    }

    public void m166i(int i) {
        acj acj = this.f114d;
        if (m157d() && acj != null) {
            acj.m389a(false);
            acj.setSelection(i);
            if (VERSION.SDK_INT >= 11 && acj.getChoiceMode() != 0) {
                acj.setItemChecked(i, true);
            }
        }
    }

    public void m170m() {
        acj acj = this.f114d;
        if (acj != null) {
            acj.m389a(true);
            acj.requestLayout();
        }
    }

    public boolean m157d() {
        return this.f118h.isShowing();
    }

    public boolean m171n() {
        return this.f118h.getInputMethodMode() == 2;
    }

    public ListView m158e() {
        return this.f114d;
    }

    acj mo80a(Context context, boolean z) {
        return new acj(context, z);
    }

    private int m142a(View view, int i, boolean z) {
        if (f104b != null) {
            try {
                return ((Integer) f104b.invoke(this.f118h, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
            } catch (Exception e) {
            }
        }
        return this.f118h.getMaxAvailableHeight(view, i);
    }

    public void mo14a() {
        int i;
        int i2;
        boolean z;
        int makeMeasureSpec;
        boolean z2 = true;
        LayoutParams layoutParams;
        View view;
        if (this.f114d == null) {
            Context context = this.f119i;
            this.f110E = new ade(this);
            this.f114d = mo80a(context, !this.f113H);
            if (this.f135y != null) {
                this.f114d.setSelector(this.f135y);
            }
            this.f114d.setAdapter(this.f120j);
            this.f114d.setOnItemClickListener(this.f136z);
            this.f114d.setFocusable(true);
            this.f114d.setFocusableInTouchMode(true);
            this.f114d.setOnItemSelectedListener(new adf(this));
            this.f114d.setOnScrollListener(this.f108C);
            if (this.f106A != null) {
                this.f114d.setOnItemSelectedListener(this.f106A);
            }
            View view2 = this.f114d;
            View view3 = this.f131u;
            if (view3 != null) {
                View linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams2 = new LayoutParams(-1, 0, 1.0f);
                switch (this.f132v) {
                    case 0:
                        linearLayout.addView(view3);
                        linearLayout.addView(view2, layoutParams2);
                        break;
                    case 1:
                        linearLayout.addView(view2, layoutParams2);
                        linearLayout.addView(view3);
                        break;
                    default:
                        Log.e("ListPopupWindow", "Invalid hint position " + this.f132v);
                        break;
                }
                if (this.f122l >= 0) {
                    i = this.f122l;
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
            this.f118h.setContentView(view);
        } else {
            this.f118h.getContentView();
            view = this.f131u;
            if (view != null) {
                layoutParams = (LayoutParams) view.getLayoutParams();
                i2 = layoutParams.bottomMargin + (view.getMeasuredHeight() + layoutParams.topMargin);
            } else {
                i2 = 0;
            }
        }
        Drawable background = this.f118h.getBackground();
        if (background != null) {
            background.getPadding(this.f111F);
            i = this.f111F.top + this.f111F.bottom;
            if (!this.f126p) {
                this.f124n = -this.f111F.top;
            }
        } else {
            this.f111F.setEmpty();
            i = 0;
        }
        if (this.f118h.getInputMethodMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        int a = m142a(m165i(), this.f124n, z);
        if (this.f129s || this.f121k == -1) {
            i2 = a + i;
        } else {
            switch (this.f122l) {
                case -2:
                    makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f119i.getResources().getDisplayMetrics().widthPixels - (this.f111F.left + this.f111F.right), nzf.UNSET_ENUM_VALUE);
                    break;
                case -1:
                    makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f119i.getResources().getDisplayMetrics().widthPixels - (this.f111F.left + this.f111F.right), 1073741824);
                    break;
                default:
                    makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f122l, 1073741824);
                    break;
            }
            makeMeasureSpec = this.f114d.m380a(makeMeasureSpec, a - i2, -1);
            if (makeMeasureSpec > 0) {
                i2 += i + (this.f114d.getPaddingTop() + this.f114d.getPaddingBottom());
            }
            i2 += makeMeasureSpec;
        }
        z = m171n();
        sz.a(this.f118h, this.f125o);
        if (this.f118h.isShowing()) {
            if (this.f122l == -1) {
                i = -1;
            } else if (this.f122l == -2) {
                i = m165i().getWidth();
            } else {
                i = this.f122l;
            }
            if (this.f121k == -1) {
                if (z) {
                    makeMeasureSpec = i2;
                } else {
                    makeMeasureSpec = -1;
                }
                PopupWindow popupWindow;
                if (z) {
                    popupWindow = this.f118h;
                    if (this.f122l == -1) {
                        i2 = -1;
                    } else {
                        i2 = 0;
                    }
                    popupWindow.setWidth(i2);
                    this.f118h.setHeight(0);
                    a = makeMeasureSpec;
                } else {
                    popupWindow = this.f118h;
                    if (this.f122l == -1) {
                        i2 = -1;
                    } else {
                        i2 = 0;
                    }
                    popupWindow.setWidth(i2);
                    this.f118h.setHeight(-1);
                    a = makeMeasureSpec;
                }
            } else if (this.f121k == -2) {
                a = i2;
            } else {
                a = this.f121k;
            }
            PopupWindow popupWindow2 = this.f118h;
            if (this.f130t || this.f129s) {
                z2 = false;
            }
            popupWindow2.setOutsideTouchable(z2);
            popupWindow2 = this.f118h;
            View i3 = m165i();
            int i4 = this.f123m;
            makeMeasureSpec = this.f124n;
            if (i < 0) {
                i = -1;
            }
            if (a < 0) {
                a = -1;
            }
            popupWindow2.update(i3, i4, makeMeasureSpec, i, a);
            return;
        }
        if (this.f122l == -1) {
            makeMeasureSpec = -1;
        } else if (this.f122l == -2) {
            makeMeasureSpec = m165i().getWidth();
        } else {
            makeMeasureSpec = this.f122l;
        }
        if (this.f121k == -1) {
            i2 = -1;
        } else if (this.f121k != -2) {
            i2 = this.f121k;
        }
        this.f118h.setWidth(makeMeasureSpec);
        this.f118h.setHeight(i2);
        if (f103a != null) {
            try {
                f103a.invoke(this.f118h, new Object[]{Boolean.valueOf(true)});
            } catch (Exception e) {
            }
        }
        popupWindow2 = this.f118h;
        if (this.f130t || this.f129s) {
            z2 = false;
        }
        popupWindow2.setOutsideTouchable(z2);
        this.f118h.setTouchInterceptor(this.f107B);
        if (f105c != null) {
            try {
                f105c.invoke(this.f118h, new Object[]{this.f112G});
            } catch (Throwable e2) {
                Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
            }
        }
        sz.a.a(this.f118h, m165i(), this.f123m, this.f124n, this.f128r);
        this.f114d.setSelection(-1);
        if (!this.f113H || this.f114d.isInTouchMode()) {
            m170m();
        }
        if (!this.f113H) {
            this.f117g.post(this.f109D);
        }
    }
}
