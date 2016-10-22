/* compiled from: PG */
public final class aas {
    public final hv a;
    public final hz b;

    public aas() {
        this.a = new hv();
        this.b = new hz();
    }

    public final void a() {
        this.a.clear();
        hz hzVar = this.b;
        int i = hzVar.e;
        Object[] objArr = hzVar.d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        hzVar.e = 0;
        hzVar.b = false;
    }

    public final void a(zk zkVar, yx yxVar) {
        aat aat = (aat) this.a.get(zkVar);
        if (aat == null) {
            aat = aat.a();
            this.a.put(zkVar, aat);
        }
        aat.b = yxVar;
        aat.a |= 4;
    }

    public final boolean a(zk zkVar) {
        aat aat = (aat) this.a.get(zkVar);
        return (aat == null || (aat.a & 1) == 0) ? false : true;
    }

    public final yx a(zk zkVar, int i) {
        yx yxVar = null;
        int a = this.a.a((Object) zkVar);
        if (a >= 0) {
            aat aat = (aat) this.a.c(a);
            if (!(aat == null || (aat.a & i) == 0)) {
                aat.a &= i ^ -1;
                if (i == 4) {
                    yxVar = aat.b;
                } else if (i == 8) {
                    yxVar = aat.c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((aat.a & 12) == 0) {
                    this.a.d(a);
                    aat.a(aat);
                }
            }
        }
        return yxVar;
    }

    public final void a(long j, zk zkVar) {
        this.b.a(j, zkVar);
    }

    public final void b(zk zkVar, yx yxVar) {
        aat aat = (aat) this.a.get(zkVar);
        if (aat == null) {
            aat = aat.a();
            this.a.put(zkVar, aat);
        }
        aat.c = yxVar;
        aat.a |= 8;
    }

    final void b(zk zkVar) {
        aat aat = (aat) this.a.get(zkVar);
        if (aat == null) {
            aat = aat.a();
            this.a.put(zkVar, aat);
        }
        r0.a |= 1;
    }

    final void c(zk zkVar) {
        aat aat = (aat) this.a.get(zkVar);
        if (aat != null) {
            aat.a &= -2;
        }
    }

    public final void a(aau aau) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            zk zkVar = (zk) this.a.b(size);
            aat aat = (aat) this.a.d(size);
            if ((aat.a & 3) == 3) {
                aau.a(zkVar);
            } else if ((aat.a & 1) != 0) {
                if (aat.b == null) {
                    aau.a(zkVar);
                } else {
                    aau.a(zkVar, aat.b, aat.c);
                }
            } else if ((aat.a & 14) == 14) {
                aau.b(zkVar, aat.b, aat.c);
            } else if ((aat.a & 12) == 12) {
                aau.c(zkVar, aat.b, aat.c);
            } else if ((aat.a & 4) != 0) {
                aau.a(zkVar, aat.b, null);
            } else if ((aat.a & 8) != 0) {
                aau.b(zkVar, aat.b, aat.c);
            } else {
                int i = aat.a;
            }
            aat.a(aat);
        }
    }

    final void d(zk zkVar) {
        aat aat;
        for (int a = this.b.a() - 1; a >= 0; a--) {
            if (zkVar == this.b.a(a)) {
                hz hzVar = this.b;
                if (hzVar.d[a] != hz.a) {
                    hzVar.d[a] = hz.a;
                    hzVar.b = true;
                }
                aat = (aat) this.a.remove(zkVar);
                if (aat != null) {
                    aat.a(aat);
                }
            }
        }
        aat = (aat) this.a.remove(zkVar);
        if (aat != null) {
            aat.a(aat);
        }
    }
}
