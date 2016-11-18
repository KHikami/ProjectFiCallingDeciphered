package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class jag implements izw {
    private final List<izw> a;

    jag(Collection<izw> collection) {
        this.a = new ArrayList(collection);
    }

    public void a(ook ook) {
        if (this.a.size() == 1) {
            ((izw) this.a.get(0)).a(ook);
            return;
        }
        RuntimeException runtimeException = null;
        for (izw a : this.a) {
            try {
                a.a(jae.a(ook));
            } catch (RuntimeException e) {
                RuntimeException e2 = e;
                if (runtimeException != null) {
                    e2 = runtimeException;
                }
                runtimeException = e2;
            }
        }
        if (runtimeException != null) {
            throw runtimeException;
        }
    }
}
