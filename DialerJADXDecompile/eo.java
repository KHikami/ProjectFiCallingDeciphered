import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
public final class eo {
    static final ex a;

    static void a(em emVar, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            emVar.a((ep) it.next());
        }
    }

    static void a(en enVar, fg fgVar) {
        if (fgVar == null) {
            return;
        }
        if (fgVar instanceof er) {
            fn.a(enVar, null, false, null, null);
        } else if (fgVar instanceof eu) {
            fn.a(enVar, null, false, null, ((eu) fgVar).a);
        } else if (fgVar instanceof eq) {
            fn.a(enVar, null, false, null, null, null, false);
        }
    }

    static void b(en enVar, fg fgVar) {
        if (fgVar == null) {
            return;
        }
        if (fgVar instanceof ev) {
            ev evVar = (ev) fgVar;
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            List arrayList3 = new ArrayList();
            List arrayList4 = new ArrayList();
            List arrayList5 = new ArrayList();
            for (ew ewVar : evVar.a) {
                arrayList.add(null);
                arrayList2.add(Long.valueOf(0));
                arrayList3.add(null);
                arrayList4.add(null);
                arrayList5.add(null);
            }
            buf.a(enVar, null, null, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
            return;
        }
        a(enVar, fgVar);
    }

    static {
        if (buf.c()) {
            a = new fa();
        } else if (VERSION.SDK_INT >= 21) {
            a = new ez();
        } else if (VERSION.SDK_INT >= 20) {
            a = new ey();
        } else if (VERSION.SDK_INT >= 19) {
            a = new ff();
        } else if (VERSION.SDK_INT >= 16) {
            a = new fe();
        } else if (VERSION.SDK_INT >= 14) {
            a = new fd();
        } else if (VERSION.SDK_INT >= 11) {
            a = new fc();
        } else if (VERSION.SDK_INT >= 9) {
            a = new fb();
        } else {
            a = new ex();
        }
    }
}
