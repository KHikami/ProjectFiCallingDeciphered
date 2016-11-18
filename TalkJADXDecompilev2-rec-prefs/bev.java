package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class bev implements bem {
    private static final boolean f3163a = false;
    private final Context f3164b;

    static {
        kae kae = glk.f15555b;
    }

    public bev(Context context) {
        this.f3164b = context;
    }

    public void mo506a(int i, boolean z, String str) {
        if (f3163a) {
            new StringBuilder(String.valueOf(str).length() + 83).append("Starting setCallerIdConfig.  accountId: ").append(i).append(" enable: ").append(z).append(" e164PhoneNumber: ").append(str);
        }
        RealTimeChatService.m9007a(i, z, str);
    }

    public void mo505a(int i) {
        ik.m22097a(this.f3164b).m22101a(new Intent("set_callerid_outcome").putExtra("set_callerid_result", i));
    }
}
