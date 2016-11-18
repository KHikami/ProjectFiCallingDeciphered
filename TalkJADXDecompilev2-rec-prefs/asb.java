package p000;

import android.util.Log;
import java.io.File;
import java.io.IOException;

public final class asb implements art {
    private static asb f2258a = null;
    private final asj f2259b;
    private final File f2260c;
    private final int f2261d;
    private final arx f2262e = new arx();
    private amz f2263f;

    public static synchronized art m3905a(File file, int i) {
        art art;
        synchronized (asb.class) {
            if (f2258a == null) {
                f2258a = new asb(file, i);
            }
            art = f2258a;
        }
        return art;
    }

    private asb(File file, int i) {
        this.f2260c = file;
        this.f2261d = i;
        this.f2259b = new asj();
    }

    private synchronized amz m3904a() {
        if (this.f2263f == null) {
            this.f2263f = amz.m2991a(this.f2260c, 1, 1, (long) this.f2261d);
        }
        return this.f2263f;
    }

    public File mo368a(anv anv) {
        String a = this.f2259b.m3937a(anv);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            String valueOf = String.valueOf(anv);
            new StringBuilder((String.valueOf(a).length() + 29) + String.valueOf(valueOf).length()).append("Get: Obtained: ").append(a).append(" for for Key: ").append(valueOf);
        }
        File file = null;
        try {
            ane a2 = m3904a().m3000a(a);
            if (a2 != null) {
                file = a2.m3465a(0);
            }
        } catch (IOException e) {
        }
        return file;
    }

    public void mo369a(anv anv, arv arv) {
        this.f2262e.m3888a(anv);
        try {
            String a = this.f2259b.m3937a(anv);
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                String valueOf = String.valueOf(anv);
                new StringBuilder((String.valueOf(a).length() + 29) + String.valueOf(valueOf).length()).append("Put: Obtained: ").append(a).append(" for for Key: ").append(valueOf);
            }
            anc b;
            try {
                amz a2 = m3904a();
                if (a2.m3000a(a) == null) {
                    b = a2.m3003b(a);
                    if (b == null) {
                        String str = "Had two simultaneous puts for: ";
                        a = String.valueOf(a);
                        throw new IllegalStateException(a.length() != 0 ? str.concat(a) : new String(str));
                    }
                    if (arv.m3885a(b.m3007a(0))) {
                        b.m3008a();
                    }
                    b.m3010c();
                    this.f2262e.m3889b(anv);
                }
            } catch (IOException e) {
            } catch (Throwable th) {
                b.m3010c();
            }
        } finally {
            this.f2262e.m3889b(anv);
        }
    }
}
