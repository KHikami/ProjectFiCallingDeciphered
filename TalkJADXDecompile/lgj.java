import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.util.SparseArray;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public final class lgj {
    private static final mtt<Object> a;
    private final AtomicInteger b;
    private final AtomicLong c;
    private final Object d;
    private final SparseArray<mtt<?>> e;
    private final SparseArray<mtt<?>> f;
    private final UUID g;
    private final Intent h;
    private final Context i;

    lgj(Context context) {
        this.b = new AtomicInteger(0);
        this.c = new AtomicLong(0);
        this.d = new Object();
        this.e = new SparseArray();
        this.f = new SparseArray();
        this.g = UUID.randomUUID();
        this.h = new Intent(context, lgg.class);
        this.i = context;
    }

    mti<?> a(Intent intent) {
        bm.a(intent.hasExtra("EXTRA_FUTURE_INDEX"), "Intent missing extra %s", (Object) intent);
        bm.a(intent.hasExtra("EXTRA_PROCESS_UUID"), "Intent missing extra %s", (Object) intent);
        bm.a(intent.hasExtra("EXTRA_PROCESS_UUID2"), "Intent missing extra %s", (Object) intent);
        long longExtra = intent.getLongExtra("EXTRA_PROCESS_UUID", -1);
        long longExtra2 = intent.getLongExtra("EXTRA_PROCESS_UUID2", -1);
        if (this.g.getMostSignificantBits() == longExtra && this.g.getLeastSignificantBits() == longExtra2) {
            mtt mtt;
            int intExtra = intent.getIntExtra("EXTRA_FUTURE_INDEX", -1);
            synchronized (this.d) {
                mtt = (mtt) bm.a((mtt) this.e.get(intExtra));
                if (mtt != a) {
                    this.f.put(intExtra, mtt);
                }
                this.e.remove(intExtra);
            }
            return mtt;
        }
        int intExtra2 = intent.getIntExtra("EXTRA_PROCESS_PID", -1);
        new StringBuilder(124).append("Stopping service immediately, intent delivered from previous process. Old PID was ").append(intExtra2).append(" but current PID is ").append(Process.myPid());
        return msy.T(null);
    }

    static {
        mtt mtt = new mtt();
        a = mtt;
        mtt.b(new Object());
    }
}
