import android.content.Context;
import android.os.Vibrator;
import android.view.View;

/* compiled from: PG */
final class aox implements Runnable {
    private /* synthetic */ aow a;

    aox(aow aow) {
        this.a = aow;
    }

    public final void run() {
        try {
            Context context;
            View b = this.a.a.b();
            if (b != null) {
                context = b.getContext();
            } else {
                context = null;
            }
            if (context != null) {
                Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200);
                }
            }
        } catch (Exception e) {
        }
    }
}
