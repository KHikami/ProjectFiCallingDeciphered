package p000;

import com.google.android.gms.common.ConnectionResult;
import java.util.Set;

final class fro implements gul {
    final /* synthetic */ frm f13823a;

    fro(frm frm) {
        this.f13823a = frm;
    }

    public void mo1151a(ConnectionResult connectionResult) {
        synchronized (this.f13823a.f13818c) {
            String valueOf = String.valueOf(connectionResult);
            glk.m17982e("Babel_medialoader", new StringBuilder(String.valueOf(valueOf).length() + 51).append("GmsAvatarLoader: People client connection failure: ").append(valueOf).toString(), new Object[0]);
            Set<fsr> set = this.f13823a.f13820e;
            this.f13823a.f13820e = null;
        }
        if (set != null) {
            for (fsr a : set) {
                this.f13823a.m16051a(a, null);
            }
        }
    }
}
