package defpackage;

import android.content.Context;
import android.os.Handler;

final class gdw implements Runnable {
    final Context a;
    private final Handler b = new Handler();

    gdw(Context context) {
        this.a = context.getApplicationContext();
    }

    public void run() {
        this.b.post(new gdx(this));
    }
}
