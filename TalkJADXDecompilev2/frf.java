package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public abstract class frf {
    private static final boolean a = false;
    private final ConcurrentHashMap<String, List<frj>> b = new ConcurrentHashMap();
    private final LinkedBlockingQueue<String> c = new LinkedBlockingQueue();
    private volatile Thread d;
    private final Object e = new Object();
    public final Handler f = new Handler(Looper.getMainLooper());

    public abstract String a();

    public abstract void a(ArrayList<String> arrayList);

    static {
        kae kae = glk.q;
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

    void c() {
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str;
            if (a) {
                str = "loadKeys looping: ";
                String valueOf = String.valueOf(b());
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
            }
            if (this.c.drainTo(arrayList) == 0) {
                Object obj;
                try {
                    obj = (String) this.c.poll(60, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    str = String.valueOf(e);
                    glk.e("Babel", new StringBuilder(String.valueOf(str).length() + 47).append("Our background loader thread was interrupted?? ").append(str).toString(), new Object[0]);
                    obj = null;
                }
                if (obj == null) {
                    synchronized (this.e) {
                        if (this.c.drainTo(arrayList) == 0) {
                            break;
                        }
                    }
                } else {
                    arrayList.add(obj);
                }
                this.c.drainTo(arrayList);
            }
            if (a) {
                new StringBuilder(25).append("Loading ").append(arrayList.size()).append(" keys.");
            }
            try {
                a(arrayList);
            } catch (bmu e2) {
            }
            arrayList.clear();
        }
        if (a) {
            str = "Exiting loading thread: ";
            String valueOf2 = String.valueOf(this.d.getName());
            if (valueOf2.length() != 0) {
                str.concat(valueOf2);
            } else {
                valueOf2 = new String(str);
            }
            b();
        }
        this.d = null;
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

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void e(defpackage.frj r5) {
        /*
        r4 = this;
        r0 = r5.d;
        if (r0 != 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r0 = r5.d;
        defpackage.iil.a(r0, r4);
        r1 = r4.e;
        monitor-enter(r1);
        r2 = r5.c();	 Catch:{ all -> 0x001d }
        r0 = r4.b;	 Catch:{ all -> 0x001d }
        r0 = r0.get(r2);	 Catch:{ all -> 0x001d }
        r0 = (java.util.List) r0;	 Catch:{ all -> 0x001d }
        if (r0 != 0) goto L_0x0020;
    L_0x001b:
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
        goto L_0x0004;
    L_0x001d:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
        throw r0;
    L_0x0020:
        r3 = 0;
        r5.d = r3;	 Catch:{ all -> 0x001d }
        r0.remove(r5);	 Catch:{ all -> 0x001d }
        r0 = r0.size();	 Catch:{ all -> 0x001d }
        if (r0 != 0) goto L_0x0049;
    L_0x002c:
        r0 = r4.b;	 Catch:{ all -> 0x001d }
        r0.remove(r2);	 Catch:{ all -> 0x001d }
        r0 = r4.c;	 Catch:{ all -> 0x001d }
        r0.remove(r2);	 Catch:{ all -> 0x001d }
        r0 = a;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x0049;
    L_0x003a:
        r0 = "Removed request for: ";
        r2 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x001d }
        r3 = r2.length();	 Catch:{ all -> 0x001d }
        if (r3 == 0) goto L_0x004b;
    L_0x0046:
        r0.concat(r2);	 Catch:{ all -> 0x001d }
    L_0x0049:
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
        goto L_0x0004;
    L_0x004b:
        r2 = new java.lang.String;	 Catch:{ all -> 0x001d }
        r2.<init>(r0);	 Catch:{ all -> 0x001d }
        goto L_0x0049;
        */
        throw new UnsupportedOperationException("Method not decompiled: frf.e(frj):void");
    }
}
