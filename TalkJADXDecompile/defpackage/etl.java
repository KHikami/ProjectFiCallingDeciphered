package defpackage;

import android.text.TextUtils;
import nee;
import nef;
import neg;
import njz;
import nkr;
import nkt;
import nmf;
import nmh;

/* renamed from: etl */
public class etl extends etk {
    private static final long serialVersionUID = 1;
    private final String c;

    public etl(String str) {
        iil.b("Expected condition to be false", TextUtils.isEmpty(str));
        this.c = str;
    }

    public nzf a(String str, int i, int i2) {
        nmh nmh = new nmh();
        new njz().a = this.c;
        nmf nmf = new nmf();
        nmf.a = new njz[]{r1};
        nmh.a = nmf;
        neg neg = new neg();
        neg.a = Boolean.valueOf(true);
        nef nef = new nef();
        nef.b = neg;
        nee nee = new nee();
        nee.b = nef;
        nkr nkr = new nkr();
        nkr.d = nee;
        nkt nkt = new nkt();
        nkt.c = nkr;
        nmh.b = nkt;
        nzf knh = new knh();
        knh.a = nmh;
        return knh;
    }

    public String g() {
        return "readitemsbyid";
    }
}
