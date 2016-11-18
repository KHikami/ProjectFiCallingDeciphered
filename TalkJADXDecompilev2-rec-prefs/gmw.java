package p000;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.views.AudioAttachmentView;

public final class gmw implements OnClickListener {
    final /* synthetic */ AudioAttachmentView f15668a;

    public gmw(AudioAttachmentView audioAttachmentView) {
        this.f15668a = audioAttachmentView;
    }

    public void onClick(View view) {
        if (this.f15668a.f6027d != null) {
            int b = this.f15668a.f6027d.m18135b();
            if (b == 0 || b == 1) {
                glk.m17981d("Babel", "speakerphoneButton.onClick: button should be hidden, but isn't.", new Object[0]);
                return;
            }
            this.f15668a.f6027d.m18137d();
            this.f15668a.m8291e();
            return;
        }
        glk.m17981d("Babel", "speakerphoneButton.onClick: audioPlaybackController is null", new Object[0]);
    }
}
