import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class fpd implements Serializable {
    private static final long serialVersionUID = 1;
    public final int a;
    public final String b;
    public final int c;
    public final String d;
    public final Long e;
    public final String f;
    public final String g;
    public final String h;

    public static List<fpd> a(ofu[] ofuArr) {
        List<fpd> arrayList = new ArrayList();
        for (ofu fpd : ofuArr) {
            arrayList.add(new fpd(fpd));
        }
        return arrayList;
    }

    private fpd(ofu ofu) {
        this.a = gwb.a(ofu.a);
        this.b = ofu.b != null ? ofu.b : "";
        int i = 0;
        if (ofu.c != null) {
            if (gwb.b(ofu.c.a)) {
                i = 1;
            }
            if (gwb.b(ofu.c.b)) {
                i |= 2;
            }
            if (gwb.b(ofu.c.c)) {
                i |= 4;
            }
            if (gwb.b(ofu.c.d)) {
                i |= 8;
            }
        }
        this.c = i;
        if (ofu.d != null) {
            this.d = ofu.d.a;
        } else {
            this.d = null;
        }
        if (ofu.e != null) {
            this.e = Long.valueOf(gwb.a(ofu.e.a));
            this.f = ofu.e.b;
            this.g = ofu.e.c;
        } else {
            this.e = null;
            this.f = null;
            this.g = null;
        }
        if (ofu.f != null) {
            this.h = ofu.f.a;
        } else {
            this.h = null;
        }
    }

    public fpd(int i, String str, int i2, String str2, Long l, String str3, String str4, String str5) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = str2;
        this.e = null;
        this.f = str3;
        this.g = str4;
        this.h = null;
    }
}
