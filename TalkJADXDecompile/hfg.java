import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class hfg extends Handler {
    final /* synthetic */ hfe a;

    hfg(hfe hfe, Looper looper) {
        this.a = hfe;
        super(looper);
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case wi.j /*1*/:
                hfe.b(this.a);
            case wi.l /*2*/:
                hfe.a(this.a);
            default:
                new StringBuilder(31).append("Unknown message id: ").append(message.what);
        }
    }
}
