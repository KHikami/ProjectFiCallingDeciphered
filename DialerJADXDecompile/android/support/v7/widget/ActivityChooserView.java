package android.support.v7.widget;

import aah;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import buf;
import iv;
import rk;
import up;
import uu;
import uv;
import uw;
import ux;
import uy;
import uz;
import xp;
import xx;

/* compiled from: PG */
public final class ActivityChooserView extends ViewGroup {
    public final uy a;
    public final xp b;
    public final Drawable c;
    public final FrameLayout d;
    final ImageView e;
    public final FrameLayout f;
    public final ImageView g;
    public iv h;
    final DataSetObserver i;
    public boolean j;
    public int k;
    public int l;
    private final uz m;
    private final int n;
    private final OnGlobalLayoutListener o;
    private xx p;
    private boolean q;

    /* compiled from: PG */
    public class InnerLayout extends xp {
        private static final int[] a;

        static {
            a = new int[]{16842964};
        }

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            aah a = aah.a(context, attributeSet, a);
            setBackgroundDrawable(a.a(0));
            a.a.recycle();
        }
    }

    public ActivityChooserView(Context context) {
        this(context, null);
    }

    private ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    private ActivityChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.i = new uu(this);
        this.o = new uv(this);
        this.k = 4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rk.D, 0, 0);
        this.k = obtainStyledAttributes.getInt(rk.F, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(rk.E);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(buf.bM, this, true);
        this.m = new uz(this);
        this.b = (xp) findViewById(buf.bk);
        this.c = this.b.getBackground();
        this.f = (FrameLayout) findViewById(buf.br);
        this.f.setOnClickListener(this.m);
        this.f.setOnLongClickListener(this.m);
        this.g = (ImageView) this.f.findViewById(buf.bu);
        FrameLayout frameLayout = (FrameLayout) findViewById(buf.bs);
        frameLayout.setOnClickListener(this.m);
        frameLayout.setOnTouchListener(new uw(this, frameLayout));
        this.d = frameLayout;
        this.e = (ImageView) frameLayout.findViewById(buf.bu);
        this.e.setImageDrawable(drawable);
        this.a = new uy(this);
        this.a.registerDataSetObserver(new ux(this));
        Resources resources = context.getResources();
        this.n = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(buf.an));
    }

    public final boolean a() {
        if (d().q.isShowing() || !this.q) {
            return false;
        }
        this.j = false;
        a(this.k);
        return true;
    }

    public final void a(int i) {
        if (this.a.a == null) {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.o);
        boolean z = this.f.getVisibility() == 0;
        int a = this.a.a.a();
        int i2;
        if (z) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (i == Integer.MAX_VALUE || a <= r3 + i) {
            this.a.a(false);
            this.a.a(i);
        } else {
            this.a.a(true);
            this.a.a(i - 1);
        }
        xx d = d();
        if (!d.q.isShowing()) {
            if (this.j || !z) {
                this.a.a(true, z);
            } else {
                this.a.a(false, false);
            }
            d.b(Math.min(this.a.a(), this.n));
            d.b();
            if (this.h != null) {
                this.h.a(true);
            }
            d.e.setContentDescription(getContext().getString(buf.cc));
        }
    }

    public final boolean c() {
        return d().q.isShowing();
    }

    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        up upVar = this.a.a;
        if (upVar != null) {
            upVar.registerObserver(this.i);
        }
        this.q = true;
    }

    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        up upVar = this.a.a;
        if (upVar != null) {
            upVar.unregisterObserver(this.i);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.o);
        }
        if (c()) {
            b();
        }
        this.q = false;
    }

    protected final void onMeasure(int i, int i2) {
        View view = this.b;
        if (this.f.getVisibility() != 0) {
            i2 = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.b.layout(0, 0, i3 - i, i4 - i2);
        if (!c()) {
            b();
        }
    }

    public final xx d() {
        if (this.p == null) {
            this.p = new xx(getContext());
            this.p.a(this.a);
            this.p.k = this;
            this.p.a(true);
            this.p.l = this.m;
            this.p.a(this.m);
        }
        return this.p;
    }

    public final boolean b() {
        if (d().q.isShowing()) {
            d().c();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.o);
            }
        }
        return true;
    }
}
