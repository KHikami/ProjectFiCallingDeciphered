package p000;

import android.content.Intent;

final class gzd implements Runnable {
    final /* synthetic */ Intent f16417a;
    final /* synthetic */ gzc f16418b;

    gzd(gzc gzc, Intent intent) {
        this.f16418b = gzc;
        this.f16417a = intent;
    }

    public void run() {
        gzc.m8975a(this.f16418b, this.f16417a);
    }
}
