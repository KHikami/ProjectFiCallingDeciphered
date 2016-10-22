import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import com.google.api.client.http.HttpStatusCodes;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public final class fqo {
    static volatile fqo a;
    private static final boolean n;
    private static volatile boolean o;
    public int b;
    public volatile long c;
    public volatile long d;
    public volatile long e;
    public volatile long f;
    public volatile int g;
    public volatile int h;
    public volatile int i;
    public volatile long j;
    public volatile int k;
    public volatile int l;
    public volatile long m;
    private volatile long p;
    private volatile boolean q;
    private volatile boolean r;
    private volatile long s;

    static {
        kae kae = glk.q;
        n = false;
        o = false;
    }

    public static void a(Context context) {
        a(context, false);
    }

    public static void b(Context context) {
        o = false;
        ((bhl) jyn.a(context, bhl.class)).a(frc.f());
    }

    private static void a(Context context, boolean z) {
        if (!o || z) {
            if (glk.a("Babel", 3)) {
                glk.a("Babel", "Scheduling database cleanup. forceReschedule=" + z, new Object[0]);
            }
            a(context, ((long) gwb.a(context, "babel_gc_next_start", 60)) * 60000);
            o = true;
        }
    }

    public static void a(Context context, long j) {
        if (n) {
            new StringBuilder(63).append("Schedule next database clean up task after ").append(j);
        }
        ((bhl) jyn.a(context, bhl.class)).a(new frc(j));
    }

    public static fqo a() {
        if (a == null) {
            fqo fqo = new fqo();
            a = fqo;
            fqo.b();
            gwb.g(gwb.H()).a(new fqp());
        }
        return a;
    }

    void b() {
        Context H = gwb.H();
        this.c = ((long) gwb.a(H, "babel_gc_minimum_idle", 5)) * 60000;
        this.d = ((long) gwb.a(H, "babel_gc_message_expiration_slop", 60)) * 60000;
        this.e = ((long) gwb.a(H, "babel_gc_empty_conversation_slop", 1440)) * 60000;
        this.p = ((long) gwb.a(H, "babel_gc_expired_invitation_slop", 10080)) * 60000;
        this.f = ((long) gwb.a(H, "babel_gc_recent_scroll_slot", 2880)) * 60000;
        this.g = gwb.a(H, "babel_gc_min_conversations_to_keep", 50);
        this.i = gwb.a(H, "babel_gc_max_conversations_to_keep", (int) HttpStatusCodes.STATUS_CODE_SERVER_ERROR);
        this.j = ((long) gwb.a(H, "babel_gc_recent_conversation_slop", 10080)) * 60000;
        this.h = gwb.a(H, "babel_gc_min_invites_to_keep", 100);
        this.k = gwb.a(H, "babel_gc_min_messages_to_keep", 50);
        this.l = gwb.a(H, "babel_gc_max_messages_to_keep", 2000);
        this.m = ((long) gwb.a(H, "babel_gc_recent_message_slop", 10080)) * 60000;
        a(H, true);
    }

    public fqo() {
        this.b = -1;
        this.c = 300000;
        this.d = 3600000;
        this.e = 86400000;
        this.p = 604800000;
        this.f = 172800000;
        this.g = 50;
        this.h = 100;
        this.i = HttpStatusCodes.STATUS_CODE_SERVER_ERROR;
        this.j = 604800000;
        this.k = 50;
        this.l = 2000;
        this.m = 604800000;
        this.r = true;
    }

    public long c() {
        return this.f;
    }

    public synchronized boolean c(Context context) {
        boolean z;
        if (this.q || !d(context)) {
            z = false;
        } else {
            this.q = true;
            int[] f;
            if (this.b == -1) {
                f = fde.f();
            } else {
                f = new int[]{this.b};
            }
            for (int i : r2) {
                if (n) {
                    new StringBuilder(51).append("Starting database clean up for account: ").append(i);
                }
                bko e = fde.e(i);
                if (e != null) {
                    int i2;
                    Object obj;
                    blo blo = new blo(context, e.g());
                    if (d(context)) {
                        i2 = blo.i(TimeUnit.MILLISECONDS.toMicros(glj.a()));
                        if (n) {
                            new StringBuilder(46).append("Deleted ").append(i2).append(" expired event suggestions.");
                        }
                        obj = 1;
                    } else {
                        obj = null;
                    }
                    if (obj == null) {
                        this.q = false;
                        z = false;
                    } else {
                        if (d(context)) {
                            i2 = blo.h((glj.a() - this.d) * 1000);
                            if (n) {
                                new StringBuilder(37).append("Deleted ").append(i2).append(" expired messages.");
                            }
                            obj = 1;
                        } else {
                            obj = null;
                        }
                        if (obj == null) {
                            this.q = false;
                            z = false;
                        } else {
                            if (d(context)) {
                                i2 = blo.j((glj.a() - this.e) * 1000);
                                if (n) {
                                    new StringBuilder(40).append("Deleted ").append(i2).append(" empty conversations.");
                                }
                                obj = 1;
                            } else {
                                obj = null;
                            }
                            if (obj == null) {
                                this.q = false;
                                z = false;
                            } else {
                                if (d(context)) {
                                    i2 = blo.k((glj.a() - this.p) * 1000);
                                    if (n) {
                                        new StringBuilder(40).append("Deleted ").append(i2).append(" expired invitations.");
                                    }
                                    obj = 1;
                                } else {
                                    obj = null;
                                }
                                if (obj == null) {
                                    this.q = false;
                                    z = false;
                                } else if (!a(context, blo, 2, this.g)) {
                                    this.q = false;
                                    z = false;
                                } else if (a(context, blo, 1, this.h)) {
                                    try {
                                        if (a(context, blo)) {
                                            if (n) {
                                                new StringBuilder(51).append("Finished database clean up for account: ").append(i);
                                            }
                                            i2 = (int) (new File(bmr.a(context, e.g()).getReadableDatabase().getPath()).length() / 1024);
                                            glk.a("Babel", i + " database size is: " + i2 + " KB", new Object[0]);
                                            ba.a(i, glj.a(), 16, ba.c().a(i2).e(3));
                                        } else {
                                            this.q = false;
                                            z = false;
                                        }
                                    } catch (Throwable th) {
                                        this.q = false;
                                    }
                                } else {
                                    this.q = false;
                                    z = false;
                                }
                            }
                        }
                    }
                }
            }
            this.q = false;
            z = true;
        }
        return z;
    }

    public void a(boolean z) {
        this.r = z;
        if (z) {
            this.s = glj.a();
        }
    }

    private static boolean a(int i) {
        return i == 1 || i == 2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(android.content.Context r11, blo r12, int r13, int r14) {
        /*
        r10 = this;
        r1 = 0;
        r2 = 1;
        r0 = r10.d(r11);
        if (r0 != 0) goto L_0x000a;
    L_0x0008:
        r0 = r1;
    L_0x0009:
        return r0;
    L_0x000a:
        r12.a();
        r0 = r10.i;	 Catch:{ all -> 0x009a }
        r3 = r12.b(r0, r13);	 Catch:{ all -> 0x009a }
        r0 = r3.size();	 Catch:{ all -> 0x009a }
        if (r0 > r14) goto L_0x0021;
    L_0x0019:
        r12.b();	 Catch:{ all -> 0x009a }
        r12.c();
        r0 = r2;
        goto L_0x0009;
    L_0x0021:
        r0 = r14 + -1;
        r0 = r3.get(r0);	 Catch:{ all -> 0x009a }
        r0 = (java.lang.Long) r0;	 Catch:{ all -> 0x009a }
        r6 = gwb.a(r0);	 Catch:{ all -> 0x009a }
        r4 = r12.u();	 Catch:{ all -> 0x009a }
        r8 = 0;
        r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r0 == 0) goto L_0x00a3;
    L_0x0037:
        r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r0 <= 0) goto L_0x00a3;
    L_0x003b:
        r6 = glj.a();	 Catch:{ all -> 0x009a }
        r8 = r10.j;	 Catch:{ all -> 0x009a }
        r6 = r6 - r8;
        r8 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r6 = r6 * r8;
        r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r0 <= 0) goto L_0x00a1;
    L_0x0049:
        r0 = r3.size();	 Catch:{ all -> 0x009a }
        r4 = r10.i;	 Catch:{ all -> 0x009a }
        if (r0 < r4) goto L_0x009f;
    L_0x0051:
        r0 = r10.i;	 Catch:{ all -> 0x009a }
        r0 = r0 + -1;
        r0 = r3.get(r0);	 Catch:{ all -> 0x009a }
        r0 = (java.lang.Long) r0;	 Catch:{ all -> 0x009a }
        r4 = gwb.a(r0);	 Catch:{ all -> 0x009a }
        r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r0 >= 0) goto L_0x009f;
    L_0x0063:
        r0 = r3.size();	 Catch:{ all -> 0x009a }
        r0 = r0 + -1;
        r0 = r3.get(r0);	 Catch:{ all -> 0x009a }
        r0 = (java.lang.Long) r0;	 Catch:{ all -> 0x009a }
        r6 = gwb.a(r0);	 Catch:{ all -> 0x009a }
        r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r0 >= 0) goto L_0x007f;
    L_0x0077:
        r12.b();	 Catch:{ all -> 0x009a }
        r12.c();
        r0 = r2;
        goto L_0x0009;
    L_0x007f:
        r0 = r10.d(r11);	 Catch:{ all -> 0x009a }
        if (r0 != 0) goto L_0x008e;
    L_0x0085:
        r12.b();	 Catch:{ all -> 0x009a }
        r12.c();
        r0 = r1;
        goto L_0x0009;
    L_0x008e:
        r12.c(r4, r13);	 Catch:{ all -> 0x009a }
        r12.b();	 Catch:{ all -> 0x009a }
        r12.c();
        r0 = r2;
        goto L_0x0009;
    L_0x009a:
        r0 = move-exception;
        r12.c();
        throw r0;
    L_0x009f:
        r4 = r6;
        goto L_0x0063;
    L_0x00a1:
        r6 = r4;
        goto L_0x0049;
    L_0x00a3:
        r4 = r6;
        goto L_0x003b;
        */
        throw new UnsupportedOperationException("Method not decompiled: fqo.a(android.content.Context, blo, int, int):boolean");
    }

    private boolean a(Context context, blo blo) {
        if (!d(context)) {
            return false;
        }
        ArrayList l = blo.l();
        int size = l.size();
        int i = 0;
        while (i < size) {
            Object obj = l.get(i);
            i++;
            if (!a(context, blo, (String) obj)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(android.content.Context r11, blo r12, java.lang.String r13) {
        /*
        r10 = this;
        r1 = 0;
        r2 = 1;
        r0 = r10.d(r11);
        if (r0 != 0) goto L_0x000a;
    L_0x0008:
        r0 = r1;
    L_0x0009:
        return r0;
    L_0x000a:
        r12.a();
        r0 = r10.l;	 Catch:{ all -> 0x00c5 }
        r3 = r12.f(r13, r0);	 Catch:{ all -> 0x00c5 }
        r0 = r3.size();	 Catch:{ all -> 0x00c5 }
        r4 = r10.k;	 Catch:{ all -> 0x00c5 }
        if (r0 > r4) goto L_0x0023;
    L_0x001b:
        r12.b();	 Catch:{ all -> 0x00c5 }
        r12.c();
        r0 = r2;
        goto L_0x0009;
    L_0x0023:
        r0 = r10.k;	 Catch:{ all -> 0x00c5 }
        r0 = r0 + -1;
        r0 = r3.get(r0);	 Catch:{ all -> 0x00c5 }
        r0 = (java.lang.Long) r0;	 Catch:{ all -> 0x00c5 }
        r6 = gwb.a(r0);	 Catch:{ all -> 0x00c5 }
        r4 = r12.P(r13);	 Catch:{ all -> 0x00c5 }
        r8 = 0;
        r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r0 == 0) goto L_0x00ce;
    L_0x003b:
        r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r0 <= 0) goto L_0x00ce;
    L_0x003f:
        r6 = glj.a();	 Catch:{ all -> 0x00c5 }
        r8 = r10.m;	 Catch:{ all -> 0x00c5 }
        r6 = r6 - r8;
        r8 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r6 = r6 * r8;
        r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r0 <= 0) goto L_0x00cc;
    L_0x004d:
        r0 = r3.size();	 Catch:{ all -> 0x00c5 }
        r4 = r10.l;	 Catch:{ all -> 0x00c5 }
        if (r0 < r4) goto L_0x00ca;
    L_0x0055:
        r0 = r10.l;	 Catch:{ all -> 0x00c5 }
        r0 = r0 + -1;
        r0 = r3.get(r0);	 Catch:{ all -> 0x00c5 }
        r0 = (java.lang.Long) r0;	 Catch:{ all -> 0x00c5 }
        r4 = gwb.a(r0);	 Catch:{ all -> 0x00c5 }
        r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r0 >= 0) goto L_0x00ca;
    L_0x0067:
        r0 = r3.size();	 Catch:{ all -> 0x00c5 }
        r0 = r0 + -1;
        r0 = r3.get(r0);	 Catch:{ all -> 0x00c5 }
        r0 = (java.lang.Long) r0;	 Catch:{ all -> 0x00c5 }
        r6 = gwb.a(r0);	 Catch:{ all -> 0x00c5 }
        r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r0 >= 0) goto L_0x0083;
    L_0x007b:
        r12.b();	 Catch:{ all -> 0x00c5 }
        r12.c();
        r0 = r2;
        goto L_0x0009;
    L_0x0083:
        r0 = r10.d(r11);	 Catch:{ all -> 0x00c5 }
        if (r0 != 0) goto L_0x0092;
    L_0x0089:
        r12.b();	 Catch:{ all -> 0x00c5 }
        r12.c();
        r0 = r1;
        goto L_0x0009;
    L_0x0092:
        r0 = r12.j(r13, r4);	 Catch:{ all -> 0x00c5 }
        r1 = n;	 Catch:{ all -> 0x00c5 }
        if (r1 == 0) goto L_0x00bc;
    L_0x009a:
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00c5 }
        r3 = java.lang.String.valueOf(r13);	 Catch:{ all -> 0x00c5 }
        r3 = r3.length();	 Catch:{ all -> 0x00c5 }
        r3 = r3 + 49;
        r1.<init>(r3);	 Catch:{ all -> 0x00c5 }
        r3 = "Deleted ";
        r1 = r1.append(r3);	 Catch:{ all -> 0x00c5 }
        r0 = r1.append(r0);	 Catch:{ all -> 0x00c5 }
        r1 = " old messages. conversationId=";
        r0 = r0.append(r1);	 Catch:{ all -> 0x00c5 }
        r0.append(r13);	 Catch:{ all -> 0x00c5 }
    L_0x00bc:
        r12.b();	 Catch:{ all -> 0x00c5 }
        r12.c();
        r0 = r2;
        goto L_0x0009;
    L_0x00c5:
        r0 = move-exception;
        r12.c();
        throw r0;
    L_0x00ca:
        r4 = r6;
        goto L_0x0067;
    L_0x00cc:
        r6 = r4;
        goto L_0x004d;
    L_0x00ce:
        r4 = r6;
        goto L_0x003f;
        */
        throw new UnsupportedOperationException("Method not decompiled: fqo.a(android.content.Context, blo, java.lang.String):boolean");
    }

    private boolean d(Context context) {
        boolean z;
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            z = false;
        } else {
            int intExtra = registerReceiver.getIntExtra("plugged", -1);
            z = VERSION.SDK_INT >= 17 ? a(intExtra) || intExtra == 4 : a(intExtra);
        }
        if (this.r && glj.a() >= this.s + this.c && z) {
            return true;
        }
        if (n) {
            new StringBuilder(131).append("Database clean up service okToRun check failed. mOkToRun=").append(this.r).append(" mLastBabelIdleTimestamp=").append(this.s).append(" charger connected=").append(z);
        }
        a(context, true);
        return false;
    }
}
