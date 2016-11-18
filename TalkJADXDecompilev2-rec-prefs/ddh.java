package p000;

import com.google.android.apps.hangouts.fragments.InvitationFragment;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class ddh implements dax {
    final /* synthetic */ InvitationFragment f9536a;

    public ddh(InvitationFragment invitationFragment) {
        this.f9536a = invitationFragment;
    }

    public void mo1492a(boolean z, boolean z2) {
        RealTimeChatService.m9003a(this.f9536a.f6273b.mo2317a(), this.f9536a.f6274c, false, z2, z);
        if (z) {
            RealTimeChatService.m9047a(((fmf) this.f9536a.binder.m25443a(fmf.class)).mo2036a(-1), this.f9536a.f6273b.mo2317a(), this.f9536a.f6275d.f11244a, null, this.f9536a.f6276e, true, true);
        }
        ddi ddi = this.f9536a.f6272a;
        String str = this.f9536a.f6274c;
        ddi.mo1182a();
    }
}
