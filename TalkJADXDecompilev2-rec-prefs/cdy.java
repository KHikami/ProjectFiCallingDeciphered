package p000;

import java.util.ArrayList;
import java.util.List;

final class cdy implements brc {
    final /* synthetic */ cdr f5113a;

    cdy(cdr cdr) {
        this.f5113a = cdr;
    }

    public void mo883a(String str) {
        this.f5113a.bs.mo1166a(str);
    }

    public String[] mo884a() {
        cdr cdr = this.f5113a;
        List arrayList = new ArrayList();
        cdr.m7381a(new cec(cdr, arrayList));
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public long[] mo885b() {
        cdr cdr = this.f5113a;
        List arrayList = new ArrayList();
        cdr.m7381a(new cef(cdr, arrayList));
        long[] jArr = new long[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            jArr[i] = gwb.m1523a((Long) arrayList.get(i));
        }
        return jArr;
    }
}
