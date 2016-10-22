package android.support.design.widget;

import a;
import ajk;
import al;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import ao;
import ap;
import as;
import com.google.android.apps.hangouts.hangout.StressMode;
import eid;
import jhz;
import jrh;
import ljl;
import o;
import oa;
import r;
import tz;

public final class Snackbar {
    public static final Handler a;
    public final ViewGroup b;
    public final SnackbarLayout c;
    public final a d;
    private final AccessibilityManager e;

    public class SnackbarLayout extends LinearLayout {
        private TextView a;
        private Button b;
        private int c;
        private int d;
        private ljl e;
        private jrh f;

        public SnackbarLayout(Context context) {
            this(context, null);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.ay);
            this.c = obtainStyledAttributes.getDimensionPixelSize(o.az, -1);
            this.d = obtainStyledAttributes.getDimensionPixelSize(o.aB, -1);
            if (obtainStyledAttributes.hasValue(o.aA)) {
                oa.f(this, (float) obtainStyledAttributes.getDimensionPixelSize(o.aA, 0));
            }
            obtainStyledAttributes.recycle();
            setClickable(true);
            LayoutInflater.from(context).inflate(StressMode.f, this);
            oa.d(this, 1);
            oa.c(this, 1);
            oa.a(this, true);
            oa.a(this, new jhz(this));
        }

        protected void onFinishInflate() {
            super.onFinishInflate();
            this.a = (TextView) findViewById(ajk.f);
            this.b = (Button) findViewById(ajk.e);
        }

        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (this.c > 0 && getMeasuredWidth() > this.c) {
                i = MeasureSpec.makeMeasureSpec(this.c, 1073741824);
                super.onMeasure(i, i2);
            }
            int dimensionPixelSize = getResources().getDimensionPixelSize(tz.h);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(tz.g);
            int i3 = this.a.getLayout().getLineCount() > 1 ? 1 : 0;
            if (i3 == 0 || this.d <= 0 || this.b.getMeasuredWidth() <= this.d) {
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

        public void a(int i, int i2) {
            oa.c(this.a, 0.0f);
            oa.m(this.a).a(1.0f).a(180).b(70).c();
            if (this.b.getVisibility() == 0) {
                oa.c(this.b, 0.0f);
                oa.m(this.b).a(1.0f).a(180).b(70).c();
            }
        }

        public void b(int i, int i2) {
            oa.c(this.a, 1.0f);
            oa.m(this.a).a(0.0f).a(180).b(0).c();
            if (this.b.getVisibility() == 0) {
                oa.c(this.b, 1.0f);
                oa.m(this.b).a(0.0f).a(180).b(0).c();
            }
        }

        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.e != null) {
                this.e.a();
            }
        }

        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            oa.o(this);
        }

        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.f != null) {
                this.f.a();
            }
        }

        public void a(ljl ljl) {
            this.e = ljl;
        }

        public void a(jrh jrh) {
            this.f = jrh;
        }

        private boolean a(int i, int i2, int i3) {
            boolean z = false;
            if (i != getOrientation()) {
                setOrientation(i);
                z = true;
            }
            if (this.a.getPaddingTop() == i2 && this.a.getPaddingBottom() == i3) {
                return z;
            }
            View view = this.a;
            if (oa.a.y(view)) {
                oa.a.a(view, oa.g(view), i2, oa.h(view), i3);
            } else {
                view.setPadding(view.getPaddingLeft(), i2, view.getPaddingRight(), i3);
            }
            return true;
        }
    }

    static {
        a = new Handler(Looper.getMainLooper(), new al());
    }

    public boolean a() {
        return as.a().e(this.d);
    }

    public void b() {
        if (VERSION.SDK_INT >= 14) {
            oa.b(this.c, (float) this.c.getHeight());
            oa.m(this.c).c(0.0f).a(r.b).a(250).a(new ao(this)).c();
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this.c.getContext(), eid.d);
        loadAnimation.setInterpolator(r.b);
        loadAnimation.setDuration(250);
        loadAnimation.setAnimationListener(new ap(this));
        this.c.startAnimation(loadAnimation);
    }

    public void c() {
        as.a().b(this.d);
    }

    public void a(int i) {
        as.a().a(this.d);
        if (VERSION.SDK_INT < 11) {
            this.c.setVisibility(8);
        }
        ViewParent parent = this.c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.c);
        }
    }

    public boolean d() {
        return !this.e.isEnabled();
    }
}
