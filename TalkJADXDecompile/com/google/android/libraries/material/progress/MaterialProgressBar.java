package com.google.android.libraries.material.progress;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import gwb;
import ive;
import ivf;
import ivi;
import ivm;
import ivp;
import ivs;
import ivt;
import ivu;
import oa;
import wi;

public class MaterialProgressBar extends ProgressBar {
    private static final String c;
    public boolean a;
    public int b;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    static {
        c = MaterialProgressBar.class.getSimpleName();
    }

    private MaterialProgressBar(Context context) {
        super(context, null, 16842872);
        e();
    }

    public MaterialProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e();
        a(context, attributeSet, 0, gwb.xU);
        f();
    }

    public MaterialProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e();
        a(context, attributeSet, i, gwb.xU);
        f();
    }

    private void e() {
        this.a = false;
        this.b = super.getProgress();
    }

    private void f() {
        g();
        if (isIndeterminate()) {
            getProgressDrawable().setVisible(false, false);
            getIndeterminateDrawable().setVisible(i(), true);
            return;
        }
        getProgressDrawable().setVisible(i(), true);
        getIndeterminateDrawable().setVisible(false, false);
    }

    private void a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ivu.aI, i, i2);
        this.g = obtainStyledAttributes.getDimensionPixelSize(ivu.aN, 0);
        this.h = obtainStyledAttributes.getDimensionPixelSize(ivu.aO, 0);
        this.d = obtainStyledAttributes.getInt(ivu.aM, 0);
        switch (this.d) {
            case wi.w /*0*/:
                a(obtainStyledAttributes, true);
                break;
            case wi.j /*1*/:
            case wi.l /*2*/:
                b(obtainStyledAttributes, true);
                break;
            default:
                throw new IllegalArgumentException("Invalid determinate progress style");
        }
        this.e = obtainStyledAttributes.getInt(ivu.aL, 1);
        switch (this.e) {
            case wi.w /*0*/:
                a(obtainStyledAttributes, false);
                break;
            case wi.j /*1*/:
                b(obtainStyledAttributes, false);
                break;
            default:
                throw new IllegalArgumentException("Invalid determinate progress style");
        }
        obtainStyledAttributes.recycle();
    }

    public synchronized void setIndeterminate(boolean z) {
        super.setIndeterminate(z);
        g();
        Drawable j = j();
        if (j != null) {
            j.setVisible(i(), false);
        }
    }

    public void a() {
        if (!isIndeterminate()) {
            return;
        }
        if (this.e == 1) {
            ivp ivp = (ivp) getIndeterminateDrawable();
            this.a = true;
            ivp.b(new ivs(this, ivp));
            return;
        }
        setIndeterminate(false);
    }

    private void g() {
        if (isIndeterminate()) {
            if (this.d != 0) {
                setMinimumHeight(this.g);
            } else {
                setMinimumHeight(0);
            }
        } else if (this.e != 0) {
            setMinimumHeight(this.g);
        } else {
            setMinimumHeight(0);
        }
    }

    public synchronized void setProgress(int i) {
        if (!this.a) {
            super.setProgress(i);
        }
        this.b = i;
    }

    public synchronized int getProgress() {
        return this.a ? this.b : super.getProgress();
    }

    public void a(int i) {
        if (this.a || !isIndeterminate()) {
            setProgress(0);
            if (!this.a && this.e == 1) {
                ((ivm) getProgressDrawable()).b();
            }
        }
    }

    private void a(TypedArray typedArray, boolean z) {
        int[] intArray;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int i = typedArray.getInt(ivu.aQ, 3);
        if (typedArray.hasValue(ivu.aK)) {
            intArray = getResources().getIntArray(typedArray.getResourceId(ivu.aK, -1));
        } else {
            intArray = typedArray.hasValue(ivu.aJ) ? new int[]{typedArray.getColor(ivu.aJ, 0)} : null;
        }
        int[] intArray2 = intArray == null ? getResources().getIntArray(gwb.xJ) : intArray;
        switch (i) {
            case wi.j /*1*/:
                dimensionPixelSize = getResources().getDimensionPixelSize(gwb.xQ);
                break;
            case wi.l /*2*/:
                dimensionPixelSize = getResources().getDimensionPixelSize(gwb.xP);
                break;
            case wi.z /*3*/:
                dimensionPixelSize = getResources().getDimensionPixelSize(gwb.xO);
                break;
            default:
                throw new IllegalStateException("Invalid progress circle size");
        }
        this.f = dimensionPixelSize;
        switch (i) {
            case wi.j /*1*/:
                dimensionPixelSize2 = getResources().getDimensionPixelSize(gwb.xT);
                break;
            case wi.l /*2*/:
                dimensionPixelSize2 = getResources().getDimensionPixelSize(gwb.xS);
                break;
            case wi.z /*3*/:
                dimensionPixelSize2 = getResources().getDimensionPixelSize(gwb.xR);
                break;
            default:
                throw new IllegalStateException("Invalid progress circle size");
        }
        switch (i) {
            case wi.j /*1*/:
                dimensionPixelSize = getResources().getDimensionPixelSize(gwb.xN);
                break;
            case wi.l /*2*/:
                dimensionPixelSize = getResources().getDimensionPixelSize(gwb.xM);
                break;
            case wi.z /*3*/:
                dimensionPixelSize = getResources().getDimensionPixelSize(gwb.xL);
                break;
            default:
                throw new IllegalStateException("Invalid progress circle size");
        }
        if (z) {
            setIndeterminateDrawable(new ivi(-1.0f, dimensionPixelSize2, dimensionPixelSize, intArray2));
        } else {
            setProgressDrawable(new ivf(-1.0f, dimensionPixelSize2, dimensionPixelSize, intArray2[0]));
        }
    }

    private void b(TypedArray typedArray, boolean z) {
        int color;
        boolean z2 = true;
        if (typedArray.hasValue(ivu.aJ)) {
            color = typedArray.getColor(ivu.aJ, -1);
        } else {
            color = getResources().getColor(gwb.xK);
        }
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{16842803});
        float f = obtainStyledAttributes.getFloat(0, 0.2f);
        obtainStyledAttributes.recycle();
        int i = typedArray.getInt(ivu.aP, 0);
        if (z) {
            int i2 = this.g;
            if (this.d != 2) {
                z2 = false;
            }
            setIndeterminateDrawable(new ivp(i2, color, f, z2, b(i)));
            return;
        }
        setProgressDrawable(new ivm(this.g, color, f, b(i)));
    }

    private static int b(int i) {
        switch (i) {
            case wi.w /*0*/:
                return 0;
            case wi.j /*1*/:
                return 1;
            case wi.l /*2*/:
                return 2;
            default:
                throw new IllegalArgumentException("Invalid attribute value for mtrlLinearGrowFrom: " + i);
        }
    }

    private int h() {
        return isIndeterminate() ? this.d : this.e;
    }

    private boolean i() {
        return oa.s(this) && getWindowVisibility() == 0 && b();
    }

    protected boolean b() {
        View view = this;
        while (view.getVisibility() == 0) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            } else {
                if (!(parent instanceof View)) {
                    return true;
                }
                view = (View) parent;
            }
        }
        return false;
    }

    protected synchronized void onDraw(Canvas canvas) {
        int save = canvas.save();
        if (!(getPaddingLeft() == 0 && getPaddingTop() == 0)) {
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
        }
        if (!(getPaddingRight() == 0 && getPaddingBottom() == 0)) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        j().draw(canvas);
        canvas.restoreToCount(save);
    }

    protected void onDetachedFromWindow() {
        if (j() instanceof ive) {
            ((ive) j()).a();
        }
        super.onDetachedFromWindow();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (i()) {
            c();
        }
    }

    protected synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (h() == 0) {
            setMeasuredDimension((this.f + getPaddingLeft()) + getPaddingRight(), (this.f + getPaddingTop()) + getPaddingBottom());
        } else {
            setMeasuredDimension(getMeasuredWidth(), resolveSizeAndState((((this.g + this.h) + this.h) + getPaddingTop()) + getPaddingBottom(), i2, 0));
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        if (h() != 0) {
            int paddingLeft = i - (getPaddingLeft() + getPaddingRight());
            int paddingTop = i2 - (getPaddingTop() + getPaddingBottom());
            Drawable indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable != null) {
                indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
            }
            indeterminateDrawable = getProgressDrawable();
            if (indeterminateDrawable != null) {
                indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
                return;
            }
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
    }

    private Drawable j() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        k();
    }

    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        k();
    }

    private void k() {
        Drawable j = j();
        if (j != null) {
            boolean i = i();
            if (!(j instanceof ive) || i) {
                j.setVisible(i, true);
            } else {
                ((ive) j).a();
            }
        }
    }

    public void c() {
        if (getVisibility() != 0) {
            setVisibility(0);
        } else if (i()) {
            j().setVisible(true, false);
        }
    }

    public void d() {
        if (i()) {
            Drawable j = j();
            if (j instanceof ive) {
                ((ive) j).a(new ivt(this));
                return;
            }
            return;
        }
        setVisibility(4);
    }
}
