package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

final class um extends Handler {
    private WeakReference<DialogInterface> f35296a;

    public um(DialogInterface dialogInterface) {
        this.f35296a = new WeakReference(dialogInterface);
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case -3:
            case -2:
            case -1:
                ((OnClickListener) message.obj).onClick((DialogInterface) this.f35296a.get(), message.what);
                return;
            case 1:
                ((DialogInterface) message.obj).dismiss();
                return;
            default:
                return;
        }
    }
}
