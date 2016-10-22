import android.content.res.Configuration;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.HorizontalScrollView;
import android.widget.Spinner;

public final class aez extends HorizontalScrollView implements OnItemSelectedListener {
    private static final Interpolator j;
    Runnable a;
    afc b;
    acv c;
    int d;
    int e;
    int f;
    private Spinner g;
    private boolean h;
    private int i;

    static {
        j = new DecelerateInterpolator();
    }

    public void onMeasure(int i, int i2) {
        int i3 = 1;
        int mode = MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.c.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == nzf.UNSET_ENUM_VALUE)) {
            this.d = -1;
        } else {
            if (childCount > 2) {
                this.d = (int) (((float) MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.d = MeasureSpec.getSize(i) / 2;
            }
            this.d = Math.min(this.d, this.e);
        }
        mode = MeasureSpec.makeMeasureSpec(this.f, 1073741824);
        if (z || !this.h) {
            i3 = 0;
        }
        if (i3 != 0) {
            this.c.measure(0, mode);
            if (this.c.getMeasuredWidth() <= MeasureSpec.getSize(i)) {
                b();
            } else if (!a()) {
                if (this.g == null) {
                    Spinner aay = new aay(getContext(), null, gwb.x);
                    aay.setLayoutParams(new acw(-2, -1));
                    aay.setOnItemSelectedListener(this);
                    this.g = aay;
                }
                removeView(this.c);
                addView(this.g, new LayoutParams(-2, -1));
                if (this.g.getAdapter() == null) {
                    this.g.setAdapter(new afb(this));
                }
                if (this.a != null) {
                    removeCallbacks(this.a);
                    this.a = null;
                }
                this.g.setSelection(this.i);
            }
        } else {
            b();
        }
        i3 = getMeasuredWidth();
        super.onMeasure(i, mode);
        int measuredWidth = getMeasuredWidth();
        if (z && i3 != measuredWidth) {
            a(this.i);
        }
    }

    private boolean a() {
        return this.g != null && this.g.getParent() == this;
    }

    public void a(boolean z) {
        this.h = z;
    }

    private boolean b() {
        if (a()) {
            removeView(this.g);
            addView(this.c, new LayoutParams(-2, -1));
            a(this.g.getSelectedItemPosition());
        }
        return false;
    }

    private void a(int i) {
        this.i = i;
        int childCount = this.c.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            boolean z;
            View childAt = this.c.getChildAt(i2);
            if (i2 == i) {
                z = true;
            } else {
                z = false;
            }
            childAt.setSelected(z);
            if (z) {
                c(i);
            }
        }
        if (this.g != null && i >= 0) {
            this.g.setSelection(i);
        }
    }

    private void b(int i) {
        this.f = i;
        requestLayout();
    }

    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ww a = ww.a(getContext());
        b(a.e());
        this.e = a.g();
    }

    private void c(int i) {
        View childAt = this.c.getChildAt(i);
        if (this.a != null) {
            removeCallbacks(this.a);
        }
        this.a = new afa(this, childAt);
        post(this.a);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a != null) {
            post(this.a);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.a != null) {
            removeCallbacks(this.a);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
