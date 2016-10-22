import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

final class bqt extends Handler {
    private final Context a;

    bqt(Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.a = context.getApplicationContext();
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case rq.b /*1*/:
                int a = bqs.a(this.a);
                if (bqs.a(a)) {
                    bqs.c(a, this.a);
                }
            default:
                Log.w("GooglePlayServicesUtil", "Don't know how to handle this message: " + message.what);
        }
    }
}
