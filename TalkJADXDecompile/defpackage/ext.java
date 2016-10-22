package defpackage;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ext */
public final class ext extends evz {
    private static final long serialVersionUID = 1;
    private final List<edo> g;

    ext(lyw lyw) {
        this.g = new ArrayList();
        for (lym lym : lyw.a) {
            this.g.add(edo.a(lym.c));
        }
        if (evz.a) {
            String valueOf = String.valueOf(lyw);
            new StringBuilder(String.valueOf(valueOf).length() + 36).append("GetHangoutParticipantsResponse from:").append(valueOf);
        }
    }

    public void a(Context context, bko bko) {
        String str = ((eug) this.b).d;
        RealTimeChatService.a(str, this.g);
        if (this.g == null || this.g.isEmpty()) {
            blo blo = new blo(context, bko.g());
            blo.a(0, blo.M(str), str);
        }
    }
}
