package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: PG */
/* renamed from: yz */
public abstract class yz {
    wq d;
    public RecyclerView e;
    public zg f;
    public boolean g;
    public boolean h;
    boolean i;
    int j;
    int k;
    public int l;
    public int m;

    public abstract za a();

    public yz() {
        this.g = false;
        this.h = false;
        this.i = true;
    }

    public final void a(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.e = null;
            this.d = null;
            this.l = 0;
            this.m = 0;
        } else {
            this.e = recyclerView;
            this.d = recyclerView.e;
            this.l = recyclerView.getWidth();
            this.m = recyclerView.getHeight();
        }
        this.j = 1073741824;
        this.k = 1073741824;
    }

    public final void a(int i, int i2) {
        this.l = MeasureSpec.getSize(i);
        this.j = MeasureSpec.getMode(i);
        if (this.j == 0 && !RecyclerView.b) {
            this.l = 0;
        }
        this.m = MeasureSpec.getSize(i2);
        this.k = MeasureSpec.getMode(i2);
        if (this.k == 0 && !RecyclerView.b) {
            this.m = 0;
        }
    }

    public final void b(int i, int i2) {
        int h = h();
        if (h == 0) {
            this.e.b(i, i2);
            return;
        }
        int i3;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = oe.INVALID_ID;
        int i7 = oe.INVALID_ID;
        int i8 = 0;
        while (i8 < h) {
            View e = e(i8);
            e.getLayoutParams();
            Rect rect = this.e.h;
            za zaVar = (za) e.getLayoutParams();
            Rect rect2 = zaVar.b;
            rect.set((e.getLeft() - rect2.left) - zaVar.leftMargin, (e.getTop() - rect2.top) - zaVar.topMargin, (e.getRight() + rect2.right) + zaVar.rightMargin, zaVar.bottomMargin + (e.getBottom() + rect2.bottom));
            if (rect.left < i4) {
                i3 = rect.left;
            } else {
                i3 = i4;
            }
            if (rect.right > i6) {
                i4 = rect.right;
            } else {
                i4 = i6;
            }
            if (rect.top < i5) {
                i6 = rect.top;
            } else {
                i6 = i5;
            }
            if (rect.bottom > i7) {
                i5 = rect.bottom;
            } else {
                i5 = i7;
            }
            i8++;
            i7 = i5;
            i5 = i6;
            i6 = i4;
            i4 = i3;
        }
        this.e.h.set(i4, i5, i6, i7);
        Rect rect3 = this.e.h;
        i4 = (rect3.width() + i()) + k();
        i3 = (rect3.height() + j()) + l();
        this.e.setMeasuredDimension(yz.a(i, i4, kn.j(this.e)), yz.a(i2, i3, kn.k(this.e)));
    }

    public final void g() {
        if (this.e != null) {
            this.e.requestLayout();
        }
    }

    public static int a(int i, int i2, int i3) {
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        switch (mode) {
            case oe.INVALID_ID /*-2147483648*/:
                return Math.min(size, Math.max(i2, i3));
            case 1073741824:
                return size;
            default:
                return Math.max(i2, i3);
        }
    }

    public void a(String str) {
        if (this.e != null) {
            this.e.a(str);
        }
    }

    public boolean f() {
        return false;
    }

    public void a(RecyclerView recyclerView, zc zcVar) {
    }

    public void a(zc zcVar, zi ziVar) {
        Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
    }

    public void a(zi ziVar) {
    }

    public int a(int i, zc zcVar, zi ziVar) {
        return 0;
    }

    public int b(int i, zc zcVar, zi ziVar) {
        return 0;
    }

    public boolean c() {
        return false;
    }

    public boolean d() {
        return false;
    }

    public void b(int i) {
    }

    final void a(View view, int i, boolean z) {
        zk b = RecyclerView.b(view);
        if (z || b.m()) {
            this.e.f.b(b);
        } else {
            this.e.f.c(b);
        }
        za zaVar = (za) view.getLayoutParams();
        if (b.g() || b.e()) {
            if (b.e()) {
                b.f();
            } else {
                b.h();
            }
            this.d.a(view, i, view.getLayoutParams(), false);
        } else if (view.getParent() == this.e) {
            int c = this.d.c(view);
            if (i == -1) {
                i = this.d.a();
            }
            if (c == -1) {
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.e.indexOfChild(view));
            } else if (c != i) {
                yz yzVar = this.e.k;
                View e = yzVar.e(c);
                if (e == null) {
                    throw new IllegalArgumentException("Cannot move a child from non-existing index:" + c);
                }
                yzVar.d(c);
                za zaVar2 = (za) e.getLayoutParams();
                zk b2 = RecyclerView.b(e);
                if (b2.m()) {
                    yzVar.e.f.b(b2);
                } else {
                    yzVar.e.f.c(b2);
                }
                yzVar.d.a(e, i, zaVar2, b2.m());
            }
        } else {
            this.d.a(view, i, false);
            zaVar.c = true;
            if (this.f != null && this.f.e) {
                zg zgVar = this.f;
                if (RecyclerView.c(view) == zgVar.a) {
                    zgVar.f = view;
                }
            }
        }
        if (zaVar.d) {
            b.a.invalidate();
            zaVar.d = false;
        }
    }

    public final void c(int i) {
        if (e(i) != null) {
            wq wqVar = this.d;
            int a = wqVar.a(i);
            View b = wqVar.a.b(a);
            if (b != null) {
                if (wqVar.b.d(a)) {
                    wqVar.b(b);
                }
                wqVar.a.a(a);
            }
        }
    }

    public static int a(View view) {
        return ((za) view.getLayoutParams()).a.c();
    }

    public View a(int i) {
        int h = h();
        for (int i2 = 0; i2 < h; i2++) {
            View e = e(i2);
            zk b = RecyclerView.b(e);
            if (b != null && b.c() == i && !b.b() && (this.e.A.g || !b.m())) {
                return e;
            }
        }
        return null;
    }

    public final void d(int i) {
        e(i);
        this.d.d(i);
    }

    public final void a(int i, zc zcVar) {
        View e = e(i);
        c(i);
        zcVar.a(e);
    }

    public final int h() {
        return this.d != null ? this.d.a() : 0;
    }

    public final View e(int i) {
        return this.d != null ? this.d.b(i) : null;
    }

    public final int i() {
        return this.e != null ? this.e.getPaddingLeft() : 0;
    }

    public final int j() {
        return this.e != null ? this.e.getPaddingTop() : 0;
    }

    public final int k() {
        return this.e != null ? this.e.getPaddingRight() : 0;
    }

    public final int l() {
        return this.e != null ? this.e.getPaddingBottom() : 0;
    }

    public final void a(zc zcVar) {
        int size = zcVar.a.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((zk) zcVar.a.get(i)).a;
            zk b = RecyclerView.b(view);
            if (!b.b()) {
                b.a(false);
                if (b.n()) {
                    this.e.removeDetachedView(view, false);
                }
                if (this.e.y != null) {
                    this.e.y.c(b);
                }
                b.a(true);
                zcVar.b(view);
            }
        }
        zcVar.a.clear();
        if (zcVar.b != null) {
            zcVar.b.clear();
        }
        if (size > 0) {
            this.e.invalidate();
        }
    }

    static boolean b(int i, int i2, int i3) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        switch (mode) {
            case oe.INVALID_ID /*-2147483648*/:
                if (size >= i) {
                    return true;
                }
                return false;
            case rl.c /*0*/:
                return true;
            case 1073741824:
                if (size == i) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    public static int a(int i, int i2, int i3, int i4, boolean z) {
        int i5 = 0;
        int max = Math.max(0, i - i3);
        if (z) {
            if (i4 >= 0) {
                i5 = 1073741824;
                max = i4;
            } else if (i4 == -1) {
                switch (i2) {
                    case oe.INVALID_ID /*-2147483648*/:
                    case 1073741824:
                        i5 = i2;
                        break;
                    default:
                        max = 0;
                        break;
                }
            } else {
                if (i4 == -2) {
                    max = 0;
                }
                max = 0;
            }
        } else if (i4 >= 0) {
            i5 = 1073741824;
            max = i4;
        } else if (i4 == -1) {
            i5 = i2;
        } else {
            if (i4 == -2) {
                if (i2 == oe.INVALID_ID || i2 == 1073741824) {
                    i5 = oe.INVALID_ID;
                }
            }
            max = 0;
        }
        return MeasureSpec.makeMeasureSpec(max, i5);
    }

    public static int b(View view) {
        Rect rect = ((za) view.getLayoutParams()).b;
        return rect.right + (view.getMeasuredWidth() + rect.left);
    }

    public static int c(View view) {
        Rect rect = ((za) view.getLayoutParams()).b;
        return rect.bottom + (view.getMeasuredHeight() + rect.top);
    }

    public final void a(View view, boolean z, Rect rect) {
        Rect rect2 = ((za) view.getLayoutParams()).b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, rect2.bottom + view.getHeight());
        if (this.e != null) {
            Matrix h = kn.a.h(view);
            if (!(h == null || h.isIdentity())) {
                RectF rectF = this.e.i;
                rectF.set(rect);
                h.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final int d(View view) {
        return view.getLeft() - ((za) view.getLayoutParams()).b.left;
    }

    public final int e(View view) {
        return view.getTop() - ((za) view.getLayoutParams()).b.top;
    }

    public final int f(View view) {
        return ((za) view.getLayoutParams()).b.right + view.getRight();
    }

    public final int g(View view) {
        return ((za) view.getLayoutParams()).b.bottom + view.getBottom();
    }

    public View c(int i, zc zcVar, zi ziVar) {
        return null;
    }

    public int d(zi ziVar) {
        return 0;
    }

    public int b(zi ziVar) {
        return 0;
    }

    public int f(zi ziVar) {
        return 0;
    }

    public int e(zi ziVar) {
        return 0;
    }

    public int c(zi ziVar) {
        return 0;
    }

    public int g(zi ziVar) {
        return 0;
    }

    public final void c(int i, int i2) {
        this.e.b(i, i2);
    }

    public Parcelable b() {
        return null;
    }

    public void a(Parcelable parcelable) {
    }

    public final void b(zc zcVar) {
        for (int h = h() - 1; h >= 0; h--) {
            if (!RecyclerView.b(e(h)).b()) {
                a(h, zcVar);
            }
        }
    }

    public void a(AccessibilityEvent accessibilityEvent) {
        boolean z = true;
        zc zcVar = this.e.c;
        zi ziVar = this.e.A;
        nj a = ml.a(accessibilityEvent);
        if (this.e != null) {
            if (!(kn.b(this.e, 1) || kn.b(this.e, -1) || kn.a(this.e, -1) || kn.a(this.e, 1))) {
                z = false;
            }
            a.a(z);
            if (this.e.j != null) {
                a.a(this.e.j.a());
            }
        }
    }

    public final void b(RecyclerView recyclerView) {
        a(MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public boolean e() {
        return false;
    }
}
