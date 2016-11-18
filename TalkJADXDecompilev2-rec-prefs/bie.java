package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.apps.hangouts.concurrent.impl.ConcurrentService;

public final class bie implements Runnable {
    private static final gma f3422a = gma.m18073a("concurrent");
    private final bir f3423b;
    private final ConcurrentService f3424c;
    private final Context f3425d;
    private final bhp f3426e;

    public bie(Context context, bir bir, ConcurrentService concurrentService, bhp bhp) {
        this.f3425d = context;
        this.f3423b = bir;
        this.f3424c = concurrentService;
        this.f3426e = bhp;
    }

    public void run() {
        String valueOf;
        try {
            this.f3423b.m5339j();
            while (true) {
                bho a = this.f3423b.m5321a(this.f3426e);
                if (a == null) {
                    break;
                }
                String a2 = a.m5258a();
                gma gma = f3422a;
                String valueOf2 = String.valueOf("RUN_");
                String valueOf3 = String.valueOf(a2);
                valueOf2 = gma.m18078b(valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2));
                try {
                    valueOf3 = "Running task ";
                    valueOf = String.valueOf(a2);
                    if (valueOf.length() != 0) {
                        valueOf3.concat(valueOf);
                    } else {
                        valueOf = new String(valueOf3);
                    }
                    m5304a(a, a.f3354b.mo539a(this.f3425d, a.f3355c), valueOf2);
                } catch (Throwable e) {
                    String str = "Babel_ConcService";
                    String str2 = "Error running task ";
                    valueOf = String.valueOf(a2);
                    Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e);
                    gma gma2 = f3422a;
                    str2 = "ERROR_RUNNING";
                    valueOf = String.valueOf(a2);
                    gma2.m18080d(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                    throw new RuntimeException(e);
                } catch (Throwable th) {
                    m5304a(a, 0, valueOf2);
                }
            }
        } finally {
            this.f3423b.m5340k();
        }
    }

    private void m5304a(bho bho, int i, String str) {
        f3422a.m18079c(str);
        this.f3424c.m8232a(bho.f3357e);
        String a = bho.m5258a();
        synchronized (this.f3423b) {
            bho.f3358f = false;
            if (i == 0) {
                this.f3423b.m5329b(bho);
            } else {
                String str2;
                String valueOf;
                switch (bif.f3427a[i - 1]) {
                    case 1:
                        this.f3423b.m5329b(bho);
                        str2 = "Task finished. ";
                        valueOf = String.valueOf(a);
                        if (valueOf.length() == 0) {
                            valueOf = new String(str2);
                            break;
                        } else {
                            str2.concat(valueOf);
                            break;
                        }
                    case 2:
                        bhr bhr = bho.f3360h.f3390d;
                        if (bhr != null && bhr.m5262b()) {
                            if (bho.f3354b instanceof bhf) {
                                ((bhf) bho.f3354b).mo541a(this.f3425d);
                                this.f3423b.m5329b(bho);
                                str2 = "Task expired. ";
                                valueOf = String.valueOf(a);
                                if (valueOf.length() == 0) {
                                    valueOf = new String(str2);
                                    break;
                                } else {
                                    str2.concat(valueOf);
                                    break;
                                }
                            }
                        }
                        bir bir = this.f3423b;
                        bho bho2 = new bho(bho.f3353a, bho.f3355c.m5245b(), bho.f3354b, bho.m5255a(bho.f3360h.f3390d, 0), bho.f3360h, bho.f3357e, bho.f3362j);
                        bho2.f3361i = bho.f3361i;
                        bir.m5326a(bho, bho2);
                        str2 = "Task retried. ";
                        valueOf = String.valueOf(a);
                        if (valueOf.length() == 0) {
                            valueOf = new String(str2);
                            break;
                        } else {
                            str2.concat(valueOf);
                            break;
                        }
                        break;
                    case 3:
                        this.f3423b.m5329b(bho);
                        break;
                    case 4:
                        this.f3423b.m5331c(bho);
                        break;
                    default:
                        this.f3423b.m5329b(bho);
                        throw new IllegalArgumentException("Invalid task state");
                }
            }
        }
    }
}
