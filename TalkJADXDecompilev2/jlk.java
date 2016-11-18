package defpackage;

import java.util.NavigableMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListMap;

final class jlk {
    private final NavigableMap<jla, Integer> a = new ConcurrentSkipListMap(new jll(this));

    jlk() {
    }

    public void a(jla jla) {
        Integer num = (Integer) this.a.get(jla);
        this.a.put(jla, Integer.valueOf(num == null ? 1 : num.intValue() + 1));
    }

    public void b(jla jla) {
        Integer num = (Integer) this.a.get(jla);
        if (num.intValue() == 1) {
            this.a.remove(jla);
        } else {
            this.a.put(jla, Integer.valueOf(num.intValue() - 1));
        }
    }

    public SortedSet<jla> a(jla jla, jla jla2) {
        return this.a.navigableKeySet().subSet(jla, jla2);
    }

    public String toString() {
        Object obj = "SizeTracker(";
        if (!this.a.isEmpty()) {
            String str = obj;
            for (jla jla : this.a.keySet()) {
                str = String.valueOf(str);
                String valueOf = String.valueOf(jla);
                String valueOf2 = String.valueOf(this.a.get(jla));
                str = new StringBuilder(((String.valueOf(str).length() + 5) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append(str).append("{").append(valueOf).append(", ").append(valueOf2).append("} ").toString();
            }
            obj = str.substring(0, str.length() - 1);
        }
        return String.valueOf(obj).concat(")");
    }
}
