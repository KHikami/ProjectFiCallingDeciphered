package p000;

import android.content.Context;
import java.util.concurrent.TimeUnit;

final class coa extends fjy<coc> {
    coa(coc coc) {
        super(coc);
    }

    protected euj mo1013a(Context context, int i, int i2) {
        return new cob(context, i, 2, (coc) this.a);
    }

    protected void mo1014a(Context context, int i, fdo fdo) {
    }

    public String K_() {
        return "background_queue";
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
