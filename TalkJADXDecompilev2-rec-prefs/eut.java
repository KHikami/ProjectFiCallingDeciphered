package p000;

import android.content.Context;

public class eut extends euo {
    private static final long serialVersionUID = 1;
    public final String f12315c;

    public eut(String str, String str2) {
        super(str);
        this.f12315c = str2;
    }

    public nzf mo1944a(String str, int i, int i2) {
        nzf lpz = new lpz();
        lpz.requestHeader = euk.m14556a(str, i, i2, this.i);
        lpz.f26051a = euk.m14555a(this.e);
        lpz.f26052b = new lpx();
        lpz.f26052b.f26044a = this.f12315c;
        return lpz;
    }

    public String mo1947g() {
        return "conversations/easteregg";
    }

    public String K_() {
        return "event_queue";
    }

    public boolean mo1008a(Context context, eaf eaf, fdo fdo) {
        return false;
    }
}
