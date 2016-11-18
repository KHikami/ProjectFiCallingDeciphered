package p000;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.TimeUnit;

public final class com extends fjy<coo> {
    private final String f8716c;

    public com(coo coo) {
        super(coo);
        this.f8716c = coo.m10542d();
    }

    protected euj mo1013a(Context context, int i, int i2) {
        return new con(context, i, i2, (coo) this.a);
    }

    protected void mo1014a(Context context, int i, fdo fdo) {
        Log.e("Babel_ConvService", "Failed to execute remove participant network request.");
        ((iih) jyn.m25426a(context, iih.class)).mo1979a(i).mo1693b().mo1714c(3239);
        ayo bow = new bow(this.f8716c, i, box.REMOVE_PARTICIPANT_FROM_CONVERSATION);
        ((gid) jyn.m25426a(context, gid.class)).mo2277a(bow, fdo, bow.m6328a());
    }

    public String K_() {
        return "background_queue";
    }

    public long mo1017b() {
        return TimeUnit.SECONDS.toMillis(10);
    }

    public boolean mo1018c() {
        return false;
    }

    public boolean mo1015a(ead ead) {
        return false;
    }

    public boolean mo1019d() {
        return true;
    }

    public boolean mo1016a(String str) {
        return false;
    }
}
