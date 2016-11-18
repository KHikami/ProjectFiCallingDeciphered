package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class oiy<T> implements onc {
    public static final onc a = new oiz();
    private final List<onc<T>> b;
    private final List<onc<Collection<T>>> c;

    public /* synthetic */ Object a() {
        return b();
    }

    public static <T> oja<T> a(int i, int i2) {
        return new oja(i, 0);
    }

    oiy(List<onc<T>> list, List<onc<Collection<T>>> list2) {
        this.b = list;
        this.c = list2;
    }

    private Set<T> b() {
        int i;
        int i2 = 0;
        int size = this.b.size();
        List arrayList = new ArrayList(this.c.size());
        int size2 = this.c.size();
        int i3 = size;
        for (i = 0; i < size2; i++) {
            Collection collection = (Collection) ((onc) this.c.get(i)).a();
            i3 += collection.size();
            arrayList.add(collection);
        }
        Set I = gwb.I(i3);
        size2 = this.b.size();
        for (i = 0; i < size2; i++) {
            I.add(bn.a(((onc) this.b.get(i)).a()));
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
