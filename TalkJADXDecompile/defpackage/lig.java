package defpackage;

import java.util.Collection;
import java.util.logging.Level;

/* renamed from: lig */
final class lig extends mpg {
    private final Collection<mor> a;

    lig(String str, Collection<mor> collection) {
        super(str);
        this.a = collection;
    }

    public boolean a(Level level) {
        for (mor a : this.a) {
            if (a.a(level)) {
                return true;
            }
        }
        return false;
    }

    public void a(a aVar) {
        for (mor mor : this.a) {
            if (mor.a(aVar.w())) {
                mor.a(aVar);
            }
        }
    }
}
