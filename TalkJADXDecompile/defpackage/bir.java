package defpackage;

import android.content.Context;
import android.os.PowerManager.WakeLock;
import com.google.android.apps.hangouts.concurrent.impl.ConcurrentService;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: bir */
public final class bir implements bhx, biv {
    private static final bhp[] a;
    private final Map<String, Deque<bho>> b;
    private final Context c;
    private final mjx<String, bit> d;
    private final ConcurrentService e;
    private volatile boolean f;
    private volatile boolean g;
    private volatile boolean h;
    private final WakeLock i;
    private final bip j;

    static {
        a = bhp.values();
    }

    public static bir a(Context context, ConcurrentService concurrentService, bip bip, WakeLock wakeLock) {
        Map hashMap = new HashMap();
        for (bhq bhq : jyn.c(context, bhq.class)) {
            hashMap.put(bhq.b, new bit(bhq.a, bhq.a.isAssignableFrom(bhj.class)));
            String str = "*** Loaded ";
            String valueOf = String.valueOf(bhq.b);
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        new StringBuilder(27).append("Loaded ").append(hashMap.size()).append(" classes.");
        return new bir(context, hashMap, concurrentService, bip, wakeLock);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private bir(android.content.Context r3, java.util.Map<java.lang.String, defpackage.bit> r4, com.google.android.apps.hangouts.concurrent.impl.ConcurrentService r5, defpackage.bip r6, android.os.PowerManager.WakeLock r7) {
        /*
        r2 = this;
        r2.<init>();
        r0 = new java.util.HashMap;
        r0.<init>();
        r2.b = r0;
        r2.c = r3;
        r0 = r4 instanceof defpackage.mjx;
        if (r0 == 0) goto L_0x0026;
    L_0x0010:
        r0 = r4 instanceof defpackage.mkz;
        if (r0 != 0) goto L_0x0026;
    L_0x0014:
        r0 = r4;
        r0 = (defpackage.mjx) r0;
        r1 = r0.d();
        if (r1 != 0) goto L_0x0031;
    L_0x001d:
        r2.d = r0;
        r2.e = r5;
        r2.i = r7;
        r2.j = r6;
        return;
    L_0x0026:
        r0 = r4 instanceof java.util.EnumMap;
        if (r0 == 0) goto L_0x0031;
    L_0x002a:
        r4 = (java.util.EnumMap) r4;
        r0 = defpackage.mjx.a(r4);
        goto L_0x001d;
    L_0x0031:
        r0 = r4.entrySet();
        r1 = defpackage.mjx.a;
        r0 = defpackage.gwb.a(r0, r1);
        r0 = (java.util.Map.Entry[]) r0;
        r1 = r0.length;
        switch(r1) {
            case 0: goto L_0x0047;
            case 1: goto L_0x004a;
            default: goto L_0x0041;
        };
    L_0x0041:
        r1 = r0.length;
        r0 = defpackage.mnb.a(r1, r0);
        goto L_0x001d;
    L_0x0047:
        r0 = defpackage.mmv.b;
        goto L_0x001d;
    L_0x004a:
        r1 = 0;
        r0 = r0[r1];
        r1 = r0.getKey();
        r0 = r0.getValue();
        r0 = defpackage.mjh.a(r1, r0);
        goto L_0x001d;
        */
        throw new UnsupportedOperationException("Method not decompiled: bir.<init>(android.content.Context, java.util.Map, com.google.android.apps.hangouts.concurrent.impl.ConcurrentService, bip, android.os.PowerManager$WakeLock):void");
    }

    public synchronized Class<bhm> a(String str) {
        bit bit;
        bit = (bit) this.d.get(str);
        bm.b(bit != null, "Unregistered concurrent task: %s", (Object) str);
        return bit.a;
    }

    private synchronized bho a(Deque<bho> deque, bho bho) {
        if (bho.h.a == bhk.NONE || deque.isEmpty()) {
            deque.add(bho);
        } else {
            Iterator it = deque.iterator();
            while (it.hasNext()) {
                bho bho2 = (bho) it.next();
                if (!bho2.f) {
                    switch (bis.a[bho.h.a.ordinal()]) {
                        case wi.j /*1*/:
                            bho = bho2;
                            break;
                        case wi.l /*2*/:
                            it.remove();
                            if (bho2.h.b && bho2.i >= 0) {
                                this.j.b(bho2);
                            }
                            deque.add(bho);
                            break;
                        default:
                            String valueOf = String.valueOf(bho.h.a);
                            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 18).append("Unknown coalesce: ").append(valueOf).toString());
                    }
                }
            }
            deque.add(bho);
        }
        return bho;
    }

    public void c() {
        this.g = true;
        synchronized (this) {
            for (Deque<bho> it : this.b.values()) {
                for (bho bho : it) {
                    bhr bhr = bho.h.d;
                    if (bhr != null && bhr.d()) {
                        bhr.c();
                    }
                }
            }
        }
        for (bhp a : a) {
            this.e.a(a);
        }
    }

    public void d() {
        this.g = false;
    }

    public void a() {
        this.h = true;
    }

    public void b() {
        this.h = false;
    }

    public synchronized boolean a(bho bho) {
        if (this.b.size() > 5) {
            new StringBuilder(55).append("*** Adding new tasks; current task backlog: ").append(this.b.size());
        }
        String b = bho.c.b();
        Deque deque = (Deque) this.b.get(b);
        if (deque == null) {
            deque = new LinkedList();
            this.b.put(b, deque);
        } else if (!deque.isEmpty()) {
            boolean z;
            if (bho.j == ((bho) deque.peek()).j) {
                z = true;
            } else {
                z = false;
            }
            bm.b(z, (Object) "Cannot queue tasks of different priority");
        }
        bho a = a(deque, bho);
        if (a == bho && bho.i < 0 && bho.h.b) {
            try {
                this.j.a(bho);
            } catch (Throwable e) {
                glk.d("Babel_ConcService", String.format("Error serializing %s", new Object[]{bho.a()}), e);
                e(bho);
                throw new RuntimeException(e);
            }
        }
        this.e.f(a);
        return true;
    }

    synchronized boolean a(bho bho, bho bho2) {
        Deque deque = (Deque) this.b.get(bho.c.b());
        if (deque == null || deque.peek() != bho) {
            throw new IllegalStateException("Task removed before execution finished");
        }
        deque.removeFirst();
        deque.addFirst(bho2);
        if (bho2.h.b) {
            try {
                this.j.c(bho2);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
        this.e.f(bho2);
        return true;
    }

    private boolean d(bho bho) {
        boolean z;
        boolean z2;
        bhu bhu = bho.h.c;
        if (bhu == null || !bhu.c()) {
            z = false;
        } else {
            z = true;
        }
        if (bhu == null || !bhu.a()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z || this.g) {
            z = true;
        } else {
            z = false;
        }
        if (!z2 || this.h) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && r2) {
            return true;
        }
        return false;
    }

    public synchronized bho a(bhp bhp) {
        bho bho;
        if (this.b.size() > 5) {
            Object[] objArr = new Object[]{bhp, Integer.valueOf(this.b.size())};
        }
        if (this.f) {
            new Object[1][0] = Integer.valueOf(this.b.size());
            bho = null;
        } else {
            long b = glj.b();
            for (Entry value : this.b.entrySet()) {
                bho = (bho) ((Deque) value.getValue()).peek();
                if (!bho.f && b >= bho.d && bho.j == bhp && d(bho)) {
                    break;
                } else if (!bho.f && glk.a("Babel_ConcService", 2)) {
                    bhu bhu = bho.h.c;
                    boolean z = false;
                    boolean z2 = false;
                    boolean z3 = false;
                    if (bhu != null) {
                        z = bhu.c();
                        z2 = bhu.a();
                        z3 = bhu.b();
                    }
                    String valueOf = String.valueOf(bho.a());
                    long j = bho.d - b;
                    String valueOf2 = String.valueOf(bho.j);
                    new StringBuilder((String.valueOf(valueOf).length() + 151) + String.valueOf(valueOf2).length()).append("**** Skipping task: ").append(valueOf).append("; ---- executing in ").append(j).append("ms. RequiresNetwork? ").append(z).append(", RequiresCharging? ").append(z2).append(", RequiresDeviceIdle? ").append(z3).append(", Priority = ").append(valueOf2);
                }
            }
            bho = null;
            if (bho != null) {
                bho.f = true;
            }
        }
        return bho;
    }

    public synchronized void a(bhc bhc) {
        Iterator it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            Deque deque = (Deque) ((Entry) it.next()).getValue();
            Iterator it2 = deque.iterator();
            while (it2.hasNext()) {
                bho bho = (bho) it2.next();
                List<bhc> list = bho.h.e;
                if (list != null) {
                    for (bhc a : list) {
                        if (a.a(bhc)) {
                            bho.c.a();
                            bhm bhm = bho.b;
                            if (bhm instanceof bhd) {
                                bhd bhd = (bhd) bhm;
                                if (bho.f) {
                                    bhd.b(this.c);
                                } else {
                                    it2.remove();
                                    if (bho.h.b) {
                                        this.j.b(bho);
                                    }
                                    bhd.c(this.c);
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    continue;
                }
            }
            if (deque.isEmpty()) {
                it.remove();
            }
        }
    }

    private void e(bho bho) {
        String b = bho.c.b();
        Deque deque = (Deque) this.b.get(b);
        if (deque != null) {
            deque.removeFirst();
            if (deque.isEmpty()) {
                this.b.remove(b);
            }
        }
    }

    public synchronized void b(bho bho) {
        e(bho);
        if (bho.h.b) {
            this.j.b(bho);
        }
    }

    public synchronized void c(bho bho) {
        this.j.a(new LinkedList((Deque) this.b.remove(bho.c.b())));
    }

    public synchronized void e() {
        this.g = ((eaj) jyn.a(this.c, eaj.class)).a().a();
        this.f = false;
    }

    public synchronized void f() {
        Iterator it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            Deque deque = (Deque) ((Entry) it.next()).getValue();
            Iterator it2 = deque.iterator();
            while (it2.hasNext()) {
                if (!((bho) it2.next()).h.b) {
                    it2.remove();
                }
            }
            if (deque.isEmpty()) {
                it.remove();
            }
        }
        for (Deque deque2 : this.b.values()) {
            this.e.e((bho) deque2.peek());
        }
        this.f = true;
        int size = this.b.size();
        if (size > 0) {
            glk.d("Babel_ConcService", "***************************************************************************", new Object[0]);
            glk.d("Babel_ConcService", "Stopping ConcurrentService while there are " + size + " tasks still pending", new Object[0]);
            glk.d("Babel_ConcService", "***************************************************************************", new Object[0]);
        }
        this.b.clear();
    }

    public synchronized String g() {
        StringBuilder stringBuilder;
        stringBuilder = new StringBuilder();
        long b = glj.b();
        for (Entry entry : this.b.entrySet()) {
            Deque<bho> deque = (Deque) entry.getValue();
            String str = (String) entry.getKey();
            stringBuilder.append(new StringBuilder(String.valueOf(str).length() + 19).append("-- Checking list: ").append(str).append("\n").toString());
            for (bho bho : deque) {
                String valueOf = String.valueOf(bho.a());
                long j = bho.d - b;
                stringBuilder.append(new StringBuilder(String.valueOf(valueOf).length() + 62).append("--- task: ").append(valueOf).append("; isExecuting: ").append(bho.f).append("; delayMs: ").append(j).append("\n").toString());
            }
        }
        return stringBuilder.toString();
    }

    public synchronized void h() {
        gwb.aK();
        List<bho> a = this.j.a();
        if (a != null) {
            for (bho a2 : a) {
                a(a2);
            }
        }
    }

    public synchronized boolean i() {
        if (glk.a("Babel_ConcService", 2)) {
            g();
        }
        return this.b.isEmpty();
    }

    public synchronized bho b(String str) {
        bho bho;
        bho = null;
        for (Deque peek : this.b.values()) {
            bho bho2 = (bho) peek.peek();
            if (bho2 == null || bho2.f || !str.equals(bho2.e) || (bho != null && bho2.d >= bho.d)) {
                bho2 = bho;
            }
            bho = bho2;
        }
        return bho;
    }

    synchronized void j() {
        if (!this.i.isHeld()) {
            this.i.acquire();
            glk.c("Babel_ConcService", "Acquired partial wake lock to keep ConcurrentService alive", new Object[0]);
        }
    }

    synchronized void k() {
        if (this.i.isHeld()) {
            Object obj;
            loop0:
            for (Deque<bho> it : this.b.values()) {
                for (bho bho : it) {
                    if (bho.f) {
                        obj = 1;
                        break loop0;
                    }
                }
            }
            obj = null;
            if (obj == null) {
                this.i.release();
                glk.c("Babel_ConcService", "Released partial wake lock as ConcurrentService became idle", new Object[0]);
            }
        }
    }

    public void c(String str) {
        if (str.contains("charging_wakeup")) {
            this.h = true;
        }
        if (str.contains("network_connectivity_wakeup")) {
            this.g = true;
        }
    }
}
