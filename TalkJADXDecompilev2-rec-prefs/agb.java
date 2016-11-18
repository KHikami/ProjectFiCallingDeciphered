package p000;

public final class agb {
    final ky<aer, agc> f583a = new ky();
    final lc<aer> f584b = new lc();

    public void m1003a() {
        this.f583a.clear();
        this.f584b.m28555b();
    }

    public void m1005a(aer aer, aed aed) {
        agc agc = (agc) this.f583a.get(aer);
        if (agc == null) {
            agc = agc.m1017a();
            this.f583a.put(aer, agc);
        }
        agc.f587b = aed;
        agc.f586a |= 4;
    }

    public boolean m1007a(aer aer) {
        agc agc = (agc) this.f583a.get(aer);
        return (agc == null || (agc.f586a & 1) == 0) ? false : true;
    }

    public aed m1008b(aer aer) {
        return m1001a(aer, 4);
    }

    public aed m1010c(aer aer) {
        return m1001a(aer, 8);
    }

    private aed m1001a(aer aer, int i) {
        aed aed = null;
        int a = this.f583a.m28011a((Object) aer);
        if (a >= 0) {
            agc agc = (agc) this.f583a.m28018c(a);
            if (!(agc == null || (agc.f586a & i) == 0)) {
                agc.f586a &= i ^ -1;
                if (i == 4) {
                    aed = agc.f587b;
                } else if (i == 8) {
                    aed = agc.f588c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((agc.f586a & 12) == 0) {
                    this.f583a.m28019d(a);
                    agc.m1018a(agc);
                }
            }
        }
        return aed;
    }

    public void m1004a(long j, aer aer) {
        this.f584b.m28557b(j, aer);
    }

    public void m1009b(aer aer, aed aed) {
        agc agc = (agc) this.f583a.get(aer);
        if (agc == null) {
            agc = agc.m1017a();
            this.f583a.put(aer, agc);
        }
        agc.f586a |= 2;
        agc.f587b = aed;
    }

    public boolean m1012d(aer aer) {
        agc agc = (agc) this.f583a.get(aer);
        return (agc == null || (agc.f586a & 4) == 0) ? false : true;
    }

    public aer m1002a(long j) {
        return (aer) this.f584b.m28551a(j);
    }

    public void m1011c(aer aer, aed aed) {
        agc agc = (agc) this.f583a.get(aer);
        if (agc == null) {
            agc = agc.m1017a();
            this.f583a.put(aer, agc);
        }
        agc.f588c = aed;
        agc.f586a |= 8;
    }

    void m1013e(aer aer) {
        agc agc = (agc) this.f583a.get(aer);
        if (agc == null) {
            agc = agc.m1017a();
            this.f583a.put(aer, agc);
        }
        r0.f586a |= 1;
    }

    void m1014f(aer aer) {
        agc agc = (agc) this.f583a.get(aer);
        if (agc != null) {
            agc.f586a &= -2;
        }
    }

    public void m1006a(agd agd) {
        for (int size = this.f583a.size() - 1; size >= 0; size--) {
            aer aer = (aer) this.f583a.m28017b(size);
            agc agc = (agc) this.f583a.m28019d(size);
            if ((agc.f586a & 3) == 3) {
                agd.m1019a(aer);
            } else if ((agc.f586a & 1) != 0) {
                if (agc.f587b == null) {
                    agd.m1019a(aer);
                } else {
                    agd.m1020a(aer, agc.f587b, agc.f588c);
                }
            } else if ((agc.f586a & 14) == 14) {
                agd.m1021b(aer, agc.f587b, agc.f588c);
            } else if ((agc.f586a & 12) == 12) {
                agd.m1022c(aer, agc.f587b, agc.f588c);
            } else if ((agc.f586a & 4) != 0) {
                agd.m1020a(aer, agc.f587b, null);
            } else if ((agc.f586a & 8) != 0) {
                agd.m1021b(aer, agc.f587b, agc.f588c);
            } else {
                int i = agc.f586a;
            }
            agc.m1018a(agc);
        }
    }

    void m1015g(aer aer) {
        for (int a = this.f584b.m28550a() - 1; a >= 0; a--) {
            if (aer == this.f584b.m28554b(a)) {
                this.f584b.m28553a(a);
                break;
            }
        }
        agc agc = (agc) this.f583a.remove(aer);
        if (agc != null) {
            agc.m1018a(agc);
        }
    }

    public void m1016h(aer aer) {
        m1014f(aer);
    }
}
