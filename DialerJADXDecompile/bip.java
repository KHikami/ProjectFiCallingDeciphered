import android.app.PendingIntent;
import com.google.android.apps.dialer.incallui.InCallUiControllerService;

/* compiled from: PG */
public final class bip implements bcv, bcw {
    private bcj a;
    private PendingIntent b;

    bip(bcj bcj, PendingIntent pendingIntent) {
        this.a = bcj;
        this.b = pendingIntent;
        this.a.a((bcv) this);
        this.a.a((bcw) this);
    }

    public final void a(boolean z) {
        bdf.d(this, "onUiShowing");
        a();
    }

    public final void a(bcu bcu, bcu bcu2, azs azs) {
        bdf.d(this, "onStateChanged");
        a();
    }

    final void a() {
        bdf.d(this, "evaluateShowDialog");
        if (this.a.o != bcu.PENDING_OUTGOING && this.a.d()) {
            try {
                bdf.d(this, "evaluateShowDialog, showing dialog");
                this.b.send();
            } catch (Exception e) {
                bdf.a((Object) this, "Unable to show requested dialog", e);
            }
            b();
        }
    }

    public final void b() {
        this.a.b((bcv) this);
        this.a.c.remove(this);
        InCallUiControllerService.a.remove(this);
    }
}
