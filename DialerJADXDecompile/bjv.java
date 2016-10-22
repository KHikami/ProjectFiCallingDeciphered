import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;

/* compiled from: PG */
final class bjv extends Handler {
    bjv(bju bju, Looper looper) {
        super(looper);
    }

    public final void handleMessage(Message message) {
        Pair pair;
        switch (message.what) {
            case rq.b /*1*/:
                pair = (Pair) message.obj;
                ((bek) pair.first).a((bel) pair.second);
            case rq.c /*2*/:
                pair = (Pair) message.obj;
                ((bej) pair.first).a((Bitmap) pair.second);
            default:
                super.handleMessage(message);
        }
    }
}
