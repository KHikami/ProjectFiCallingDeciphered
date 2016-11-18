package p000;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.ConditionVariable;
import com.google.android.apps.hangouts.concurrent.impl.ConcurrentService;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class bhz extends bcq implements bhl {
    private static final long f3405g = TimeUnit.MINUTES.toMillis(10);
    private static final gma f3406h = gma.m18073a("concurrent");
    final ConditionVariable f3407a;
    volatile ConcurrentService f3408b;
    final List<bho> f3409c = new ArrayList();
    final List<bho> f3410d = new ArrayList();
    List<bhc> f3411e;
    bib f3412f;
    private final Context f3413i;
    private final bir f3414j;
    private final ServiceConnection f3415k = new bia(this);

    public bhz(Context context) {
        this.f3413i = context;
        this.f3414j = bir.m5318a(context, null, null, null);
        this.f3407a = new ConditionVariable();
    }

    private bhb m5285a(bho bho) {
        gma gma = f3406h;
        String valueOf = String.valueOf("SCHEDULE_");
        String valueOf2 = String.valueOf(bho.m5258a());
        gma.m18078b(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        String valueOf3;
        if (this.f3408b != null) {
            valueOf2 = "Found BinderService, scheduling: ";
            valueOf3 = String.valueOf(bho.m5258a());
            if (valueOf3.length() != 0) {
                valueOf2.concat(valueOf3);
            } else {
                valueOf3 = new String(valueOf2);
            }
            this.f3408b.m8230a(bho);
        } else {
            if (bho.m5259a(this.f3413i)) {
                valueOf3 = "Babel_ConcService";
                valueOf = "ConcurrentService is temporarily unavailable when scheduling task ";
                valueOf2 = String.valueOf(bho.m5258a());
                glk.m17979c(valueOf3, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), new Object[0]);
            }
            if (gwb.aI()) {
                this.f3410d.add(bho);
            } else {
                synchronized (this) {
                    this.f3409c.add(bho);
                }
            }
            if (this.f3412f == null) {
                this.f3412f = new bib(this);
                gwb.m1864a(this.f3412f, f3405g);
            }
            m5286f();
        }
        return bho.f3355c;
    }

    public synchronized void mo552a(bhc bhc) {
        if (this.f3408b != null) {
            String valueOf = String.valueOf(bhc);
            new StringBuilder(String.valueOf(valueOf).length() + 32).append("Found BinderService, canceling: ").append(valueOf);
            this.f3408b.m8229a(bhc);
        } else {
            if (this.f3411e == null) {
                this.f3411e = new ArrayList();
            }
            this.f3411e.add(bhc);
            if (this.f3412f == null) {
                this.f3412f = new bib(this);
                gwb.m1864a(this.f3412f, f3405g);
            }
            m5286f();
        }
    }

    public void k_() {
        if (this.f3412f != null) {
            gwb.m2042b(this.f3412f);
        }
        m5286f();
    }

    public void l_() {
        m5292d();
    }

    public bhb mo551a(bhm bhm, long j) {
        String str;
        String valueOf;
        String str2 = "Start scheduling ";
        String valueOf2 = String.valueOf(bhm.getClass().getName());
        if (valueOf2.length() != 0) {
            str2.concat(valueOf2);
        } else {
            valueOf2 = new String(str2);
        }
        if (bhm instanceof bhf) {
            bhr a = ((bhf) bhm).mo540a();
            if (a != null) {
                a.m5263c();
            }
        }
        bht bht = new bht();
        if (bhm instanceof bhj) {
            bhj bhj = (bhj) bhm;
            valueOf2 = bhj.mo542b();
            bht.f3387a = bhj.mo543c();
            str = valueOf2;
        } else {
            str = null;
        }
        valueOf2 = bhm.getClass().getName();
        bhp bhp = bhp.DEFAULT;
        if (bhm instanceof bhg) {
            bhp = bhp.NETWORK;
        } else if (bhm instanceof bhi) {
            bhp = bhp.HIGH;
        }
        if (bhm instanceof bhh) {
            bht.f3388b = true;
        }
        if (bhm instanceof bhf) {
            bhf bhf = (bhf) bhm;
            bht.f3390d = bhf.mo540a();
            if (str == null && bht.f3387a != bhk.NONE) {
                str = valueOf2;
            }
            bht.f3389c = bhf.mo544d();
        }
        if (str == null) {
            str = "";
        }
        if (bhm instanceof bhd) {
            bht.f3391e = ((bhd) bhm).mo1983e();
        }
        long a2 = bho.m5255a(bht.f3390d, 0);
        bhu bhu = bht.f3389c;
        Object obj = (bhu == null || !bhu.m5275c()) ? null : 1;
        Object obj2 = (bhu == null || !bhu.m5273a()) ? null : 1;
        boolean z = bht.f3388b;
        String str3 = "";
        if (obj != null) {
            valueOf = String.valueOf(str3);
            str3 = String.valueOf("network_connectivity_wakeup");
            str3 = str3.length() != 0 ? valueOf.concat(str3) : new String(valueOf);
        }
        if (obj2 != null) {
            str3 = String.valueOf(str3);
            str2 = String.valueOf(":");
            str3 = String.valueOf(str2.length() != 0 ? str3.concat(str2) : new String(str3));
            str2 = String.valueOf("charging_wakeup");
            str2 = str2.length() != 0 ? str3.concat(str2) : new String(str3);
        } else {
            str2 = str3;
        }
        if (z) {
            str3 = String.valueOf(str2);
            str2 = String.valueOf(":");
            str3 = String.valueOf(str2.length() != 0 ? str3.concat(str2) : new String(str3));
            str2 = String.valueOf("persisted");
            str2 = str2.length() != 0 ? str3.concat(str2) : new String(str3);
        }
        if (str2.isEmpty()) {
            valueOf = "timed_wakeup";
        } else {
            valueOf = str2;
        }
        bho bho = new bho(valueOf2, str, bhm, a2, bht, valueOf, bhp);
        ba.m4577a(this.f3414j.m5322a(bho.f3353a) != null);
        return m5285a(bho);
    }

    private void m5286f() {
        if (this.f3408b == null) {
            synchronized (this) {
                if (this.f3408b == null) {
                    Intent intent = new Intent(this.f3413i, ConcurrentService.class);
                    intent.putExtra("concurrent_service_command_key", bhy.START.ordinal());
                    this.f3413i.bindService(intent, this.f3415k, 1);
                }
            }
        }
    }

    public synchronized void m5292d() {
        if (this.f3408b != null) {
            this.f3407a.close();
            this.f3413i.unbindService(this.f3415k);
            this.f3408b = null;
        }
    }

    public bhb mo550a(bhm bhm) {
        return mo551a(bhm, 0);
    }

    public ConcurrentService m5293e() {
        ConcurrentService concurrentService;
        do {
            m5286f();
            this.f3407a.block();
            concurrentService = this.f3408b;
        } while (concurrentService == null);
        return concurrentService;
    }

    public String mo553c() {
        return this.f3408b.m8233b();
    }

    void m5290a(List<bho> list) {
        if (list.size() > 0) {
            new Object[1][0] = Integer.valueOf(list.size());
            for (bho a : list) {
                this.f3408b.m8230a(a);
            }
        }
    }
}
