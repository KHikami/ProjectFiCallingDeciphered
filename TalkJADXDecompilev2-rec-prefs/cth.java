package p000;

import com.google.android.apps.hangouts.elane.FocusedParticipantAvatarView;
import com.google.android.apps.hangouts.elane.VolumeCircle;

public final class cth extends cvn {
    final /* synthetic */ FocusedParticipantAvatarView f9031a;

    public cth(FocusedParticipantAvatarView focusedParticipantAvatarView) {
        this.f9031a = focusedParticipantAvatarView;
    }

    public void mo1422a(int i) {
        VolumeCircle volumeCircle = this.f9031a.f6167a;
        if (this.f9031a.f6169c) {
            i = 0;
        }
        volumeCircle.m8428a(i);
    }

    public void mo1423a(boolean z) {
        this.f9031a.m8412a(z);
    }
}
