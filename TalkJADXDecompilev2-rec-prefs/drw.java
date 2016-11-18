package p000;

import android.content.Context;

public class drw extends fhb implements bhj, bhm {
    private final int f10413a;
    private final String f10414b;
    private final String f10415g = blo.m5900i();

    public drw(bko bko, String str, int i) {
        super(bko);
        this.f10413a = i;
        this.f10414b = str;
    }

    public int mo539a(Context context, bhb bhb) {
        blo blo = new blo(context, this.f5736c.f12721a);
        if (this.f10413a == 2) {
            blo.m6040d(this.f10414b, "");
        }
        m12582a();
        blf.m5821d(blo, this.f10414b);
        return bhn.f3348a;
    }

    public String mo542b() {
        return this.f10414b;
    }

    public bhk mo543c() {
        return bhk.NONE;
    }

    void m12582a() {
        if (!blo.m5871a(this.f10414b)) {
            this.f5736c.f12723c.m15078a(new drp(this.f10415g, this.f10414b, this.f10413a), -1);
        }
    }
}
