package p000;

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
    private static final Interpolator f496j = new DecelerateInterpolator();
    Runnable f497a;
    afc f498b;
    acv f499c;
    int f500d;
    int f501e;
    int f502f;
    private Spinner f503g;
    private boolean f504h;
    private int f505i;

    public void onMeasure(int i, int i2) {
        int i3 = 1;
        int mode = MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.f499c.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == nzf.UNSET_ENUM_VALUE)) {
            this.f500d = -1;
        } else {
            if (childCount > 2) {
                this.f500d = (int) (((float) MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.f500d = MeasureSpec.getSize(i) / 2;
            }
            this.f500d = Math.min(this.f500d, this.f501e);
        }
        mode = MeasureSpec.makeMeasureSpec(this.f502f, 1073741824);
        if (z || !this.f504h) {
            i3 = 0;
        }
        if (i3 != 0) {
            this.f499c.measure(0, mode);
            if (this.f499c.getMeasuredWidth() <= MeasureSpec.getSize(i)) {
                m909b();
            } else if (!m907a()) {
                if (this.f503g == null) {
                    Spinner aay = new aay(getContext(), null, gwb.f894x);
                    aay.setLayoutParams(new acw(-2, -1));
                    aay.setOnItemSelectedListener(this);
                    this.f503g = aay;
                }
                removeView(this.f499c);
                addView(this.f503g, new LayoutParams(-2, -1));
                if (this.f503g.getAdapter() == null) {
                    this.f503g.setAdapter(new afb(this));
                }
                if (this.f497a != null) {
                    removeCallbacks(this.f497a);
                    this.f497a = null;
                }
                this.f503g.setSelection(this.f505i);
            }
        } else {
            m909b();
        }
        i3 = getMeasuredWidth();
        super.onMeasure(i, mode);
        int measuredWidth = getMeasuredWidth();
        if (z && i3 != measuredWidth) {
            m906a(this.f505i);
        }
    }

    private boolean m907a() {
        return this.f503g != null && this.f503g.getParent() == this;
    }

    public void m911a(boolean z) {
        this.f504h = z;
    }

    private boolean m909b() {
        if (m907a()) {
            removeView(this.f503g);
            addView(this.f499c, new LayoutParams(-2, -1));
            m906a(this.f503g.getSelectedItemPosition());
        }
        return false;
    }

    private void m906a(int i) {
        this.f505i = i;
        int childCount = this.f499c.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            boolean z;
            View childAt = this.f499c.getChildAt(i2);
            if (i2 == i) {
                z = true;
            } else {
                z = false;
            }
            childAt.setSelected(z);
            if (z) {
                m910c(i);
            }
        }
        if (this.f503g != null && i >= 0) {
            this.f503g.setSelection(i);
        }
    }

    private void m908b(int i) {
        this.f502f = i;
        requestLayout();
    }

    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ww a = ww.a(getContext());
        m908b(a.e());
        this.f501e = a.g();
    }

    private void m910c(int i) {
        View childAt = this.f499c.getChildAt(i);
        if (this.f497a != null) {
            removeCallbacks(this.f497a);
        }
        this.f497a = new afa(this, childAt);
        post(this.f497a);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f497a != null) {
            post(this.f497a);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f497a != null) {
            removeCallbacks(this.f497a);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
