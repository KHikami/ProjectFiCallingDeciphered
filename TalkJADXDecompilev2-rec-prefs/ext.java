package p000;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.List;

public final class ext extends evz {
    private static final long serialVersionUID = 1;
    private final List<edo> f12447g = new ArrayList();

    ext(lyw lyw) {
        for (lym lym : lyw.f26960a) {
            this.f12447g.add(edo.m13604a(lym.f26908c));
        }
        if (evz.f5798a) {
            String valueOf = String.valueOf(lyw);
            new StringBuilder(String.valueOf(valueOf).length() + 36).append("GetHangoutParticipantsResponse from:").append(valueOf);
        }
    }

    public void mo1958a(Context context, bko bko) {
        String str = ((eug) this.b).f12292d;
        RealTimeChatService.m9060a(str, this.f12447g);
        if (this.f12447g == null || this.f12447g.isEmpty()) {
            blo blo = new blo(context, bko.m5638g());
            blo.m5961a(0, blo.m5921M(str), str);
        }
    }
}
