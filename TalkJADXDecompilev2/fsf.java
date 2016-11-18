package defpackage;

import com.google.android.gms.common.api.Status;

final class fsf implements guq<hsb> {
    final /* synthetic */ fsb a;

    fsf(fsb fsb) {
        this.a = fsb;
    }

    private void a(hsb hsb) {
        Object a = hsb.a();
        Status k = hsb.k();
        if (glk.a("Babel", 3)) {
            String valueOf = String.valueOf(k);
            String valueOf2 = String.valueOf(a);
            glk.a("Babel", new StringBuilder((String.valueOf(valueOf).length() + 45) + String.valueOf(valueOf2).length()).append("Non aggregated people loaded: status=").append(valueOf).append(" people=").append(valueOf2).toString(), new Object[0]);
        }
        if (this.a.d) {
            a.b();
            return;
        }
        if (k.d()) {
            iil.b(this.a.c, a);
        }
        this.a.c = a;
        if (!k.d()) {
            return;
        }
        if (this.a.a != null) {
            this.a.a.a(this.a, null, a);
        } else {
            a.b();
        }
    }
}
