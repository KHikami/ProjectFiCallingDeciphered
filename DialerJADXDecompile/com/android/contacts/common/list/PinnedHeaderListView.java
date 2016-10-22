package com.android.contacts.common.list;

import adf;
import aeo;
import aep;
import aix;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ListAdapter;

/* compiled from: PG */
public class PinnedHeaderListView extends adf implements OnScrollListener, OnItemSelectedListener {
    public aeo[] a;
    public boolean b;
    public long c;
    private aep d;
    private int e;
    private RectF f;
    private OnScrollListener g;
    private OnItemSelectedListener h;
    private int i;
    private boolean j;
    private int k;
    private boolean l;
    private int m;
    private int n;

    public PinnedHeaderListView(Context context) {
        this(context, null, 16842868);
    }

    public PinnedHeaderListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public PinnedHeaderListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = new RectF();
        this.b = false;
        this.j = false;
        this.k = 20;
        super.setOnScrollListener(this);
        super.setOnItemSelectedListener(this);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.m = getPaddingStart();
        this.n = ((i3 - i) - this.m) - getPaddingEnd();
    }

    public void setAdapter(ListAdapter listAdapter) {
        this.d = (aep) listAdapter;
        super.setAdapter(listAdapter);
    }

    public void setOnScrollListener(OnScrollListener onScrollListener) {
        this.g = onScrollListener;
        super.setOnScrollListener(this);
    }

    public void setOnItemSelectedListener(OnItemSelectedListener onItemSelectedListener) {
        this.h = onItemSelectedListener;
        super.setOnItemSelectedListener(this);
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int i4 = 0;
        if (this.d != null) {
            int c = this.d.c();
            if (c != this.e) {
                this.e = c;
                if (this.a == null) {
                    this.a = new aeo[this.e];
                } else if (this.a.length < this.e) {
                    Object obj = this.a;
                    this.a = new aeo[this.e];
                    System.arraycopy(obj, 0, this.a, 0, obj.length);
                }
            }
            while (i4 < this.e) {
                if (this.a[i4] == null) {
                    this.a[i4] = new aeo();
                }
                this.a[i4].a = this.d.a(i4, this.a[i4].a, this);
                i4++;
            }
            this.c = System.currentTimeMillis() + ((long) this.k);
            this.d.a(this);
            b();
        }
        if (this.g != null) {
            this.g.onScroll(this, i, i2, i3);
        }
    }

    protected float getTopFadingEdgeStrength() {
        return this.e > 0 ? 0.0f : super.getTopFadingEdgeStrength();
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        this.i = i;
        if (this.g != null) {
            this.g.onScrollStateChanged(this, i);
        }
    }

    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        int i2 = 0;
        int height = getHeight();
        int i3 = 0;
        while (i2 < this.e) {
            aeo aeo = this.a[i2];
            if (aeo.b) {
                if (aeo.f == 0) {
                    i3 = aeo.c + aeo.d;
                } else if (aeo.f == 1) {
                    i2 = aeo.c;
                    break;
                }
            }
            i2++;
        }
        i2 = height;
        View selectedView = getSelectedView();
        if (selectedView != null) {
            if (selectedView.getTop() < i3) {
                setSelectionFromTop(i, i3);
            } else if (selectedView.getBottom() > i2) {
                setSelectionFromTop(i, i2 - selectedView.getHeight());
            }
        }
        if (this.h != null) {
            this.h.onItemSelected(adapterView, view, i, j);
        }
    }

    public void onNothingSelected(AdapterView adapterView) {
        if (this.h != null) {
            this.h.onNothingSelected(adapterView);
        }
    }

    public final int a(int i) {
        b(i);
        return this.a[i].a.getHeight();
    }

    public final void a(int i, boolean z) {
        aeo aeo = this.a[i];
        if (aeo.b && ((z || aeo.g) && aeo.f == 1)) {
            aeo.i = aeo.c;
            if (!aeo.g) {
                aeo.b = true;
                aeo.j = getBottom() + aeo.d;
            }
            aeo.g = true;
            aeo.k = this.c;
            aeo.h = false;
            return;
        }
        aeo.b = false;
    }

    public final void b(int i) {
        View view = this.a[i].a;
        if (view.isLayoutRequested()) {
            int makeMeasureSpec;
            int makeMeasureSpec2;
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null || layoutParams.width <= 0) {
                makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.n, 1073741824);
            } else {
                makeMeasureSpec = MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824);
            }
            if (layoutParams == null || layoutParams.height <= 0) {
                makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
            } else {
                makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            makeMeasureSpec2 = view.getMeasuredHeight();
            this.a[i].d = makeMeasureSpec2;
            view.layout(0, 0, view.getMeasuredWidth(), makeMeasureSpec2);
        }
    }

    public final int a() {
        int i = this.e;
        while (true) {
            i--;
            if (i < 0) {
                return 0;
            }
            aeo aeo = this.a[i];
            if (aeo.b && aeo.f == 0) {
                return aeo.c + aeo.d;
            }
        }
    }

    public final int c(int i) {
        do {
            int pointToPosition = pointToPosition(getPaddingLeft() + 1, i);
            if (pointToPosition != -1) {
                return pointToPosition;
            }
            i--;
        } while (i > 0);
        return 0;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i = 0;
        this.j = false;
        if (super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        if (this.i != 0) {
            return false;
        }
        int y = (int) motionEvent.getY();
        int x = (int) motionEvent.getX();
        int i2 = this.e;
        while (true) {
            int i3 = i2 - 1;
            if (i3 >= 0) {
                aeo aeo = this.a[i3];
                int paddingLeft = getPaddingLeft();
                if (aeo.b && aeo.c <= y && aeo.c + aeo.d > y && x >= paddingLeft && aeo.a.getWidth() + paddingLeft >= x) {
                    break;
                }
                i2 = i3;
            } else {
                return false;
            }
        }
        this.j = true;
        if (!this.b || motionEvent.getAction() != 0) {
            return true;
        }
        if (this.d == null) {
            return false;
        }
        y = this.d.m(i3);
        if (y == -1) {
            return false;
        }
        for (i2 = 0; i2 < i3; i2++) {
            aeo aeo2 = this.a[i2];
            if (aeo2.b) {
                i += aeo2.d;
            }
        }
        smoothScrollToPositionFromTop(getHeaderViewsCount() + y, i, 100);
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.j) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() != 1) {
            return true;
        }
        this.j = false;
        return true;
    }

    private final void b() {
        int i = 0;
        this.l = false;
        while (i < this.e) {
            if (this.a[i].g) {
                this.l = true;
                invalidate();
                return;
            }
            i++;
        }
    }

    protected void dispatchDraw(Canvas canvas) {
        int i;
        int i2 = 0;
        long currentTimeMillis = this.l ? System.currentTimeMillis() : 0;
        getBottom();
        int i3 = 0;
        for (i = 0; i < this.e; i++) {
            if (this.a[i].b) {
                i3 = 1;
            }
        }
        if (i3 != 0) {
            canvas.save();
        }
        super.dispatchDraw(canvas);
        if (i3 != 0) {
            aeo aeo;
            canvas.restore();
            if (this.e > 0 && getFirstVisiblePosition() == 0) {
                View childAt = getChildAt(0);
                aeo = this.a[0];
                if (aeo != null) {
                    aeo.c = Math.max(aeo.c, childAt != null ? childAt.getTop() : 0);
                }
            }
            i = this.e;
            while (true) {
                i--;
                if (i < 0) {
                    break;
                }
                aeo = this.a[i];
                if (aeo.b && (aeo.f == 0 || aeo.f == 2)) {
                    a(canvas, aeo, currentTimeMillis);
                }
            }
            while (i2 < this.e) {
                aeo aeo2 = this.a[i2];
                if (aeo2.b && aeo2.f == 1) {
                    a(canvas, aeo2, currentTimeMillis);
                }
                i2++;
            }
        }
        b();
    }

    private final void a(Canvas canvas, aeo aeo, long j) {
        int i;
        if (aeo.g) {
            i = (int) (aeo.k - j);
            if (i <= 0) {
                aeo.c = aeo.j;
                aeo.b = aeo.h;
                aeo.g = false;
            } else {
                aeo.c = ((i * (aeo.i - aeo.j)) / this.k) + aeo.j;
            }
        }
        if (aeo.b) {
            View view = aeo.a;
            int save = canvas.save();
            if (aix.b(this)) {
                i = (getWidth() - this.m) - view.getWidth();
            } else {
                i = this.m;
            }
            canvas.translate((float) i, (float) aeo.c);
            if (aeo.f == 2) {
                this.f.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
                canvas.saveLayerAlpha(this.f, aeo.e, 31);
            }
            view.draw(canvas);
            canvas.restoreToCount(save);
        }
    }
}
