package defpackage;

import java.util.HashMap;
import java.util.Map;

final class arx {
    private final Map<anv, ary> a = new HashMap();
    private final arz b = new arz();

    arx() {
    }

    void a(anv anv) {
        ary ary;
        synchronized (this) {
            ary = (ary) this.a.get(anv);
            if (ary == null) {
                ary = this.b.a();
                this.a.put(anv, ary);
            }
            ary.b++;
        }
        ary.a.lock();
    }

    void b(anv anv) {
        ary ary;
        synchronized (this) {
            ary = (ary) gwb.I((ary) this.a.get(anv));
            if (ary.b <= 0) {
                String valueOf = String.valueOf(anv);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 77).append("Cannot release a lock that is not held, key: ").append(valueOf).append(", interestedThreads: ").append(ary.b).toString());
            }
            ary.b--;
            if (ary.b == 0) {
                ary ary2 = (ary) this.a.remove(anv);
                if (ary2.equals(ary)) {
                    this.b.a(ary2);
                } else {
                    String valueOf2 = String.valueOf(ary);
                    String valueOf3 = String.valueOf(ary2);
                    String valueOf4 = String.valueOf(anv);
                    throw new IllegalStateException(new StringBuilder(((String.valueOf(valueOf2).length() + 75) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()).append("Removed the wrong lock, expected to remove: ").append(valueOf2).append(", but actually removed: ").append(valueOf3).append(", key: ").append(valueOf4).toString());
                }
            }
        }
        ary.a.unlock();
    }
}
