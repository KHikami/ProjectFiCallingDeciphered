package p000;

import android.content.Context;
import android.text.TextUtils;

public class evu extends esw {
    private static final long serialVersionUID = 1;
    public final String f12392c;

    public evu(String str) {
        this.f12392c = str;
    }

    public nzf mo1944a(String str, int i, int i2) {
        nzf lwu = new lwu();
        lwu.requestHeader = euk.m14557a(null, true, str, i, i2, this.i);
        if (!TextUtils.isEmpty(this.f12392c)) {
            ltr ltr = new ltr();
            ltr.f26403b = this.f12392c;
            lwu.f26728a = new ltr[1];
            lwu.f26728a[0] = ltr;
        }
        return lwu;
    }

    public String mo1947g() {
        return "contacts/undismisssuggestedcontacts";
    }

    public String K_() {
        return "ui_queue";
    }

    public void mo1945a(Context context, bko bko, fdo fdo) {
        ((gid) jyn.m25426a(context, gid.class)).mo2277a(new dcx(this, null), fdo, dcx.m11463a(bko.m5638g()));
    }
}
