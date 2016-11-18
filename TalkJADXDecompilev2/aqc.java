package defpackage;

import android.os.MessageQueue.IdleHandler;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;

final class aqc implements IdleHandler {
    private final Map<anv, WeakReference<aqk<?>>> a;
    private final ReferenceQueue<aqk<?>> b;

    public aqc(Map<anv, WeakReference<aqk<?>>> map, ReferenceQueue<aqk<?>> referenceQueue) {
        this.a = map;
        this.b = referenceQueue;
    }

    public boolean queueIdle() {
        aqd aqd = (aqd) this.b.poll();
        if (aqd != null) {
            this.a.remove(aqd.a);
        }
        return true;
    }
}
