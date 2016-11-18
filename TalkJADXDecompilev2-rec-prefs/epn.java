package p000;

import android.net.Uri;
import android.util.Log;
import com.google.android.apps.hangouts.phone.ViewVCardActivity;

public final class epn implements Runnable {
    final /* synthetic */ Uri f11992a;
    final /* synthetic */ ViewVCardActivity f11993b;

    public epn(ViewVCardActivity viewVCardActivity, Uri uri) {
        this.f11993b = viewVCardActivity;
        this.f11992a = uri;
    }

    public void run() {
        boolean a;
        akn akl = new akl();
        akv akv = new akv();
        try {
            a = this.f11993b.m8960a(this.f11992a, 0, akv, true, null);
        } catch (alb e) {
            try {
                a = this.f11993b.m8960a(this.f11992a, akv.m2811c(), akl, false, null);
            } catch (alb e2) {
                String valueOf = String.valueOf(e2);
                Log.e("Babel", new StringBuilder(String.valueOf(valueOf).length() + 21).append("Must not reach here. ").append(valueOf).toString());
                a = false;
            }
        }
        if (a) {
            this.f11993b.m8963a(this.f11992a, akv);
        } else {
            this.f11993b.f6711u.post(new epo(this));
        }
    }
}
