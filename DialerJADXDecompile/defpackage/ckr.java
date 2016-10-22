package defpackage;

import android.content.ContentResolver;
import android.os.Handler;
import android.os.Looper;

/* renamed from: ckr */
final class ckr extends Thread {
    final /* synthetic */ ContentResolver a;

    ckr(String str, ContentResolver contentResolver) {
        this.a = contentResolver;
        super(str);
    }

    public final void run() {
        Looper.prepare();
        this.a.registerContentObserver(ckq.a, true, new cks(this, new Handler(Looper.myLooper())));
        Looper.loop();
    }
}
