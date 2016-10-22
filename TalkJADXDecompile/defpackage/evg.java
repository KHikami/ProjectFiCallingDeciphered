package defpackage;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

/* renamed from: evg */
public class evg extends euu {
    private static final long serialVersionUID = 1;
    public final String c;
    public final String d;

    public evg(String str, String str2, String str3, String str4) {
        super(str2, str);
        this.c = str3;
        this.d = str4;
    }

    public nzf a(String str, int i, int i2) {
        lqm lqm = new lqm();
        lqm.b = blo.c(this.k);
        lqm.a = euk.a(this.e);
        lqm.e = Integer.valueOf(6);
        nzf luk = new luk();
        luk.requestHeader = euk.a(str, i, i2, this.i);
        luk.b = this.c;
        luk.a = lqm;
        return luk;
    }

    public String g() {
        return "conversations/renameconversation";
    }

    public void a(Context context, bko bko, fdo fdo) {
        super.a(context, bko, fdo);
        RealTimeChatService.a(bko.g(), this.e, this.d);
    }
}
