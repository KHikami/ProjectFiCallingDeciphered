package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class ikl {
    public ikn f17904a = null;
    public Map<Integer, ikn> f17905b = new HashMap();
    public ikn f17906c = null;
    public Map<Integer, ikn> f17907d = new HashMap();
    public ikn f17908e = null;
    public ikn f17909f = null;

    public void m22183a() {
        this.f17904a = null;
        this.f17905b.clear();
        this.f17906c = null;
        this.f17907d.clear();
        this.f17908e = null;
        this.f17909f = null;
    }

    public boolean m22184b() {
        return this.f17904a == null && this.f17905b.isEmpty() && this.f17906c == null && this.f17907d.isEmpty() && this.f17908e == null && this.f17909f == null;
    }

    public List<ikn> m22185c() {
        List<ikn> arrayList = new ArrayList((this.f17905b.size() + this.f17907d.size()) + 5);
        if (this.f17904a != null) {
            arrayList.add(this.f17904a);
        }
        arrayList.addAll(this.f17905b.values());
        if (this.f17906c != null) {
            arrayList.add(this.f17906c);
        }
        arrayList.addAll(this.f17907d.values());
        if (this.f17908e != null) {
            arrayList.add(this.f17908e);
        }
        if (this.f17909f != null) {
            arrayList.add(this.f17909f);
        }
        Collections.sort(arrayList, new ikm(this));
        return arrayList;
    }
}
