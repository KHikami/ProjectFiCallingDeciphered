package p000;

import android.widget.Toast;

final class cep implements bxq {
    final /* synthetic */ cdr f5133a;

    cep(cdr cdr) {
        this.f5133a = cdr;
    }

    public void mo894a() {
        gwb.m2386x(this.f5133a.getView());
    }

    public void mo896b() {
        this.f5133a.m7400b(false);
    }

    public void mo897c() {
        this.f5133a.m7400b(true);
    }

    public void mo895a(bxo bxo) {
        bpd a = this.f5133a.f5106i.mo931a();
        if (a != null && bxo == bxo.STICKER) {
            dsk dsk = dsk.STICKER;
            String str = a.f4150e;
            if (a.f4153h != null) {
                str = gwb.m1648a(this.f5133a.context, a.f4153h, true);
            }
            if (a.f4150e != null) {
                ((dsi) this.f5133a.binder.m25443a(dsi.class)).mo1660a(this.f5133a.context, this.f5133a.getFragmentManager(), str, a.f4150e, a.f4146a, dsk);
            } else {
                Toast.makeText(this.f5133a.context, gwb.md, 0).show();
            }
        }
    }
}
