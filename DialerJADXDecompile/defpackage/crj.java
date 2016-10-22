package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Flag;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: crj */
public final class crj {
    static final crj a;
    private final crg b;
    private final ReadWriteLock c;
    private final Map d;
    private final Set e;
    private final Map f;

    static {
        a = new crj();
    }

    private crj() {
        this.c = new ReentrantReadWriteLock();
        this.d = new HashMap();
        HashMap hashMap = new HashMap();
        this.e = new HashSet();
        this.f = new HashMap();
        this.b = cre.c;
    }

    private final boolean a(String str) {
        boolean z = true;
        this.c.readLock().lock();
        try {
            bri bri = (bri) this.f.get(str);
            if (bri == null) {
                return z;
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                z = false;
            }
            buf.a(z, (Object) "getFlag must not be called on the UI thread when flag values are not cached.");
            return ((Status) bri.a(1000, TimeUnit.MILLISECONDS)).b();
        } finally {
            z = this.c.readLock();
            z.unlock();
        }
    }

    public final Flag a(Context context, String str, String str2, int i) {
        crk crk = new crk(str, str2, i);
        crl a = a(crk);
        if (a != null) {
            return (Flag) a.a;
        }
        brc b = new brd(context).a(cre.b).b();
        b.b();
        try {
            Flag a2 = a(b, crk);
            return a2;
        } finally {
            b.c();
        }
    }

    public final Flag a(brc brc, crk crk) {
        cri cri = (cri) this.b.a(brc, crk.a, crk.b, crk.c).a(1000, TimeUnit.MILLISECONDS);
        this.c.writeLock().lock();
        try {
            Flag flag;
            if (this.d.containsKey(crk)) {
                flag = (Flag) this.d.get(crk);
                return flag;
            } else if (cri.a().b()) {
                flag = cri.b();
                this.d.put(crk, flag);
                this.c.writeLock().unlock();
                return flag;
            } else {
                this.c.writeLock().unlock();
                return null;
            }
        } finally {
            this.c.writeLock().unlock();
        }
    }

    public final crl a(crk crk) {
        if (!a(crk.a)) {
            return new crl(null);
        }
        this.c.readLock().lock();
        try {
            crl crl;
            if (this.d.containsKey(crk)) {
                crl = new crl(this.d.get(crk));
                return crl;
            } else if (this.e.contains(crk.a)) {
                crl = new crl(null);
                this.c.readLock().unlock();
                return crl;
            } else {
                this.c.readLock().unlock();
                return null;
            }
        } finally {
            this.c.readLock().unlock();
        }
    }
}
