package defpackage;

import android.content.Context;
import java.util.concurrent.TimeUnit;

public class fkj extends fjz {
    private final boolean c;
    private final int d;

    public fkj(int i, String str, boolean z, int i2) {
        super(i, str, TimeUnit.SECONDS.toMillis(30));
        this.c = z;
        this.d = i2;
    }

    protected euj b(Context context) {
        return new fat(context, this.a, this.b, this.c, this.d);
    }

    public String toString() {
        boolean z = this.c;
        return a("focused=" + z + ", timeout=" + this.d);
    }
}
