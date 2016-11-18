package defpackage;

import android.content.Context;
import android.database.Cursor;

class egi extends fmz<fnb> {
    private final Context a;
    private final bck b;
    private final gou d;
    private final bxt e;

    protected /* bridge */ /* synthetic */ void a(aer aer, Cursor cursor, int i) {
        a(aer, (fnb) cursor);
    }

    egi(Context context, bck bck, int i, boolean z, boolean z2, fna fna, bxt bxt) {
        this(context, bck, i, z, z2, fna, gou.UNKNOWN, bxt);
    }

    egi(Context context, bck bck, int i, boolean z, boolean z2, fna fna, gou gou, bxt bxt) {
        super(i - 1, eey.f - 1, z, z2, fna);
        this.a = context;
        this.b = bck;
        this.d = gou;
        this.e = bxt;
    }

    public gou a() {
        return this.d;
    }

    protected void a(aer aer) {
    }

    protected void a(aer aer, fnb fnb) {
        gon gon = (gon) aer.a;
        gnl j = gon.j();
        gon.a(null);
        gon.k();
        bjg a = fnb.a();
        String j2 = this.b.j();
        a.a(j2);
        boolean c = this.b.c(this.a, a);
        gon.a(a, j2, this.b.b(this.a, a), this.e == bxt.SMS_MESSAGE, this.d);
        gon.a(c, false);
        gon.a(j);
    }
}
