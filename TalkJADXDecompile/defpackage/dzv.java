package defpackage;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

/* renamed from: dzv */
public final class dzv implements dzx {
    private static final boolean a;
    private boolean b;
    private final String c;
    private final Thread d;
    private final LinkedList<dzz> e;
    private boolean f;
    private final Object g;
    private dzz h;
    private String i;
    private long j;
    private long k;
    private eah l;
    private dzy m;

    static {
        kae kae = glk.j;
        a = false;
    }

    public dzv(String str, dzy dzy) {
        this.e = new LinkedList();
        this.g = new Object();
        this.j = 500;
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
        String str;
        long j2 = Long.MAX_VALUE;
        synchronized (this.g) {
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
            long j;
            long j2 = this.j;
            long a = glj.a();
            int size = this.e.size() - 1;
            while (size >= 0) {
                dzz dzz = (dzz) this.e.get(size);
                long f = dzz.f();
                if (f <= 0) {
                    if (this.h == dzz) {
                        this.i = "";
                        j = j2;
                    } else {
                        a(dzz, fdo.a);
                        if (a) {
                            String valueOf = String.valueOf(dzz);
                            new StringBuilder(String.valueOf(valueOf).length() + 38).append("pausing queue: remove expired request:").append(valueOf);
                        }
                        a(dzz);
                        j = j2;
                    }
                } else if (f < j2) {
                    j = f;
                } else {
                    j = j2;
                }
                size--;
                j2 = j;
            }
            if (this.e.size() > 0) {
                j = ((dzz) this.e.get(0)).g();
                if (j > 0) {
                    j2 = Math.max(j - a, j2);
                }
            }
            this.b = true;
            b(j2);
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

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void f() {
        /*
        r13 = this;
        r12 = 3;
        r1 = 0;
        r2 = 1;
    L_0x0003:
        r3 = r13.i();
        if (r3 == 0) goto L_0x0025;
    L_0x0009:
        r0 = defpackage.gwb.H();
        r4 = defpackage.jcf.class;
        r0 = defpackage.jyn.a(r0, r4);
        r0 = (defpackage.jcf) r0;
        r4 = r3.c;
        r4 = r4.b();
        r0 = r0.c(r4);
        if (r0 != 0) goto L_0x0025;
    L_0x0021:
        r13.a(r3);
        goto L_0x0003;
    L_0x0025:
        if (r3 == 0) goto L_0x01d1;
    L_0x0027:
        r4 = new eag;
        r4.<init>();
        r0 = r13.m;
        r0 = r3.a(r0, r4);
        r5 = r13.c();
        r6 = a;
        if (r6 == 0) goto L_0x005e;
    L_0x003a:
        r6 = r13.c;
        r7 = new java.lang.StringBuilder;
        r8 = java.lang.String.valueOf(r6);
        r8 = r8.length();
        r8 = r8 + 32;
        r7.<init>(r8);
        r8 = "Network Queue ";
        r7 = r7.append(r8);
        r6 = r7.append(r6);
        r7 = " size: ";
        r6 = r6.append(r7);
        r6.append(r5);
    L_0x005e:
        r6 = r3.c;
        r6 = r6.b();
        r8 = defpackage.glj.a();
        r7 = 14;
        r10 = defpackage.ba.c();
        r11 = r13.c;
        r10 = r10.e(r11);
        r5 = r10.c(r5);
        r5 = r5.d(r2);
        r5 = r5.e(r12);
        defpackage.ba.a(r6, r8, r7, r5);
        r6 = defpackage.glj.a();
        r5 = r13.m;
        r5 = r5.c();
        if (r5 == 0) goto L_0x01db;
    L_0x008f:
        r5 = defpackage.eae.a;
        if (r0 != r5) goto L_0x0099;
    L_0x0093:
        r0 = r13.m;
        r0 = r3.b(r0, r4);
    L_0x0099:
        r5 = defpackage.eae.b;
        if (r0 != r5) goto L_0x00dd;
    L_0x009d:
        r4 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r13.j = r4;
        r0 = a;
        if (r0 == 0) goto L_0x00c1;
    L_0x00a5:
        r0 = java.lang.String.valueOf(r3);
        r4 = new java.lang.StringBuilder;
        r5 = java.lang.String.valueOf(r0);
        r5 = r5.length();
        r5 = r5 + 41;
        r4.<init>(r5);
        r5 = "request successful. removing from queue: ";
        r4 = r4.append(r5);
        r4.append(r0);
    L_0x00c1:
        r13.a(r3);
        r0 = r13.m;
        r0.a(r2);
        r0 = r1;
    L_0x00ca:
        r3 = r13.g;
        monitor-enter(r3);
        r4 = r13.m;	 Catch:{ all -> 0x00da }
        r4.d();	 Catch:{ all -> 0x00da }
        if (r0 == 0) goto L_0x00d7;
    L_0x00d4:
        r13.g();	 Catch:{ all -> 0x00da }
    L_0x00d7:
        monitor-exit(r3);	 Catch:{ all -> 0x00da }
        goto L_0x0003;
    L_0x00da:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x00da }
        throw r0;
    L_0x00dd:
        r8 = defpackage.glj.a();
        r0 = "Babel_NetworkQueue";
        r0 = defpackage.glk.a(r0, r12);
        if (r0 == 0) goto L_0x010f;
    L_0x00e9:
        r0 = "Babel_NetworkQueue";
        r5 = java.util.Locale.US;
        r10 = "error sending %s; took %d ms (error code == %d)";
        r11 = new java.lang.Object[r12];
        r11[r1] = r3;
        r6 = r8 - r6;
        r6 = java.lang.Long.valueOf(r6);
        r11[r2] = r6;
        r6 = 2;
        r7 = r4.a();
        r7 = java.lang.Integer.valueOf(r7);
        r11[r6] = r7;
        r5 = java.lang.String.format(r5, r10, r11);
        r6 = new java.lang.Object[r1];
        defpackage.glk.a(r0, r5, r6);
    L_0x010f:
        r5 = r13.g;
        monitor-enter(r5);
        r0 = r13.m;	 Catch:{ all -> 0x016f }
        r6 = 0;
        r0.a(r6);	 Catch:{ all -> 0x016f }
        r0 = r13.i;	 Catch:{ all -> 0x016f }
        if (r0 == 0) goto L_0x0121;
    L_0x011c:
        r0 = r13.i;	 Catch:{ all -> 0x016f }
        com.google.android.apps.hangouts.realtimechat.RealTimeChatService.b(r0);	 Catch:{ all -> 0x016f }
    L_0x0121:
        r0 = r13.i;	 Catch:{ all -> 0x016f }
        if (r0 != 0) goto L_0x0172;
    L_0x0125:
        r0 = r13.m;	 Catch:{ all -> 0x016f }
        r0 = r3.d(r0, r4);	 Catch:{ all -> 0x016f }
        if (r0 == 0) goto L_0x0172;
    L_0x012d:
        r0 = r2;
    L_0x012e:
        if (r0 != 0) goto L_0x0174;
    L_0x0130:
        r0 = r4.c();	 Catch:{ all -> 0x016f }
        r6 = a;	 Catch:{ all -> 0x016f }
        if (r6 == 0) goto L_0x0162;
    L_0x0138:
        r6 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x016f }
        r4 = r4.a();	 Catch:{ all -> 0x016f }
        r7 = new java.lang.StringBuilder;	 Catch:{ all -> 0x016f }
        r8 = java.lang.String.valueOf(r6);	 Catch:{ all -> 0x016f }
        r8 = r8.length();	 Catch:{ all -> 0x016f }
        r8 = r8 + 40;
        r7.<init>(r8);	 Catch:{ all -> 0x016f }
        r8 = "not retrying ";
        r7 = r7.append(r8);	 Catch:{ all -> 0x016f }
        r6 = r7.append(r6);	 Catch:{ all -> 0x016f }
        r7 = "; error code == ";
        r6 = r6.append(r7);	 Catch:{ all -> 0x016f }
        r6.append(r4);	 Catch:{ all -> 0x016f }
    L_0x0162:
        r13.a(r3, r0);	 Catch:{ all -> 0x016f }
        r13.a(r3);	 Catch:{ all -> 0x016f }
        r0 = r1;
    L_0x0169:
        r3 = 0;
        r13.h = r3;	 Catch:{ all -> 0x016f }
        monitor-exit(r5);	 Catch:{ all -> 0x016f }
        goto L_0x00ca;
    L_0x016f:
        r0 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x016f }
        throw r0;
    L_0x0172:
        r0 = r1;
        goto L_0x012e;
    L_0x0174:
        r6 = r4.b();	 Catch:{ all -> 0x016f }
        r8 = 0;
        r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r0 <= 0) goto L_0x018b;
    L_0x017e:
        r0 = r3.c;	 Catch:{ all -> 0x016f }
        r6 = defpackage.glj.a();	 Catch:{ all -> 0x016f }
        r8 = r4.b();	 Catch:{ all -> 0x016f }
        r6 = r6 + r8;
        r0.b = r6;	 Catch:{ all -> 0x016f }
    L_0x018b:
        r0 = r13.l;	 Catch:{ all -> 0x016f }
        r0.a(r3);	 Catch:{ all -> 0x016f }
        r0 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ all -> 0x016f }
        r6 = 3600; // 0xe10 float:5.045E-42 double:1.7786E-320;
        r6 = r0.toMillis(r6);	 Catch:{ all -> 0x016f }
        r8 = r13.j;	 Catch:{ all -> 0x016f }
        r8 = r8 << r2;
        r6 = java.lang.Math.min(r6, r8);	 Catch:{ all -> 0x016f }
        r13.j = r6;	 Catch:{ all -> 0x016f }
        r0 = a;	 Catch:{ all -> 0x016f }
        if (r0 == 0) goto L_0x01cf;
    L_0x01a5:
        r0 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x016f }
        r3 = r4.a();	 Catch:{ all -> 0x016f }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x016f }
        r6 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x016f }
        r6 = r6.length();	 Catch:{ all -> 0x016f }
        r6 = r6 + 59;
        r4.<init>(r6);	 Catch:{ all -> 0x016f }
        r6 = "pausing queue after failed request:";
        r4 = r4.append(r6);	 Catch:{ all -> 0x016f }
        r0 = r4.append(r0);	 Catch:{ all -> 0x016f }
        r4 = "; error code:";
        r0 = r0.append(r4);	 Catch:{ all -> 0x016f }
        r0.append(r3);	 Catch:{ all -> 0x016f }
    L_0x01cf:
        r0 = r2;
        goto L_0x0169;
    L_0x01d1:
        r3 = r13.g;
        monitor-enter(r3);
        r0 = r13.h();	 Catch:{ all -> 0x0203 }
        if (r0 == 0) goto L_0x0200;
    L_0x01da:
        monitor-exit(r3);	 Catch:{ all -> 0x0203 }
    L_0x01db:
        r0 = a;
        if (r0 == 0) goto L_0x01ff;
    L_0x01df:
        r0 = r13.c;
        r1 = new java.lang.StringBuilder;
        r2 = java.lang.String.valueOf(r0);
        r2 = r2.length();
        r2 = r2 + 24;
        r1.<init>(r2);
        r2 = "### queue '";
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r1 = "' is finished";
        r0.append(r1);
    L_0x01ff:
        return;
    L_0x0200:
        monitor-exit(r3);	 Catch:{ all -> 0x0203 }
        goto L_0x0003;
    L_0x0203:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0203 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: dzv.f():void");
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
