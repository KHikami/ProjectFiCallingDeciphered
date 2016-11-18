package p000;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import com.google.android.apps.hangouts.views.MessageListItemWrapperView.WatermarkGalleryStateTransition;

public final class gpy implements AnimatorListener {
    final /* synthetic */ WatermarkGalleryStateTransition f15887a;

    public gpy(WatermarkGalleryStateTransition watermarkGalleryStateTransition) {
        this.f15887a = watermarkGalleryStateTransition;
    }

    public void onAnimationStart(Animator animator) {
        if (gwb.m1906a(this.f15887a.f7091b.getContext(), "babel_crash_on_conversation_scroll_error", false)) {
            glk.m17979c("Babel_Scroll", "watermarkGalleryMeasuredHeightReduction animation starting", new Object[0]);
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationCancel(Animator animator) {
        m18285a();
    }

    public void onAnimationEnd(Animator animator) {
        m18285a();
    }

    private void m18285a() {
        if (gwb.m1906a(this.f15887a.f7091b.getContext(), "babel_crash_on_conversation_scroll_error", false)) {
            glk.m17979c("Babel_Scroll", "watermarkGalleryMeasuredHeightReduction animation finishing", new Object[0]);
        }
        this.f15887a.f7091b.f7108c = this.f15887a.f7091b.f7109d;
        this.f15887a.f7091b.f7109d = -1;
        this.f15887a.f7091b.f7107b.mo621a(this.f15887a.f7091b.f7110e, this.f15887a.f7090a);
        gpk a = this.f15887a.f7091b.f7111f.m9433a();
        if (a != null) {
            a.m18266b();
        }
    }
}
