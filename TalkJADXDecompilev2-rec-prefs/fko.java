package p000;

import android.content.Context;
import java.util.concurrent.TimeUnit;

public class fko extends fjz {
    private final int f13326c;

    public fko(int i, String str, int i2) {
        super(i, str, TimeUnit.SECONDS.toMillis(10));
        this.f13326c = i2;
    }

    protected euj mo2024b(Context context) {
        return new fau(context, this.a, this.b, this.f13326c);
    }

    public String toString() {
        return m15523a("type=" + this.f13326c);
    }
}
