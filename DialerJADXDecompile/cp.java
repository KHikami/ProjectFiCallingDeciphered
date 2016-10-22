import android.os.Build.VERSION;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
final class cp extends dy implements Runnable {
    private static boolean r;
    cs a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    boolean i;
    String j;
    int k;
    int l;
    CharSequence m;
    int n;
    CharSequence o;
    ArrayList p;
    ArrayList q;
    private dm s;
    private cs t;
    private boolean u;

    static {
        r = VERSION.SDK_INT >= 21;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("BackStackEntry{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.k >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.k);
        }
        if (this.j != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.j);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final void a(String str, PrintWriter printWriter) {
        printWriter.print(str);
        printWriter.print("mName=");
        printWriter.print(this.j);
        printWriter.print(" mIndex=");
        printWriter.print(this.k);
        printWriter.print(" mCommitted=");
        printWriter.println(this.u);
        if (this.g != 0) {
            printWriter.print(str);
            printWriter.print("mTransition=#");
            printWriter.print(Integer.toHexString(this.g));
            printWriter.print(" mTransitionStyle=#");
            printWriter.println(Integer.toHexString(this.h));
        }
        if (!(this.c == 0 && this.d == 0)) {
            printWriter.print(str);
            printWriter.print("mEnterAnim=#");
            printWriter.print(Integer.toHexString(this.c));
            printWriter.print(" mExitAnim=#");
            printWriter.println(Integer.toHexString(this.d));
        }
        if (!(this.e == 0 && this.f == 0)) {
            printWriter.print(str);
            printWriter.print("mPopEnterAnim=#");
            printWriter.print(Integer.toHexString(this.e));
            printWriter.print(" mPopExitAnim=#");
            printWriter.println(Integer.toHexString(this.f));
        }
        if (!(this.l == 0 && this.m == null)) {
            printWriter.print(str);
            printWriter.print("mBreadCrumbTitleRes=#");
            printWriter.print(Integer.toHexString(this.l));
            printWriter.print(" mBreadCrumbTitleText=");
            printWriter.println(this.m);
        }
        if (!(this.n == 0 && this.o == null)) {
            printWriter.print(str);
            printWriter.print("mBreadCrumbShortTitleRes=#");
            printWriter.print(Integer.toHexString(this.n));
            printWriter.print(" mBreadCrumbShortTitleText=");
            printWriter.println(this.o);
        }
        if (this.a != null) {
            printWriter.print(str);
            printWriter.println("Operations:");
            String str2 = str + "    ";
            int i = 0;
            cs csVar = this.a;
            while (csVar != null) {
                String str3;
                switch (csVar.c) {
                    case rl.c /*0*/:
                        str3 = "NULL";
                        break;
                    case rq.b /*1*/:
                        str3 = "ADD";
                        break;
                    case rq.c /*2*/:
                        str3 = "REPLACE";
                        break;
                    case rl.e /*3*/:
                        str3 = "REMOVE";
                        break;
                    case rl.f /*4*/:
                        str3 = "HIDE";
                        break;
                    case rl.g /*5*/:
                        str3 = "SHOW";
                        break;
                    case rl.i /*6*/:
                        str3 = "DETACH";
                        break;
                    case rl.h /*7*/:
                        str3 = "ATTACH";
                        break;
                    default:
                        str3 = "cmd=" + csVar.c;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str3);
                printWriter.print(" ");
                printWriter.println(csVar.d);
                if (!(csVar.e == 0 && csVar.f == 0)) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(csVar.e));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(csVar.f));
                }
                if (!(csVar.g == 0 && csVar.h == 0)) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(csVar.g));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(csVar.h));
                }
                if (csVar.i != null && csVar.i.size() > 0) {
                    for (int i2 = 0; i2 < csVar.i.size(); i2++) {
                        printWriter.print(str2);
                        if (csVar.i.size() == 1) {
                            printWriter.print("Removed: ");
                        } else {
                            if (i2 == 0) {
                                printWriter.println("Removed:");
                            }
                            printWriter.print(str2);
                            printWriter.print("  #");
                            printWriter.print(i2);
                            printWriter.print(": ");
                        }
                        printWriter.println(csVar.i.get(i2));
                    }
                }
                csVar = csVar.a;
                i++;
            }
        }
    }

    public cp(dm dmVar) {
        this.k = -1;
        this.s = dmVar;
    }

    final void a(cs csVar) {
        if (this.a == null) {
            this.t = csVar;
            this.a = csVar;
        } else {
            csVar.b = this.t;
            this.t.a = csVar;
            this.t = csVar;
        }
        csVar.e = this.c;
        csVar.f = this.d;
        csVar.g = this.e;
        csVar.h = this.f;
        this.b++;
    }

    public final dy a(db dbVar) {
        cs csVar = new cs();
        csVar.c = 3;
        csVar.d = dbVar;
        a(csVar);
        return this;
    }

    final void a(int i) {
        if (this.i) {
            boolean z = dm.a;
            for (cs csVar = this.a; csVar != null; csVar = csVar.a) {
                db dbVar;
                if (csVar.d != null) {
                    dbVar = csVar.d;
                    dbVar.s += i;
                    z = dm.a;
                }
                if (csVar.i != null) {
                    for (int size = csVar.i.size() - 1; size >= 0; size--) {
                        dbVar = (db) csVar.i.get(size);
                        dbVar.s += i;
                        z = dm.a;
                    }
                }
            }
        }
    }

    public final int a() {
        return a(false);
    }

    public final int b() {
        return a(true);
    }

    private int a(boolean z) {
        if (this.u) {
            throw new IllegalStateException("commit already called");
        }
        boolean z2 = dm.a;
        this.u = true;
        if (this.i) {
            this.k = this.s.a(this);
        } else {
            this.k = -1;
        }
        this.s.a((Runnable) this, z);
        return this.k;
    }

    public final void run() {
        boolean z = dm.a;
        if (!this.i || this.k >= 0) {
            ct a;
            a(1);
            if (!r || this.s.g <= 0) {
                Object obj = null;
            } else {
                SparseArray sparseArray = new SparseArray();
                SparseArray sparseArray2 = new SparseArray();
                b(sparseArray, sparseArray2);
                a = a(sparseArray, sparseArray2, false);
            }
            int i = a != null ? 0 : this.h;
            int i2 = a != null ? 0 : this.g;
            cs csVar = this.a;
            while (csVar != null) {
                int i3 = a != null ? 0 : csVar.e;
                int i4 = a != null ? 0 : csVar.f;
                db dbVar;
                switch (csVar.c) {
                    case rq.b /*1*/:
                        dbVar = csVar.d;
                        dbVar.I = i3;
                        this.s.a(dbVar, false);
                        break;
                    case rq.c /*2*/:
                        db dbVar2 = csVar.d;
                        int i5 = dbVar2.z;
                        if (this.s.c != null) {
                            int size = this.s.c.size() - 1;
                            while (size >= 0) {
                                dbVar = (db) this.s.c.get(size);
                                boolean z2 = dm.a;
                                if (dbVar.z == i5) {
                                    if (dbVar == dbVar2) {
                                        csVar.d = null;
                                        dbVar = null;
                                        size--;
                                        dbVar2 = dbVar;
                                    } else {
                                        if (csVar.i == null) {
                                            csVar.i = new ArrayList();
                                        }
                                        csVar.i.add(dbVar);
                                        dbVar.I = i4;
                                        if (this.i) {
                                            dbVar.s++;
                                            z2 = dm.a;
                                        }
                                        this.s.a(dbVar, i2, i);
                                    }
                                }
                                dbVar = dbVar2;
                                size--;
                                dbVar2 = dbVar;
                            }
                        }
                        if (dbVar2 == null) {
                            break;
                        }
                        dbVar2.I = i3;
                        this.s.a(dbVar2, false);
                        break;
                    case rl.e /*3*/:
                        dbVar = csVar.d;
                        dbVar.I = i4;
                        this.s.a(dbVar, i2, i);
                        break;
                    case rl.f /*4*/:
                        dbVar = csVar.d;
                        dbVar.I = i4;
                        this.s.b(dbVar, i2, i);
                        break;
                    case rl.g /*5*/:
                        dbVar = csVar.d;
                        dbVar.I = i3;
                        this.s.c(dbVar, i2, i);
                        break;
                    case rl.i /*6*/:
                        dbVar = csVar.d;
                        dbVar.I = i4;
                        this.s.d(dbVar, i2, i);
                        break;
                    case rl.h /*7*/:
                        dbVar = csVar.d;
                        dbVar.I = i3;
                        this.s.e(dbVar, i2, i);
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown cmd: " + csVar.c);
                }
                csVar = csVar.a;
            }
            this.s.a(this.s.g, i2, i, true);
            if (this.i) {
                dm dmVar = this.s;
                if (dmVar.d == null) {
                    dmVar.d = new ArrayList();
                }
                dmVar.d.add(this);
                return;
            }
            return;
        }
        throw new IllegalStateException("addToBackStack() called after commit()");
    }

    private static void a(SparseArray sparseArray, SparseArray sparseArray2, db dbVar) {
        if (dbVar != null) {
            int i = dbVar.z;
            if (i != 0 && !dbVar.B) {
                if (dbVar.g() && dbVar.K != null && sparseArray.get(i) == null) {
                    sparseArray.put(i, dbVar);
                }
                if (sparseArray2.get(i) == dbVar) {
                    sparseArray2.remove(i);
                }
            }
        }
    }

    private final void b(SparseArray sparseArray, SparseArray sparseArray2, db dbVar) {
        if (dbVar != null) {
            int i = dbVar.z;
            if (i != 0) {
                if (!dbVar.g()) {
                    sparseArray2.put(i, dbVar);
                }
                if (sparseArray.get(i) == dbVar) {
                    sparseArray.remove(i);
                }
            }
            if (dbVar.c <= 0 && this.s.g > 0) {
                this.s.a(dbVar);
                this.s.a(dbVar, 1, 0, 0, false);
            }
        }
    }

    private final void b(SparseArray sparseArray, SparseArray sparseArray2) {
        if (this.s.i.a()) {
            for (cs csVar = this.a; csVar != null; csVar = csVar.a) {
                switch (csVar.c) {
                    case rq.b /*1*/:
                        b(sparseArray, sparseArray2, csVar.d);
                        break;
                    case rq.c /*2*/:
                        db dbVar = csVar.d;
                        if (this.s.c != null) {
                            db dbVar2 = dbVar;
                            for (int i = 0; i < this.s.c.size(); i++) {
                                db dbVar3 = (db) this.s.c.get(i);
                                if (dbVar2 == null || dbVar3.z == dbVar2.z) {
                                    if (dbVar3 == dbVar2) {
                                        dbVar2 = null;
                                        sparseArray2.remove(dbVar3.z);
                                    } else {
                                        a(sparseArray, sparseArray2, dbVar3);
                                    }
                                }
                            }
                        }
                        b(sparseArray, sparseArray2, csVar.d);
                        break;
                    case rl.e /*3*/:
                        a(sparseArray, sparseArray2, csVar.d);
                        break;
                    case rl.f /*4*/:
                        a(sparseArray, sparseArray2, csVar.d);
                        break;
                    case rl.g /*5*/:
                        b(sparseArray, sparseArray2, csVar.d);
                        break;
                    case rl.i /*6*/:
                        a(sparseArray, sparseArray2, csVar.d);
                        break;
                    case rl.h /*7*/:
                        b(sparseArray, sparseArray2, csVar.d);
                        break;
                    default:
                        break;
                }
            }
        }
    }

    public final void a(SparseArray sparseArray, SparseArray sparseArray2) {
        if (this.s.i.a()) {
            for (cs csVar = this.t; csVar != null; csVar = csVar.b) {
                switch (csVar.c) {
                    case rq.b /*1*/:
                        a(sparseArray, sparseArray2, csVar.d);
                        break;
                    case rq.c /*2*/:
                        if (csVar.i != null) {
                            for (int size = csVar.i.size() - 1; size >= 0; size--) {
                                b(sparseArray, sparseArray2, (db) csVar.i.get(size));
                            }
                        }
                        a(sparseArray, sparseArray2, csVar.d);
                        break;
                    case rl.e /*3*/:
                        b(sparseArray, sparseArray2, csVar.d);
                        break;
                    case rl.f /*4*/:
                        b(sparseArray, sparseArray2, csVar.d);
                        break;
                    case rl.g /*5*/:
                        a(sparseArray, sparseArray2, csVar.d);
                        break;
                    case rl.i /*6*/:
                        b(sparseArray, sparseArray2, csVar.d);
                        break;
                    case rl.h /*7*/:
                        a(sparseArray, sparseArray2, csVar.d);
                        break;
                    default:
                        break;
                }
            }
        }
    }

    public final ct a(boolean z, ct ctVar, SparseArray sparseArray, SparseArray sparseArray2) {
        int i;
        boolean z2 = dm.a;
        if (r && this.s.g > 0) {
            if (ctVar == null) {
                if (!(sparseArray.size() == 0 && sparseArray2.size() == 0)) {
                    ctVar = a(sparseArray, sparseArray2, true);
                }
            } else if (!z) {
                ArrayList arrayList = this.q;
                ArrayList arrayList2 = this.p;
                if (arrayList != null) {
                    for (i = 0; i < arrayList.size(); i++) {
                        a(ctVar.a, (String) arrayList.get(i), (String) arrayList2.get(i));
                    }
                }
            }
        }
        a(-1);
        int i2 = ctVar != null ? 0 : this.h;
        int i3 = ctVar != null ? 0 : this.g;
        cs csVar = this.t;
        while (csVar != null) {
            int i4 = ctVar != null ? 0 : csVar.g;
            int i5 = ctVar != null ? 0 : csVar.h;
            db dbVar;
            db dbVar2;
            switch (csVar.c) {
                case rq.b /*1*/:
                    dbVar = csVar.d;
                    dbVar.I = i5;
                    this.s.a(dbVar, dm.a(i3), i2);
                    break;
                case rq.c /*2*/:
                    dbVar = csVar.d;
                    if (dbVar != null) {
                        dbVar.I = i5;
                        this.s.a(dbVar, dm.a(i3), i2);
                    }
                    if (csVar.i == null) {
                        break;
                    }
                    for (i = 0; i < csVar.i.size(); i++) {
                        dbVar2 = (db) csVar.i.get(i);
                        dbVar2.I = i4;
                        this.s.a(dbVar2, false);
                    }
                    break;
                case rl.e /*3*/:
                    dbVar2 = csVar.d;
                    dbVar2.I = i4;
                    this.s.a(dbVar2, false);
                    break;
                case rl.f /*4*/:
                    dbVar2 = csVar.d;
                    dbVar2.I = i4;
                    this.s.c(dbVar2, dm.a(i3), i2);
                    break;
                case rl.g /*5*/:
                    dbVar = csVar.d;
                    dbVar.I = i5;
                    this.s.b(dbVar, dm.a(i3), i2);
                    break;
                case rl.i /*6*/:
                    dbVar2 = csVar.d;
                    dbVar2.I = i4;
                    this.s.e(dbVar2, dm.a(i3), i2);
                    break;
                case rl.h /*7*/:
                    dbVar2 = csVar.d;
                    dbVar2.I = i4;
                    this.s.d(dbVar2, dm.a(i3), i2);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + csVar.c);
            }
            csVar = csVar.b;
        }
        if (z) {
            this.s.a(this.s.g, dm.a(i3), i2, true);
            ctVar = null;
        }
        if (this.k >= 0) {
            dm dmVar = this.s;
            i5 = this.k;
            synchronized (dmVar) {
                dmVar.e.set(i5, null);
                if (dmVar.f == null) {
                    dmVar.f = new ArrayList();
                }
                dmVar.f.add(Integer.valueOf(i5));
            }
            this.k = -1;
        }
        return ctVar;
    }

    private final ct a(SparseArray sparseArray, SparseArray sparseArray2, boolean z) {
        int i = 0;
        ct ctVar = new ct(this);
        ctVar.d = new View(this.s.h.b);
        int i2 = 0;
        int i3 = 0;
        while (i2 < sparseArray.size()) {
            int i4;
            if (a(sparseArray.keyAt(i2), ctVar, z, sparseArray, sparseArray2)) {
                i4 = 1;
            } else {
                i4 = i3;
            }
            i2++;
            i3 = i4;
        }
        while (i < sparseArray2.size()) {
            i4 = sparseArray2.keyAt(i);
            if (sparseArray.get(i4) == null && a(i4, ctVar, z, sparseArray, sparseArray2)) {
                i3 = 1;
            }
            i++;
        }
        if (i3 == 0) {
            return null;
        }
        return ctVar;
    }

    private final hv a(ct ctVar, db dbVar, boolean z) {
        hv hvVar = new hv();
        if (this.p != null) {
            buf.a((Map) hvVar, dbVar.K);
            if (z) {
                ib.a((Map) hvVar, this.q);
            } else {
                hvVar = a(this.p, this.q, hvVar);
            }
        }
        fx fxVar;
        if (z) {
            fxVar = dbVar.U;
            a(ctVar, hvVar, false);
        } else {
            fxVar = dbVar.V;
            b(ctVar, hvVar, false);
        }
        return hvVar;
    }

    private final boolean a(int i, ct ctVar, boolean z, SparseArray sparseArray, SparseArray sparseArray2) {
        View view = (ViewGroup) this.s.i.a(i);
        if (view == null) {
            return false;
        }
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        ArrayList arrayList;
        View view2;
        Object a;
        ee eeVar;
        ArrayList arrayList2;
        Map hvVar;
        boolean z2;
        Object a2;
        db dbVar = (db) sparseArray2.get(i);
        db dbVar2 = (db) sparseArray.get(i);
        if (dbVar == null) {
            obj = null;
        } else {
            if (!z) {
                obj2 = null;
            } else if (dbVar.S == db.b) {
                obj2 = null;
            } else {
                obj2 = dbVar.S;
            }
            obj = buf.a(obj2);
        }
        if (dbVar == null || dbVar2 == null) {
            obj3 = null;
        } else {
            if (!z) {
                obj2 = null;
            } else if (dbVar2.T == db.b) {
                obj2 = null;
            } else {
                obj2 = dbVar2.T;
            }
            obj3 = buf.b(obj2);
        }
        if (dbVar2 == null) {
            obj4 = null;
        } else {
            if (!z) {
                obj2 = null;
            } else if (dbVar2.R == db.b) {
                obj2 = null;
            } else {
                obj2 = dbVar2.R;
            }
            obj4 = buf.a(obj2);
        }
        Map map = null;
        ArrayList arrayList3 = new ArrayList();
        if (obj3 != null) {
            map = a(ctVar, dbVar2, z);
            if (map.isEmpty()) {
                map = null;
                obj5 = null;
                if (obj != null && obj5 == null && obj4 == null) {
                    return false;
                }
                arrayList = new ArrayList();
                view2 = ctVar.d;
                if (obj4 == null) {
                    a = buf.a(obj4, dbVar2.K, arrayList, map, view2);
                } else {
                    a = obj4;
                }
                if (!(this.q == null || map == null)) {
                    view2 = (View) map.get(this.q.get(0));
                    if (view2 != null) {
                        if (a != null) {
                            buf.a(a, view2);
                        }
                        if (obj5 != null) {
                            buf.a(obj5, view2);
                        }
                    }
                }
                eeVar = new ee(this, dbVar);
                arrayList2 = new ArrayList();
                hvVar = new hv();
                z2 = true;
                if (dbVar != null) {
                    z2 = true;
                }
                a2 = buf.a(obj, a, obj5, z2);
                if (a2 != null) {
                    buf.a(obj, obj5, a, view, eeVar, ctVar.d, ctVar.c, ctVar.a, arrayList2, arrayList, map, hvVar, arrayList3);
                    view.getViewTreeObserver().addOnPreDrawListener(new cr(this, view, ctVar, i, a2));
                    buf.a(a2, ctVar.d, true);
                    a(ctVar, i, a2);
                    buf.a((ViewGroup) view, a2);
                    buf.a(view, ctVar.d, obj, arrayList2, a, arrayList, obj5, arrayList3, a2, ctVar.b, hvVar);
                }
                return a2 == null;
            } else {
                fx fxVar;
                if (z) {
                    fxVar = dbVar2.U;
                } else {
                    fxVar = dbVar.U;
                }
                if (obj3 != null) {
                    view.getViewTreeObserver().addOnPreDrawListener(new cq(this, view, obj3, arrayList3, ctVar, obj, obj4, z, dbVar, dbVar2));
                }
            }
        }
        obj5 = obj3;
        if (obj != null) {
        }
        arrayList = new ArrayList();
        view2 = ctVar.d;
        if (obj4 == null) {
            a = obj4;
        } else {
            a = buf.a(obj4, dbVar2.K, arrayList, map, view2);
        }
        view2 = (View) map.get(this.q.get(0));
        if (view2 != null) {
            if (a != null) {
                buf.a(a, view2);
            }
            if (obj5 != null) {
                buf.a(obj5, view2);
            }
        }
        eeVar = new ee(this, dbVar);
        arrayList2 = new ArrayList();
        hvVar = new hv();
        z2 = true;
        if (dbVar != null) {
            z2 = true;
        }
        a2 = buf.a(obj, a, obj5, z2);
        if (a2 != null) {
            buf.a(obj, obj5, a, view, eeVar, ctVar.d, ctVar.c, ctVar.a, arrayList2, arrayList, map, hvVar, arrayList3);
            view.getViewTreeObserver().addOnPreDrawListener(new cr(this, view, ctVar, i, a2));
            buf.a(a2, ctVar.d, true);
            a(ctVar, i, a2);
            buf.a((ViewGroup) view, a2);
            buf.a(view, ctVar.d, obj, arrayList2, a, arrayList, obj5, arrayList3, a2, ctVar.b, hvVar);
        }
        if (a2 == null) {
        }
    }

    static void a(db dbVar, db dbVar2, boolean z, hv hvVar) {
        fx fxVar;
        if (z) {
            fxVar = dbVar2.U;
        } else {
            fxVar = dbVar.U;
        }
    }

    static hv a(ArrayList arrayList, ArrayList arrayList2, hv hvVar) {
        if (hvVar.isEmpty()) {
            return hvVar;
        }
        hv hvVar2 = new hv();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) hvVar.get(arrayList.get(i));
            if (view != null) {
                hvVar2.put(arrayList2.get(i), view);
            }
        }
        return hvVar2;
    }

    final void a(ct ctVar, int i, Object obj) {
        if (this.s.c != null) {
            for (int i2 = 0; i2 < this.s.c.size(); i2++) {
                db dbVar = (db) this.s.c.get(i2);
                if (!(dbVar.K == null || dbVar.J == null || dbVar.z != i)) {
                    if (!dbVar.B) {
                        buf.a(obj, dbVar.K, false);
                        ctVar.b.remove(dbVar.K);
                    } else if (!ctVar.b.contains(dbVar.K)) {
                        buf.a(obj, dbVar.K, true);
                        ctVar.b.add(dbVar.K);
                    }
                }
            }
        }
    }

    private static void a(hv hvVar, String str, String str2) {
        if (str != null && str2 != null) {
            for (int i = 0; i < hvVar.size(); i++) {
                if (str.equals(hvVar.c(i))) {
                    hvVar.a(i, (Object) str2);
                    return;
                }
            }
            hvVar.put(str, str2);
        }
    }

    final void a(ct ctVar, hv hvVar, boolean z) {
        int size = this.q == null ? 0 : this.q.size();
        for (int i = 0; i < size; i++) {
            String str = (String) this.p.get(i);
            View view = (View) hvVar.get((String) this.q.get(i));
            if (view != null) {
                String d = buf.d(view);
                if (z) {
                    a(ctVar.a, str, d);
                } else {
                    a(ctVar.a, d, str);
                }
            }
        }
    }

    static void b(ct ctVar, hv hvVar, boolean z) {
        int size = hvVar.size();
        for (int i = 0; i < size; i++) {
            String str = (String) hvVar.b(i);
            String d = buf.d((View) hvVar.c(i));
            if (z) {
                a(ctVar.a, str, d);
            } else {
                a(ctVar.a, d, str);
            }
        }
    }

    public final dy a(db dbVar, String str) {
        dbVar.t = this.s;
        if (str != null) {
            if (dbVar.A == null || str.equals(dbVar.A)) {
                dbVar.A = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + dbVar + ": was " + dbVar.A + " now " + str);
            }
        }
        cs csVar = new cs();
        csVar.c = 1;
        csVar.d = dbVar;
        a(csVar);
        return this;
    }
}
