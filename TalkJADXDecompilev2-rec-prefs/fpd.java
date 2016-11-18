package p000;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class fpd implements Serializable {
    private static final long serialVersionUID = 1;
    public final int f13645a;
    public final String f13646b;
    public final int f13647c;
    public final String f13648d;
    public final Long f13649e;
    public final String f13650f;
    public final String f13651g;
    public final String f13652h;

    public static List<fpd> m15868a(ofu[] ofuArr) {
        List<fpd> arrayList = new ArrayList();
        for (ofu fpd : ofuArr) {
            arrayList.add(new fpd(fpd));
        }
        return arrayList;
    }

    private fpd(ofu ofu) {
        this.f13645a = gwb.m1507a(ofu.a);
        this.f13646b = ofu.b != null ? ofu.b : "";
        int i = 0;
        if (ofu.c != null) {
            if (gwb.m2061b(ofu.c.a)) {
                i = 1;
            }
            if (gwb.m2061b(ofu.c.b)) {
                i |= 2;
            }
            if (gwb.m2061b(ofu.c.c)) {
                i |= 4;
            }
            if (gwb.m2061b(ofu.c.d)) {
                i |= 8;
            }
        }
        this.f13647c = i;
        if (ofu.d != null) {
            this.f13648d = ofu.d.a;
        } else {
            this.f13648d = null;
        }
        if (ofu.e != null) {
            this.f13649e = Long.valueOf(gwb.m1523a(ofu.e.a));
            this.f13650f = ofu.e.b;
            this.f13651g = ofu.e.c;
        } else {
            this.f13649e = null;
            this.f13650f = null;
            this.f13651g = null;
        }
        if (ofu.f != null) {
            this.f13652h = ofu.f.a;
        } else {
            this.f13652h = null;
        }
    }

    public fpd(int i, String str, int i2, String str2, Long l, String str3, String str4, String str5) {
        this.f13645a = i;
        this.f13646b = str;
        this.f13647c = i2;
        this.f13648d = str2;
        this.f13649e = null;
        this.f13650f = str3;
        this.f13651g = str4;
        this.f13652h = null;
    }
}
