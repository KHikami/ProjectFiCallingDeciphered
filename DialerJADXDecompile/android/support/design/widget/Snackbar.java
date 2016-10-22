package android.support.design.widget;

import a;
import aa;
import ad;
import ae;
import af;
import ah;
import ai;
import an;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import c;
import kn;
import v;
import x;
import z;

/* compiled from: PG */
public final class Snackbar {
    public static final Handler a;
    public final ViewGroup b;
    public final SnackbarLayout c;
    public int d;
    public final ah e;
    private final Context f;
    private final AccessibilityManager g;

    /* compiled from: PG */
    public class SnackbarLayout extends LinearLayout {
        public TextView a;
        public Button b;
        public ae c;
        public ad d;
        private int e;
        private int f;

        public SnackbarLayout(Context context) {
            this(context, null);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.s);
            this.e = obtainStyledAttributes.getDimensionPixelSize(a.t, -1);
            this.f = obtainStyledAttributes.getDimensionPixelSize(a.v, -1);
            if (obtainStyledAttributes.hasValue(a.u)) {
                kn.d((View) this, (float) obtainStyledAttributes.getDimensionPixelSize(a.u, 0));
            }
            obtainStyledAttributes.recycle();
            setClickable(true);
            LayoutInflater.from(context).inflate(2130968642, this);
            kn.a.f(this, 1);
            kn.c((View) this, 1);
        }

        protected void onFinishInflate() {
            super.onFinishInflate();
            this.a = (TextView) findViewById(2131493143);
            this.b = (Button) findViewById(2131493144);
        }

        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (this.e > 0 && getMeasuredWidth() > this.e) {
                i = MeasureSpec.makeMeasureSpec(this.e, 1073741824);
                super.onMeasure(i, i2);
            }
            int dimensionPixelSize = getResources().getDimensionPixelSize(2131427539);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(2131427538);
            int i3 = this.a.getLayout().getLineCount() > 1 ? 1 : 0;
            if (i3 == 0 || this.f <= 0 || this.b.getMeasuredWidth() <= this.f) {
                if (i3 == 0) {
                    dimensionPixelSize = dimensionPixelSize2;
                }
                if (a(0, dimensionPixelSize, dimensionPixelSize)) {
                    dimensionPixelSize = 1;
                }
                dimensionPixelSize = 0;
            } else {
                if (a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                    dimensionPixelSize = 1;
                }
                dimensionPixelSize = 0;
            }
            if (dimensionPixelSize != 0) {
                super.onMeasure(i, i2);
            }
        }

        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.c != null) {
                this.c.a();
            }
        }

        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
        }

        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.d != null) {
                this.d.a();
            }
        }

        private final boolean a(int i, int i2, int i3) {
            boolean z = false;
            if (i != getOrientation()) {
                setOrientation(i);
                z = true;
            }
            if (this.a.getPaddingTop() == i2 && this.a.getPaddingBottom() == i3) {
                return z;
            }
            View view = this.a;
            if (kn.a.y(view)) {
                kn.a.a(view, kn.a.v(view), i2, kn.a.w(view), i3);
            } else {
                view.setPadding(view.getPaddingLeft(), i2, view.getPaddingRight(), i3);
            }
            return true;
        }
    }

    static {
        a = new Handler(Looper.getMainLooper(), new v());
    }

    private Snackbar(ViewGroup viewGroup) {
        this.e = new ah(this);
        this.b = viewGroup;
        this.f = viewGroup.getContext();
        an.a(this.f);
        this.c = (SnackbarLayout) LayoutInflater.from(this.f).inflate(2130968641, this.b, false);
        this.g = (AccessibilityManager) this.f.getSystemService("accessibility");
    }

    public static Snackbar a(View view, CharSequence charSequence, int i) {
        Snackbar snackbar = new Snackbar(a(view));
        snackbar.c.a.setText(charSequence);
        snackbar.d = i;
        return snackbar;
    }

    public static Snackbar a(View view, int i, int i2) {
        return a(view, view.getResources().getText(i), 0);
    }

    private static ViewGroup a(View view) {
        ViewGroup viewGroup = null;
        View view2 = view;
        while (!(view2 instanceof CoordinatorLayout)) {
            if (view2 instanceof FrameLayout) {
                if (view2.getId() == 16908290) {
                    return (ViewGroup) view2;
                }
                viewGroup = (ViewGroup) view2;
            }
            if (view2 != null) {
                ViewParent parent = view2.getParent();
                if (parent instanceof View) {
                    view2 = (View) parent;
                    continue;
                } else {
                    view2 = null;
                    continue;
                }
            }
            if (view2 == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view2;
    }

    public final Snackbar a(int i, OnClickListener onClickListener) {
        CharSequence text = this.f.getText(i);
        TextView textView = this.c.b;
        if (TextUtils.isEmpty(text) || onClickListener == null) {
            textView.setVisibility(8);
            textView.setOnClickListener(null);
        } else {
            textView.setVisibility(0);
            textView.setText(text);
            textView.setOnClickListener(new x(this, onClickListener));
        }
        return this;
    }

    public final Snackbar a(int i) {
        this.c.b.setTextColor(i);
        return this;
    }

    public final void a() {
        af a = af.a();
        int i = this.d;
        ah ahVar = this.e;
        synchronized (a.a) {
            if (a.d(ahVar)) {
                a.c.b = i;
                a.b.removeCallbacksAndMessages(a.c);
                a.a(a.c);
                return;
            }
            if (a.e(ahVar)) {
                a.d.b = i;
            } else {
                a.d = new ai(i, ahVar);
            }
            if (a.c == null || !a.a(a.c, 4)) {
                a.c = null;
                a.b();
                return;
            }
        }
    }

    public final void b(int i) {
        af a = af.a();
        ah ahVar = this.e;
        synchronized (a.a) {
            if (a.d(ahVar)) {
                a.a(a.c, i);
            } else if (a.e(ahVar)) {
                a.a(a.d, i);
            }
        }
    }

    public final void b() {
        if (VERSION.SDK_INT >= 14) {
            kn.b(this.c, (float) this.c.getHeight());
            kn.l(this.c).c(0.0f).a(c.a).a(250).a(new z(this)).b();
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this.c.getContext(), 2131034132);
        loadAnimation.setInterpolator(c.a);
        loadAnimation.setDuration(250);
        loadAnimation.setAnimationListener(new aa(this));
        this.c.startAnimation(loadAnimation);
    }

    public final void c() {
        af a = af.a();
        ah ahVar = this.e;
        synchronized (a.a) {
            if (a.d(ahVar)) {
                a.a(a.c);
            }
        }
    }

    public final void c(int i) {
        af a = af.a();
        ah ahVar = this.e;
        synchronized (a.a) {
            if (a.d(ahVar)) {
                a.c = null;
                if (a.d != null) {
                    a.b();
                }
            }
        }
        ViewParent parent = this.c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.c);
        }
    }

    public final boolean d() {
        return !this.g.isEnabled();
    }
}
