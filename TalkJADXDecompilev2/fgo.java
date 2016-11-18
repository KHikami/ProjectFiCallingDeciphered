package defpackage;

import android.content.Context;
import java.util.concurrent.TimeUnit;

public final class fgo extends fjy<fgp> {
    public fgo(fgp fgp) {
        super(fgp);
    }

    protected euj a(Context context, int i, int i2) {
        return new etj(context, i, (fgp) this.a, true);
    }

    protected void a(Context context, int i, fdo fdo) {
    }

    public String K_() {
        return "background_queue";
    }

    public long b() {
        return TimeUnit.SECONDS.toMillis(10);
    }

    public boolean c() {
        return false;
    }

    public boolean d() {
        return true;
    }

    public boolean a(String str) {
        return false;
    }

    public boolean a(ead ead) {
        return false;
    }
}
