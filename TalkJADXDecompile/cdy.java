import java.util.ArrayList;
import java.util.List;

final class cdy implements brc {
    final /* synthetic */ cdr a;

    cdy(cdr cdr) {
        this.a = cdr;
    }

    public void a(String str) {
        this.a.bs.a(str);
    }

    public String[] a() {
        cdr cdr = this.a;
        List arrayList = new ArrayList();
        cdr.a(new cec(cdr, arrayList));
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public long[] b() {
        cdr cdr = this.a;
        List arrayList = new ArrayList();
        cdr.a(new cef(cdr, arrayList));
        long[] jArr = new long[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            jArr[i] = gwb.a((Long) arrayList.get(i));
        }
        return jArr;
    }
}
