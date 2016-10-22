import android.content.Context;

public class evj extends esw {
    private static final long serialVersionUID = 1;
    public final String c;

    public evj(String str) {
        this.c = str;
    }

    public nzf a(String str, int i, int i2) {
        ltn ltn = new ltn();
        if (this.c != null) {
            ltn.a = Integer.valueOf(1);
            ltn.c = this.c;
        }
        nzf lva = new lva();
        lva.requestHeader = euk.a(str, i, i2, this.i);
        lva.a = ltn;
        return lva;
    }

    public boolean a(Context context, eaf eaf, fdo fdo) {
        return false;
    }

    public String g() {
        return "devices/sendoffnetworkinvitation";
    }
}
