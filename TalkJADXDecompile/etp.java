import android.content.Context;
import android.text.TextUtils;

public class etp extends etk {
    private static final long serialVersionUID = 1;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    private final boolean k;

    public etp(String str, String str2, String str3, boolean z, boolean z2) {
        iil.b("Expected condition to be false", TextUtils.isEmpty(str));
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.k = z2;
    }

    public nzf a(String str, int i, int i2) {
        ldz ldz = new ldz();
        ldz.c = this.c;
        lem lem = new lem();
        lem.a = ldz;
        lem.b = this.e;
        len len = new len();
        len.a = new lem[]{lem};
        len.b = Boolean.valueOf(this.f);
        ley ley = new ley();
        ley.a = len;
        if (!this.f) {
            ley.d = Boolean.valueOf(true);
        }
        nzf kmv = new kmv();
        kmv.a = ley;
        return kmv;
    }

    public String g() {
        return "blockuser";
    }

    public boolean a(Context context, eaf eaf, fdo fdo) {
        return this.k && super.a(context, eaf, fdo);
    }
}
