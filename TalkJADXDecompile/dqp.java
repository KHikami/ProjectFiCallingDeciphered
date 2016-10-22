import android.content.Intent;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class dqp implements dax {
    final /* synthetic */ String a;
    final /* synthetic */ dqo b;

    dqp(dqo dqo, String str) {
        this.b = dqo;
        this.a = str;
    }

    public void a(boolean z, boolean z2) {
        RealTimeChatService.a(this.b.b.k, this.b.b.e, false, z2, z);
        if (z) {
            RealTimeChatService.a(((fmf) jyn.a(this.b.b.getContext(), fmf.class)).a(-1), this.b.b.k, this.b.b.j, null, this.a, true, true);
        }
        if (this.b.b.i.e()) {
            ik.a(this.b.b.getContext()).a(new Intent("INVITE_IGNORED"));
        }
    }
}
