package p000;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class okm {
    private final List<SocketAddress> f33137a;

    public okm(List<SocketAddress> list) {
        bm.a(!list.isEmpty(), "addrs is empty");
        this.f33137a = Collections.unmodifiableList(new ArrayList(list));
    }

    public List<SocketAddress> m38638a() {
        return this.f33137a;
    }

    public String toString() {
        return this.f33137a.toString();
    }

    public int hashCode() {
        return this.f33137a.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof okm) {
            return this.f33137a.equals(((okm) obj).f33137a);
        }
        return false;
    }
}
