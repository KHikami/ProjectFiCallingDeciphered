package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

abstract class gvp extends gvt<Boolean> {
    public final int f16245a;
    public final Bundle f16246b;
    final /* synthetic */ gvo f16247c;

    protected gvp(gvo gvo, int i, Bundle bundle) {
        this.f16247c = gvo;
        super(gvo, Boolean.valueOf(true));
        this.f16245a = i;
        this.f16246b = bundle;
    }

    protected abstract void mo2353a(ConnectionResult connectionResult);

    protected void m18729a(Boolean bool) {
        PendingIntent pendingIntent = null;
        if (bool == null) {
            this.f16247c.m18683a(1, null);
            return;
        }
        switch (this.f16245a) {
            case 0:
                if (!mo2354a()) {
                    this.f16247c.m18683a(1, null);
                    mo2353a(new ConnectionResult(8, null));
                    return;
                }
                return;
            case 10:
                this.f16247c.m18683a(1, null);
                throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
            default:
                this.f16247c.m18683a(1, null);
                if (this.f16246b != null) {
                    pendingIntent = (PendingIntent) this.f16246b.getParcelable("pendingIntent");
                }
                mo2353a(new ConnectionResult(this.f16245a, pendingIntent));
                return;
        }
    }

    protected /* synthetic */ void mo2349a(Object obj) {
        m18729a((Boolean) obj);
    }

    protected abstract boolean mo2354a();
}
