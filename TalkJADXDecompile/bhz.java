import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.ConditionVariable;
import com.google.android.apps.hangouts.concurrent.impl.ConcurrentService;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class bhz extends bcq implements bhl {
    private static final long g;
    private static final gma h;
    final ConditionVariable a;
    volatile ConcurrentService b;
    final List<bho> c;
    final List<bho> d;
    List<bhc> e;
    bib f;
    private final Context i;
    private final bir j;
    private final ServiceConnection k;

    static {
        g = TimeUnit.MINUTES.toMillis(10);
        h = gma.a("concurrent");
    }

    public bhz(Context context) {
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.k = new bia(this);
        this.i = context;
        this.j = bir.a(context, null, null, null);
        this.a = new ConditionVariable();
    }

    private bhb a(bho bho) {
        gma gma = h;
        String valueOf = String.valueOf("SCHEDULE_");
        String valueOf2 = String.valueOf(bho.a());
        gma.b(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        String valueOf3;
        if (this.b != null) {
            valueOf2 = "Found BinderService, scheduling: ";
            valueOf3 = String.valueOf(bho.a());
            if (valueOf3.length() != 0) {
                valueOf2.concat(valueOf3);
            } else {
                valueOf3 = new String(valueOf2);
            }
            this.b.a(bho);
        } else {
            if (bho.a(this.i)) {
                valueOf3 = "Babel_ConcService";
                valueOf = "ConcurrentService is temporarily unavailable when scheduling task ";
                valueOf2 = String.valueOf(bho.a());
                glk.c(valueOf3, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), new Object[0]);
            }
            if (gwb.aI()) {
                this.d.add(bho);
            } else {
                synchronized (this) {
                    this.c.add(bho);
                }
            }
            if (this.f == null) {
                this.f = new bib(this);
                gwb.a(this.f, g);
            }
            f();
        }
        return bho.c;
    }

    public synchronized void a(bhc bhc) {
        if (this.b != null) {
            String valueOf = String.valueOf(bhc);
            new StringBuilder(String.valueOf(valueOf).length() + 32).append("Found BinderService, canceling: ").append(valueOf);
            this.b.a(bhc);
        } else {
            if (this.e == null) {
                this.e = new ArrayList();
            }
            this.e.add(bhc);
            if (this.f == null) {
                this.f = new bib(this);
                gwb.a(this.f, g);
            }
            f();
        }
    }

    public void k_() {
        if (this.f != null) {
            gwb.b(this.f);
        }
        f();
    }

    public void l_() {
        d();
    }

    public bhb a(bhm bhm, long j) {
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
            bhr a = ((bhf) bhm).a();
            if (a != null) {
                a.c();
            }
        }
        bht bht = new bht();
        if (bhm instanceof bhj) {
            bhj bhj = (bhj) bhm;
            valueOf2 = bhj.b();
            bht.a = bhj.c();
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
            bht.b = true;
        }
        if (bhm instanceof bhf) {
            bhf bhf = (bhf) bhm;
            bht.d = bhf.a();
            if (str == null && bht.a != bhk.NONE) {
                str = valueOf2;
            }
            bht.c = bhf.d();
        }
        if (str == null) {
            str = "";
        }
        if (bhm instanceof bhd) {
            bht.e = ((bhd) bhm).e();
        }
        long a2 = bho.a(bht.d, 0);
        bhu bhu = bht.c;
        Object obj = (bhu == null || !bhu.c()) ? null : 1;
        Object obj2 = (bhu == null || !bhu.a()) ? null : 1;
        boolean z = bht.b;
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
        ba.a(this.j.a(bho.a) != null);
        return a(bho);
    }

    private void f() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    Intent intent = new Intent(this.i, ConcurrentService.class);
                    intent.putExtra("concurrent_service_command_key", bhy.START.ordinal());
                    this.i.bindService(intent, this.k, 1);
                }
            }
        }
    }

    public synchronized void d() {
        if (this.b != null) {
            this.a.close();
            this.i.unbindService(this.k);
            this.b = null;
        }
    }

    public bhb a(bhm bhm) {
        return a(bhm, 0);
    }

    public ConcurrentService e() {
        ConcurrentService concurrentService;
        do {
            f();
            this.a.block();
            concurrentService = this.b;
        } while (concurrentService == null);
        return concurrentService;
    }

    public String c() {
        return this.b.b();
    }

    void a(List<bho> list) {
        if (list.size() > 0) {
            new Object[1][0] = Integer.valueOf(list.size());
            for (bho a : list) {
                this.b.a(a);
            }
        }
    }
}
