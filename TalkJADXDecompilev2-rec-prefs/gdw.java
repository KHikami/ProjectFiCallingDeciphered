package p000;

import android.content.Context;
import android.os.Handler;

final class gdw implements Runnable {
    final Context f14804a;
    private final Handler f14805b = new Handler();

    gdw(Context context) {
        this.f14804a = context.getApplicationContext();
    }

    public void run() {
        this.f14805b.post(new gdx(this));
    }
}
