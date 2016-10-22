package defpackage;

import android.content.Context;

/* renamed from: drw */
public class drw extends fhb implements bhj, bhm {
    private final int a;
    private final String b;
    private final String g;

    public drw(bko bko, String str, int i) {
        super(bko);
        this.a = i;
        this.b = str;
        this.g = blo.i();
    }

    public int a(Context context, bhb bhb) {
        blo blo = new blo(context, this.c.a);
        if (this.a == 2) {
            blo.d(this.b, "");
        }
        a();
        blf.d(blo, this.b);
        return bhn.a;
    }

    public String b() {
        return this.b;
    }

    public bhk c() {
        return bhk.NONE;
    }

    void a() {
        if (!blo.a(this.b)) {
            this.c.c.a(new drp(this.g, this.b, this.a), -1);
        }
    }
}
