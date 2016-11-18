package defpackage;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class okm {
    private final List<SocketAddress> a;

    public okm(List<SocketAddress> list) {
        bm.a(!list.isEmpty(), "addrs is empty");
        this.a = Collections.unmodifiableList(new ArrayList(list));
    }

    public List<SocketAddress> a() {
        return this.a;
    }

    public String toString() {
        return this.a.toString();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof okm) {
            return this.a.equals(((okm) obj).a);
        }
        return false;
    }
}
