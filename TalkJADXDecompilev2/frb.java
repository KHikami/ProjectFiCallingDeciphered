package defpackage;

import java.util.Comparator;

final class frb implements Comparator<fra> {
    frb() {
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return ((fra) obj).d.compareToIgnoreCase(((fra) obj2).d);
    }
}
