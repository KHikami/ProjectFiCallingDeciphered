package io.grpc.internal;

import bm;
import iyr;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import ojh;
import ojm;
import ojn;
import ojo;
import ojq;
import ojr;
import ojy;
import okj;
import okm;
import okr;
import oks;
import olh;
import olk;
import oll;
import olt;
import olv;
import omb;

public final class br extends ojn implements dl {
    static final Logger a;
    static final Pattern b;
    static final y c;
    static final y d;
    final omb<y> A;
    private final oks B;
    private final cy<ScheduledExecutorService> C;
    private final iyr D;
    private final long E;
    private final ojn F;
    private ScheduledFuture<?> G;
    private bw H;
    final String e;
    final oll f;
    final ojh g;
    final z h;
    final Executor i;
    final boolean j;
    final Object k;
    final okj l;
    final ojy m;
    ScheduledExecutorService n;
    final k o;
    final String p;
    olk q;
    okr<y> r;
    final Map<okm, dd> s;
    final HashSet<dd> t;
    final HashSet<ag> u;
    final bp<Object> v;
    final HashSet<Object> w;
    boolean x;
    boolean y;
    final v z;

    static {
        a = Logger.getLogger(br.class.getName());
        b = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");
        c = new bf(olv.q.a("Channel is shutdown"));
        d = new bf(olv.p.a("Channel is in idle mode"));
    }

    okr<y> b() {
        okr<y> okr_io_grpc_internal_y;
        synchronized (this.k) {
            if (this.x) {
                okr_io_grpc_internal_y = null;
            } else {
                if (this.v.a()) {
                    e();
                } else {
                    d();
                }
                if (this.r != null) {
                    okr_io_grpc_internal_y = this.r;
                } else {
                    oks oks = this.B;
                    this.q.a();
                    okr_io_grpc_internal_y = oks.a(this.A);
                    this.r = okr_io_grpc_internal_y;
                    olk olk = this.q;
                    this.n.execute(new bt(this, okr_io_grpc_internal_y, olk));
                }
            }
        }
        return okr_io_grpc_internal_y;
    }

    private void e() {
        if (this.G != null) {
            this.G.cancel(false);
            this.H.a = true;
            this.G = null;
            this.H = null;
        }
    }

    void d() {
        if (this.E != -1) {
            e();
            this.H = new bw(this);
            this.G = this.n.schedule(new bq(this.H), this.E, TimeUnit.MILLISECONDS);
        }
    }

    br(String str, k kVar, oll oll, ojh ojh, oks oks, z zVar, okj okj, ojy ojy, cy<ScheduledExecutorService> cyVar, iyr iyr, long j, Executor executor, String str2, List<ojq> list) {
        super((byte) 0);
        this.k = new Object();
        this.s = new HashMap();
        this.t = new HashSet();
        this.u = new HashSet();
        this.v = new bs(this);
        this.w = new HashSet();
        this.z = new v(this);
        this.A = new bu(this);
        this.e = (String) bm.a((Object) str, (Object) "target");
        this.f = (oll) bm.a((Object) oll, (Object) "nameResolverFactory");
        this.g = (ojh) bm.a((Object) ojh, (Object) "nameResolverParams");
        this.q = a(str, oll, ojh);
        this.B = (oks) bm.a((Object) oks, (Object) "loadBalancerFactory");
        if (executor == null) {
            this.j = true;
            this.i = (Executor) cv.a.a(bi.j);
        } else {
            this.j = false;
            this.i = executor;
        }
        this.o = kVar;
        this.h = new l(zVar, this.i);
        this.F = ojr.a(new bz(this), list);
        this.C = cyVar;
        this.n = (ScheduledExecutorService) cv.a.a(cyVar);
        this.D = (iyr) bm.a((Object) iyr, (Object) "stopwatchSupplier");
        boolean z = j > 0 || j == -1;
        bm.a(z, "invalid idleTimeoutMillis %s", j);
        this.E = j;
        this.l = okj;
        this.m = ojy;
        this.p = str2;
        if (a.isLoggable(Level.INFO)) {
            a.log(Level.INFO, "[{0}] Created with target {1}", new Object[]{c(), str});
        }
    }

    public static boolean a(List<? extends List<olt>> list) {
        for (List isEmpty : list) {
            if (!isEmpty.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static olk a(java.lang.String r7, oll r8, ojh r9) {
        /*
        r1 = 0;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r0 = new java.net.URI;	 Catch:{ URISyntaxException -> 0x0014 }
        r0.<init>(r7);	 Catch:{ URISyntaxException -> 0x0014 }
    L_0x000b:
        if (r0 == 0) goto L_0x001e;
    L_0x000d:
        r0 = r8.a(r0, r9);
        if (r0 == 0) goto L_0x001e;
    L_0x0013:
        return r0;
    L_0x0014:
        r0 = move-exception;
        r0 = r0.getMessage();
        r2.append(r0);
        r0 = r1;
        goto L_0x000b;
    L_0x001e:
        r0 = b;
        r0 = r0.matcher(r7);
        r0 = r0.matches();
        if (r0 != 0) goto L_0x004c;
    L_0x002a:
        r1 = new java.net.URI;	 Catch:{ URISyntaxException -> 0x0094 }
        r3 = r8.a();	 Catch:{ URISyntaxException -> 0x0094 }
        r4 = "";
        r5 = "/";
        r0 = java.lang.String.valueOf(r7);	 Catch:{ URISyntaxException -> 0x0094 }
        r6 = r0.length();	 Catch:{ URISyntaxException -> 0x0094 }
        if (r6 == 0) goto L_0x008e;
    L_0x003e:
        r0 = r5.concat(r0);	 Catch:{ URISyntaxException -> 0x0094 }
    L_0x0042:
        r5 = 0;
        r1.<init>(r3, r4, r0, r5);	 Catch:{ URISyntaxException -> 0x0094 }
        r0 = r8.a(r1, r9);
        if (r0 != 0) goto L_0x0013;
    L_0x004c:
        r1 = new java.lang.IllegalArgumentException;
        r3 = "cannot find a NameResolver for %s%s";
        r0 = 2;
        r4 = new java.lang.Object[r0];
        r0 = 0;
        r4[r0] = r7;
        r5 = 1;
        r0 = r2.length();
        if (r0 <= 0) goto L_0x009b;
    L_0x005d:
        r0 = java.lang.String.valueOf(r2);
        r2 = new java.lang.StringBuilder;
        r6 = java.lang.String.valueOf(r0);
        r6 = r6.length();
        r6 = r6 + 3;
        r2.<init>(r6);
        r6 = " (";
        r2 = r2.append(r6);
        r0 = r2.append(r0);
        r2 = ")";
        r0 = r0.append(r2);
        r0 = r0.toString();
    L_0x0084:
        r4[r5] = r0;
        r0 = java.lang.String.format(r3, r4);
        r1.<init>(r0);
        throw r1;
    L_0x008e:
        r0 = new java.lang.String;	 Catch:{ URISyntaxException -> 0x0094 }
        r0.<init>(r5);	 Catch:{ URISyntaxException -> 0x0094 }
        goto L_0x0042;
    L_0x0094:
        r0 = move-exception;
        r1 = new java.lang.IllegalArgumentException;
        r1.<init>(r0);
        throw r1;
    L_0x009b:
        r0 = "";
        goto L_0x0084;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.br.a(java.lang.String, oll, ojh):olk");
    }

    public <ReqT, RespT> ojo<ReqT, RespT> a(olh<ReqT, RespT> olh_ReqT__RespT, ojm ojm) {
        return this.F.a(olh_ReqT__RespT, ojm);
    }

    public String a() {
        return this.F.a();
    }

    public String c() {
        return bi.a((dl) this);
    }
}
