package p000;

import android.text.TextUtils;

public class etl extends etk {
    private static final long serialVersionUID = 1;
    private final String f12234c;

    public etl(String str) {
        iil.m21879b("Expected condition to be false", TextUtils.isEmpty(str));
        this.f12234c = str;
    }

    public nzf mo1944a(String str, int i, int i2) {
        nmh nmh = new nmh();
        new njz().a = this.f12234c;
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
        knh.f22421a = nmh;
        return knh;
    }

    public String mo1947g() {
        return "readitemsbyid";
    }
}
