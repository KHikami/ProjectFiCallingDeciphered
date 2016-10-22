package defpackage;

import android.content.Context;

/* renamed from: eut */
public class eut extends euo {
    private static final long serialVersionUID = 1;
    public final String c;

    public eut(String str, String str2) {
        super(str);
        this.c = str2;
    }

    public nzf a(String str, int i, int i2) {
        nzf lpz = new lpz();
        lpz.requestHeader = euk.a(str, i, i2, this.i);
        lpz.a = euk.a(this.e);
        lpz.b = new lpx();
        lpz.b.a = this.c;
        return lpz;
    }

    public String g() {
        return "conversations/easteregg";
    }

    public String K_() {
        return "event_queue";
    }

    public boolean a(Context context, eaf eaf, fdo fdo) {
        return false;
    }
}
