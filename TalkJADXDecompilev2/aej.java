package defpackage;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;

public final class aej {
    private SparseArray<ArrayList<aer>> a = new SparseArray();
    private SparseIntArray b = new SparseIntArray();
    private int c = 0;

    private void a() {
        this.a.clear();
    }

    public aer a(int i) {
        ArrayList arrayList = (ArrayList) this.a.get(i);
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size() - 1;
        aer aer = (aer) arrayList.get(size);
        arrayList.remove(size);
        return aer;
    }

    private void b() {
        this.c++;
    }

    private void c() {
        this.c--;
    }

    void a(ady ady, ady ady2, boolean z) {
        if (ady != null) {
            c();
        }
        if (!z && this.c == 0) {
            a();
        }
        if (ady2 != null) {
            b();
        }
    }

    public void a(aer aer) {
        int i = aer.e;
        ArrayList arrayList = (ArrayList) this.a.get(i);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.a.put(i, arrayList);
            if (this.b.indexOfKey(i) < 0) {
                this.b.put(i, 5);
            }
        }
        if (this.b.get(i) > arrayList.size()) {
            aer.s();
            arrayList.add(aer);
        }
    }
}
