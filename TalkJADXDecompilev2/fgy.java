package defpackage;

import android.content.Context;
import java.util.concurrent.TimeUnit;

public final class fgy extends fjy<fgz> {
    public fgy(fgz fgz) {
        super(fgz);
    }

    protected euj a(Context context, int i, int i2) {
        return new eua(context, i, i2, (fgz) this.a);
    }

    protected void a(Context context, int i, fdo fdo) {
    }

    public String K_() {
        return "background_queue";
    }

    public boolean a(Context context, eaf eaf, fdo fdo) {
        return false;
    }

    public long b() {
        return TimeUnit.SECONDS.toMillis(30);
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
