package defpackage;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public class fki extends fhb implements bhm {
    private final long a;

    public fki(bko bko, long j) {
        super(bko);
        this.a = j;
    }

    public void w_() {
        a(new evn(this.a));
    }

    public int a(Context context, bhb bhb) {
        super.a(bhb);
        RealTimeChatService.a(this.c.b, this.a);
        return bhn.a;
    }
}
