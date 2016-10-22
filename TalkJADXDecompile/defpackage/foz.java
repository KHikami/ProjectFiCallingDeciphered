package defpackage;

import android.text.TextUtils;
import java.io.Serializable;
import nzr;
import oak;
import oaq;
import oar;
import obk;
import obr;
import ofm;

/* renamed from: foz */
public class foz implements Serializable {
    private static final long serialVersionUID = 1;
    public final int[] a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    static foz a(ofm ofm, int i) {
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
        glk.d("Babel", "Received invalid attachment", new Object[0]);
        return null;
    }

    public foz(nzr nzr, String str, String str2, String str3, String str4, String str5) {
        String str6;
        this.a = nzr.a;
        this.b = !TextUtils.isEmpty(nzr.b) ? nzr.b : null;
        if (TextUtils.isEmpty(nzr.c)) {
            str6 = null;
        } else {
            str6 = nzr.c;
        }
        this.c = str6;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.d = str;
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        this.e = str2;
        if (TextUtils.isEmpty(str3)) {
            str3 = null;
        }
        this.f = str3;
        if (TextUtils.isEmpty(str4)) {
            str4 = null;
        }
        this.g = str4;
        this.h = str5;
    }

    private foz(nzr nzr, obr obr) {
        this(nzr, obr.e, obr.f, foz.a(obr.o), obr.c, "hangouts/*");
    }

    protected static String a(nzr nzr) {
        if (nzr != null) {
            oak oak = (oak) nzr.a(oak.a);
            if (oak != null) {
                return oak.c;
            }
        }
        return null;
    }

    protected foz(int[] iArr, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = iArr;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
    }
}
