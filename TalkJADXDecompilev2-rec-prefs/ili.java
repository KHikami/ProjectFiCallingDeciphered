package p000;

import android.os.Looper;
import android.os.MessageQueue.IdleHandler;

final class ili implements IdleHandler {
    final /* synthetic */ ilh f17984a;

    ili(ilh ilh) {
        this.f17984a = ilh;
    }

    public boolean queueIdle() {
        Looper.myLooper().quit();
        return true;
    }
}
