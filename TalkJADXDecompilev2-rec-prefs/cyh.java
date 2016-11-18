package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.hangouts.floatingactionbutton.impl.QuickButtonContainer;

public final class cyh extends AnimatorListenerAdapter {
    final /* synthetic */ QuickButtonContainer f9330a;

    public cyh(QuickButtonContainer quickButtonContainer) {
        this.f9330a = quickButtonContainer;
    }

    public void onAnimationEnd(Animator animator) {
        if (this.f9330a.f6226c == animator) {
            this.f9330a.f6225b = false;
            this.f9330a.setVisibility(this.f9330a.f6227d);
            this.f9330a.f6224a = false;
            this.f9330a.f6226c = null;
        }
    }
}
