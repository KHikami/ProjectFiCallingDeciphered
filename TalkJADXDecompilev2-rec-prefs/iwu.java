package p000;

import android.app.Activity;
import java.util.concurrent.TimeUnit;

final class iwu implements iwh {
    final /* synthetic */ iwt f19300a;

    iwu(iwt iwt) {
        this.f19300a = iwt;
    }

    public void mo3413a(Activity activity) {
        String simpleName = activity.getClass().getSimpleName();
        this.f19300a.f19292a.m23415a(2, simpleName);
        iwt iwt = this.f19300a;
        if (iwt.f19293b != null) {
            iwt.f19293b.cancel(true);
            iwt.f19293b = null;
        }
        if (iwt.f19294c != null) {
            iwt.f19294c.cancel(true);
            iwt.f19294c = null;
        }
        this.f19300a.f19294c = this.f19300a.f19295d.schedule(new iwv(this, simpleName), 10, TimeUnit.SECONDS);
    }
}
