package p000;

import android.os.MessageQueue.IdleHandler;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;

final class aqc implements IdleHandler {
    private final Map<anv, WeakReference<aqk<?>>> f2103a;
    private final ReferenceQueue<aqk<?>> f2104b;

    public aqc(Map<anv, WeakReference<aqk<?>>> map, ReferenceQueue<aqk<?>> referenceQueue) {
        this.f2103a = map;
        this.f2104b = referenceQueue;
    }

    public boolean queueIdle() {
        aqd aqd = (aqd) this.f2104b.poll();
        if (aqd != null) {
            this.f2103a.remove(aqd.f2105a);
        }
        return true;
    }
}
