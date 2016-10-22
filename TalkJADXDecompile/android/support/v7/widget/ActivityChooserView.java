package android.support.v7.widget;

import acv;
import add;
import afp;
import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.PopupWindow.OnDismissListener;
import mb;
import zt;
import zx;
import zy;

public final class ActivityChooserView extends ViewGroup {
    public final zx a;
    public final FrameLayout b;
    public final FrameLayout c;
    public final int d;
    public mb e;
    public final OnGlobalLayoutListener f;
    public OnDismissListener g;
    public boolean h;
    public int i;
    private final zy j;
    private final acv k;
    private final DataSetObserver l;
    private add m;
    private boolean n;

    public class InnerLayout extends acv {
        private static final int[] a;

        static {
            a = new int[]{16842964};
        }

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            afp a = afp.a(context, attributeSet, a);
            setBackgroundDrawable(a.a(0));
            a.a();
        }
    }

    public boolean a() {
        if (c()) {
            b().c();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.f);
            }
        }
        return true;
    }

    private boolean c() {
        return b().d();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        zt d = this.a.d();
        if (d != null) {
            d.registerObserver(this.l);
        }
        this.n = true;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zt d = this.a.d();
        if (d != null) {
            d.unregisterObserver(this.l);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f);
        }
        if (c()) {
            a();
        }
        this.n = false;
    }

    protected void onMeasure(int i, int i2) {
        View view = this.k;
        if (this.c.getVisibility() != 0) {
            i2 = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.k.layout(0, 0, i3 - i, i4 - i2);
        if (!c()) {
            a();
        }
    }

    public add b() {
        if (this.m == null) {
            this.m = new add(getContext());
            this.m.a(this.a);
            this.m.a((View) this);
            this.m.a(true);
            this.m.a(this.j);
            this.m.a(this.j);
        }
        return this.m;
    }
}
