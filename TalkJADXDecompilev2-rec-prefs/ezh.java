package p000;

import android.app.ActivityManager;
import java.util.ArrayList;
import java.util.List;

public final class ezh extends evz {
    private static final long serialVersionUID = 1;
    private final List<edk> f12542g;

    ezh(luw luw) {
        super(luw, luw.responseHeader, -1);
        if (ActivityManager.isUserAMonkey()) {
            this.f12542g = new ArrayList();
        } else {
            this.f12542g = gwb.m1692a(gwb.m1400H(), luw.f26544a, null);
            if (evz.f5798a) {
                new StringBuilder(54).append("SearchEntitiesResponse. Number of entities:").append(this.f12542g.size());
            }
        }
        if (evz.f5798a) {
            String valueOf = String.valueOf(luw);
            new StringBuilder(String.valueOf(valueOf).length() + 28).append("SearchEntitiesResponse from:").append(valueOf);
        }
    }

    public List<edk> m14804k() {
        return this.f12542g;
    }
}
