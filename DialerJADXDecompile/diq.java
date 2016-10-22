import io.grpc.internal.ar;
import io.grpc.internal.ay;
import io.grpc.internal.bg;
import io.grpc.internal.bh;
import io.grpc.internal.bx;
import io.grpc.internal.cn;
import io.grpc.internal.r;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
class diq implements bg {
    static final Logger a;
    private static final Map u;
    private static final dio[] v;
    private final int A;
    private boolean B;
    private boolean C;
    final InetSocketAddress b;
    final String c;
    bh d;
    dhv e;
    diz f;
    final Object g;
    final Map h;
    final Executor i;
    int j;
    dit k;
    dhn l;
    ay m;
    SSLSocketFactory n;
    Socket o;
    int p;
    LinkedList q;
    final dje r;
    Runnable s;
    dcu t;
    private final Random w;
    private final czb x;
    private int y;
    private final bx z;

    diq(InetSocketAddress inetSocketAddress, String str, Executor executor, SSLSocketFactory sSLSocketFactory, dje dje, int i) {
        this.w = new Random();
        this.g = new Object();
        this.h = new HashMap();
        this.p = 0;
        this.q = new LinkedList();
        this.b = (InetSocketAddress) cob.b((Object) inetSocketAddress, (Object) "address");
        this.c = str;
        this.A = i;
        this.i = (Executor) cob.b((Object) executor, (Object) "executor");
        this.z = new bx(executor);
        this.y = 3;
        this.n = sSLSocketFactory;
        this.r = (dje) cob.b((Object) dje, (Object) "connectionSpec");
        this.x = czb.a;
    }

    public final void a(i iVar, Executor executor) {
        boolean z = true;
        cob.b(this.e != null);
        long j = 0;
        synchronized (this.g) {
            if (this.C) {
                ay.a(iVar, executor, f());
                return;
            }
            ay ayVar;
            if (this.m != null) {
                z = false;
                ayVar = this.m;
            } else {
                j = this.w.nextLong();
                ay ayVar2 = new ay(j, new cyx(this.x).a());
                this.m = ayVar2;
                ayVar = ayVar2;
            }
            if (z) {
                this.e.a(false, (int) (j >>> 32), (int) j);
            }
            synchronized (ayVar) {
                if (ayVar.c) {
                    Runnable a;
                    if (ayVar.d != null) {
                        a = ay.a(iVar, ayVar.d);
                    } else {
                        a = ay.a(iVar, ayVar.e);
                    }
                    ay.a(executor, a);
                    return;
                }
                ayVar.b.put(iVar, executor);
            }
        }
    }

    final void a(dio dio) {
        boolean z = true;
        cob.b(dio.s == null, (Object) "StreamId already assigned");
        this.h.put(Integer.valueOf(this.y), dio);
        Object valueOf = Integer.valueOf(this.y);
        cob.b(valueOf, (Object) "id");
        cob.b(dio.s == null, "the stream has been started with id %s", dio.s);
        dio.s = valueOf;
        if (dio.u != null) {
            dio.p.a(false, false, valueOf.intValue(), 0, dio.t);
            dio.t = null;
            boolean z2 = false;
            while (!dio.u.isEmpty()) {
                boolean z3;
                dip dip = (dip) dio.u.poll();
                dio.q.a(dip.b, valueOf.intValue(), dip.a, false);
                if (dip.c) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                z2 = z3;
            }
            if (z2) {
                dio.q.a();
            }
            dio.u = null;
        }
        cob.b(dio.f() != null);
        synchronized (dio.l) {
            if (dio.k) {
                z = false;
            }
            cob.b(z, (Object) "Already allocated");
            dio.k = true;
        }
        dio.i();
        if (!(dio.j() == dhe.UNARY || dio.j() == dhe.SERVER_STREAMING)) {
            this.e.b();
        }
        if (this.y >= 2147483645) {
            this.y = Integer.MAX_VALUE;
            a(Integer.MAX_VALUE, djq.NO_ERROR, dhn.j.a("Stream ids exhausted"));
            return;
        }
        this.y += 2;
    }

    final boolean c() {
        boolean z = false;
        while (!this.q.isEmpty() && this.h.size() < this.p) {
            a((dio) this.q.poll());
            z = true;
        }
        return z;
    }

    public final void a(bh bhVar) {
        this.d = (bh) cob.b((Object) bhVar, (Object) "listener");
        this.e = new dhv(this, this.z);
        this.f = new diz(this, this.e);
        this.z.execute(new dir(this));
    }

    public final String b() {
        return ar.a((cn) this);
    }

    public final void a() {
        synchronized (this.g) {
            if (this.l != null) {
                return;
            }
            this.l = dhn.j.a("Transport stopped");
            this.d.a(this.l);
            e();
        }
    }

    final dio[] d() {
        dio[] dioArr;
        synchronized (this.g) {
            dioArr = (dio[]) this.h.values().toArray(v);
        }
        return dioArr;
    }

    final void a(Throwable th) {
        a(0, djq.INTERNAL_ERROR, dhn.j.b(th).b("No provided cause"));
    }

    final void a(djq djq, String str) {
        a(0, djq, a(djq).b(str));
    }

    final void a(int i, djq djq, dhn dhn) {
        synchronized (this.g) {
            if (this.l == null) {
                this.l = dhn;
                this.d.a(dhn);
            }
            if (!(djq == null || this.B)) {
                this.B = true;
                this.e.a(0, djq, new byte[0]);
            }
            Iterator it = this.h.entrySet().iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                if (((Integer) entry.getKey()).intValue() > i) {
                    it.remove();
                    ((dio) entry.getValue()).a(dhn, false, new dgr());
                }
            }
            Iterator it2 = this.q.iterator();
            while (it2.hasNext()) {
                ((dio) it2.next()).a(dhn, true, new dgr());
            }
            this.q.clear();
            e();
        }
    }

    final void a(int i, dhn dhn, djq djq) {
        synchronized (this.g) {
            dio dio = (dio) this.h.remove(Integer.valueOf(i));
            if (dio != null) {
                if (djq != null) {
                    this.e.a(i, djq.CANCEL);
                }
                if (dhn != null) {
                    boolean z = dhn.m == dhp.CANCELLED || dhn.m == dhp.DEADLINE_EXCEEDED;
                    dio.a(dhn, z, new dgr());
                }
                if (!c()) {
                    e();
                }
            }
        }
    }

    private void e() {
        if (this.l != null && this.h.isEmpty() && this.q.isEmpty() && !this.C) {
            this.C = true;
            if (this.m != null) {
                ay ayVar = this.m;
                Throwable f = f();
                synchronized (ayVar) {
                    if (ayVar.c) {
                    } else {
                        ayVar.c = true;
                        ayVar.d = f;
                        Map map = ayVar.b;
                        ayVar.b = null;
                        for (Entry entry : map.entrySet()) {
                            ay.a((Executor) entry.getValue(), ay.a((i) entry.getKey(), f));
                        }
                    }
                }
                this.m = null;
            }
            if (!this.B) {
                this.B = true;
                this.e.a(0, djq.NO_ERROR, new byte[0]);
            }
            this.e.close();
        }
    }

    private final Throwable f() {
        Throwable c;
        synchronized (this.g) {
            if (this.l != null) {
                c = this.l.c();
            } else {
                c = dhn.j.a("Connection closed").c();
            }
        }
        return c;
    }

    final boolean a(int i) {
        boolean z = true;
        synchronized (this.g) {
            if (i >= this.y || (i & 1) != 1) {
                z = false;
            }
        }
        return z;
    }

    final dio b(int i) {
        dio dio;
        synchronized (this.g) {
            dio = (dio) this.h.get(Integer.valueOf(i));
        }
        return dio;
    }

    static dhn a(djq djq) {
        dhn dhn = (dhn) u.get(djq);
        if (dhn != null) {
            return dhn;
        }
        return dhn.d.a("Unknown http2 error code: " + djq.n);
    }

    public String toString() {
        String valueOf = String.valueOf(ar.a((cn) this));
        String valueOf2 = String.valueOf(this.b);
        return new StringBuilder((String.valueOf(valueOf).length() + 2) + String.valueOf(valueOf2).length()).append(valueOf).append("(").append(valueOf2).append(")").toString();
    }

    public final /* synthetic */ r a(dhc dhc, dgr dgr) {
        cob.b((Object) dhc, (Object) "method");
        cob.b((Object) dgr, (Object) "headers");
        return new dio(dhc, dgr, this.e, this, this.f, this.g, this.A, this.c);
    }

    static {
        Map enumMap = new EnumMap(djq.class);
        enumMap.put(djq.NO_ERROR, dhn.i.a("No error: A GRPC status of OK should have been sent"));
        enumMap.put(djq.PROTOCOL_ERROR, dhn.i.a("Protocol error"));
        enumMap.put(djq.INTERNAL_ERROR, dhn.i.a("Internal error"));
        enumMap.put(djq.FLOW_CONTROL_ERROR, dhn.i.a("Flow control error"));
        enumMap.put(djq.STREAM_CLOSED, dhn.i.a("Stream closed"));
        enumMap.put(djq.FRAME_TOO_LARGE, dhn.i.a("Frame too large"));
        enumMap.put(djq.REFUSED_STREAM, dhn.j.a("Refused stream"));
        enumMap.put(djq.CANCEL, dhn.c.a("Cancelled"));
        enumMap.put(djq.COMPRESSION_ERROR, dhn.i.a("Compression error"));
        enumMap.put(djq.CONNECT_ERROR, dhn.i.a("Connect error"));
        enumMap.put(djq.ENHANCE_YOUR_CALM, dhn.h.a("Enhance your calm"));
        enumMap.put(djq.INADEQUATE_SECURITY, dhn.f.a("Inadequate security"));
        u = Collections.unmodifiableMap(enumMap);
        a = Logger.getLogger(diq.class.getName());
        v = new dio[0];
    }
}
