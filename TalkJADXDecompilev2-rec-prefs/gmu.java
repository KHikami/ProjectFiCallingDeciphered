package p000;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.google.android.apps.hangouts.views.AudioAttachmentView;

public final class gmu implements OnGlobalLayoutListener {
    final /* synthetic */ float f15665a;
    final /* synthetic */ AudioAttachmentView f15666b;

    public gmu(AudioAttachmentView audioAttachmentView, float f) {
        this.f15666b = audioAttachmentView;
        this.f15665a = f;
    }

    public void onGlobalLayout() {
        this.f15666b.f6025b.setVisibility(((float) this.f15666b.f6025b.getWidth()) >= this.f15665a ? 0 : 4);
    }
}
