package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class fqo {
    static volatile fqo f13757a;
    private static final boolean f13758n = false;
    private static volatile boolean f13759o = false;
    public int f13760b = -1;
    public volatile long f13761c = 300000;
    public volatile long f13762d = 3600000;
    public volatile long f13763e = 86400000;
    public volatile long f13764f = 172800000;
    public volatile int f13765g = 50;
    public volatile int f13766h = 100;
    public volatile int f13767i = 500;
    public volatile long f13768j = 604800000;
    public volatile int f13769k = 50;
    public volatile int f13770l = 2000;
    public volatile long f13771m = 604800000;
    private volatile long f13772p = 604800000;
    private volatile boolean f13773q;
    private volatile boolean f13774r = true;
    private volatile long f13775s;

    static {
        kae kae = glk.f15570q;
    }

    public static void m15978a(Context context) {
        fqo.m15980a(context, false);
    }

    public static void m15985b(Context context) {
        f13759o = false;
        ((bhl) jyn.m25426a(context, bhl.class)).mo552a(frc.m16028f());
    }

    private static void m15980a(Context context, boolean z) {
        if (!f13759o || z) {
            if (glk.m17973a("Babel", 3)) {
                glk.m17970a("Babel", "Scheduling database cleanup. forceReschedule=" + z, new Object[0]);
            }
            fqo.m15979a(context, ((long) gwb.m1492a(context, "babel_gc_next_start", 60)) * 60000);
            f13759o = true;
        }
    }

    public static void m15979a(Context context, long j) {
        if (f13758n) {
            new StringBuilder(63).append("Schedule next database clean up task after ").append(j);
        }
        ((bhl) jyn.m25426a(context, bhl.class)).mo550a(new frc(j));
    }

    public static fqo m15977a() {
        if (f13757a == null) {
            fqo fqo = new fqo();
            f13757a = fqo;
            fqo.m15988b();
            gwb.m2214g(gwb.m1400H()).mo563a(new fqp());
        }
        return f13757a;
    }

    void m15988b() {
        Context H = gwb.m1400H();
        this.f13761c = ((long) gwb.m1492a(H, "babel_gc_minimum_idle", 5)) * 60000;
        this.f13762d = ((long) gwb.m1492a(H, "babel_gc_message_expiration_slop", 60)) * 60000;
        this.f13763e = ((long) gwb.m1492a(H, "babel_gc_empty_conversation_slop", 1440)) * 60000;
        this.f13772p = ((long) gwb.m1492a(H, "babel_gc_expired_invitation_slop", 10080)) * 60000;
        this.f13764f = ((long) gwb.m1492a(H, "babel_gc_recent_scroll_slot", 2880)) * 60000;
        this.f13765g = gwb.m1492a(H, "babel_gc_min_conversations_to_keep", 50);
        this.f13767i = gwb.m1492a(H, "babel_gc_max_conversations_to_keep", 500);
        this.f13768j = ((long) gwb.m1492a(H, "babel_gc_recent_conversation_slop", 10080)) * 60000;
        this.f13766h = gwb.m1492a(H, "babel_gc_min_invites_to_keep", 100);
        this.f13769k = gwb.m1492a(H, "babel_gc_min_messages_to_keep", 50);
        this.f13770l = gwb.m1492a(H, "babel_gc_max_messages_to_keep", 2000);
        this.f13771m = ((long) gwb.m1492a(H, "babel_gc_recent_message_slop", 10080)) * 60000;
        fqo.m15980a(H, true);
    }

    public long m15989c() {
        return this.f13764f;
    }

    public synchronized boolean m15990c(Context context) {
        boolean z;
        if (this.f13773q || !m15986d(context)) {
            z = false;
        } else {
            this.f13773q = true;
            int[] f;
            if (this.f13760b == -1) {
                f = fde.m15022f();
            } else {
                f = new int[]{this.f13760b};
            }
            for (int i : r2) {
                if (f13758n) {
                    new StringBuilder(51).append("Starting database clean up for account: ").append(i);
                }
                bko e = fde.m15018e(i);
                if (e != null) {
                    int i2;
                    Object obj;
                    blo blo = new blo(context, e.m5638g());
                    if (m15986d(context)) {
                        i2 = blo.m6066i(TimeUnit.MILLISECONDS.toMicros(glj.m17956a()));
                        if (f13758n) {
                            new StringBuilder(46).append("Deleted ").append(i2).append(" expired event suggestions.");
                        }
                        obj = 1;
                    } else {
                        obj = null;
                    }
                    if (obj == null) {
                        this.f13773q = false;
                        z = false;
                        break;
                    }
                    if (m15986d(context)) {
                        i2 = blo.m6062h((glj.m17956a() - this.f13762d) * 1000);
                        if (f13758n) {
                            new StringBuilder(37).append("Deleted ").append(i2).append(" expired messages.");
                        }
                        obj = 1;
                    } else {
                        obj = null;
                    }
                    if (obj == null) {
                        this.f13773q = false;
                        z = false;
                        break;
                    }
                    if (m15986d(context)) {
                        i2 = blo.m6070j((glj.m17956a() - this.f13763e) * 1000);
                        if (f13758n) {
                            new StringBuilder(40).append("Deleted ").append(i2).append(" empty conversations.");
                        }
                        obj = 1;
                    } else {
                        obj = null;
                    }
                    if (obj == null) {
                        this.f13773q = false;
                        z = false;
                        break;
                    }
                    if (m15986d(context)) {
                        i2 = blo.m6074k((glj.m17956a() - this.f13772p) * 1000);
                        if (f13758n) {
                            new StringBuilder(40).append("Deleted ").append(i2).append(" expired invitations.");
                        }
                        obj = 1;
                    } else {
                        obj = null;
                    }
                    if (obj == null) {
                        this.f13773q = false;
                        z = false;
                        break;
                    } else if (!m15983a(context, blo, 2, this.f13765g)) {
                        this.f13773q = false;
                        z = false;
                        break;
                    } else if (!m15983a(context, blo, 1, this.f13766h)) {
                        this.f13773q = false;
                        z = false;
                        break;
                    } else {
                        try {
                            if (!m15982a(context, blo)) {
                                this.f13773q = false;
                                z = false;
                                break;
                            }
                            if (f13758n) {
                                new StringBuilder(51).append("Finished database clean up for account: ").append(i);
                            }
                            i2 = (int) (new File(bmr.m6166a(context, e.m5638g()).getReadableDatabase().getPath()).length() / 1024);
                            glk.m17970a("Babel", i + " database size is: " + i2 + " KB", new Object[0]);
                            ba.m4548a(i, glj.m17956a(), 16, ba.m4618c().m12786a(i2).m12801e(3));
                        } catch (Throwable th) {
                            this.f13773q = false;
                        }
                    }
                }
            }
            this.f13773q = false;
            z = true;
        }
        return z;
    }

    public void m15987a(boolean z) {
        this.f13774r = z;
        if (z) {
            this.f13775s = glj.m17956a();
        }
    }

    private static boolean m15981a(int i) {
        return i == 1 || i == 2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m15983a(Context context, blo blo, int i, int i2) {
        if (!m15986d(context)) {
            return false;
        }
        blo.m5958a();
        try {
            List b = blo.m6014b(this.f13767i, i);
            if (b.size() <= i2) {
                blo.m6015b();
                return true;
            }
            long a = gwb.m1523a((Long) b.get(i2 - 1));
            long u = blo.m6106u();
            if (u == 0 || a <= u) {
                u = a;
            }
            a = (glj.m17956a() - this.f13768j) * 1000;
            if (u <= a) {
                a = u;
            }
            if (b.size() >= this.f13767i) {
                u = gwb.m1523a((Long) b.get(this.f13767i - 1));
            }
            u = a;
            if (u < gwb.m1523a((Long) b.get(b.size() - 1))) {
                blo.m6015b();
                blo.m6028c();
                return true;
            } else if (m15986d(context)) {
                blo.m6034c(u, i);
                blo.m6015b();
                blo.m6028c();
                return true;
            } else {
                blo.m6015b();
                blo.m6028c();
                return false;
            }
        } finally {
            blo.m6028c();
        }
    }

    private boolean m15982a(Context context, blo blo) {
        if (!m15986d(context)) {
            return false;
        }
        ArrayList l = blo.m6081l();
        int size = l.size();
        int i = 0;
        while (i < size) {
            Object obj = l.get(i);
            i++;
            if (!m15984a(context, blo, (String) obj)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m15984a(Context context, blo blo, String str) {
        if (!m15986d(context)) {
            return false;
        }
        blo.m5958a();
        try {
            List f = blo.m6051f(str, this.f13770l);
            if (f.size() <= this.f13769k) {
                blo.m6015b();
                return true;
            }
            long a = gwb.m1523a((Long) f.get(this.f13769k - 1));
            long P = blo.m5924P(str);
            if (P == 0 || a <= P) {
                P = a;
            }
            a = (glj.m17956a() - this.f13771m) * 1000;
            if (P <= a) {
                a = P;
            }
            if (f.size() >= this.f13770l) {
                P = gwb.m1523a((Long) f.get(this.f13770l - 1));
            }
            P = a;
            if (P < gwb.m1523a((Long) f.get(f.size() - 1))) {
                blo.m6015b();
                blo.m6028c();
                return true;
            } else if (m15986d(context)) {
                int j = blo.m6071j(str, P);
                if (f13758n) {
                    new StringBuilder(String.valueOf(str).length() + 49).append("Deleted ").append(j).append(" old messages. conversationId=").append(str);
                }
                blo.m6015b();
                blo.m6028c();
                return true;
            } else {
                blo.m6015b();
                blo.m6028c();
                return false;
            }
        } finally {
            blo.m6028c();
        }
    }

    private boolean m15986d(Context context) {
        boolean z;
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            z = false;
        } else {
            int intExtra = registerReceiver.getIntExtra("plugged", -1);
            z = VERSION.SDK_INT >= 17 ? fqo.m15981a(intExtra) || intExtra == 4 : fqo.m15981a(intExtra);
        }
        if (this.f13774r && glj.m17956a() >= this.f13775s + this.f13761c && z) {
            return true;
        }
        if (f13758n) {
            new StringBuilder(131).append("Database clean up service okToRun check failed. mOkToRun=").append(this.f13774r).append(" mLastBabelIdleTimestamp=").append(this.f13775s).append(" charger connected=").append(z);
        }
        fqo.m15980a(context, true);
        return false;
    }
}
