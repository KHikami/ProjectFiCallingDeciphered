import android.app.Activity;
import android.content.IntentSender.SendIntentException;
import com.google.android.gms.common.ConnectionResult;

final class bru implements Runnable {
    private final int a;
    private final ConnectionResult b;
    private /* synthetic */ brs c;

    public bru(brs brs, int i, ConnectionResult connectionResult) {
        this.c = brs;
        this.a = i;
        this.b = connectionResult;
    }

    public final void run() {
        if (this.c.a && !this.c.W) {
            this.c.W = true;
            this.c.Z = this.a;
            this.c.aa = this.b;
            if (this.b.a()) {
                try {
                    int indexOf = ((this.c.e().d().d().indexOf(this.c) + 1) << 16) + 1;
                    ConnectionResult connectionResult = this.b;
                    Activity e = this.c.e();
                    if (connectionResult.a()) {
                        e.startIntentSenderForResult(connectionResult.d.getIntentSender(), indexOf, null, 0, 0, 0);
                    }
                } catch (SendIntentException e2) {
                    this.c.r();
                }
            } else if (this.c.q().a(this.b.c)) {
                this.c.a(this.a, this.b);
            } else if (this.b.c == 18) {
                this.c.b(this.a, this.b);
            } else {
                this.c.c(this.a, this.b);
            }
        }
    }
}
