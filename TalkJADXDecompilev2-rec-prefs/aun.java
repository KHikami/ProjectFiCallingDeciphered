package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class aun<Model, Data> implements auh<Model, Data> {
    private final List<auh<Model, Data>> f2363a;
    private final ll<List<Exception>> f2364b;

    aun(List<auh<Model, Data>> list, ll<List<Exception>> llVar) {
        this.f2363a = list;
        this.f2364b = llVar;
    }

    public aui<Data> mo377a(Model model, int i, int i2, anz anz) {
        int size = this.f2363a.size();
        List arrayList = new ArrayList(size);
        int i3 = 0;
        anv anv = null;
        while (i3 < size) {
            anv anv2;
            auh auh = (auh) this.f2363a.get(i3);
            if (auh.mo378a(model)) {
                aui a = auh.mo377a(model, i, i2, anz);
                if (a != null) {
                    anv2 = a.f2356a;
                    arrayList.add(a.f2358c);
                    i3++;
                    anv = anv2;
                }
            }
            anv2 = anv;
            i3++;
            anv = anv2;
        }
        return !arrayList.isEmpty() ? new aui(anv, new auo(arrayList, this.f2364b)) : null;
    }

    public boolean mo378a(Model model) {
        for (auh a : this.f2363a) {
            if (a.mo378a(model)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String valueOf = String.valueOf(Arrays.toString(this.f2363a.toArray(new auh[this.f2363a.size()])));
        return new StringBuilder(String.valueOf(valueOf).length() + 31).append("MultiModelLoader{modelLoaders=").append(valueOf).append("}").toString();
    }
}
