package defpackage;

import android.content.ContentResolver;
import android.os.Handler;
import android.os.Looper;

final class icc extends Thread {
    final /* synthetic */ ContentResolver a;

    icc(String str, ContentResolver contentResolver) {
        this.a = contentResolver;
        super(str);
    }

    public void run() {
        Looper.prepare();
        this.a.registerContentObserver(icb.a, true, new icd(this, new Handler(Looper.myLooper())));
        Looper.loop();
    }
}
