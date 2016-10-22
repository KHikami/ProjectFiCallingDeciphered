import android.content.Context;
import java.util.concurrent.TimeUnit;

final class coa extends fjy<coc> {
    coa(coc coc) {
        super(coc);
    }

    protected euj a(Context context, int i, int i2) {
        return new cob(context, i, 2, (coc) this.a);
    }

    protected void a(Context context, int i, fdo fdo) {
    }

    public String K_() {
        return "background_queue";
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
