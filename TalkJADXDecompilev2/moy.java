package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public final class moy {
    static final moy a = new moy(Collections.unmodifiableSortedMap(new TreeMap()));
    private static final Comparator<Object> b = new moz();
    private static final SortedSet<Object> c = Collections.unmodifiableSortedSet(new TreeSet());
    private final SortedMap<String, SortedSet<Object>> d;
    private Integer e = null;
    private String f = null;

    private moy(SortedMap<String, SortedSet<Object>> sortedMap) {
        this.d = sortedMap;
    }

    public boolean equals(Object obj) {
        return (obj instanceof moy) && ((moy) obj).d.equals(this.d);
    }

    public int hashCode() {
        if (this.e == null) {
            this.e = Integer.valueOf(this.d.hashCode());
        }
        return this.e.intValue();
    }

    public String toString() {
        if (this.f == null) {
            SortedMap sortedMap = this.d;
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
                            stringBuilder.append(moy.a(sortedSet.iterator().next()));
                        } else {
                            stringBuilder.append('[');
                            for (Object a : sortedSet) {
                                stringBuilder.append(moy.a(a)).append(',');
                            }
                            stringBuilder.setCharAt(stringBuilder.length() - 1, ']');
                        }
                    }
                    stringBuilder.append(", ");
                }
                stringBuilder.setCharAt(stringBuilder.length() - 2, '}');
                stringBuilder.setLength(stringBuilder.length() - 1);
            }
            this.f = stringBuilder.toString();
        }
        return this.f;
    }

    private static Object a(Object obj) {
        if (!(obj instanceof String)) {
            return obj;
        }
        String valueOf = String.valueOf(obj);
        return new StringBuilder(String.valueOf(valueOf).length() + 2).append("\"").append(valueOf).append("\"").toString();
    }
}
