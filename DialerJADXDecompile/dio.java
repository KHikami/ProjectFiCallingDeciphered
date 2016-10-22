import io.grpc.internal.aw;
import io.grpc.internal.bi;
import io.grpc.internal.bs;
import io.grpc.internal.bt;
import io.grpc.internal.cg;
import io.grpc.internal.co;
import io.grpc.internal.cp;
import io.grpc.internal.f;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

/* compiled from: PG */
final class dio extends aw {
    private static final dlu v;
    private final diq A;
    private final Object B;
    private String C;
    private boolean D;
    final dhv p;
    final diz q;
    Object r;
    volatile Integer s;
    List t;
    Queue u;
    private int w;
    private int x;
    private final dhc y;
    private dgr z;

    static {
        v = new dlu();
    }

    dio(dhc dhc, dgr dgr, dhv dhv, diq diq, diz diz, Object obj, int i, String str) {
        super(new cp(), i);
        this.w = 65535;
        this.x = 65535;
        this.u = new ArrayDeque();
        this.D = false;
        this.y = dhc;
        this.z = dgr;
        this.p = dhv;
        this.A = diq;
        this.q = diz;
        this.B = obj;
        this.C = str;
    }

    public final dhe j() {
        return this.y.a;
    }

    public final void a(int i) {
        synchronized (this.B) {
            try {
                bi biVar = this.f;
                cob.a(i > 0, (Object) "numMessages must be > 0");
                if (!biVar.a()) {
                    biVar.d += (long) i;
                    biVar.b();
                }
            } catch (Throwable th) {
                a(th);
            }
        }
    }

    public final void a(cg cgVar) {
        super.a(cgVar);
        String str = "/";
        String valueOf = String.valueOf(this.y.b);
        if (valueOf.length() != 0) {
            valueOf = str.concat(valueOf);
        } else {
            valueOf = new String(str);
        }
        List a = dii.a(this.z, valueOf, this.C);
        this.z = null;
        synchronized (this.B) {
            this.t = a;
            diq diq = this.A;
            synchronized (diq.g) {
                if (diq.l != null) {
                    a(diq.l, true, new dgr());
                } else if (diq.h.size() >= diq.p) {
                    diq.q.add(this);
                } else {
                    diq.a(this);
                }
            }
        }
    }

    public final void a(dlu dlu, boolean z) {
        Throwable th;
        this.w = (int) (((long) this.w) - dlu.b);
        if (this.w < 0) {
            this.p.a(this.s.intValue(), djq.FLOW_CONTROL_ERROR);
            this.A.a(this.s.intValue(), dhn.i.a("Received data size exceeded our receiving window size"), null);
            return;
        }
        Object dix = new dix(dlu);
        if (this.m == null && this.g == f.HEADERS) {
            this.m = dhn.i.a("no headers received prior to data");
            this.n = new dgr();
        }
        if (this.m != null) {
            dhn dhn = this.m;
            String str = "DATA-----------------------------\n";
            String valueOf = String.valueOf(bt.a((bs) dix, this.o));
            if (valueOf.length() != 0) {
                valueOf = str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
            this.m = dhn.b(valueOf);
            dix.close();
            if (this.m.n.length() > 1000 || z) {
                a(this.m, this.n);
                b(dhn.c);
                return;
            }
            return;
        }
        cob.b(dix, (Object) "frame");
        Object obj = 1;
        try {
            if (this.g == f.STATUS) {
                dix.close();
            } else if (this.g == f.HEADERS) {
                a(dhn.i.a("headers not received before payload"), new dgr());
                dix.close();
            } else {
                a(f.MESSAGE);
                try {
                    a((bs) dix, false);
                } catch (Throwable th2) {
                    th = th2;
                    obj = null;
                    if (obj != null) {
                        dix.close();
                    }
                    throw th;
                }
            }
            if (z) {
                this.m = dhn.i.a("Received EOS on DATA frame");
                this.n = new dgr();
                a(this.m, this.n);
            }
        } catch (Throwable th3) {
            th = th3;
            if (obj != null) {
                dix.close();
            }
            throw th;
        }
    }

    protected final void b(co coVar, boolean z, boolean z2) {
        dlu dlu;
        if (coVar == null) {
            dlu = v;
        } else {
            dlu = coVar.c();
            int i = (int) dlu.b;
            if (i > 0) {
                synchronized (this.l) {
                    this.j = i + this.j;
                }
            }
        }
        synchronized (this.B) {
            if (this.D) {
                return;
            }
            if (this.u != null) {
                this.u.add(new dip(dlu, z, z2));
            } else {
                cob.b(this.s != null, (Object) "streamId should be set");
                this.q.a(z, this.s.intValue(), dlu, z2);
            }
        }
    }

    protected final void c_(int i) {
        synchronized (this.B) {
            this.x -= i;
            if (this.x <= 32767) {
                int i2 = 65535 - this.x;
                this.w += i2;
                this.x += i2;
                this.p.a(this.s.intValue(), (long) i2);
            }
        }
    }

    protected final void b(dhn dhn) {
        synchronized (this.B) {
            if (this.D) {
                return;
            }
            this.D = true;
            if (this.u != null) {
                this.A.q.remove(this);
                this.t = null;
                for (dip dip : this.u) {
                    dip.a.g();
                }
                this.u = null;
                a(dhn, true, new dgr());
            } else {
                this.A.a(this.s.intValue(), dhn, djq.CANCEL);
            }
        }
    }

    public final void b() {
        Object obj;
        super.b();
        if (this.h != f.STATUS) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj != null) {
            this.p.a(this.s.intValue(), djq.CANCEL);
        }
        this.A.a(this.s.intValue(), null, null);
    }

    public final /* synthetic */ Object g() {
        return this.s;
    }
}
