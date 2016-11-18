package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class oiy<T> implements onc {
    public static final onc f33054a = new oiz();
    private final List<onc<T>> f33055b;
    private final List<onc<Collection<T>>> f33056c;

    public /* synthetic */ Object m38528a() {
        return m38527b();
    }

    public static <T> oja<T> m38526a(int i, int i2) {
        return new oja(i, 0);
    }

    oiy(List<onc<T>> list, List<onc<Collection<T>>> list2) {
        this.f33055b = list;
        this.f33056c = list2;
    }

    private Set<T> m38527b() {
        int i;
        int i2 = 0;
        int size = this.f33055b.size();
        List arrayList = new ArrayList(this.f33056c.size());
        int size2 = this.f33056c.size();
        int i3 = size;
        for (i = 0; i < size2; i++) {
            Collection collection = (Collection) ((onc) this.f33056c.get(i)).a();
            i3 += collection.size();
            arrayList.add(collection);
        }
        Set I = gwb.I(i3);
        size2 = this.f33055b.size();
        for (i = 0; i < size2; i++) {
            I.add(bn.a(((onc) this.f33055b.get(i)).a()));
        }
        i = arrayList.size();
        while (i2 < i) {
            for (Object a : (Collection) arrayList.get(i2)) {
                I.add(bn.a(a));
            }
            i2++;
        }
        return Collections.unmodifiableSet(I);
    }
}
