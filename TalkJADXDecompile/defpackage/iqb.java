package defpackage;

/* renamed from: iqb */
public final class iqb extends iqh<lym, lyp, lyq, lyr, lys, lyt, lyu> implements ijd {
    private volatile String f;

    public iqb(ipu ipu, ijh ijh) {
        super(ipu, a, new iqd(ijh), new iqc());
    }

    public void a(String str) {
        this.f = str;
    }

    public lym a() {
        return this.f == null ? null : (lym) b().get(this.f);
    }
}
