import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class hgf extends Handler {
    final /* synthetic */ hge a;

    public hgf(hge hge, Looper looper) {
        this.a = hge;
        super(looper);
    }

    public void handleMessage(Message message) {
        boolean z = true;
        if (message.what != 1) {
            z = false;
        }
        gwb.b(z);
        this.a.b((hgg) message.obj);
    }
}
