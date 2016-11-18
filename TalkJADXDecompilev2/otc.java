package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class otc implements Iterable<oth> {
    private final List<oth> a = new LinkedList();
    private final Map<String, List<oth>> b = new HashMap();

    public void a(oth oth) {
        String toLowerCase = oth.a().toLowerCase(Locale.US);
        List list = (List) this.b.get(toLowerCase);
        if (list == null) {
            list = new LinkedList();
            this.b.put(toLowerCase, list);
        }
        list.add(oth);
        this.a.add(oth);
    }

    public oth a(String str) {
        List list = (List) this.b.get(str.toLowerCase(Locale.US));
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (oth) list.get(0);
    }

    public Iterator<oth> iterator() {
        return Collections.unmodifiableList(this.a).iterator();
    }

    public String toString() {
        return this.a.toString();
    }
}
