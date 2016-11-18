package p000;

import android.content.Context;
import android.os.PowerManager.WakeLock;
import com.google.android.apps.hangouts.concurrent.impl.ConcurrentService;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class bir implements bhx, biv {
    private static final bhp[] f3444a = bhp.values();
    private final Map<String, Deque<bho>> f3445b = new HashMap();
    private final Context f3446c;
    private final mjx<String, bit> f3447d;
    private final ConcurrentService f3448e;
    private volatile boolean f3449f;
    private volatile boolean f3450g;
    private volatile boolean f3451h;
    private final WakeLock f3452i;
    private final bip f3453j;

    public static bir m5318a(Context context, ConcurrentService concurrentService, bip bip, WakeLock wakeLock) {
        Map hashMap = new HashMap();
        for (bhq bhq : jyn.m25438c(context, bhq.class)) {
            hashMap.put(bhq.f3368b, new bit(bhq.f3367a, bhq.f3367a.isAssignableFrom(bhj.class)));
            String str = "*** Loaded ";
            String valueOf = String.valueOf(bhq.f3368b);
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
    private bir(Context context, Map<String, bit> map, ConcurrentService concurrentService, bip bip, WakeLock wakeLock) {
        mjx a;
        this.f3446c = context;
        if (!(map instanceof mjx) || (map instanceof mkz)) {
            if (map instanceof EnumMap) {
                a = mjx.m32328a((EnumMap) map);
            }
            Entry[] entryArr = (Entry[]) gwb.m1959a(map.entrySet(), mjx.f27821a);
            switch (entryArr.length) {
                case 0:
                    a = mmv.f27916b;
                    break;
                case 1:
                    Entry entry = entryArr[0];
                    a = mjh.m32338a(entry.getKey(), entry.getValue());
                    break;
                default:
                    a = mnb.m32543a(entryArr.length, entryArr);
                    break;
            }
        }
        a = (mjx) map;
        this.f3447d = a;
        this.f3448e = concurrentService;
        this.f3452i = wakeLock;
        this.f3453j = bip;
    }

    public synchronized Class<bhm> m5322a(String str) {
        bit bit;
        bit = (bit) this.f3447d.get(str);
        bm.m6152b(bit != null, "Unregistered concurrent task: %s", (Object) str);
        return bit.f3455a;
    }

    private synchronized bho m5317a(Deque<bho> deque, bho bho) {
        if (bho.f3360h.f3387a == bhk.NONE || deque.isEmpty()) {
            deque.add(bho);
        } else {
            Iterator it = deque.iterator();
            while (it.hasNext()) {
                bho bho2 = (bho) it.next();
                if (!bho2.f3358f) {
                    switch (bis.f3454a[bho.f3360h.f3387a.ordinal()]) {
                        case 1:
                            bho = bho2;
                            break;
                        case 2:
                            it.remove();
                            if (bho2.f3360h.f3388b && bho2.f3361i >= 0) {
                                this.f3453j.m5311b(bho2);
                            }
                            deque.add(bho);
                            break;
                        default:
                            String valueOf = String.valueOf(bho.f3360h.f3387a);
                            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 18).append("Unknown coalesce: ").append(valueOf).toString());
                    }
                }
            }
            deque.add(bho);
        }
        return bho;
    }

    public void mo558c() {
        this.f3450g = true;
        synchronized (this) {
            for (Deque<bho> it : this.f3445b.values()) {
                for (bho bho : it) {
                    bhr bhr = bho.f3360h.f3390d;
                    if (bhr != null && bhr.m5264d()) {
                        bhr.m5263c();
                    }
                }
            }
        }
        for (bhp a : f3444a) {
            this.f3448e.m8231a(a);
        }
    }

    public void mo559d() {
        this.f3450g = false;
    }

    public void mo556a() {
        this.f3451h = true;
    }

    public void mo557b() {
        this.f3451h = false;
    }

    public synchronized boolean m5325a(bho bho) {
        if (this.f3445b.size() > 5) {
            new StringBuilder(55).append("*** Adding new tasks; current task backlog: ").append(this.f3445b.size());
        }
        String b = bho.f3355c.m5245b();
        Deque deque = (Deque) this.f3445b.get(b);
        if (deque == null) {
            deque = new LinkedList();
            this.f3445b.put(b, deque);
        } else if (!deque.isEmpty()) {
            boolean z;
            if (bho.f3362j == ((bho) deque.peek()).f3362j) {
                z = true;
            } else {
                z = false;
            }
            bm.m6151b(z, (Object) "Cannot queue tasks of different priority");
        }
        bho a = m5317a(deque, bho);
        if (a == bho && bho.f3361i < 0 && bho.f3360h.f3388b) {
            try {
                this.f3453j.m5309a(bho);
            } catch (Throwable e) {
                glk.m17980d("Babel_ConcService", String.format("Error serializing %s", new Object[]{bho.m5258a()}), e);
                m5320e(bho);
                throw new RuntimeException(e);
            }
        }
        this.f3448e.m8239f(a);
        return true;
    }

    synchronized boolean m5326a(bho bho, bho bho2) {
        Deque deque = (Deque) this.f3445b.get(bho.f3355c.m5245b());
        if (deque == null || deque.peek() != bho) {
            throw new IllegalStateException("Task removed before execution finished");
        }
        deque.removeFirst();
        deque.addFirst(bho2);
        if (bho2.f3360h.f3388b) {
            try {
                this.f3453j.m5312c(bho2);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
        this.f3448e.m8239f(bho2);
        return true;
    }

    private boolean m5319d(bho bho) {
        boolean z;
        boolean z2;
        bhu bhu = bho.f3360h.f3389c;
        if (bhu == null || !bhu.m5275c()) {
            z = false;
        } else {
            z = true;
        }
        if (bhu == null || !bhu.m5273a()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z || this.f3450g) {
            z = true;
        } else {
            z = false;
        }
        if (!z2 || this.f3451h) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && r2) {
            return true;
        }
        return false;
    }

    public synchronized bho m5321a(bhp bhp) {
        bho bho;
        if (this.f3445b.size() > 5) {
            Object[] objArr = new Object[]{bhp, Integer.valueOf(this.f3445b.size())};
        }
        if (this.f3449f) {
            new Object[1][0] = Integer.valueOf(this.f3445b.size());
            bho = null;
        } else {
            long b = glj.m17963b();
            for (Entry value : this.f3445b.entrySet()) {
                bho = (bho) ((Deque) value.getValue()).peek();
                if (!bho.f3358f && b >= bho.f3356d && bho.f3362j == bhp && m5319d(bho)) {
                    break;
                } else if (!bho.f3358f && glk.m17973a("Babel_ConcService", 2)) {
                    bhu bhu = bho.f3360h.f3389c;
                    boolean z = false;
                    boolean z2 = false;
                    boolean z3 = false;
                    if (bhu != null) {
                        z = bhu.m5275c();
                        z2 = bhu.m5273a();
                        z3 = bhu.m5274b();
                    }
                    String valueOf = String.valueOf(bho.m5258a());
                    long j = bho.f3356d - b;
                    String valueOf2 = String.valueOf(bho.f3362j);
                    new StringBuilder((String.valueOf(valueOf).length() + 151) + String.valueOf(valueOf2).length()).append("**** Skipping task: ").append(valueOf).append("; ---- executing in ").append(j).append("ms. RequiresNetwork? ").append(z).append(", RequiresCharging? ").append(z2).append(", RequiresDeviceIdle? ").append(z3).append(", Priority = ").append(valueOf2);
                }
            }
            bho = null;
            if (bho != null) {
                bho.f3358f = true;
            }
        }
        return bho;
    }

    public synchronized void m5324a(bhc bhc) {
        Iterator it = this.f3445b.entrySet().iterator();
        while (it.hasNext()) {
            Deque deque = (Deque) ((Entry) it.next()).getValue();
            Iterator it2 = deque.iterator();
            while (it2.hasNext()) {
                bho bho = (bho) it2.next();
                List<bhc> list = bho.f3360h.f3391e;
                if (list != null) {
                    for (bhc a : list) {
                        if (a.m5246a(bhc)) {
                            bho.f3355c.m5244a();
                            bhm bhm = bho.f3354b;
                            if (bhm instanceof bhd) {
                                bhd bhd = (bhd) bhm;
                                if (bho.f3358f) {
                                    bhd.mo1981b(this.f3446c);
                                } else {
                                    it2.remove();
                                    if (bho.f3360h.f3388b) {
                                        this.f3453j.m5311b(bho);
                                    }
                                    bhd.mo1982c(this.f3446c);
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

    private void m5320e(bho bho) {
        String b = bho.f3355c.m5245b();
        Deque deque = (Deque) this.f3445b.get(b);
        if (deque != null) {
            deque.removeFirst();
            if (deque.isEmpty()) {
                this.f3445b.remove(b);
            }
        }
    }

    public synchronized void m5329b(bho bho) {
        m5320e(bho);
        if (bho.f3360h.f3388b) {
            this.f3453j.m5311b(bho);
        }
    }

    public synchronized void m5331c(bho bho) {
        this.f3453j.m5308a(new LinkedList((Deque) this.f3445b.remove(bho.f3355c.m5245b())));
    }

    public synchronized void m5334e() {
        this.f3450g = ((eaj) jyn.m25426a(this.f3446c, eaj.class)).mo1802a().m13284a();
        this.f3449f = false;
    }

    public synchronized void m5335f() {
        Iterator it = this.f3445b.entrySet().iterator();
        while (it.hasNext()) {
            Deque deque = (Deque) ((Entry) it.next()).getValue();
            Iterator it2 = deque.iterator();
            while (it2.hasNext()) {
                if (!((bho) it2.next()).f3360h.f3388b) {
                    it2.remove();
                }
            }
            if (deque.isEmpty()) {
                it.remove();
            }
        }
        for (Deque deque2 : this.f3445b.values()) {
            this.f3448e.m8238e((bho) deque2.peek());
        }
        this.f3449f = true;
        int size = this.f3445b.size();
        if (size > 0) {
            glk.m17981d("Babel_ConcService", "***************************************************************************", new Object[0]);
            glk.m17981d("Babel_ConcService", "Stopping ConcurrentService while there are " + size + " tasks still pending", new Object[0]);
            glk.m17981d("Babel_ConcService", "***************************************************************************", new Object[0]);
        }
        this.f3445b.clear();
    }

    public synchronized String m5336g() {
        StringBuilder stringBuilder;
        stringBuilder = new StringBuilder();
        long b = glj.m17963b();
        for (Entry entry : this.f3445b.entrySet()) {
            Deque<bho> deque = (Deque) entry.getValue();
            String str = (String) entry.getKey();
            stringBuilder.append(new StringBuilder(String.valueOf(str).length() + 19).append("-- Checking list: ").append(str).append("\n").toString());
            for (bho bho : deque) {
                String valueOf = String.valueOf(bho.m5258a());
                long j = bho.f3356d - b;
                stringBuilder.append(new StringBuilder(String.valueOf(valueOf).length() + 62).append("--- task: ").append(valueOf).append("; isExecuting: ").append(bho.f3358f).append("; delayMs: ").append(j).append("\n").toString());
            }
        }
        return stringBuilder.toString();
    }

    public synchronized void m5337h() {
        gwb.aK();
        List<bho> a = this.f3453j.m5310a();
        if (a != null) {
            for (bho a2 : a) {
                m5325a(a2);
            }
        }
    }

    public synchronized boolean m5338i() {
        if (glk.m17973a("Babel_ConcService", 2)) {
            m5336g();
        }
        return this.f3445b.isEmpty();
    }

    public synchronized bho m5327b(String str) {
        bho bho;
        bho = null;
        for (Deque peek : this.f3445b.values()) {
            bho bho2 = (bho) peek.peek();
            if (bho2 == null || bho2.f3358f || !str.equals(bho2.f3357e) || (bho != null && bho2.f3356d >= bho.f3356d)) {
                bho2 = bho;
            }
            bho = bho2;
        }
        return bho;
    }

    synchronized void m5339j() {
        if (!this.f3452i.isHeld()) {
            this.f3452i.acquire();
            glk.m17979c("Babel_ConcService", "Acquired partial wake lock to keep ConcurrentService alive", new Object[0]);
        }
    }

    synchronized void m5340k() {
        if (this.f3452i.isHeld()) {
            Object obj;
            loop0:
            for (Deque<bho> it : this.f3445b.values()) {
                for (bho bho : it) {
                    if (bho.f3358f) {
                        obj = 1;
                        break loop0;
                    }
                }
            }
            obj = null;
            if (obj == null) {
                this.f3452i.release();
                glk.m17979c("Babel_ConcService", "Released partial wake lock as ConcurrentService became idle", new Object[0]);
            }
        }
    }

    public void m5332c(String str) {
        if (str.contains("charging_wakeup")) {
            this.f3451h = true;
        }
        if (str.contains("network_connectivity_wakeup")) {
            this.f3450g = true;
        }
    }
}
