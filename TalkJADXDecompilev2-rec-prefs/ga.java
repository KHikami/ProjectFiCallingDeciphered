package p000;

import java.util.ArrayList;

public final class ga extends gl {
    ArrayList<CharSequence> f14519a = new ArrayList();

    public ga(fx fxVar) {
        m16301a(fxVar);
    }

    public ga m16797a(CharSequence charSequence) {
        this.f = fx.m16415d(charSequence);
        this.g = true;
        return this;
    }

    public ga m16798b(CharSequence charSequence) {
        this.f14519a.add(fx.m16415d(charSequence));
        return this;
    }
}
