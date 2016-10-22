package defpackage;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

/* renamed from: eue */
public class eue extends euc {
    private static final long serialVersionUID = 1;
    public final String c;

    public void a(Context context, bko bko, fdo fdo) {
        RealTimeChatService.a(bko, this.c, 0);
    }

    public eue(String str) {
        this.c = str;
    }

    public nzf a(String str, int i, int i2) {
        lyg lyg = new lyg();
        lyg.a = "conversation";
        lyg.b = this.c;
        nzf lzb = new lzb();
        lzb.requestHeader = euk.a(str, i, i2, this.i);
        lzb.requestHeader.g = euc.a(false);
        lzb.a = lyg;
        return lzb;
    }

    public String g() {
        return "hangouts/resolve";
    }

    public long b() {
        return 10000;
    }
}
