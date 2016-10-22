package defpackage;

import android.os.Looper;
import android.os.MessageQueue.IdleHandler;

/* renamed from: ili */
final class ili implements IdleHandler {
    final /* synthetic */ ilh a;

    ili(ilh ilh) {
        this.a = ilh;
    }

    public boolean queueIdle() {
        Looper.myLooper().quit();
        return true;
    }
}
