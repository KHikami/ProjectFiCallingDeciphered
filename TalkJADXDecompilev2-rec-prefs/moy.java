package p000;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public final class moy {
    static final moy f28029a = new moy(Collections.unmodifiableSortedMap(new TreeMap()));
    private static final Comparator<Object> f28030b = new moz();
    private static final SortedSet<Object> f28031c = Collections.unmodifiableSortedSet(new TreeSet());
    private final SortedMap<String, SortedSet<Object>> f28032d;
    private Integer f28033e = null;
    private String f28034f = null;

    private moy(SortedMap<String, SortedSet<Object>> sortedMap) {
        this.f28032d = sortedMap;
    }

    public boolean equals(Object obj) {
        return (obj instanceof moy) && ((moy) obj).f28032d.equals(this.f28032d);
    }

    public int hashCode() {
        if (this.f28033e == null) {
            this.f28033e = Integer.valueOf(this.f28032d.hashCode());
        }
        return this.f28033e.intValue();
    }

    public String toString() {
        if (this.f28034f == null) {
            SortedMap sortedMap = this.f28032d;
            StringBuilder stringBuilder = new StringBuilder("{");
            if (sortedMap.isEmpty()) {
                stringBuilder.append("}");
            } else {
                for (Entry entry : sortedMap.entrySet()) {
                    stringBuilder.append((String) entry.getKey());
                    SortedSet<Object> sortedSet = (SortedSet) entry.getValue();
                    if (!sortedSet.isEmpty()) {
                        stringBuilder.append(':');
                        if (sortedSet.size() == 1) {
                            stringBuilder.append(moy.m32643a(sortedSet.iterator().next()));
                        } else {
                            stringBuilder.append('[');
                            for (Object a : sortedSet) {
                                stringBuilder.append(moy.m32643a(a)).append(',');
                            }
                            stringBuilder.setCharAt(stringBuilder.length() - 1, ']');
                        }
                    }
                    stringBuilder.append(", ");
                }
                stringBuilder.setCharAt(stringBuilder.length() - 2, '}');
                stringBuilder.setLength(stringBuilder.length() - 1);
            }
            this.f28034f = stringBuilder.toString();
        }
        return this.f28034f;
    }

    private static Object m32643a(Object obj) {
        if (!(obj instanceof String)) {
            return obj;
        }
        String valueOf = String.valueOf(obj);
        return new StringBuilder(String.valueOf(valueOf).length() + 2).append("\"").append(valueOf).append("\"").toString();
    }
}
