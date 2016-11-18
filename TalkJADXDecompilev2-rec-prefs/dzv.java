package p000;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class dzv implements dzx {
    private static final boolean f10959a = false;
    private boolean f10960b;
    private final String f10961c;
    private final Thread f10962d;
    private final LinkedList<dzz> f10963e = new LinkedList();
    private boolean f10964f;
    private final Object f10965g = new Object();
    private dzz f10966h;
    private String f10967i;
    private long f10968j = 500;
    private long f10969k;
    private eah f10970l;
    private dzy f10971m;

    static {
        kae kae = glk.f15563j;
    }

    public dzv(String str, dzy dzy) {
        this.f10961c = str;
        this.f10964f = false;
        this.f10971m = dzy;
        this.f10970l = dzy.mo1190b();
        this.f10962d = new dzw(this);
        if (f10959a) {
            new StringBuilder(String.valueOf(str).length() + 40).append("### starting network thread for queue '").append(str).append("'");
        }
        this.f10962d.setName(this.f10961c);
    }

    public void mo1790a() {
        if (this.f10962d != null) {
            this.f10962d.start();
        } else {
            glk.m17981d("Babel_NetworkQueue", "Try to start the queue while the thread is null! ", new Object[0]);
        }
    }

    private void m13229b(long j) {
        String str;
        long j2 = Long.MAX_VALUE;
        synchronized (this.f10965g) {
            String str2;
            if (f10959a) {
                if (j == Long.MAX_VALUE) {
                    str2 = "FOREVER";
                } else {
                    str2 = String.valueOf(j);
                }
                String str3 = this.f10961c;
                new StringBuilder((String.valueOf(str3).length() + 38) + String.valueOf(str2).length()).append("pausing queue ").append(str3).append("[").append(this.f10963e.size()).append("]; duration ").append(str2);
            }
            try {
                if (m13232h()) {
                    return;
                }
                if (j != Long.MAX_VALUE) {
                    j2 = glj.m17963b() + j;
                }
                this.f10969k = j2;
                this.f10965g.wait(j);
                if (this.f10971m.mo1189a()) {
                    this.f10960b = false;
                }
                if (f10959a) {
                    str = this.f10961c;
                    new StringBuilder(String.valueOf(str).length() + 20).append("/pause ").append(str).append("[").append(this.f10963e.size()).append("]");
                }
            } catch (InterruptedException e) {
                String str4 = "Babel_NetworkQueue";
                str2 = "InterruptedException in pauseQueue: ";
                str = String.valueOf(e.toString());
                glk.m17981d(str4, str.length() != 0 ? str2.concat(str) : new String(str2), new Object[0]);
            }
        }
    }

    private void m13227a(dzz dzz) {
        synchronized (this.f10965g) {
            if (f10959a) {
                String valueOf = String.valueOf(dzz);
                new StringBuilder(String.valueOf(valueOf).length() + 40).append("Removing request:").append(valueOf).append(" queue_size:").append(this.f10963e.size());
            }
            this.f10963e.remove(dzz);
            this.f10970l.mo2050a(dzz.f10974a);
            if (dzz == this.f10966h) {
                this.f10966h = null;
                this.f10967i = null;
            }
        }
    }

    private void m13231g() {
        synchronized (this.f10965g) {
            if (m13232h()) {
                return;
            }
            long j = this.f10968j;
            long a = glj.m17956a();
            int size = this.f10963e.size() - 1;
            while (size >= 0) {
                long j2;
                dzz dzz = (dzz) this.f10963e.get(size);
                long f = dzz.m13259f();
                if (f <= 0) {
                    if (this.f10966h == dzz) {
                        this.f10967i = "";
                        j2 = j;
                    } else {
                        m13228a(dzz, fdo.f12752a);
                        if (f10959a) {
                            String valueOf = String.valueOf(dzz);
                            new StringBuilder(String.valueOf(valueOf).length() + 38).append("pausing queue: remove expired request:").append(valueOf);
                        }
                        m13227a(dzz);
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
            if (this.f10963e.size() > 0) {
                j2 = ((dzz) this.f10963e.get(0)).m13260g();
                if (j2 > 0) {
                    j = Math.max(j2 - a, j);
                }
            }
            this.f10960b = true;
            m13229b(j);
        }
    }

    public void mo1794a(boolean z) {
        synchronized (this.f10965g) {
            if (z) {
                if (!this.f10960b) {
                    return;
                }
            }
            if (f10959a) {
                String str = this.f10961c;
                new StringBuilder(String.valueOf(str).length() + 29).append("resuming queue ").append(str).append(" [").append(this.f10963e.size()).append("]");
            }
            this.f10960b = false;
            this.f10965g.notifyAll();
        }
    }

    public long mo1796b() {
        long j = Long.MAX_VALUE;
        synchronized (this.f10965g) {
            if (this.f10963e.size() == 0) {
                return Long.MAX_VALUE;
            }
            if (this.f10971m.mo1189a()) {
                j = this.f10968j;
            }
            int i = 0;
            long j2 = j;
            while (i < this.f10963e.size()) {
                j = ((dzz) this.f10963e.get(i)).m13259f();
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
        return this.f10963e.size();
    }

    void m13244f() {
        String valueOf;
        while (true) {
            dzz i = m13233i();
            if (i != null && !((jcf) jyn.m25426a(gwb.m1400H(), jcf.class)).mo3467c(i.f10976c.m13268b())) {
                m13227a(i);
            } else if (i != null) {
                String str;
                eag eag = new eag();
                int a = i.m13245a(this.f10971m, eag);
                int c = mo1797c();
                if (f10959a) {
                    str = this.f10961c;
                    new StringBuilder(String.valueOf(str).length() + 32).append("Network Queue ").append(str).append(" size: ").append(c);
                }
                ba.m4548a(i.f10976c.m13268b(), glj.m17956a(), 14, ba.m4618c().m12802e(this.f10961c).m12796c(c).m12799d(1).m12801e(3));
                long a2 = glj.m17956a();
                if (!this.f10971m.mo1191c()) {
                    break;
                }
                if (a == eae.f10996a) {
                    a = i.m13252b(this.f10971m, eag);
                }
                if (a == eae.f10997b) {
                    this.f10968j = 500;
                    if (f10959a) {
                        valueOf = String.valueOf(i);
                        new StringBuilder(String.valueOf(valueOf).length() + 41).append("request successful. removing from queue: ").append(valueOf);
                    }
                    m13227a(i);
                    this.f10971m.mo1188a(true);
                    a = 0;
                } else {
                    long a3 = glj.m17956a();
                    if (glk.m17973a("Babel_NetworkQueue", 3)) {
                        glk.m17970a("Babel_NetworkQueue", String.format(Locale.US, "error sending %s; took %d ms (error code == %d)", new Object[]{i, Long.valueOf(a3 - a2), Integer.valueOf(eag.m13276a())}), new Object[0]);
                    }
                    synchronized (this.f10965g) {
                        this.f10971m.mo1188a(false);
                        if (this.f10967i != null) {
                            RealTimeChatService.m9081b(this.f10967i);
                        }
                        boolean z = this.f10967i == null && i.m13257d(this.f10971m, eag);
                        if (z) {
                            if (eag.m13280b() > 0) {
                                i.f10976c.f10987b = glj.m17956a() + eag.m13280b();
                            }
                            this.f10970l.mo2051a(i);
                            this.f10968j = Math.min(TimeUnit.SECONDS.toMillis(3600), this.f10968j << 1);
                            if (f10959a) {
                                valueOf = String.valueOf(i);
                                new StringBuilder(String.valueOf(valueOf).length() + 59).append("pausing queue after failed request:").append(valueOf).append("; error code:").append(eag.m13276a());
                            }
                            z = true;
                        } else {
                            fdo c2 = eag.m13281c();
                            if (f10959a) {
                                str = String.valueOf(i);
                                new StringBuilder(String.valueOf(str).length() + 40).append("not retrying ").append(str).append("; error code == ").append(eag.m13276a());
                            }
                            m13228a(i, c2);
                            m13227a(i);
                            a = 0;
                        }
                        this.f10966h = null;
                    }
                }
                synchronized (this.f10965g) {
                    this.f10971m.mo1192d();
                    if (a != 0) {
                        m13231g();
                    }
                }
            } else {
                synchronized (this.f10965g) {
                    if (m13232h()) {
                        break;
                    }
                }
            }
        }
        if (f10959a) {
            valueOf = this.f10961c;
            new StringBuilder(String.valueOf(valueOf).length() + 24).append("### queue '").append(valueOf).append("' is finished");
        }
    }

    private boolean m13232h() {
        return this.f10964f;
    }

    private dzz m13233i() {
        dzz dzz = null;
        synchronized (this.f10965g) {
            if (!m13232h()) {
                if (this.f10963e.size() == 0) {
                    m13229b(Long.MAX_VALUE);
                }
                if (this.f10963e.size() > 0) {
                    this.f10966h = (dzz) this.f10963e.getLast();
                    this.f10967i = null;
                    dzz = this.f10966h;
                }
            }
        }
        return dzz;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1792a(dzz dzz, boolean z) {
        synchronized (this.f10965g) {
            if (f10959a) {
                String valueOf = String.valueOf(dzz);
                new StringBuilder(String.valueOf(valueOf).length() + 37).append("queueRequest: ").append(valueOf).append("; length is ").append(this.f10963e.size());
            }
            if (m13232h()) {
                glk.m17982e("Babel_NetworkQueue", "can't call queueRequest after queue is finished", new Object[0]);
            } else if (dzz.m13246a() == null) {
            } else if (dzz.m13258e()) {
                m13228a(dzz, fdo.f12752a);
                if (f10959a) {
                    valueOf = String.valueOf(dzz);
                    new StringBuilder(String.valueOf(valueOf).length() + 45).append("Removing expired requestItem while queueing: ").append(valueOf);
                }
                m13227a(dzz);
            } else if (m13230b(dzz)) {
                if (this.f10963e.size() == 1 && !this.f10960b) {
                    mo1794a(false);
                }
                if (this.f10960b) {
                    if (!z) {
                        long f = dzz.m13259f();
                        long b = glj.m17963b();
                        if (f > this.f10969k - b) {
                        }
                    }
                    mo1794a(false);
                }
            }
        }
    }

    private boolean m13230b(dzz dzz) {
        int i = 0;
        synchronized (this.f10965g) {
            List arrayList = new ArrayList();
            int i2 = 0;
            int i3 = 0;
            while (i2 < this.f10963e.size()) {
                int i4;
                dzz dzz2 = (dzz) this.f10963e.get(i2);
                if (dzz != dzz2 && dzz.f10976c.m13268b() == dzz2.f10976c.m13268b()) {
                    if (dzz2.f10974a == dzz.f10974a) {
                        glk.m17970a("Babel_NetworkQueue", "Insertion of " + dzz.f10974a + " ignored since it isalready in the queue.", new Object[0]);
                        return false;
                    }
                    ead a = dzz.m13246a();
                    ead a2 = dzz2.m13246a();
                    if (a.getClass() == a2.getClass() && this.f10966h != dzz2 && a.mo1015a(a2)) {
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
            this.f10963e.add(i3, dzz);
            ArrayList arrayList2 = (ArrayList) arrayList;
            i2 = arrayList2.size();
            while (i < i2) {
                Object obj = arrayList2.get(i);
                i++;
                dzz dzz3 = (dzz) obj;
                if (f10959a) {
                    String valueOf = String.valueOf(dzz3);
                    new StringBuilder(String.valueOf(valueOf).length() + 29).append("not sending replaced request ").append(valueOf);
                }
                m13227a(dzz3);
            }
            return true;
        }
    }

    public void mo1798d() {
        synchronized (this.f10965g) {
            String str;
            String valueOf;
            if (f10959a) {
                str = "### finish ";
                valueOf = String.valueOf(toString());
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
            }
            this.f10964f = true;
            mo1794a(false);
        }
        try {
            long a = glj.m17956a();
            this.f10962d.join(10000);
            long a2 = glj.m17956a();
            if (f10959a || this.f10962d.isAlive()) {
                String.format(Locale.US, "LegacyNetworkQueue.finish [%s] took %d ms; isAlive returning %b", new Object[]{this.f10961c, Long.valueOf(a2 - a), Boolean.valueOf(this.f10962d.isAlive())});
            }
        } catch (InterruptedException e) {
            String str2 = "Babel_NetworkQueue";
            valueOf = "InterruptedException in finish: ";
            str = String.valueOf(e.toString());
            glk.m17981d(str2, str.length() != 0 ? valueOf.concat(str) : new String(valueOf), new Object[0]);
        }
    }

    public String toString() {
        String stringBuilder;
        synchronized (this.f10965g) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("LegacyNetworkQueue(").append(this.f10961c).append(") pending count == ").append(this.f10963e.size()).append("\n");
            Iterator it = this.f10963e.iterator();
            while (it.hasNext()) {
                stringBuilder2.append(((dzz) it.next()).toString());
                stringBuilder2.append("\n");
            }
            stringBuilder = stringBuilder2.toString();
        }
        return stringBuilder;
    }

    public void mo1793a(String str) {
        int i = 0;
        synchronized (this.f10965g) {
            int i2;
            if (m13232h()) {
                glk.m17982e("Babel_NetworkQueue", "Should not cancel a request why request writer is finished", new Object[0]);
            }
            List arrayList = new ArrayList();
            for (i2 = 0; i2 < this.f10963e.size(); i2++) {
                dzz dzz = (dzz) this.f10963e.get(i2);
                if (dzz.m13253b(str)) {
                    dzz.m13248a(this.f10971m);
                    if (i2 != 0 || this.f10966h == null) {
                        arrayList.add(dzz);
                    } else {
                        this.f10967i = str;
                    }
                }
            }
            ArrayList arrayList2 = (ArrayList) arrayList;
            i2 = arrayList2.size();
            while (i < i2) {
                Object obj = arrayList2.get(i);
                i++;
                dzz dzz2 = (dzz) obj;
                if (f10959a) {
                    String valueOf = String.valueOf(dzz2);
                    new StringBuilder(String.valueOf(valueOf).length() + 16).append("Cancel request: ").append(valueOf);
                }
                m13228a(dzz2, fdo.f12753b);
                m13227a(dzz2);
                RealTimeChatService.m9081b(str);
            }
        }
    }

    private void m13228a(dzz dzz, fdo fdo) {
        dzz.m13249a(this.f10971m, fdo);
    }

    public long mo1799e() {
        return this.f10968j;
    }

    public void mo1791a(long j) {
        this.f10968j = j;
    }

    public boolean mo1795a(Thread thread) {
        if (this.f10962d == null || this.f10962d != thread) {
            return false;
        }
        return true;
    }
}
