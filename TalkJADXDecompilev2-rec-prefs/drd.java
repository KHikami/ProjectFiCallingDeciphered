package p000;

import android.content.Context;

public class drd extends fhb implements bhj, bhm {
    private final String f10383a;
    private final String f10384b = blo.m5900i();

    public drd(bko bko, String str) {
        super(bko);
        this.f10383a = str;
    }

    public int mo539a(Context context, bhb bhb) {
        m12530a();
        return bhn.f3348a;
    }

    public String mo542b() {
        return this.f10383a;
    }

    public bhk mo543c() {
        return bhk.NONE;
    }

    void m12530a() {
        if (!blo.m5871a(this.f10383a)) {
            this.f5736c.f12723c.m15078a(new drg(this.f10384b, this.f10383a), -1);
        }
    }
}
