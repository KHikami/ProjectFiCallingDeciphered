package p000;

import android.app.Activity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class hfz {
    public final ll<ArrayList<T>> f16881a = new lm(10);
    public final lo<T, ArrayList<T>> f16882b = new lo();
    public final ArrayList<T> f16883c = new ArrayList();
    public final HashSet<T> f16884d = new HashSet();
    private final Object f16885e;

    public boolean m19698a() {
        return this.f16885e instanceof dw;
    }

    public Activity m19699b() {
        return (Activity) this.f16885e;
    }

    public dw m19701c() {
        return (dw) this.f16885e;
    }

    public void m19694a(T t) {
        if (!this.f16882b.containsKey(t)) {
            this.f16882b.put(t, null);
        }
    }

    public boolean m19700b(T t) {
        return this.f16882b.containsKey(t);
    }

    public void m19695a(T t, T t2) {
        if (this.f16882b.containsKey(t) && this.f16882b.containsKey(t2)) {
            ArrayList arrayList = (ArrayList) this.f16882b.get(t);
            if (arrayList == null) {
                arrayList = m19707f();
                this.f16882b.put(t, arrayList);
            }
            arrayList.add(t2);
            return;
        }
        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
    }

    public List m19702c(T t) {
        return (List) this.f16882b.get(t);
    }

    public List m19703d(T t) {
        List list = null;
        int size = this.f16882b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.f16882b.m28018c(i);
            if (arrayList != null && arrayList.contains(t)) {
                if (list == null) {
                    arrayList = new ArrayList();
                } else {
                    List list2 = list;
                }
                arrayList.add(this.f16882b.m28017b(i));
                list = arrayList;
            }
        }
        return list;
    }

    public boolean m19706e(T t) {
        int size = this.f16882b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.f16882b.m28018c(i);
            if (arrayList != null && arrayList.contains(t)) {
                return true;
            }
        }
        return false;
    }

    public void m19704d() {
        int size = this.f16882b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.f16882b.m28018c(i);
            if (arrayList != null) {
                m19697a(arrayList);
            }
        }
        this.f16882b.clear();
    }

    public ArrayList<T> m19705e() {
        this.f16883c.clear();
        this.f16884d.clear();
        int size = this.f16882b.size();
        for (int i = 0; i < size; i++) {
            m19696a(this.f16882b.m28017b(i), this.f16883c, this.f16884d);
        }
        return this.f16883c;
    }

    public void m19696a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (hashSet.contains(t)) {
                throw new RuntimeException("This graph contains cyclic dependencies");
            }
            hashSet.add(t);
            ArrayList arrayList2 = (ArrayList) this.f16882b.get(t);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    m19696a(arrayList2.get(i), arrayList, hashSet);
                }
            }
            hashSet.remove(t);
            arrayList.add(t);
        }
    }

    public ArrayList<T> m19707f() {
        ArrayList<T> arrayList = (ArrayList) this.f16881a.mo436a();
        if (arrayList == null) {
            return new ArrayList();
        }
        return arrayList;
    }

    public void m19697a(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f16881a.mo437a(arrayList);
    }
}
