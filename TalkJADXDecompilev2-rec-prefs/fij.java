package p000;

import android.content.Intent;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class fij extends flm {
    final /* synthetic */ fii f13129a;

    fij(fii fii, String str, long j, long j2) {
        this.f13129a = fii;
        super(str, j, j2);
    }

    public String mo2000a(Object obj) {
        String str = "opcode: ";
        String valueOf = String.valueOf(RealTimeChatService.m9104e(((Intent) obj).getIntExtra("op", -1)));
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }
}
