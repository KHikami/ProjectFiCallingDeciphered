package defpackage;

import android.app.Activity;
import java.util.concurrent.TimeUnit;

/* renamed from: iwu */
final class iwu implements iwh {
    final /* synthetic */ iwt a;

    iwu(iwt iwt) {
        this.a = iwt;
    }

    public void a(Activity activity) {
        String simpleName = activity.getClass().getSimpleName();
        this.a.a.a(2, simpleName);
        iwt iwt = this.a;
        if (iwt.b != null) {
            iwt.b.cancel(true);
            iwt.b = null;
        }
        if (iwt.c != null) {
            iwt.c.cancel(true);
            iwt.c = null;
        }
        this.a.c = this.a.d.schedule(new iwv(this, simpleName), 10, TimeUnit.SECONDS);
    }
}
