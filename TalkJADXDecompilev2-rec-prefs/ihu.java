package p000;

import android.util.Log;

public final class ihu<T> implements auh<iht, T>, ayo {
    final auh<atu, T> f17698a;
    final C0000a f17699b;
    private final aue<iht, atu> f17700c = new aue(2000);
    private final C0000a f17701d;

    public /* bridge */ /* synthetic */ boolean mo378a(Object obj) {
        return true;
    }

    ihu(auh<atu, T> auh_atu__T, C0000a c0000a, C0000a c0000a2) {
        this.f17698a = auh_atu__T;
        this.f17701d = c0000a;
        this.f17699b = c0000a2;
    }

    private aui<T> m21833a(iht iht, int i, int i2, anz anz) {
        atu atu = (atu) this.f17700c.m4037a(iht, i, i2);
        if (atu == null) {
            atu = m21834a(iht, i, i2);
            this.f17700c.m4038a(iht, i, i2, atu);
        }
        atu atu2 = atu;
        if (Log.isLoggable("FifeModelLoader", 2)) {
            String valueOf = String.valueOf(atu2);
            String valueOf2 = String.valueOf(iht);
            new StringBuilder((String.valueOf(valueOf).length() + 75) + String.valueOf(valueOf2).length()).append("Loading fife model, url: ").append(valueOf).append(", model: ").append(valueOf2).append(", width: ").append(i).append(", height: ").append(i2);
        }
        aui a = this.f17698a.mo377a(atu2, i, i2, anz);
        if (a == null) {
            return null;
        }
        aoe aoe;
        if (this.f17699b == null) {
            aoe = a.f2358c;
        } else {
            aoe = new ihv(this, a.f2358c, iht, i, i2, anz);
        }
        return new aui(new iib(atu2), aoe);
    }

    atu m21834a(iht iht, int i, int i2) {
        String a;
        iic a2 = iht.m21831a();
        if (a2.m21859e()) {
            a = a2.m21855a(iht.m21832b(), i, i2);
        } else if (this.f17701d != null) {
            int o = this.f17701d.m18o();
            a = a2.m21855a(iht.m21832b(), o, o);
        } else {
            a = a2.m21855a(iht.m21832b(), i, i2);
        }
        return new atu(a, this.f17699b == null ? atv.f2335b : this.f17699b.m17n());
    }
}
