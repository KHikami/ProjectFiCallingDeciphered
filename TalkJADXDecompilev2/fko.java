package defpackage;

import android.content.Context;
import java.util.concurrent.TimeUnit;

public class fko extends fjz {
    private final int c;

    public fko(int i, String str, int i2) {
        super(i, str, TimeUnit.SECONDS.toMillis(10));
        this.c = i2;
    }

    protected euj b(Context context) {
        return new fau(context, this.a, this.b, this.c);
    }

    public String toString() {
        return a("type=" + this.c);
    }
}
