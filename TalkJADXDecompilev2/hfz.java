package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class hfz {
    public final ll<ArrayList<T>> a = new lm(10);
    public final lo<T, ArrayList<T>> b = new lo();
    public final ArrayList<T> c = new ArrayList();
    public final HashSet<T> d = new HashSet();
    private final Object e;

    public boolean a() {
        return this.e instanceof dw;
    }

    public Activity b() {
        return (Activity) this.e;
    }

    public dw c() {
        return (dw) this.e;
    }

    public void a(T t) {
        if (!this.b.containsKey(t)) {
            this.b.put(t, null);
        }
    }

    public boolean b(T t) {
        return this.b.containsKey(t);
    }

    public void a(T t, T t2) {
        if (this.b.containsKey(t) && this.b.containsKey(t2)) {
            ArrayList arrayList = (ArrayList) this.b.get(t);
            if (arrayList == null) {
                arrayList = f();
                this.b.put(t, arrayList);
            }
            arrayList.add(t2);
            return;
        }
        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
    }

    public List c(T t) {
        return (List) this.b.get(t);
    }

    public List d(T t) {
        List list = null;
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.b.c(i);
            if (arrayList != null && arrayList.contains(t)) {
                if (list == null) {
                    arrayList = new ArrayList();
                } else {
                    List list2 = list;
                }
                arrayList.add(this.b.b(i));
                list = arrayList;
            }
        }
        return list;
    }

    public boolean e(T t) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.b.c(i);
            if (arrayList != null && arrayList.contains(t)) {
                return true;
            }
        }
        return false;
    }

    public void d() {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.b.c(i);
            if (arrayList != null) {
                a(arrayList);
            }
        }
        this.b.clear();
    }

    public ArrayList<T> e() {
        this.c.clear();
        this.d.clear();
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            a(this.b.b(i), this.c, this.d);
        }
        return this.c;
    }

    public void a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (hashSet.contains(t)) {
                throw new RuntimeException("This graph contains cyclic dependencies");
            }
            hashSet.add(t);
            ArrayList arrayList2 = (ArrayList) this.b.get(t);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    a(arrayList2.get(i), arrayList, hashSet);
                }
            }
            hashSet.remove(t);
            arrayList.add(t);
        }
    }

    public ArrayList<T> f() {
        ArrayList<T> arrayList = (ArrayList) this.a.a();
        if (arrayList == null) {
            return new ArrayList();
        }
        return arrayList;
    }

    public void a(ArrayList<T> arrayList) {
        arrayList.clear();
        this.a.a(arrayList);
    }
}
