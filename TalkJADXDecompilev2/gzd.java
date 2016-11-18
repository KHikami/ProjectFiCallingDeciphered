package defpackage;

import android.content.Intent;

final class gzd implements Runnable {
    final /* synthetic */ Intent a;
    final /* synthetic */ gzc b;

    gzd(gzc gzc, Intent intent) {
        this.b = gzc;
        this.a = intent;
    }

    public void run() {
        gzc.a(this.b, this.a);
    }
}
