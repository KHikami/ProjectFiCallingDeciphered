package defpackage;

import android.content.Context;

/* renamed from: euf */
public class euf extends euc {
    private static final long serialVersionUID = 1;
    public final String c;

    public euf(String str) {
        this.c = str;
    }

    public nzf a(String str, int i, int i2) {
        nzf lyx = new lyx();
        lyx.requestHeader = euk.a(str, i, i2, this.i);
        lyx.requestHeader.g = euc.a(false);
        lyx.a = this.c;
        return lyx;
    }

    public String g() {
        return "hangouts/query";
    }

    public boolean a(Context context, eaf eaf, fdo fdo) {
        return false;
    }
}
