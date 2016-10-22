package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.api.client.http.HttpStatusCodes;
import java.util.ArrayList;
import java.util.List;
import jb;
import mj;
import nzf;
import oa;
import oq;
import sb;
import sc;
import sd;
import se;
import sf;
import sg;
import sh;
import si;
import sk;
import so;
import tl;
import wi;

public class DrawerLayout extends ViewGroup implements so {
    public static final int[] a;
    public static final boolean b;
    static final sd c;
    private static final boolean d;
    private float A;
    private Drawable B;
    private Drawable C;
    private Drawable D;
    private CharSequence E;
    private CharSequence F;
    private Object G;
    private boolean H;
    private Drawable I;
    private Drawable J;
    private Drawable K;
    private Drawable L;
    private final ArrayList<View> M;
    private final sc e;
    private float f;
    private int g;
    private int h;
    private float i;
    private Paint j;
    private final tl k;
    private final tl l;
    private final sk m;
    private final sk n;
    private int o;
    private boolean p;
    private boolean q;
    private int r;
    private int s;
    private int t;
    private int u;
    private boolean v;
    private boolean w;
    private sg x;
    private List<sg> y;
    private float z;

    static {
        boolean z = true;
        a = new int[]{16842931};
        b = VERSION.SDK_INT >= 19;
        if (VERSION.SDK_INT < 21) {
            z = false;
        }
        d = z;
        if (VERSION.SDK_INT >= 21) {
            c = new se();
        } else {
            c = new sf();
        }
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new sc(this);
        this.h = -1728053248;
        this.j = new Paint();
        this.q = true;
        this.r = 3;
        this.s = 3;
        this.t = 3;
        this.u = 3;
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = null;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.g = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        this.m = new sk(this, 3);
        this.n = new sk(this, 5);
        this.k = tl.a(this, 1.0f, this.m);
        this.k.a(1);
        this.k.a(f2);
        this.m.a(this.k);
        this.l = tl.a(this, 1.0f, this.n);
        this.l.a(2);
        this.l.a(f2);
        this.n.a(this.l);
        setFocusableInTouchMode(true);
        oa.c(this, 1);
        oa.a(this, new sb(this));
        oq.a.a(this, false);
        if (oa.p(this)) {
            c.a(this);
            this.B = c.a(context);
        }
        this.f = f * 10.0f;
        this.M = new ArrayList();
    }

    public void a(Object obj, boolean z) {
        this.G = obj;
        this.H = z;
        boolean z2 = !z && getBackground() == null;
        setWillNotDraw(z2);
        requestLayout();
    }

    @Deprecated
    public void a(sg sgVar) {
        if (this.x != null) {
            c(this.x);
        }
        if (sgVar != null) {
            b(sgVar);
        }
        this.x = sgVar;
    }

    public void b(sg sgVar) {
        if (sgVar != null) {
            if (this.y == null) {
                this.y = new ArrayList();
            }
            this.y.add(sgVar);
        }
    }

    public void c(sg sgVar) {
        if (sgVar != null && this.y != null) {
            this.y.remove(sgVar);
        }
    }

    public void a(int i) {
        a(i, 3);
        a(i, 5);
    }

    public void a(int i, int i2) {
        int a = mj.a(i2, oa.d(this));
        switch (i2) {
            case wi.z /*3*/:
                this.r = i;
                break;
            case wi.p /*5*/:
                this.s = i;
                break;
            case 8388611:
                this.t = i;
                break;
            case 8388613:
                this.u = i;
                break;
        }
        if (i != 0) {
            (a == 3 ? this.k : this.l).e();
        }
        View d;
        switch (i) {
            case wi.j /*1*/:
                d = d(a);
                if (d != null) {
                    i(d);
                }
            case wi.l /*2*/:
                d = d(a);
                if (d != null) {
                    h(d);
                }
            default:
        }
    }

    public int b(int i) {
        int d = oa.d(this);
        switch (i) {
            case wi.z /*3*/:
                if (this.r != 3) {
                    return this.r;
                }
                d = d == 0 ? this.t : this.u;
                if (d != 3) {
                    return d;
                }
                break;
            case wi.p /*5*/:
                if (this.s != 3) {
                    return this.s;
                }
                d = d == 0 ? this.u : this.t;
                if (d != 3) {
                    return d;
                }
                break;
            case 8388611:
                if (this.t != 3) {
                    return this.t;
                }
                d = d == 0 ? this.r : this.s;
                if (d != 3) {
                    return d;
                }
                break;
            case 8388613:
                if (this.u != 3) {
                    return this.u;
                }
                d = d == 0 ? this.s : this.r;
                if (d != 3) {
                    return d;
                }
                break;
        }
        return 0;
    }

    public int a(View view) {
        if (g(view)) {
            return b(((sh) view.getLayoutParams()).a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public CharSequence c(int i) {
        int a = mj.a(i, oa.d(this));
        if (a == 3) {
            return this.E;
        }
        if (a == 5) {
            return this.F;
        }
        return null;
    }

    public void a(int i, View view) {
        int a = this.k.a();
        int a2 = this.l.a();
        if (a == 1 || a2 == 1) {
            a = 1;
        } else if (a == 2 || a2 == 2) {
            a = 2;
        } else {
            a = 0;
        }
        if (view != null && i == 0) {
            sh shVar = (sh) view.getLayoutParams();
            if (shVar.b == 0.0f) {
                b(view);
            } else if (shVar.b == 1.0f) {
                c(view);
            }
        }
        if (a != this.o) {
            this.o = a;
            if (this.y != null) {
                for (int size = this.y.size() - 1; size >= 0; size--) {
                    ((sg) this.y.get(size)).a(a);
                }
            }
        }
    }

    void b(View view) {
        sh shVar = (sh) view.getLayoutParams();
        if ((shVar.d & 1) == 1) {
            shVar.d = 0;
            if (this.y != null) {
                for (int size = this.y.size() - 1; size >= 0; size--) {
                    ((sg) this.y.get(size)).b(view);
                }
            }
            c(view, false);
            if (hasWindowFocus()) {
                View rootView = getRootView();
                if (rootView != null) {
                    rootView.sendAccessibilityEvent(32);
                }
            }
        }
    }

    void c(View view) {
        sh shVar = (sh) view.getLayoutParams();
        if ((shVar.d & 1) == 0) {
            shVar.d = 1;
            if (this.y != null) {
                for (int size = this.y.size() - 1; size >= 0; size--) {
                    ((sg) this.y.get(size)).a(view);
                }
            }
            c(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
            view.requestFocus();
        }
    }

    private void c(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || g(childAt)) && !(z && childAt == view)) {
                oa.c(childAt, 4);
            } else {
                oa.c(childAt, 1);
            }
        }
    }

    void a(View view, float f) {
        if (this.y != null) {
            for (int size = this.y.size() - 1; size >= 0; size--) {
                ((sg) this.y.get(size)).a(view, f);
            }
        }
    }

    public void b(View view, float f) {
        sh shVar = (sh) view.getLayoutParams();
        if (f != shVar.b) {
            shVar.b = f;
            a(view, f);
        }
    }

    public float d(View view) {
        return ((sh) view.getLayoutParams()).b;
    }

    public int e(View view) {
        return mj.a(((sh) view.getLayoutParams()).a, oa.d(this));
    }

    public boolean a(View view, int i) {
        return (e(view) & i) == i;
    }

    View a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((sh) childAt.getLayoutParams()).d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    void c(View view, float f) {
        float d = d(view);
        int width = view.getWidth();
        int i = ((int) (((float) width) * f)) - ((int) (d * ((float) width)));
        if (!a(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        b(view, f);
    }

    public View d(int i) {
        int a = mj.a(i, oa.d(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((e(childAt) & 7) == a) {
                return childAt;
            }
        }
        return null;
    }

    private static String j(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        if ((i & 5) == 5) {
            return "RIGHT";
        }
        return Integer.toHexString(i);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.q = true;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.q = true;
    }

    protected void onMeasure(int i, int i2) {
        Object obj;
        int d;
        Object obj2;
        Object obj3;
        int childCount;
        int i3;
        View childAt;
        sh shVar;
        int a;
        int e;
        Object obj4;
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode != nzf.UNSET_ENUM_VALUE && mode == 0) {
                    size = HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES;
                }
                if (mode2 != nzf.UNSET_ENUM_VALUE && mode2 == 0) {
                    mode = size;
                    size = HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES;
                    setMeasuredDimension(mode, size);
                    if (this.G == null && oa.p(this)) {
                        obj = 1;
                    } else {
                        obj = null;
                    }
                    d = oa.d(this);
                    obj2 = null;
                    obj3 = null;
                    childCount = getChildCount();
                    for (i3 = 0; i3 < childCount; i3++) {
                        childAt = getChildAt(i3);
                        if (childAt.getVisibility() != 8) {
                            shVar = (sh) childAt.getLayoutParams();
                            if (obj != null) {
                                a = mj.a(shVar.a, d);
                                if (oa.p(childAt)) {
                                    c.a(shVar, this.G, a);
                                } else {
                                    c.a(childAt, this.G, a);
                                }
                            }
                            if (f(childAt)) {
                                childAt.measure(MeasureSpec.makeMeasureSpec((mode - shVar.leftMargin) - shVar.rightMargin, 1073741824), MeasureSpec.makeMeasureSpec((size - shVar.topMargin) - shVar.bottomMargin, 1073741824));
                            } else if (g(childAt)) {
                                throw new IllegalStateException("Child " + childAt + " at index " + i3 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                            } else {
                                if (d && oa.a.B(childAt) != this.f) {
                                    oa.f(childAt, this.f);
                                }
                                e = e(childAt) & 7;
                                obj4 = e != 3 ? 1 : null;
                                if ((obj4 != null || r5 == null) && (obj4 != null || r4 == null)) {
                                    if (obj4 == null) {
                                        obj2 = 1;
                                    } else {
                                        obj3 = 1;
                                    }
                                    childAt.measure(getChildMeasureSpec(i, (this.g + shVar.leftMargin) + shVar.rightMargin, shVar.width), getChildMeasureSpec(i2, shVar.topMargin + shVar.bottomMargin, shVar.height));
                                } else {
                                    throw new IllegalStateException("Child drawer has absolute gravity " + j(e) + " but this DrawerLayout" + " already has a drawer view along that edge");
                                }
                            }
                        }
                    }
                }
            }
            throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
        }
        mode = size;
        size = size2;
        setMeasuredDimension(mode, size);
        if (this.G == null) {
        }
        obj = null;
        d = oa.d(this);
        obj2 = null;
        obj3 = null;
        childCount = getChildCount();
        for (i3 = 0; i3 < childCount; i3++) {
            childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                shVar = (sh) childAt.getLayoutParams();
                if (obj != null) {
                    a = mj.a(shVar.a, d);
                    if (oa.p(childAt)) {
                        c.a(shVar, this.G, a);
                    } else {
                        c.a(childAt, this.G, a);
                    }
                }
                if (f(childAt)) {
                    childAt.measure(MeasureSpec.makeMeasureSpec((mode - shVar.leftMargin) - shVar.rightMargin, 1073741824), MeasureSpec.makeMeasureSpec((size - shVar.topMargin) - shVar.bottomMargin, 1073741824));
                } else if (g(childAt)) {
                    throw new IllegalStateException("Child " + childAt + " at index " + i3 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                } else {
                    oa.f(childAt, this.f);
                    e = e(childAt) & 7;
                    if (e != 3) {
                    }
                    if (obj4 != null) {
                    }
                    if (obj4 == null) {
                        obj3 = 1;
                    } else {
                        obj2 = 1;
                    }
                    childAt.measure(getChildMeasureSpec(i, (this.g + shVar.leftMargin) + shVar.rightMargin, shVar.width), getChildMeasureSpec(i2, shVar.topMargin + shVar.bottomMargin, shVar.height));
                }
            }
        }
    }

    private static boolean a(Drawable drawable, int i) {
        if (drawable == null || !jb.b(drawable)) {
            return false;
        }
        jb.b(drawable, i);
        return true;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.p = true;
        int i5 = i3 - i;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                sh shVar = (sh) childAt.getLayoutParams();
                if (f(childAt)) {
                    childAt.layout(shVar.leftMargin, shVar.topMargin, shVar.leftMargin + childAt.getMeasuredWidth(), shVar.topMargin + childAt.getMeasuredHeight());
                } else {
                    int i7;
                    float f;
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(childAt, 3)) {
                        i7 = ((int) (((float) measuredWidth) * shVar.b)) + (-measuredWidth);
                        f = ((float) (measuredWidth + i7)) / ((float) measuredWidth);
                    } else {
                        i7 = i5 - ((int) (((float) measuredWidth) * shVar.b));
                        f = ((float) (i5 - i7)) / ((float) measuredWidth);
                    }
                    Object obj = f != shVar.b ? 1 : null;
                    int i8;
                    switch (shVar.a & 112) {
                        case wi.dI /*16*/:
                            int i9 = i4 - i2;
                            i8 = (i9 - measuredHeight) / 2;
                            if (i8 < shVar.topMargin) {
                                i8 = shVar.topMargin;
                            } else if (i8 + measuredHeight > i9 - shVar.bottomMargin) {
                                i8 = (i9 - shVar.bottomMargin) - measuredHeight;
                            }
                            childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
                            break;
                        case 80:
                            i8 = i4 - i2;
                            childAt.layout(i7, (i8 - shVar.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i7, i8 - shVar.bottomMargin);
                            break;
                        default:
                            childAt.layout(i7, shVar.topMargin, measuredWidth + i7, measuredHeight + shVar.topMargin);
                            break;
                    }
                    if (obj != null) {
                        b(childAt, f);
                    }
                    int i10 = shVar.b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i10) {
                        childAt.setVisibility(i10);
                    }
                }
            }
        }
        this.p = false;
        this.q = false;
    }

    public void requestLayout() {
        if (!this.p) {
            super.requestLayout();
        }
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((sh) getChildAt(i).getLayoutParams()).b);
        }
        this.i = f;
        if ((this.k.a(true) | this.l.a(true)) != 0) {
            oa.b(this);
        }
    }

    public void e(int i) {
        this.B = new ColorDrawable(i);
        invalidate();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.H && this.B != null) {
            int a = c.a(this.G);
            if (a > 0) {
                this.B.setBounds(0, 0, getWidth(), a);
                this.B.draw(canvas);
            }
        }
    }

    protected boolean drawChild(Canvas canvas, View view, long j) {
        int right;
        int height = getHeight();
        boolean f = f(view);
        int i = 0;
        int width = getWidth();
        int save = canvas.save();
        if (f) {
            int childCount = getChildCount();
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = getChildAt(i2);
                if (childAt != view && childAt.getVisibility() == 0) {
                    Object obj;
                    Drawable background = childAt.getBackground();
                    if (background == null) {
                        obj = null;
                    } else if (background.getOpacity() == -1) {
                        obj = 1;
                    } else {
                        obj = null;
                    }
                    if (obj != null && g(childAt) && childAt.getHeight() >= height) {
                        if (a(childAt, 3)) {
                            right = childAt.getRight();
                            if (right <= i) {
                                right = i;
                            }
                            i = right;
                            right = width;
                        } else {
                            right = childAt.getLeft();
                            if (right < width) {
                            }
                        }
                        i2++;
                        width = right;
                    }
                }
                right = width;
                i2++;
                width = right;
            }
            canvas.clipRect(i, 0, width, getHeight());
        }
        right = width;
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        if (this.i > 0.0f && f) {
            this.j.setColor((((int) (((float) ((this.h & -16777216) >>> 24)) * this.i)) << 24) | (this.h & 16777215));
            canvas.drawRect((float) i, 0.0f, (float) right, (float) getHeight(), this.j);
        } else if (this.C != null && a(view, 3)) {
            right = this.C.getIntrinsicWidth();
            i = view.getRight();
            r2 = Math.max(0.0f, Math.min(((float) i) / ((float) this.k.b()), 1.0f));
            this.C.setBounds(i, view.getTop(), right + i, view.getBottom());
            this.C.setAlpha((int) (255.0f * r2));
            this.C.draw(canvas);
        } else if (this.D != null && a(view, 5)) {
            right = this.D.getIntrinsicWidth();
            i = view.getLeft();
            r2 = Math.max(0.0f, Math.min(((float) (getWidth() - i)) / ((float) this.l.b()), 1.0f));
            this.D.setBounds(i - right, view.getTop(), i, view.getBottom());
            this.D.setAlpha((int) (255.0f * r2));
            this.D.draw(canvas);
        }
        return drawChild;
    }

    boolean f(View view) {
        return ((sh) view.getLayoutParams()).a == 0;
    }

    public boolean g(View view) {
        int a = mj.a(((sh) view.getLayoutParams()).a, oa.d(view));
        if ((a & 3) != 0) {
            return true;
        }
        if ((a & 5) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
        r7 = this;
        r1 = 1;
        r2 = 0;
        r0 = nh.a(r8);
        r3 = r7.k;
        r3 = r3.a(r8);
        r4 = r7.l;
        r4 = r4.a(r8);
        r3 = r3 | r4;
        switch(r0) {
            case 0: goto L_0x0039;
            case 1: goto L_0x0077;
            case 2: goto L_0x0062;
            case 3: goto L_0x0077;
            default: goto L_0x0016;
        };
    L_0x0016:
        r0 = r2;
    L_0x0017:
        if (r3 != 0) goto L_0x0037;
    L_0x0019:
        if (r0 != 0) goto L_0x0037;
    L_0x001b:
        r4 = r7.getChildCount();
        r3 = r2;
    L_0x0020:
        if (r3 >= r4) goto L_0x0083;
    L_0x0022:
        r0 = r7.getChildAt(r3);
        r0 = r0.getLayoutParams();
        r0 = (sh) r0;
        r0 = r0.c;
        if (r0 == 0) goto L_0x007f;
    L_0x0030:
        r0 = r1;
    L_0x0031:
        if (r0 != 0) goto L_0x0037;
    L_0x0033:
        r0 = r7.w;
        if (r0 == 0) goto L_0x0038;
    L_0x0037:
        r2 = r1;
    L_0x0038:
        return r2;
    L_0x0039:
        r0 = r8.getX();
        r4 = r8.getY();
        r7.z = r0;
        r7.A = r4;
        r5 = r7.i;
        r6 = 0;
        r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r5 <= 0) goto L_0x0085;
    L_0x004c:
        r5 = r7.k;
        r0 = (int) r0;
        r4 = (int) r4;
        r0 = r5.b(r0, r4);
        if (r0 == 0) goto L_0x0085;
    L_0x0056:
        r0 = r7.f(r0);
        if (r0 == 0) goto L_0x0085;
    L_0x005c:
        r0 = r1;
    L_0x005d:
        r7.v = r2;
        r7.w = r2;
        goto L_0x0017;
    L_0x0062:
        r0 = r7.k;
        r4 = 3;
        r0 = r0.c(r4);
        if (r0 == 0) goto L_0x0016;
    L_0x006b:
        r0 = r7.m;
        r0.a();
        r0 = r7.n;
        r0.a();
        r0 = r2;
        goto L_0x0017;
    L_0x0077:
        r7.a(r1);
        r7.v = r2;
        r7.w = r2;
        goto L_0x0016;
    L_0x007f:
        r0 = r3 + 1;
        r3 = r0;
        goto L_0x0020;
    L_0x0083:
        r0 = r2;
        goto L_0x0031;
    L_0x0085:
        r0 = r2;
        goto L_0x005d;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.k.b(motionEvent);
        this.l.b(motionEvent);
        float x;
        float y;
        switch (motionEvent.getAction() & 255) {
            case wi.w /*0*/:
                x = motionEvent.getX();
                y = motionEvent.getY();
                this.z = x;
                this.A = y;
                this.v = false;
                this.w = false;
                break;
            case wi.j /*1*/:
                boolean z;
                x = motionEvent.getX();
                y = motionEvent.getY();
                View b = this.k.b((int) x, (int) y);
                if (b != null && f(b)) {
                    x -= this.z;
                    y -= this.A;
                    int d = this.k.d();
                    if ((x * x) + (y * y) < ((float) (d * d))) {
                        View a = a();
                        if (a != null) {
                            z = a(a) == 2;
                            a(z);
                            this.v = false;
                            break;
                        }
                    }
                }
                z = true;
                a(z);
                this.v = false;
            case wi.z /*3*/:
                a(true);
                this.v = false;
                this.w = false;
                break;
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.v = z;
        if (z) {
            a(true);
        }
    }

    public void b() {
        a(false);
    }

    void a(boolean z) {
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            sh shVar = (sh) childAt.getLayoutParams();
            if (g(childAt) && (!z || shVar.c)) {
                int width = childAt.getWidth();
                if (a(childAt, 3)) {
                    i |= this.k.a(childAt, -width, childAt.getTop());
                } else {
                    i |= this.l.a(childAt, getWidth(), childAt.getTop());
                }
                shVar.c = false;
            }
        }
        this.m.a();
        this.n.a();
        if (i != 0) {
            invalidate();
        }
    }

    public void h(View view) {
        a(view, true);
    }

    public void a(View view, boolean z) {
        if (g(view)) {
            sh shVar = (sh) view.getLayoutParams();
            if (this.q) {
                shVar.b = 1.0f;
                shVar.d = 1;
                c(view, true);
            } else if (z) {
                shVar.d |= 2;
                if (a(view, 3)) {
                    this.k.a(view, 0, view.getTop());
                } else {
                    this.l.a(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                c(view, 1.0f);
                a(0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public void f(int i) {
        a(8388611, true);
    }

    public void a(int i, boolean z) {
        View d = d(i);
        if (d == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + j(i));
        }
        a(d, true);
    }

    public void i(View view) {
        b(view, true);
    }

    public void b(View view, boolean z) {
        if (g(view)) {
            sh shVar = (sh) view.getLayoutParams();
            if (this.q) {
                shVar.b = 0.0f;
                shVar.d = 0;
            } else if (z) {
                shVar.d |= 4;
                if (a(view, 3)) {
                    this.k.a(view, -view.getWidth(), view.getTop());
                } else {
                    this.l.a(view, getWidth(), view.getTop());
                }
            } else {
                c(view, 0.0f);
                a(0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public void g(int i) {
        b(8388611, true);
    }

    public void b(int i, boolean z) {
        View d = d(i);
        if (d == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + j(i));
        }
        b(d, true);
    }

    public boolean j(View view) {
        if (g(view)) {
            return (((sh) view.getLayoutParams()).d & 1) == 1;
        } else {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
    }

    public boolean h(int i) {
        View d = d(8388611);
        if (d != null) {
            return j(d);
        }
        return false;
    }

    public boolean k(View view) {
        if (g(view)) {
            return ((sh) view.getLayoutParams()).b > 0.0f;
        } else {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
    }

    public boolean i(int i) {
        View d = d(8388611);
        if (d != null) {
            return k(d);
        }
        return false;
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new sh(-1, -1);
    }

    protected LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        if (layoutParams instanceof sh) {
            return new sh((sh) layoutParams);
        }
        return layoutParams instanceof MarginLayoutParams ? new sh((MarginLayoutParams) layoutParams) : new sh(layoutParams);
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof sh) && super.checkLayoutParams(layoutParams);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new sh(getContext(), attributeSet);
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        int i3 = 0;
        if (getDescendantFocusability() != 393216) {
            int i4;
            int childCount = getChildCount();
            int i5 = 0;
            for (i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (!g(childAt)) {
                    this.M.add(childAt);
                } else if (j(childAt)) {
                    i5 = 1;
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
            if (i5 == 0) {
                i4 = this.M.size();
                while (i3 < i4) {
                    View view = (View) this.M.get(i3);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                    i3++;
                }
            }
            this.M.clear();
        }
    }

    public View c() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (g(childAt) && k(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public void d() {
        int i = 0;
        if (!this.w) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            while (i < childCount) {
                getChildAt(i).dispatchTouchEvent(obtain);
                i++;
            }
            obtain.recycle();
            this.w = true;
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z;
            if (c() != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                keyEvent.startTracking();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View c = c();
        if (c != null && a(c) == 0) {
            b();
        }
        return c != null;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof si) {
            si siVar = (si) parcelable;
            super.onRestoreInstanceState(siVar.e);
            if (siVar.a != 0) {
                View d = d(siVar.a);
                if (d != null) {
                    h(d);
                }
            }
            if (siVar.b != 3) {
                a(siVar.b, 3);
            }
            if (siVar.c != 3) {
                a(siVar.c, 5);
            }
            if (siVar.f != 3) {
                a(siVar.f, 8388611);
            }
            if (siVar.g != 3) {
                a(siVar.g, 8388613);
                return;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        si siVar = new si(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            Object obj;
            sh shVar = (sh) getChildAt(i).getLayoutParams();
            if (shVar.d == 1) {
                obj = 1;
            } else {
                obj = null;
            }
            Object obj2;
            if (shVar.d == 2) {
                obj2 = 1;
            } else {
                obj2 = null;
            }
            if (obj != null || r4 != null) {
                siVar.a = shVar.a;
                break;
            }
        }
        siVar.b = this.r;
        siVar.c = this.s;
        siVar.f = this.t;
        siVar.g = this.u;
        return siVar;
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (a() != null || g(view)) {
            oa.c(view, 4);
        } else {
            oa.c(view, 1);
        }
        if (!b) {
            oa.a(view, this.e);
        }
    }

    public static boolean l(View view) {
        return (oa.c(view) == 4 || oa.c(view) == 2) ? false : true;
    }

    public void onRtlPropertiesChanged(int i) {
        if (!d) {
            Drawable drawable;
            int d = oa.d(this);
            if (d == 0) {
                if (this.I != null) {
                    a(this.I, d);
                    drawable = this.I;
                }
                drawable = this.K;
            } else {
                if (this.J != null) {
                    a(this.J, d);
                    drawable = this.J;
                }
                drawable = this.K;
            }
            this.C = drawable;
            d = oa.d(this);
            if (d == 0) {
                if (this.J != null) {
                    a(this.J, d);
                    drawable = this.J;
                }
                drawable = this.L;
            } else {
                if (this.I != null) {
                    a(this.I, d);
                    drawable = this.I;
                }
                drawable = this.L;
            }
            this.D = drawable;
        }
    }
}
