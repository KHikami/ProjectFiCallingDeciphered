package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.views.AudioAttachmentView;

public final class gmv implements OnClickListener {
    final /* synthetic */ AudioAttachmentView a;

    public gmv(AudioAttachmentView audioAttachmentView) {
        this.a = audioAttachmentView;
    }

    public void onClick(View view) {
        if (this.a.d != null) {
            switch (this.a.d.b()) {
                case 0:
                case 1:
                case 5:
                    this.a.d.k();
                    return;
                case 2:
                case 3:
                case 4:
                    this.a.d.l();
                    return;
                default:
                    return;
            }
        }
        glk.d("Babel", "playPauseButtonClicked: audioPlaybackController is null", new Object[0]);
    }
}
