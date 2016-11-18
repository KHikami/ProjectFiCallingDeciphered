package p000;

import android.text.Html;

public final class flc extends fld {
    private final String f13369l;

    public flc(fph fph) {
        super(fph.m15827a(), fph.m15831b(), fph.m15832c(), fph.m15843j(), fph.m15842i(), fph.m15846m(), fph.m15844k(), fph.m15845l(), fph.m15847n(), fwx.ON_SERVER, fph.m15848o());
        this.f13369l = Html.fromHtml(fph.f13682d).toString();
    }

    public flc(String str, edo edo, long j, long j2, String str2, String str3, String str4, fwx fwx) {
        super(str, edo, j, j2, str2, null, -1, 1, 0, fwx, null);
        this.f13369l = Html.fromHtml(str4).toString();
    }

    public void m15601a(blo blo, fhc fhc) {
        blo.m5958a();
        try {
            m15600c(blo, fhc);
            m15599a(blo);
            if (this.f13369l != null) {
                blo.m6030c(this.f, this.f13369l);
            }
            blo.m6015b();
        } finally {
            blo.m6028c();
        }
    }

    public void m15602b(blo blo, fhc fhc) {
        m15600c(blo, fhc);
        m15599a(blo);
    }

    private void m15600c(blo blo, fhc fhc) {
        if (this.f13369l != null) {
            long a = blo.m5942a(this.f, this.a, this.k, this.g, fwy.CONVERSATION_RENAME, this.h, this.i, 0, this.c, this.f13369l, null);
            blo.m6004a(this.f, this.h, this.i, 5, this.g, a, this.k, this.f13369l, null);
            blf.m5821d(blo, this.f);
            fhc.m15305a(this.h);
        }
    }
}
