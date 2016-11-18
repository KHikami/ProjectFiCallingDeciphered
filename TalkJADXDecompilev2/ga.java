package defpackage;

import java.util.ArrayList;

public final class ga extends gl {
    ArrayList<CharSequence> a = new ArrayList();

    public ga(fx fxVar) {
        a(fxVar);
    }

    public ga a(CharSequence charSequence) {
        this.f = fx.d(charSequence);
        this.g = true;
        return this;
    }

    public ga b(CharSequence charSequence) {
        this.a.add(fx.d(charSequence));
        return this;
    }
}
