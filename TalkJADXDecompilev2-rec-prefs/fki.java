package p000;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public class fki extends fhb implements bhm {
    private final long f13316a;

    public fki(bko bko, long j) {
        super(bko);
        this.f13316a = j;
    }

    public void w_() {
        m8039a(new evn(this.f13316a));
    }

    public int mo539a(Context context, bhb bhb) {
        super.mo1991a(bhb);
        RealTimeChatService.m9014a(this.f5736c.f12722b, this.f13316a);
        return bhn.f3348a;
    }
}
