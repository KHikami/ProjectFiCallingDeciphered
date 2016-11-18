package p000;

import java.util.NavigableMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListMap;

final class jlk {
    private final NavigableMap<jla, Integer> f20418a = new ConcurrentSkipListMap(new jll(this));

    jlk() {
    }

    public void m24654a(jla jla) {
        Integer num = (Integer) this.f20418a.get(jla);
        this.f20418a.put(jla, Integer.valueOf(num == null ? 1 : num.intValue() + 1));
    }

    public void m24655b(jla jla) {
        Integer num = (Integer) this.f20418a.get(jla);
        if (num.intValue() == 1) {
            this.f20418a.remove(jla);
        } else {
            this.f20418a.put(jla, Integer.valueOf(num.intValue() - 1));
        }
    }

    public SortedSet<jla> m24653a(jla jla, jla jla2) {
        return this.f20418a.navigableKeySet().subSet(jla, jla2);
    }

    public String toString() {
        Object obj = "SizeTracker(";
        if (!this.f20418a.isEmpty()) {
            String str = obj;
            for (jla jla : this.f20418a.keySet()) {
                str = String.valueOf(str);
                String valueOf = String.valueOf(jla);
                String valueOf2 = String.valueOf(this.f20418a.get(jla));
                str = new StringBuilder(((String.valueOf(str).length() + 5) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append(str).append("{").append(valueOf).append(", ").append(valueOf2).append("} ").toString();
            }
            obj = str.substring(0, str.length() - 1);
        }
        return String.valueOf(obj).concat(")");
    }
}
