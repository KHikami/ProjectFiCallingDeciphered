import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PG */
final class gk extends Handler {
    private /* synthetic */ gj a;

    gk(gj gjVar, Looper looper) {
        this.a = gjVar;
        super(looper);
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case rq.b /*1*/:
                this.a.a();
            default:
                super.handleMessage(message);
        }
    }
}
