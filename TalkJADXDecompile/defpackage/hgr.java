package defpackage;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import java.lang.ref.WeakReference;

/* renamed from: hgr */
final class hgr implements DeathRecipient, hgs {
    private final WeakReference<heb<?, ?>> a;
    private final WeakReference<gur> b;
    private final WeakReference<IBinder> c;

    hgr(heb<?, ?> heb___, gur gur, IBinder iBinder) {
        this.b = new WeakReference(gur);
        this.a = new WeakReference(heb___);
        this.c = new WeakReference(iBinder);
    }

    private void a() {
        heb heb = (heb) this.a.get();
        gur gur = (gur) this.b.get();
        if (!(gur == null || heb == null)) {
            heb.b().intValue();
            gur.a();
        }
        IBinder iBinder = (IBinder) this.c.get();
        if (this.c != null) {
            iBinder.unlinkToDeath(this, 0);
        }
    }

    public void a(heb<?, ?> heb___) {
        a();
    }

    public void binderDied() {
        a();
    }
}
