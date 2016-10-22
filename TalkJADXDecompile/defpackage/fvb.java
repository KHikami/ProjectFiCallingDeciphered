package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: fvb */
final class fvb implements OnCancelListener {
    final /* synthetic */ Runnable a;
    final /* synthetic */ fuz b;

    fvb(fuz fuz, Runnable runnable) {
        this.b = fuz;
        this.a = runnable;
    }

    public void onCancel(DialogInterface dialogInterface) {
        if (this.a != null) {
            this.a.run();
        }
    }
}
