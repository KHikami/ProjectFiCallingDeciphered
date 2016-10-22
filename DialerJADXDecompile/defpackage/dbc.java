package defpackage;

/* compiled from: PG */
/* renamed from: dbc */
final class dbc extends czm {
    final /* synthetic */ dbb b;

    dbc(dbb dbb) {
        this.b = dbb;
    }

    public final czm a() {
        return this.b;
    }

    public final Object get(Object obj) {
        if (obj == null || this.b.c == null) {
            return null;
        }
        for (dac dac = this.b.c[buf.C(obj.hashCode()) & this.b.e]; dac != null; dac = dac.b()) {
            if (obj.equals(dac.getValue())) {
                return dac.getKey();
            }
        }
        return null;
    }

    final dao d() {
        return new dbd(this);
    }

    final Object writeReplace() {
        return new dbf(this.b);
    }

    public final int size() {
        return this.b.size();
    }
}
