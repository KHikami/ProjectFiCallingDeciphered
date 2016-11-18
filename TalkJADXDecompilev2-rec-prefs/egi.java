package p000;

import android.content.Context;
import android.database.Cursor;

class egi extends fmz<fnb> {
    private final Context f11412a;
    private final bck f11413b;
    private final gou f11414d;
    private final bxt f11415e;

    protected /* bridge */ /* synthetic */ void mo1862a(aer aer, Cursor cursor, int i) {
        m13843a(aer, (fnb) cursor);
    }

    egi(Context context, bck bck, int i, boolean z, boolean z2, fna fna, bxt bxt) {
        this(context, bck, i, z, z2, fna, gou.UNKNOWN, bxt);
    }

    egi(Context context, bck bck, int i, boolean z, boolean z2, fna fna, gou gou, bxt bxt) {
        super(i - 1, eey.f11328f - 1, z, z2, fna);
        this.f11412a = context;
        this.f11413b = bck;
        this.f11414d = gou;
        this.f11415e = bxt;
    }

    public gou mo1872a() {
        return this.f11414d;
    }

    protected void mo1861a(aer aer) {
    }

    protected void m13843a(aer aer, fnb fnb) {
        gon gon = (gon) aer.f438a;
        gnl j = gon.m18168j();
        gon.m18165a(null);
        gon.mo2312k();
        bjg a = fnb.mo592a();
        String j2 = this.f11413b.m4881j();
        a.m5382a(j2);
        boolean c = this.f11413b.m4872c(this.f11412a, a);
        gon.m18228a(a, j2, this.f11413b.m4870b(this.f11412a, a), this.f11415e == bxt.SMS_MESSAGE, this.f11414d);
        gon.mo2311a(c, false);
        gon.m18165a(j);
    }
}
