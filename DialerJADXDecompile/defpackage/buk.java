package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: buk */
final class buk extends Handler {
    private /* synthetic */ bui a;

    public buk(bui bui, Looper looper) {
        this.a = bui;
        super(looper);
    }

    private static void a(Message message) {
        bul bul = (bul) message.obj;
        bul.b();
        bul.c();
    }

    private static boolean b(Message message) {
        return message.what == 2 || message.what == 1 || message.what == 5;
    }

    public final void handleMessage(Message message) {
        if (this.a.d.get() != message.arg1) {
            if (buk.b(message)) {
                buk.a(message);
            }
        } else if ((message.what == 1 || message.what == 5) && !this.a.j_()) {
            buk.a(message);
        } else if (message.what == 3) {
            ConnectionResult connectionResult = new ConnectionResult(message.arg2, null);
            this.a.p.a(connectionResult);
            this.a.a(connectionResult);
        } else if (message.what == 4) {
            this.a.a(4, null);
            if (this.a.v != null) {
                this.a.v.a(message.arg2);
            }
            this.a.a(message.arg2);
            this.a.a(4, 1, null);
        } else if (message.what == 2 && !this.a.b()) {
            buk.a(message);
        } else if (buk.b(message)) {
            Object obj;
            bul bul = (bul) message.obj;
            synchronized (bul) {
                obj = bul.a;
                if (bul.b) {
                    Log.w("GmsClient", "Callback proxy " + bul + " being reused. This is not safe.");
                }
            }
            if (obj != null) {
                try {
                    bul.a(obj);
                } catch (RuntimeException e) {
                    bul.b();
                    throw e;
                }
            }
            bul.b();
            synchronized (bul) {
                bul.b = true;
            }
            bul.c();
        } else {
            Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
        }
    }
}
