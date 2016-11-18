package defpackage;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class cmw implements jnh {
    private final jcf a;
    private final biw b;
    private final Context c;
    private final fzw d;

    cmw(Context context) {
        this.a = (jcf) jyn.a(context, jcf.class);
        this.b = (biw) jyn.a(context, biw.class);
        this.d = (fzw) jyn.a(context, fzw.class);
        this.c = context;
    }

    public void a(int i) {
        glk.c("Babel_StickerModule", "Account change update: " + i, new Object[0]);
        if (this.a.d(i)) {
            a(i, this.b.a("babel_stickers_account_id", "108618507921641169817"), false, false);
        } else {
            glk.d("Babel_StickerModule", "Null account update.", new Object[0]);
        }
    }

    private void a(int i, String str, boolean z, boolean z2) {
        bko e = fde.e(i);
        if (!this.d.a(i) && !fde.d(e) && !giw.e(this.c)) {
            long e2 = bkq.e(this.c, e);
            if (e2 > 0 && !gwb.a(this.c, "babel_stickers_auto_update", true)) {
                glk.a("Babel_StickerModule", "Skip stickers auto update. Last update:" + e2, new Object[0]);
            } else if (gwb.a(this.c, "babel_stickers_query_limit_ms", fls.n) + e2 < System.currentTimeMillis()) {
                glk.c("Babel_StickerModule", "Sticker update initiated. last:" + e2 + " empty:false", new Object[0]);
                RealTimeChatService.l(e, str);
            }
        }
    }
}
