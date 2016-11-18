package p000;

import android.content.Context;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

public final class cyj implements cxp {
    private final float f9331a = 1.0f;
    private final float f9332b = 0.0f;

    public cyj(float f, float f2) {
    }

    public Animation mo1472a(Context context, long j) {
        Animation alphaAnimation = new AlphaAnimation(this.f9331a, this.f9332b);
        alphaAnimation.setInterpolator(new rk());
        alphaAnimation.setDuration((long) context.getResources().getInteger(gwb.pH));
        return alphaAnimation;
    }
}
