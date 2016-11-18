package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.mergedcontacts.impl.MergeContactsService;
import java.util.concurrent.TimeUnit;

public class dxu implements dwu {
    private static final long f10780b = TimeUnit.SECONDS.toMillis(10);
    private static final long f10781c = TimeUnit.SECONDS.toMillis(30);
    private final Context f10782a;

    dxu(Context context) {
        this.f10782a = context;
    }

    public void m12996a(int i) {
        jci b = ((jcf) jyn.m25426a(this.f10782a, jcf.class)).mo3464b(i);
        if (b.mo3434a("last_merged_ts", -1) == -1) {
            Intent intent = new Intent(this.f10782a, MergeContactsService.class);
            intent.putExtra("account_id", i);
            this.f10782a.startService(intent);
            synchronized (this) {
                long b2 = glj.m17963b();
                long j = 0;
                while (b.mo3434a("last_merged_ts", -1) == -1 && r0 < f10781c) {
                    try {
                        wait(f10780b);
                    } catch (InterruptedException e) {
                    }
                    b = ((jcf) jyn.m25426a(this.f10782a, jcf.class)).mo3464b(i);
                    j = glj.m17963b() - b2;
                }
            }
        }
    }

    public void mo1751a(int i, boolean z) {
        synchronized (this) {
            notifyAll();
        }
    }
}
