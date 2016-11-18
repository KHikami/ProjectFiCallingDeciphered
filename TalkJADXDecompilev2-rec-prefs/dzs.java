package p000;

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
    static final boolean f10944a = false;
    final String f10945b;
    final LinkedList<dzz> f10946c;
    dzz f10947d;
    final dzy f10948e;
    Future f10949f;
    private boolean f10950g;
    private boolean f10951h;
    private long f10952i;
    private long f10953j;
    private final eah f10954k;
    private final Object f10955l;
    private final mtm f10956m;

    static {
        kae kae = glk.f15563j;
    }

    public dzs(String str, dzy dzy) {
        this(str, dzy, null);
    }

    private dzs(String str, dzy dzy, ScheduledExecutorService scheduledExecutorService) {
        this.f10946c = new LinkedList();
        this.f10952i = 500;
        this.f10955l = new Object();
        this.f10945b = str;
        this.f10948e = dzy;
        this.f10954k = dzy.mo1190b();
        this.f10956m = gwb.m1719a(Executors.newSingleThreadScheduledExecutor(new mtu().m32893a(new StringBuilder(String.valueOf(str).length() + 6).append("fq-").append(str).append("-%d").toString()).m32892a()));
    }

    public void mo1790a() {
        mo1794a(false);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1792a(dzz dzz, boolean z) {
        if (f10944a) {
            String valueOf = String.valueOf(dzz);
            new StringBuilder(String.valueOf(valueOf).length() + 37).append("queueRequest: ").append(valueOf).append("; length is ").append(this.f10946c.size());
        }
        if (m13211h()) {
            glk.m17982e("Babel_FutureNQ", "can't call queueRequest after queue is finished", new Object[0]);
        } else if (dzz.m13246a() == null) {
        } else {
            if (dzz.m13258e()) {
                m13206a(dzz, fdo.f12752a);
                if (f10944a) {
                    valueOf = String.valueOf(dzz);
                    new StringBuilder(String.valueOf(valueOf).length() + 45).append("Removing expired requestItem while queueing: ").append(valueOf);
                }
                m13207b(dzz);
            } else if (m13208c(dzz)) {
                synchronized (this.f10955l) {
                    if (!this.f10951h) {
                        if (this.f10946c.size() == 1) {
                        }
                    } else if (!z) {
                        long f = dzz.m13259f();
                        long b = glj.m17963b();
                        if (f > this.f10953j - b) {
                            if (this.f10953j <= b) {
                            }
                        }
                    }
                    mo1794a(false);
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1794a(boolean z) {
        synchronized (this.f10955l) {
            boolean z2;
            if (z) {
                if (!this.f10951h) {
                    return;
                }
            }
            if (f10944a) {
                String str = this.f10945b;
                new StringBuilder(String.valueOf(str).length() + 29).append("resuming queue ").append(str).append(" [").append(this.f10946c.size()).append("]");
            }
            this.f10951h = false;
            Future future = this.f10949f;
            if (future == null || future.isDone() || future.isCancelled()) {
                z2 = true;
            } else {
                z2 = future.cancel(false);
            }
            if (z2) {
                this.f10949f = null;
                m13209f();
            }
        }
    }

    private void m13209f() {
        synchronized (this.f10955l) {
            if (this.f10947d != null) {
                return;
            }
            dzz i = m13212i();
            if (i == null) {
            } else if (this.f10948e.mo1191c()) {
                msy.m32871a(i.m13247a(this.f10948e, new eag(), this.f10956m), new dzt(this), this.f10956m);
            }
        }
    }

    void m13215a(dzz dzz) {
        Object obj = null;
        synchronized (this.f10955l) {
            int b = dzz.m13251b();
            eag c = dzz.m13255c();
            if (b == eae.f10997b) {
                this.f10952i = 500;
                if (f10944a) {
                    String valueOf = String.valueOf(dzz);
                    new StringBuilder(String.valueOf(valueOf).length() + 41).append("request successful. removing from queue: ").append(valueOf);
                }
                m13207b(dzz);
                this.f10948e.mo1188a(true);
            } else {
                this.f10948e.mo1188a(false);
                String d = dzz.m13256d();
                if (d != null) {
                    RealTimeChatService.m9081b(d);
                }
                Object obj2 = (d == null && dzz.m13257d(this.f10948e, c)) ? 1 : null;
                if (obj2 == null) {
                    fdo c2 = c.m13281c();
                    if (f10944a) {
                        d = String.valueOf(dzz);
                        new StringBuilder(String.valueOf(d).length() + 40).append("not retrying ").append(d).append("; error code == ").append(c.m13276a());
                    }
                    m13206a(dzz, c2);
                    m13207b(dzz);
                } else {
                    if (c.m13280b() > 0) {
                        dzz.f10976c.f10987b = glj.m17956a() + c.m13280b();
                    }
                    this.f10954k.mo2051a(dzz);
                    this.f10952i = Math.min(TimeUnit.HOURS.toMillis(1), this.f10952i << 1);
                    if (f10944a) {
                        String str = this.f10945b;
                        d = String.valueOf(dzz);
                        new StringBuilder((String.valueOf(str).length() + 60) + String.valueOf(d).length()).append("pausing queue ").append(str).append(" after failed request:").append(d).append("; error code:").append(c.m13276a());
                    }
                    int i = 1;
                }
                this.f10947d = null;
            }
            this.f10948e.mo1192d();
            if (obj != null) {
                m13210g();
            } else {
                m13209f();
            }
        }
    }

    private void m13210g() {
        synchronized (this.f10955l) {
            if (m13211h()) {
                return;
            }
            long j = this.f10952i;
            long a = glj.m17956a();
            int size = this.f10946c.size() - 1;
            while (size >= 0) {
                long min;
                dzz dzz = (dzz) this.f10946c.get(size);
                long f = dzz.m13259f();
                if (f > 0) {
                    min = Math.min(j, f);
                } else if (this.f10947d != dzz) {
                    m13206a(dzz, fdo.f12752a);
                    if (f10944a) {
                        String valueOf = String.valueOf(dzz);
                        new StringBuilder(String.valueOf(valueOf).length() + 38).append("pausing queue: remove expired request:").append(valueOf);
                    }
                    m13207b(dzz);
                    min = j;
                } else {
                    min = j;
                }
                size--;
                j = min;
            }
            if (this.f10946c.size() > 0) {
                min = ((dzz) this.f10946c.get(0)).m13260g();
                if (min > 0) {
                    j = Math.max(min - a, j);
                }
            }
            this.f10951h = true;
            synchronized (this.f10955l) {
                if (f10944a) {
                    String str;
                    if (j == Long.MAX_VALUE) {
                        str = "FOREVER";
                    } else {
                        str = String.valueOf(j);
                    }
                    valueOf = this.f10945b;
                    new StringBuilder((String.valueOf(valueOf).length() + 38) + String.valueOf(str).length()).append("pausing queue ").append(valueOf).append("[").append(this.f10946c.size()).append("]; duration ").append(str);
                }
                if (m13211h()) {
                } else {
                    this.f10953j = j == Long.MAX_VALUE ? Long.MAX_VALUE : glj.m17963b() + j;
                    if (j != Long.MAX_VALUE) {
                        this.f10949f = this.f10956m.mo3701a(new dzu(this), j, TimeUnit.MILLISECONDS);
                    }
                }
            }
        }
    }

    public long mo1796b() {
        long j = Long.MAX_VALUE;
        synchronized (this.f10955l) {
            if (this.f10946c.size() == 0) {
                return Long.MAX_VALUE;
            }
            if (this.f10948e.mo1189a()) {
                j = this.f10952i;
            }
            int i = 0;
            long j2 = j;
            while (i < this.f10946c.size()) {
                j = ((dzz) this.f10946c.get(i)).m13259f();
                if (j < 0 || j >= j2) {
                    j = j2;
                }
                i++;
                j2 = j;
            }
            return j2;
        }
    }

    public int mo1797c() {
        return this.f10946c.size();
    }

    private void m13207b(dzz dzz) {
        synchronized (this.f10955l) {
            if (f10944a) {
                String valueOf = String.valueOf(dzz);
                new StringBuilder(String.valueOf(valueOf).length() + 40).append("Removing request:").append(valueOf).append(" queue_size:").append(this.f10946c.size());
            }
            this.f10946c.remove(dzz);
            this.f10954k.mo2050a(dzz.f10974a);
            if (dzz == this.f10947d) {
                this.f10947d = null;
            }
        }
    }

    private boolean m13211h() {
        return this.f10950g;
    }

    private dzz m13212i() {
        dzz dzz;
        synchronized (this.f10955l) {
            if (m13211h() || this.f10946c.size() <= 0) {
                dzz = null;
            } else {
                this.f10947d = (dzz) this.f10946c.getLast();
                dzz = this.f10947d;
            }
        }
        return dzz;
    }

    private boolean m13208c(dzz dzz) {
        int i = 0;
        synchronized (this.f10955l) {
            List arrayList = new ArrayList();
            int i2 = 0;
            int i3 = 0;
            while (i2 < this.f10946c.size()) {
                int i4;
                dzz dzz2 = (dzz) this.f10946c.get(i2);
                if (dzz != dzz2 && dzz.f10976c.m13268b() == dzz2.f10976c.m13268b()) {
                    if (dzz2.f10974a == dzz.f10974a) {
                        glk.m17970a("Babel_FutureNQ", "Insertion of " + dzz.f10974a + " ignored since it is already in the queue.", new Object[0]);
                        return false;
                    }
                    ead a = dzz.m13246a();
                    ead a2 = dzz2.m13246a();
                    if (a.getClass() == a2.getClass() && this.f10947d != dzz2 && a.mo1015a(a2)) {
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
            this.f10946c.add(i3, dzz);
            ArrayList arrayList2 = (ArrayList) arrayList;
            i2 = arrayList2.size();
            while (i < i2) {
                Object obj = arrayList2.get(i);
                i++;
                dzz dzz3 = (dzz) obj;
                if (f10944a) {
                    String valueOf = String.valueOf(dzz3);
                    new StringBuilder(String.valueOf(valueOf).length() + 29).append("not sending replaced request ").append(valueOf);
                }
                m13207b(dzz3);
            }
            return true;
        }
    }

    public void mo1798d() {
        synchronized (this.f10955l) {
            if (f10944a) {
                String str = "### finish ";
                String valueOf = String.valueOf(toString());
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
            }
            this.f10950g = true;
        }
        ExecutorService executorService = this.f10956m;
        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(10, TimeUnit.SECONDS)) {
                executorService.shutdownNow();
                if (!executorService.awaitTermination(1, TimeUnit.SECONDS)) {
                    glk.m17981d("Babel_FutureNQ", "Pool did not terminate", new Object[0]);
                }
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        synchronized (this.f10955l) {
            stringBuilder.append("FutureNetworkQueue(").append(this.f10945b).append(") pending count == ").append(this.f10946c.size()).append("\n");
            Iterator it = this.f10946c.iterator();
            while (it.hasNext()) {
                stringBuilder.append(((dzz) it.next()).toString());
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }

    public void mo1793a(String str) {
        int i = 0;
        synchronized (this.f10955l) {
            if (m13211h()) {
                glk.m17982e("Babel_FutureNQ", "Should not cancel a request why request writer is finished", new Object[0]);
            }
            List arrayList = new ArrayList();
            Iterator it = this.f10946c.iterator();
            while (it.hasNext()) {
                dzz dzz = (dzz) it.next();
                if (dzz.m13253b(str)) {
                    dzz.m13248a(this.f10948e);
                    if (this.f10947d == dzz) {
                        dzz.m13250a(str);
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
                if (f10944a) {
                    String valueOf = String.valueOf(dzz2);
                    new StringBuilder(String.valueOf(valueOf).length() + 16).append("Cancel request: ").append(valueOf);
                }
                m13206a(dzz2, fdo.f12753b);
                m13207b(dzz2);
                RealTimeChatService.m9081b(str);
            }
        }
    }

    private void m13206a(dzz dzz, fdo fdo) {
        dzz.m13249a(this.f10948e, fdo);
    }

    public long mo1799e() {
        return this.f10952i;
    }

    public void mo1791a(long j) {
        this.f10952i = j;
    }

    public boolean mo1795a(Thread thread) {
        return false;
    }
}
