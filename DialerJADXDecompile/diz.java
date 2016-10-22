/* compiled from: PG */
class diz {
    final diq a;
    final djt b;
    int c;
    final dja d;

    diz(diq diq, djt djt) {
        this.c = 65535;
        this.d = new dja(this, 0);
        this.a = (diq) cob.b((Object) diq, (Object) "transport");
        this.b = (djt) cob.b((Object) djt, (Object) "frameWriter");
    }

    final void a(dio dio, int i) {
        if (dio == null) {
            this.d.a(i);
            b();
            return;
        }
        dja a = a(dio);
        a.a(i);
        djc djc = new djc(this);
        a.a(a.b(), djc);
        if (djc.b()) {
            a();
        }
    }

    final void a(boolean z, int i, dlu dlu, boolean z2) {
        cob.b((Object) dlu, (Object) "source");
        dio b = this.a.b(i);
        if (b != null) {
            dja a = a(b);
            int b2 = a.b();
            boolean c = a.c();
            djb djb = new djb(a, dlu, z);
            if (c || b2 < djb.a()) {
                if (!djb.a) {
                    djb.a = true;
                    djb.b.a.offer(djb);
                    a = djb.b;
                    a.c += djb.a();
                }
                if (!c && b2 > 0) {
                    djb.a(b2).b();
                    if (z2) {
                        a();
                        return;
                    }
                    return;
                } else if (z2) {
                    a();
                    return;
                } else {
                    return;
                }
            }
            djb.b();
            if (z2) {
                a();
            }
        }
    }

    final void a() {
        try {
            this.b.b();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    final void b() {
        dio[] d = this.a.d();
        int i = this.d.d;
        int length = d.length;
        while (length > 0 && i > 0) {
            int ceil = (int) Math.ceil((double) (((float) i) / ((float) length)));
            int i2 = 0;
            int i3 = 0;
            while (i2 < length && i > 0) {
                int i4;
                dio dio = d[i2];
                dja a = a(dio);
                int min = Math.min(i, Math.min(a.a(), ceil));
                if (min > 0) {
                    a.e += min;
                    i -= min;
                }
                if (a.a() > 0) {
                    i4 = i3 + 1;
                    d[i3] = dio;
                } else {
                    i4 = i3;
                }
                i2++;
                i3 = i4;
            }
            length = i3;
        }
        djc djc = new djc(this);
        for (dio a2 : this.a.d()) {
            dja a3 = a(a2);
            a3.a(a3.e, djc);
            a3.e = 0;
        }
        if (djc.b()) {
            a();
        }
    }

    private final dja a(dio dio) {
        dja dja = (dja) dio.r;
        if (dja != null) {
            return dja;
        }
        dja = new dja(this, dio);
        dio.r = dja;
        return dja;
    }
}
