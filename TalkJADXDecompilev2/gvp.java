package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

abstract class gvp extends gvt<Boolean> {
    public final int a;
    public final Bundle b;
    final /* synthetic */ gvo c;

    protected gvp(gvo gvo, int i, Bundle bundle) {
        this.c = gvo;
        super(gvo, Boolean.valueOf(true));
        this.a = i;
        this.b = bundle;
    }

    protected abstract void a(ConnectionResult connectionResult);

    protected void a(Boolean bool) {
        PendingIntent pendingIntent = null;
        if (bool == null) {
            this.c.a(1, null);
            return;
        }
        switch (this.a) {
            case 0:
                if (!a()) {
                    this.c.a(1, null);
                    a(new ConnectionResult(8, null));
                    return;
                }
                return;
            case 10:
                this.c.a(1, null);
                throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
            default:
                this.c.a(1, null);
                if (this.b != null) {
                    pendingIntent = (PendingIntent) this.b.getParcelable("pendingIntent");
                }
                a(new ConnectionResult(this.a, pendingIntent));
                return;
        }
    }

    protected /* synthetic */ void a(Object obj) {
        a((Boolean) obj);
    }

    protected abstract boolean a();
}
