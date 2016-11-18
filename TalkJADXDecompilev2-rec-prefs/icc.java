package p000;

import android.content.ContentResolver;
import android.os.Handler;
import android.os.Looper;

final class icc extends Thread {
    final /* synthetic */ ContentResolver f17555a;

    icc(String str, ContentResolver contentResolver) {
        this.f17555a = contentResolver;
        super(str);
    }

    public void run() {
        Looper.prepare();
        this.f17555a.registerContentObserver(icb.f17547a, true, new icd(this, new Handler(Looper.myLooper())));
        Looper.loop();
    }
}
