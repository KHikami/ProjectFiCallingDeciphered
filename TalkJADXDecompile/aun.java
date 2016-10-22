import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class aun<Model, Data> implements auh<Model, Data> {
    private final List<auh<Model, Data>> a;
    private final ll<List<Exception>> b;

    aun(List<auh<Model, Data>> list, ll<List<Exception>> llVar) {
        this.a = list;
        this.b = llVar;
    }

    public aui<Data> a(Model model, int i, int i2, anz anz) {
        int size = this.a.size();
        List arrayList = new ArrayList(size);
        int i3 = 0;
        anv anv = null;
        while (i3 < size) {
            anv anv2;
            auh auh = (auh) this.a.get(i3);
            if (auh.a(model)) {
                aui a = auh.a(model, i, i2, anz);
                if (a != null) {
                    anv2 = a.a;
                    arrayList.add(a.c);
                    i3++;
                    anv = anv2;
                }
            }
            anv2 = anv;
            i3++;
            anv = anv2;
        }
        return !arrayList.isEmpty() ? new aui(anv, new auo(arrayList, this.b)) : null;
    }

    public boolean a(Model model) {
        for (auh a : this.a) {
            if (a.a(model)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String valueOf = String.valueOf(Arrays.toString(this.a.toArray(new auh[this.a.size()])));
        return new StringBuilder(String.valueOf(valueOf).length() + 31).append("MultiModelLoader{modelLoaders=").append(valueOf).append("}").toString();
    }
}
