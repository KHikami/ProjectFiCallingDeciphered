import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.HorizontalScrollView;
import android.widget.Spinner;

/* compiled from: PG */
public final class zs extends HorizontalScrollView implements OnItemSelectedListener {
    Runnable a;
    zv b;
    public boolean c;
    int d;
    int e;
    private Spinner f;
    private int g;
    private int h;

    static {
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
    }

    public final void onMeasure(int i, int i2) {
        int i3 = 1;
        Object obj = null;
        int mode = MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = obj.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == oe.INVALID_ID)) {
            this.d = -1;
        } else {
            if (childCount > 2) {
                this.d = (int) (((float) MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.d = MeasureSpec.getSize(i) / 2;
            }
            this.d = Math.min(this.d, this.g);
        }
        mode = MeasureSpec.makeMeasureSpec(this.e, 1073741824);
        if (z || !this.c) {
            i3 = 0;
        }
        if (i3 != 0) {
            obj.measure(0, mode);
            if (obj.getMeasuredWidth() <= MeasureSpec.getSize(i)) {
                b();
            } else if (!a()) {
                if (this.f == null) {
                    Spinner vzVar = new vz(getContext(), obj, buf.v);
                    vzVar.setLayoutParams(new xq(-2, -1));
                    vzVar.setOnItemSelectedListener(this);
                    this.f = vzVar;
                }
                removeView(obj);
                addView(this.f, new LayoutParams(-2, -1));
                if (this.f.getAdapter() == null) {
                    this.f.setAdapter(new zu(this));
                }
                if (this.a != null) {
                    removeCallbacks(this.a);
                    this.a = obj;
                }
                this.f.setSelection(this.h);
            }
        } else {
            b();
        }
        i3 = getMeasuredWidth();
        super.onMeasure(i, mode);
        int measuredWidth = getMeasuredWidth();
        if (z && i3 != measuredWidth) {
            a(this.h);
        }
    }

    private final boolean a() {
        return this.f != null && this.f.getParent() == this;
    }

    private final boolean b() {
        if (a()) {
            removeView(this.f);
            addView(null, new LayoutParams(-2, -1));
            a(this.f.getSelectedItemPosition());
        }
        return false;
    }

    private void a(int i) {
        xp xpVar = null;
        this.h = i;
        int childCount = xpVar.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            boolean z;
            View childAt = xpVar.getChildAt(i2);
            if (i2 == i) {
                z = true;
            } else {
                z = false;
            }
            childAt.setSelected(z);
            if (z) {
                View childAt2 = xpVar.getChildAt(i);
                if (this.a != null) {
                    removeCallbacks(this.a);
                }
                this.a = new zt(this, childAt2);
                post(this.a);
            }
        }
        if (this.f != null && i >= 0) {
            this.f.setSelection(i);
        }
    }

    protected final void onConfigurationChanged(Configuration configuration) {
        if (VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        rs a = rs.a(getContext());
        TypedArray obtainStyledAttributes = a.a.obtainStyledAttributes(null, rk.a, buf.q, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(rk.l, 0);
        Resources resources = a.a.getResources();
        if (!a.b()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(buf.ak));
        }
        obtainStyledAttributes.recycle();
        this.e = layoutDimension;
        requestLayout();
        this.g = a.a.getResources().getDimensionPixelSize(buf.al);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a != null) {
            post(this.a);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.a != null) {
            removeCallbacks(this.a);
        }
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
