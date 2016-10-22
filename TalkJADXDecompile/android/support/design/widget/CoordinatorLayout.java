package android.support.design.widget;

import ac;
import ad;
import ae;
import af;
import ag;
import ah;
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
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import ay;
import bk;
import eid;
import fil;
import gwb;
import hfz;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mj;
import nh;
import nm;
import nn;
import no;
import o;
import oa;
import qb;
import wi;

public class CoordinatorLayout extends ViewGroup implements nm {
    static final String a;
    static final Class<?>[] b;
    static final ThreadLocal<Map<String, Constructor<gwb>>> c;
    static final Comparator<View> d;
    private final nn A;
    public qb e;
    public boolean f;
    public OnHierarchyChangeListener g;
    private final List<View> h;
    private final hfz i;
    private final List<View> j;
    private final List<View> k;
    private final Rect l;
    private final Rect m;
    private final Rect n;
    private final Rect o;
    private final int[] p;
    private boolean q;
    private boolean r;
    private int[] s;
    private View t;
    private View u;
    private View v;
    private af w;
    private boolean x;
    private Drawable y;
    private no z;

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return d();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return a(attributeSet);
    }

    protected /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return a(layoutParams);
    }

    static {
        Package packageR = CoordinatorLayout.class.getPackage();
        a = packageR != null ? packageR.getName() : null;
        if (VERSION.SDK_INT >= 21) {
            d = new ah();
        } else {
            d = null;
        }
        b = new Class[]{Context.class, AttributeSet.class};
        c = new ThreadLocal();
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        int i2 = 0;
        super(context, attributeSet, i);
        this.h = new ArrayList();
        this.i = new hfz();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new Rect();
        this.m = new Rect();
        this.n = new Rect();
        this.o = new Rect();
        this.p = new int[2];
        this.A = new nn(this);
        ay.a(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.B, i, eid.c);
        int resourceId = obtainStyledAttributes.getResourceId(o.C, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.s = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.s.length;
            while (i2 < length) {
                int[] iArr = this.s;
                iArr[i2] = (int) (((float) iArr[i2]) * f);
                i2++;
            }
        }
        this.y = obtainStyledAttributes.getDrawable(o.D);
        obtainStyledAttributes.recycle();
        f();
        super.setOnHierarchyChangeListener(new ad(this));
    }

    public void setOnHierarchyChangeListener(OnHierarchyChangeListener onHierarchyChangeListener) {
        this.g = onHierarchyChangeListener;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        e();
        if (this.x) {
            if (this.w == null) {
                this.w = new af(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.w);
        }
        if (this.e == null && oa.p(this)) {
            oa.o(this);
        }
        this.r = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
        if (this.x && this.w != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.w);
        }
        if (this.v != null) {
            onStopNestedScroll(this.v);
        }
        this.r = false;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        int i = 0;
        Drawable drawable = this.y;
        if (drawable != null && drawable.isStateful()) {
            i = drawable.setState(drawableState) | 0;
        }
        if (i != 0) {
            invalidate();
        }
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.y;
    }

    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.y != null && this.y.isVisible() != z) {
            this.y.setVisible(z, false);
        }
    }

    private void e() {
        if (this.t != null) {
            gwb a = ((ae) this.t.getLayoutParams()).a();
            if (a != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                a.b(this, this.t, obtain);
                obtain.recycle();
            }
            this.t = null;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((ae) getChildAt(i).getLayoutParams()).e();
        }
        this.q = false;
    }

    private boolean a(MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2 = false;
        Object obj = null;
        int a = nh.a(motionEvent);
        List list = this.j;
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
        if (d != null) {
            Collections.sort(list, d);
        }
        int size = list.size();
        int i3 = 0;
        MotionEvent motionEvent2 = null;
        while (i3 < size) {
            Object obj2;
            MotionEvent motionEvent3;
            View view = (View) list.get(i3);
            ae aeVar = (ae) view.getLayoutParams();
            gwb a2 = aeVar.a();
            if ((!z2 && obj == null) || a == 0) {
                if (!(z2 || a2 == null)) {
                    switch (i) {
                        case wi.w /*0*/:
                            z2 = a2.a(this, view, motionEvent);
                            break;
                        case wi.j /*1*/:
                            z2 = a2.b(this, view, motionEvent);
                            break;
                    }
                    if (z2) {
                        this.t = view;
                    }
                }
                z = z2;
                isChildrenDrawingOrderEnabled = aeVar.d();
                boolean a3 = aeVar.a(this, view);
                Object obj3 = (!a3 || isChildrenDrawingOrderEnabled) ? null : 1;
                if (a3 && obj3 == null) {
                    list.clear();
                    return z;
                }
                MotionEvent motionEvent4 = motionEvent2;
                obj2 = obj3;
                motionEvent3 = motionEvent4;
            } else if (a2 != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                } else {
                    motionEvent3 = motionEvent2;
                }
                switch (i) {
                    case wi.w /*0*/:
                        a2.a(this, view, motionEvent3);
                        obj2 = obj;
                        z = z2;
                        continue;
                    case wi.j /*1*/:
                        a2.b(this, view, motionEvent3);
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
        int a = nh.a(motionEvent);
        if (a == 0) {
            e();
        }
        boolean a2 = a(motionEvent, 0);
        if (a == 1 || a == 3) {
            e();
        }
        return a2;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int a = nh.a(motionEvent);
        boolean z2;
        MotionEvent motionEvent2;
        if (this.t == null) {
            boolean a2 = a(motionEvent, 1);
            if (a2) {
                z2 = a2;
            } else {
                z2 = a2;
                z = false;
                if (this.t == null) {
                    z |= super.onTouchEvent(motionEvent);
                    motionEvent2 = null;
                } else if (z2) {
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
                    e();
                }
                return z;
            }
        }
        z2 = false;
        gwb a3 = ((ae) this.t.getLayoutParams()).a();
        z = a3 != null ? a3.b(this, this.t, motionEvent) : false;
        if (this.t == null) {
            z |= super.onTouchEvent(motionEvent);
            motionEvent2 = null;
        } else if (z2) {
            motionEvent2 = null;
        } else {
            long uptimeMillis2 = SystemClock.uptimeMillis();
            motionEvent2 = MotionEvent.obtain(uptimeMillis2, uptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEvent2);
        }
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        e();
        return z;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.q) {
            e();
            this.q = true;
        }
    }

    private int b(int i) {
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

    public static gwb a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(a)) {
            str = a + '.' + str;
        }
        try {
            Map map;
            Map map2 = (Map) c.get();
            if (map2 == null) {
                HashMap hashMap = new HashMap();
                c.set(hashMap);
                map = hashMap;
            } else {
                map = map2;
            }
            Constructor constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, true, context.getClassLoader()).getConstructor(b);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (gwb) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Throwable e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    ae a(View view) {
        ae aeVar = (ae) view.getLayoutParams();
        if (!aeVar.b) {
            ac acVar = null;
            for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                acVar = (ac) cls.getAnnotation(ac.class);
                if (acVar != null) {
                    break;
                }
            }
            ac acVar2 = acVar;
            if (acVar2 != null) {
                try {
                    aeVar.a((gwb) acVar2.a().newInstance());
                } catch (Throwable e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + acVar2.a().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            aeVar.b = true;
        }
        return aeVar;
    }

    void a(View view, Rect rect) {
        bk.a(this, view, rect);
    }

    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    public void a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    public void a(View view, int i) {
        ae aeVar = (ae) view.getLayoutParams();
        if (aeVar.c()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (aeVar.k != null) {
            View view2 = aeVar.k;
            view.getLayoutParams();
            Rect rect = this.l;
            Rect rect2 = this.m;
            a(view2, rect);
            a(view, i, rect, rect2);
            view.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        } else if (aeVar.e >= 0) {
            int i2 = aeVar.e;
            aeVar = (ae) view.getLayoutParams();
            int a = mj.a(d(aeVar.c), i);
            int i3 = a & 7;
            int i4 = a & 112;
            int width = getWidth();
            int height = getHeight();
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            if (i == 1) {
                i2 = width - i2;
            }
            a = b(i2) - measuredWidth;
            i2 = 0;
            switch (i3) {
                case wi.j /*1*/:
                    a += measuredWidth / 2;
                    break;
                case wi.p /*5*/:
                    a += measuredWidth;
                    break;
            }
            switch (i4) {
                case wi.dI /*16*/:
                    i2 = (measuredHeight / 2) + 0;
                    break;
                case 80:
                    i2 = measuredHeight + 0;
                    break;
            }
            a = Math.max(getPaddingLeft() + aeVar.leftMargin, Math.min(a, ((width - getPaddingRight()) - measuredWidth) - aeVar.rightMargin));
            int max = Math.max(getPaddingTop() + aeVar.topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight) - aeVar.bottomMargin));
            view.layout(a, max, a + measuredWidth, max + measuredHeight);
        } else {
            ae aeVar2 = (ae) view.getLayoutParams();
            Rect rect3 = this.l;
            rect3.set(getPaddingLeft() + aeVar2.leftMargin, getPaddingTop() + aeVar2.topMargin, (getWidth() - getPaddingRight()) - aeVar2.rightMargin, (getHeight() - getPaddingBottom()) - aeVar2.bottomMargin);
            if (!(this.e == null || !oa.p(this) || oa.p(view))) {
                rect3.left += this.e.a();
                rect3.top += this.e.b();
                rect3.right -= this.e.c();
                rect3.bottom -= this.e.d();
            }
            Rect rect4 = this.m;
            mj.a(c(aeVar2.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect3, rect4, i);
            view.layout(rect4.left, rect4.top, rect4.right, rect4.bottom);
            oa.f(view, aeVar2.i);
            oa.e(view, aeVar2.j);
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int d = oa.d(this);
        int size = this.h.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) this.h.get(i5);
            gwb a = ((ae) view.getLayoutParams()).a();
            if (a == null || !a.a(this, view, d)) {
                a(view, d);
            }
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f && this.y != null) {
            int b = this.e != null ? this.e.b() : 0;
            if (b > 0) {
                this.y.setBounds(0, 0, getWidth(), b);
                this.y.draw(canvas);
            }
        }
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        f();
    }

    void b(View view, Rect rect) {
        ((ae) view.getLayoutParams()).a(rect);
    }

    void c(View view, Rect rect) {
        rect.set(((ae) view.getLayoutParams()).b());
    }

    void a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            a(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    private static void a(int i, Rect rect, Rect rect2, ae aeVar, int i2, int i3) {
        int i4 = aeVar.c;
        if (i4 == 0) {
            i4 = 17;
        }
        i4 = mj.a(i4, i);
        int a = mj.a(c(aeVar.d), i);
        int i5 = i4 & 7;
        int i6 = i4 & 112;
        int i7 = a & 112;
        switch (a & 7) {
            case wi.j /*1*/:
                a = (rect.width() / 2) + rect.left;
                break;
            case wi.p /*5*/:
                a = rect.right;
                break;
            default:
                a = rect.left;
                break;
        }
        switch (i7) {
            case wi.dI /*16*/:
                i4 = rect.top + (rect.height() / 2);
                break;
            case 80:
                i4 = rect.bottom;
                break;
            default:
                i4 = rect.top;
                break;
        }
        switch (i5) {
            case wi.j /*1*/:
                a -= i2 / 2;
                break;
            case wi.p /*5*/:
                break;
            default:
                a -= i2;
                break;
        }
        switch (i6) {
            case wi.dI /*16*/:
                i4 -= i3 / 2;
                break;
            case 80:
                break;
            default:
                i4 -= i3;
                break;
        }
        rect2.set(a, i4, a + i2, i4 + i3);
    }

    private void a(ae aeVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        width = Math.max(getPaddingLeft() + aeVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - aeVar.rightMargin));
        height = Math.max(getPaddingTop() + aeVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - aeVar.bottomMargin));
        rect.set(width, height, width + i, height + i2);
    }

    void a(View view, int i, Rect rect, Rect rect2) {
        ae aeVar = (ae) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        a(i, rect, rect2, aeVar, measuredWidth, measuredHeight);
        a(aeVar, rect2, measuredWidth, measuredHeight);
    }

    private static int c(int i) {
        return i == 0 ? 8388659 : i;
    }

    private static int d(int i) {
        return i == 0 ? 8388661 : i;
    }

    protected boolean drawChild(Canvas canvas, View view, long j) {
        view.getLayoutParams();
        return super.drawChild(canvas, view, j);
    }

    public final void a(int i) {
        int d = oa.d(this);
        int size = this.h.size();
        Rect rect = this.o;
        rect.setEmpty();
        for (int i2 = 0; i2 < size; i2++) {
            int i3;
            View view = (View) this.h.get(i2);
            ae aeVar = (ae) view.getLayoutParams();
            for (i3 = 0; i3 < i2; i3++) {
                if (aeVar.l == ((View) this.h.get(i3))) {
                    b(view, d);
                }
            }
            Rect rect2 = this.l;
            a(view, true, rect2);
            if (!(aeVar.g == 0 || rect2.isEmpty())) {
                int a = mj.a(aeVar.g, d);
                switch (a & 112) {
                    case 48:
                        rect.top = Math.max(rect.top, rect2.bottom);
                        break;
                    case 80:
                        rect.bottom = Math.max(rect.bottom, getHeight() - rect2.top);
                        break;
                }
                switch (a & 7) {
                    case wi.z /*3*/:
                        rect.left = Math.max(rect.left, rect2.right);
                        break;
                    case wi.p /*5*/:
                        rect.right = Math.max(rect.right, getWidth() - rect2.left);
                        break;
                }
            }
            if (aeVar.h != 0) {
                int i4;
                Object obj;
                aeVar = (ae) view.getLayoutParams();
                int a2 = mj.a(aeVar.h, d);
                gwb a3 = aeVar.a();
                Rect rect3 = this.n;
                if (a3 == null || !a3.a(this, view, rect3)) {
                    rect3.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                } else {
                    rect3.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                }
                Object obj2 = null;
                if ((a2 & 48) == 48) {
                    i4 = (rect3.top - aeVar.topMargin) - aeVar.j;
                    if (i4 < rect.top) {
                        d(view, rect.top - i4);
                        obj2 = 1;
                    }
                }
                if ((a2 & 80) == 80) {
                    i4 = ((getHeight() - rect3.bottom) - aeVar.bottomMargin) + aeVar.j;
                    if (i4 < rect.bottom) {
                        d(view, i4 - rect.bottom);
                        obj2 = 1;
                    }
                }
                if (obj2 == null) {
                    d(view, 0);
                }
                obj2 = null;
                if ((a2 & 3) == 3) {
                    i4 = (rect3.left - aeVar.leftMargin) - aeVar.i;
                    if (i4 < rect.left) {
                        c(view, rect.left - i4);
                        obj2 = 1;
                    }
                }
                if ((a2 & 5) == 5) {
                    int width = aeVar.i + ((getWidth() - rect3.right) - aeVar.rightMargin);
                    if (width < rect.right) {
                        c(view, width - rect.right);
                        obj = 1;
                        if (obj == null) {
                            c(view, 0);
                        }
                    }
                }
                obj = obj2;
                if (obj == null) {
                    c(view, 0);
                }
            }
            if (i == 0) {
                Rect rect4 = this.m;
                c(view, rect4);
                if (rect4.equals(rect2)) {
                } else {
                    b(view, rect2);
                }
            }
            for (i3 = i2 + 1; i3 < size; i3++) {
                View view2 = (View) this.h.get(i3);
                ae aeVar2 = (ae) view2.getLayoutParams();
                gwb a4 = aeVar2.a();
                if (a4 != null && a4.a_(view)) {
                    if (i == 0 && aeVar2.h()) {
                        aeVar2.i();
                    } else {
                        boolean z;
                        switch (i) {
                            case wi.l /*2*/:
                                z = true;
                                break;
                            default:
                                z = a4.b(this, view2, view);
                                break;
                        }
                        if (i == 1) {
                            aeVar2.b(z);
                        }
                    }
                }
            }
        }
    }

    private static void c(View view, int i) {
        ae aeVar = (ae) view.getLayoutParams();
        if (aeVar.i != i) {
            oa.f(view, i - aeVar.i);
            aeVar.i = i;
        }
    }

    private static void d(View view, int i) {
        ae aeVar = (ae) view.getLayoutParams();
        if (aeVar.j != i) {
            oa.e(view, i - aeVar.j);
            aeVar.j = i;
        }
    }

    public void b(View view) {
        List c = this.i.c(view);
        if (c != null && !c.isEmpty()) {
            for (int i = 0; i < c.size(); i++) {
                View view2 = (View) c.get(i);
                gwb a = ((ae) view2.getLayoutParams()).a();
                if (a != null) {
                    a.b(this, view2, view);
                }
            }
        }
    }

    public List<View> c(View view) {
        Collection d = this.i.d(view);
        this.k.clear();
        if (d != null) {
            this.k.addAll(d);
        }
        return this.k;
    }

    public List<View> d(View view) {
        Collection c = this.i.c(view);
        this.k.clear();
        if (c != null) {
            this.k.addAll(c);
        }
        return this.k;
    }

    void a() {
        boolean z = false;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (this.i.e(getChildAt(i))) {
                z = true;
                break;
            }
        }
        if (z == this.x) {
            return;
        }
        if (z) {
            b();
        } else {
            c();
        }
    }

    void b() {
        if (this.r) {
            if (this.w == null) {
                this.w = new af(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.w);
        }
        this.x = true;
    }

    void c() {
        if (this.r && this.w != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.w);
        }
        this.x = false;
    }

    void b(View view, int i) {
        ae aeVar = (ae) view.getLayoutParams();
        if (aeVar.k != null) {
            Rect rect = this.l;
            Rect rect2 = this.m;
            Rect rect3 = this.n;
            a(aeVar.k, rect);
            a(view, false, rect2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            a(i, rect, rect3, aeVar, measuredWidth, measuredHeight);
            boolean z = (rect3.left == rect2.left && rect3.top == rect2.top) ? false : true;
            a(aeVar, rect3, measuredWidth, measuredHeight);
            int i2 = rect3.left - rect2.left;
            int i3 = rect3.top - rect2.top;
            if (i2 != 0) {
                oa.f(view, i2);
            }
            if (i3 != 0) {
                oa.e(view, i3);
            }
            if (z) {
                gwb a = aeVar.a();
                if (a != null) {
                    a.b(this, view, aeVar.k);
                }
            }
        }
    }

    public boolean a(View view, int i, int i2) {
        Rect rect = this.l;
        a(view, rect);
        return rect.contains(i, i2);
    }

    public ae a(AttributeSet attributeSet) {
        return new ae(getContext(), attributeSet);
    }

    protected ae a(LayoutParams layoutParams) {
        if (layoutParams instanceof ae) {
            return new ae((ae) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new ae((MarginLayoutParams) layoutParams);
        }
        return new ae(layoutParams);
    }

    protected ae d() {
        return new ae(-2, -2);
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof ae) && super.checkLayoutParams(layoutParams);
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        int childCount = getChildCount();
        int i2 = 0;
        boolean z = false;
        while (i2 < childCount) {
            boolean z2;
            View childAt = getChildAt(i2);
            ae aeVar = (ae) childAt.getLayoutParams();
            gwb a = aeVar.a();
            if (a != null) {
                boolean a2 = a.a(this, childAt, view, view2, i);
                z2 = z | a2;
                aeVar.a(a2);
            } else {
                aeVar.a(false);
                z2 = z;
            }
            i2++;
            z = z2;
        }
        return z;
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.A.a(i);
        this.u = view;
        this.v = view2;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).getLayoutParams();
        }
    }

    public void onStopNestedScroll(View view) {
        this.A.b();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            ae aeVar = (ae) childAt.getLayoutParams();
            if (aeVar.g()) {
                gwb a = aeVar.a();
                if (a != null) {
                    a.a(this, childAt, view);
                }
                aeVar.f();
                aeVar.i();
            }
        }
        this.u = null;
        this.v = null;
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        Object obj = null;
        int i5 = 0;
        while (i5 < childCount) {
            Object obj2;
            View childAt = getChildAt(i5);
            ae aeVar = (ae) childAt.getLayoutParams();
            if (aeVar.g()) {
                gwb a = aeVar.a();
                if (a != null) {
                    a.a(this, childAt, view, i, i2, i3, i4);
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
            a(1);
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
            ae aeVar = (ae) childAt.getLayoutParams();
            if (aeVar.g()) {
                gwb a = aeVar.a();
                if (a != null) {
                    int max2;
                    int[] iArr2 = this.p;
                    this.p[1] = 0;
                    iArr2[0] = 0;
                    a.a(this, childAt, view, i, i2, this.p);
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
            a(1);
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        int i = 0;
        boolean z2 = false;
        while (i < childCount) {
            boolean a;
            View childAt = getChildAt(i);
            ae aeVar = (ae) childAt.getLayoutParams();
            if (aeVar.g()) {
                gwb a2 = aeVar.a();
                if (a2 != null) {
                    a = a2.a(this, childAt, view, f, f2, z) | z2;
                    i++;
                    z2 = a;
                }
            }
            a = z2;
            i++;
            z2 = a;
        }
        if (z2) {
            a(1);
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
            ae aeVar = (ae) childAt.getLayoutParams();
            if (aeVar.g()) {
                gwb a2 = aeVar.a();
                if (a2 != null) {
                    a = a2.a(this, childAt, view, f, f2) | z;
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
        return this.A.a();
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof ag) {
            ag agVar = (ag) parcelable;
            super.onRestoreInstanceState(agVar.e);
            SparseArray sparseArray = agVar.a;
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                int id = childAt.getId();
                gwb a = a(childAt).a();
                if (!(id == -1 || a == null)) {
                    Parcelable parcelable2 = (Parcelable) sparseArray.get(id);
                    if (parcelable2 != null) {
                        a.a(this, childAt, parcelable2);
                    }
                }
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable agVar = new ag(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            gwb a = ((ae) childAt.getLayoutParams()).a();
            if (!(id == -1 || a == null)) {
                Parcelable b = a.b(this, childAt);
                if (b != null) {
                    sparseArray.append(id, b);
                }
            }
        }
        agVar.a = sparseArray;
        return agVar;
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        gwb a = ((ae) view.getLayoutParams()).a();
        if (a == null || !a.a(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    private void f() {
        if (VERSION.SDK_INT >= 21) {
            if (oa.p(this)) {
                if (this.z == null) {
                    this.z = new fil(this);
                }
                oa.a(this, this.z);
                setSystemUiVisibility(1280);
                return;
            }
            oa.a(this, null);
        }
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        Object obj;
        this.h.clear();
        this.i.d();
        int childCount = getChildCount();
        for (i3 = 0; i3 < childCount; i3++) {
            int i4;
            Object childAt = getChildAt(i3);
            a((View) childAt).b(this, childAt);
            this.i.a(childAt);
            for (i4 = 0; i4 < childCount; i4++) {
                if (i4 != i3) {
                    Object childAt2 = getChildAt(i4);
                    if (a((View) childAt2).a(this, childAt2, childAt)) {
                        if (!this.i.b(childAt2)) {
                            this.i.a(childAt2);
                        }
                        this.i.a(childAt, childAt2);
                    }
                }
            }
        }
        this.h.addAll(this.i.e());
        Collections.reverse(this.h);
        a();
        int paddingLeft = getPaddingLeft();
        i3 = getPaddingTop();
        int paddingRight = getPaddingRight();
        childCount = getPaddingBottom();
        int d = oa.d(this);
        Object obj2;
        if (d == 1) {
            obj2 = 1;
        } else {
            obj2 = null;
        }
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        int i5 = paddingLeft + paddingRight;
        int i6 = i3 + childCount;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        childCount = getSuggestedMinimumHeight();
        if (this.e == null || !oa.p(this)) {
            obj = null;
        } else {
            obj = 1;
        }
        int size3 = this.h.size();
        int i7 = 0;
        int i8 = 0;
        int i9 = childCount;
        int i10 = suggestedMinimumWidth;
        while (i7 < size3) {
            int i11;
            View view = (View) this.h.get(i7);
            ae aeVar = (ae) view.getLayoutParams();
            int i12 = 0;
            if (aeVar.e >= 0 && mode != 0) {
                i4 = b(aeVar.e);
                i3 = mj.a(d(aeVar.c), d) & 7;
                if ((i3 == 3 && r9 == null) || (i3 == 5 && r9 != null)) {
                    i12 = Math.max(0, (size - paddingRight) - i4);
                } else if ((i3 == 5 && r9 == null) || (i3 == 3 && r9 != null)) {
                    i12 = Math.max(0, i4 - paddingLeft);
                }
            }
            if (obj == null || oa.p(view)) {
                i11 = i2;
                suggestedMinimumWidth = i;
            } else {
                i3 = this.e.b() + this.e.d();
                suggestedMinimumWidth = MeasureSpec.makeMeasureSpec(size - (this.e.a() + this.e.c()), mode);
                i11 = MeasureSpec.makeMeasureSpec(size2 - i3, mode2);
            }
            gwb a = aeVar.a();
            if (a == null || !a.a(this, view, suggestedMinimumWidth, i12, i11, 0)) {
                a(view, suggestedMinimumWidth, i12, i11, 0);
            }
            i12 = Math.max(i10, ((view.getMeasuredWidth() + i5) + aeVar.leftMargin) + aeVar.rightMargin);
            suggestedMinimumWidth = Math.max(i9, ((view.getMeasuredHeight() + i6) + aeVar.topMargin) + aeVar.bottomMargin);
            i7++;
            i8 = oa.a.a(i8, oa.f(view));
            i9 = suggestedMinimumWidth;
            i10 = i12;
        }
        setMeasuredDimension(oa.a(i10, i, -16777216 & i8), oa.a(i9, i2, i8 << 16));
    }
}
