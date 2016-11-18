package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class fva implements OnClickListener {
    final /* synthetic */ int f14073a;
    final /* synthetic */ Runnable f14074b;
    final /* synthetic */ fuz f14075c;

    fva(fuz fuz, int i, Runnable runnable) {
        this.f14075c = fuz;
        this.f14073a = i;
        this.f14074b = runnable;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        fuz fuz = this.f14075c;
        fuz.m16283a(this.f14073a, i);
        if (this.f14074b != null) {
            this.f14074b.run();
        }
    }
}
