package p000;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class aqd extends WeakReference<aqk<?>> {
    final anv f2105a;

    public aqd(anv anv, aqk<?> aqk_, ReferenceQueue<? super aqk<?>> referenceQueue) {
        super(aqk_, referenceQueue);
        this.f2105a = anv;
    }
}
