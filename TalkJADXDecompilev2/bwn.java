package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class bwn {
    public final List<btf> a = new ArrayList();
    public final List<Pair<btf, btf>> b = new ArrayList();
    public final List<btf> c = new ArrayList();

    bwn() {
    }

    public String toString() {
        String str = "Deletes:%s, Moves:%s, Updates:%s";
        Object[] objArr = new Object[3];
        objArr[0] = bwn.a(this.a);
        Collection<Pair> collection = this.b;
        List arrayList = new ArrayList();
        for (Pair pair : collection) {
            arrayList.add(String.valueOf(((btf) pair.second).a));
        }
        objArr[1] = arrayList;
        objArr[2] = bwn.a(this.c);
        return String.format(str, objArr);
    }

    private static Collection<String> a(Collection<btf> collection) {
        Collection arrayList = new ArrayList();
        for (btf btf : collection) {
            arrayList.add(String.valueOf(btf.a));
        }
        return arrayList;
    }
}
