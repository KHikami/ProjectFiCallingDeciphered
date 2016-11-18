package p000;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class cmw implements jnh {
    private final jcf f5670a;
    private final biw f5671b;
    private final Context f5672c;
    private final fzw f5673d;

    cmw(Context context) {
        this.f5670a = (jcf) jyn.m25426a(context, jcf.class);
        this.f5671b = (biw) jyn.m25426a(context, biw.class);
        this.f5673d = (fzw) jyn.m25426a(context, fzw.class);
        this.f5672c = context;
    }

    public void mo609a(int i) {
        glk.m17979c("Babel_StickerModule", "Account change update: " + i, new Object[0]);
        if (this.f5670a.mo3469d(i)) {
            m7941a(i, this.f5671b.mo562a("babel_stickers_account_id", "108618507921641169817"), false, false);
        } else {
            glk.m17981d("Babel_StickerModule", "Null account update.", new Object[0]);
        }
    }

    private void m7941a(int i, String str, boolean z, boolean z2) {
        bko e = fde.m15018e(i);
        if (!this.f5673d.mo2146a(i) && !fde.m15015d(e) && !giw.m17760e(this.f5672c)) {
            long e2 = bkq.m5693e(this.f5672c, e);
            if (e2 > 0 && !gwb.m1906a(this.f5672c, "babel_stickers_auto_update", true)) {
                glk.m17970a("Babel_StickerModule", "Skip stickers auto update. Last update:" + e2, new Object[0]);
            } else if (gwb.m1519a(this.f5672c, "babel_stickers_query_limit_ms", fls.f13437n) + e2 < System.currentTimeMillis()) {
                glk.m17979c("Babel_StickerModule", "Sticker update initiated. last:" + e2 + " empty:false", new Object[0]);
                RealTimeChatService.m9123l(e, str);
            }
        }
    }
}
