package defpackage;

import android.content.Intent;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.List;

public final class fqb implements fqd {
    private static final long serialVersionUID = 1;
    private final List<gkv<Integer, Boolean>> a;

    public fqb(lut lut) {
        this.a = new ArrayList(lut.a.length);
        for (lus lus : lut.a) {
            this.a.add(new gkv(lus.a, lus.b));
        }
    }

    public void a(int i, mfa<Intent> mfa_android_content_Intent) {
        bko e = fde.e(i);
        jck b = ((jcf) jyn.a(gwb.H(), jcf.class)).b(i);
        RealTimeChatService.a(b, this.a);
        b.d();
        RealTimeChatService.b(e);
    }
}
