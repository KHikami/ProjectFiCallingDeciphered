package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

final class ceh implements Runnable {
    final /* synthetic */ cdr f5125a;

    ceh(cdr cdr) {
        this.f5125a = cdr;
    }

    public void run() {
        cdr cdr = this.f5125a;
        long currentTimeMillis = System.currentTimeMillis();
        List arrayList = new ArrayList();
        for (Entry entry : cdr.aZ.entrySet()) {
            if (currentTimeMillis - ((cgp) entry.getValue()).f5261b > 30000) {
                if (glk.m17973a("Babel_Conv", 3)) {
                    String str = "Babel_Conv";
                    String str2 = "Typing status expired for ";
                    String valueOf = String.valueOf(((cgp) entry.getValue()).f5260a);
                    glk.m17976b(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
                }
                arrayList.add((edo) entry.getKey());
            }
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            edo edo = (edo) obj;
            cdr.aZ.remove(edo);
            edk a = cdr.mo833a(edo);
            if (a != null) {
                cdr.aY.m9587b(a, 4, true);
            }
        }
    }
}
