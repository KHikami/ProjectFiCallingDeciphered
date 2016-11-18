package defpackage;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class fwl implements bcp {
    public void a(Context context, boolean z, bcs bcs) {
        if (z) {
            fzw fzw = (fzw) jyn.a(context, fzw.class);
            if (fzw.e()) {
                glk.a("Babel_Unmerge", "already done.", new Object[0]);
            } else if (fzw.d()) {
                RealTimeChatService.e();
                fzw.a(false);
                fzw.c(true);
                int c = fde.c(context);
                if (c != -1) {
                    ((iih) jyn.a(context, iih.class)).a(c).b().c(2817);
                    glk.a("Babel_Unmerge", "unmerge impression.", new Object[0]);
                }
                fzw.b(true);
                glk.a("Babel_Unmerge", "unmerged.", new Object[0]);
            } else {
                fzw.a(false);
                fzw.b(true);
                glk.a("Babel_Unmerge", "merged not enabled.", new Object[0]);
            }
        }
    }
}
