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
import nh;
import nk;
import nl;
import nm;
import nn;
import nu;
import nw;
import oa;
import sp;
import sv;
import sw;
import sx;
import tf;
import wi;

public class NestedScrollView extends FrameLayout implements nk, nm, nu {
    private static final sv v;
    private static final int[] w;
    private sw A;
    private long a;
    private final Rect b;
    private tf c;
    private sp d;
    private sp e;
    private int f;
    private boolean g;
    private boolean h;
    private View i;
    private boolean j;
    private VelocityTracker k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private int q;
    private final int[] r;
    private final int[] s;
    private int t;
    private sx u;
    private final nn x;
    private final nl y;
    private float z;

    static {
        v = new sv();
        w = new int[]{16843130};
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new Rect();
        this.g = true;
        this.h = false;
        this.i = null;
        this.j = false;
        this.m = true;
        this.q = -1;
        this.r = new int[2];
        this.s = new int[2];
        this.c = tf.a(getContext(), null);
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.n = viewConfiguration.getScaledTouchSlop();
        this.o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.p = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w, i, 0);
        a(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.x = new nn(this);
        this.y = new nl(this);
        setNestedScrollingEnabled(true);
        oa.a(this, v);
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.y.a(z);
    }

    public boolean isNestedScrollingEnabled() {
        return this.y.a();
    }

    public boolean startNestedScroll(int i) {
        return this.y.a(i);
    }

    public void stopNestedScroll() {
        this.y.c();
    }

    public boolean hasNestedScrollingParent() {
        return this.y.b();
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.y.a(i, i2, i3, i4, iArr);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.y.a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.y.a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.y.a(f, f2);
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.x.a(i);
        startNestedScroll(2);
    }

    public void onStopNestedScroll(View view) {
        this.x.b();
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
        f((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public int getNestedScrollAxes() {
        return this.x.a();
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

    public int a() {
        return (int) (0.5f * ((float) getHeight()));
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

    public void a(sw swVar) {
        this.A = swVar;
    }

    public void a(boolean z) {
        if (z != this.l) {
            this.l = z;
            requestLayout();
        }
    }

    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.A != null) {
            this.A.a(this);
        }
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.l && MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
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

    public boolean a(KeyEvent keyEvent) {
        boolean z;
        int i = 33;
        this.b.setEmpty();
        View childAt = getChildAt(0);
        if (childAt != null) {
            z = getHeight() < (childAt.getHeight() + getPaddingTop()) + getPaddingBottom();
        } else {
            z = false;
        }
        if (z) {
            boolean c;
            if (keyEvent.getAction() == 0) {
                switch (keyEvent.getKeyCode()) {
                    case wi.dL /*19*/:
                        if (!keyEvent.isAltPressed()) {
                            c = c(33);
                            break;
                        }
                        c = b(33);
                        break;
                    case wi.k /*20*/:
                        if (!keyEvent.isAltPressed()) {
                            c = c(130);
                            break;
                        }
                        c = b(130);
                        break;
                    case 62:
                        if (!keyEvent.isShiftPressed()) {
                            i = 130;
                        }
                        a(i);
                        break;
                }
            }
            c = false;
            return c;
        } else if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        } else {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            findFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findFocus == null || findFocus == this || !findFocus.requestFocus(130)) {
                return false;
            }
            return true;
        }
    }

    private void c() {
        if (this.k == null) {
            this.k = VelocityTracker.obtain();
        }
    }

    private void d() {
        if (this.k != null) {
            this.k.recycle();
            this.k = null;
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            d();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        int action = motionEvent.getAction();
        if (action == 2 && this.j) {
            return true;
        }
        int y;
        switch (action & 255) {
            case wi.w /*0*/:
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
                    this.j = false;
                    d();
                    break;
                }
                this.f = y;
                this.q = motionEvent.getPointerId(0);
                if (this.k == null) {
                    this.k = VelocityTracker.obtain();
                } else {
                    this.k.clear();
                }
                this.k.addMovement(motionEvent);
                this.c.g();
                if (!this.c.a()) {
                    z = true;
                }
                this.j = z;
                startNestedScroll(2);
                break;
                break;
            case wi.j /*1*/:
            case wi.z /*3*/:
                this.j = false;
                this.q = -1;
                d();
                if (this.c.a(getScrollX(), getScrollY(), 0, 0, 0, b())) {
                    oa.b(this);
                }
                stopNestedScroll();
                break;
            case wi.l /*2*/:
                action = this.q;
                if (action != -1) {
                    y = motionEvent.findPointerIndex(action);
                    if (y != -1) {
                        action = (int) motionEvent.getY(y);
                        if (Math.abs(action - this.f) > this.n && (getNestedScrollAxes() & 2) == 0) {
                            this.j = true;
                            this.f = action;
                            c();
                            this.k.addMovement(motionEvent);
                            this.t = 0;
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
            case wi.s /*6*/:
                a(motionEvent);
                break;
        }
        return this.j;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        c();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int a = nh.a(motionEvent);
        if (a == 0) {
            this.t = 0;
        }
        obtain.offsetLocation(0.0f, (float) this.t);
        switch (a) {
            case wi.w /*0*/:
                if (getChildCount() != 0) {
                    boolean z = !this.c.a();
                    this.j = z;
                    if (z) {
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (!this.c.a()) {
                        this.c.h();
                    }
                    this.f = (int) motionEvent.getY();
                    this.q = motionEvent.getPointerId(0);
                    startNestedScroll(2);
                    break;
                }
                return false;
            case wi.j /*1*/:
                if (this.j) {
                    VelocityTracker velocityTracker = this.k;
                    velocityTracker.computeCurrentVelocity(1000, (float) this.p);
                    a = (int) nw.b(velocityTracker, this.q);
                    if (Math.abs(a) > this.o) {
                        f(-a);
                    } else if (this.c.a(getScrollX(), getScrollY(), 0, 0, 0, b())) {
                        oa.b(this);
                    }
                }
                this.q = -1;
                e();
                break;
            case wi.l /*2*/:
                int findPointerIndex = motionEvent.findPointerIndex(this.q);
                if (findPointerIndex != -1) {
                    int i;
                    int y = (int) motionEvent.getY(findPointerIndex);
                    a = this.f - y;
                    if (dispatchNestedPreScroll(0, a, this.s, this.r)) {
                        a -= this.s[1];
                        obtain.offsetLocation(0.0f, (float) this.r[1]);
                        this.t += this.r[1];
                    }
                    if (this.j || Math.abs(a) <= this.n) {
                        i = a;
                    } else {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.j = true;
                        if (a > 0) {
                            i = a - this.n;
                        } else {
                            i = a + this.n;
                        }
                    }
                    if (this.j) {
                        Object obj;
                        this.f = y - this.r[1];
                        int scrollY = getScrollY();
                        int b = b();
                        a = getOverScrollMode();
                        if (a == 0 || (a == 1 && b > 0)) {
                            obj = 1;
                        } else {
                            obj = null;
                        }
                        if (a(0, i, 0, getScrollY(), 0, b, 0, 0) && !hasNestedScrollingParent()) {
                            this.k.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        if (!dispatchNestedScroll(0, scrollY2, 0, i - scrollY2, this.r)) {
                            if (obj != null) {
                                f();
                                a = scrollY + i;
                                if (a < 0) {
                                    this.d.a(((float) i) / ((float) getHeight()), motionEvent.getX(findPointerIndex) / ((float) getWidth()));
                                    if (!this.e.a()) {
                                        this.e.c();
                                    }
                                } else if (a > b) {
                                    this.e.a(((float) i) / ((float) getHeight()), 1.0f - (motionEvent.getX(findPointerIndex) / ((float) getWidth())));
                                    if (!this.d.a()) {
                                        this.d.c();
                                    }
                                }
                                if (!(this.d == null || (this.d.a() && this.e.a()))) {
                                    oa.b(this);
                                    break;
                                }
                            }
                        }
                        this.f -= this.r[1];
                        obtain.offsetLocation(0.0f, (float) this.r[1]);
                        this.t += this.r[1];
                        break;
                    }
                }
                Log.e("NestedScrollView", "Invalid pointerId=" + this.q + " in onTouchEvent");
                break;
                break;
            case wi.z /*3*/:
                if (this.j && getChildCount() > 0 && this.c.a(getScrollX(), getScrollY(), 0, 0, 0, b())) {
                    oa.b(this);
                }
                this.q = -1;
                e();
                break;
            case wi.p /*5*/:
                a = nh.b(motionEvent);
                this.f = (int) motionEvent.getY(a);
                this.q = motionEvent.getPointerId(a);
                break;
            case wi.s /*6*/:
                a(motionEvent);
                this.f = (int) motionEvent.getY(motionEvent.findPointerIndex(this.q));
                break;
        }
        if (this.k != null) {
            this.k.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    private void a(MotionEvent motionEvent) {
        int action = (motionEvent.getAction() >> 8) & 255;
        if (motionEvent.getPointerId(action) == this.q) {
            action = action == 0 ? 1 : 0;
            this.f = (int) motionEvent.getY(action);
            this.q = motionEvent.getPointerId(action);
            if (this.k != null) {
                this.k.clear();
            }
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0) {
            switch (motionEvent.getAction()) {
                case wi.m /*8*/:
                    if (!this.j) {
                        float d = nh.d(motionEvent, 9);
                        if (d != 0.0f) {
                            if (this.z == 0.0f) {
                                TypedValue typedValue = new TypedValue();
                                Context context = getContext();
                                if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                                    this.z = typedValue.getDimension(context.getResources().getDisplayMetrics());
                                } else {
                                    throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
                                }
                            }
                            int i = (int) (d * this.z);
                            int b = b();
                            int scrollY = getScrollY();
                            i = scrollY - i;
                            if (i < 0) {
                                b = 0;
                            } else if (i <= b) {
                                b = i;
                            }
                            if (b != scrollY) {
                                super.scrollTo(getScrollX(), b);
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

    boolean a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        boolean z2;
        getOverScrollMode();
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
            this.c.a(i9, i11, 0, 0, 0, b());
        }
        onOverScrolled(i9, i11, z, z2);
        if (z || z2) {
            return true;
        }
        return false;
    }

    public int b() {
        if (getChildCount() > 0) {
            return Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
        }
        return 0;
    }

    public boolean a(int i) {
        int i2 = i == 130 ? 1 : 0;
        int height = getHeight();
        if (i2 != 0) {
            this.b.top = getScrollY() + height;
            i2 = getChildCount();
            if (i2 > 0) {
                View childAt = getChildAt(i2 - 1);
                if (this.b.top + height > childAt.getBottom()) {
                    this.b.top = childAt.getBottom() - height;
                }
            }
        } else {
            this.b.top = getScrollY() - height;
            if (this.b.top < 0) {
                this.b.top = 0;
            }
        }
        this.b.bottom = this.b.top + height;
        return a(i, this.b.top, this.b.bottom);
    }

    public boolean b(int i) {
        int i2 = i == 130 ? 1 : 0;
        int height = getHeight();
        this.b.top = 0;
        this.b.bottom = height;
        if (i2 != 0) {
            i2 = getChildCount();
            if (i2 > 0) {
                this.b.bottom = getChildAt(i2 - 1).getBottom() + getPaddingBottom();
                this.b.top = this.b.bottom - height;
            }
        }
        return a(i, this.b.top, this.b.bottom);
    }

    private boolean a(int i, int i2, int i3) {
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
            e(obj != null ? i2 - scrollY : i3 - i4);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z;
    }

    public boolean c(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int a = a();
        if (findNextFocus == null || !a(findNextFocus, a, getHeight())) {
            if (i == 33 && getScrollY() < a) {
                a = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                int bottom = getChildAt(0).getBottom();
                int scrollY = (getScrollY() + getHeight()) - getPaddingBottom();
                if (bottom - scrollY < a) {
                    a = bottom - scrollY;
                }
            }
            if (a == 0) {
                return false;
            }
            if (i != 130) {
                a = -a;
            }
            e(a);
        } else {
            findNextFocus.getDrawingRect(this.b);
            offsetDescendantRectToMyCoords(findNextFocus, this.b);
            e(a(this.b));
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

    private boolean a(View view) {
        return !a(view, 0, getHeight());
    }

    private boolean a(View view, int i, int i2) {
        view.getDrawingRect(this.b);
        offsetDescendantRectToMyCoords(view, this.b);
        return this.b.bottom + i >= getScrollY() && this.b.top - i <= getScrollY() + i2;
    }

    private void e(int i) {
        if (i == 0) {
            return;
        }
        if (this.m) {
            b(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    private void b(int i, int i2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.a > 250) {
                int max = Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
                int scrollY = getScrollY();
                this.c.a(getScrollX(), scrollY, 0, Math.max(0, Math.min(scrollY + i2, max)) - scrollY);
                oa.b(this);
            } else {
                if (!this.c.a()) {
                    this.c.h();
                }
                scrollBy(i, i2);
            }
            this.a = AnimationUtils.currentAnimationTimeMillis();
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
        if (this.c.g()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int b = this.c.b();
            int c = this.c.c();
            if (scrollX != b || scrollY != c) {
                int b2 = b();
                int overScrollMode = getOverScrollMode();
                int i = (overScrollMode == 0 || (overScrollMode == 1 && b2 > 0)) ? 1 : 0;
                a(b - scrollX, c - scrollY, scrollX, scrollY, 0, b2, 0, 0);
                if (i != 0) {
                    f();
                    if (c <= 0 && scrollY > 0) {
                        this.d.a((int) this.c.f());
                    } else if (c >= b2 && scrollY < b2) {
                        this.e.a((int) this.c.f());
                    }
                }
            }
        }
    }

    private void b(View view) {
        view.getDrawingRect(this.b);
        offsetDescendantRectToMyCoords(view, this.b);
        int a = a(this.b);
        if (a != 0) {
            scrollBy(0, a);
        }
    }

    protected int a(Rect rect) {
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
        if (this.g) {
            this.i = view2;
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
        this.g = true;
        super.requestLayout();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.g = false;
        if (this.i != null && a(this.i, (View) this)) {
            b(this.i);
        }
        this.i = null;
        if (!this.h) {
            if (this.u != null) {
                scrollTo(getScrollX(), this.u.a);
                this.u = null;
            }
            int max = Math.max(0, (getChildCount() > 0 ? getChildAt(0).getMeasuredHeight() : 0) - (((i4 - i2) - getPaddingBottom()) - getPaddingTop()));
            if (getScrollY() > max) {
                scrollTo(getScrollX(), max);
            } else if (getScrollY() < 0) {
                scrollTo(getScrollX(), 0);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.h = true;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h = false;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && a(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.b);
            offsetDescendantRectToMyCoords(findFocus, this.b);
            e(a(this.b));
        }
    }

    private static boolean a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && a((View) parent, view2);
    }

    public void d(int i) {
        if (getChildCount() > 0) {
            int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            int height2 = getChildAt(0).getHeight();
            this.c.a(getScrollX(), getScrollY(), 0, i, 0, 0, 0, Math.max(0, height2 - height), 0, height / 2);
            oa.b(this);
        }
    }

    private void f(int i) {
        int scrollY = getScrollY();
        boolean z = (scrollY > 0 || i > 0) && (scrollY < b() || i < 0);
        if (!dispatchNestedPreFling(0.0f, (float) i)) {
            dispatchNestedFling(0.0f, (float) i, z);
            if (z) {
                d(i);
            }
        }
    }

    private void e() {
        this.j = false;
        d();
        stopNestedScroll();
        if (this.d != null) {
            this.d.c();
            this.e.c();
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

    private void f() {
        if (getOverScrollMode() == 2) {
            this.d = null;
            this.e = null;
        } else if (this.d == null) {
            Context context = getContext();
            this.d = new sp(context);
            this.e = new sp(context);
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.d != null) {
            int save;
            int width;
            int scrollY = getScrollY();
            if (!this.d.a()) {
                save = canvas.save();
                width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.translate((float) getPaddingLeft(), (float) Math.min(0, scrollY));
                this.d.a(width, getHeight());
                if (this.d.a(canvas)) {
                    oa.b(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.e.a()) {
                save = canvas.save();
                width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                int height = getHeight();
                canvas.translate((float) ((-width) + getPaddingLeft()), (float) (Math.max(b(), scrollY) + height));
                canvas.rotate(180.0f, (float) width, 0.0f);
                this.e.a(width, height);
                if (this.e.a(canvas)) {
                    oa.b(this);
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
        if (parcelable instanceof sx) {
            sx sxVar = (sx) parcelable;
            super.onRestoreInstanceState(sxVar.getSuperState());
            this.u = sxVar;
            requestLayout();
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        sx sxVar = new sx(super.onSaveInstanceState());
        sxVar.a = getScrollY();
        return sxVar;
    }
}
