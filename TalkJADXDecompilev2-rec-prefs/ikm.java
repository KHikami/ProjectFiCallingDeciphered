package p000;

import java.util.Comparator;

final class ikm implements Comparator<ikn> {
    final /* synthetic */ ikl f17910a;

    ikm(ikl ikl) {
        this.f17910a = ikl;
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return Long.valueOf(((ikn) obj).f17911a).compareTo(Long.valueOf(((ikn) obj2).f17911a));
    }
}
