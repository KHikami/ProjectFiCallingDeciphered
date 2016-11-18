package p000;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.views.AudioAttachmentView;

public final class gmv implements OnClickListener {
    final /* synthetic */ AudioAttachmentView f15667a;

    public gmv(AudioAttachmentView audioAttachmentView) {
        this.f15667a = audioAttachmentView;
    }

    public void onClick(View view) {
        if (this.f15667a.f6027d != null) {
            switch (this.f15667a.f6027d.m18135b()) {
                case 0:
                case 1:
                case 5:
                    this.f15667a.f6027d.m18144k();
                    return;
                case 2:
                case 3:
                case 4:
                    this.f15667a.f6027d.m18145l();
                    return;
                default:
                    return;
            }
        }
        glk.m17981d("Babel", "playPauseButtonClicked: audioPlaybackController is null", new Object[0]);
    }
}
