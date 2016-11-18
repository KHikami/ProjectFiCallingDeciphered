package defpackage;

final class inh extends ikg {
    final /* synthetic */ ine a;

    inh(ine ine) {
        this.a = ine;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(defpackage.iqo r7, defpackage.ayo r8) {
        /*
        r6 = this;
        r3 = 1;
        r2 = 0;
        r0 = r6.a;
        r1 = r8 instanceof defpackage.iqq;
        if (r1 != 0) goto L_0x000c;
    L_0x0008:
        r1 = r8 instanceof defpackage.iqn;
        if (r1 == 0) goto L_0x0090;
    L_0x000c:
        r1 = r7.j();
        if (r1 == 0) goto L_0x008e;
    L_0x0012:
        r0 = r0.h;
        r1 = r7.a();
        r0 = r0.containsKey(r1);
        if (r0 != 0) goto L_0x008e;
    L_0x001e:
        r0 = r3;
    L_0x001f:
        if (r0 == 0) goto L_0x00a0;
    L_0x0021:
        r0 = r7.k();
        if (r0 == 0) goto L_0x0092;
    L_0x0027:
        r0 = r6.a;
        r0 = r0.l;
        r1 = r0.b();
        r1.c(r3);
        r4 = r7.q();
        r1.h(r4);
        r4 = r7.r();
        r1.i(r4);
        r1 = r0;
    L_0x0041:
        r1.a(r7);
        r0 = r6.a;
        r0.a(r1);
        r0 = "vclib";
        r4 = "Participant joined: %s";
        r3 = new java.lang.Object[r3];
        r5 = r1.a();
        r3[r2] = r5;
        r2 = 3;
        defpackage.itx.a(r2, r0, r4, r3);
        r0 = r6.a;
        r2 = r0.f;
        monitor-enter(r2);
        r0 = r6.a;	 Catch:{ all -> 0x009d }
        r0 = r0.h;	 Catch:{ all -> 0x009d }
        r3 = r1.a();	 Catch:{ all -> 0x009d }
        r0.put(r3, r1);	 Catch:{ all -> 0x009d }
        r0 = r6.a;	 Catch:{ all -> 0x009d }
        r0 = r0.i;	 Catch:{ all -> 0x009d }
        r0.add(r1);	 Catch:{ all -> 0x009d }
        r0 = r6.a;	 Catch:{ all -> 0x009d }
        r0.f();	 Catch:{ all -> 0x009d }
        monitor-exit(r2);	 Catch:{ all -> 0x009d }
        r0 = r6.a;
        r0 = r0.e;
        r2 = r0.iterator();
    L_0x007e:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0105;
    L_0x0084:
        r0 = r2.next();
        r0 = (defpackage.ini) r0;
        r0.a(r1);
        goto L_0x007e;
    L_0x008e:
        r0 = r2;
        goto L_0x001f;
    L_0x0090:
        r0 = r2;
        goto L_0x001f;
    L_0x0092:
        r0 = new ind;
        r1 = r6.a;
        r1 = r1.a;
        r0.<init>(r1);
        r1 = r0;
        goto L_0x0041;
    L_0x009d:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x009d }
        throw r0;
    L_0x00a0:
        r0 = r8 instanceof defpackage.iqr;
        if (r0 == 0) goto L_0x00e3;
    L_0x00a4:
        r0 = r6.a;
        r1 = r0.f;
        monitor-enter(r1);
        r0 = r6.a;	 Catch:{ all -> 0x00e0 }
        r0 = r0.h;	 Catch:{ all -> 0x00e0 }
        r2 = r7.a();	 Catch:{ all -> 0x00e0 }
        r0 = r0.remove(r2);	 Catch:{ all -> 0x00e0 }
        r0 = (defpackage.ind) r0;	 Catch:{ all -> 0x00e0 }
        if (r0 != 0) goto L_0x00bb;
    L_0x00b9:
        monitor-exit(r1);	 Catch:{ all -> 0x00e0 }
    L_0x00ba:
        return;
    L_0x00bb:
        r2 = r6.a;	 Catch:{ all -> 0x00e0 }
        r2 = r2.k;	 Catch:{ all -> 0x00e0 }
        r2.add(r0);	 Catch:{ all -> 0x00e0 }
        r2 = r6.a;	 Catch:{ all -> 0x00e0 }
        r2.f();	 Catch:{ all -> 0x00e0 }
        monitor-exit(r1);	 Catch:{ all -> 0x00e0 }
        r1 = r6.a;
        r1 = r1.e;
        r2 = r1.iterator();
    L_0x00d0:
        r1 = r2.hasNext();
        if (r1 == 0) goto L_0x0105;
    L_0x00d6:
        r1 = r2.next();
        r1 = (defpackage.ini) r1;
        r1.b(r0);
        goto L_0x00d0;
    L_0x00e0:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00e0 }
        throw r0;
    L_0x00e3:
        r0 = r8 instanceof defpackage.iqm;
        if (r0 != 0) goto L_0x00ef;
    L_0x00e7:
        r0 = r8 instanceof defpackage.iqt;
        if (r0 != 0) goto L_0x00ef;
    L_0x00eb:
        r0 = r8 instanceof defpackage.iqv;
        if (r0 == 0) goto L_0x010b;
    L_0x00ef:
        r0 = r3;
    L_0x00f0:
        if (r0 == 0) goto L_0x0105;
    L_0x00f2:
        r0 = r6.a;
        r0 = r0.h;
        r1 = r7.a();
        r0 = r0.get(r1);
        r0 = (defpackage.ind) r0;
        if (r0 == 0) goto L_0x0105;
    L_0x0102:
        r0.e();
    L_0x0105:
        r0 = r6.a;
        r0.e();
        goto L_0x00ba;
    L_0x010b:
        r0 = r2;
        goto L_0x00f0;
        */
        throw new UnsupportedOperationException("Method not decompiled: inh.a(iqo, ayo):void");
    }

    public void a(String str, int i) {
        ind ind = this.a.m;
        this.a.m = null;
        for (iqo iqo : this.a.c.a().j()) {
            if (iqo.l().contains(Integer.valueOf(i))) {
                this.a.m = (ind) this.a.h.get(iqo.a());
                break;
            }
        }
        if (this.a.m != ind) {
            this.a.a(ind);
            this.a.a(this.a.m);
            this.a.e();
        }
    }

    public void b(ikd ikd) {
        this.a.c.b(this.a.d);
        synchronized (this.a.f) {
            this.a.p = true;
            this.a.g = false;
        }
    }
}
