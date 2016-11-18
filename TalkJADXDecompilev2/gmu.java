package defpackage;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.google.android.apps.hangouts.views.AudioAttachmentView;

public final class gmu implements OnGlobalLayoutListener {
    final /* synthetic */ float a;
    final /* synthetic */ AudioAttachmentView b;

    public gmu(AudioAttachmentView audioAttachmentView, float f) {
        this.b = audioAttachmentView;
        this.a = f;
    }

    public void onGlobalLayout() {
        this.b.b.setVisibility(((float) this.b.b.getWidth()) >= this.a ? 0 : 4);
    }
}
