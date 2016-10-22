import android.os.Handler;
import android.os.Looper;

final class iun extends iui {
    private Handler a;

    public iun(Looper looper) {
        this.a = new Handler(looper);
    }

    public void a(iuk iuk) {
        this.a.postDelayed(iuk.b(), 0);
    }

    public void b(iuk iuk) {
        this.a.removeCallbacks(iuk.b());
    }
}
