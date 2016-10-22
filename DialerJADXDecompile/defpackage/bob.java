package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map.Entry;

/* renamed from: bob */
final class bob extends bpb {
    boolean a;
    final bny b;
    final bou c;
    final bnt d;
    final bpf e;
    long g;
    boolean h;
    private final bov i;
    private long j;
    private final bpf k;
    private final boz l;

    protected bob(bnp bnp, bnr bnr) {
        super(bnp);
        buf.A((Object) bnr);
        this.j = Long.MIN_VALUE;
        this.c = new bou(bnp);
        this.b = new bny(bnp);
        this.i = new bov(bnp);
        this.d = new bnt(bnp);
        this.l = new boz(f());
        this.k = new boc(this, bnp);
        this.e = new bod(this, bnp);
    }

    private long q() {
        long j = 0;
        cqn.b();
        o();
        try {
            bny bny = this.b;
            cqn.b();
            bny.o();
            j = bny.a(bny.b, null, 0);
        } catch (SQLiteException e) {
            e("Failed to get min/max hit times from local store", e);
        }
        return j;
    }

    private final void r() {
        boo i = i();
        if (i.a && !i.b) {
            long q = q();
            if (q != 0 && Math.abs(f().a() - q) <= ((Long) boq.h.a()).longValue()) {
                a("Dispatch alarm scheduled (ms)", Long.valueOf(bom.e()));
                i.o();
                buf.a(i.a, (Object) "Receiver not registered");
                q = bom.e();
                if (q > 0) {
                    i.b();
                    long b = i.f().b() + q;
                    i.b = true;
                    i.c.setInexactRepeating(2, b, 0, i.c());
                }
            }
        }
    }

    private long t() {
        if (this.j != Long.MIN_VALUE) {
            return this.j;
        }
        long longValue = ((Long) boq.e.a()).longValue();
        bpa e = this.f.e();
        e.o();
        if (!e.a) {
            return longValue;
        }
        bpa e2 = this.f.e();
        e2.o();
        return ((long) e2.b) * 1000;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(defpackage.bns r11, boolean r12) {
        /*
        r10 = this;
        defpackage.buf.A(r11);
        r10.o();
        defpackage.cqn.b();
        r0 = r10.b;	 Catch:{ SQLiteException -> 0x00af }
        r0.b();	 Catch:{ SQLiteException -> 0x00af }
        r0 = r10.b;	 Catch:{ SQLiteException -> 0x00af }
        r2 = r11.a;	 Catch:{ SQLiteException -> 0x00af }
        r1 = r11.b;	 Catch:{ SQLiteException -> 0x00af }
        defpackage.buf.n(r1);	 Catch:{ SQLiteException -> 0x00af }
        r0.o();	 Catch:{ SQLiteException -> 0x00af }
        defpackage.cqn.b();	 Catch:{ SQLiteException -> 0x00af }
        r4 = r0.m();	 Catch:{ SQLiteException -> 0x00af }
        r5 = "properties";
        r6 = "app_uid=? AND cid<>?";
        r7 = 2;
        r7 = new java.lang.String[r7];	 Catch:{ SQLiteException -> 0x00af }
        r8 = 0;
        r2 = java.lang.String.valueOf(r2);	 Catch:{ SQLiteException -> 0x00af }
        r7[r8] = r2;	 Catch:{ SQLiteException -> 0x00af }
        r2 = 1;
        r7[r2] = r1;	 Catch:{ SQLiteException -> 0x00af }
        r1 = r4.delete(r5, r6, r7);	 Catch:{ SQLiteException -> 0x00af }
        if (r1 <= 0) goto L_0x0041;
    L_0x0038:
        r2 = "Deleted property records";
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ SQLiteException -> 0x00af }
        r0.a(r2, r1);	 Catch:{ SQLiteException -> 0x00af }
    L_0x0041:
        r0 = r10.b;	 Catch:{ SQLiteException -> 0x00af }
        r2 = r11.a;	 Catch:{ SQLiteException -> 0x00af }
        r1 = r11.b;	 Catch:{ SQLiteException -> 0x00af }
        r4 = r11.c;	 Catch:{ SQLiteException -> 0x00af }
        defpackage.buf.n(r1);	 Catch:{ SQLiteException -> 0x00af }
        defpackage.buf.n(r4);	 Catch:{ SQLiteException -> 0x00af }
        r0.o();	 Catch:{ SQLiteException -> 0x00af }
        defpackage.cqn.b();	 Catch:{ SQLiteException -> 0x00af }
        r5 = "SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?";
        r6 = 3;
        r6 = new java.lang.String[r6];	 Catch:{ SQLiteException -> 0x00af }
        r7 = 0;
        r2 = java.lang.String.valueOf(r2);	 Catch:{ SQLiteException -> 0x00af }
        r6[r7] = r2;	 Catch:{ SQLiteException -> 0x00af }
        r2 = 1;
        r6[r2] = r1;	 Catch:{ SQLiteException -> 0x00af }
        r1 = 2;
        r6[r1] = r4;	 Catch:{ SQLiteException -> 0x00af }
        r2 = 0;
        r2 = r0.a(r5, r6, r2);	 Catch:{ SQLiteException -> 0x00af }
        r0 = 1;
        r0 = r0 + r2;
        r11.e = r0;	 Catch:{ SQLiteException -> 0x00af }
        r4 = r10.b;	 Catch:{ SQLiteException -> 0x00af }
        defpackage.buf.A(r11);	 Catch:{ SQLiteException -> 0x00af }
        r4.o();	 Catch:{ SQLiteException -> 0x00af }
        defpackage.cqn.b();	 Catch:{ SQLiteException -> 0x00af }
        r5 = r4.m();	 Catch:{ SQLiteException -> 0x00af }
        r0 = r11.f;	 Catch:{ SQLiteException -> 0x00af }
        defpackage.buf.A(r0);	 Catch:{ SQLiteException -> 0x00af }
        r6 = new android.net.Uri$Builder;	 Catch:{ SQLiteException -> 0x00af }
        r6.<init>();	 Catch:{ SQLiteException -> 0x00af }
        r0 = r0.entrySet();	 Catch:{ SQLiteException -> 0x00af }
        r7 = r0.iterator();	 Catch:{ SQLiteException -> 0x00af }
    L_0x0093:
        r0 = r7.hasNext();	 Catch:{ SQLiteException -> 0x00af }
        if (r0 == 0) goto L_0x00bd;
    L_0x0099:
        r0 = r7.next();	 Catch:{ SQLiteException -> 0x00af }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ SQLiteException -> 0x00af }
        r1 = r0.getKey();	 Catch:{ SQLiteException -> 0x00af }
        r1 = (java.lang.String) r1;	 Catch:{ SQLiteException -> 0x00af }
        r0 = r0.getValue();	 Catch:{ SQLiteException -> 0x00af }
        r0 = (java.lang.String) r0;	 Catch:{ SQLiteException -> 0x00af }
        r6.appendQueryParameter(r1, r0);	 Catch:{ SQLiteException -> 0x00af }
        goto L_0x0093;
    L_0x00af:
        r0 = move-exception;
        r1 = "Failed to update Analytics property";
        r10.e(r1, r0);	 Catch:{ all -> 0x0130 }
        r0 = r10.b;	 Catch:{ SQLiteException -> 0x013e }
        r0.d();	 Catch:{ SQLiteException -> 0x013e }
    L_0x00ba:
        r0 = -1;
    L_0x00bc:
        return r0;
    L_0x00bd:
        r0 = r6.build();	 Catch:{ SQLiteException -> 0x00af }
        r0 = r0.getEncodedQuery();	 Catch:{ SQLiteException -> 0x00af }
        if (r0 != 0) goto L_0x0125;
    L_0x00c7:
        r0 = "";
        r1 = r0;
    L_0x00ca:
        r6 = new android.content.ContentValues;	 Catch:{ SQLiteException -> 0x00af }
        r6.<init>();	 Catch:{ SQLiteException -> 0x00af }
        r0 = "app_uid";
        r8 = r11.a;	 Catch:{ SQLiteException -> 0x00af }
        r7 = java.lang.Long.valueOf(r8);	 Catch:{ SQLiteException -> 0x00af }
        r6.put(r0, r7);	 Catch:{ SQLiteException -> 0x00af }
        r0 = "cid";
        r7 = r11.b;	 Catch:{ SQLiteException -> 0x00af }
        r6.put(r0, r7);	 Catch:{ SQLiteException -> 0x00af }
        r0 = "tid";
        r7 = r11.c;	 Catch:{ SQLiteException -> 0x00af }
        r6.put(r0, r7);	 Catch:{ SQLiteException -> 0x00af }
        r7 = "adid";
        r0 = r11.d;	 Catch:{ SQLiteException -> 0x00af }
        if (r0 == 0) goto L_0x0127;
    L_0x00ee:
        r0 = 1;
    L_0x00ef:
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ SQLiteException -> 0x00af }
        r6.put(r7, r0);	 Catch:{ SQLiteException -> 0x00af }
        r0 = "hits_count";
        r8 = r11.e;	 Catch:{ SQLiteException -> 0x00af }
        r7 = java.lang.Long.valueOf(r8);	 Catch:{ SQLiteException -> 0x00af }
        r6.put(r0, r7);	 Catch:{ SQLiteException -> 0x00af }
        r0 = "params";
        r6.put(r0, r1);	 Catch:{ SQLiteException -> 0x00af }
        r0 = "properties";
        r1 = 0;
        r7 = 5;
        r0 = r5.insertWithOnConflict(r0, r1, r6, r7);	 Catch:{ SQLiteException -> 0x0129 }
        r6 = -1;
        r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r0 != 0) goto L_0x0119;
    L_0x0114:
        r0 = "Failed to insert/update a property (got -1)";
        r4.f(r0);	 Catch:{ SQLiteException -> 0x0129 }
    L_0x0119:
        r0 = r10.b;	 Catch:{ SQLiteException -> 0x00af }
        r0.c();	 Catch:{ SQLiteException -> 0x00af }
        r0 = r10.b;	 Catch:{ SQLiteException -> 0x0137 }
        r0.d();	 Catch:{ SQLiteException -> 0x0137 }
    L_0x0123:
        r0 = r2;
        goto L_0x00bc;
    L_0x0125:
        r1 = r0;
        goto L_0x00ca;
    L_0x0127:
        r0 = 0;
        goto L_0x00ef;
    L_0x0129:
        r0 = move-exception;
        r1 = "Error storing a property";
        r4.e(r1, r0);	 Catch:{ SQLiteException -> 0x00af }
        goto L_0x0119;
    L_0x0130:
        r0 = move-exception;
        r1 = r10.b;	 Catch:{ SQLiteException -> 0x0146 }
        r1.d();	 Catch:{ SQLiteException -> 0x0146 }
    L_0x0136:
        throw r0;
    L_0x0137:
        r0 = move-exception;
        r1 = "Failed to end transaction";
        r10.e(r1, r0);
        goto L_0x0123;
    L_0x013e:
        r0 = move-exception;
        r1 = "Failed to end transaction";
        r10.e(r1, r0);
        goto L_0x00ba;
    L_0x0146:
        r1 = move-exception;
        r2 = "Failed to end transaction";
        r10.e(r2, r1);
        goto L_0x0136;
        */
        throw new UnsupportedOperationException("Method not decompiled: bob.a(bns, boolean):long");
    }

    protected final void a() {
        this.b.p();
        this.i.p();
        this.d.p();
    }

    final void a(bns bns, cqv cqv) {
        buf.A((Object) bns);
        buf.A((Object) cqv);
        cqm bmb = new bmb(this.f);
        String str = bns.c;
        buf.n(str);
        Uri a = bmg.a(str);
        ListIterator listIterator = bmb.i.i.listIterator();
        while (listIterator.hasNext()) {
            if (a.equals(((cqt) listIterator.next()).a())) {
                listIterator.remove();
            }
        }
        bmb.i.i.add(new bmg(bmb.a, str));
        bmb.b = bns.d;
        cqk a2 = bmb.i.a();
        a2.a(bmb.a.h().b());
        a2.a(bmb.a.h.b());
        bmb.b(a2);
        bnd bnd = (bnd) a2.b(bnd.class);
        bnd.a = "data";
        bnd.g = true;
        a2.a((cql) cqv);
        bnc bnc = (bnc) a2.b(bnc.class);
        cqu cqu = (cqu) a2.b(cqu.class);
        for (Entry entry : bns.f.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if ("an".equals(str2)) {
                cqu.a = str3;
            } else if ("av".equals(str2)) {
                cqu.b = str3;
            } else if ("aid".equals(str2)) {
                cqu.c = str3;
            } else if ("aiid".equals(str2)) {
                cqu.d = str3;
            } else if ("uid".equals(str2)) {
                bnd.c = str3;
            } else {
                buf.n(str2);
                if (str2 != null && str2.startsWith("&")) {
                    str2 = str2.substring(1);
                }
                buf.a(str2, (Object) "Name can not be empty or \"&\"");
                bnc.a.put(str2, str3);
            }
        }
        b("Sending installation campaign to", bns.c, cqv);
        a2.e = j().b();
        cqn cqn = a2.a.h;
        if (a2.g) {
            throw new IllegalStateException("Measurement prototype can't be submitted");
        } else if (a2.c) {
            throw new IllegalStateException("Measurement can only be submitted once");
        } else {
            cqk a3 = a2.a();
            a3.f = a3.b.b();
            if (a3.e != 0) {
                a3.d = a3.e;
            } else {
                a3.d = a3.b.a();
            }
            a3.c = true;
            cqn.c.execute(new cqo(cqn, a3));
        }
    }

    public final void a(bop bop) {
        a(bop, this.g);
    }

    public final void a(bop bop, long j) {
        cqn.b();
        o();
        long j2 = -1;
        long d = j().d();
        if (d != 0) {
            j2 = Math.abs(f().a() - d);
        }
        b("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(j2));
        if (!btq.a) {
            c();
        }
        try {
            d();
            j().l();
            l();
            if (bop != null) {
                bop.a();
            }
            if (this.g != j) {
                this.c.c();
            }
        } catch (Throwable th) {
            e("Local dispatch failed", th);
            j().l();
            l();
            if (bop != null) {
                bop.a();
            }
        }
    }

    final boolean a(String str) {
        return g().checkCallingOrSelfPermission(str) == 0;
    }

    protected final void c() {
        if (!this.h && bom.b() && !this.d.b()) {
            if (this.l.a(((Long) boq.C.a()).longValue())) {
                Object obj;
                this.l.a();
                b("Connecting to service");
                bnt bnt = this.d;
                cqn.b();
                bnt.o();
                if (bnt.b != null) {
                    obj = 1;
                } else {
                    bpj a = bnt.a.a();
                    if (a != null) {
                        bnt.b = a;
                        bnt.c();
                        int i = 1;
                    } else {
                        obj = null;
                    }
                }
                if (obj != null) {
                    b("Connected to service");
                    this.l.a = 0;
                    b();
                }
            }
        }
    }

    protected final boolean d() {
        cqn.b();
        o();
        b("Dispatching a batch of local hits");
        Object obj = (this.d.b() || btq.a) ? null : 1;
        Object obj2 = !this.i.b() ? 1 : null;
        if (obj == null || obj2 == null) {
            List<bos> a;
            long max = (long) Math.max(bom.f(), bom.g());
            List arrayList = new ArrayList();
            long j = 0;
            while (true) {
                this.b.b();
                arrayList.clear();
                a = this.b.a(max);
                if (a.isEmpty()) {
                    b("Store is empty, nothing to dispatch");
                    s();
                    try {
                        this.b.c();
                        this.b.d();
                        return false;
                    } catch (SQLiteException e) {
                        e("Failed to commit local dispatch transaction", e);
                        s();
                        return false;
                    }
                }
                try {
                    bos bos;
                    long j2;
                    a("Hits loaded from store. count", Integer.valueOf(a.size()));
                    for (bos bos2 : a) {
                        if (bos2.c == j) {
                            break;
                        }
                    }
                    if (this.d.b() && !btq.a) {
                        b("Service connected, sending hits to the service");
                        while (!a.isEmpty()) {
                            bos2 = (bos) a.get(0);
                            if (this.d.a(bos2)) {
                                j = Math.max(j, bos2.c);
                                a.remove(bos2);
                                b("Hit sent do device AnalyticsService for delivery", bos2);
                                try {
                                    this.b.b(bos2.c);
                                    arrayList.add(Long.valueOf(bos2.c));
                                } catch (SQLiteException e2) {
                                    e("Failed to remove hit that was send for delivery", e2);
                                    s();
                                    try {
                                        this.b.c();
                                        this.b.d();
                                        return false;
                                    } catch (SQLiteException e22) {
                                        e("Failed to commit local dispatch transaction", e22);
                                        s();
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                    break;
                    if (this.i.b()) {
                        boolean z;
                        List<Long> a2;
                        bov bov = this.i;
                        cqn.b();
                        bov.o();
                        buf.A((Object) a);
                        if (bov.h().k().isEmpty() || !bov.a.a(((long) ((Integer) boq.v.a()).intValue()) * 1000)) {
                            obj = null;
                        } else {
                            obj2 = bog.a((String) boq.p.a()) != bog.NONE ? 1 : null;
                            if (bol.a((String) boq.q.a()) == bol.GZIP) {
                                z = true;
                                a2 = obj2 == null ? bov.a((List) a, z) : bov.a((List) a);
                                for (Long longValue : a2) {
                                    j = Math.max(j, longValue.longValue());
                                }
                                a.removeAll(a2);
                                this.b.a((List) a2);
                                arrayList.addAll(a2);
                                j2 = j;
                            } else {
                                obj = obj2;
                            }
                        }
                        obj2 = obj;
                        z = false;
                        if (obj2 == null) {
                        }
                        while (r8.hasNext()) {
                            j = Math.max(j, longValue.longValue());
                        }
                        a.removeAll(a2);
                        try {
                            this.b.a((List) a2);
                            arrayList.addAll(a2);
                            j2 = j;
                        } catch (SQLiteException e222) {
                            e("Failed to remove successfully uploaded hits", e222);
                            s();
                            try {
                                this.b.c();
                                this.b.d();
                                return false;
                            } catch (SQLiteException e2222) {
                                e("Failed to commit local dispatch transaction", e2222);
                                s();
                                return false;
                            }
                        }
                    }
                    j2 = j;
                    if (arrayList.isEmpty()) {
                        try {
                            this.b.c();
                            this.b.d();
                            return false;
                        } catch (SQLiteException e22222) {
                            e("Failed to commit local dispatch transaction", e22222);
                            s();
                            return false;
                        }
                    }
                    try {
                        this.b.c();
                        this.b.d();
                        j = j2;
                    } catch (SQLiteException e222222) {
                        e("Failed to commit local dispatch transaction", e222222);
                        s();
                        return false;
                    }
                } catch (SQLiteException e2222222) {
                    d("Failed to read hits from persisted store", e2222222);
                    s();
                    return false;
                } finally {
                    try {
                        this.b.c();
                        this.b.d();
                    } catch (SQLiteException e22222222) {
                        e("Failed to commit local dispatch transaction", e22222222);
                        s();
                        return false;
                    }
                }
            }
            d("Database contains successfully uploaded hit", Long.valueOf(j), Integer.valueOf(a.size()));
            s();
            return false;
        }
        b("No network or service available. Will retry later");
        return false;
    }

    public final void m() {
        o();
        cqn.b();
        this.h = true;
        this.d.d();
        l();
    }

    protected final void b() {
        cqn.b();
        if (!btq.a) {
            cqn.b();
            o();
            e();
            if (!bom.b()) {
                e("Service client disabled. Can't dispatch local hits to device AnalyticsService");
            }
            if (!this.d.b()) {
                b("Service not connected");
            } else if (!this.b.l()) {
                b("Dispatching local hits to device AnalyticsService");
                while (true) {
                    try {
                        break;
                        List a = this.b.a((long) bom.f());
                        if (a.isEmpty()) {
                            bos bos;
                            while (true) {
                                if (!a.isEmpty()) {
                                    bos = (bos) a.get(0);
                                    if (this.d.a(bos)) {
                                        l();
                                        return;
                                    }
                                    a.remove(bos);
                                    try {
                                        this.b.b(bos.c);
                                    } catch (SQLiteException e) {
                                        e("Failed to remove hit that was send for delivery", e);
                                        s();
                                        return;
                                    }
                                }
                            }
                            List a2 = this.b.a((long) bom.f());
                            if (a2.isEmpty()) {
                                while (true) {
                                    if (a2.isEmpty()) {
                                        bos = (bos) a2.get(0);
                                        if (this.d.a(bos)) {
                                            a2.remove(bos);
                                            this.b.b(bos.c);
                                        } else {
                                            l();
                                            return;
                                        }
                                    }
                                }
                            }
                            l();
                            return;
                        }
                        l();
                        return;
                    } catch (SQLiteException e2) {
                        e("Failed to read hits from store", e2);
                        s();
                        return;
                    }
                }
            }
        }
    }

    public final void l() {
        long j = 0;
        cqn.b();
        o();
        boolean z = !this.h && ((!btq.a || h().a()) && t() > 0);
        if (!z) {
            this.c.b();
            s();
        } else if (this.b.l()) {
            this.c.b();
            s();
        } else {
            if (((Boolean) boq.z.a()).booleanValue()) {
                z = true;
            } else {
                BroadcastReceiver broadcastReceiver = this.c;
                broadcastReceiver.a();
                if (!broadcastReceiver.b) {
                    Context context = broadcastReceiver.a.a;
                    context.registerReceiver(broadcastReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    IntentFilter intentFilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
                    intentFilter.addCategory(context.getPackageName());
                    context.registerReceiver(broadcastReceiver, intentFilter);
                    broadcastReceiver.c = broadcastReceiver.d();
                    broadcastReceiver.a.a().a("Registering connectivity change receiver. Network connected", Boolean.valueOf(broadcastReceiver.c));
                    broadcastReceiver.b = true;
                }
                bou bou = this.c;
                if (!bou.b) {
                    bou.a.a().e("Connectivity unknown. Receiver not registered");
                }
                z = bou.c;
            }
            if (z) {
                r();
                long t = t();
                long d = j().d();
                if (d != 0) {
                    d = t - Math.abs(f().a() - d);
                    if (d <= 0) {
                        d = Math.min(bom.d(), t);
                    }
                } else {
                    d = Math.min(bom.d(), t);
                }
                a("Dispatch scheduled (ms)", Long.valueOf(d));
                if (this.k.b()) {
                    bpf bpf = this.k;
                    d = Math.max(1, d + (bpf.c == 0 ? 0 : Math.abs(bpf.a.c.a() - bpf.c)));
                    bpf = this.k;
                    if (!bpf.b()) {
                        return;
                    }
                    if (d < 0) {
                        bpf.c();
                        return;
                    }
                    d -= Math.abs(bpf.a.c.a() - bpf.c);
                    if (d >= 0) {
                        j = d;
                    }
                    bpf.d().removeCallbacks(bpf.b);
                    if (!bpf.d().postDelayed(bpf.b, j)) {
                        bpf.a.a().e("Failed to adjust delayed post. time", Long.valueOf(j));
                        return;
                    }
                    return;
                }
                this.k.a(d);
                return;
            }
            s();
            r();
        }
    }

    private final void s() {
        if (this.k.b()) {
            b("All hits dispatched or no network/service. Going to power save mode");
        }
        this.k.c();
        boo i = i();
        if (i.b) {
            i.b();
        }
    }
}
