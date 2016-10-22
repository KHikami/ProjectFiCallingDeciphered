import android.text.Html;

public final class flc extends fld {
    private final String l;

    public flc(fph fph) {
        super(fph.a(), fph.b(), fph.c(), fph.j(), fph.i(), fph.m(), fph.k(), fph.l(), fph.n(), fwx.ON_SERVER, fph.o());
        this.l = Html.fromHtml(fph.d).toString();
    }

    public flc(String str, edo edo, long j, long j2, String str2, String str3, String str4, fwx fwx) {
        super(str, edo, j, j2, str2, null, -1, 1, 0, fwx, null);
        this.l = Html.fromHtml(str4).toString();
    }

    public void a(blo blo, fhc fhc) {
        blo.a();
        try {
            c(blo, fhc);
            a(blo);
            if (this.l != null) {
                blo.c(this.f, this.l);
            }
            blo.b();
        } finally {
            blo.c();
        }
    }

    public void b(blo blo, fhc fhc) {
        c(blo, fhc);
        a(blo);
    }

    private void c(blo blo, fhc fhc) {
        if (this.l != null) {
            long a = blo.a(this.f, this.a, this.k, this.g, fwy.CONVERSATION_RENAME, this.h, this.i, 0, this.c, this.l, null);
            blo.a(this.f, this.h, this.i, 5, this.g, a, this.k, this.l, null);
            blf.d(blo, this.f);
            fhc.a(this.h);
        }
    }
}
