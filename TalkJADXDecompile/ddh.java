import com.google.android.apps.hangouts.fragments.InvitationFragment;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class ddh implements dax {
    final /* synthetic */ InvitationFragment a;

    public ddh(InvitationFragment invitationFragment) {
        this.a = invitationFragment;
    }

    public void a(boolean z, boolean z2) {
        RealTimeChatService.a(this.a.b.a(), this.a.c, false, z2, z);
        if (z) {
            RealTimeChatService.a(((fmf) this.a.binder.a(fmf.class)).a(-1), this.a.b.a(), this.a.d.a, null, this.a.e, true, true);
        }
        ddi ddi = this.a.a;
        String str = this.a.c;
        ddi.a();
    }
}
