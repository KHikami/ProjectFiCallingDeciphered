package p000;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.TextView;

public class gnk extends FrameLayout implements Checkable {
    private static final StyleSpan f15707b = new StyleSpan(1);
    private static ForegroundColorSpan f15708c;
    private static AccessibilityManager f15709d;
    public final ObjectAnimator f15710a;
    private final dws f15711e;
    private boolean f15712f;
    private gnl f15713g;

    public gnk(Context context) {
        this(context, null);
    }

    public gnk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15711e = (dws) jyn.m25426a(context, dws.class);
        if (f15708c == null) {
            f15708c = new ForegroundColorSpan(context.getApplicationContext().getResources().getColor(gwb.dP));
        }
        if (f15709d == null) {
            f15709d = (AccessibilityManager) getContext().getSystemService("accessibility");
        }
        this.f15710a = ObjectAnimator.ofFloat(null, "alpha", new float[]{0.0f, 1.0f});
        this.f15710a.setInterpolator(new bbx(bcb.f2972a));
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo2310a(false);
    }

    public void m18165a(gnl gnl) {
        this.f15713g = gnl;
    }

    public gnl m18168j() {
        return this.f15713g;
    }

    public boolean isChecked() {
        return this.f15712f;
    }

    public void mo2312k() {
        mo2311a(false, false);
    }

    public final void setChecked(boolean z) {
        mo2311a(z, true);
    }

    public void mo2311a(boolean z, boolean z2) {
        if (this.f15712f != z) {
            this.f15712f = z;
            mo2310a(z2);
            if (this.f15713g != null) {
                this.f15713g.m18183a(this, this.f15712f);
            }
        }
    }

    protected void mo2310a(boolean z) {
        int i;
        int i2 = 0;
        View findViewById = findViewById(ba.f2684W);
        if (findViewById instanceof Checkable) {
            ((Checkable) findViewById).setChecked(this.f15712f);
        }
        m18163a(findViewById, z);
        TextView textView = (TextView) findViewById(ba.dy);
        if (this.f15712f) {
            i = 1;
        } else {
            i = 0;
        }
        textView.setTypeface(null, i);
        textView.setTextColor(this.f15712f ? -872415232 : -1711276032);
        if (this.f15712f) {
            i2 = -1;
        }
        setBackgroundColor(i2);
    }

    protected void m18163a(View view, boolean z) {
        float f = 1.0f;
        this.f15710a.cancel();
        if (z) {
            this.f15710a.setTarget(view);
            ObjectAnimator objectAnimator = this.f15710a;
            float[] fArr = new float[2];
            fArr[0] = view.getAlpha();
            fArr[1] = this.f15712f ? 1.0f : 0.0f;
            objectAnimator.setFloatValues(fArr);
            float alpha = view.getAlpha();
            if (!this.f15712f) {
                f = 0.0f;
            }
            this.f15710a.setDuration((long) ((int) (Math.abs(alpha - f) * 200.0f)));
            this.f15710a.start();
            return;
        }
        if (!this.f15712f) {
            f = 0.0f;
        }
        view.setAlpha(f);
    }

    public void toggle() {
        mo2311a(!this.f15712f, true);
    }

    protected void m18164a(TextView textView, String str, SpannableStringBuilder spannableStringBuilder, String str2, bji bji) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (f15709d.isEnabled() && f15709d.isTouchExplorationEnabled())) {
            textView.setText(str);
            return;
        }
        int a = this.f15711e.mo1745a(str, str2, bji);
        if (a >= 0) {
            spannableStringBuilder.clear();
            spannableStringBuilder.append(str);
            int length = str2.length() + a;
            spannableStringBuilder.setSpan(f15707b, a, length, 0);
            spannableStringBuilder.setSpan(f15708c, a, length, 0);
            textView.setText(spannableStringBuilder);
            return;
        }
        textView.setText(str);
    }
}
