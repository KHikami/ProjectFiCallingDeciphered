package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class jae implements izy {
    private final List<izy> f19524a;
    private final List<izw> f19525b;

    jae(List<izy> list, List<izw> list2) {
        this.f19524a = new ArrayList(list);
        this.f19525b = new ArrayList(list2);
    }

    public izw mo3428a() {
        Collection arrayList = new ArrayList();
        for (izy a : this.f19524a) {
            arrayList.add(a.mo3428a());
        }
        arrayList.addAll(this.f19525b);
        if (arrayList.size() == 1) {
            return (izw) arrayList.get(0);
        }
        return new jag(arrayList);
    }

    public static jaf newBuilder() {
        return new jaf();
    }

    static ook m23632a(ook ook) {
        try {
            return (ook) nzf.m1027a(new ook(), nzf.m1029a((nzf) ook));
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }
}
