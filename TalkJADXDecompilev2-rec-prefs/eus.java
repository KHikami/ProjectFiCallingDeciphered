package p000;

import android.text.TextUtils;

public class eus extends esw {
    private static final long serialVersionUID = 1;
    public final String f12314c;

    public eus(String str) {
        this.f12314c = str;
    }

    public nzf mo1944a(String str, int i, int i2) {
        nzf lpr = new lpr();
        lpr.requestHeader = euk.m14557a(null, true, str, i, i2, this.i);
        if (!TextUtils.isEmpty(this.f12314c)) {
            ltr ltr = new ltr();
            ltr.f26403b = this.f12314c;
            lpr.f26023a = new ltr[1];
            lpr.f26023a[0] = ltr;
        }
        return lpr;
    }

    public String mo1947g() {
        return "contacts/dismisssuggestedcontacts";
    }

    public String K_() {
        return "ui_queue";
    }
}
