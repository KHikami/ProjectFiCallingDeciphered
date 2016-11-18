package p000;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public class eue extends euc {
    private static final long serialVersionUID = 1;
    public final String f12289c;

    public void mo1945a(Context context, bko bko, fdo fdo) {
        RealTimeChatService.m9018a(bko, this.f12289c, 0);
    }

    public eue(String str) {
        this.f12289c = str;
    }

    public nzf mo1944a(String str, int i, int i2) {
        lyg lyg = new lyg();
        lyg.f26861a = "conversation";
        lyg.f26862b = this.f12289c;
        nzf lzb = new lzb();
        lzb.requestHeader = euk.m14556a(str, i, i2, this.i);
        lzb.requestHeader.f26512g = euc.m14534a(false);
        lzb.f26972a = lyg;
        return lzb;
    }

    public String mo1947g() {
        return "hangouts/resolve";
    }

    public long mo1017b() {
        return 10000;
    }
}
