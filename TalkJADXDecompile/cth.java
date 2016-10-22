import com.google.android.apps.hangouts.elane.FocusedParticipantAvatarView;
import com.google.android.apps.hangouts.elane.VolumeCircle;

public final class cth extends cvn {
    final /* synthetic */ FocusedParticipantAvatarView a;

    public cth(FocusedParticipantAvatarView focusedParticipantAvatarView) {
        this.a = focusedParticipantAvatarView;
    }

    public void a(int i) {
        VolumeCircle volumeCircle = this.a.a;
        if (this.a.c) {
            i = 0;
        }
        volumeCircle.a(i);
    }

    public void a(boolean z) {
        this.a.a(z);
    }
}
