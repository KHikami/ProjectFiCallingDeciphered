import java.util.ArrayList;

final class abz implements Runnable {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ abw b;

    abz(abw abw, ArrayList arrayList) {
        this.b = abw;
        this.a = arrayList;
    }

    public void run() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            aer aer = (aer) obj;
            abw abw = this.b;
            pn m = oa.m(aer.a);
            abw.d.add(aer);
            m.a(1.0f).a(abw.f()).a(new acb(abw, aer, m)).c();
        }
        this.a.clear();
        this.b.a.remove(this.a);
    }
}
