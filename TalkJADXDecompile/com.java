import android.content.Context;
import android.util.Log;
import java.util.concurrent.TimeUnit;

public final class com extends fjy<coo> {
    private final String c;

    public com(coo coo) {
        super(coo);
        this.c = coo.d();
    }

    protected euj a(Context context, int i, int i2) {
        return new con(context, i, i2, (coo) this.a);
    }

    protected void a(Context context, int i, fdo fdo) {
        Log.e("Babel_ConvService", "Failed to execute remove participant network request.");
        ((iih) jyn.a(context, iih.class)).a(i).b().c(3239);
        ayo bow = new bow(this.c, i, box.REMOVE_PARTICIPANT_FROM_CONVERSATION);
        ((gid) jyn.a(context, gid.class)).a(bow, fdo, bow.a());
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

    public boolean a(ead ead) {
        return false;
    }

    public boolean d() {
        return true;
    }

    public boolean a(String str) {
        return false;
    }
}
