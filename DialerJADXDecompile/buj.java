import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

abstract class buj extends bul {
    private int c;
    private Bundle d;
    private /* synthetic */ bui e;

    protected buj(bui bui, int i, Bundle bundle) {
        this.e = bui;
        super(bui, Boolean.valueOf(true));
        this.c = i;
        this.d = bundle;
    }

    protected abstract void a(ConnectionResult connectionResult);

    protected final /* synthetic */ void a(Object obj) {
        PendingIntent pendingIntent = null;
        if (((Boolean) obj) == null) {
            this.e.a(1, null);
            return;
        }
        switch (this.c) {
            case rl.c /*0*/:
                if (!a()) {
                    this.e.a(1, null);
                    a(new ConnectionResult(8, null));
                }
            case rl.m /*10*/:
                this.e.a(1, null);
                throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
            default:
                this.e.a(1, null);
                if (this.d != null) {
                    pendingIntent = (PendingIntent) this.d.getParcelable("pendingIntent");
                }
                a(new ConnectionResult(this.c, pendingIntent));
        }
    }

    protected abstract boolean a();

    protected final void b() {
    }
}
