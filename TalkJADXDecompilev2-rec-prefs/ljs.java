package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ljs {
    public void m29188a(List<ogu> list) {
        if (Log.isLoggable("trace_manager", 2)) {
            ljs.m29187b(list);
        }
    }

    ljs() {
    }

    static void m29187b(List<ogu> list) {
        ogu ogu;
        int i = 0;
        lc lcVar = new lc();
        synchronized (list) {
            for (ogu ogu2 : list) {
                lcVar.m28557b(ogu2.i(), ogu2);
            }
        }
        List arrayList = new ArrayList();
        for (int i2 = 0; i2 < lcVar.m28550a(); i2++) {
            String valueOf;
            ogu2 = (ogu) lcVar.m28554b(i2);
            long m = (long) ogu2.m();
            m = Math.max(m, (long) ogu2.n()) - m;
            m = ogu2.i();
            String str = m + " ms";
            while (true) {
                ogu2 = (ogu) lcVar.m28551a(m);
                m = ogu2.j();
                valueOf = String.valueOf(ogu2.k());
                valueOf = new StringBuilder((String.valueOf(valueOf).length() + 3) + String.valueOf(str).length()).append(valueOf).append(" > ").append(str).toString();
                if (m == 0) {
                    break;
                }
                str = valueOf;
            }
            arrayList.add(valueOf);
        }
        Collections.sort(arrayList);
        ArrayList arrayList2 = (ArrayList) arrayList;
        int size = arrayList2.size();
        while (i < size) {
            arrayList2.get(i);
            i++;
        }
    }
}
