package defpackage;

public final class agb {
    final ky<aer, agc> a = new ky();
    final lc<aer> b = new lc();

    public void a() {
        this.a.clear();
        this.b.b();
    }

    public void a(aer aer, aed aed) {
        agc agc = (agc) this.a.get(aer);
        if (agc == null) {
            agc = agc.a();
            this.a.put(aer, agc);
        }
        agc.b = aed;
        agc.a |= 4;
    }

    public boolean a(aer aer) {
        agc agc = (agc) this.a.get(aer);
        return (agc == null || (agc.a & 1) == 0) ? false : true;
    }

    public aed b(aer aer) {
        return a(aer, 4);
    }

    public aed c(aer aer) {
        return a(aer, 8);
    }

    private aed a(aer aer, int i) {
        aed aed = null;
        int a = this.a.a((Object) aer);
        if (a >= 0) {
            agc agc = (agc) this.a.c(a);
            if (!(agc == null || (agc.a & i) == 0)) {
                agc.a &= i ^ -1;
                if (i == 4) {
                    aed = agc.b;
                } else if (i == 8) {
                    aed = agc.c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((agc.a & 12) == 0) {
                    this.a.d(a);
                    agc.a(agc);
                }
            }
        }
        return aed;
    }

    public void a(long j, aer aer) {
        this.b.b(j, aer);
    }

    public void b(aer aer, aed aed) {
        agc agc = (agc) this.a.get(aer);
        if (agc == null) {
            agc = agc.a();
            this.a.put(aer, agc);
        }
        agc.a |= 2;
        agc.b = aed;
    }

    public boolean d(aer aer) {
        agc agc = (agc) this.a.get(aer);
        return (agc == null || (agc.a & 4) == 0) ? false : true;
    }

    public aer a(long j) {
        return (aer) this.b.a(j);
    }

    public void c(aer aer, aed aed) {
        agc agc = (agc) this.a.get(aer);
        if (agc == null) {
            agc = agc.a();
            this.a.put(aer, agc);
        }
        agc.c = aed;
        agc.a |= 8;
    }

    void e(aer aer) {
        agc agc = (agc) this.a.get(aer);
        if (agc == null) {
            agc = agc.a();
            this.a.put(aer, agc);
        }
        r0.a |= 1;
    }

    void f(aer aer) {
        agc agc = (agc) this.a.get(aer);
        if (agc != null) {
            agc.a &= -2;
        }
    }

    public void a(agd agd) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            aer aer = (aer) this.a.b(size);
            agc agc = (agc) this.a.d(size);
            if ((agc.a & 3) == 3) {
                agd.a(aer);
            } else if ((agc.a & 1) != 0) {
                if (agc.b == null) {
                    agd.a(aer);
                } else {
                    agd.a(aer, agc.b, agc.c);
                }
            } else if ((agc.a & 14) == 14) {
                agd.b(aer, agc.b, agc.c);
            } else if ((agc.a & 12) == 12) {
                agd.c(aer, agc.b, agc.c);
            } else if ((agc.a & 4) != 0) {
                agd.a(aer, agc.b, null);
            } else if ((agc.a & 8) != 0) {
                agd.b(aer, agc.b, agc.c);
            } else {
                int i = agc.a;
            }
            agc.a(agc);
        }
    }

    void g(aer aer) {
        for (int a = this.b.a() - 1; a >= 0; a--) {
            if (aer == this.b.b(a)) {
                this.b.a(a);
                break;
            }
        }
        agc agc = (agc) this.a.remove(aer);
        if (agc != null) {
            agc.a(agc);
        }
    }

    public void h(aer aer) {
        f(aer);
    }
}
