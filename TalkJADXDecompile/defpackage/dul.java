package defpackage;

import java.util.List;

/* renamed from: dul */
final class dul extends fip {
    final /* synthetic */ duk a;

    dul(duk duk) {
        this.a = duk;
    }

    public void a(int i, bko bko, fiu fiu) {
        String str = (String) this.a.b.remove(Integer.valueOf(i));
        if (str != null) {
            this.a.e(str);
        }
        duk duk = this.a;
        if (duk.e && duk.b.isEmpty()) {
            duk.a.b(duk.c);
            duk.e = false;
        }
    }

    public void a(int i, bko bko, fok fok, fdo fdo) {
        String str = (String) this.a.b.remove(Integer.valueOf(i));
        if (str != null) {
            duk duk = this.a;
            List<frj> c = duk.c(str);
            if (!(c == null || c.size() == 0)) {
                duk.d = false;
                for (frj frj : c) {
                    bkk bkk = (bkk) frj;
                    bkk.b.a(bkk);
                }
            }
        }
        duk duk2 = this.a;
        if (duk2.e && duk2.b.isEmpty()) {
            duk2.a.b(duk2.c);
            duk2.e = false;
        }
    }
}
