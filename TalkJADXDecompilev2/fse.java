package defpackage;

import com.google.android.gms.common.api.Status;

final class fse implements guq<hrx> {
    final /* synthetic */ fsb a;

    fse(fsb fsb) {
        this.a = fsb;
    }

    private void a(hrx hrx) {
        Object a = hrx.a();
        Status k = hrx.k();
        if (glk.a("Babel", 3)) {
            String valueOf = String.valueOf(k);
            String valueOf2 = String.valueOf(a);
            glk.a("Babel", new StringBuilder((String.valueOf(valueOf).length() + 51) + String.valueOf(valueOf2).length()).append("Aggregated people loaded: status=").append(valueOf).append(" aggregatedPeople=").append(valueOf2).toString(), new Object[0]);
        }
        if (this.a.d) {
            a.b();
            return;
        }
        if (k.d()) {
            iil.b(this.a.b, a);
        }
        this.a.b = a;
        if (!k.d()) {
            return;
        }
        if (this.a.a != null) {
            this.a.a.a(this.a, new fsw(a), null);
            return;
        }
        a.b();
    }
}
