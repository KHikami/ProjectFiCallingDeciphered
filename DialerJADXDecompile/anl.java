import android.database.ContentObserver;
import android.os.Handler;

/* compiled from: PG */
final class anl extends ContentObserver {
    private /* synthetic */ ank a;

    anl(ank ank, Handler handler) {
        this.a = ank;
        super(handler);
    }

    public final boolean deliverSelfNotifications() {
        return true;
    }

    public final void onChange(boolean z) {
        this.a.b();
    }
}
