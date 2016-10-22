package com.android.ex.photo.views;

import ahs;
import aht;
import ahu;
import ahv;
import ahw;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewConfiguration;
import gwb;
import me;
import nq;
import nzf;
import wi;

public class PhotoView extends View implements OnDoubleTapListener, OnGestureListener, OnScaleGestureListener {
    private static int g;
    private static boolean h;
    private static int i;
    private static Bitmap j;
    private static Bitmap k;
    private static Paint l;
    private static Paint m;
    private ScaleGestureDetector A;
    private OnClickListener B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private float G;
    private ahw H;
    private ahv I;
    private RectF J;
    private RectF K;
    private float[] L;
    private boolean M;
    private float N;
    private float O;
    private boolean P;
    public Matrix a;
    public ahu b;
    public float c;
    public aht d;
    public float e;
    public RectF f;
    private Drawable n;
    private Matrix o;
    private Matrix p;
    private int q;
    private boolean r;
    private boolean s;
    private byte[] t;
    private boolean u;
    private boolean v;
    private Rect w;
    private int x;
    private float y;
    private me z;

    public PhotoView(Context context) {
        super(context);
        this.a = new Matrix();
        this.p = new Matrix();
        this.q = -1;
        this.w = new Rect();
        this.D = true;
        this.J = new RectF();
        this.K = new RectF();
        this.f = new RectF();
        this.L = new float[9];
        j();
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Matrix();
        this.p = new Matrix();
        this.q = -1;
        this.w = new Rect();
        this.D = true;
        this.J = new RectF();
        this.K = new RectF();
        this.f = new RectF();
        this.L = new float[9];
        j();
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new Matrix();
        this.p = new Matrix();
        this.q = -1;
        this.w = new Rect();
        this.D = true;
        this.J = new RectF();
        this.K = new RectF();
        this.f = new RectF();
        this.L = new float[9];
        j();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!(this.A == null || this.z == null)) {
            this.A.onTouchEvent(motionEvent);
            this.z.a(motionEvent);
            switch (motionEvent.getAction()) {
                case wi.j /*1*/:
                case wi.z /*3*/:
                    if (!this.H.a) {
                        h();
                        break;
                    }
                    break;
                default:
                    break;
            }
        }
        return true;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        this.M = true;
        if (this.P) {
            return false;
        }
        return a(motionEvent);
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case wi.w /*0*/:
                if (!this.P) {
                    return false;
                }
                this.N = motionEvent.getX();
                this.O = motionEvent.getY();
                return false;
            case wi.j /*1*/:
                if (this.P) {
                    return a(motionEvent);
                }
                return false;
            case wi.l /*2*/:
                if (!this.P || !this.M) {
                    return false;
                }
                int x = (int) (motionEvent.getX() - this.N);
                int y = (int) (motionEvent.getY() - this.O);
                if ((x * x) + (y * y) <= g) {
                    return false;
                }
                this.M = false;
                return false;
            default:
                return false;
        }
    }

    private boolean a(MotionEvent motionEvent) {
        boolean z;
        if (this.D && this.C && this.M) {
            if (this.E) {
                z = false;
            } else {
                float f;
                float f2;
                float width;
                float g = g();
                if (g > this.G) {
                    f = this.G;
                    f2 = f / g;
                    width = (((float) (getWidth() / 2)) - (this.f.centerX() * f2)) / (1.0f - f2);
                    f2 = (((float) (getHeight() / 2)) - (this.f.centerY() * f2)) / (1.0f - f2);
                } else {
                    f = Math.min(this.c, Math.max(this.G, g * 2.0f));
                    f2 = f / g;
                    width = (((float) getWidth()) - this.f.width()) / f2;
                    float height = (((float) getHeight()) - this.f.height()) / f2;
                    if (this.f.width() <= width * 2.0f) {
                        f2 = this.f.centerX();
                    } else {
                        f2 = Math.min(Math.max(this.f.left + width, motionEvent.getX()), this.f.right - width);
                    }
                    if (this.f.height() <= height * 2.0f) {
                        width = f2;
                        f2 = this.f.centerY();
                    } else {
                        width = f2;
                        f2 = Math.min(Math.max(this.f.top + height, motionEvent.getY()), this.f.bottom - height);
                    }
                }
                this.b.a(g, f, width, f2);
                z = true;
            }
            this.E = false;
        } else {
            z = false;
        }
        this.M = false;
        return z;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (!(this.B == null || this.F)) {
            this.B.onClick(this);
        }
        this.F = false;
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.C && !this.b.a) {
            a(-f, -f2);
        }
        return true;
    }

    public boolean onDown(MotionEvent motionEvent) {
        if (this.C) {
            this.H.a();
            this.I.a();
        }
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.C && !this.b.a) {
            this.H.a(f, f2);
        }
        return true;
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (this.C && !this.b.a) {
            this.F = false;
            a(g() * scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        }
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (this.C && !this.b.a) {
            this.b.a();
            this.F = true;
        }
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        if (this.C && this.F) {
            this.E = true;
            f();
        }
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.B = onClickListener;
    }

    public boolean a() {
        if (!this.C) {
            return false;
        }
        if (this.H.a) {
            return true;
        }
        this.a.getValues(this.L);
        this.f.set(this.J);
        this.a.mapRect(this.f);
        float width = (float) getWidth();
        float f = this.L[2];
        float f2 = this.f.right - this.f.left;
        if (!this.C || f2 <= width || f == 0.0f) {
            return false;
        }
        if (width >= f2 + f) {
            return true;
        }
        return true;
    }

    public boolean b() {
        if (!this.C) {
            return false;
        }
        if (this.H.a) {
            return true;
        }
        this.a.getValues(this.L);
        this.f.set(this.J);
        this.a.mapRect(this.f);
        float width = (float) getWidth();
        float f = this.L[2];
        float f2 = this.f.right - this.f.left;
        if (!this.C || f2 <= width) {
            return false;
        }
        if (f == 0.0f) {
            return true;
        }
        if (width < f + f2) {
            return true;
        }
        return false;
    }

    public void c() {
        this.z = null;
        this.A = null;
        this.n = null;
        this.b.a();
        this.b = null;
        this.H.a();
        this.H = null;
        this.I.a();
        this.I = null;
        this.d.a();
        this.d = null;
        setOnClickListener(null);
        this.B = null;
        this.M = false;
    }

    public void a(Drawable drawable) {
        boolean z = false;
        if (!(drawable == null || drawable == this.n)) {
            if (this.n != null) {
                this.n.setCallback(null);
            }
            this.n = drawable;
            this.G = 0.0f;
            this.n.setCallback(this);
            z = true;
        }
        c(z);
        invalidate();
    }

    public Drawable d() {
        return this.n;
    }

    public boolean e() {
        return this.n != null;
    }

    public void a(boolean z) {
        if (z != this.s) {
            this.s = z;
            requestLayout();
            invalidate();
        }
    }

    public void f() {
        this.a.set(this.p);
        invalidate();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.n != null) {
            int saveCount = canvas.getSaveCount();
            canvas.save();
            if (this.o != null) {
                canvas.concat(this.o);
            }
            this.n.draw(canvas);
            canvas.restoreToCount(saveCount);
            if (this.t != null) {
                Bitmap bitmap = this.u ? j : k;
                canvas.drawBitmap(bitmap, (float) ((getWidth() - bitmap.getWidth()) / 2), (float) ((getHeight() - bitmap.getHeight()) / 2), null);
            }
            this.f.set(this.n.getBounds());
            if (this.o != null) {
                this.o.mapRect(this.f);
            }
            if (this.v) {
                int saveCount2 = canvas.getSaveCount();
                canvas.drawRect(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), l);
                canvas.save();
                canvas.clipRect(this.w);
                if (this.o != null) {
                    canvas.concat(this.o);
                }
                this.n.draw(canvas);
                canvas.restoreToCount(saveCount2);
                canvas.drawRect(this.w, m);
            }
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.r = true;
        int width = getWidth();
        int height = getHeight();
        if (this.v) {
            this.x = Math.min(i, Math.min(width, height));
            width = (width - this.x) / 2;
            height = (height - this.x) / 2;
            this.w.set(width, height, this.x + width, this.x + height);
        }
        c(z);
    }

    protected void onMeasure(int i, int i2) {
        if (this.q != -1) {
            super.onMeasure(i, MeasureSpec.makeMeasureSpec(this.q, nzf.UNSET_ENUM_VALUE));
            setMeasuredDimension(getMeasuredWidth(), this.q);
            return;
        }
        super.onMeasure(i, i2);
    }

    public boolean verifyDrawable(Drawable drawable) {
        return this.n == drawable || super.verifyDrawable(drawable);
    }

    public void invalidateDrawable(Drawable drawable) {
        if (this.n == drawable) {
            invalidate();
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public void b(boolean z) {
        this.C = z;
        if (!this.C) {
            f();
        }
    }

    private void c(boolean z) {
        int i = 0;
        if (this.n != null && this.r) {
            int intrinsicWidth = this.n.getIntrinsicWidth();
            int intrinsicHeight = this.n.getIntrinsicHeight();
            int i2 = ((intrinsicWidth < 0 || getWidth() == intrinsicWidth) && (intrinsicHeight < 0 || getHeight() == intrinsicHeight)) ? 1 : 0;
            this.n.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            if (z || (this.G == 0.0f && this.n != null && this.r)) {
                int intrinsicWidth2 = this.n.getIntrinsicWidth();
                int intrinsicHeight2 = this.n.getIntrinsicHeight();
                intrinsicWidth = this.v ? i : getWidth();
                intrinsicHeight = this.v ? i : getHeight();
                if ((intrinsicWidth2 < 0 || intrinsicWidth == intrinsicWidth2) && (intrinsicHeight2 < 0 || intrinsicHeight == intrinsicHeight2)) {
                    i = 1;
                }
                if (i == 0 || this.v) {
                    this.J.set(0.0f, 0.0f, (float) intrinsicWidth2, (float) intrinsicHeight2);
                    if (this.v) {
                        this.K.set(this.w);
                    } else {
                        this.K.set(0.0f, 0.0f, (float) intrinsicWidth, (float) intrinsicHeight);
                    }
                    RectF rectF = new RectF(((float) (intrinsicWidth / 2)) - ((((float) intrinsicWidth2) * this.y) / 2.0f), ((float) (intrinsicHeight / 2)) - ((((float) intrinsicHeight2) * this.y) / 2.0f), ((float) (intrinsicWidth / 2)) + ((((float) intrinsicWidth2) * this.y) / 2.0f), ((float) (intrinsicHeight / 2)) + ((((float) intrinsicHeight2) * this.y) / 2.0f));
                    if (this.K.contains(rectF)) {
                        this.a.setRectToRect(this.J, rectF, ScaleToFit.CENTER);
                    } else {
                        this.a.setRectToRect(this.J, this.K, ScaleToFit.CENTER);
                    }
                } else {
                    this.a.reset();
                }
                this.p.set(this.a);
                intrinsicWidth = this.n.getIntrinsicWidth();
                intrinsicHeight = this.n.getIntrinsicHeight();
                i = this.v ? i() : getWidth();
                int i3 = this.v ? i() : getHeight();
                if (intrinsicWidth >= i || intrinsicHeight >= i3 || this.v) {
                    this.G = g();
                } else {
                    this.G = 1.0f;
                }
                this.c = Math.max(this.G * 4.0f, 4.0f);
            }
            if (i2 != 0 || this.a.isIdentity()) {
                this.o = null;
            } else {
                this.o = this.a;
            }
        }
    }

    private int i() {
        return this.x > 0 ? this.x : i;
    }

    public float g() {
        this.a.getValues(this.L);
        return this.L[0];
    }

    public void a(float f, float f2, float f3) {
        this.a.postRotate(-this.e, (float) (getWidth() / 2), (float) (getHeight() / 2));
        float min = Math.min(Math.max(f, this.G), this.c * 1.5f);
        float g = g();
        if (min > this.c && g <= this.c) {
            postDelayed(new ahs(this), 600);
        }
        min /= g;
        this.a.postScale(min, min, f2, f3);
        this.a.postRotate(this.e, (float) (getWidth() / 2), (float) (getHeight() / 2));
        invalidate();
    }

    public int a(float f, float f2) {
        float f3;
        Object obj;
        Object obj2;
        float f4 = 0.0f;
        this.f.set(this.J);
        this.a.mapRect(this.f);
        float f5 = this.v ? (float) this.w.left : 0.0f;
        if (this.v) {
            f3 = (float) this.w.right;
        } else {
            f3 = (float) getWidth();
        }
        float f6 = this.f.left;
        float f7 = this.f.right;
        if (this.v) {
            f5 = Math.max(f5 - this.f.right, Math.min(f3 - this.f.left, f));
        } else if (f7 - f6 < f3 - f5) {
            f5 += ((f3 - f5) - (f6 + f7)) / 2.0f;
        } else {
            f5 = Math.max(f3 - f7, Math.min(f5 - f6, f));
        }
        if (this.v) {
            f4 = (float) this.w.top;
        }
        if (this.v) {
            f3 = (float) this.w.bottom;
        } else {
            f3 = (float) getHeight();
        }
        f6 = this.f.top;
        f7 = this.f.bottom;
        if (this.v) {
            f4 = Math.max(f4 - this.f.bottom, Math.min(f3 - this.f.top, f2));
        } else if (f7 - f6 < f3 - f4) {
            f4 += ((f3 - f4) - (f6 + f7)) / 2.0f;
        } else {
            f4 = Math.max(f3 - f7, Math.min(f4 - f6, f2));
        }
        this.a.postTranslate(f5, f4);
        invalidate();
        if (f5 == f) {
            obj = 1;
        } else {
            obj = null;
        }
        if (f4 == f2) {
            obj2 = 1;
        } else {
            obj2 = null;
        }
        if (obj != null && obj2 != null) {
            return 3;
        }
        if (obj != null) {
            return 1;
        }
        return obj2 != null ? 2 : 0;
    }

    public void h() {
        float f = 0.0f;
        this.f.set(this.J);
        this.a.mapRect(this.f);
        float f2 = this.v ? (float) this.w.left : 0.0f;
        float width = this.v ? (float) this.w.right : (float) getWidth();
        float f3 = this.f.left;
        float f4 = this.f.right;
        f2 = f4 - f3 < width - f2 ? f2 + (((width - f2) - (f3 + f4)) / 2.0f) : f3 > f2 ? f2 - f3 : f4 < width ? width - f4 : 0.0f;
        if (this.v) {
            width = (float) this.w.top;
        } else {
            width = 0.0f;
        }
        f3 = this.v ? (float) this.w.bottom : (float) getHeight();
        f4 = this.f.top;
        float f5 = this.f.bottom;
        if (f5 - f4 < f3 - width) {
            f = (((f3 - width) - (f5 + f4)) / 2.0f) + width;
        } else if (f4 > width) {
            f = width - f4;
        } else if (f5 < f3) {
            f = f3 - f5;
        }
        if (Math.abs(f2) > 20.0f || Math.abs(f) > 20.0f) {
            this.I.a(f2, f);
            return;
        }
        this.a.postTranslate(f2, f);
        invalidate();
    }

    private void j() {
        Context context = getContext();
        if (!h) {
            h = true;
            Resources resources = context.getApplicationContext().getResources();
            i = resources.getDimensionPixelSize(gwb.ct);
            Paint paint = new Paint();
            l = paint;
            paint.setAntiAlias(true);
            l.setColor(resources.getColor(gwb.cq));
            l.setStyle(Style.FILL);
            paint = new Paint();
            m = paint;
            paint.setAntiAlias(true);
            m.setColor(resources.getColor(gwb.cr));
            m.setStyle(Style.STROKE);
            m.setStrokeWidth(resources.getDimension(gwb.cs));
            int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            g = scaledTouchSlop * scaledTouchSlop;
        }
        this.z = new me(context, this, null);
        this.A = new ScaleGestureDetector(context, this);
        this.P = nq.a.a(this.A);
        this.b = new ahu(this);
        this.H = new ahw(this);
        this.I = new ahv(this);
        this.d = new aht(this);
    }

    public void a(float f) {
        this.y = f;
    }
}
