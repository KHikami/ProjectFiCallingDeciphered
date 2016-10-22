import android.animation.ObjectAnimator;
import com.google.android.apps.hangouts.views.MessageListItemView;

public final class gpr implements Runnable {
    final /* synthetic */ MessageListItemView a;

    public gpr(MessageListItemView messageListItemView) {
        this.a = messageListItemView;
    }

    public void run() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.a.a, "showPercentage", new float[]{1.0f, 0.0f});
        ofFloat.setDuration((long) this.a.getResources().getInteger(gwb.fC));
        ofFloat.setInterpolator(new bbx(bcb.a));
        ofFloat.addListener(new gps(this));
        ofFloat.start();
    }
}
