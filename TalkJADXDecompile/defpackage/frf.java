package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: frf */
public abstract class frf {
    private static final boolean a;
    private final ConcurrentHashMap<String, List<frj>> b;
    private final LinkedBlockingQueue<String> c;
    private volatile Thread d;
    private final Object e;
    public final Handler f;

    public abstract String a();

    public abstract void a(ArrayList<String> arrayList);

    public frf() {
        this.b = new ConcurrentHashMap();
        this.c = new LinkedBlockingQueue();
        this.f = new Handler(Looper.getMainLooper());
        this.e = new Object();
    }

    static {
        kae kae = glk.q;
        a = false;
    }

    public boolean a(frj frj) {
        iil.a();
        if (frj != null && f(frj)) {
            d();
        }
        return false;
    }

    public void b(frj frj) {
        iil.a();
        e(frj);
    }

    public void c(frj frj) {
        a(new frg(this, frj));
    }

    public void d(frj frj) {
        a(new frh(this, frj));
    }

    protected String b() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Number of keys in mPendingKeys: " + this.c.size());
        stringBuilder.append("\nNumber of keys in mRequestsByKey: " + this.b.size());
        return stringBuilder.toString();
    }

    public void a(Runnable runnable) {
        this.f.post(runnable);
    }

    protected boolean b(String str) {
        return this.b.containsKey(str);
    }

    public List<frj> c(String str) {
        return (List) this.b.remove(str);
    }

    protected frj d(String str) {
        frj frj;
        synchronized (this.e) {
            List list = (List) this.b.get(str);
            if (list == null || list.size() <= 0) {
                frj = null;
            } else {
                frj = (frj) list.get(0);
            }
        }
        return frj;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void c() {
        /*
        r6 = this;
        r1 = 0;
        r2 = new java.util.ArrayList;
        r2.<init>();
    L_0x0006:
        r0 = a;
        if (r0 == 0) goto L_0x001d;
    L_0x000a:
        r0 = "loadKeys looping: ";
        r3 = r6.b();
        r3 = java.lang.String.valueOf(r3);
        r4 = r3.length();
        if (r4 == 0) goto L_0x005f;
    L_0x001a:
        r0.concat(r3);
    L_0x001d:
        r0 = r6.c;
        r0 = r0.drainTo(r2);
        if (r0 != 0) goto L_0x00a0;
    L_0x0025:
        r0 = r6.c;	 Catch:{ InterruptedException -> 0x0065 }
        r4 = 60;
        r3 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ InterruptedException -> 0x0065 }
        r0 = r0.poll(r4, r3);	 Catch:{ InterruptedException -> 0x0065 }
        r0 = (java.lang.String) r0;	 Catch:{ InterruptedException -> 0x0065 }
    L_0x0031:
        if (r0 != 0) goto L_0x00c6;
    L_0x0033:
        r3 = r6.e;
        monitor-enter(r3);
        r0 = r6.c;	 Catch:{ all -> 0x0097 }
        r0 = r0.drainTo(r2);	 Catch:{ all -> 0x0097 }
        if (r0 != 0) goto L_0x009a;
    L_0x003e:
        r0 = a;	 Catch:{ all -> 0x0097 }
        if (r0 == 0) goto L_0x005a;
    L_0x0042:
        r0 = "Exiting loading thread: ";
        r1 = r6.d;	 Catch:{ all -> 0x0097 }
        r1 = r1.getName();	 Catch:{ all -> 0x0097 }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x0097 }
        r2 = r1.length();	 Catch:{ all -> 0x0097 }
        if (r2 == 0) goto L_0x0091;
    L_0x0054:
        r0.concat(r1);	 Catch:{ all -> 0x0097 }
    L_0x0057:
        r6.b();	 Catch:{ all -> 0x0097 }
    L_0x005a:
        r0 = 0;
        r6.d = r0;	 Catch:{ all -> 0x0097 }
        monitor-exit(r3);	 Catch:{ all -> 0x0097 }
        return;
    L_0x005f:
        r3 = new java.lang.String;
        r3.<init>(r0);
        goto L_0x001d;
    L_0x0065:
        r0 = move-exception;
        r3 = "Babel";
        r0 = java.lang.String.valueOf(r0);
        r4 = new java.lang.StringBuilder;
        r5 = java.lang.String.valueOf(r0);
        r5 = r5.length();
        r5 = r5 + 47;
        r4.<init>(r5);
        r5 = "Our background loader thread was interrupted?? ";
        r4 = r4.append(r5);
        r0 = r4.append(r0);
        r0 = r0.toString();
        r4 = 0;
        r4 = new java.lang.Object[r4];
        defpackage.glk.e(r3, r0, r4);
        r0 = r1;
        goto L_0x0031;
    L_0x0091:
        r1 = new java.lang.String;	 Catch:{ all -> 0x0097 }
        r1.<init>(r0);	 Catch:{ all -> 0x0097 }
        goto L_0x0057;
    L_0x0097:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0097 }
        throw r0;
    L_0x009a:
        monitor-exit(r3);	 Catch:{ all -> 0x0097 }
    L_0x009b:
        r0 = r6.c;
        r0.drainTo(r2);
    L_0x00a0:
        r0 = a;
        if (r0 == 0) goto L_0x00be;
    L_0x00a4:
        r0 = r2.size();
        r3 = new java.lang.StringBuilder;
        r4 = 25;
        r3.<init>(r4);
        r4 = "Loading ";
        r3 = r3.append(r4);
        r0 = r3.append(r0);
        r3 = " keys.";
        r0.append(r3);
    L_0x00be:
        r6.a(r2);	 Catch:{ bmu -> 0x00ca }
    L_0x00c1:
        r2.clear();
        goto L_0x0006;
    L_0x00c6:
        r2.add(r0);
        goto L_0x009b;
    L_0x00ca:
        r0 = move-exception;
        goto L_0x00c1;
        */
        throw new UnsupportedOperationException("Method not decompiled: frf.c():void");
    }

    private boolean f(frj frj) {
        String str;
        boolean z;
        boolean z2 = true;
        String c = frj.c();
        if (a) {
            str = "addRequest 1: ";
            String valueOf = String.valueOf(b());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        if (frj.d == null || frj.d == this) {
            z = true;
        } else {
            z = false;
        }
        iil.a("Expected condition to be true", z);
        frj.d = this;
        synchronized (this.e) {
            List list = (List) this.b.get(c);
            if (list == null) {
                String valueOf2;
                list = new ArrayList();
                list.add(frj);
                this.b.put(c, list);
                if (a) {
                    str = "addRequest 2: ";
                    valueOf2 = String.valueOf(b());
                    if (valueOf2.length() != 0) {
                        str.concat(valueOf2);
                    } else {
                        valueOf2 = new String(str);
                    }
                }
                this.c.add(c);
                if (a) {
                    str = "Added first request for: ";
                    valueOf2 = String.valueOf(c);
                    if (valueOf2.length() != 0) {
                        str.concat(valueOf2);
                    } else {
                        valueOf2 = new String(str);
                    }
                }
            } else {
                if (a) {
                    String str2 = "Added additional request for: ";
                    c = String.valueOf(c);
                    if (c.length() != 0) {
                        str2.concat(c);
                    } else {
                        c = new String(str2);
                    }
                }
                list.add(frj);
                z2 = false;
            }
        }
        return z2;
    }

    public void e(String str) {
        synchronized (this.e) {
            this.c.add(str);
        }
        d();
    }

    private void d() {
        synchronized (this.e) {
            if (this.d == null) {
                this.d = new Thread(new fri(this), a());
                if (a) {
                    String str = "Starting loader thread: ";
                    String valueOf = String.valueOf(this.d.getName());
                    if (valueOf.length() != 0) {
                        str.concat(valueOf);
                    } else {
                        valueOf = new String(str);
                    }
                }
                this.d.start();
            }
        }
    }

    protected void e(frj frj) {
        if (frj.d != null) {
            iil.a(frj.d, (Object) this);
            synchronized (this.e) {
                String c = frj.c();
                List list = (List) this.b.get(c);
                if (list == null) {
                    return;
                }
                frj.d = null;
                list.remove(frj);
                if (list.size() == 0) {
                    this.b.remove(c);
                    this.c.remove(c);
                    if (a) {
                        String str = "Removed request for: ";
                        c = String.valueOf(c);
                        if (c.length() != 0) {
                            str.concat(c);
                        } else {
                            c = new String(str);
                        }
                    }
                }
            }
        }
    }
}
