package p000;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class efy extends fip {
    final /* synthetic */ eft f11397a;

    efy(eft eft) {
        this.f11397a = eft;
    }

    public void mo921a(int i, bko bko, fek fek, fiu fiu, String str) {
        super.mo921a(i, bko, fek, fiu, str);
        if (i == this.f11397a.ak) {
            try {
                if (this.f11397a.getActivity() != null) {
                    if (fiu.m15391b() == 1) {
                        Object f = this.f11397a.f11385c.m4877f();
                        iil.m21877b(bcj.INVITE_MORE_TO_HANGOUT, f);
                        iil.m21877b(bcj.INVITE_GAIA_IDS_TO_HANGOUT, f);
                        this.f11397a.f11384b.mo1179a(fek.f12913a, fek.f12914b, fek.f12915c, this.f11397a.f11385c.m4861a());
                    } else {
                        String str2 = "Babel";
                        int b = fiu.m15391b();
                        String valueOf = String.valueOf(fek);
                        String valueOf2 = String.valueOf(fek != null ? fek.f12913a : "NULL");
                        glk.m17982e(str2, new StringBuilder((String.valueOf(valueOf).length() + 55) + String.valueOf(valueOf2).length()).append("couldn't create conversation; error code: ").append(b).append(" ").append(valueOf).append(" ").append(valueOf2).toString(), new Object[0]);
                    }
                    RealTimeChatService.m9077b(this.f11397a.f11388f);
                }
            } finally {
                RealTimeChatService.m9077b(this.f11397a.f11388f);
            }
        }
    }
}
