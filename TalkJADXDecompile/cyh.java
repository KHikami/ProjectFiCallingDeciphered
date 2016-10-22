import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.hangouts.floatingactionbutton.impl.QuickButtonContainer;

public final class cyh extends AnimatorListenerAdapter {
    final /* synthetic */ QuickButtonContainer a;

    public cyh(QuickButtonContainer quickButtonContainer) {
        this.a = quickButtonContainer;
    }

    public void onAnimationEnd(Animator animator) {
        if (this.a.c == animator) {
            this.a.b = false;
            this.a.setVisibility(this.a.d);
            this.a.a = false;
            this.a.c = null;
        }
    }
}
