package p000;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import java.lang.ref.WeakReference;

final class hgr implements DeathRecipient, hgs {
    private final WeakReference<heb<?, ?>> f16931a;
    private final WeakReference<gur> f16932b;
    private final WeakReference<IBinder> f16933c;

    hgr(heb<?, ?> heb___, gur gur, IBinder iBinder) {
        this.f16932b = new WeakReference(gur);
        this.f16931a = new WeakReference(heb___);
        this.f16933c = new WeakReference(iBinder);
    }

    private void m19760a() {
        heb heb = (heb) this.f16931a.get();
        gur gur = (gur) this.f16932b.get();
        if (!(gur == null || heb == null)) {
            heb.mo2420b().intValue();
            gur.m18650a();
        }
        IBinder iBinder = (IBinder) this.f16933c.get();
        if (this.f16933c != null) {
            iBinder.unlinkToDeath(this, 0);
        }
    }

    public void mo2537a(heb<?, ?> heb___) {
        m19760a();
    }

    public void binderDied() {
        m19760a();
    }
}
