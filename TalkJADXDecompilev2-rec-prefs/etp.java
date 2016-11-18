package p000;

import android.content.Context;
import android.text.TextUtils;

public class etp extends etk {
    private static final long serialVersionUID = 1;
    public final String f12237c;
    public final String f12238d;
    public final String f12239e;
    public final boolean f12240f;
    private final boolean f12241k;

    public etp(String str, String str2, String str3, boolean z, boolean z2) {
        iil.m21879b("Expected condition to be false", TextUtils.isEmpty(str));
        this.f12237c = str;
        this.f12238d = str2;
        this.f12239e = str3;
        this.f12240f = z;
        this.f12241k = z2;
    }

    public nzf mo1944a(String str, int i, int i2) {
        ldz ldz = new ldz();
        ldz.f24738c = this.f12237c;
        lem lem = new lem();
        lem.f24840a = ldz;
        lem.f24841b = this.f12239e;
        len len = new len();
        len.f24842a = new lem[]{lem};
        len.f24843b = Boolean.valueOf(this.f12240f);
        ley ley = new ley();
        ley.f24879a = len;
        if (!this.f12240f) {
            ley.f24882d = Boolean.valueOf(true);
        }
        nzf kmv = new kmv();
        kmv.f22407a = ley;
        return kmv;
    }

    public String mo1947g() {
        return "blockuser";
    }

    public boolean mo1008a(Context context, eaf eaf, fdo fdo) {
        return this.f12241k && super.mo1008a(context, eaf, fdo);
    }
}
