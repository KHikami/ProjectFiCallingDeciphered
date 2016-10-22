import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

final class ceh implements Runnable {
    final /* synthetic */ cdr a;

    ceh(cdr cdr) {
        this.a = cdr;
    }

    public void run() {
        cdr cdr = this.a;
        long currentTimeMillis = System.currentTimeMillis();
        List arrayList = new ArrayList();
        for (Entry entry : cdr.aZ.entrySet()) {
            if (currentTimeMillis - ((cgp) entry.getValue()).b > 30000) {
                if (glk.a("Babel_Conv", 3)) {
                    String str = "Babel_Conv";
                    String str2 = "Typing status expired for ";
                    String valueOf = String.valueOf(((cgp) entry.getValue()).a);
                    glk.b(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
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
            edk a = cdr.a(edo);
            if (a != null) {
                cdr.aY.b(a, 4, true);
            }
        }
    }
}
