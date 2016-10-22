import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import com.google.android.apps.hangouts.views.MessageListItemWrapperView.WatermarkGalleryStateTransition;

public final class gpy implements AnimatorListener {
    final /* synthetic */ WatermarkGalleryStateTransition a;

    public gpy(WatermarkGalleryStateTransition watermarkGalleryStateTransition) {
        this.a = watermarkGalleryStateTransition;
    }

    public void onAnimationStart(Animator animator) {
        if (gwb.a(this.a.b.getContext(), "babel_crash_on_conversation_scroll_error", false)) {
            glk.c("Babel_Scroll", "watermarkGalleryMeasuredHeightReduction animation starting", new Object[0]);
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationCancel(Animator animator) {
        a();
    }

    public void onAnimationEnd(Animator animator) {
        a();
    }

    private void a() {
        if (gwb.a(this.a.b.getContext(), "babel_crash_on_conversation_scroll_error", false)) {
            glk.c("Babel_Scroll", "watermarkGalleryMeasuredHeightReduction animation finishing", new Object[0]);
        }
        this.a.b.c = this.a.b.d;
        this.a.b.d = -1;
        this.a.b.b.a(this.a.b.e, this.a.a);
        gpk a = this.a.b.f.a();
        if (a != null) {
            a.b();
        }
    }
}
