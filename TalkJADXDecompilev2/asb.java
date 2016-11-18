package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;

public final class asb implements art {
    private static asb a = null;
    private final asj b;
    private final File c;
    private final int d;
    private final arx e = new arx();
    private amz f;

    public static synchronized art a(File file, int i) {
        art art;
        synchronized (asb.class) {
            if (a == null) {
                a = new asb(file, i);
            }
            art = a;
        }
        return art;
    }

    private asb(File file, int i) {
        this.c = file;
        this.d = i;
        this.b = new asj();
    }

    private synchronized amz a() {
        if (this.f == null) {
            this.f = amz.a(this.c, 1, 1, (long) this.d);
        }
        return this.f;
    }

    public File a(anv anv) {
        String a = this.b.a(anv);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            String valueOf = String.valueOf(anv);
            new StringBuilder((String.valueOf(a).length() + 29) + String.valueOf(valueOf).length()).append("Get: Obtained: ").append(a).append(" for for Key: ").append(valueOf);
        }
        File file = null;
        try {
            ane a2 = a().a(a);
            if (a2 != null) {
                file = a2.a(0);
            }
        } catch (IOException e) {
        }
        return file;
    }

    public void a(anv anv, arv arv) {
        this.e.a(anv);
        try {
            String a = this.b.a(anv);
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                String valueOf = String.valueOf(anv);
                new StringBuilder((String.valueOf(a).length() + 29) + String.valueOf(valueOf).length()).append("Put: Obtained: ").append(a).append(" for for Key: ").append(valueOf);
            }
            anc b;
            try {
                amz a2 = a();
                if (a2.a(a) == null) {
                    b = a2.b(a);
                    if (b == null) {
                        String str = "Had two simultaneous puts for: ";
                        a = String.valueOf(a);
                        throw new IllegalStateException(a.length() != 0 ? str.concat(a) : new String(str));
                    }
                    if (arv.a(b.a(0))) {
                        b.a();
                    }
                    b.c();
                    this.e.b(anv);
                }
            } catch (IOException e) {
            } catch (Throwable th) {
                b.c();
            }
        } finally {
            this.e.b(anv);
        }
    }
}
