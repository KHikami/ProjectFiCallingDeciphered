package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.apps.hangouts.concurrent.impl.ConcurrentService;

/* renamed from: bie */
public final class bie implements Runnable {
    private static final gma a;
    private final bir b;
    private final ConcurrentService c;
    private final Context d;
    private final bhp e;

    static {
        a = gma.a("concurrent");
    }

    public bie(Context context, bir bir, ConcurrentService concurrentService, bhp bhp) {
        this.d = context;
        this.b = bir;
        this.c = concurrentService;
        this.e = bhp;
    }

    public void run() {
        try {
            this.b.j();
            while (true) {
                bho a = this.b.a(this.e);
                if (a == null) {
                    break;
                }
                String a2 = a.a();
                gma gma = a;
                String valueOf = String.valueOf("RUN_");
                String valueOf2 = String.valueOf(a2);
                valueOf = gma.b(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
                String valueOf3;
                try {
                    valueOf2 = "Running task ";
                    valueOf3 = String.valueOf(a2);
                    if (valueOf3.length() != 0) {
                        valueOf2.concat(valueOf3);
                    } else {
                        valueOf3 = new String(valueOf2);
                    }
                    a(a, a.b.a(this.d, a.c), valueOf);
                } catch (Throwable e) {
                    String str = "Babel_ConcService";
                    String str2 = "Error running task ";
                    valueOf3 = String.valueOf(a2);
                    Log.e(str, valueOf3.length() != 0 ? str2.concat(valueOf3) : new String(str2), e);
                    gma gma2 = a;
                    str2 = "ERROR_RUNNING";
                    valueOf3 = String.valueOf(a2);
                    gma2.d(valueOf3.length() != 0 ? str2.concat(valueOf3) : new String(str2));
                    throw new RuntimeException(e);
                } catch (Throwable th) {
                    a(a, 0, valueOf);
                }
            }
        } finally {
            this.b.k();
        }
    }

    private void a(bho bho, int i, String str) {
        a.c(str);
        this.c.a(bho.e);
        String a = bho.a();
        synchronized (this.b) {
            bho.f = false;
            if (i == 0) {
                this.b.b(bho);
            } else {
                String str2;
                String valueOf;
                switch (bif.a[i - 1]) {
                    case wi.j /*1*/:
                        this.b.b(bho);
                        str2 = "Task finished. ";
                        valueOf = String.valueOf(a);
                        if (valueOf.length() == 0) {
                            valueOf = new String(str2);
                            break;
                        } else {
                            str2.concat(valueOf);
                            break;
                        }
                        break;
                    case wi.l /*2*/:
                        bhr bhr = bho.h.d;
                        if (bhr != null && bhr.b()) {
                            if (bho.b instanceof bhf) {
                                ((bhf) bho.b).a(this.d);
                                this.b.b(bho);
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
                        bir bir = this.b;
                        bho bho2 = new bho(bho.a, bho.c.b(), bho.b, bho.a(bho.h.d, 0), bho.h, bho.e, bho.j);
                        bho2.i = bho.i;
                        bir.a(bho, bho2);
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
                    case wi.z /*3*/:
                        this.b.b(bho);
                        break;
                    case wi.h /*4*/:
                        this.b.c(bho);
                        break;
                    default:
                        this.b.b(bho);
                        throw new IllegalArgumentException("Invalid task state");
                }
            }
        }
    }
}
