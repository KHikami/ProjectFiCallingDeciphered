package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class jae implements izy {
    private final List<izy> a;
    private final List<izw> b;

    jae(List<izy> list, List<izw> list2) {
        this.a = new ArrayList(list);
        this.b = new ArrayList(list2);
    }

    public izw a() {
        Collection arrayList = new ArrayList();
        for (izy a : this.a) {
            arrayList.add(a.a());
        }
        arrayList.addAll(this.b);
        if (arrayList.size() == 1) {
            return (izw) arrayList.get(0);
        }
        return new jag(arrayList);
    }

    public static jaf newBuilder() {
        return new jaf();
    }

    static ook a(ook ook) {
        try {
            return (ook) nzf.a(new ook(), nzf.a((nzf) ook));
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }
}
