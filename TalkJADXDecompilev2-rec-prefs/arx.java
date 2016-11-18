package p000;

import java.util.HashMap;
import java.util.Map;

final class arx {
    private final Map<anv, ary> f2246a = new HashMap();
    private final arz f2247b = new arz();

    arx() {
    }

    void m3888a(anv anv) {
        ary ary;
        synchronized (this) {
            ary = (ary) this.f2246a.get(anv);
            if (ary == null) {
                ary = this.f2247b.m3890a();
                this.f2246a.put(anv, ary);
            }
            ary.f2249b++;
        }
        ary.f2248a.lock();
    }

    void m3889b(anv anv) {
        ary ary;
        synchronized (this) {
            ary = (ary) gwb.m1404I((ary) this.f2246a.get(anv));
            if (ary.f2249b <= 0) {
                String valueOf = String.valueOf(anv);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 77).append("Cannot release a lock that is not held, key: ").append(valueOf).append(", interestedThreads: ").append(ary.f2249b).toString());
            }
            ary.f2249b--;
            if (ary.f2249b == 0) {
                ary ary2 = (ary) this.f2246a.remove(anv);
                if (ary2.equals(ary)) {
                    this.f2247b.m3891a(ary2);
                } else {
                    String valueOf2 = String.valueOf(ary);
                    String valueOf3 = String.valueOf(ary2);
                    String valueOf4 = String.valueOf(anv);
                    throw new IllegalStateException(new StringBuilder(((String.valueOf(valueOf2).length() + 75) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()).append("Removed the wrong lock, expected to remove: ").append(valueOf2).append(", but actually removed: ").append(valueOf3).append(", key: ").append(valueOf4).toString());
                }
            }
        }
        ary.f2248a.unlock();
    }
}
