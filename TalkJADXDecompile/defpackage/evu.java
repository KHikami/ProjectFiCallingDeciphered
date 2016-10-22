package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: evu */
public class evu extends esw {
    private static final long serialVersionUID = 1;
    public final String c;

    public evu(String str) {
        this.c = str;
    }

    public nzf a(String str, int i, int i2) {
        nzf lwu = new lwu();
        lwu.requestHeader = euk.a(null, true, str, i, i2, this.i);
        if (!TextUtils.isEmpty(this.c)) {
            ltr ltr = new ltr();
            ltr.b = this.c;
            lwu.a = new ltr[1];
            lwu.a[0] = ltr;
        }
        return lwu;
    }

    public String g() {
        return "contacts/undismisssuggestedcontacts";
    }

    public String K_() {
        return "ui_queue";
    }

    public void a(Context context, bko bko, fdo fdo) {
        ((gid) jyn.a(context, gid.class)).a(new dcx(this, null), fdo, dcx.a(bko.g()));
    }
}
