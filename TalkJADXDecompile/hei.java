import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;

public final class hei<R extends gup> extends Handler {
    public hei() {
        this(Looper.getMainLooper());
    }

    public hei(Looper looper) {
        super(looper);
    }

    public void a() {
        removeMessages(2);
    }

    public void a(guq<? super R> guq__super_R, R r) {
        sendMessage(obtainMessage(1, new Pair(guq__super_R, r)));
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case wi.j /*1*/:
                Pair pair = (Pair) message.obj;
                guq guq = (guq) pair.first;
                gup gup = (gup) pair.second;
                try {
                    guq.a(gup);
                } catch (RuntimeException e) {
                    heg.b(gup);
                    throw e;
                }
            case wi.l /*2*/:
                ((heg) message.obj).d(Status.d);
            default:
                Log.wtf("BasePendingResult", "Don't know how to handle message: " + message.what, new Exception());
        }
    }
}
