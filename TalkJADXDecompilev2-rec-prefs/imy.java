package p000;

public final class imy {
    final ite f18091a;
    boolean f18092b;
    int f18093c = 0;
    private boolean f18094d = false;
    private final inb f18095e = new inb(this);

    public imy(ite ite) {
        this.f18091a = ite;
    }

    public void m22321a(boolean z) {
        this.f18094d = z;
        itx.m23277a(3, "vclib", "Set media source screencast to " + z);
        m22322b();
    }

    public void m22320a() {
        ((ijf) this.f18091a.mo3229t().m21926a(ijf.class)).mo3363a(this.f18095e);
    }

    private static boolean m22319a(float f, float f2) {
        return ((double) Math.abs(f - f2)) <= 0.001d;
    }

    void m22322b() {
        if (!this.f18092b) {
            if (this.f18091a.mo3221l()) {
                ijf ijf = (ijf) this.f18091a.mo3229t().m21926a(ijf.class);
                switch (this.f18093c) {
                    case 0:
                        this.f18093c = 1;
                        ijf.mo3363a(this.f18095e);
                        return;
                    case 1:
                        return;
                    default:
                        boolean z;
                        nzf mah;
                        mab mab;
                        mag mag;
                        Float valueOf;
                        mag[] magArr;
                        lym a = ((ijd) this.f18091a.mo3229t().m21926a(ijd.class)).mo3376a();
                        nzf nzf = null;
                        for (nzf nzf2 : ijf.mo3365b().values()) {
                            if (nzf2.f27084c.equals("2") && nzf2.f27083b.equals(a.f26907b)) {
                                nzf = nzf2;
                                if (nzf != null) {
                                    itx.m23277a(6, "vclib", "Media source collection is missing a local video source. Skipping source updates.");
                                    return;
                                }
                                if (nzf.f27088g != null) {
                                    z = this.f18094d;
                                } else {
                                    if (this.f18094d) {
                                        if (nzf.f27088g.f27096a.intValue() != 1 || (nzf.f27088g.f27098c != null && nzf.f27088g.f27098c.length == 1 && (nzf.f27088g.f27098c[0].f27102c.floatValue() > 0.0f || nzf.f27088g.f27098c[0].f27103d.floatValue() > 0.0f))) {
                                            z = true;
                                        }
                                    } else if (!(nzf.f27088g.f27096a.intValue() == 2 && nzf.f27088g.f27098c != null && nzf.f27088g.f27098c.length == 1 && imy.m22319a(nzf.f27088g.f27098c[0].f27100a.floatValue(), 0.0f) && imy.m22319a(nzf.f27088g.f27098c[0].f27101b.floatValue(), 0.0f) && imy.m22319a(nzf.f27088g.f27098c[0].f27102c.floatValue(), 1.0f) && imy.m22319a(nzf.f27088g.f27098c[0].f27103d.floatValue(), 1.0f))) {
                                        z = true;
                                    }
                                    z = false;
                                }
                                if (z) {
                                    mah = new mah();
                                    try {
                                        mab = (mab) nzf.m1027a(new mab(), nzf.m1029a(nzf));
                                        mab.f27088g = new maf();
                                        if (this.f18094d) {
                                            mab.f27088g.f27096a = Integer.valueOf(1);
                                        } else {
                                            mag = new mag();
                                            valueOf = Float.valueOf(0.0f);
                                            mag.f27101b = valueOf;
                                            mag.f27100a = valueOf;
                                            valueOf = Float.valueOf(1.0f);
                                            mag.f27103d = valueOf;
                                            mag.f27102c = valueOf;
                                            magArr = new mag[]{mag};
                                            mab.f27088g.f27098c = magArr;
                                            mab.f27088g.f27096a = Integer.valueOf(2);
                                        }
                                        mah.f27104a = mab;
                                        ijf.mo3364a(mah, new ina(this));
                                        return;
                                    } catch (nzd e) {
                                        iil.m21870a(e.toString());
                                        return;
                                    }
                                }
                                return;
                            }
                        }
                        if (nzf != null) {
                            if (nzf.f27088g != null) {
                                if (this.f18094d) {
                                    z = true;
                                } else {
                                    z = true;
                                }
                                z = false;
                            } else {
                                z = this.f18094d;
                            }
                            if (z) {
                                mah = new mah();
                                mab = (mab) nzf.m1027a(new mab(), nzf.m1029a(nzf));
                                mab.f27088g = new maf();
                                if (this.f18094d) {
                                    mab.f27088g.f27096a = Integer.valueOf(1);
                                } else {
                                    mag = new mag();
                                    valueOf = Float.valueOf(0.0f);
                                    mag.f27101b = valueOf;
                                    mag.f27100a = valueOf;
                                    valueOf = Float.valueOf(1.0f);
                                    mag.f27103d = valueOf;
                                    mag.f27102c = valueOf;
                                    magArr = new mag[]{mag};
                                    mab.f27088g.f27098c = magArr;
                                    mab.f27088g.f27096a = Integer.valueOf(2);
                                }
                                mah.f27104a = mab;
                                ijf.mo3364a(mah, new ina(this));
                                return;
                            }
                            return;
                        }
                        itx.m23277a(6, "vclib", "Media source collection is missing a local video source. Skipping source updates.");
                        return;
                }
            }
            this.f18092b = true;
            this.f18091a.mo3217a(new imz(this));
        }
    }
}
