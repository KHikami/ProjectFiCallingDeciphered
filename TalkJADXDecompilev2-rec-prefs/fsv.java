package p000;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.service.NoConfirmationSmsSendService;

public final class fsv extends fip {
    final Context f13932a;
    final int f13933b;
    final String f13934c;
    final String f13935d;
    final /* synthetic */ NoConfirmationSmsSendService f13936e;

    public fsv(NoConfirmationSmsSendService noConfirmationSmsSendService, Context context, int i, String str, String str2) {
        this.f13936e = noConfirmationSmsSendService;
        this.f13932a = context;
        this.f13933b = i;
        this.f13934c = str;
        this.f13935d = str2;
    }

    public void mo650a(int i, bko bko, fek fek, fiu fiu) {
        if (i == this.f13933b) {
            if (fiu.m15391b() == 1) {
                ((C0058for) jyn.m25426a(this.f13932a, C0058for.class)).mo2059a(bko, fek.f12913a, this.f13935d, null, 0, null, 0, 0, null, this.f13934c, false, null, 0, blo.m5856a(bko.m5638g(), 7));
            } else {
                String str = "Babel";
                int b = fiu.m15391b();
                String valueOf = String.valueOf(fek);
                String str2 = fek != null ? fek.f12913a : "NULL";
                glk.m17982e(str, new StringBuilder((String.valueOf(valueOf).length() + 55) + String.valueOf(str2).length()).append("couldn't create conversation; error code: ").append(b).append(" ").append(valueOf).append(" ").append(str2).toString(), new Object[0]);
            }
            RealTimeChatService.m9077b((fip) this);
        }
    }
}
