import com.google.android.gms.common.ConnectionResult;
import java.util.Set;

final class fro implements gul {
    final /* synthetic */ frm a;

    fro(frm frm) {
        this.a = frm;
    }

    public void a(ConnectionResult connectionResult) {
        synchronized (this.a.c) {
            String valueOf = String.valueOf(connectionResult);
            glk.e("Babel_medialoader", new StringBuilder(String.valueOf(valueOf).length() + 51).append("GmsAvatarLoader: People client connection failure: ").append(valueOf).toString(), new Object[0]);
            Set<fsr> set = this.a.e;
            this.a.e = null;
        }
        if (set != null) {
            for (fsr a : set) {
                this.a.a(a, null);
            }
        }
    }
}
