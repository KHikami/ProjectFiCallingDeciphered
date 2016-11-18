package p000;

import android.content.Intent;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class dqp implements dax {
    final /* synthetic */ String f10349a;
    final /* synthetic */ dqo f10350b;

    dqp(dqo dqo, String str) {
        this.f10350b = dqo;
        this.f10349a = str;
    }

    public void mo1492a(boolean z, boolean z2) {
        RealTimeChatService.m9003a(this.f10350b.f10348b.f6469k, this.f10350b.f10348b.f6463e, false, z2, z);
        if (z) {
            RealTimeChatService.m9047a(((fmf) jyn.m25426a(this.f10350b.f10348b.getContext(), fmf.class)).mo2036a(-1), this.f10350b.f10348b.f6469k, this.f10350b.f10348b.f6468j, null, this.f10349a, true, true);
        }
        if (this.f10350b.f10348b.f6467i.m12509e()) {
            ik.m22097a(this.f10350b.f10348b.getContext()).m22101a(new Intent("INVITE_IGNORED"));
        }
    }
}
