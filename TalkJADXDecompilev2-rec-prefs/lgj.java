package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.util.SparseArray;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public final class lgj {
    private static final mtt<Object> f24950a;
    private final AtomicInteger f24951b = new AtomicInteger(0);
    private final AtomicLong f24952c = new AtomicLong(0);
    private final Object f24953d = new Object();
    private final SparseArray<mtt<?>> f24954e = new SparseArray();
    private final SparseArray<mtt<?>> f24955f = new SparseArray();
    private final UUID f24956g = UUID.randomUUID();
    private final Intent f24957h;
    private final Context f24958i;

    lgj(Context context) {
        this.f24957h = new Intent(context, lgg.class);
        this.f24958i = context;
    }

    mti<?> m29009a(Intent intent) {
        bm.m6143a(intent.hasExtra("EXTRA_FUTURE_INDEX"), "Intent missing extra %s", (Object) intent);
        bm.m6143a(intent.hasExtra("EXTRA_PROCESS_UUID"), "Intent missing extra %s", (Object) intent);
        bm.m6143a(intent.hasExtra("EXTRA_PROCESS_UUID2"), "Intent missing extra %s", (Object) intent);
        long longExtra = intent.getLongExtra("EXTRA_PROCESS_UUID", -1);
        long longExtra2 = intent.getLongExtra("EXTRA_PROCESS_UUID2", -1);
        if (this.f24956g.getMostSignificantBits() == longExtra && this.f24956g.getLeastSignificantBits() == longExtra2) {
            mtt mtt;
            int intExtra = intent.getIntExtra("EXTRA_FUTURE_INDEX", -1);
            synchronized (this.f24953d) {
                mtt = (mtt) bm.m6122a((mtt) this.f24954e.get(intExtra));
                if (mtt != f24950a) {
                    this.f24955f.put(intExtra, mtt);
                }
                this.f24954e.remove(intExtra);
            }
            return mtt;
        }
        int intExtra2 = intent.getIntExtra("EXTRA_PROCESS_PID", -1);
        new StringBuilder(124).append("Stopping service immediately, intent delivered from previous process. Old PID was ").append(intExtra2).append(" but current PID is ").append(Process.myPid());
        return msy.m32868T(null);
    }

    static {
        mtt mtt = new mtt();
        f24950a = mtt;
        mtt.mo3943b(new Object());
    }
}
