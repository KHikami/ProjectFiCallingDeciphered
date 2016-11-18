package defpackage;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class efy extends fip {
    final /* synthetic */ eft a;

    efy(eft eft) {
        this.a = eft;
    }

    public void a(int i, bko bko, fek fek, fiu fiu, String str) {
        super.a(i, bko, fek, fiu, str);
        if (i == this.a.ak) {
            try {
                if (this.a.getActivity() != null) {
                    if (fiu.b() == 1) {
                        Object f = this.a.c.f();
                        iil.b(bcj.INVITE_MORE_TO_HANGOUT, f);
                        iil.b(bcj.INVITE_GAIA_IDS_TO_HANGOUT, f);
                        this.a.b.a(fek.a, fek.b, fek.c, this.a.c.a());
                    } else {
                        String str2 = "Babel";
                        int b = fiu.b();
                        String valueOf = String.valueOf(fek);
                        String valueOf2 = String.valueOf(fek != null ? fek.a : "NULL");
                        glk.e(str2, new StringBuilder((String.valueOf(valueOf).length() + 55) + String.valueOf(valueOf2).length()).append("couldn't create conversation; error code: ").append(b).append(" ").append(valueOf).append(" ").append(valueOf2).toString(), new Object[0]);
                    }
                    RealTimeChatService.b(this.a.f);
                }
            } finally {
                RealTimeChatService.b(this.a.f);
            }
        }
    }
}
