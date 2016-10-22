import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public class iuf extends AnimatorListenerAdapter {
    private lo<Animator, Boolean> a;

    public iuf() {
        this.a = new lo();
    }

    public void onAnimationStart(Animator animator) {
        this.a.put(animator, Boolean.valueOf(false));
    }

    public void onAnimationCancel(Animator animator) {
        this.a.put(animator, Boolean.valueOf(true));
    }

    public final boolean a(Animator animator) {
        return this.a.containsKey(animator) && ((Boolean) this.a.get(animator)).booleanValue();
    }
}
