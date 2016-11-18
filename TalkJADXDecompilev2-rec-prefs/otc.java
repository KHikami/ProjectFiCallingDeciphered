package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class otc implements Iterable<oth> {
    private final List<oth> f34230a = new LinkedList();
    private final Map<String, List<oth>> f34231b = new HashMap();

    public void m39669a(oth oth) {
        String toLowerCase = oth.m39682a().toLowerCase(Locale.US);
        List list = (List) this.f34231b.get(toLowerCase);
        if (list == null) {
            list = new LinkedList();
            this.f34231b.put(toLowerCase, list);
        }
        list.add(oth);
        this.f34230a.add(oth);
    }

    public oth m39668a(String str) {
        List list = (List) this.f34231b.get(str.toLowerCase(Locale.US));
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (oth) list.get(0);
    }

    public Iterator<oth> iterator() {
        return Collections.unmodifiableList(this.f34230a).iterator();
    }

    public String toString() {
        return this.f34230a.toString();
    }
}
