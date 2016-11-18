package defpackage;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class dzv implements dzx {
    private static final boolean a = false;
    private boolean b;
    private final String c;
    private final Thread d;
    private final LinkedList<dzz> e = new LinkedList();
    private boolean f;
    private final Object g = new Object();
    private dzz h;
    private String i;
    private long j = 500;
    private long k;
    private eah l;
    private dzy m;

    static {
        kae kae = glk.j;
    }

    public dzv(String str, dzy dzy) {
        this.c = str;
        this.f = false;
        this.m = dzy;
        this.l = dzy.b();
        this.d = new dzw(this);
        if (a) {
            new StringBuilder(String.valueOf(str).length() + 40).append("### starting network thread for queue '").append(str).append("'");
        }
        this.d.setName(this.c);
    }

    public void a() {
        if (this.d != null) {
            this.d.start();
        } else {
            glk.d("Babel_NetworkQueue", "Try to start the queue while the thread is null! ", new Object[0]);
        }
    }

    private void b(long j) {
        long j2 = Long.MAX_VALUE;
        synchronized (this.g) {
            String str;
            if (a) {
                if (j == Long.MAX_VALUE) {
                    str = "FOREVER";
                } else {
                    str = String.valueOf(j);
                }
                String str2 = this.c;
                new StringBuilder((String.valueOf(str2).length() + 38) + String.valueOf(str).length()).append("pausing queue ").append(str2).append("[").append(this.e.size()).append("]; duration ").append(str);
            }
            String str3;
            try {
                if (h()) {
                    return;
                }
                if (j != Long.MAX_VALUE) {
                    j2 = glj.b() + j;
                }
                this.k = j2;
                this.g.wait(j);
                if (this.m.a()) {
                    this.b = false;
                }
                if (a) {
                    str3 = this.c;
                    new StringBuilder(String.valueOf(str3).length() + 20).append("/pause ").append(str3).append("[").append(this.e.size()).append("]");
                }
            } catch (InterruptedException e) {
                String str4 = "Babel_NetworkQueue";
                str = "InterruptedException in pauseQueue: ";
                str3 = String.valueOf(e.toString());
                glk.d(str4, str3.length() != 0 ? str.concat(str3) : new String(str), new Object[0]);
            }
        }
    }

    private void a(dzz dzz) {
        synchronized (this.g) {
            if (a) {
                String valueOf = String.valueOf(dzz);
                new StringBuilder(String.valueOf(valueOf).length() + 40).append("Removing request:").append(valueOf).append(" queue_size:").append(this.e.size());
            }
            this.e.remove(dzz);
            this.l.a(dzz.a);
            if (dzz == this.h) {
                this.h = null;
                this.i = null;
            }
        }
    }

    private void g() {
        synchronized (this.g) {
            if (h()) {
                return;
            }
            long j = this.j;
            long a = glj.a();
            int size = this.e.size() - 1;
            while (size >= 0) {
                long j2;
                dzz dzz = (dzz) this.e.get(size);
                long f = dzz.f();
                if (f <= 0) {
                    if (this.h == dzz) {
                        this.i = "";
                        j2 = j;
                    } else {
                        a(dzz, fdo.a);
                        if (a) {
                            String valueOf = String.valueOf(dzz);
                            new StringBuilder(String.valueOf(valueOf).length() + 38).append("pausing queue: remove expired request:").append(valueOf);
                        }
                        a(dzz);
                        j2 = j;
                    }
                } else if (f < j) {
                    j2 = f;
                } else {
                    j2 = j;
                }
                size--;
                j = j2;
            }
            if (this.e.size() > 0) {
                j2 = ((dzz) this.e.get(0)).g();
                if (j2 > 0) {
                    j = Math.max(j2 - a, j);
                }
            }
            this.b = true;
            b(j);
        }
    }

    public void a(boolean z) {
        synchronized (this.g) {
            if (z) {
                if (!this.b) {
                    return;
                }
            }
            if (a) {
                String str = this.c;
                new StringBuilder(String.valueOf(str).length() + 29).append("resuming queue ").append(str).append(" [").append(this.e.size()).append("]");
            }
            this.b = false;
            this.g.notifyAll();
        }
    }

    public long b() {
        long j = Long.MAX_VALUE;
        synchronized (this.g) {
            if (this.e.size() == 0) {
                return Long.MAX_VALUE;
            }
            if (this.m.a()) {
                j = this.j;
            }
            int i = 0;
            long j2 = j;
            while (i < this.e.size()) {
                j = ((dzz) this.e.get(i)).f();
                if (j < 0 || j >= j2) {
                    j = j2;
                }
                i++;
                j2 = j;
            }
            return j2;
        }
    }

    public int c() {
        return this.e.size();
    }

    void f() {
        String valueOf;
        while (true) {
            dzz i = i();
            if (i != null && !((jcf) jyn.a(gwb.H(), jcf.class)).c(i.c.b())) {
                a(i);
            } else if (i != null) {
                String str;
                eag eag = new eag();
                int a = i.a(this.m, eag);
                int c = c();
                if (a) {
                    str = this.c;
                    new StringBuilder(String.valueOf(str).length() + 32).append("Network Queue ").append(str).append(" size: ").append(c);
                }
                ba.a(i.c.b(), glj.a(), 14, ba.c().e(this.c).c(c).d(1).e(3));
                long a2 = glj.a();
                if (!this.m.c()) {
                    break;
                }
                if (a == eae.a) {
                    a = i.b(this.m, eag);
                }
                if (a == eae.b) {
                    this.j = 500;
                    if (a) {
                        valueOf = String.valueOf(i);
                        new StringBuilder(String.valueOf(valueOf).length() + 41).append("request successful. removing from queue: ").append(valueOf);
                    }
                    a(i);
                    this.m.a(true);
                    a = 0;
                } else {
                    long a3 = glj.a();
                    if (glk.a("Babel_NetworkQueue", 3)) {
                        glk.a("Babel_NetworkQueue", String.format(Locale.US, "error sending %s; took %d ms (error code == %d)", new Object[]{i, Long.valueOf(a3 - a2), Integer.valueOf(eag.a())}), new Object[0]);
                    }
                    synchronized (this.g) {
                        this.m.a(false);
                        if (this.i != null) {
                            RealTimeChatService.b(this.i);
                        }
                        boolean z = this.i == null && i.d(this.m, eag);
                        if (z) {
                            if (eag.b() > 0) {
                                i.c.b = glj.a() + eag.b();
                            }
                            this.l.a(i);
                            this.j = Math.min(TimeUnit.SECONDS.toMillis(3600), this.j << 1);
                            if (a) {
                                valueOf = String.valueOf(i);
                                new StringBuilder(String.valueOf(valueOf).length() + 59).append("pausing queue after failed request:").append(valueOf).append("; error code:").append(eag.a());
                            }
                            z = true;
                        } else {
                            fdo c2 = eag.c();
                            if (a) {
                                str = String.valueOf(i);
                                new StringBuilder(String.valueOf(str).length() + 40).append("not retrying ").append(str).append("; error code == ").append(eag.a());
                            }
                            a(i, c2);
                            a(i);
                            a = 0;
                        }
                        this.h = null;
                    }
                }
                synchronized (this.g) {
                    this.m.d();
                    if (a != 0) {
                        g();
                    }
                }
            } else {
                synchronized (this.g) {
                    if (h()) {
                        break;
                    }
                }
            }
        }
        if (a) {
            valueOf = this.c;
            new StringBuilder(String.valueOf(valueOf).length() + 24).append("### queue '").append(valueOf).append("' is finished");
        }
    }

    private boolean h() {
        return this.f;
    }

    private dzz i() {
        dzz dzz = null;
        synchronized (this.g) {
            if (!h()) {
                if (this.e.size() == 0) {
                    b(Long.MAX_VALUE);
                }
                if (this.e.size() > 0) {
                    this.h = (dzz) this.e.getLast();
                    this.i = null;
                    dzz = this.h;
                }
            }
        }
        return dzz;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(defpackage.dzz r9, boolean r10) {
        /*
        r8 = this;
        r1 = r8.g;
        monitor-enter(r1);
        r0 = a;	 Catch:{ all -> 0x004d }
        if (r0 == 0) goto L_0x0033;
    L_0x0007:
        r0 = java.lang.String.valueOf(r9);	 Catch:{ all -> 0x004d }
        r2 = r8.e;	 Catch:{ all -> 0x004d }
        r2 = r2.size();	 Catch:{ all -> 0x004d }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x004d }
        r4 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x004d }
        r4 = r4.length();	 Catch:{ all -> 0x004d }
        r4 = r4 + 37;
        r3.<init>(r4);	 Catch:{ all -> 0x004d }
        r4 = "queueRequest: ";
        r3 = r3.append(r4);	 Catch:{ all -> 0x004d }
        r0 = r3.append(r0);	 Catch:{ all -> 0x004d }
        r3 = "; length is ";
        r0 = r0.append(r3);	 Catch:{ all -> 0x004d }
        r0.append(r2);	 Catch:{ all -> 0x004d }
    L_0x0033:
        r0 = r8.h();	 Catch:{ all -> 0x004d }
        if (r0 == 0) goto L_0x0045;
    L_0x0039:
        r0 = "Babel_NetworkQueue";
        r2 = "can't call queueRequest after queue is finished";
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ all -> 0x004d }
        defpackage.glk.e(r0, r2, r3);	 Catch:{ all -> 0x004d }
        monitor-exit(r1);	 Catch:{ all -> 0x004d }
    L_0x0044:
        return;
    L_0x0045:
        r0 = r9.a();	 Catch:{ all -> 0x004d }
        if (r0 != 0) goto L_0x0050;
    L_0x004b:
        monitor-exit(r1);	 Catch:{ all -> 0x004d }
        goto L_0x0044;
    L_0x004d:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x004d }
        throw r0;
    L_0x0050:
        r0 = r9.e();	 Catch:{ all -> 0x004d }
        if (r0 == 0) goto L_0x0080;
    L_0x0056:
        r0 = defpackage.fdo.a;	 Catch:{ all -> 0x004d }
        r8.a(r9, r0);	 Catch:{ all -> 0x004d }
        r0 = a;	 Catch:{ all -> 0x004d }
        if (r0 == 0) goto L_0x007b;
    L_0x005f:
        r0 = java.lang.String.valueOf(r9);	 Catch:{ all -> 0x004d }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x004d }
        r3 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x004d }
        r3 = r3.length();	 Catch:{ all -> 0x004d }
        r3 = r3 + 45;
        r2.<init>(r3);	 Catch:{ all -> 0x004d }
        r3 = "Removing expired requestItem while queueing: ";
        r2 = r2.append(r3);	 Catch:{ all -> 0x004d }
        r2.append(r0);	 Catch:{ all -> 0x004d }
    L_0x007b:
        r8.a(r9);	 Catch:{ all -> 0x004d }
        monitor-exit(r1);	 Catch:{ all -> 0x004d }
        goto L_0x0044;
    L_0x0080:
        r0 = r8.b(r9);	 Catch:{ all -> 0x004d }
        if (r0 == 0) goto L_0x00b6;
    L_0x0086:
        r0 = r8.e;	 Catch:{ all -> 0x004d }
        r0 = r0.size();	 Catch:{ all -> 0x004d }
        r2 = 1;
        if (r0 != r2) goto L_0x0097;
    L_0x008f:
        r0 = r8.b;	 Catch:{ all -> 0x004d }
        if (r0 != 0) goto L_0x0097;
    L_0x0093:
        r0 = 0;
        r8.a(r0);	 Catch:{ all -> 0x004d }
    L_0x0097:
        r0 = r8.b;	 Catch:{ all -> 0x004d }
        if (r0 == 0) goto L_0x00b6;
    L_0x009b:
        if (r10 != 0) goto L_0x00b2;
    L_0x009d:
        r2 = r9.f();	 Catch:{ all -> 0x004d }
        r4 = defpackage.glj.b();	 Catch:{ all -> 0x004d }
        r6 = r8.k;	 Catch:{ all -> 0x004d }
        r6 = r6 - r4;
        r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r0 <= 0) goto L_0x00b2;
    L_0x00ac:
        r2 = r8.k;	 Catch:{ all -> 0x004d }
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 > 0) goto L_0x00b6;
    L_0x00b2:
        r0 = 0;
        r8.a(r0);	 Catch:{ all -> 0x004d }
    L_0x00b6:
        monitor-exit(r1);	 Catch:{ all -> 0x004d }
        goto L_0x0044;
        */
        throw new UnsupportedOperationException("Method not decompiled: dzv.a(dzz, boolean):void");
    }

    private boolean b(dzz dzz) {
        int i = 0;
        synchronized (this.g) {
            List arrayList = new ArrayList();
            int i2 = 0;
            int i3 = 0;
            while (i2 < this.e.size()) {
                int i4;
                dzz dzz2 = (dzz) this.e.get(i2);
                if (dzz != dzz2 && dzz.c.b() == dzz2.c.b()) {
                    if (dzz2.a == dzz.a) {
                        glk.a("Babel_NetworkQueue", "Insertion of " + dzz.a + " ignored since it isalready in the queue.", new Object[0]);
                        return false;
                    }
                    ead a = dzz.a();
                    ead a2 = dzz2.a();
                    if (a.getClass() == a2.getClass() && this.h != dzz2 && a.a(a2)) {
                        arrayList.add(dzz2);
                        i4 = i2;
                        i2++;
                        i3 = i4;
                    }
                }
                i4 = i3;
                i2++;
                i3 = i4;
            }
            this.e.add(i3, dzz);
            ArrayList arrayList2 = (ArrayList) arrayList;
            i2 = arrayList2.size();
            while (i < i2) {
                Object obj = arrayList2.get(i);
                i++;
                dzz dzz3 = (dzz) obj;
                if (a) {
                    String valueOf = String.valueOf(dzz3);
                    new StringBuilder(String.valueOf(valueOf).length() + 29).append("not sending replaced request ").append(valueOf);
                }
                a(dzz3);
            }
            return true;
        }
    }

    public void d() {
        synchronized (this.g) {
            String str;
            String valueOf;
            if (a) {
                str = "### finish ";
                valueOf = String.valueOf(toString());
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
            }
            this.f = true;
            a(false);
        }
        try {
            long a = glj.a();
            this.d.join(10000);
            long a2 = glj.a();
            if (a || this.d.isAlive()) {
                String.format(Locale.US, "LegacyNetworkQueue.finish [%s] took %d ms; isAlive returning %b", new Object[]{this.c, Long.valueOf(a2 - a), Boolean.valueOf(this.d.isAlive())});
            }
        } catch (InterruptedException e) {
            String str2 = "Babel_NetworkQueue";
            valueOf = "InterruptedException in finish: ";
            str = String.valueOf(e.toString());
            glk.d(str2, str.length() != 0 ? valueOf.concat(str) : new String(valueOf), new Object[0]);
        }
    }

    public String toString() {
        String stringBuilder;
        synchronized (this.g) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("LegacyNetworkQueue(").append(this.c).append(") pending count == ").append(this.e.size()).append("\n");
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                stringBuilder2.append(((dzz) it.next()).toString());
                stringBuilder2.append("\n");
            }
            stringBuilder = stringBuilder2.toString();
        }
        return stringBuilder;
    }

    public void a(String str) {
        int i = 0;
        synchronized (this.g) {
            int i2;
            if (h()) {
                glk.e("Babel_NetworkQueue", "Should not cancel a request why request writer is finished", new Object[0]);
            }
            List arrayList = new ArrayList();
            for (i2 = 0; i2 < this.e.size(); i2++) {
                dzz dzz = (dzz) this.e.get(i2);
                if (dzz.b(str)) {
                    dzz.a(this.m);
                    if (i2 != 0 || this.h == null) {
                        arrayList.add(dzz);
                    } else {
                        this.i = str;
                    }
                }
            }
            ArrayList arrayList2 = (ArrayList) arrayList;
            i2 = arrayList2.size();
            while (i < i2) {
                Object obj = arrayList2.get(i);
                i++;
                dzz dzz2 = (dzz) obj;
                if (a) {
                    String valueOf = String.valueOf(dzz2);
                    new StringBuilder(String.valueOf(valueOf).length() + 16).append("Cancel request: ").append(valueOf);
                }
                a(dzz2, fdo.b);
                a(dzz2);
                RealTimeChatService.b(str);
            }
        }
    }

    private void a(dzz dzz, fdo fdo) {
        dzz.a(this.m, fdo);
    }

    public long e() {
        return this.j;
    }

    public void a(long j) {
        this.j = j;
    }

    public boolean a(Thread thread) {
        if (this.d == null || this.d != thread) {
            return false;
        }
        return true;
    }
}
