package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: pv */
final class pv extends Handler {
    private WeakReference a;

    public pv(DialogInterface dialogInterface) {
        this.a = new WeakReference(dialogInterface);
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case -3:
            case -2:
            case oe.HOST_ID /*-1*/:
                ((OnClickListener) message.obj).onClick((DialogInterface) this.a.get(), message.what);
            case rq.b /*1*/:
                ((DialogInterface) message.obj).dismiss();
            default:
        }
    }
}
