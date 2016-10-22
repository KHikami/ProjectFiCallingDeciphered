import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public final class jby extends AnimatorListenerAdapter {
    final /* synthetic */ View a;

    public jby(View view) {
        this.a = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.a.setVisibility(8);
    }
}
