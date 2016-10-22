package defpackage;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import java.lang.ref.WeakReference;

/* renamed from: bsu */
final class bsu implements DeathRecipient, bsw {
    private final WeakReference a;
    private final WeakReference b;
    private final WeakReference c;

    bsu(bsx bsx, brn brn, IBinder iBinder) {
        this.b = new WeakReference(brn);
        this.a = new WeakReference(bsx);
        this.c = new WeakReference(iBinder);
    }

    private final void a() {
        bsx bsx = (bsx) this.a.get();
        brn brn = (brn) this.b.get();
        if (!(brn == null || bsx == null)) {
            bsx.a().intValue();
            brn.a();
        }
        IBinder iBinder = (IBinder) this.c.get();
        if (this.c != null) {
            iBinder.unlinkToDeath(this, 0);
        }
    }

    public final void a(bsx bsx) {
        a();
    }

    public final void binderDied() {
        a();
    }
}
