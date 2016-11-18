package p000;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;

public final class aej {
    private SparseArray<ArrayList<aer>> f388a = new SparseArray();
    private SparseIntArray f389b = new SparseIntArray();
    private int f390c = 0;

    private void m788a() {
        this.f388a.clear();
    }

    public aer m791a(int i) {
        ArrayList arrayList = (ArrayList) this.f388a.get(i);
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size() - 1;
        aer aer = (aer) arrayList.get(size);
        arrayList.remove(size);
        return aer;
    }

    private void m789b() {
        this.f390c++;
    }

    private void m790c() {
        this.f390c--;
    }

    void m792a(ady ady, ady ady2, boolean z) {
        if (ady != null) {
            m790c();
        }
        if (!z && this.f390c == 0) {
            m788a();
        }
        if (ady2 != null) {
            m789b();
        }
    }

    public void m793a(aer aer) {
        int i = aer.f442e;
        ArrayList arrayList = (ArrayList) this.f388a.get(i);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f388a.put(i, arrayList);
            if (this.f389b.indexOfKey(i) < 0) {
                this.f389b.put(i, 5);
            }
        }
        if (this.f389b.get(i) > arrayList.size()) {
            aer.m879s();
            arrayList.add(aer);
        }
    }
}
