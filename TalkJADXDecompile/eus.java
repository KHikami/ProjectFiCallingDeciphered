import android.text.TextUtils;

public class eus extends esw {
    private static final long serialVersionUID = 1;
    public final String c;

    public eus(String str) {
        this.c = str;
    }

    public nzf a(String str, int i, int i2) {
        nzf lpr = new lpr();
        lpr.requestHeader = euk.a(null, true, str, i, i2, this.i);
        if (!TextUtils.isEmpty(this.c)) {
            ltr ltr = new ltr();
            ltr.b = this.c;
            lpr.a = new ltr[1];
            lpr.a[0] = ltr;
        }
        return lpr;
    }

    public String g() {
        return "contacts/dismisssuggestedcontacts";
    }

    public String K_() {
        return "ui_queue";
    }
}
