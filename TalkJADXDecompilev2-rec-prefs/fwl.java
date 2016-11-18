package p000;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class fwl implements bcp {
    public void mo466a(Context context, boolean z, bcs bcs) {
        if (z) {
            fzw fzw = (fzw) jyn.m25426a(context, fzw.class);
            if (fzw.mo2157e()) {
                glk.m17970a("Babel_Unmerge", "already done.", new Object[0]);
            } else if (fzw.mo2155d()) {
                RealTimeChatService.m9106e();
                fzw.mo2145a(false);
                fzw.mo2150c(true);
                int c = fde.m15011c(context);
                if (c != -1) {
                    ((iih) jyn.m25426a(context, iih.class)).mo1979a(c).mo1693b().mo1714c(2817);
                    glk.m17970a("Babel_Unmerge", "unmerge impression.", new Object[0]);
                }
                fzw.mo2147b(true);
                glk.m17970a("Babel_Unmerge", "unmerged.", new Object[0]);
            } else {
                fzw.mo2145a(false);
                fzw.mo2147b(true);
                glk.m17970a("Babel_Unmerge", "merged not enabled.", new Object[0]);
            }
        }
    }
}
