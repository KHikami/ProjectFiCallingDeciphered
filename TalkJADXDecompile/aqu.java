import android.os.Handler;
import android.os.Looper;

final class aqu {
    private boolean a;
    private final Handler b;

    aqu() {
        this.b = new Handler(Looper.getMainLooper(), new aqv());
    }

    public void a(aqr<?> aqr_) {
        baq.a();
        if (this.a) {
            this.b.obtainMessage(1, aqr_).sendToTarget();
            return;
        }
        this.a = true;
        aqr_.e();
        this.a = false;
    }
}
