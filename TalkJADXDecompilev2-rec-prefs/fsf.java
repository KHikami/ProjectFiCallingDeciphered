package p000;

import com.google.android.gms.common.api.Status;

final class fsf implements guq<hsb> {
    final /* synthetic */ fsb f13890a;

    fsf(fsb fsb) {
        this.f13890a = fsb;
    }

    private void m16122a(hsb hsb) {
        Object a = hsb.mo2554a();
        Status k = hsb.mo1279k();
        if (glk.m17973a("Babel", 3)) {
            String valueOf = String.valueOf(k);
            String valueOf2 = String.valueOf(a);
            glk.m17970a("Babel", new StringBuilder((String.valueOf(valueOf).length() + 45) + String.valueOf(valueOf2).length()).append("Non aggregated people loaded: status=").append(valueOf).append(" people=").append(valueOf2).toString(), new Object[0]);
        }
        if (this.f13890a.f13882d) {
            a.mo2073b();
            return;
        }
        if (k.m9663d()) {
            iil.m21877b(this.f13890a.f13881c, a);
        }
        this.f13890a.f13881c = a;
        if (!k.m9663d()) {
            return;
        }
        if (this.f13890a.f13879a != null) {
            this.f13890a.f13879a.mo1473a(this.f13890a, null, a);
        } else {
            a.mo2073b();
        }
    }
}
