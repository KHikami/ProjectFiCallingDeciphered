import android.content.Context;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;

public final class cyi implements cxp {
    public Animation a(Context context, long j) {
        int integer = context.getResources().getInteger(gwb.pI);
        int integer2 = context.getResources().getInteger(gwb.pJ);
        Animation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new LinearInterpolator());
        alphaAnimation.setDuration((long) integer);
        Animation scaleAnimation = new ScaleAnimation(0.5f, 1.0f, 0.5f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(new rl());
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setDuration((long) integer2);
        Animation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) context.getResources().getDimensionPixelSize(gwb.px), 0.0f);
        translateAnimation.setInterpolator(new rl());
        translateAnimation.setDuration((long) integer2);
        Animation animationSet = new AnimationSet(false);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.setStartOffset(j);
        return animationSet;
    }
}
