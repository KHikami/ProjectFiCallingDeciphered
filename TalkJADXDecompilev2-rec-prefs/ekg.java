package p000;

public final class ekg {
    lhu f11747a;
    iew f11748b;
    erj f11749c;

    public epf m14093a() {
        if (this.f11747a == null) {
            throw new IllegalStateException(String.valueOf(lhu.class.getCanonicalName()).concat(" must be set"));
        }
        if (this.f11748b == null) {
            this.f11748b = new iew();
        }
        if (this.f11749c == null) {
            this.f11749c = new erj();
        }
        return new ekd(this);
    }

    public ekg m14092a(lhu lhu) {
        this.f11747a = (lhu) bn.m6214a(lhu);
        return this;
    }
}
