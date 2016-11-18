package p000;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class bwn {
    public final List<btf> f4658a = new ArrayList();
    public final List<Pair<btf, btf>> f4659b = new ArrayList();
    public final List<btf> f4660c = new ArrayList();

    bwn() {
    }

    public String toString() {
        String str = "Deletes:%s, Moves:%s, Updates:%s";
        Object[] objArr = new Object[3];
        objArr[0] = bwn.m6829a(this.f4658a);
        Collection<Pair> collection = this.f4659b;
        List arrayList = new ArrayList();
        for (Pair pair : collection) {
            arrayList.add(String.valueOf(((btf) pair.second).f4388a));
        }
        objArr[1] = arrayList;
        objArr[2] = bwn.m6829a(this.f4660c);
        return String.format(str, objArr);
    }

    private static Collection<String> m6829a(Collection<btf> collection) {
        Collection arrayList = new ArrayList();
        for (btf btf : collection) {
            arrayList.add(String.valueOf(btf.f4388a));
        }
        return arrayList;
    }
}
