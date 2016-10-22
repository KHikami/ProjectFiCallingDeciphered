package defpackage;

import android.content.ContentResolver;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* renamed from: cso */
final class cso extends Thread {
    final /* synthetic */ ContentResolver a;

    cso(String str, ContentResolver contentResolver) {
        this.a = contentResolver;
        super(str);
    }

    public final void run() {
        Looper.prepare();
        this.a.registerContentObserver(csn.a, true, new csp(this, new Handler(Looper.myLooper())));
        Looper.loop();
    }
}
