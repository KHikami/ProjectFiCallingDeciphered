package p000;

import android.content.Context;
import java.util.concurrent.TimeUnit;

public class fkj extends fjz {
    private final boolean f13317c;
    private final int f13318d;

    public fkj(int i, String str, boolean z, int i2) {
        super(i, str, TimeUnit.SECONDS.toMillis(30));
        this.f13317c = z;
        this.f13318d = i2;
    }

    protected euj mo2024b(Context context) {
        return new fat(context, this.a, this.b, this.f13317c, this.f13318d);
    }

    public String toString() {
        boolean z = this.f13317c;
        return m15523a("focused=" + z + ", timeout=" + this.f13318d);
    }
}
