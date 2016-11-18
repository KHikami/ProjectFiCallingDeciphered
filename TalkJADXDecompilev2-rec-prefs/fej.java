package p000;

import java.util.ArrayList;
import java.util.List;

public final class fej extends fhb {
    public String f12903a;
    private String f12904b;
    private final boolean f12905g;
    private int f12906h;
    private final juh f12907i;
    private int f12908j;
    private int f12909k = 1;
    private final boy f12910l;
    private final boolean f12911m;
    private final String f12912n;

    public fej(bko bko, String str, juh juh, boy boy, boolean z, boolean z2, int i, String str2) {
        super(bko);
        this.f12904b = str;
        this.f12907i = juh;
        this.f12910l = boy;
        this.f12905g = z;
        this.f12911m = z2;
        this.f12908j = i;
        this.f12912n = str2;
    }

    public int u_() {
        return this.f12909k;
    }

    public Object v_() {
        return new fek(this.f12903a, this.f5736c.f12722b, this.f12906h, this.f12905g);
    }

    public void w_() {
        List a = gwb.m1685a(this.f5736c.f12722b, gwb.m1400H(), this.f12907i);
        List b = gwb.m2004b(this.f5736c.f12722b, this.f12907i);
        if (a.size() > 149) {
            this.f12909k = 4;
            return;
        }
        ArrayList arrayList = (ArrayList) a;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < size) {
            int i5 = i + 1;
            edk edk = (edk) arrayList.get(i);
            if (edk.f11212a == edq.PHONE) {
                i = 1;
            } else {
                i = 0;
            }
            i4 |= i;
            if (edk.f11212a == edq.CIRCLE || edk.f11212a == edq.PERSON) {
                i = 1;
            } else {
                i = 0;
            }
            i2 = edk.m13599i() | i2;
            i3 = i | i3;
            i = i5;
        }
        if (i3 == 0 || (i4 == 0 && i2 == 0)) {
            int i6;
            if (this.f12911m || a.size() > 1 || b.size() > 0) {
                i6 = 2;
            } else {
                i6 = 1;
            }
            this.f12906h = i6;
            List list = null;
            if (this.f12906h == 1) {
                bcn a2 = this.f12907i.m25214a(0);
                if (a2 != null) {
                    list = a2.m4893b().m14933a();
                }
            }
            this.f12903a = blf.m5754a(new blo(gwb.m1400H(), this.f5736c.f12721a), false, this.f12904b, a, b, list, this.f12910l, this.f12906h, this.f12908j, true, this.f5737d, this.f12912n);
            return;
        }
        this.f12909k = 2;
    }
}
