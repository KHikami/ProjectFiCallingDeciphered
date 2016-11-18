package p000;

import java.util.ArrayList;
import java.util.List;

final class cdz implements brr {
    final /* synthetic */ cdr f5114a;

    cdz(cdr cdr) {
        this.f5114a = cdr;
    }

    public void mo886a(String str) {
        this.f5114a.bs.mo1166a(str);
    }

    public String[] mo887a() {
        cdr cdr = this.f5114a;
        List arrayList = new ArrayList();
        cdr.m7381a(new cec(cdr, arrayList));
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public long[] mo888b() {
        cdr cdr = this.f5114a;
        List arrayList = new ArrayList();
        cdr.m7381a(new cef(cdr, arrayList));
        long[] jArr = new long[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            jArr[i] = gwb.m1523a((Long) arrayList.get(i));
        }
        return jArr;
    }
}
