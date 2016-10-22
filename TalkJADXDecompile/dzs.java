import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class dzs implements dzx {
    static final boolean a;
    final String b;
    final LinkedList<dzz> c;
    dzz d;
    final dzy e;
    Future f;
    private boolean g;
    private boolean h;
    private long i;
    private long j;
    private final eah k;
    private final Object l;
    private final mtm m;

    static {
        kae kae = glk.j;
        a = false;
    }

    public dzs(String str, dzy dzy) {
        this(str, dzy, null);
    }

    private dzs(String str, dzy dzy, ScheduledExecutorService scheduledExecutorService) {
        this.c = new LinkedList();
        this.i = 500;
        this.l = new Object();
        this.b = str;
        this.e = dzy;
        this.k = dzy.b();
        this.m = gwb.a(Executors.newSingleThreadScheduledExecutor(new mtu().a(new StringBuilder(String.valueOf(str).length() + 6).append("fq-").append(str).append("-%d").toString()).a()));
    }

    public void a() {
        a(false);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(dzz r9, boolean r10) {
        /*
        r8 = this;
        r4 = 0;
        r0 = a;
        if (r0 == 0) goto L_0x0031;
    L_0x0005:
        r0 = java.lang.String.valueOf(r9);
        r1 = r8.c;
        r1 = r1.size();
        r2 = new java.lang.StringBuilder;
        r3 = java.lang.String.valueOf(r0);
        r3 = r3.length();
        r3 = r3 + 37;
        r2.<init>(r3);
        r3 = "queueRequest: ";
        r2 = r2.append(r3);
        r0 = r2.append(r0);
        r2 = "; length is ";
        r0 = r0.append(r2);
        r0.append(r1);
    L_0x0031:
        r0 = r8.h();
        if (r0 == 0) goto L_0x0041;
    L_0x0037:
        r0 = "Babel_FutureNQ";
        r1 = "can't call queueRequest after queue is finished";
        r2 = new java.lang.Object[r4];
        glk.e(r0, r1, r2);
    L_0x0040:
        return;
    L_0x0041:
        r0 = r9.a();
        if (r0 == 0) goto L_0x0040;
    L_0x0047:
        r0 = r9.e();
        if (r0 == 0) goto L_0x0076;
    L_0x004d:
        r0 = fdo.a;
        r8.a(r9, r0);
        r0 = a;
        if (r0 == 0) goto L_0x0072;
    L_0x0056:
        r0 = java.lang.String.valueOf(r9);
        r1 = new java.lang.StringBuilder;
        r2 = java.lang.String.valueOf(r0);
        r2 = r2.length();
        r2 = r2 + 45;
        r1.<init>(r2);
        r2 = "Removing expired requestItem while queueing: ";
        r1 = r1.append(r2);
        r1.append(r0);
    L_0x0072:
        r8.b(r9);
        goto L_0x0040;
    L_0x0076:
        r0 = r8.c(r9);
        if (r0 == 0) goto L_0x0040;
    L_0x007c:
        r1 = r8.l;
        monitor-enter(r1);
        r0 = r8.h;	 Catch:{ all -> 0x0096 }
        if (r0 != 0) goto L_0x0099;
    L_0x0083:
        r0 = r8.c;	 Catch:{ all -> 0x0096 }
        r0 = r0.size();	 Catch:{ all -> 0x0096 }
        r2 = 1;
        if (r0 != r2) goto L_0x0094;
    L_0x008c:
        r0 = r8.d;	 Catch:{ all -> 0x0096 }
        if (r0 != 0) goto L_0x0094;
    L_0x0090:
        r0 = 0;
        r8.a(r0);	 Catch:{ all -> 0x0096 }
    L_0x0094:
        monitor-exit(r1);	 Catch:{ all -> 0x0096 }
        goto L_0x0040;
    L_0x0096:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0096 }
        throw r0;
    L_0x0099:
        if (r10 != 0) goto L_0x0090;
    L_0x009b:
        r2 = r9.f();	 Catch:{ all -> 0x0096 }
        r4 = glj.b();	 Catch:{ all -> 0x0096 }
        r6 = r8.j;	 Catch:{ all -> 0x0096 }
        r6 = r6 - r4;
        r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r0 <= 0) goto L_0x0090;
    L_0x00aa:
        r2 = r8.j;	 Catch:{ all -> 0x0096 }
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 > 0) goto L_0x0094;
    L_0x00b0:
        goto L_0x0090;
        */
        throw new UnsupportedOperationException("Method not decompiled: dzs.a(dzz, boolean):void");
    }

    public void a(boolean z) {
        synchronized (this.l) {
            boolean z2;
            if (z) {
                if (!this.h) {
                    return;
                }
            }
            if (a) {
                String str = this.b;
                new StringBuilder(String.valueOf(str).length() + 29).append("resuming queue ").append(str).append(" [").append(this.c.size()).append("]");
            }
            this.h = false;
            Future future = this.f;
            if (future == null || future.isDone() || future.isCancelled()) {
                z2 = true;
            } else {
                z2 = future.cancel(false);
            }
            if (z2) {
                this.f = null;
                f();
            }
        }
    }

    private void f() {
        synchronized (this.l) {
            if (this.d != null) {
                return;
            }
            dzz i = i();
            if (i == null) {
            } else if (this.e.c()) {
                msy.a(i.a(this.e, new eag(), this.m), new dzt(this), this.m);
            }
        }
    }

    void a(dzz dzz) {
        Object obj = null;
        synchronized (this.l) {
            int b = dzz.b();
            eag c = dzz.c();
            if (b == eae.b) {
                this.i = 500;
                if (a) {
                    String valueOf = String.valueOf(dzz);
                    new StringBuilder(String.valueOf(valueOf).length() + 41).append("request successful. removing from queue: ").append(valueOf);
                }
                b(dzz);
                this.e.a(true);
            } else {
                this.e.a(false);
                String d = dzz.d();
                if (d != null) {
                    RealTimeChatService.b(d);
                }
                Object obj2 = (d == null && dzz.d(this.e, c)) ? 1 : null;
                if (obj2 == null) {
                    fdo c2 = c.c();
                    if (a) {
                        d = String.valueOf(dzz);
                        new StringBuilder(String.valueOf(d).length() + 40).append("not retrying ").append(d).append("; error code == ").append(c.a());
                    }
                    a(dzz, c2);
                    b(dzz);
                } else {
                    if (c.b() > 0) {
                        dzz.c.b = glj.a() + c.b();
                    }
                    this.k.a(dzz);
                    this.i = Math.min(TimeUnit.HOURS.toMillis(1), this.i << 1);
                    if (a) {
                        String str = this.b;
                        d = String.valueOf(dzz);
                        new StringBuilder((String.valueOf(str).length() + 60) + String.valueOf(d).length()).append("pausing queue ").append(str).append(" after failed request:").append(d).append("; error code:").append(c.a());
                    }
                    int i = 1;
                }
                this.d = null;
            }
            this.e.d();
            if (obj != null) {
                g();
            } else {
                f();
            }
        }
    }

    private void g() {
        synchronized (this.l) {
            if (h()) {
                return;
            }
            long j = this.i;
            long a = glj.a();
            int size = this.c.size() - 1;
            while (size >= 0) {
                long min;
                dzz dzz = (dzz) this.c.get(size);
                long f = dzz.f();
                if (f > 0) {
                    min = Math.min(j, f);
                } else if (this.d != dzz) {
                    a(dzz, fdo.a);
                    if (a) {
                        String valueOf = String.valueOf(dzz);
                        new StringBuilder(String.valueOf(valueOf).length() + 38).append("pausing queue: remove expired request:").append(valueOf);
                    }
                    b(dzz);
                    min = j;
                } else {
                    min = j;
                }
                size--;
                j = min;
            }
            if (this.c.size() > 0) {
                min = ((dzz) this.c.get(0)).g();
                if (min > 0) {
                    j = Math.max(min - a, j);
                }
            }
            this.h = true;
            synchronized (this.l) {
                if (a) {
                    String str;
                    if (j == Long.MAX_VALUE) {
                        str = "FOREVER";
                    } else {
                        str = String.valueOf(j);
                    }
                    valueOf = this.b;
                    new StringBuilder((String.valueOf(valueOf).length() + 38) + String.valueOf(str).length()).append("pausing queue ").append(valueOf).append("[").append(this.c.size()).append("]; duration ").append(str);
                }
                if (h()) {
                } else {
                    this.j = j == Long.MAX_VALUE ? Long.MAX_VALUE : glj.b() + j;
                    if (j != Long.MAX_VALUE) {
                        this.f = this.m.a(new dzu(this), j, TimeUnit.MILLISECONDS);
                    }
                }
            }
        }
    }

    public long b() {
        long j = Long.MAX_VALUE;
        synchronized (this.l) {
            if (this.c.size() == 0) {
                return Long.MAX_VALUE;
            }
            if (this.e.a()) {
                j = this.i;
            }
            int i = 0;
            long j2 = j;
            while (i < this.c.size()) {
                j = ((dzz) this.c.get(i)).f();
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
        return this.c.size();
    }

    private void b(dzz dzz) {
        synchronized (this.l) {
            if (a) {
                String valueOf = String.valueOf(dzz);
                new StringBuilder(String.valueOf(valueOf).length() + 40).append("Removing request:").append(valueOf).append(" queue_size:").append(this.c.size());
            }
            this.c.remove(dzz);
            this.k.a(dzz.a);
            if (dzz == this.d) {
                this.d = null;
            }
        }
    }

    private boolean h() {
        return this.g;
    }

    private dzz i() {
        dzz dzz;
        synchronized (this.l) {
            if (h() || this.c.size() <= 0) {
                dzz = null;
            } else {
                this.d = (dzz) this.c.getLast();
                dzz = this.d;
            }
        }
        return dzz;
    }

    private boolean c(dzz dzz) {
        int i = 0;
        synchronized (this.l) {
            List arrayList = new ArrayList();
            int i2 = 0;
            int i3 = 0;
            while (i2 < this.c.size()) {
                int i4;
                dzz dzz2 = (dzz) this.c.get(i2);
                if (dzz != dzz2 && dzz.c.b() == dzz2.c.b()) {
                    if (dzz2.a == dzz.a) {
                        glk.a("Babel_FutureNQ", "Insertion of " + dzz.a + " ignored since it is already in the queue.", new Object[0]);
                        return false;
                    }
                    ead a = dzz.a();
                    ead a2 = dzz2.a();
                    if (a.getClass() == a2.getClass() && this.d != dzz2 && a.a(a2)) {
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
            this.c.add(i3, dzz);
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
                b(dzz3);
            }
            return true;
        }
    }

    public void d() {
        synchronized (this.l) {
            if (a) {
                String str = "### finish ";
                String valueOf = String.valueOf(toString());
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
            }
            this.g = true;
        }
        ExecutorService executorService = this.m;
        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(10, TimeUnit.SECONDS)) {
                executorService.shutdownNow();
                if (!executorService.awaitTermination(1, TimeUnit.SECONDS)) {
                    glk.d("Babel_FutureNQ", "Pool did not terminate", new Object[0]);
                }
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        synchronized (this.l) {
            stringBuilder.append("FutureNetworkQueue(").append(this.b).append(") pending count == ").append(this.c.size()).append("\n");
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                stringBuilder.append(((dzz) it.next()).toString());
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }

    public void a(String str) {
        int i = 0;
        synchronized (this.l) {
            if (h()) {
                glk.e("Babel_FutureNQ", "Should not cancel a request why request writer is finished", new Object[0]);
            }
            List arrayList = new ArrayList();
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                dzz dzz = (dzz) it.next();
                if (dzz.b(str)) {
                    dzz.a(this.e);
                    if (this.d == dzz) {
                        dzz.a(str);
                    } else {
                        arrayList.add(dzz);
                    }
                }
            }
            ArrayList arrayList2 = (ArrayList) arrayList;
            int size = arrayList2.size();
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                dzz dzz2 = (dzz) obj;
                if (a) {
                    String valueOf = String.valueOf(dzz2);
                    new StringBuilder(String.valueOf(valueOf).length() + 16).append("Cancel request: ").append(valueOf);
                }
                a(dzz2, fdo.b);
                b(dzz2);
                RealTimeChatService.b(str);
            }
        }
    }

    private void a(dzz dzz, fdo fdo) {
        dzz.a(this.e, fdo);
    }

    public long e() {
        return this.i;
    }

    public void a(long j) {
        this.i = j;
    }

    public boolean a(Thread thread) {
        return false;
    }
}
