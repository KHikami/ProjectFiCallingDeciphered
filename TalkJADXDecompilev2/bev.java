package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class bev implements bem {
    private static final boolean a = false;
    private final Context b;

    static {
        kae kae = glk.b;
    }

    public bev(Context context) {
        this.b = context;
    }

    public void a(int i, boolean z, String str) {
        if (a) {
            new StringBuilder(String.valueOf(str).length() + 83).append("Starting setCallerIdConfig.  accountId: ").append(i).append(" enable: ").append(z).append(" e164PhoneNumber: ").append(str);
        }
        RealTimeChatService.a(i, z, str);
    }

    public void a(int i) {
        ik.a(this.b).a(new Intent("set_callerid_outcome").putExtra("set_callerid_result", i));
    }
}
