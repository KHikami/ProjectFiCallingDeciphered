package defpackage;

import android.app.Activity;
import java.util.concurrent.TimeUnit;

public class iwi implements ivz {
    final /* synthetic */ iwt a;

    public void a(Activity activity) {
        String simpleName = activity.getClass().getSimpleName();
        this.a.a.a(3, simpleName);
        iwt iwt = this.a;
        if (iwt.b != null) {
            iwt.b.cancel(true);
            iwt.b = null;
        }
        if (iwt.c != null) {
            iwt.c.cancel(true);
            iwt.c = null;
        }
        this.a.b = this.a.d.schedule(new iww(this, simpleName), 10, TimeUnit.SECONDS);
    }

    iwi(iwt iwt) {
        this.a = iwt;
    }
}
