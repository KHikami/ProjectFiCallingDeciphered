package android.support.design.widget;

import a;
import an;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import ax;
import buf;
import cob;
import iy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jw;
import kd;
import ke;
import kn;
import m;
import mj;
import n;
import o;
import p;
import q;
import r;
import rk;
import rl;
import rq;
import s;
import yy;

/* compiled from: PG */
public class CoordinatorLayout extends ViewGroup implements kd {
    private static String g;
    private static Class[] h;
    private static ThreadLocal i;
    private static Comparator k;
    private static cob l;
    public final List a;
    final Rect b;
    final Rect c;
    public mj d;
    public boolean e;
    public OnHierarchyChangeListener f;
    private Comparator j;
    private final List m;
    private final List n;
    private final Rect o;
    private final int[] p;
    private boolean q;
    private boolean r;
    private int[] s;
    private View t;
    private View u;
    private q v;
    private boolean w;
    private Drawable x;
    private final ke y;

    static {
        Package packageR = CoordinatorLayout.class.getPackage();
        g = packageR != null ? packageR.getName() : null;
        if (VERSION.SDK_INT >= 21) {
            k = new s();
            l = new cob();
        } else {
            k = null;
            l = null;
        }
        h = new Class[]{Context.class, AttributeSet.class};
        i = new ThreadLocal();
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = new m(this);
        this.a = new ArrayList();
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.b = new Rect();
        this.c = new Rect();
        this.o = new Rect();
        this.p = new int[2];
        this.y = new ke(this);
        an.a(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.e, i, 2131755404);
        int resourceId = obtainStyledAttributes.getResourceId(a.l, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.s = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.s.length;
            for (resourceId = 0; resourceId < length; resourceId++) {
                int[] iArr = this.s;
                iArr[resourceId] = (int) (((float) iArr[resourceId]) * f);
            }
        }
        this.x = obtainStyledAttributes.getDrawable(a.m);
        obtainStyledAttributes.recycle();
        if (l != null) {
            l.a((View) this, new yy());
        }
        super.setOnHierarchyChangeListener(new o(this));
    }

    public void setOnHierarchyChangeListener(OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f = onHierarchyChangeListener;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        if (this.w) {
            if (this.v == null) {
                this.v = new q(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.v);
        }
        if (this.d == null && kn.o(this)) {
            kn.n(this);
        }
        this.r = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        if (this.w && this.v != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.v);
        }
        if (this.u != null) {
            onStopNestedScroll(this.u);
        }
        this.r = false;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        int i = 0;
        Drawable drawable = this.x;
        if (drawable != null && drawable.isStateful()) {
            i = drawable.setState(drawableState) | 0;
        }
        if (i != 0) {
            invalidate();
        }
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.x;
    }

    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.x != null && this.x.isVisible() != z) {
            this.x.setVisible(z, false);
        }
    }

    private final void a() {
        if (this.t != null) {
            buf buf = ((p) this.t.getLayoutParams()).a;
            if (buf != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                buf.b(this, this.t, obtain);
                obtain.recycle();
            }
            this.t = null;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((p) getChildAt(i).getLayoutParams()).i = false;
        }
        this.q = false;
    }

    private final boolean a(MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2 = false;
        Object obj = null;
        int a = jw.a(motionEvent);
        List list = this.m;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            int childDrawingOrder;
            if (isChildrenDrawingOrderEnabled) {
                childDrawingOrder = getChildDrawingOrder(childCount, i2);
            } else {
                childDrawingOrder = i2;
            }
            list.add(getChildAt(childDrawingOrder));
        }
        if (k != null) {
            Collections.sort(list, k);
        }
        int size = list.size();
        int i3 = 0;
        MotionEvent motionEvent2 = null;
        while (i3 < size) {
            Object obj2;
            MotionEvent motionEvent3;
            View view = (View) list.get(i3);
            p pVar = (p) view.getLayoutParams();
            buf buf = pVar.a;
            if ((!z2 && obj == null) || a == 0) {
                if (!(z2 || buf == null)) {
                    switch (i) {
                        case rl.c /*0*/:
                            z2 = buf.a(this, view, motionEvent);
                            break;
                        case rq.b /*1*/:
                            z2 = buf.b(this, view, motionEvent);
                            break;
                    }
                    if (z2) {
                        this.t = view;
                    }
                }
                z = z2;
                if (pVar.a == null) {
                    pVar.i = false;
                }
                boolean z3 = pVar.i;
                if (pVar.i) {
                    isChildrenDrawingOrderEnabled = true;
                } else {
                    isChildrenDrawingOrderEnabled = (pVar.a != null ? pVar.a.c(this, view) : 0) | pVar.i;
                    pVar.i = isChildrenDrawingOrderEnabled;
                }
                Object obj3 = (!isChildrenDrawingOrderEnabled || z3) ? null : 1;
                if (isChildrenDrawingOrderEnabled && obj3 == null) {
                    list.clear();
                    return z;
                }
                MotionEvent motionEvent4 = motionEvent2;
                obj2 = obj3;
                motionEvent3 = motionEvent4;
            } else if (buf != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                } else {
                    motionEvent3 = motionEvent2;
                }
                switch (i) {
                    case rl.c /*0*/:
                        buf.a(this, view, motionEvent3);
                        obj2 = obj;
                        z = z2;
                        continue;
                    case rq.b /*1*/:
                        buf.b(this, view, motionEvent3);
                        break;
                }
                obj2 = obj;
                z = z2;
            } else {
                motionEvent3 = motionEvent2;
                z = z2;
                obj2 = obj;
            }
            i3++;
            obj = obj2;
            z2 = z;
            motionEvent2 = motionEvent3;
        }
        z = z2;
        list.clear();
        return z;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int a = jw.a(motionEvent);
        if (a == 0) {
            a();
        }
        boolean a2 = a(motionEvent, 0);
        if (a == 1 || a == 3) {
            a();
        }
        return a2;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int a = jw.a(motionEvent);
        MotionEvent motionEvent2;
        if (this.t == null) {
            boolean a2 = a(motionEvent, 1);
            if (a2) {
                z = a2;
            } else {
                z = a2;
                z2 = false;
                if (this.t == null) {
                    z2 |= super.onTouchEvent(motionEvent);
                    motionEvent2 = null;
                } else if (z) {
                    motionEvent2 = null;
                } else {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    super.onTouchEvent(motionEvent2);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                if (a == 1 || a == 3) {
                    a();
                }
                return z2;
            }
        }
        z = false;
        buf buf = ((p) this.t.getLayoutParams()).a;
        z2 = buf != null ? buf.b(this, this.t, motionEvent) : false;
        if (this.t == null) {
            z2 |= super.onTouchEvent(motionEvent);
            motionEvent2 = null;
        } else if (z) {
            motionEvent2 = null;
        } else {
            long uptimeMillis2 = SystemClock.uptimeMillis();
            motionEvent2 = MotionEvent.obtain(uptimeMillis2, uptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEvent2);
        }
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        a();
        return z2;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.q) {
            a();
            this.q = true;
        }
    }

    private final int a(int i) {
        if (this.s == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        } else if (i >= 0 && i < this.s.length) {
            return this.s[i];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
            return 0;
        }
    }

    public static buf a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(g)) {
            str = g + '.' + str;
        }
        try {
            Map map;
            Map map2 = (Map) i.get();
            if (map2 == null) {
                HashMap hashMap = new HashMap();
                i.set(hashMap);
                map = hashMap;
            } else {
                map = map2;
            }
            Constructor constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, true, context.getClassLoader()).getConstructor(h);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (buf) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Throwable e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    private static p a(View view) {
        p pVar = (p) view.getLayoutParams();
        if (!pVar.b) {
            n nVar = null;
            for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                nVar = (n) cls.getAnnotation(n.class);
                if (nVar != null) {
                    break;
                }
            }
            n nVar2 = nVar;
            if (nVar2 != null) {
                try {
                    pVar.a((buf) nVar2.a().newInstance());
                } catch (Throwable e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + nVar2.a().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            pVar.b = true;
        }
        return pVar;
    }

    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    public final void a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    public final void a(View view, int i) {
        Object obj;
        p pVar = (p) view.getLayoutParams();
        if (pVar.g != null || pVar.f == -1) {
            obj = null;
        } else {
            obj = 1;
        }
        if (obj != null) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (pVar.g != null) {
            View view2 = pVar.g;
            view.getLayoutParams();
            Rect rect = this.b;
            Rect rect2 = this.c;
            ax.a(this, view2, rect);
            a(view, i, rect, rect2);
            view.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        } else if (pVar.e >= 0) {
            int i2;
            int i3 = pVar.e;
            pVar = (p) view.getLayoutParams();
            int a = iy.a(c(pVar.c), i);
            int i4 = a & 7;
            a &= 112;
            int width = getWidth();
            int height = getHeight();
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            if (i == 1) {
                i3 = width - i3;
            }
            i3 = a(i3) - measuredWidth;
            switch (i4) {
                case rq.b /*1*/:
                    i2 = i3 + (measuredWidth / 2);
                    break;
                case rl.g /*5*/:
                    i2 = i3 + measuredWidth;
                    break;
                default:
                    i2 = i3;
                    break;
            }
            switch (a) {
                case rk.bX /*16*/:
                    i3 = (measuredHeight / 2) + 0;
                    break;
                case 80:
                    i3 = measuredHeight + 0;
                    break;
                default:
                    i3 = 0;
                    break;
            }
            int max = Math.max(getPaddingLeft() + pVar.leftMargin, Math.min(i2, ((width - getPaddingRight()) - measuredWidth) - pVar.rightMargin));
            int max2 = Math.max(getPaddingTop() + pVar.topMargin, Math.min(i3, ((height - getPaddingBottom()) - measuredHeight) - pVar.bottomMargin));
            view.layout(max, max2, max + measuredWidth, max2 + measuredHeight);
        } else {
            pVar = (p) view.getLayoutParams();
            Rect rect3 = this.b;
            rect3.set(getPaddingLeft() + pVar.leftMargin, getPaddingTop() + pVar.topMargin, (getWidth() - getPaddingRight()) - pVar.rightMargin, (getHeight() - getPaddingBottom()) - pVar.bottomMargin);
            if (!(this.d == null || !kn.o(this) || kn.o(view))) {
                rect3.left += this.d.a();
                rect3.top += this.d.b();
                rect3.right -= this.d.c();
                rect3.bottom -= this.d.d();
            }
            Rect rect4 = this.c;
            iy.a(b(pVar.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect3, rect4, i);
            view.layout(rect4.left, rect4.top, rect4.right, rect4.bottom);
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int f = kn.f(this);
        int size = this.a.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) this.a.get(i5);
            buf buf = ((p) view.getLayoutParams()).a;
            if (buf == null || !buf.a(this, view, f)) {
                a(view, f);
            }
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.e && this.x != null) {
            int b = this.d != null ? this.d.b() : 0;
            if (b > 0) {
                this.x.setBounds(0, 0, getWidth(), b);
                this.x.draw(canvas);
            }
        }
    }

    final void a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.set(0, 0, 0, 0);
        } else if (z) {
            ax.a(this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    private void a(View view, int i, Rect rect, Rect rect2) {
        p pVar = (p) view.getLayoutParams();
        int i2 = pVar.c;
        if (i2 == 0) {
            i2 = 17;
        }
        i2 = iy.a(i2, i);
        int a = iy.a(b(pVar.d), i);
        int i3 = i2 & 7;
        int i4 = i2 & 112;
        i2 = a & 7;
        int i5 = a & 112;
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        switch (i2) {
            case rq.b /*1*/:
                a = (rect.width() / 2) + rect.left;
                break;
            case rl.g /*5*/:
                a = rect.right;
                break;
            default:
                a = rect.left;
                break;
        }
        switch (i5) {
            case rk.bX /*16*/:
                i2 = rect.top + (rect.height() / 2);
                break;
            case 80:
                i2 = rect.bottom;
                break;
            default:
                i2 = rect.top;
                break;
        }
        switch (i3) {
            case rq.b /*1*/:
                a -= measuredWidth / 2;
                break;
            case rl.g /*5*/:
                break;
            default:
                a -= measuredWidth;
                break;
        }
        switch (i4) {
            case rk.bX /*16*/:
                i2 -= measuredHeight / 2;
                break;
            case 80:
                break;
            default:
                i2 -= measuredHeight;
                break;
        }
        i3 = getWidth();
        i4 = getHeight();
        a = Math.max(getPaddingLeft() + pVar.leftMargin, Math.min(a, ((i3 - getPaddingRight()) - measuredWidth) - pVar.rightMargin));
        int max = Math.max(getPaddingTop() + pVar.topMargin, Math.min(i2, ((i4 - getPaddingBottom()) - measuredHeight) - pVar.bottomMargin));
        rect2.set(a, max, a + measuredWidth, max + measuredHeight);
    }

    private static int b(int i) {
        return i == 0 ? 8388659 : i;
    }

    private static int c(int i) {
        return i == 0 ? 8388661 : i;
    }

    protected boolean drawChild(Canvas canvas, View view, long j) {
        view.getLayoutParams();
        return super.drawChild(canvas, view, j);
    }

    public final void a(boolean z) {
        int f = kn.f(this);
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            int i2;
            View view = (View) this.a.get(i);
            p pVar = (p) view.getLayoutParams();
            for (i2 = 0; i2 < i; i2++) {
                p pVar2;
                buf buf;
                if (pVar.h == ((View) this.a.get(i2))) {
                    pVar2 = (p) view.getLayoutParams();
                    if (pVar2.g != null) {
                        Rect rect = this.b;
                        Rect rect2 = this.c;
                        Rect rect3 = this.o;
                        ax.a(this, pVar2.g, rect);
                        a(view, false, rect2);
                        a(view, f, rect, rect3);
                        int i3 = rect3.left - rect2.left;
                        int i4 = rect3.top - rect2.top;
                        if (i3 != 0) {
                            view.offsetLeftAndRight(i3);
                        }
                        if (i4 != 0) {
                            view.offsetTopAndBottom(i4);
                        }
                        if (i3 != 0 || i4 != 0) {
                            buf = pVar2.a;
                            if (buf != null) {
                                buf.b(this, view, pVar2.g);
                            }
                        }
                    }
                }
            }
            Rect rect4 = this.b;
            Rect rect5 = this.c;
            rect4.set(((p) view.getLayoutParams()).l);
            a(view, true, rect5);
            if (!rect4.equals(rect5)) {
                ((p) view.getLayoutParams()).l.set(rect5);
                for (i2 = i + 1; i2 < size; i2++) {
                    View view2 = (View) this.a.get(i2);
                    pVar2 = (p) view2.getLayoutParams();
                    buf = pVar2.a;
                    if (buf != null && buf.c(this, view2, view)) {
                        if (z || !pVar2.k) {
                            boolean b = buf.b(this, view2, view);
                            if (z) {
                                pVar2.k = b;
                            }
                        } else {
                            pVar2.k = false;
                        }
                    }
                }
            }
        }
    }

    private void b() {
        boolean z;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            p pVar = (p) childAt.getLayoutParams();
            if (pVar.g != null) {
                z = true;
            } else {
                int childCount2 = getChildCount();
                for (int i2 = 0; i2 < childCount2; i2++) {
                    View childAt2 = getChildAt(i2);
                    if (childAt2 != childAt && pVar.a(this, childAt, childAt2)) {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
            if (z) {
                z = true;
                break;
            }
        }
        z = false;
        if (z == this.w) {
            return;
        }
        if (z) {
            if (this.r) {
                if (this.v == null) {
                    this.v = new q(this);
                }
                getViewTreeObserver().addOnPreDrawListener(this.v);
            }
            this.w = true;
            return;
        }
        if (this.r && this.v != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.v);
        }
        this.w = false;
    }

    public final boolean a(View view, int i, int i2) {
        Rect rect = this.b;
        ax.a(this, view, rect);
        return rect.contains(i, i2);
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof p) && super.checkLayoutParams(layoutParams);
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        int childCount = getChildCount();
        int i2 = 0;
        boolean z = false;
        while (i2 < childCount) {
            boolean z2;
            View childAt = getChildAt(i2);
            p pVar = (p) childAt.getLayoutParams();
            buf buf = pVar.a;
            if (buf != null) {
                boolean a = buf.a(this, childAt, view, view2, i);
                z2 = z | a;
                pVar.j = a;
            } else {
                pVar.j = false;
                z2 = z;
            }
            i2++;
            z = z2;
        }
        return z;
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.y.a = i;
        this.u = view2;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).getLayoutParams();
        }
    }

    public void onStopNestedScroll(View view) {
        this.y.a = 0;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            p pVar = (p) childAt.getLayoutParams();
            if (pVar.j) {
                buf buf = pVar.a;
                if (buf != null) {
                    buf.a(this, childAt, view);
                }
                pVar.j = false;
                pVar.k = false;
            }
        }
        this.u = null;
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        Object obj = null;
        int i5 = 0;
        while (i5 < childCount) {
            Object obj2;
            View childAt = getChildAt(i5);
            p pVar = (p) childAt.getLayoutParams();
            if (pVar.j) {
                buf buf = pVar.a;
                if (buf != null) {
                    buf.a(this, childAt, view, i, i2, i3, i4);
                    obj2 = 1;
                    i5++;
                    obj = obj2;
                }
            }
            obj2 = obj;
            i5++;
            obj = obj2;
        }
        if (obj != null) {
            a(true);
        }
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        int i3 = 0;
        int i4 = 0;
        Object obj = null;
        int childCount = getChildCount();
        int i5 = 0;
        while (i5 < childCount) {
            int max;
            int i6;
            Object obj2;
            View childAt = getChildAt(i5);
            p pVar = (p) childAt.getLayoutParams();
            if (pVar.j) {
                buf buf = pVar.a;
                if (buf != null) {
                    int max2;
                    int[] iArr2 = this.p;
                    this.p[1] = 0;
                    iArr2[0] = 0;
                    buf.a(this, childAt, view, i, i2, this.p);
                    if (i > 0) {
                        max = Math.max(i3, this.p[0]);
                    } else {
                        max = Math.min(i3, this.p[0]);
                    }
                    if (i2 > 0) {
                        max2 = Math.max(i4, this.p[1]);
                    } else {
                        max2 = Math.min(i4, this.p[1]);
                    }
                    i6 = max2;
                    obj2 = 1;
                    i5++;
                    i4 = i6;
                    i3 = max;
                    obj = obj2;
                }
            }
            obj2 = obj;
            max = i3;
            i6 = i4;
            i5++;
            i4 = i6;
            i3 = max;
            obj = obj2;
        }
        iArr[0] = i3;
        iArr[1] = i4;
        if (obj != null) {
            a(true);
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        int i = 0;
        boolean z2 = false;
        while (i < childCount) {
            boolean a;
            View childAt = getChildAt(i);
            p pVar = (p) childAt.getLayoutParams();
            if (pVar.j) {
                buf buf = pVar.a;
                if (buf != null) {
                    a = buf.a(this, childAt, view, f, f2, z) | z2;
                    i++;
                    z2 = a;
                }
            }
            a = z2;
            i++;
            z2 = a;
        }
        if (z2) {
            a(true);
        }
        return z2;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        int childCount = getChildCount();
        int i = 0;
        boolean z = false;
        while (i < childCount) {
            boolean a;
            View childAt = getChildAt(i);
            p pVar = (p) childAt.getLayoutParams();
            if (pVar.j) {
                buf buf = pVar.a;
                if (buf != null) {
                    a = buf.a(this, childAt, view, f, f2) | z;
                    i++;
                    z = a;
                }
            }
            a = z;
            i++;
            z = a;
        }
        return z;
    }

    public int getNestedScrollAxes() {
        return this.y.a;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof r) {
            r rVar = (r) parcelable;
            super.onRestoreInstanceState(rVar.e);
            SparseArray sparseArray = rVar.a;
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                int id = childAt.getId();
                buf buf = a(childAt).a;
                if (!(id == -1 || buf == null)) {
                    Parcelable parcelable2 = (Parcelable) sparseArray.get(id);
                    if (parcelable2 != null) {
                        buf.a(this, childAt, parcelable2);
                    }
                }
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable rVar = new r(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            buf buf = ((p) childAt.getLayoutParams()).a;
            if (!(id == -1 || buf == null)) {
                Parcelable b = buf.b(this, childAt);
                if (b != null) {
                    sparseArray.append(id, b);
                }
            }
        }
        rVar.a = sparseArray;
        return rVar;
    }

    private static void a(List list, Comparator comparator) {
        if (list != null && list.size() >= 2) {
            int i;
            View[] viewArr = new View[list.size()];
            list.toArray(viewArr);
            for (int i2 = 0; i2 < r5; i2++) {
                i = i2;
                for (int i3 = i2 + 1; i3 < r5; i3++) {
                    if (comparator.compare(viewArr[i3], viewArr[i]) < 0) {
                        i = i3;
                    }
                }
                if (i2 != i) {
                    View view = viewArr[i];
                    viewArr[i] = viewArr[i2];
                    viewArr[i2] = view;
                }
            }
            list.clear();
            for (Object add : viewArr) {
                list.add(add);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onMeasure(int r26, int r27) {
        /*
        r25 = this;
        r0 = r25;
        r1 = r0.a;
        r1.clear();
        r1 = 0;
        r4 = r25.getChildCount();
        r3 = r1;
    L_0x000d:
        if (r3 >= r4) goto L_0x00f8;
    L_0x000f:
        r0 = r25;
        r5 = r0.getChildAt(r3);
        r6 = a(r5);
        r1 = r6.f;
        r2 = -1;
        if (r1 != r2) goto L_0x002e;
    L_0x001e:
        r1 = 0;
        r6.h = r1;
        r6.g = r1;
    L_0x0023:
        r0 = r25;
        r1 = r0.a;
        r1.add(r5);
        r1 = r3 + 1;
        r3 = r1;
        goto L_0x000d;
    L_0x002e:
        r1 = r6.g;
        if (r1 == 0) goto L_0x003f;
    L_0x0032:
        r1 = r6.g;
        r1 = r1.getId();
        r2 = r6.f;
        if (r1 == r2) goto L_0x0061;
    L_0x003c:
        r1 = 0;
    L_0x003d:
        if (r1 != 0) goto L_0x005e;
    L_0x003f:
        r1 = r6.f;
        r0 = r25;
        r1 = r0.findViewById(r1);
        r6.g = r1;
        r1 = r6.g;
        if (r1 == 0) goto L_0x00c3;
    L_0x004d:
        r1 = r6.g;
        r0 = r25;
        if (r1 != r0) goto L_0x0090;
    L_0x0053:
        r1 = r25.isInEditMode();
        if (r1 == 0) goto L_0x0088;
    L_0x0059:
        r1 = 0;
        r6.h = r1;
        r6.g = r1;
    L_0x005e:
        r1 = r6.g;
        goto L_0x0023;
    L_0x0061:
        r1 = r6.g;
        r2 = r6.g;
        r2 = r2.getParent();
    L_0x0069:
        r0 = r25;
        if (r2 == r0) goto L_0x0084;
    L_0x006d:
        if (r2 == 0) goto L_0x0071;
    L_0x006f:
        if (r2 != r5) goto L_0x0078;
    L_0x0071:
        r1 = 0;
        r6.h = r1;
        r6.g = r1;
        r1 = 0;
        goto L_0x003d;
    L_0x0078:
        r7 = r2 instanceof android.view.View;
        if (r7 == 0) goto L_0x007f;
    L_0x007c:
        r1 = r2;
        r1 = (android.view.View) r1;
    L_0x007f:
        r2 = r2.getParent();
        goto L_0x0069;
    L_0x0084:
        r6.h = r1;
        r1 = 1;
        goto L_0x003d;
    L_0x0088:
        r1 = new java.lang.IllegalStateException;
        r2 = "View can not be anchored to the the parent CoordinatorLayout";
        r1.<init>(r2);
        throw r1;
    L_0x0090:
        r1 = r6.g;
        r2 = r6.g;
        r2 = r2.getParent();
    L_0x0098:
        r0 = r25;
        if (r2 == r0) goto L_0x00c0;
    L_0x009c:
        if (r2 == 0) goto L_0x00c0;
    L_0x009e:
        if (r2 != r5) goto L_0x00b4;
    L_0x00a0:
        r1 = r25.isInEditMode();
        if (r1 == 0) goto L_0x00ac;
    L_0x00a6:
        r1 = 0;
        r6.h = r1;
        r6.g = r1;
        goto L_0x005e;
    L_0x00ac:
        r1 = new java.lang.IllegalStateException;
        r2 = "Anchor must not be a descendant of the anchored view";
        r1.<init>(r2);
        throw r1;
    L_0x00b4:
        r7 = r2 instanceof android.view.View;
        if (r7 == 0) goto L_0x00bb;
    L_0x00b8:
        r1 = r2;
        r1 = (android.view.View) r1;
    L_0x00bb:
        r2 = r2.getParent();
        goto L_0x0098;
    L_0x00c0:
        r6.h = r1;
        goto L_0x005e;
    L_0x00c3:
        r1 = r25.isInEditMode();
        if (r1 == 0) goto L_0x00cf;
    L_0x00c9:
        r1 = 0;
        r6.h = r1;
        r6.g = r1;
        goto L_0x005e;
    L_0x00cf:
        r1 = new java.lang.IllegalStateException;
        r2 = new java.lang.StringBuilder;
        r3 = "Could not find CoordinatorLayout descendant view with id ";
        r2.<init>(r3);
        r3 = r25.getResources();
        r4 = r6.f;
        r3 = r3.getResourceName(r4);
        r2 = r2.append(r3);
        r3 = " to anchor view ";
        r2 = r2.append(r3);
        r2 = r2.append(r5);
        r2 = r2.toString();
        r1.<init>(r2);
        throw r1;
    L_0x00f8:
        r0 = r25;
        r1 = r0.a;
        r0 = r25;
        r2 = r0.j;
        a(r1, r2);
        r25.b();
        r15 = r25.getPaddingLeft();
        r2 = r25.getPaddingTop();
        r16 = r25.getPaddingRight();
        r3 = r25.getPaddingBottom();
        r17 = kn.f(r25);
        r1 = 1;
        r0 = r17;
        if (r0 != r1) goto L_0x021d;
    L_0x011f:
        r1 = 1;
        r9 = r1;
    L_0x0121:
        r18 = android.view.View.MeasureSpec.getMode(r26);
        r19 = android.view.View.MeasureSpec.getSize(r26);
        r20 = android.view.View.MeasureSpec.getMode(r27);
        r21 = android.view.View.MeasureSpec.getSize(r27);
        r22 = r15 + r16;
        r23 = r2 + r3;
        r4 = r25.getSuggestedMinimumWidth();
        r3 = r25.getSuggestedMinimumHeight();
        r2 = 0;
        r0 = r25;
        r1 = r0.d;
        if (r1 == 0) goto L_0x0221;
    L_0x0144:
        r1 = kn.o(r25);
        if (r1 == 0) goto L_0x0221;
    L_0x014a:
        r1 = 1;
        r10 = r1;
    L_0x014c:
        r0 = r25;
        r1 = r0.a;
        r24 = r1.size();
        r1 = 0;
        r11 = r1;
        r12 = r2;
        r13 = r3;
        r14 = r4;
    L_0x0159:
        r0 = r24;
        if (r11 >= r0) goto L_0x0237;
    L_0x015d:
        r0 = r25;
        r1 = r0.a;
        r3 = r1.get(r11);
        r3 = (android.view.View) r3;
        r1 = r3.getLayoutParams();
        r8 = r1;
        r8 = (p) r8;
        r5 = 0;
        r1 = r8.e;
        if (r1 < 0) goto L_0x019e;
    L_0x0173:
        if (r18 == 0) goto L_0x019e;
    L_0x0175:
        r1 = r8.e;
        r0 = r25;
        r1 = r0.a(r1);
        r2 = r8.c;
        r2 = c(r2);
        r0 = r17;
        r2 = iy.a(r2, r0);
        r2 = r2 & 7;
        r4 = 3;
        if (r2 != r4) goto L_0x0190;
    L_0x018e:
        if (r9 == 0) goto L_0x0195;
    L_0x0190:
        r4 = 5;
        if (r2 != r4) goto L_0x0225;
    L_0x0193:
        if (r9 == 0) goto L_0x0225;
    L_0x0195:
        r2 = 0;
        r4 = r19 - r16;
        r1 = r4 - r1;
        r5 = java.lang.Math.max(r2, r1);
    L_0x019e:
        if (r10 == 0) goto L_0x024e;
    L_0x01a0:
        r1 = kn.o(r3);
        if (r1 != 0) goto L_0x024e;
    L_0x01a6:
        r0 = r25;
        r1 = r0.d;
        r1 = r1.a();
        r0 = r25;
        r2 = r0.d;
        r2 = r2.c();
        r1 = r1 + r2;
        r0 = r25;
        r2 = r0.d;
        r2 = r2.b();
        r0 = r25;
        r4 = r0.d;
        r4 = r4.d();
        r2 = r2 + r4;
        r1 = r19 - r1;
        r0 = r18;
        r4 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0);
        r1 = r21 - r2;
        r0 = r20;
        r6 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0);
    L_0x01d8:
        r1 = r8.a;
        if (r1 == 0) goto L_0x01e5;
    L_0x01dc:
        r7 = 0;
        r2 = r25;
        r1 = r1.a(r2, r3, r4, r5, r6, r7);
        if (r1 != 0) goto L_0x01eb;
    L_0x01e5:
        r7 = 0;
        r2 = r25;
        r2.a(r3, r4, r5, r6, r7);
    L_0x01eb:
        r1 = r3.getMeasuredWidth();
        r1 = r1 + r22;
        r2 = r8.leftMargin;
        r1 = r1 + r2;
        r2 = r8.rightMargin;
        r1 = r1 + r2;
        r5 = java.lang.Math.max(r14, r1);
        r1 = r3.getMeasuredHeight();
        r1 = r1 + r23;
        r2 = r8.topMargin;
        r1 = r1 + r2;
        r2 = r8.bottomMargin;
        r1 = r1 + r2;
        r4 = java.lang.Math.max(r13, r1);
        r1 = kn.g(r3);
        r2 = kn.a;
        r2 = r2.a(r12, r1);
        r1 = r11 + 1;
        r11 = r1;
        r12 = r2;
        r13 = r4;
        r14 = r5;
        goto L_0x0159;
    L_0x021d:
        r1 = 0;
        r9 = r1;
        goto L_0x0121;
    L_0x0221:
        r1 = 0;
        r10 = r1;
        goto L_0x014c;
    L_0x0225:
        r4 = 5;
        if (r2 != r4) goto L_0x022a;
    L_0x0228:
        if (r9 == 0) goto L_0x022f;
    L_0x022a:
        r4 = 3;
        if (r2 != r4) goto L_0x019e;
    L_0x022d:
        if (r9 == 0) goto L_0x019e;
    L_0x022f:
        r2 = 0;
        r1 = r1 - r15;
        r5 = java.lang.Math.max(r2, r1);
        goto L_0x019e;
    L_0x0237:
        r1 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r1 = r1 & r12;
        r0 = r26;
        r1 = kn.a(r14, r0, r1);
        r2 = r12 << 16;
        r0 = r27;
        r2 = kn.a(r13, r0, r2);
        r0 = r25;
        r0.setMeasuredDimension(r1, r2);
        return;
    L_0x024e:
        r6 = r27;
        r4 = r26;
        goto L_0x01d8;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return new p(-2, -2);
    }

    protected /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        if (layoutParams instanceof p) {
            return new p((p) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new p((MarginLayoutParams) layoutParams);
        }
        return new p(layoutParams);
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new p(getContext(), attributeSet);
    }
}
