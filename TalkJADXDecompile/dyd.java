import android.content.Context;
import java.util.concurrent.TimeUnit;

final class dyd implements dwu {
    private static final long b;
    private final Context a;

    static {
        b = TimeUnit.DAYS.toMillis(1);
    }

    dyd(Context context) {
        this.a = context;
    }

    public void a(int i, boolean z) {
        jci b = ((jcf) jyn.a(this.a, jcf.class)).b(i);
        long a = glj.a() - b.a("last_conversation_data_update_ts", 0);
        if (z || a > b) {
            blo.a(this.a, i);
            b.b("last_conversation_data_update_ts", glj.a());
            b.d();
        }
    }
}
