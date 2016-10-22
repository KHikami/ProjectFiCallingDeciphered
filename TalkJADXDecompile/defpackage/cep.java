package defpackage;

import android.widget.Toast;

/* renamed from: cep */
final class cep implements bxq {
    final /* synthetic */ cdr a;

    cep(cdr cdr) {
        this.a = cdr;
    }

    public void a() {
        gwb.x(this.a.getView());
    }

    public void b() {
        this.a.b(false);
    }

    public void c() {
        this.a.b(true);
    }

    public void a(bxo bxo) {
        bpd a = this.a.i.a();
        if (a != null && bxo == bxo.STICKER) {
            dsk dsk = dsk.STICKER;
            String str = a.e;
            if (a.h != null) {
                str = gwb.a(this.a.context, a.h, true);
            }
            if (a.e != null) {
                ((dsi) this.a.binder.a(dsi.class)).a(this.a.context, this.a.getFragmentManager(), str, a.e, a.a, dsk);
            } else {
                Toast.makeText(this.a.context, gwb.md, 0).show();
            }
        }
    }
}
