import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
final class azt extends Handler {
    private /* synthetic */ azs a;

    azt(azs azs) {
        this.a = azs;
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case rq.b /*1*/:
                bdf.a((Object) this, "EVENT_DISCONNECTED_TIMEOUT ", message.obj);
                this.a.h((ayo) message.obj);
            default:
                bdf.f(this, "Message not expected: " + message.what);
        }
    }
}
