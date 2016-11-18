package p000;

import java.util.List;

final class dul extends fip {
    final /* synthetic */ duk f10572a;

    dul(duk duk) {
        this.f10572a = duk;
    }

    public void mo610a(int i, bko bko, fiu fiu) {
        String str = (String) this.f10572a.f10565b.remove(Integer.valueOf(i));
        if (str != null) {
            this.f10572a.m12722e(str);
        }
        duk duk = this.f10572a;
        if (duk.f10568e && duk.f10565b.isEmpty()) {
            duk.f10564a.mo2016b(duk.f10566c);
            duk.f10568e = false;
        }
    }

    public void mo640a(int i, bko bko, fok fok, fdo fdo) {
        String str = (String) this.f10572a.f10565b.remove(Integer.valueOf(i));
        if (str != null) {
            duk duk = this.f10572a;
            List<frj> c = duk.m12716c(str);
            if (!(c == null || c.size() == 0)) {
                duk.f10567d = false;
                for (frj frj : c) {
                    bkk bkk = (bkk) frj;
                    bkk.f3625b.mo1115a(bkk);
                }
            }
        }
        duk duk2 = this.f10572a;
        if (duk2.f10568e && duk2.f10565b.isEmpty()) {
            duk2.f10564a.mo2016b(duk2.f10566c);
            duk2.f10568e = false;
        }
    }
}
