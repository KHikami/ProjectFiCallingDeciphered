package defpackage;

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
    private static final StyleSpan b = new StyleSpan(1);
    private static ForegroundColorSpan c;
    private static AccessibilityManager d;
    public final ObjectAnimator a;
    private final dws e;
    private boolean f;
    private gnl g;

    public gnk(Context context) {
        this(context, null);
    }

    public gnk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = (dws) jyn.a(context, dws.class);
        if (c == null) {
            c = new ForegroundColorSpan(context.getApplicationContext().getResources().getColor(gwb.dP));
        }
        if (d == null) {
            d = (AccessibilityManager) getContext().getSystemService("accessibility");
        }
        this.a = ObjectAnimator.ofFloat(null, "alpha", new float[]{0.0f, 1.0f});
        this.a.setInterpolator(new bbx(bcb.a));
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
    }

    public void a(gnl gnl) {
        this.g = gnl;
    }

    public gnl j() {
        return this.g;
    }

    public boolean isChecked() {
        return this.f;
    }

    public void k() {
        a(false, false);
    }

    public final void setChecked(boolean z) {
        a(z, true);
    }

    public void a(boolean z, boolean z2) {
        if (this.f != z) {
            this.f = z;
            a(z2);
            if (this.g != null) {
                this.g.a(this, this.f);
            }
        }
    }

    protected void a(boolean z) {
        int i;
        int i2 = 0;
        View findViewById = findViewById(ba.W);
        if (findViewById instanceof Checkable) {
            ((Checkable) findViewById).setChecked(this.f);
        }
        a(findViewById, z);
        TextView textView = (TextView) findViewById(ba.dy);
        if (this.f) {
            i = 1;
        } else {
            i = 0;
        }
        textView.setTypeface(null, i);
        textView.setTextColor(this.f ? -872415232 : -1711276032);
        if (this.f) {
            i2 = -1;
        }
        setBackgroundColor(i2);
    }

    protected void a(View view, boolean z) {
        float f = 1.0f;
        this.a.cancel();
        if (z) {
            this.a.setTarget(view);
            ObjectAnimator objectAnimator = this.a;
            float[] fArr = new float[2];
            fArr[0] = view.getAlpha();
            fArr[1] = this.f ? 1.0f : 0.0f;
            objectAnimator.setFloatValues(fArr);
            float alpha = view.getAlpha();
            if (!this.f) {
                f = 0.0f;
            }
            this.a.setDuration((long) ((int) (Math.abs(alpha - f) * 200.0f)));
            this.a.start();
            return;
        }
        if (!this.f) {
            f = 0.0f;
        }
        view.setAlpha(f);
    }

    public void toggle() {
        a(!this.f, true);
    }

    protected void a(TextView textView, String str, SpannableStringBuilder spannableStringBuilder, String str2, bji bji) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (d.isEnabled() && d.isTouchExplorationEnabled())) {
            textView.setText(str);
            return;
        }
        int a = this.e.a(str, str2, bji);
        if (a >= 0) {
            spannableStringBuilder.clear();
            spannableStringBuilder.append(str);
            int length = str2.length() + a;
            spannableStringBuilder.setSpan(b, a, length, 0);
            spannableStringBuilder.setSpan(c, a, length, 0);
            textView.setText(spannableStringBuilder);
            return;
        }
        textView.setText(str);
    }
}
