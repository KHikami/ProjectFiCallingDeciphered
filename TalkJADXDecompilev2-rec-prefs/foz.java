package p000;

import android.text.TextUtils;
import java.io.Serializable;

public class foz implements Serializable {
    private static final long serialVersionUID = 1;
    public final int[] f13624a;
    public final String f13625b;
    public final String f13626c;
    public final String f13627d;
    public final String f13628e;
    public final String f13629f;
    public final String f13630g;
    public final String f13631h;

    static foz m15862a(ofm ofm, int i) {
        nzr nzr = ofm.a;
        for (int i2 : nzr.a) {
            if (i2 == 249) {
                obk obk = (obk) nzr.a(obk.a);
                if (obk != null) {
                    return new fpc(nzr, obk);
                }
            } else if (i2 == 340) {
                oaq oaq = (oaq) nzr.a(oaq.a);
                if (!(oaq == null || oaq.o == null)) {
                    return new fpb(nzr, oaq);
                }
            } else if (i2 == 339) {
                oak oak = (oak) nzr.a(oak.a);
                if (oak != null) {
                    return new fpc(nzr, oak);
                }
            } else if (i2 == 438) {
                oar oar = (oar) nzr.a(oar.a);
                if (!(oar == null || oar.X == null)) {
                    if (i == 3) {
                        return new fpe(nzr, oar);
                    }
                    return new fpa(nzr, oar);
                }
            } else if (i2 == 335) {
                obr obr = (obr) nzr.a(obr.a);
                if (obr != null) {
                    return new foz(nzr, obr);
                }
            } else {
                continue;
            }
        }
        glk.m17981d("Babel", "Received invalid attachment", new Object[0]);
        return null;
    }

    public foz(nzr nzr, String str, String str2, String str3, String str4, String str5) {
        String str6;
        this.f13624a = nzr.a;
        this.f13625b = !TextUtils.isEmpty(nzr.b) ? nzr.b : null;
        if (TextUtils.isEmpty(nzr.c)) {
            str6 = null;
        } else {
            str6 = nzr.c;
        }
        this.f13626c = str6;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f13627d = str;
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        this.f13628e = str2;
        if (TextUtils.isEmpty(str3)) {
            str3 = null;
        }
        this.f13629f = str3;
        if (TextUtils.isEmpty(str4)) {
            str4 = null;
        }
        this.f13630g = str4;
        this.f13631h = str5;
    }

    private foz(nzr nzr, obr obr) {
        this(nzr, obr.e, obr.f, foz.m15863a(obr.o), obr.c, "hangouts/*");
    }

    protected static String m15863a(nzr nzr) {
        if (nzr != null) {
            oak oak = (oak) nzr.a(oak.a);
            if (oak != null) {
                return oak.c;
            }
        }
        return null;
    }

    protected foz(int[] iArr, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f13624a = iArr;
        this.f13625b = str;
        this.f13626c = str2;
        this.f13627d = str3;
        this.f13628e = str4;
        this.f13629f = str5;
        this.f13630g = str6;
        this.f13631h = str7;
    }
}
