package io.grpc.internal;

import dfc;
import dff;
import dfg;
import dfh;
import dfk;
import dfq;
import dgc;
import dgm;
import dgn;
import dhc;
import dhf;
import dhg;
import dhh;
import dhn;
import dht;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* compiled from: PG */
public final class bb extends dfg implements cn {
    static final Logger a;
    static final s b;
    private static final Pattern r;
    final t c;
    final Executor d;
    final String e;
    final Object f;
    final dgc g;
    final dfq h;
    ScheduledExecutorService i;
    final h j;
    final dfg k;
    final dhf l;
    public final dgm m;
    final Map n;
    final HashSet o;
    boolean p;
    final q q;
    private final boolean s;
    private final dht t;

    static {
        a = Logger.getLogger(bb.class.getName());
        r = Pattern.compile("[a-zA-Z][a-zA-Z0-9+-.]*:/.*");
        b = new ap(dhn.j.a("Channel is shutdown"));
    }

    public bb(String str, h hVar, dhg dhg, dfc dfc, dgn dgn, t tVar, dgc dgc, dfq dfq, Executor executor, String str2, List list) {
        super((byte) 0);
        this.f = new Object();
        this.n = new HashMap();
        this.o = new HashSet();
        this.q = new q(this);
        this.t = new bc(this);
        if (executor == null) {
            this.s = true;
            this.d = (Executor) ca.a.a(ar.g);
        } else {
            this.s = false;
            this.d = executor;
        }
        this.j = hVar;
        this.l = a(str, dhg, dfc);
        this.m = dgn.a(this.t);
        this.c = tVar;
        this.e = str2;
        this.k = dfk.a(new bf(this), list);
        this.i = (ScheduledExecutorService) ca.a.a(ar.h);
        this.g = dgc;
        this.h = dfq;
        this.l.a(new dhh(this));
        if (a.isLoggable(Level.INFO)) {
            a.log(Level.INFO, "[{0}] Created with target {1}", new Object[]{ar.a((cn) this), str});
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static dhf a(java.lang.String r7, dhg r8, dfc r9) {
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
        r0 = r;
        r0 = r0.matcher(r7);
        r0 = r0.matches();
        if (r0 != 0) goto L_0x004b;
    L_0x002a:
        r1 = new java.net.URI;	 Catch:{ URISyntaxException -> 0x0093 }
        r3 = r8.a();	 Catch:{ URISyntaxException -> 0x0093 }
        r4 = 0;
        r5 = "/";
        r0 = java.lang.String.valueOf(r7);	 Catch:{ URISyntaxException -> 0x0093 }
        r6 = r0.length();	 Catch:{ URISyntaxException -> 0x0093 }
        if (r6 == 0) goto L_0x008d;
    L_0x003d:
        r0 = r5.concat(r0);	 Catch:{ URISyntaxException -> 0x0093 }
    L_0x0041:
        r5 = 0;
        r1.<init>(r3, r4, r0, r5);	 Catch:{ URISyntaxException -> 0x0093 }
        r0 = r8.a(r1, r9);
        if (r0 != 0) goto L_0x0013;
    L_0x004b:
        r1 = new java.lang.IllegalArgumentException;
        r3 = "cannot find a NameResolver for %s%s";
        r0 = 2;
        r4 = new java.lang.Object[r0];
        r0 = 0;
        r4[r0] = r7;
        r5 = 1;
        r0 = r2.length();
        if (r0 <= 0) goto L_0x009a;
    L_0x005c:
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
    L_0x0083:
        r4[r5] = r0;
        r0 = java.lang.String.format(r3, r4);
        r1.<init>(r0);
        throw r1;
    L_0x008d:
        r0 = new java.lang.String;	 Catch:{ URISyntaxException -> 0x0093 }
        r0.<init>(r5);	 Catch:{ URISyntaxException -> 0x0093 }
        goto L_0x0041;
    L_0x0093:
        r0 = move-exception;
        r1 = new java.lang.IllegalArgumentException;
        r1.<init>(r0);
        throw r1;
    L_0x009a:
        r0 = "";
        goto L_0x0083;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.bb.a(java.lang.String, dhg, dfc):dhf");
    }

    public final dfh a(dhc dhc, dff dff) {
        return this.k.a(dhc, dff);
    }

    public final String a() {
        return this.k.a();
    }

    public final String b() {
        return ar.a((cn) this);
    }
}
