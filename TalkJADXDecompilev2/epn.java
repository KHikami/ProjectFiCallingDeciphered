package defpackage;

import android.net.Uri;
import android.util.Log;
import com.google.android.apps.hangouts.phone.ViewVCardActivity;

public final class epn implements Runnable {
    final /* synthetic */ Uri a;
    final /* synthetic */ ViewVCardActivity b;

    public epn(ViewVCardActivity viewVCardActivity, Uri uri) {
        this.b = viewVCardActivity;
        this.a = uri;
    }

    public void run() {
        boolean a;
        akn akl = new akl();
        akv akv = new akv();
        try {
            a = this.b.a(this.a, 0, akv, true, null);
        } catch (alb e) {
            try {
                a = this.b.a(this.a, akv.c(), akl, false, null);
            } catch (alb e2) {
                String valueOf = String.valueOf(e2);
                Log.e("Babel", new StringBuilder(String.valueOf(valueOf).length() + 21).append("Must not reach here. ").append(valueOf).toString());
                a = false;
            }
        }
        if (a) {
            this.b.a(this.a, akv);
        } else {
            this.b.u.post(new epo(this));
        }
    }
}
