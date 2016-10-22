import android.app.ActivityManager;
import java.util.ArrayList;
import java.util.List;

public final class ezh extends evz {
    private static final long serialVersionUID = 1;
    private final List<edk> g;

    ezh(luw luw) {
        super(luw, luw.responseHeader, -1);
        if (ActivityManager.isUserAMonkey()) {
            this.g = new ArrayList();
        } else {
            this.g = gwb.a(gwb.H(), luw.a, null);
            if (evz.a) {
                new StringBuilder(54).append("SearchEntitiesResponse. Number of entities:").append(this.g.size());
            }
        }
        if (evz.a) {
            String valueOf = String.valueOf(luw);
            new StringBuilder(String.valueOf(valueOf).length() + 28).append("SearchEntitiesResponse from:").append(valueOf);
        }
    }

    public List<edk> k() {
        return this.g;
    }
}
