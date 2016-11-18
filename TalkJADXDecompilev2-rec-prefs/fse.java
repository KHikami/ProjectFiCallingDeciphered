package p000;

import com.google.android.gms.common.api.Status;

final class fse implements guq<hrx> {
    final /* synthetic */ fsb f13889a;

    fse(fsb fsb) {
        this.f13889a = fsb;
    }

    private void m16120a(hrx hrx) {
        Object a = hrx.mo2555a();
        Status k = hrx.mo1279k();
        if (glk.m17973a("Babel", 3)) {
            String valueOf = String.valueOf(k);
            String valueOf2 = String.valueOf(a);
            glk.m17970a("Babel", new StringBuilder((String.valueOf(valueOf).length() + 51) + String.valueOf(valueOf2).length()).append("Aggregated people loaded: status=").append(valueOf).append(" aggregatedPeople=").append(valueOf2).toString(), new Object[0]);
        }
        if (this.f13889a.f13882d) {
            a.mo2073b();
            return;
        }
        if (k.m9663d()) {
            iil.m21877b(this.f13889a.f13880b, a);
        }
        this.f13889a.f13880b = a;
        if (!k.m9663d()) {
            return;
        }
        if (this.f13889a.f13879a != null) {
            this.f13889a.f13879a.mo1473a(this.f13889a, new fsw(a), null);
            return;
        }
        a.mo2073b();
    }
}
