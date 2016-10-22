public final class imy {
    final ite a;
    boolean b;
    int c;
    private boolean d;
    private final inb e;

    public imy(ite ite) {
        this.d = false;
        this.c = 0;
        this.e = new inb(this);
        this.a = ite;
    }

    public void a(boolean z) {
        this.d = z;
        itx.a(3, "vclib", "Set media source screencast to " + z);
        b();
    }

    public void a() {
        ((ijf) this.a.t().a(ijf.class)).a(this.e);
    }

    private static boolean a(float f, float f2) {
        return ((double) Math.abs(f - f2)) <= 0.001d;
    }

    void b() {
        if (!this.b) {
            if (this.a.l()) {
                ijf ijf = (ijf) this.a.t().a(ijf.class);
                switch (this.c) {
                    case wi.w /*0*/:
                        this.c = 1;
                        ijf.a(this.e);
                        return;
                    case wi.j /*1*/:
                        return;
                    default:
                        boolean z;
                        nzf mah;
                        mab mab;
                        mag mag;
                        Float valueOf;
                        mag[] magArr;
                        lym a = ((ijd) this.a.t().a(ijd.class)).a();
                        nzf nzf = null;
                        for (nzf nzf2 : ijf.b().values()) {
                            if (nzf2.c.equals("2") && nzf2.b.equals(a.b)) {
                                nzf = nzf2;
                                if (nzf != null) {
                                    itx.a(6, "vclib", "Media source collection is missing a local video source. Skipping source updates.");
                                    return;
                                }
                                if (nzf.g != null) {
                                    z = this.d;
                                } else {
                                    if (this.d) {
                                        if (nzf.g.a.intValue() != 1 || (nzf.g.c != null && nzf.g.c.length == 1 && (nzf.g.c[0].c.floatValue() > 0.0f || nzf.g.c[0].d.floatValue() > 0.0f))) {
                                            z = true;
                                        }
                                    } else if (!(nzf.g.a.intValue() == 2 && nzf.g.c != null && nzf.g.c.length == 1 && a(nzf.g.c[0].a.floatValue(), 0.0f) && a(nzf.g.c[0].b.floatValue(), 0.0f) && a(nzf.g.c[0].c.floatValue(), 1.0f) && a(nzf.g.c[0].d.floatValue(), 1.0f))) {
                                        z = true;
                                    }
                                    z = false;
                                }
                                if (z) {
                                    mah = new mah();
                                    try {
                                        mab = (mab) nzf.a(new mab(), nzf.a(nzf));
                                        mab.g = new maf();
                                        if (this.d) {
                                            mab.g.a = Integer.valueOf(1);
                                        } else {
                                            mag = new mag();
                                            valueOf = Float.valueOf(0.0f);
                                            mag.b = valueOf;
                                            mag.a = valueOf;
                                            valueOf = Float.valueOf(1.0f);
                                            mag.d = valueOf;
                                            mag.c = valueOf;
                                            magArr = new mag[]{mag};
                                            mab.g.c = magArr;
                                            mab.g.a = Integer.valueOf(2);
                                        }
                                        mah.a = mab;
                                        ijf.a(mah, new ina(this));
                                        return;
                                    } catch (nzd e) {
                                        iil.a(e.toString());
                                        return;
                                    }
                                }
                                return;
                            }
                        }
                        if (nzf != null) {
                            if (nzf.g != null) {
                                if (this.d) {
                                    z = true;
                                } else {
                                    z = true;
                                }
                                z = false;
                            } else {
                                z = this.d;
                            }
                            if (z) {
                                mah = new mah();
                                mab = (mab) nzf.a(new mab(), nzf.a(nzf));
                                mab.g = new maf();
                                if (this.d) {
                                    mab.g.a = Integer.valueOf(1);
                                } else {
                                    mag = new mag();
                                    valueOf = Float.valueOf(0.0f);
                                    mag.b = valueOf;
                                    mag.a = valueOf;
                                    valueOf = Float.valueOf(1.0f);
                                    mag.d = valueOf;
                                    mag.c = valueOf;
                                    magArr = new mag[]{mag};
                                    mab.g.c = magArr;
                                    mab.g.a = Integer.valueOf(2);
                                }
                                mah.a = mab;
                                ijf.a(mah, new ina(this));
                                return;
                            }
                            return;
                        }
                        itx.a(6, "vclib", "Media source collection is missing a local video source. Skipping source updates.");
                        return;
                }
            }
            this.b = true;
            this.a.a(new imz(this));
        }
    }
}
