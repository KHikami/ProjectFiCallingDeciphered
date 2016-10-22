package defpackage;

import android.content.Intent;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

/* renamed from: fij */
final class fij extends flm {
    final /* synthetic */ fii a;

    fij(fii fii, String str, long j, long j2) {
        this.a = fii;
        super(str, j, j2);
    }

    public String a(Object obj) {
        String str = "opcode: ";
        String valueOf = String.valueOf(RealTimeChatService.e(((Intent) obj).getIntExtra("op", -1)));
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }
}
