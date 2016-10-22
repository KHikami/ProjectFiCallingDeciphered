package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import java.util.List;
import jw;
import kb;
import kc;
import kd;
import ke;
import kh;
import kj;
import kn;
import nz;
import om;
import on;
import oo;
import ox;
import rk;
import rl;
import rq;

/* compiled from: PG */
public class NestedScrollView extends FrameLayout implements kb, kd, kh {
    private static final om w;
    private static final int[] x;
    private float A;
    public on a;
    private long b;
    private final Rect c;
    private ox d;
    private nz e;
    private nz f;
    private int g;
    private boolean h;
    private boolean i;
    private View j;
    private boolean k;
    private VelocityTracker l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private int r;
    private final int[] s;
    private final int[] t;
    private int u;
    private oo v;
    private final ke y;
    private final kc z;

    static {
        w = new om();
        x = new int[]{16843130};
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new Rect();
        this.h = true;
        this.i = false;
        this.j = null;
        this.k = false;
        this.n = true;
        this.r = -1;
        this.s = new int[2];
        this.t = new int[2];
        this.d = ox.a(getContext(), null);
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.o = viewConfiguration.getScaledTouchSlop();
        this.p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x, i, 0);
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        if (z != this.m) {
            this.m = z;
            requestLayout();
        }
        obtainStyledAttributes.recycle();
        this.y = new ke(this);
        this.z = new kc(this);
        setNestedScrollingEnabled(true);
        kn.a((View) this, w);
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.z.a(z);
    }

    public boolean isNestedScrollingEnabled() {
        return this.z.a;
    }

    public boolean startNestedScroll(int i) {
        return this.z.a(i);
    }

    public void stopNestedScroll() {
        this.z.b();
    }

    public boolean hasNestedScrollingParent() {
        return this.z.a();
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.z.a(i, i2, i3, i4, iArr);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.z.a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.z.a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.z.a(f, f2);
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.y.a = i;
        startNestedScroll(2);
    }

    public void onStopNestedScroll(View view) {
        this.y.a = 0;
        stopNestedScroll();
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        dispatchNestedScroll(0, scrollY2, 0, i4 - scrollY2, null);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        dispatchNestedPreScroll(i, i2, iArr, null);
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        d((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public int getNestedScrollAxes() {
        return this.y.a;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = (getChildAt(0).getBottom() - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    public void addView(View view, LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.a != null) {
            this.a.a(this);
        }
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.m && MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            int measuredHeight = getMeasuredHeight();
            if (childAt.getMeasuredHeight() < measuredHeight) {
                childAt.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), ((FrameLayout.LayoutParams) childAt.getLayoutParams()).width), MeasureSpec.makeMeasureSpec((measuredHeight - getPaddingTop()) - getPaddingBottom(), 1073741824));
            }
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || a(keyEvent);
    }

    public final boolean a(KeyEvent keyEvent) {
        boolean z;
        this.c.setEmpty();
        View childAt = getChildAt(0);
        if (childAt != null) {
            z = getHeight() < (childAt.getHeight() + getPaddingTop()) + getPaddingBottom();
        } else {
            z = false;
        }
        View childAt2;
        if (z) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            switch (keyEvent.getKeyCode()) {
                case rk.m /*19*/:
                    if (keyEvent.isAltPressed()) {
                        return a(33);
                    }
                    return b(33);
                case rk.h /*20*/:
                    if (keyEvent.isAltPressed()) {
                        return a(130);
                    }
                    return b(130);
                case 62:
                    int i;
                    if (keyEvent.isShiftPressed()) {
                        i = 33;
                    } else {
                        i = 130;
                    }
                    boolean z2 = i == 130;
                    int height = getHeight();
                    if (z2) {
                        this.c.top = getScrollY() + height;
                        int childCount = getChildCount();
                        if (childCount > 0) {
                            childAt2 = getChildAt(childCount - 1);
                            if (this.c.top + height > childAt2.getBottom()) {
                                this.c.top = childAt2.getBottom() - height;
                            }
                        }
                    } else {
                        this.c.top = getScrollY() - height;
                        if (this.c.top < 0) {
                            this.c.top = 0;
                        }
                    }
                    this.c.bottom = height + this.c.top;
                    a(i, this.c.top, this.c.bottom);
                    return false;
                default:
                    return false;
            }
        } else if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        } else {
            childAt2 = findFocus();
            if (childAt2 == this) {
                childAt2 = null;
            }
            childAt2 = FocusFinder.getInstance().findNextFocus(this, childAt2, 130);
            if (childAt2 == null || childAt2 == this || !childAt2.requestFocus(130)) {
                return false;
            }
            return true;
        }
    }

    private final void b() {
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
    }

    private final void c() {
        if (this.l != null) {
            this.l.recycle();
            this.l = null;
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            c();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        int action = motionEvent.getAction();
        if (action == 2 && this.k) {
            return true;
        }
        int y;
        switch (action & 255) {
            case rl.c /*0*/:
                boolean z2;
                y = (int) motionEvent.getY();
                action = (int) motionEvent.getX();
                if (getChildCount() > 0) {
                    int scrollY = getScrollY();
                    View childAt = getChildAt(0);
                    z2 = y >= childAt.getTop() - scrollY && y < childAt.getBottom() - scrollY && action >= childAt.getLeft() && action < childAt.getRight();
                } else {
                    z2 = false;
                }
                if (!z2) {
                    this.k = false;
                    c();
                    break;
                }
                this.g = y;
                this.r = jw.b(motionEvent, 0);
                if (this.l == null) {
                    this.l = VelocityTracker.obtain();
                } else {
                    this.l.clear();
                }
                this.l.addMovement(motionEvent);
                this.d.g();
                if (!this.d.a()) {
                    z = true;
                }
                this.k = z;
                startNestedScroll(2);
                break;
                break;
            case rq.b /*1*/:
            case rl.e /*3*/:
                this.k = false;
                this.r = -1;
                c();
                if (this.d.a(getScrollX(), getScrollY(), 0, 0, 0, a())) {
                    kn.c(this);
                }
                stopNestedScroll();
                break;
            case rq.c /*2*/:
                action = this.r;
                if (action != -1) {
                    y = jw.a(motionEvent, action);
                    if (y != -1) {
                        action = (int) jw.d(motionEvent, y);
                        if (Math.abs(action - this.g) > this.o && (getNestedScrollAxes() & 2) == 0) {
                            this.k = true;
                            this.g = action;
                            b();
                            this.l.addMovement(motionEvent);
                            this.u = 0;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                                break;
                            }
                        }
                    }
                    Log.e("NestedScrollView", "Invalid pointerId=" + action + " in onInterceptTouchEvent");
                    break;
                }
                break;
            case rl.i /*6*/:
                a(motionEvent);
                break;
        }
        return this.k;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        b();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int a = jw.a(motionEvent);
        if (a == 0) {
            this.u = 0;
        }
        obtain.offsetLocation(0.0f, (float) this.u);
        switch (a) {
            case rl.c /*0*/:
                if (getChildCount() != 0) {
                    boolean z = !this.d.a();
                    this.k = z;
                    if (z) {
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (!this.d.a()) {
                        this.d.h();
                    }
                    this.g = (int) motionEvent.getY();
                    this.r = jw.b(motionEvent, 0);
                    startNestedScroll(2);
                    break;
                }
                return false;
            case rq.b /*1*/:
                if (this.k) {
                    VelocityTracker velocityTracker = this.l;
                    velocityTracker.computeCurrentVelocity(1000, (float) this.q);
                    a = (int) kj.b(velocityTracker, this.r);
                    if (Math.abs(a) > this.p) {
                        d(-a);
                    } else if (this.d.a(getScrollX(), getScrollY(), 0, 0, 0, a())) {
                        kn.c(this);
                    }
                }
                this.r = -1;
                d();
                break;
            case rq.c /*2*/:
                int a2 = jw.a(motionEvent, this.r);
                if (a2 != -1) {
                    int i;
                    int d = (int) jw.d(motionEvent, a2);
                    a = this.g - d;
                    if (dispatchNestedPreScroll(0, a, this.t, this.s)) {
                        a -= this.t[1];
                        obtain.offsetLocation(0.0f, (float) this.s[1]);
                        this.u += this.s[1];
                    }
                    if (this.k || Math.abs(a) <= this.o) {
                        i = a;
                    } else {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.k = true;
                        if (a > 0) {
                            i = a - this.o;
                        } else {
                            i = a + this.o;
                        }
                    }
                    if (this.k) {
                        Object obj;
                        this.g = d - this.s[1];
                        int scrollY = getScrollY();
                        int a3 = a();
                        a = kn.a(this);
                        if (a == 0 || (a == 1 && a3 > 0)) {
                            obj = 1;
                        } else {
                            obj = null;
                        }
                        if (a(0, i, 0, getScrollY(), 0, a3, 0, 0) && !hasNestedScrollingParent()) {
                            this.l.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        if (!dispatchNestedScroll(0, scrollY2, 0, i - scrollY2, this.s)) {
                            if (obj != null) {
                                e();
                                a = scrollY + i;
                                if (a < 0) {
                                    this.e.a(((float) i) / ((float) getHeight()), jw.c(motionEvent, a2) / ((float) getWidth()));
                                    if (!this.f.a()) {
                                        this.f.c();
                                    }
                                } else if (a > a3) {
                                    this.f.a(((float) i) / ((float) getHeight()), 1.0f - (jw.c(motionEvent, a2) / ((float) getWidth())));
                                    if (!this.e.a()) {
                                        this.e.c();
                                    }
                                }
                                if (!(this.e == null || (this.e.a() && this.f.a()))) {
                                    kn.c(this);
                                    break;
                                }
                            }
                        }
                        this.g -= this.s[1];
                        obtain.offsetLocation(0.0f, (float) this.s[1]);
                        this.u += this.s[1];
                        break;
                    }
                }
                Log.e("NestedScrollView", "Invalid pointerId=" + this.r + " in onTouchEvent");
                break;
                break;
            case rl.e /*3*/:
                if (this.k && getChildCount() > 0 && this.d.a(getScrollX(), getScrollY(), 0, 0, 0, a())) {
                    kn.c(this);
                }
                this.r = -1;
                d();
                break;
            case rl.g /*5*/:
                a = jw.b(motionEvent);
                this.g = (int) jw.d(motionEvent, a);
                this.r = jw.b(motionEvent, a);
                break;
            case rl.i /*6*/:
                a(motionEvent);
                this.g = (int) jw.d(motionEvent, jw.a(motionEvent, this.r));
                break;
        }
        if (this.l != null) {
            this.l.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    private final void a(MotionEvent motionEvent) {
        int action = (motionEvent.getAction() >> 8) & 255;
        if (jw.b(motionEvent, action) == this.r) {
            action = action == 0 ? 1 : 0;
            this.g = (int) jw.d(motionEvent, action);
            this.r = jw.b(motionEvent, action);
            if (this.l != null) {
                this.l.clear();
            }
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((jw.d(motionEvent) & 2) != 0) {
            switch (motionEvent.getAction()) {
                case rl.j /*8*/:
                    if (!this.k) {
                        float e = jw.e(motionEvent, 9);
                        if (e != 0.0f) {
                            if (this.A == 0.0f) {
                                TypedValue typedValue = new TypedValue();
                                Context context = getContext();
                                if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                                    this.A = typedValue.getDimension(context.getResources().getDisplayMetrics());
                                } else {
                                    throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
                                }
                            }
                            int i = (int) (e * this.A);
                            int a = a();
                            int scrollY = getScrollY();
                            i = scrollY - i;
                            if (i < 0) {
                                a = 0;
                            } else if (i <= a) {
                                a = i;
                            }
                            if (a != scrollY) {
                                super.scrollTo(getScrollX(), a);
                                return true;
                            }
                        }
                    }
                    break;
            }
        }
        return false;
    }

    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    private boolean a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        boolean z2;
        kn.a(this);
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        int i9 = i3 + i;
        int i10 = i4 + i2;
        int i11 = i6 + 0;
        if (i9 > 0) {
            i9 = 0;
            z = true;
        } else if (i9 < 0) {
            i9 = 0;
            z = true;
        } else {
            z = false;
        }
        if (i10 > i11) {
            z2 = true;
        } else if (i10 < 0) {
            i11 = 0;
            z2 = true;
        } else {
            z2 = false;
            i11 = i10;
        }
        if (z2) {
            this.d.a(i9, i11, 0, 0, 0, a());
        }
        onOverScrolled(i9, i11, z, z2);
        if (z || z2) {
            return true;
        }
        return false;
    }

    public final int a() {
        if (getChildCount() > 0) {
            return Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
        }
        return 0;
    }

    private boolean a(int i) {
        int i2 = i == 130 ? 1 : 0;
        int height = getHeight();
        this.c.top = 0;
        this.c.bottom = height;
        if (i2 != 0) {
            i2 = getChildCount();
            if (i2 > 0) {
                this.c.bottom = getChildAt(i2 - 1).getBottom() + getPaddingBottom();
                this.c.top = this.c.bottom - height;
            }
        }
        return a(i, this.c.top, this.c.bottom);
    }

    private final boolean a(int i, int i2, int i3) {
        Object obj;
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        if (i == 33) {
            obj = 1;
        } else {
            obj = null;
        }
        List focusables = getFocusables(2);
        View view = null;
        Object obj2 = null;
        int size = focusables.size();
        int i5 = 0;
        while (i5 < size) {
            View view2;
            Object obj3;
            View view3 = (View) focusables.get(i5);
            int top = view3.getTop();
            int bottom = view3.getBottom();
            if (i2 < bottom && top < i3) {
                Object obj4 = (i2 >= top || bottom >= i3) ? null : 1;
                if (view == null) {
                    Object obj5 = obj4;
                    view2 = view3;
                    obj3 = obj5;
                } else {
                    Object obj6 = ((obj == null || top >= view.getTop()) && (obj != null || bottom <= view.getBottom())) ? null : 1;
                    if (obj2 != null) {
                        if (!(obj4 == null || obj6 == null)) {
                            view2 = view3;
                            obj3 = obj2;
                        }
                    } else if (obj4 != null) {
                        view2 = view3;
                        height = 1;
                    } else if (obj6 != null) {
                        view2 = view3;
                        obj3 = obj2;
                    }
                }
                i5++;
                view = view2;
                obj2 = obj3;
            }
            obj3 = obj2;
            view2 = view;
            i5++;
            view = view2;
            obj2 = obj3;
        }
        if (view == null) {
            view = this;
        }
        if (i2 < scrollY || i3 > i4) {
            c(obj != null ? i2 - scrollY : i3 - i4);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z;
    }

    private boolean b(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int height = (int) (0.5f * ((float) getHeight()));
        if (findNextFocus == null || !a(findNextFocus, height, getHeight())) {
            if (i == 33 && getScrollY() < height) {
                height = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                int bottom = getChildAt(0).getBottom();
                int scrollY = (getScrollY() + getHeight()) - getPaddingBottom();
                if (bottom - scrollY < height) {
                    height = bottom - scrollY;
                }
            }
            if (height == 0) {
                return false;
            }
            if (i != 130) {
                height = -height;
            }
            c(height);
        } else {
            findNextFocus.getDrawingRect(this.c);
            offsetDescendantRectToMyCoords(findNextFocus, this.c);
            c(a(this.c));
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && a(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    private final boolean a(View view) {
        return !a(view, 0, getHeight());
    }

    private final boolean a(View view, int i, int i2) {
        view.getDrawingRect(this.c);
        offsetDescendantRectToMyCoords(view, this.c);
        return this.c.bottom + i >= getScrollY() && this.c.top - i <= getScrollY() + i2;
    }

    private final void c(int i) {
        if (i == 0) {
            return;
        }
        if (this.n) {
            b(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    private void b(int i, int i2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.b > 250) {
                int max = Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
                int scrollY = getScrollY();
                int max2 = Math.max(0, Math.min(scrollY + i2, max)) - scrollY;
                ox oxVar = this.d;
                oxVar.b.a(oxVar.a, getScrollX(), scrollY, 0, max2);
                kn.c(this);
            } else {
                if (!this.d.a()) {
                    this.d.h();
                }
                scrollBy(i, i2);
            }
            this.b = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public final void a(int i, int i2) {
        b(0 - getScrollX(), i2 - getScrollY());
    }

    public int computeVerticalScrollRange() {
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (getChildCount() == 0) {
            return height;
        }
        int bottom = getChildAt(0).getBottom();
        int scrollY = getScrollY();
        height = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > height) {
            return bottom + (scrollY - height);
        }
        return bottom;
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    protected void measureChild(View view, int i, int i2) {
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), MeasureSpec.makeMeasureSpec(0, 0));
    }

    protected void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, (((getPaddingLeft() + getPaddingRight()) + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin) + i2, marginLayoutParams.width), MeasureSpec.makeMeasureSpec(marginLayoutParams.bottomMargin + marginLayoutParams.topMargin, 0));
    }

    public void computeScroll() {
        if (this.d.g()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int b = this.d.b();
            int c = this.d.c();
            if (scrollX != b || scrollY != c) {
                int a = a();
                int a2 = kn.a(this);
                int i = (a2 == 0 || (a2 == 1 && a > 0)) ? 1 : 0;
                a(b - scrollX, c - scrollY, scrollX, scrollY, 0, a, 0, 0);
                if (i != 0) {
                    e();
                    if (c <= 0 && scrollY > 0) {
                        this.e.a((int) this.d.f());
                    } else if (c >= a && scrollY < a) {
                        this.f.a((int) this.d.f());
                    }
                }
            }
        }
    }

    private final void b(View view) {
        view.getDrawingRect(this.c);
        offsetDescendantRectToMyCoords(view, this.c);
        int a = a(this.c);
        if (a != 0) {
            scrollBy(0, a);
        }
    }

    private int a(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        if (rect.bottom < getChildAt(0).getHeight()) {
            i -= verticalFadingEdgeLength;
        }
        if (rect.bottom > i && rect.top > scrollY) {
            if (rect.height() > height) {
                scrollY = (rect.top - scrollY) + 0;
            } else {
                scrollY = (rect.bottom - i) + 0;
            }
            scrollY = Math.min(scrollY, getChildAt(0).getBottom() - i);
        } else if (rect.top >= scrollY || rect.bottom >= i) {
            scrollY = 0;
        } else {
            if (rect.height() > height) {
                scrollY = 0 - (i - rect.bottom);
            } else {
                scrollY = 0 - (scrollY - rect.top);
            }
            scrollY = Math.max(scrollY, -getScrollY());
        }
        return scrollY;
    }

    public void requestChildFocus(View view, View view2) {
        if (this.h) {
            this.j = view2;
        } else {
            b(view2);
        }
        super.requestChildFocus(view, view2);
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        View findNextFocus;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            findNextFocus = FocusFinder.getInstance().findNextFocus(this, null, i);
        } else {
            findNextFocus = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (findNextFocus == null || a(findNextFocus)) {
            return false;
        }
        return findNextFocus.requestFocus(i, rect);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int a = a(rect);
        boolean z2 = a != 0;
        if (z2) {
            if (z) {
                scrollBy(0, a);
            } else {
                b(0, a);
            }
        }
        return z2;
    }

    public void requestLayout() {
        this.h = true;
        super.requestLayout();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.h = false;
        if (this.j != null && a(this.j, (View) this)) {
            b(this.j);
        }
        this.j = null;
        if (!this.i) {
            if (this.v != null) {
                scrollTo(getScrollX(), this.v.a);
                this.v = null;
            }
            int max = Math.max(0, (getChildCount() > 0 ? getChildAt(0).getMeasuredHeight() : 0) - (((i4 - i2) - getPaddingBottom()) - getPaddingTop()));
            if (getScrollY() > max) {
                scrollTo(getScrollX(), max);
            } else if (getScrollY() < 0) {
                scrollTo(getScrollX(), 0);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.i = true;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i = false;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && a(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.c);
            offsetDescendantRectToMyCoords(findFocus, this.c);
            c(a(this.c));
        }
    }

    private static boolean a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && a((View) parent, view2);
    }

    private final void d(int i) {
        int scrollY = getScrollY();
        boolean z = (scrollY > 0 || i > 0) && (scrollY < a() || i < 0);
        if (!dispatchNestedPreFling(0.0f, (float) i)) {
            dispatchNestedFling(0.0f, (float) i, z);
            if (z && getChildCount() > 0) {
                scrollY = (getHeight() - getPaddingBottom()) - getPaddingTop();
                int height = getChildAt(0).getHeight();
                ox oxVar = this.d;
                oxVar.b.a(oxVar.a, getScrollX(), getScrollY(), 0, i, 0, 0, 0, Math.max(0, height - scrollY), 0, scrollY / 2);
                kn.c(this);
            }
        }
    }

    private final void d() {
        this.k = false;
        c();
        stopNestedScroll();
        if (this.e != null) {
            this.e.c();
            this.f.c();
        }
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            int b = b(i, (getWidth() - getPaddingRight()) - getPaddingLeft(), childAt.getWidth());
            int b2 = b(i2, (getHeight() - getPaddingBottom()) - getPaddingTop(), childAt.getHeight());
            if (b != getScrollX() || b2 != getScrollY()) {
                super.scrollTo(b, b2);
            }
        }
    }

    private final void e() {
        if (kn.a(this) == 2) {
            this.e = null;
            this.f = null;
        } else if (this.e == null) {
            Context context = getContext();
            this.e = new nz(context);
            this.f = new nz(context);
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.e != null) {
            int save;
            int width;
            int scrollY = getScrollY();
            if (!this.e.a()) {
                save = canvas.save();
                width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.translate((float) getPaddingLeft(), (float) Math.min(0, scrollY));
                this.e.a(width, getHeight());
                if (this.e.a(canvas)) {
                    kn.c(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f.a()) {
                save = canvas.save();
                width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                int height = getHeight();
                canvas.translate((float) ((-width) + getPaddingLeft()), (float) (Math.max(a(), scrollY) + height));
                canvas.rotate(180.0f, (float) width, 0.0f);
                this.f.a(width, height);
                if (this.f.a(canvas)) {
                    kn.c(this);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    private static int b(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        if (i2 + i > i3) {
            return i3 - i2;
        }
        return i;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof oo) {
            oo ooVar = (oo) parcelable;
            super.onRestoreInstanceState(ooVar.getSuperState());
            this.v = ooVar;
            requestLayout();
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable ooVar = new oo(super.onSaveInstanceState());
        ooVar.a = getScrollY();
        return ooVar;
    }
}
