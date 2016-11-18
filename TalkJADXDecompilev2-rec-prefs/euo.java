package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public abstract class euo extends esw {
    private static final long serialVersionUID = 1;
    public final String f12298e;
    public transient boolean f12299f = false;

    public euo(String str) {
        this.f12298e = str;
        if (str != null && blo.m5871a(str)) {
            String str2 = "cannot use client generated conversation id:";
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    public void mo1945a(Context context, bko bko, fdo fdo) {
        if (!TextUtils.isEmpty(this.f12298e) && fdo.m15084c() == 113) {
            String str = "Babel";
            String str2 = "ERROR_RESPONSE_NOT_FOUND for ";
            String valueOf = String.valueOf(this.f12298e);
            glk.m17981d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
            RealTimeChatService.m9112f(bko, this.f12298e);
            this.f12299f = true;
        }
    }
}
