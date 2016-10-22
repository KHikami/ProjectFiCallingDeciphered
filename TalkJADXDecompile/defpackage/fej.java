package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: fej */
public final class fej extends fhb {
    public String a;
    private String b;
    private final boolean g;
    private int h;
    private final juh i;
    private int j;
    private int k;
    private final boy l;
    private final boolean m;
    private final String n;

    public fej(bko bko, String str, juh juh, boy boy, boolean z, boolean z2, int i, String str2) {
        super(bko);
        this.b = str;
        this.i = juh;
        this.l = boy;
        this.g = z;
        this.k = 1;
        this.m = z2;
        this.j = i;
        this.n = str2;
    }

    public int u_() {
        return this.k;
    }

    public Object v_() {
        return new fek(this.a, this.c.b, this.h, this.g);
    }

    public void w_() {
        List a = gwb.a(this.c.b, gwb.H(), this.i);
        List b = gwb.b(this.c.b, this.i);
        if (a.size() > 149) {
            this.k = 4;
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
            if (edk.a == edq.PHONE) {
                i = 1;
            } else {
                i = 0;
            }
            i4 |= i;
            if (edk.a == edq.CIRCLE || edk.a == edq.PERSON) {
                i = 1;
            } else {
                i = 0;
            }
            i2 = edk.i() | i2;
            i3 = i | i3;
            i = i5;
        }
        if (i3 == 0 || (i4 == 0 && i2 == 0)) {
            int i6;
            if (this.m || a.size() > 1 || b.size() > 0) {
                i6 = 2;
            } else {
                i6 = 1;
            }
            this.h = i6;
            List list = null;
            if (this.h == 1) {
                bcn a2 = this.i.a(0);
                if (a2 != null) {
                    list = a2.b().a();
                }
            }
            this.a = blf.a(new blo(gwb.H(), this.c.a), false, this.b, a, b, list, this.l, this.h, this.j, true, this.d, this.n);
            return;
        }
        this.k = 2;
    }
}
