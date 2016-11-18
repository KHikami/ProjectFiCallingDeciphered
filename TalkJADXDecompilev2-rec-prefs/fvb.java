package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

final class fvb implements OnCancelListener {
    final /* synthetic */ Runnable f14076a;
    final /* synthetic */ fuz f14077b;

    fvb(fuz fuz, Runnable runnable) {
        this.f14077b = fuz;
        this.f14076a = runnable;
    }

    public void onCancel(DialogInterface dialogInterface) {
        if (this.f14076a != null) {
            this.f14076a.run();
        }
    }
}
