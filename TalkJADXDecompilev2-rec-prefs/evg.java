package p000;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public class evg extends euu {
    private static final long serialVersionUID = 1;
    public final String f12357c;
    public final String f12358d;

    public evg(String str, String str2, String str3, String str4) {
        super(str2, str);
        this.f12357c = str3;
        this.f12358d = str4;
    }

    public nzf mo1944a(String str, int i, int i2) {
        lqm lqm = new lqm();
        lqm.f26145b = blo.m5887c(this.k);
        lqm.f26144a = euk.m14555a(this.e);
        lqm.f26148e = Integer.valueOf(6);
        nzf luk = new luk();
        luk.requestHeader = euk.m14556a(str, i, i2, this.i);
        luk.f26492b = this.f12357c;
        luk.f26491a = lqm;
        return luk;
    }

    public String mo1947g() {
        return "conversations/renameconversation";
    }

    public void mo1945a(Context context, bko bko, fdo fdo) {
        super.mo1945a(context, bko, fdo);
        RealTimeChatService.m9002a(bko.m5638g(), this.e, this.f12358d);
    }
}
