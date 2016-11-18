package p000;

import android.content.Context;
import java.util.concurrent.TimeUnit;

public final class fgy extends fjy<fgz> {
    public fgy(fgz fgz) {
        super(fgz);
    }

    protected euj mo1013a(Context context, int i, int i2) {
        return new eua(context, i, i2, (fgz) this.a);
    }

    protected void mo1014a(Context context, int i, fdo fdo) {
    }

    public String K_() {
        return "background_queue";
    }

    public boolean mo1008a(Context context, eaf eaf, fdo fdo) {
        return false;
    }

    public long mo1017b() {
        return TimeUnit.SECONDS.toMillis(30);
    }

    public boolean mo1018c() {
        return false;
    }

    public boolean mo1019d() {
        return true;
    }

    public boolean mo1016a(String str) {
        return false;
    }

    public boolean mo1015a(ead ead) {
        return false;
    }
}
