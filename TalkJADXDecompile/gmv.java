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
                case wi.w /*0*/:
                case wi.j /*1*/:
                case wi.p /*5*/:
                    this.a.d.k();
                    return;
                case wi.l /*2*/:
                case wi.z /*3*/:
                case wi.h /*4*/:
                    this.a.d.l();
                    return;
                default:
                    return;
            }
        }
        glk.d("Babel", "playPauseButtonClicked: audioPlaybackController is null", new Object[0]);
    }
}
