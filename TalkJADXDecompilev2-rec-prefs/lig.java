package p000;

import java.util.Collection;
import java.util.logging.Level;

final class lig extends mpg {
    private final Collection<mor> f25036a;

    lig(String str, Collection<mor> collection) {
        super(str);
        this.f25036a = collection;
    }

    public boolean mo3711a(Level level) {
        for (mor a : this.f25036a) {
            if (a.mo3711a(level)) {
                return true;
            }
        }
        return false;
    }

    public void mo3710a(C0000a c0000a) {
        for (mor mor : this.f25036a) {
            if (mor.mo3711a(c0000a.m26w())) {
                mor.mo3710a(c0000a);
            }
        }
    }
}
