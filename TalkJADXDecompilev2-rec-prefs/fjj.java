package p000;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.api.client.http.ExponentialBackOffPolicy;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public final class fjj extends fgs {
    private static final gma f13193b = RealTimeChatService.f6745b;
    private static final ConcurrentHashMap<Integer, fjj> f13194g = new ConcurrentHashMap();
    private static final Random f13195h = new Random();
    private long f13196i = -1;
    private int f13197j = 0;
    private boolean f13198k = false;
    private boolean f13199l = false;
    private long f13200m = -1;
    private String f13201n = null;
    private long f13202o = -1;

    public static fjj m15425c(int i) {
        fjj fjj = (fjj) f13194g.get(Integer.valueOf(i));
        if (fjj != null) {
            return fjj;
        }
        f13194g.putIfAbsent(Integer.valueOf(i), new fjj(i, (long) (gwb.m1492a(gwb.m1400H(), "babel_warm_sync_lowmark_seconds", 7200) * 1000), (long) (gwb.m1492a(gwb.m1400H(), "babel_warm_sync_highmark_seconds", 604800) * 1000)));
        return (fjj) f13194g.get(Integer.valueOf(i));
    }

    public static fjj m15426d(int i) {
        return (fjj) f13194g.remove(Integer.valueOf(i));
    }

    private fjj(int i, long j, long j2) {
        super(fde.m15018e(i), j, j2);
        if (this.f5736c.f12722b.m5642k()) {
            this.f13200m = Long.MAX_VALUE;
            return;
        }
        long b = glj.m17963b();
        if (((jcf) jyn.m25426a(gwb.m1400H(), jcf.class)).mo3456a(i).mo3434a("warm_sync_deferral_limit", -1) != -1) {
            this.f13200m = ((long) (gwb.m1492a(gwb.m1400H(), "babel_maxsynctickledelay", (int) ExponentialBackOffPolicy.DEFAULT_MAX_INTERVAL_MILLIS) * 2)) + b;
        } else {
            this.f13200m = ((long) (gwb.m1492a(gwb.m1400H(), "babel_synctickledelay", 10000) * 2)) + b;
        }
    }

    public boolean mo2022g() {
        return this.f13200m < Long.MAX_VALUE && !fde.m15015d(this.f5736c.f12722b);
    }

    public boolean m15438h() {
        long b = glj.m17963b();
        long a = ((jcf) jyn.m25426a(gwb.m1400H(), jcf.class)).mo3456a(this.f5736c.f12721a).mo3434a("warm_sync_deferral_limit", -1);
        return a >= 0 && b < a;
    }

    public void m15439k() {
        ((jcf) jyn.m25426a(gwb.m1400H(), jcf.class)).mo3464b(this.f5736c.f12721a).m23893e("warm_sync_deferral_limit").m23891d();
    }

    public long m15427a(fjl fjl) {
        long j = Long.MAX_VALUE;
        if (mo2022g()) {
            long j2;
            long j3;
            long b = glj.m17963b();
            long a = (long) gwb.m1492a(gwb.m1400H(), "babel_maxsynctickledelay", (int) ExponentialBackOffPolicy.DEFAULT_MAX_INTERVAL_MILLIS);
            switch (fjk.f13203a[fjl.ordinal()]) {
                case 1:
                    j2 = b;
                    j3 = 0;
                    break;
                case 2:
                    j3 = (long) gwb.m1492a(gwb.m1400H(), "babel_hashsyncdelay", 5000);
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
            jci b2 = ((jcf) jyn.m25426a(gwb.m1400H(), jcf.class)).mo3464b(this.f5736c.f12721a);
            j = b2.mo3434a("warm_sync_deferral_limit", -1);
            if (j < 0 || j > j2) {
                b2.m23878b("warm_sync_deferral_limit", j2).m23891d();
            }
            if (j < 0 || j4 <= j) {
                j = j4;
            } else {
                j3 = Math.max(0, j - b);
            }
            if (gjk.f15365b) {
                gjn b3 = new gjn().m17819a("rtcs_set_sane_alarm").m17817a(this.f5736c.f12722b).m17822b(glj.m17956a() + j3);
                String valueOf = String.valueOf(fjl);
                b3.m17823b(new StringBuilder(String.valueOf(valueOf).length() + 31).append("delay=").append(j3).append("from ").append(valueOf).toString()).m17824b();
            }
            if (this.f13200m < j + a) {
                this.f13200m = j + a;
            }
        }
        return j;
    }

    public void w_() {
        String b = f13193b.m18078b("WarmSyncOp");
        long a = 1000 * glj.m17956a();
        String valueOf = String.valueOf(this.f13202o == -1 ? "" : "from_hash_sync:");
        String valueOf2 = String.valueOf(Long.toString(a + ((long) f13195h.nextInt(1000))));
        String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        synchronized (this) {
            this.f13201n = concat;
            this.f5737d.m15311b().clear();
            this.f13197j = 0;
        }
        int i = this.f5736c.f12721a;
        try {
            ((bln) jyn.m25426a(gwb.m1400H(), bln.class)).mo611a(new blo(gwb.m1400H(), i), this.f5737d, this.f13198k, this.f13199l, concat);
            f13193b.m18078b("WarmSyncServerOp");
        } catch (bmu e) {
            fjj.m15426d(i);
        }
        f13193b.m18079c(b);
    }

    protected long mo2021f() {
        if (this.f13196i == -1) {
            this.f13196i = bkq.m5659a(gwb.m1400H(), this.f5736c.f12721a, "last_warm_sync_localtime", 0);
        }
        return this.f13196i;
    }

    protected void mo2020a(long j) {
        this.f13196i = j;
        bkq.m5677b(gwb.m1400H(), this.f5736c.f12721a, "last_warm_sync_localtime", j);
    }

    public boolean m15430a(String str) {
        int i = this.f13197j;
        String str2 = this.f13201n == null ? "[IDLE]" : this.f13201n;
        new StringBuilder((String.valueOf(str).length() + 83) + String.valueOf(str2).length()).append("Increment pending requests for ").append(str).append(". Current number of pending request ").append(i).append(" for ").append(str2);
        synchronized (this) {
            if (this.f13201n == null || !this.f13201n.equals(str)) {
                return false;
            }
            this.f13197j++;
            return true;
        }
    }

    private boolean m15424a(String str, int i) {
        boolean z = false;
        synchronized (this) {
            if (this.f13201n == null || !this.f13201n.equals(str)) {
            } else {
                iil.m21874a("Expected condition to be true", m15279e());
                m15273a(i);
                this.f13201n = null;
                this.f13197j = 0;
                f13193b.m18079c("WarmSyncServerOp");
                z = true;
            }
        }
        return z;
    }

    public boolean m15433b(String str) {
        boolean z;
        int i = this.f13197j;
        String str2 = this.f13201n == null ? "[IDLE]" : this.f13201n;
        new StringBuilder((String.valueOf(str).length() + 83) + String.valueOf(str2).length()).append("Decrement pending requests for ").append(str).append(". Current number of pending request ").append(i).append(" for ").append(str2);
        synchronized (this) {
            if (this.f13201n != null && this.f13201n.equals(str)) {
                this.f13197j--;
                if (this.f13197j >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                iil.m21874a("Expected condition to be true", z);
                if (this.f13197j == 0) {
                    iil.m21874a("Expected condition to be true", m15279e());
                    m15273a(3);
                    this.f13201n = null;
                    this.f13197j = 0;
                    z = true;
                }
            }
            z = false;
        }
        if (z && blf.f3692a) {
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

    public boolean m15434c(String str) {
        boolean a = m15424a(str, 3);
        if (!a) {
            String str2 = "Babel_ReqWarmSyncOp";
            String str3 = str == null ? "null" : str;
            String str4 = this.f13201n == null ? "null" : this.f13201n;
            glk.m17981d(str2, new StringBuilder((String.valueOf(str3).length() + 57) + String.valueOf(str4).length()).append("RequestWarmSync: Mismatched key upon SANE completion ").append(str3).append(" != ").append(str4).toString(), new Object[0]);
            mo2020a(glj.m17956a());
        }
        if (blf.f3692a) {
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

    public boolean m15435d(String str) {
        boolean a = m15424a(str, 0);
        if (blf.f3692a) {
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

    public void m15429a(boolean z) {
        this.f13198k = z;
    }

    public void m15432b(boolean z) {
        this.f13199l = z;
    }

    public void m15431b(long j) {
        this.f13202o = j;
    }
}
