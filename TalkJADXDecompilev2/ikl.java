package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class ikl {
    public ikn a = null;
    public Map<Integer, ikn> b = new HashMap();
    public ikn c = null;
    public Map<Integer, ikn> d = new HashMap();
    public ikn e = null;
    public ikn f = null;

    public void a() {
        this.a = null;
        this.b.clear();
        this.c = null;
        this.d.clear();
        this.e = null;
        this.f = null;
    }

    public boolean b() {
        return this.a == null && this.b.isEmpty() && this.c == null && this.d.isEmpty() && this.e == null && this.f == null;
    }

    public List<ikn> c() {
        List<ikn> arrayList = new ArrayList((this.b.size() + this.d.size()) + 5);
        if (this.a != null) {
            arrayList.add(this.a);
        }
        arrayList.addAll(this.b.values());
        if (this.c != null) {
            arrayList.add(this.c);
        }
        arrayList.addAll(this.d.values());
        if (this.e != null) {
            arrayList.add(this.e);
        }
        if (this.f != null) {
            arrayList.add(this.f);
        }
        Collections.sort(arrayList, new ikm(this));
        return arrayList;
    }
}
