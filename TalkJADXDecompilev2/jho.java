package defpackage;

import java.util.ArrayList;
import java.util.List;

public final class jho implements kar, kcq {
    private List<jhq> a = new ArrayList();

    public jho(kbu kbu) {
        kbu.a((kcq) this);
    }

    public jho a(jhq jhq) {
        if (this.a.contains(jhq)) {
            throw new IllegalStateException("BackNavigationHandler already on stack.");
        }
        this.a.add(jhq);
        return this;
    }

    public boolean a() {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            if (((jhq) this.a.get(size)).a()) {
                return true;
            }
        }
        return false;
    }
}
