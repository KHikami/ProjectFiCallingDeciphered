package defpackage;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.api.client.http.ExponentialBackOffPolicy;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public final class fjj extends fgs {
    private static final gma b = RealTimeChatService.b;
    private static final ConcurrentHashMap<Integer, fjj> g = new ConcurrentHashMap();
    private static final Random h = new Random();
    private long i = -1;
    private int j = 0;
    private boolean k = false;
    private boolean l = false;
    private long m = -1;
    private String n = null;
    private long o = -1;

    public static fjj c(int i) {
        fjj fjj = (fjj) g.get(Integer.valueOf(i));
        if (fjj != null) {
            return fjj;
        }
        g.putIfAbsent(Integer.valueOf(i), new fjj(i, (long) (gwb.a(gwb.H(), "babel_warm_sync_lowmark_seconds", 7200) * 1000), (long) (gwb.a(gwb.H(), "babel_warm_sync_highmark_seconds", 604800) * 1000)));
        return (fjj) g.get(Integer.valueOf(i));
    }

    public static fjj d(int i) {
        return (fjj) g.remove(Integer.valueOf(i));
    }

    private fjj(int i, long j, long j2) {
        super(fde.e(i), j, j2);
        if (this.c.b.k()) {
            this.m = Long.MAX_VALUE;
            return;
        }
        long b = glj.b();
        if (((jcf) jyn.a(gwb.H(), jcf.class)).a(i).a("warm_sync_deferral_limit", -1) != -1) {
            this.m = ((long) (gwb.a(gwb.H(), "babel_maxsynctickledelay", (int) ExponentialBackOffPolicy.DEFAULT_MAX_INTERVAL_MILLIS) * 2)) + b;
        } else {
            this.m = ((long) (gwb.a(gwb.H(), "babel_synctickledelay", 10000) * 2)) + b;
        }
    }

    public boolean g() {
        return this.m < Long.MAX_VALUE && !fde.d(this.c.b);
    }

    public boolean h() {
        long b = glj.b();
        long a = ((jcf) jyn.a(gwb.H(), jcf.class)).a(this.c.a).a("warm_sync_deferral_limit", -1);
        return a >= 0 && b < a;
    }

    public void k() {
        ((jcf) jyn.a(gwb.H(), jcf.class)).b(this.c.a).e("warm_sync_deferral_limit").d();
    }

    public long a(fjl fjl) {
        long j = Long.MAX_VALUE;
        if (g()) {
            long j2;
            long j3;
            long b = glj.b();
            long a = (long) gwb.a(gwb.H(), "babel_maxsynctickledelay", (int) ExponentialBackOffPolicy.DEFAULT_MAX_INTERVAL_MILLIS);
            switch (fjk.a[fjl.ordinal()]) {
                case 1:
                    j2 = b;
                    j3 = 0;
                    break;
                case 2:
                    j3 = (long) gwb.a(gwb.H(), "babel_hashsyncdelay", 5000);
                    j2 = b + a;
                    break;
                case 3:
                    j2 = a << 1;
                    j3 = j2;
                    j2 = b + j2;
                    break;
                default:
                    throw new IllegalStateException("Invalid delay parameter.");
            }
            long j4 = b + j3;
            jci b2 = ((jcf) jyn.a(gwb.H(), jcf.class)).b(this.c.a);
            j = b2.a("warm_sync_deferral_limit", -1);
            if (j < 0 || j > j2) {
                b2.b("warm_sync_deferral_limit", j2).d();
            }
            if (j < 0 || j4 <= j) {
                j = j4;
            } else {
                j3 = Math.max(0, j - b);
            }
            if (gjk.b) {
                gjn b3 = new gjn().a("rtcs_set_sane_alarm").a(this.c.b).b(glj.a() + j3);
                String valueOf = String.valueOf(fjl);
                b3.b(new StringBuilder(String.valueOf(valueOf).length() + 31).append("delay=").append(j3).append("from ").append(valueOf).toString()).b();
            }
            if (this.m < j + a) {
                this.m = j + a;
            }
        }
        return j;
    }

    public void w_() {
        String b = b.b("WarmSyncOp");
        long a = 1000 * glj.a();
        String valueOf = String.valueOf(this.o == -1 ? "" : "from_hash_sync:");
        String valueOf2 = String.valueOf(Long.toString(a + ((long) h.nextInt(1000))));
        String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        synchronized (this) {
            this.n = concat;
            this.d.b().clear();
            this.j = 0;
        }
        int i = this.c.a;
        try {
            ((bln) jyn.a(gwb.H(), bln.class)).a(new blo(gwb.H(), i), this.d, this.k, this.l, concat);
            b.b("WarmSyncServerOp");
        } catch (bmu e) {
            fjj.d(i);
        }
        b.c(b);
    }

    protected long f() {
        if (this.i == -1) {
            this.i = bkq.a(gwb.H(), this.c.a, "last_warm_sync_localtime", 0);
        }
        return this.i;
    }

    protected void a(long j) {
        this.i = j;
        bkq.b(gwb.H(), this.c.a, "last_warm_sync_localtime", j);
    }

    public boolean a(String str) {
        int i = this.j;
        String str2 = this.n == null ? "[IDLE]" : this.n;
        new StringBuilder((String.valueOf(str).length() + 83) + String.valueOf(str2).length()).append("Increment pending requests for ").append(str).append(". Current number of pending request ").append(i).append(" for ").append(str2);
        synchronized (this) {
            if (this.n == null || !this.n.equals(str)) {
                return false;
            }
            this.j++;
            return true;
        }
    }

    private boolean a(String str, int i) {
        boolean z = false;
        synchronized (this) {
            if (this.n == null || !this.n.equals(str)) {
            } else {
                iil.a("Expected condition to be true", e());
                a(i);
                this.n = null;
                this.j = 0;
                b.c("WarmSyncServerOp");
                z = true;
            }
        }
        return z;
    }

    public boolean b(String str) {
        boolean z;
        int i = this.j;
        String str2 = this.n == null ? "[IDLE]" : this.n;
        new StringBuilder((String.valueOf(str).length() + 83) + String.valueOf(str2).length()).append("Decrement pending requests for ").append(str).append(". Current number of pending request ").append(i).append(" for ").append(str2);
        synchronized (this) {
            if (this.n != null && this.n.equals(str)) {
                this.j--;
                if (this.j >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                iil.a("Expected condition to be true", z);
                if (this.j == 0) {
                    iil.a("Expected condition to be true", e());
                    a(3);
                    this.n = null;
                    this.j = 0;
                    z = true;
                }
            }
            z = false;
        }
        if (z && blf.a) {
            String str3 = "RequestWarmSyncOperation completed: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str3.concat(valueOf);
            } else {
                valueOf = new String(str3);
            }
        }
        return z;
    }

    public boolean c(String str) {
        boolean a = a(str, 3);
        if (!a) {
            String str2 = "Babel_ReqWarmSyncOp";
            String str3 = str == null ? "null" : str;
            String str4 = this.n == null ? "null" : this.n;
            glk.d(str2, new StringBuilder((String.valueOf(str3).length() + 57) + String.valueOf(str4).length()).append("RequestWarmSync: Mismatched key upon SANE completion ").append(str3).append(" != ").append(str4).toString(), new Object[0]);
            a(glj.a());
        }
        if (blf.a) {
            if (a) {
                str3 = "RequestWarmSyncOperation complete: ";
                str4 = String.valueOf(str);
                if (str4.length() != 0) {
                    str3.concat(str4);
                } else {
                    str4 = new String(str3);
                }
            } else {
                str3 = "RequestWarmSyncOperation complete after restart ";
                str4 = String.valueOf(str);
                if (str4.length() != 0) {
                    str3.concat(str4);
                } else {
                    str4 = new String(str3);
                }
            }
        }
        return a;
    }

    public boolean d(String str) {
        boolean a = a(str, 0);
        if (blf.a) {
            String str2;
            String valueOf;
            if (a) {
                str2 = "RequestWarmSyncOperation failed: ";
                valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str2.concat(valueOf);
                } else {
                    valueOf = new String(str2);
                }
            } else {
                str2 = "RequestWarmSyncOperation failed after restart ";
                valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str2.concat(valueOf);
                } else {
                    valueOf = new String(str2);
                }
            }
        }
        return a;
    }

    public void a(boolean z) {
        this.k = z;
    }

    public void b(boolean z) {
        this.l = z;
    }

    public void b(long j) {
        this.o = j;
    }
}
