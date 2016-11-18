package p000;

import android.text.TextUtils;
import java.io.Serializable;

public final class fpc extends foz implements Serializable {
    private static final long serialVersionUID = 1;
    public String f13637i;
    public String f13638j;
    public String f13639k;
    public final int f13640l;
    public final int f13641m;
    public int f13642n;
    public String f13643o;
    public String f13644p;

    public fpc(nzr nzr, obk obk) {
        String a;
        String str;
        String str2 = obk.i;
        int a2 = gwb.m1507a(obk.p);
        String str3 = obk.i;
        switch (a2) {
            case 1:
                a = ba.m4539a(str3, "image/*");
                break;
            case 2:
                a = ba.m4539a(str3, "video/*");
                if (!ba.m4630d(a)) {
                    a = "video/*";
                    break;
                }
                break;
            case 4:
                a = "image/gif";
                break;
            default:
                a = null;
                break;
        }
        super(nzr, null, null, str2, null, a);
        this.f13637i = !TextUtils.isEmpty(obk.f) ? obk.f : null;
        this.f13638j = obk.d;
        if (TextUtils.isEmpty(obk.e)) {
            str = null;
        } else {
            str = obk.e;
        }
        this.f13639k = str;
        if (obk.c != null) {
            this.f13640l = gwb.m1507a(obk.c.k);
            this.f13641m = gwb.m1507a(obk.c.l);
        } else {
            this.f13640l = 0;
            this.f13641m = 0;
        }
        this.f13642n = 1;
        this.f13644p = null;
        this.f13643o = null;
    }

    public fpc(nzr nzr, oak oak) {
        super(nzr, null, oak.f, oak.c, fpc.m15867a(oak.j), "image/image_search");
        oaa oaa = oak.h;
        if (oaa != null) {
            this.f13640l = gwb.m1507a(oaa.b);
            this.f13641m = gwb.m1507a(oaa.c);
        } else {
            this.f13640l = 0;
            this.f13641m = 0;
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
        this.f13644p = obv2 != null ? obv2.f : null;
        this.f13643o = obv2 != null ? obv2.e : null;
        this.f13637i = null;
        this.f13639k = null;
        this.f13642n = 1;
    }

    private static String m15867a(nzr[] nzrArr) {
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
        this.f13637i = str3;
        this.f13638j = null;
        this.f13639k = null;
        this.f13640l = i;
        this.f13641m = i2;
        this.f13642n = i3;
        this.f13644p = null;
        this.f13643o = null;
    }

    public String toString() {
        String str = this.b;
        String str2 = this.c;
        String str3 = this.f13637i;
        String str4 = this.f13638j;
        String str5 = this.f;
        int i = this.f13640l;
        int i2 = this.f13641m;
        String str6 = this.h;
        return new StringBuilder((((((String.valueOf(str).length() + 106) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()) + String.valueOf(str5).length()) + String.valueOf(str6).length()).append("id: ").append(str).append(" canonicalId ").append(str2).append(" photoId: ").append(str3).append(" photoOwnerId: ").append(str4).append(" imageUrl: ").append(str5).append(" width: ").append(i).append(" height: ").append(i2).append(" contentType: ").append(str6).toString();
    }
}
