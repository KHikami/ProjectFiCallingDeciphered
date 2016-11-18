package p000;

import java.util.ArrayList;
import java.util.List;

public final class jho implements kar, kcq {
    private List<jhq> f20113a = new ArrayList();

    public jho(kbu kbu) {
        kbu.m25514a((kcq) this);
    }

    public jho m24282a(jhq jhq) {
        if (this.f20113a.contains(jhq)) {
            throw new IllegalStateException("BackNavigationHandler already on stack.");
        }
        this.f20113a.add(jhq);
        return this;
    }

    public boolean mo3523a() {
        for (int size = this.f20113a.size() - 1; size >= 0; size--) {
            if (((jhq) this.f20113a.get(size)).m24286a()) {
                return true;
            }
        }
        return false;
    }
}
