import android.content.Context;
import android.os.Handler;

final class gdw implements Runnable {
    final Context a;
    private final Handler b;

    gdw(Context context) {
        this.b = new Handler();
        this.a = context.getApplicationContext();
    }

    public void run() {
        this.b.post(new gdx(this));
    }
}
