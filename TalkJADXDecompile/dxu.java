import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.mergedcontacts.impl.MergeContactsService;
import java.util.concurrent.TimeUnit;

public class dxu implements dwu {
    private static final long b;
    private static final long c;
    private final Context a;

    static {
        b = TimeUnit.SECONDS.toMillis(10);
        c = TimeUnit.SECONDS.toMillis(30);
    }

    dxu(Context context) {
        this.a = context;
    }

    public void a(int i) {
        jci b = ((jcf) jyn.a(this.a, jcf.class)).b(i);
        if (b.a("last_merged_ts", -1) == -1) {
            Intent intent = new Intent(this.a, MergeContactsService.class);
            intent.putExtra("account_id", i);
            this.a.startService(intent);
            synchronized (this) {
                long b2 = glj.b();
                long j = 0;
                while (b.a("last_merged_ts", -1) == -1 && r0 < c) {
                    try {
                        wait(b);
                    } catch (InterruptedException e) {
                    }
                    b = ((jcf) jyn.a(this.a, jcf.class)).b(i);
                    j = glj.b() - b2;
                }
            }
        }
    }

    public void a(int i, boolean z) {
        synchronized (this) {
            notifyAll();
        }
    }
}
