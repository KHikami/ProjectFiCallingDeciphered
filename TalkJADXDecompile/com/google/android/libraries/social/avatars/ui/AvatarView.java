package com.google.android.libraries.social.avatars.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import gwb;
import jhf;
import jtv;
import jtx;
import jyn;
import nzf;
import wi;

public final class AvatarView extends View implements jtx {
    private static boolean a;
    private static Paint b;
    private static jhf c;
    private final RectF d;
    private final RectF e;
    private final RectF f;
    private final Matrix g;
    private final Matrix h;
    private final Paint i;
    private Drawable j;
    private jtv k;
    private int l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private int q;
    private boolean r;
    private boolean s;
    private boolean t;
    private String u;
    private String v;
    private String w;
    private String x;

    public AvatarView(Context context) {
        this(context, null);
    }

    public AvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new RectF();
        this.e = new RectF();
        this.f = new RectF();
        this.g = new Matrix();
        this.h = new Matrix();
        this.i = new Paint(2);
        this.t = true;
        Resources resources = context.getResources();
        if (!a) {
            c = (jhf) jyn.a(context, jhf.class);
            Paint paint = new Paint();
            b = paint;
            paint.setAntiAlias(true);
            b.setStrokeWidth(4.0f);
            b.setColor(resources.getColor(gwb.yG));
            b.setStyle(Style.STROKE);
            a = true;
        }
        this.j = resources.getDrawable(gwb.yI);
        this.j.setCallback(this);
        this.l = 2;
        this.q = 2;
        if (attributeSet != null) {
            String attributeValue = attributeSet.getAttributeValue(null, "size");
            if (attributeValue != null) {
                this.l = gwb.X(attributeValue);
            }
            attributeValue = attributeSet.getAttributeValue(null, "shape");
            if (attributeValue != null) {
                this.q = gwb.Y(attributeValue);
            }
            attributeValue = attributeSet.getAttributeValue(null, "selectable");
            if (attributeValue != null) {
                this.t = Boolean.parseBoolean(attributeValue);
            }
            this.p = attributeSet.getAttributeBooleanValue(null, "allowNonSquare", false);
        }
        a(this.l);
    }

    private void a(int i) {
        this.l = i;
        switch (this.l) {
            case wi.w /*0*/:
                this.m = gwb.af(getContext());
            case wi.j /*1*/:
                this.m = gwb.ah(getContext());
            case wi.z /*3*/:
                this.m = gwb.al(getContext());
            default:
                this.m = gwb.aj(getContext());
        }
    }

    public void a(String str, String str2) {
        if (!TextUtils.equals(this.u, str) || !TextUtils.equals(this.v, str2)) {
            b();
            this.u = str;
            this.v = str2;
            this.x = null;
            this.w = null;
            a();
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    public void b() {
        if (this.k != null) {
            this.k.b((jtx) this);
            this.k = null;
        }
    }

    public void a(jtv jtv) {
        if (jtv.m() == 1) {
            this.n = ((Bitmap) jtv.o()).getWidth();
            this.o = ((Bitmap) jtv.o()).getHeight();
            a(getMeasuredWidth(), this.n, getMeasuredHeight(), this.o);
        }
        invalidate();
    }

    protected void onMeasure(int i, int i2) {
        int paddingLeft = (this.m + getPaddingLeft()) + getPaddingRight();
        int mode = MeasureSpec.getMode(i);
        if (mode == 1073741824) {
            paddingLeft = MeasureSpec.getSize(i);
        } else if (mode == nzf.UNSET_ENUM_VALUE) {
            paddingLeft = Math.min(paddingLeft, MeasureSpec.getSize(i));
        }
        mode = this.m;
        int paddingTop = (getPaddingTop() + mode) + getPaddingBottom();
        int mode2 = MeasureSpec.getMode(i2);
        if (!this.p) {
            if (mode2 == 1073741824) {
                paddingLeft = Math.min(paddingLeft, MeasureSpec.getSize(i2));
            } else {
                paddingLeft = Math.min(paddingLeft, paddingTop);
            }
            mode = paddingLeft;
            paddingTop = paddingLeft;
        } else if (mode2 == 1073741824 || mode2 == nzf.UNSET_ENUM_VALUE) {
            mode = Math.min(paddingTop, MeasureSpec.getSize(i2));
            paddingTop = paddingLeft;
        } else {
            paddingTop = paddingLeft;
        }
        if (this.k == null || this.k.m() != 1) {
            this.n = this.m;
            this.o = this.m;
        } else {
            Bitmap bitmap = (Bitmap) this.k.o();
            this.n = bitmap.getWidth();
            this.o = bitmap.getHeight();
        }
        a(paddingTop, this.n, mode, this.o);
        setMeasuredDimension(paddingTop, mode);
    }

    private void a(int i, int i2, int i3, int i4) {
        this.g.reset();
        this.h.reset();
        if (i != 0 && i3 != 0) {
            this.e.set(0.0f, 0.0f, (float) i2, (float) i4);
            this.f.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (i - getPaddingRight()), (float) (i3 - getPaddingBottom()));
            this.g.setRectToRect(this.e, this.f, ScaleToFit.START);
            if (!this.g.invert(this.h)) {
                this.h.reset();
            }
        }
    }

    protected boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.j) {
            return true;
        }
        return super.verifyDrawable(drawable);
    }

    protected void drawableStateChanged() {
        this.j.setState(getDrawableState());
        invalidate();
        super.drawableStateChanged();
    }

    protected void onDraw(Canvas canvas) {
        Bitmap bitmap = null;
        if (this.k != null && this.k.m() == 1) {
            bitmap = (Bitmap) this.k.o();
        }
        if (bitmap == null) {
            switch (this.l) {
                case wi.w /*0*/:
                    bitmap = gwb.w(getContext(), this.q);
                    break;
                case wi.j /*1*/:
                    bitmap = gwb.x(getContext(), this.q);
                    break;
                case wi.l /*2*/:
                    bitmap = gwb.y(getContext(), this.q);
                    break;
                case wi.z /*3*/:
                    bitmap = gwb.z(getContext(), this.q);
                    break;
            }
        }
        if (this.s) {
            this.d.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            canvas.saveLayerAlpha(this.d, 105, 31);
        }
        canvas.concat(this.g);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.i);
        canvas.concat(this.h);
        if (this.s) {
            canvas.restore();
        }
        if (!this.t) {
            return;
        }
        if ((isPressed() || isFocused()) && !this.s) {
            this.d.set(0.0f, 0.0f, (float) this.n, (float) this.o);
            this.g.mapRect(this.d);
            switch (this.q) {
                case wi.w /*0*/:
                    this.j.setBounds((int) this.d.left, (int) this.d.top, (int) this.d.right, (int) this.d.bottom);
                    this.j.draw(canvas);
                case wi.j /*1*/:
                    this.d.set(this.d.left + 2.0f, this.d.top + 2.0f, this.d.right - 2.0f, this.d.bottom - 2.0f);
                    canvas.drawOval(this.d, b);
                case wi.l /*2*/:
                    this.d.set(this.d.left + 2.0f, this.d.top + 2.0f, this.d.right - 2.0f, this.d.bottom - 2.0f);
                    float an = gwb.an(getContext());
                    canvas.drawRoundRect(this.d, an, an, b);
                default:
            }
        }
    }

    public void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
        this.x = (String) charSequence;
    }

    public CharSequence getContentDescription() {
        if (!TextUtils.isEmpty(this.x)) {
            return this.x;
        }
        if (TextUtils.isEmpty(this.w)) {
            if (isClickable()) {
                return getResources().getString(gwb.yK);
            }
            return getResources().getString(gwb.yJ);
        } else if (!isClickable()) {
            return getResources().getString(gwb.yL);
        } else {
            return getResources().getString(gwb.yM, new Object[]{this.w});
        }
    }

    public void a() {
        Object obj;
        if (getWindowToken() != null) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (this.v != null) {
            jtv b;
            if (this.r) {
                b = c.b(getContext(), this.v, this.l, this.q, this);
            } else {
                b = c.a(getContext(), this.v, this.l, this.q, this);
            }
            this.k = b;
            return;
        }
        invalidate();
    }
}
