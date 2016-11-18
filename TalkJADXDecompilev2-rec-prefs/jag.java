package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class jag implements izw {
    private final List<izw> f19528a;

    jag(Collection<izw> collection) {
        this.f19528a = new ArrayList(collection);
    }

    public void mo3417a(ook ook) {
        if (this.f19528a.size() == 1) {
            ((izw) this.f19528a.get(0)).mo3417a(ook);
            return;
        }
        RuntimeException runtimeException = null;
        for (izw a : this.f19528a) {
            try {
                a.mo3417a(jae.m23632a(ook));
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
