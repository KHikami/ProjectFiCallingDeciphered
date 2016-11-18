package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.views.AudioAttachmentView;

public final class gmw implements OnClickListener {
    final /* synthetic */ AudioAttachmentView a;

    public gmw(AudioAttachmentView audioAttachmentView) {
        this.a = audioAttachmentView;
    }

    public void onClick(View view) {
        if (this.a.d != null) {
            int b = this.a.d.b();
            if (b == 0 || b == 1) {
                glk.d("Babel", "speakerphoneButton.onClick: button should be hidden, but isn't.", new Object[0]);
                return;
            }
            this.a.d.d();
            this.a.e();
            return;
        }
        glk.d("Babel", "speakerphoneButton.onClick: audioPlaybackController is null", new Object[0]);
    }
}
