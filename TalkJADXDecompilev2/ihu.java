package defpackage;

import android.util.Log;

public final class ihu<T> implements auh<iht, T>, ayo {
    final auh<atu, T> a;
    final a b;
    private final aue<iht, atu> c = new aue(2000);
    private final a d;

    public /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    ihu(auh<atu, T> auh_atu__T, a aVar, a aVar2) {
        this.a = auh_atu__T;
        this.d = aVar;
        this.b = aVar2;
    }

    private aui<T> a(iht iht, int i, int i2, anz anz) {
        atu atu = (atu) this.c.a(iht, i, i2);
        if (atu == null) {
            atu = a(iht, i, i2);
            this.c.a(iht, i, i2, atu);
        }
        atu atu2 = atu;
        if (Log.isLoggable("FifeModelLoader", 2)) {
            String valueOf = String.valueOf(atu2);
            String valueOf2 = String.valueOf(iht);
            new StringBuilder((String.valueOf(valueOf).length() + 75) + String.valueOf(valueOf2).length()).append("Loading fife model, url: ").append(valueOf).append(", model: ").append(valueOf2).append(", width: ").append(i).append(", height: ").append(i2);
        }
        aui a = this.a.a(atu2, i, i2, anz);
        if (a == null) {
            return null;
        }
        aoe aoe;
        if (this.b == null) {
            aoe = a.c;
        } else {
            aoe = new ihv(this, a.c, iht, i, i2, anz);
        }
        return new aui(new iib(atu2), aoe);
    }

    atu a(iht iht, int i, int i2) {
        String a;
        iic a2 = iht.a();
        if (a2.e()) {
            a = a2.a(iht.b(), i, i2);
        } else if (this.d != null) {
            int o = this.d.o();
            a = a2.a(iht.b(), o, o);
        } else {
            a = a2.a(iht.b(), i, i2);
        }
        return new atu(a, this.b == null ? atv.b : this.b.n());
    }
}
