package android.support.v7.widget;

import aci;
import afj;
import afk;
import afp;
import age;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import gwb;
import jb;
import nh;
import oa;
import wi;
import wq;

public class SwitchCompat extends CompoundButton {
    private static final int[] M;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private TextPaint G;
    private ColorStateList H;
    private Layout I;
    private Layout J;
    private TransformationMethod K;
    private final Rect L;
    public afk a;
    private Drawable b;
    private ColorStateList c;
    private Mode d;
    private boolean e;
    private boolean f;
    private Drawable g;
    private ColorStateList h;
    private Mode i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
    private int n;
    private boolean o;
    private CharSequence p;
    private CharSequence q;
    private boolean r;
    private int s;
    private int t;
    private float u;
    private float v;
    private VelocityTracker w;
    private int x;
    private float y;
    private int z;

    static {
        M = new int[]{16842912};
    }

    public SwitchCompat(Context context) {
        this(context, null);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gwb.ab);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = null;
        this.d = null;
        this.e = false;
        this.f = false;
        this.h = null;
        this.i = null;
        this.j = false;
        this.k = false;
        this.w = VelocityTracker.obtain();
        this.L = new Rect();
        this.G = new TextPaint(1);
        Resources resources = getResources();
        this.G.density = resources.getDisplayMetrics().density;
        afp a = afp.a(context, attributeSet, wi.cJ, i, 0);
        this.b = a.a(wi.cM);
        if (this.b != null) {
            this.b.setCallback(this);
        }
        this.g = a.a(wi.cV);
        if (this.g != null) {
            this.g.setCallback(this);
        }
        this.p = a.c(wi.cL);
        this.q = a.c(wi.cK);
        this.r = a.a(wi.cN, true);
        this.l = a.e(wi.cS, 0);
        this.m = a.e(wi.cP, 0);
        this.n = a.e(wi.cQ, 0);
        this.o = a.a(wi.cO, false);
        ColorStateList e = a.e(wi.cT);
        if (e != null) {
            this.c = e;
            this.e = true;
        }
        Mode a2 = aci.a(a.a(wi.cU, -1), null);
        if (this.d != a2) {
            this.d = a2;
            this.f = true;
        }
        if ((this.e || this.f) && this.b != null && (this.e || this.f)) {
            this.b = this.b.mutate();
            if (this.e) {
                jb.a(this.b, this.c);
            }
            if (this.f) {
                jb.a(this.b, this.d);
            }
            if (this.b.isStateful()) {
                this.b.setState(getDrawableState());
            }
        }
        e = a.e(wi.cW);
        if (e != null) {
            this.h = e;
            this.j = true;
        }
        a2 = aci.a(a.a(wi.cX, -1), null);
        if (this.i != a2) {
            this.i = a2;
            this.k = true;
        }
        if ((this.j || this.k) && this.g != null && (this.j || this.k)) {
            this.g = this.g.mutate();
            if (this.j) {
                jb.a(this.g, this.h);
            }
            if (this.k) {
                jb.a(this.g, this.i);
            }
            if (this.g.isStateful()) {
                this.g.setState(getDrawableState());
            }
        }
        int g = a.g(wi.cR, 0);
        if (g != 0) {
            a(context, g);
        }
        a.a();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.t = viewConfiguration.getScaledTouchSlop();
        this.x = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    public void a(Context context, int i) {
        Typeface typeface;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, wi.da);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(wi.db);
        if (colorStateList != null) {
            this.H = colorStateList;
        } else {
            this.H = getTextColors();
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(wi.dc, 0);
        if (!(dimensionPixelSize == 0 || ((float) dimensionPixelSize) == this.G.getTextSize())) {
            this.G.setTextSize((float) dimensionPixelSize);
            requestLayout();
        }
        dimensionPixelSize = obtainStyledAttributes.getInt(wi.de, -1);
        int i2 = obtainStyledAttributes.getInt(wi.dd, -1);
        switch (dimensionPixelSize) {
            case wi.j /*1*/:
                typeface = Typeface.SANS_SERIF;
                break;
            case wi.l /*2*/:
                typeface = Typeface.SERIF;
                break;
            case wi.z /*3*/:
                typeface = Typeface.MONOSPACE;
                break;
            default:
                typeface = null;
                break;
        }
        a(typeface, i2);
        if (obtainStyledAttributes.getBoolean(wi.df, false)) {
            this.K = new wq(getContext());
        } else {
            this.K = null;
        }
        obtainStyledAttributes.recycle();
    }

    public void a(Typeface typeface, int i) {
        boolean z = false;
        if (i > 0) {
            Typeface defaultFromStyle;
            int style;
            float f;
            if (typeface == null) {
                defaultFromStyle = Typeface.defaultFromStyle(i);
            } else {
                defaultFromStyle = Typeface.create(typeface, i);
            }
            a(defaultFromStyle);
            if (defaultFromStyle != null) {
                style = defaultFromStyle.getStyle();
            } else {
                style = 0;
            }
            style = (style ^ -1) & i;
            TextPaint textPaint = this.G;
            if ((style & 1) != 0) {
                z = true;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.G;
            if ((style & 2) != 0) {
                f = -0.25f;
            } else {
                f = 0.0f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.G.setFakeBoldText(false);
        this.G.setTextSkewX(0.0f);
        a(typeface);
    }

    public void a(Typeface typeface) {
        if (this.G.getTypeface() != typeface) {
            this.G.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        int max;
        int i3 = 0;
        if (this.r) {
            if (this.I == null) {
                this.I = a(this.p);
            }
            if (this.J == null) {
                this.J = a(this.q);
            }
        }
        Rect rect = this.L;
        if (this.b != null) {
            this.b.getPadding(rect);
            intrinsicWidth = (this.b.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.b.getIntrinsicHeight();
        } else {
            intrinsicHeight = 0;
            intrinsicWidth = 0;
        }
        if (this.r) {
            max = Math.max(this.I.getWidth(), this.J.getWidth()) + (this.l << 1);
        } else {
            max = 0;
        }
        this.B = Math.max(max, intrinsicWidth);
        if (this.g != null) {
            this.g.getPadding(rect);
            i3 = this.g.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        max = rect.left;
        intrinsicWidth = rect.right;
        if (this.b != null) {
            rect = aci.a(this.b);
            max = Math.max(max, rect.left);
            intrinsicWidth = Math.max(intrinsicWidth, rect.right);
        }
        intrinsicWidth = Math.max(this.m, intrinsicWidth + (max + (this.B * 2)));
        intrinsicHeight = Math.max(i3, intrinsicHeight);
        this.z = intrinsicWidth;
        this.A = intrinsicHeight;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < intrinsicHeight) {
            setMeasuredDimension(oa.e(this), intrinsicHeight);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        Object obj = isChecked() ? this.p : this.q;
        if (obj != null) {
            accessibilityEvent.getText().add(obj);
        }
    }

    private Layout a(CharSequence charSequence) {
        int ceil;
        CharSequence transformation = this.K != null ? this.K.getTransformation(charSequence, this) : charSequence;
        TextPaint textPaint = this.G;
        if (transformation != null) {
            ceil = (int) Math.ceil((double) Layout.getDesiredWidth(transformation, this.G));
        } else {
            ceil = 0;
        }
        return new StaticLayout(transformation, textPaint, ceil, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f = 1.0f;
        int i = 0;
        this.w.addMovement(motionEvent);
        float x;
        switch (nh.a(motionEvent)) {
            case wi.w /*0*/:
                x = motionEvent.getX();
                f = motionEvent.getY();
                if (isEnabled()) {
                    if (this.b != null) {
                        int c = c();
                        this.b.getPadding(this.L);
                        int i2 = this.D - this.t;
                        c = (c + this.C) - this.t;
                        int i3 = (((this.B + c) + this.L.left) + this.L.right) + this.t;
                        int i4 = this.F + this.t;
                        if (x > ((float) c) && x < ((float) i3) && f > ((float) i2) && f < ((float) i4)) {
                            i = 1;
                        }
                    }
                    if (i != 0) {
                        this.s = 1;
                        this.u = x;
                        this.v = f;
                        break;
                    }
                }
                break;
            case wi.j /*1*/:
            case wi.z /*3*/:
                if (this.s != 2) {
                    this.s = 0;
                    this.w.clear();
                    break;
                }
                this.s = 0;
                boolean z = motionEvent.getAction() == 1 && isEnabled();
                boolean isChecked = isChecked();
                if (z) {
                    this.w.computeCurrentVelocity(1000);
                    x = this.w.getXVelocity();
                    z = Math.abs(x) > ((float) this.x) ? age.a(this) ? x < 0.0f : x > 0.0f : b();
                } else {
                    z = isChecked;
                }
                if (z != isChecked) {
                    playSoundEffect(0);
                }
                setChecked(z);
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
                super.onTouchEvent(motionEvent);
                return true;
            case wi.l /*2*/:
                switch (this.s) {
                    case wi.w /*0*/:
                        break;
                    case wi.j /*1*/:
                        x = motionEvent.getX();
                        f = motionEvent.getY();
                        if (Math.abs(x - this.u) > ((float) this.t) || Math.abs(f - this.v) > ((float) this.t)) {
                            this.s = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.u = x;
                            this.v = f;
                            return true;
                        }
                    case wi.l /*2*/:
                        float x2 = motionEvent.getX();
                        int d = d();
                        float f2 = x2 - this.u;
                        x = d != 0 ? f2 / ((float) d) : f2 > 0.0f ? 1.0f : -1.0f;
                        if (age.a(this)) {
                            x = -x;
                        }
                        x += this.y;
                        if (x < 0.0f) {
                            f = 0.0f;
                        } else if (x <= 1.0f) {
                            f = x;
                        }
                        if (f == this.y) {
                            return true;
                        }
                        this.u = x2;
                        a(f);
                        return true;
                    default:
                        break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    private void a() {
        if (this.a != null) {
            clearAnimation();
            this.a = null;
        }
    }

    private boolean b() {
        return this.y > 0.5f;
    }

    public void a(float f) {
        this.y = f;
        invalidate();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    public void setChecked(boolean z) {
        float f = 1.0f;
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (getWindowToken() != null && oa.q(this) && isShown()) {
            if (this.a != null) {
                a();
            }
            float f2 = this.y;
            if (!isChecked) {
                f = 0.0f;
            }
            this.a = new afk(this, f2, f);
            this.a.setDuration(250);
            this.a.setAnimationListener(new afj(this, isChecked));
            startAnimation(this.a);
            return;
        }
        a();
        if (!isChecked) {
            f = 0.0f;
        }
        a(f);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int max;
        int paddingLeft;
        int paddingTop;
        int i5 = 0;
        super.onLayout(z, i, i2, i3, i4);
        if (this.b != null) {
            Rect rect = this.L;
            if (this.g != null) {
                this.g.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect a = aci.a(this.b);
            max = Math.max(0, a.left - rect.left);
            i5 = Math.max(0, a.right - rect.right);
        } else {
            max = 0;
        }
        if (age.a(this)) {
            paddingLeft = getPaddingLeft() + max;
            max = ((this.z + paddingLeft) - max) - i5;
            i5 = paddingLeft;
        } else {
            paddingLeft = (getWidth() - getPaddingRight()) - i5;
            i5 += max + (paddingLeft - this.z);
            max = paddingLeft;
        }
        switch (getGravity() & 112) {
            case wi.dI /*16*/:
                paddingTop = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (this.A / 2);
                paddingLeft = this.A + paddingTop;
                break;
            case 80:
                paddingLeft = getHeight() - getPaddingBottom();
                paddingTop = paddingLeft - this.A;
                break;
            default:
                paddingTop = getPaddingTop();
                paddingLeft = this.A + paddingTop;
                break;
        }
        this.C = i5;
        this.D = paddingTop;
        this.F = paddingLeft;
        this.E = max;
    }

    public void draw(Canvas canvas) {
        Rect a;
        int i;
        Rect rect = this.L;
        int i2 = this.C;
        int i3 = this.D;
        int i4 = this.E;
        int i5 = this.F;
        int c = i2 + c();
        if (this.b != null) {
            a = aci.a(this.b);
        } else {
            a = aci.a;
        }
        if (this.g != null) {
            this.g.getPadding(rect);
            int i6 = rect.left + c;
            if (a != null) {
                if (a.left > rect.left) {
                    i2 += a.left - rect.left;
                }
                if (a.top > rect.top) {
                    c = (a.top - rect.top) + i3;
                } else {
                    c = i3;
                }
                if (a.right > rect.right) {
                    i4 -= a.right - rect.right;
                }
                i = a.bottom > rect.bottom ? i5 - (a.bottom - rect.bottom) : i5;
            } else {
                i = i5;
                c = i3;
            }
            this.g.setBounds(i2, c, i4, i);
            i = i6;
        } else {
            i = c;
        }
        if (this.b != null) {
            this.b.getPadding(rect);
            i2 = i - rect.left;
            i = (i + this.B) + rect.right;
            this.b.setBounds(i2, i3, i, i5);
            Drawable background = getBackground();
            if (background != null) {
                jb.a(background, i2, i3, i, i5);
            }
        }
        super.draw(canvas);
    }

    protected void onDraw(Canvas canvas) {
        int save;
        super.onDraw(canvas);
        Rect rect = this.L;
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.D + rect.top;
        int i2 = this.F - rect.bottom;
        Drawable drawable2 = this.b;
        if (drawable != null) {
            if (!this.o || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect a = aci.a(drawable2);
                drawable2.copyBounds(rect);
                rect.left += a.left;
                rect.right -= a.right;
                save = canvas.save();
                canvas.clipRect(rect, Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        save = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = b() ? this.I : this.J;
        if (layout != null) {
            int i3;
            int[] drawableState = getDrawableState();
            if (this.H != null) {
                this.G.setColor(this.H.getColorForState(drawableState, 0));
            }
            this.G.drawableState = drawableState;
            if (drawable2 != null) {
                rect = drawable2.getBounds();
                i3 = rect.right + rect.left;
            } else {
                i3 = getWidth();
            }
            canvas.translate((float) ((i3 / 2) - (layout.getWidth() / 2)), (float) (((i + i2) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save);
    }

    public int getCompoundPaddingLeft() {
        if (!age.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.z;
        if (TextUtils.isEmpty(getText())) {
            return compoundPaddingLeft;
        }
        return compoundPaddingLeft + this.n;
    }

    public int getCompoundPaddingRight() {
        if (age.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.z;
        if (TextUtils.isEmpty(getText())) {
            return compoundPaddingRight;
        }
        return compoundPaddingRight + this.n;
    }

    private int c() {
        float f;
        if (age.a(this)) {
            f = 1.0f - this.y;
        } else {
            f = this.y;
        }
        return (int) ((f * ((float) d())) + 0.5f);
    }

    private int d() {
        if (this.g == null) {
            return 0;
        }
        Rect a;
        Rect rect = this.L;
        this.g.getPadding(rect);
        if (this.b != null) {
            a = aci.a(this.b);
        } else {
            a = aci.a;
        }
        return ((((this.z - this.B) - rect.left) - rect.right) - a.left) - a.right;
    }

    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, M);
        }
        return onCreateDrawableState;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        int i = 0;
        Drawable drawable = this.b;
        if (drawable != null && drawable.isStateful()) {
            i = drawable.setState(drawableState) | 0;
        }
        drawable = this.g;
        if (drawable != null && drawable.isStateful()) {
            i |= drawable.setState(drawableState);
        }
        if (i != 0) {
            invalidate();
        }
    }

    public void drawableHotspotChanged(float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        if (this.b != null) {
            jb.a(this.b, f, f2);
        }
        if (this.g != null) {
            jb.a(this.g, f, f2);
        }
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.b || drawable == this.g;
    }

    public void jumpDrawablesToCurrentState() {
        if (VERSION.SDK_INT >= 11) {
            super.jumpDrawablesToCurrentState();
            if (this.b != null) {
                this.b.jumpToCurrentState();
            }
            if (this.g != null) {
                this.g.jumpToCurrentState();
            }
            a();
            a(isChecked() ? 1.0f : 0.0f);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (VERSION.SDK_INT >= 14) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.Switch");
            CharSequence charSequence = isChecked() ? this.p : this.q;
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                CharSequence stringBuilder = new StringBuilder();
                stringBuilder.append(text).append(' ').append(charSequence);
                accessibilityNodeInfo.setText(stringBuilder);
            }
        }
    }
}
