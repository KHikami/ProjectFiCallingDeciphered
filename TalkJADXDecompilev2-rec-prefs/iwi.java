package p000;

import android.app.Activity;
import java.util.concurrent.TimeUnit;

public class iwi implements ivz {
    final /* synthetic */ iwt f19255a;

    public void m23387a(Activity activity) {
        String simpleName = activity.getClass().getSimpleName();
        this.f19255a.f19292a.m23415a(3, simpleName);
        iwt iwt = this.f19255a;
        if (iwt.f19293b != null) {
            iwt.f19293b.cancel(true);
            iwt.f19293b = null;
        }
        if (iwt.f19294c != null) {
            iwt.f19294c.cancel(true);
            iwt.f19294c = null;
        }
        this.f19255a.f19293b = this.f19255a.f19295d.schedule(new iww(this, simpleName), 10, TimeUnit.SECONDS);
    }

    iwi(iwt iwt) {
        this.f19255a = iwt;
    }
}
