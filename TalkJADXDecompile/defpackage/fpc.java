package defpackage;

import android.text.TextUtils;
import java.io.Serializable;
import nzr;
import oaa;
import oak;
import obk;
import obv;

/* renamed from: fpc */
public final class fpc extends foz implements Serializable {
    private static final long serialVersionUID = 1;
    public String i;
    public String j;
    public String k;
    public final int l;
    public final int m;
    public int n;
    public String o;
    public String p;

    public fpc(nzr nzr, obk obk) {
        String a;
        String str;
        String str2 = obk.i;
        int a2 = gwb.a(obk.p);
        String str3 = obk.i;
        switch (a2) {
            case wi.j /*1*/:
                a = ba.a(str3, "image/*");
                break;
            case wi.l /*2*/:
                a = ba.a(str3, "video/*");
                if (!ba.d(a)) {
                    a = "video/*";
                    break;
                }
                break;
            case wi.h /*4*/:
                a = "image/gif";
                break;
            default:
                a = null;
                break;
        }
        super(nzr, null, null, str2, null, a);
        this.i = !TextUtils.isEmpty(obk.f) ? obk.f : null;
        this.j = obk.d;
        if (TextUtils.isEmpty(obk.e)) {
            str = null;
        } else {
            str = obk.e;
        }
        this.k = str;
        if (obk.c != null) {
            this.l = gwb.a(obk.c.k);
            this.m = gwb.a(obk.c.l);
        } else {
            this.l = 0;
            this.m = 0;
        }
        this.n = 1;
        this.p = null;
        this.o = null;
    }

    public fpc(nzr nzr, oak oak) {
        super(nzr, null, oak.f, oak.c, fpc.a(oak.j), "image/image_search");
        oaa oaa = oak.h;
        if (oaa != null) {
            this.l = gwb.a(oaa.b);
            this.m = gwb.a(oaa.c);
        } else {
            this.l = 0;
            this.m = 0;
        }
        obv obv = null;
        Object obj = null;
        for (nzr nzr2 : oak.j) {
            for (int i : nzr2.a) {
                if (i == 337) {
                    obv = (obv) nzr2.a(obv.a);
                    if (obv != null) {
                        obj = 1;
                        break;
                    }
                }
            }
            if (obj != null) {
                break;
            }
        }
        obv obv2 = obv;
        this.p = obv2 != null ? obv2.f : null;
        this.o = obv2 != null ? obv2.e : null;
        this.i = null;
        this.k = null;
        this.n = 1;
    }

    private static String a(nzr[] nzrArr) {
        for (nzr nzr : nzrArr) {
            for (int i : nzr.a) {
                if (i == 337) {
                    obv obv = (obv) nzr.a(obv.a);
                    if (obv != null) {
                        return obv.c;
                    }
                }
            }
        }
        return null;
    }

    public fpc(int[] iArr, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, String str7, int i3, String str8, String str9, String str10, String str11) {
        super(iArr, null, null, null, null, str6, null, str7);
        this.i = str3;
        this.j = null;
        this.k = null;
        this.l = i;
        this.m = i2;
        this.n = i3;
        this.p = null;
        this.o = null;
    }

    public String toString() {
        String str = this.b;
        String str2 = this.c;
        String str3 = this.i;
        String str4 = this.j;
        String str5 = this.f;
        int i = this.l;
        int i2 = this.m;
        String str6 = this.h;
        return new StringBuilder((((((String.valueOf(str).length() + 106) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()) + String.valueOf(str5).length()) + String.valueOf(str6).length()).append("id: ").append(str).append(" canonicalId ").append(str2).append(" photoId: ").append(str3).append(" photoOwnerId: ").append(str4).append(" imageUrl: ").append(str5).append(" width: ").append(i).append(" height: ").append(i2).append(" contentType: ").append(str6).toString();
    }
}
