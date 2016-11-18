package defpackage;

import android.content.Context;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

public final class cyj implements cxp {
    private final float a = 1.0f;
    private final float b = 0.0f;

    public cyj(float f, float f2) {
    }

    public Animation a(Context context, long j) {
        Animation alphaAnimation = new AlphaAnimation(this.a, this.b);
        alphaAnimation.setInterpolator(new rk());
        alphaAnimation.setDuration((long) context.getResources().getInteger(gwb.pH));
        return alphaAnimation;
    }
}
