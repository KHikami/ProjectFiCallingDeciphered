package p000;

import android.os.Build.VERSION;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Map;

final class dg extends ew implements Runnable {
    static final boolean f9641a = (VERSION.SDK_INT >= 21);
    final ee f9642b;
    dj f9643c;
    dj f9644d;
    int f9645e;
    int f9646f;
    int f9647g;
    int f9648h;
    int f9649i;
    int f9650j;
    int f9651k;
    boolean f9652l;
    boolean f9653m = true;
    String f9654n;
    boolean f9655o;
    int f9656p = -1;
    int f9657q;
    CharSequence f9658r;
    int f9659s;
    CharSequence f9660t;
    ArrayList<String> f9661u;
    ArrayList<String> f9662v;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("BackStackEntry{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f9656p >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.f9656p);
        }
        if (this.f9654n != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.f9654n);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public void m11671a(String str, PrintWriter printWriter) {
        m11672a(str, printWriter, true);
    }

    public void m11672a(String str, PrintWriter printWriter, boolean z) {
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f9654n);
            printWriter.print(" mIndex=");
            printWriter.print(this.f9656p);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f9655o);
            if (this.f9650j != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f9650j));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f9651k));
            }
            if (!(this.f9646f == 0 && this.f9647g == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f9646f));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f9647g));
            }
            if (!(this.f9648h == 0 && this.f9649i == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f9648h));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f9649i));
            }
            if (!(this.f9657q == 0 && this.f9658r == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f9657q));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f9658r);
            }
            if (!(this.f9659s == 0 && this.f9660t == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f9659s));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f9660t);
            }
        }
        if (this.f9643c != null) {
            printWriter.print(str);
            printWriter.println("Operations:");
            String str2 = str + "    ";
            int i = 0;
            dj djVar = this.f9643c;
            while (djVar != null) {
                String str3;
                switch (djVar.f9908c) {
                    case 0:
                        str3 = "NULL";
                        break;
                    case 1:
                        str3 = "ADD";
                        break;
                    case 2:
                        str3 = "REPLACE";
                        break;
                    case 3:
                        str3 = "REMOVE";
                        break;
                    case 4:
                        str3 = "HIDE";
                        break;
                    case 5:
                        str3 = "SHOW";
                        break;
                    case 6:
                        str3 = "DETACH";
                        break;
                    case 7:
                        str3 = "ATTACH";
                        break;
                    default:
                        str3 = "cmd=" + djVar.f9908c;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str3);
                printWriter.print(" ");
                printWriter.println(djVar.f9909d);
                if (z) {
                    if (!(djVar.f9910e == 0 && djVar.f9911f == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(djVar.f9910e));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(djVar.f9911f));
                    }
                    if (!(djVar.f9912g == 0 && djVar.f9913h == 0)) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(djVar.f9912g));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(djVar.f9913h));
                    }
                }
                if (djVar.f9914i != null && djVar.f9914i.size() > 0) {
                    for (int i2 = 0; i2 < djVar.f9914i.size(); i2++) {
                        printWriter.print(str2);
                        if (djVar.f9914i.size() == 1) {
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
                        printWriter.println(djVar.f9914i.get(i2));
                    }
                }
                djVar = djVar.f9906a;
                i++;
            }
        }
    }

    public dg(ee eeVar) {
        this.f9642b = eeVar;
    }

    void m11668a(dj djVar) {
        if (this.f9643c == null) {
            this.f9644d = djVar;
            this.f9643c = djVar;
        } else {
            djVar.f9907b = this.f9644d;
            this.f9644d.f9906a = djVar;
            this.f9644d = djVar;
        }
        djVar.f9910e = this.f9646f;
        djVar.f9911f = this.f9647g;
        djVar.f9912g = this.f9648h;
        djVar.f9913h = this.f9649i;
        this.f9645e++;
    }

    public ew mo1528a(dr drVar, String str) {
        m11649a(0, drVar, str, 1);
        return this;
    }

    public ew mo1525a(int i, dr drVar) {
        m11649a(i, drVar, null, 1);
        return this;
    }

    public ew mo1526a(int i, dr drVar, String str) {
        m11649a(i, drVar, str, 1);
        return this;
    }

    private void m11649a(int i, dr drVar, String str, int i2) {
        Class cls = drVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        drVar.f723B = this.f9642b;
        if (str != null) {
            if (drVar.f730I == null || str.equals(drVar.f730I)) {
                drVar.f730I = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + drVar + ": was " + drVar.f730I + " now " + str);
            }
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + drVar + " with tag " + str + " to container view with no id");
            } else if (drVar.f728G == 0 || drVar.f728G == i) {
                drVar.f728G = i;
                drVar.f729H = i;
            } else {
                throw new IllegalStateException("Can't change container ID of fragment " + drVar + ": was " + drVar.f728G + " now " + i);
            }
        }
        dj djVar = new dj();
        djVar.f9908c = i2;
        djVar.f9909d = drVar;
        m11668a(djVar);
    }

    public ew mo1530b(int i, dr drVar) {
        return mo1531b(i, drVar, null);
    }

    public ew mo1531b(int i, dr drVar, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        m11649a(i, drVar, str, 2);
        return this;
    }

    public ew mo1527a(dr drVar) {
        dj djVar = new dj();
        djVar.f9908c = 3;
        djVar.f9909d = drVar;
        m11668a(djVar);
        return this;
    }

    public ew mo1532b(dr drVar) {
        dj djVar = new dj();
        djVar.f9908c = 4;
        djVar.f9909d = drVar;
        m11668a(djVar);
        return this;
    }

    public ew mo1533c(dr drVar) {
        dj djVar = new dj();
        djVar.f9908c = 5;
        djVar.f9909d = drVar;
        m11668a(djVar);
        return this;
    }

    public ew mo1535d(dr drVar) {
        dj djVar = new dj();
        djVar.f9908c = 6;
        djVar.f9909d = drVar;
        m11668a(djVar);
        return this;
    }

    public ew mo1536e(dr drVar) {
        dj djVar = new dj();
        djVar.f9908c = 7;
        djVar.f9909d = drVar;
        m11668a(djVar);
        return this;
    }

    public ew mo1524a(int i, int i2) {
        return m11646a(i, i2, 0, 0);
    }

    private ew m11646a(int i, int i2, int i3, int i4) {
        this.f9646f = i;
        this.f9647g = i2;
        this.f9648h = 0;
        this.f9649i = 0;
        return this;
    }

    public ew mo1523a(int i) {
        this.f9650j = 0;
        return this;
    }

    private ew m11658d() {
        if (this.f9652l) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f9653m = false;
        return this;
    }

    void m11677b(int i) {
        if (this.f9652l) {
            if (ee.f11264a) {
                new StringBuilder("Bump nesting in ").append(this).append(" by ").append(i);
            }
            for (dj djVar = this.f9643c; djVar != null; djVar = djVar.f9906a) {
                dr drVar;
                if (djVar.f9909d != null) {
                    drVar = djVar.f9909d;
                    drVar.f722A += i;
                    if (ee.f11264a) {
                        new StringBuilder("Bump nesting of ").append(djVar.f9909d).append(" to ").append(djVar.f9909d.f722A);
                    }
                }
                if (djVar.f9914i != null) {
                    for (int size = djVar.f9914i.size() - 1; size >= 0; size--) {
                        drVar = (dr) djVar.f9914i.get(size);
                        drVar.f722A += i;
                        if (ee.f11264a) {
                            new StringBuilder("Bump nesting of ").append(drVar).append(" to ").append(drVar.f722A);
                        }
                    }
                }
            }
        }
    }

    public int mo1522a() {
        return m11644a(false);
    }

    public int mo1529b() {
        return m11644a(true);
    }

    public void mo1534c() {
        m11658d();
        this.f9642b.m13675b(this, true);
    }

    private int m11644a(boolean z) {
        if (this.f9655o) {
            throw new IllegalStateException("commit already called");
        }
        if (ee.f11264a) {
            new StringBuilder("Commit: ").append(this);
            m11671a("  ", new PrintWriter(new lb("FragmentManager")));
        }
        this.f9655o = true;
        if (this.f9652l) {
            this.f9656p = this.f9642b.m13649a(this);
        } else {
            this.f9656p = -1;
        }
        this.f9642b.m13663a((Runnable) this, z);
        return this.f9656p;
    }

    public void run() {
        if (ee.f11264a) {
            new StringBuilder("Run: ").append(this);
        }
        if (!this.f9652l || this.f9656p >= 0) {
            dk a;
            m11677b(1);
            if (!f9641a || this.f9642b.f11278n <= 0) {
                Object obj = null;
            } else {
                SparseArray sparseArray = new SparseArray();
                SparseArray sparseArray2 = new SparseArray();
                m11655b(sparseArray, sparseArray2);
                a = m11645a(sparseArray, sparseArray2, false);
            }
            int i = a != null ? 0 : this.f9651k;
            int i2 = a != null ? 0 : this.f9650j;
            dj djVar = this.f9643c;
            while (djVar != null) {
                int i3 = a != null ? 0 : djVar.f9910e;
                int i4 = a != null ? 0 : djVar.f9911f;
                dr drVar;
                switch (djVar.f9908c) {
                    case 1:
                        drVar = djVar.f9909d;
                        drVar.f738Q = i3;
                        this.f9642b.m13661a(drVar, false);
                        break;
                    case 2:
                        dr drVar2 = djVar.f9909d;
                        int i5 = drVar2.f729H;
                        if (this.f9642b.f11271g != null) {
                            int size = this.f9642b.f11271g.size() - 1;
                            while (size >= 0) {
                                drVar = (dr) this.f9642b.f11271g.get(size);
                                if (ee.f11264a) {
                                    new StringBuilder("OP_REPLACE: adding=").append(drVar2).append(" old=").append(drVar);
                                }
                                if (drVar.f729H == i5) {
                                    if (drVar == drVar2) {
                                        djVar.f9909d = null;
                                        drVar = null;
                                        size--;
                                        drVar2 = drVar;
                                    } else {
                                        if (djVar.f9914i == null) {
                                            djVar.f9914i = new ArrayList();
                                        }
                                        djVar.f9914i.add(drVar);
                                        drVar.f738Q = i4;
                                        if (this.f9652l) {
                                            drVar.f722A++;
                                            if (ee.f11264a) {
                                                new StringBuilder("Bump nesting of ").append(drVar).append(" to ").append(drVar.f722A);
                                            }
                                        }
                                        this.f9642b.m13659a(drVar, i2, i);
                                    }
                                }
                                drVar = drVar2;
                                size--;
                                drVar2 = drVar;
                            }
                        }
                        if (drVar2 == null) {
                            break;
                        }
                        drVar2.f738Q = i3;
                        this.f9642b.m13661a(drVar2, false);
                        break;
                    case 3:
                        drVar = djVar.f9909d;
                        drVar.f738Q = i4;
                        this.f9642b.m13659a(drVar, i2, i);
                        break;
                    case 4:
                        drVar = djVar.f9909d;
                        drVar.f738Q = i4;
                        this.f9642b.m13674b(drVar, i2, i);
                        break;
                    case 5:
                        drVar = djVar.f9909d;
                        drVar.f738Q = i3;
                        this.f9642b.m13681c(drVar, i2, i);
                        break;
                    case 6:
                        drVar = djVar.f9909d;
                        drVar.f738Q = i4;
                        this.f9642b.m13684d(drVar, i2, i);
                        break;
                    case 7:
                        drVar = djVar.f9909d;
                        drVar.f738Q = i3;
                        this.f9642b.m13685e(drVar, i2, i);
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown cmd: " + djVar.f9908c);
                }
                djVar = djVar.f9906a;
            }
            this.f9642b.m13655a(this.f9642b.f11278n, i2, i, true);
            if (this.f9652l) {
                this.f9642b.m13672b(this);
                return;
            }
            return;
        }
        throw new IllegalStateException("addToBackStack() called after commit()");
    }

    private static void m11650a(SparseArray<dr> sparseArray, SparseArray<dr> sparseArray2, dr drVar) {
        if (drVar != null) {
            int i = drVar.f729H;
            if (i != 0 && !drVar.isHidden()) {
                if (drVar.isAdded() && drVar.getView() != null && sparseArray.get(i) == null) {
                    sparseArray.put(i, drVar);
                }
                if (sparseArray2.get(i) == drVar) {
                    sparseArray2.remove(i);
                }
            }
        }
    }

    private void m11656b(SparseArray<dr> sparseArray, SparseArray<dr> sparseArray2, dr drVar) {
        if (drVar != null) {
            int i = drVar.f729H;
            if (i != 0) {
                if (!drVar.isAdded()) {
                    sparseArray2.put(i, drVar);
                }
                if (sparseArray.get(i) == drVar) {
                    sparseArray.remove(i);
                }
            }
            if (drVar.f748k <= 0 && this.f9642b.f11278n > 0) {
                this.f9642b.m13673b(drVar);
                this.f9642b.m13660a(drVar, 1, 0, 0, false);
            }
        }
    }

    private void m11655b(SparseArray<dr> sparseArray, SparseArray<dr> sparseArray2) {
        if (this.f9642b.f11280p.mo1658a()) {
            for (dj djVar = this.f9643c; djVar != null; djVar = djVar.f9906a) {
                switch (djVar.f9908c) {
                    case 1:
                        m11656b((SparseArray) sparseArray, (SparseArray) sparseArray2, djVar.f9909d);
                        break;
                    case 2:
                        dr drVar = djVar.f9909d;
                        if (this.f9642b.f11271g != null) {
                            dr drVar2 = drVar;
                            for (int i = 0; i < this.f9642b.f11271g.size(); i++) {
                                dr drVar3 = (dr) this.f9642b.f11271g.get(i);
                                if (drVar2 == null || drVar3.f729H == drVar2.f729H) {
                                    if (drVar3 == drVar2) {
                                        drVar2 = null;
                                        sparseArray2.remove(drVar3.f729H);
                                    } else {
                                        dg.m11650a((SparseArray) sparseArray, (SparseArray) sparseArray2, drVar3);
                                    }
                                }
                            }
                        }
                        m11656b((SparseArray) sparseArray, (SparseArray) sparseArray2, djVar.f9909d);
                        break;
                    case 3:
                        dg.m11650a((SparseArray) sparseArray, (SparseArray) sparseArray2, djVar.f9909d);
                        break;
                    case 4:
                        dg.m11650a((SparseArray) sparseArray, (SparseArray) sparseArray2, djVar.f9909d);
                        break;
                    case 5:
                        m11656b((SparseArray) sparseArray, (SparseArray) sparseArray2, djVar.f9909d);
                        break;
                    case 6:
                        dg.m11650a((SparseArray) sparseArray, (SparseArray) sparseArray2, djVar.f9909d);
                        break;
                    case 7:
                        m11656b((SparseArray) sparseArray, (SparseArray) sparseArray2, djVar.f9909d);
                        break;
                    default:
                        break;
                }
            }
        }
    }

    public void m11667a(SparseArray<dr> sparseArray, SparseArray<dr> sparseArray2) {
        if (this.f9642b.f11280p.mo1658a()) {
            for (dj djVar = this.f9644d; djVar != null; djVar = djVar.f9907b) {
                switch (djVar.f9908c) {
                    case 1:
                        dg.m11650a((SparseArray) sparseArray, (SparseArray) sparseArray2, djVar.f9909d);
                        break;
                    case 2:
                        if (djVar.f9914i != null) {
                            for (int size = djVar.f9914i.size() - 1; size >= 0; size--) {
                                m11656b((SparseArray) sparseArray, (SparseArray) sparseArray2, (dr) djVar.f9914i.get(size));
                            }
                        }
                        dg.m11650a((SparseArray) sparseArray, (SparseArray) sparseArray2, djVar.f9909d);
                        break;
                    case 3:
                        m11656b((SparseArray) sparseArray, (SparseArray) sparseArray2, djVar.f9909d);
                        break;
                    case 4:
                        m11656b((SparseArray) sparseArray, (SparseArray) sparseArray2, djVar.f9909d);
                        break;
                    case 5:
                        dg.m11650a((SparseArray) sparseArray, (SparseArray) sparseArray2, djVar.f9909d);
                        break;
                    case 6:
                        m11656b((SparseArray) sparseArray, (SparseArray) sparseArray2, djVar.f9909d);
                        break;
                    case 7:
                        dg.m11650a((SparseArray) sparseArray, (SparseArray) sparseArray2, djVar.f9909d);
                        break;
                    default:
                        break;
                }
            }
        }
    }

    public dk m11660a(boolean z, dk dkVar, SparseArray<dr> sparseArray, SparseArray<dr> sparseArray2) {
        if (ee.f11264a) {
            new StringBuilder("popFromBackStack: ").append(this);
            m11671a("  ", new PrintWriter(new lb("FragmentManager")));
        }
        if (f9641a && this.f9642b.f11278n > 0) {
            if (dkVar == null) {
                if (!(sparseArray.size() == 0 && sparseArray2.size() == 0)) {
                    dkVar = m11645a((SparseArray) sparseArray, (SparseArray) sparseArray2, true);
                }
            } else if (!z) {
                dg.m11651a(dkVar, this.f9662v, this.f9661u);
            }
        }
        m11677b(-1);
        int i = dkVar != null ? 0 : this.f9651k;
        int i2 = dkVar != null ? 0 : this.f9650j;
        dj djVar = this.f9644d;
        while (djVar != null) {
            int i3 = dkVar != null ? 0 : djVar.f9912g;
            int i4 = dkVar != null ? 0 : djVar.f9913h;
            dr drVar;
            dr drVar2;
            switch (djVar.f9908c) {
                case 1:
                    drVar = djVar.f9909d;
                    drVar.f738Q = i4;
                    this.f9642b.m13659a(drVar, ee.m13642d(i2), i);
                    break;
                case 2:
                    drVar = djVar.f9909d;
                    if (drVar != null) {
                        drVar.f738Q = i4;
                        this.f9642b.m13659a(drVar, ee.m13642d(i2), i);
                    }
                    if (djVar.f9914i == null) {
                        break;
                    }
                    for (int i5 = 0; i5 < djVar.f9914i.size(); i5++) {
                        drVar2 = (dr) djVar.f9914i.get(i5);
                        drVar2.f738Q = i3;
                        this.f9642b.m13661a(drVar2, false);
                    }
                    break;
                case 3:
                    drVar2 = djVar.f9909d;
                    drVar2.f738Q = i3;
                    this.f9642b.m13661a(drVar2, false);
                    break;
                case 4:
                    drVar2 = djVar.f9909d;
                    drVar2.f738Q = i3;
                    this.f9642b.m13681c(drVar2, ee.m13642d(i2), i);
                    break;
                case 5:
                    drVar = djVar.f9909d;
                    drVar.f738Q = i4;
                    this.f9642b.m13674b(drVar, ee.m13642d(i2), i);
                    break;
                case 6:
                    drVar2 = djVar.f9909d;
                    drVar2.f738Q = i3;
                    this.f9642b.m13685e(drVar2, ee.m13642d(i2), i);
                    break;
                case 7:
                    drVar2 = djVar.f9909d;
                    drVar2.f738Q = i3;
                    this.f9642b.m13684d(drVar2, ee.m13642d(i2), i);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + djVar.f9908c);
            }
            djVar = djVar.f9907b;
        }
        if (z) {
            this.f9642b.m13655a(this.f9642b.f11278n, ee.m13642d(i2), i, true);
            dkVar = null;
        }
        if (this.f9656p >= 0) {
            this.f9642b.m13680c(this.f9656p);
            this.f9656p = -1;
        }
        return dkVar;
    }

    private dk m11645a(SparseArray<dr> sparseArray, SparseArray<dr> sparseArray2, boolean z) {
        int i;
        int i2 = 0;
        dk dkVar = new dk(this);
        dkVar.f9982d = new View(this.f9642b.f11279o.m13033i());
        int i3 = 0;
        int i4 = 0;
        while (i3 < sparseArray.size()) {
            if (m11654a(sparseArray.keyAt(i3), dkVar, z, sparseArray, sparseArray2)) {
                i = 1;
            } else {
                i = i4;
            }
            i3++;
            i4 = i;
        }
        while (i2 < sparseArray2.size()) {
            i = sparseArray2.keyAt(i2);
            if (sparseArray.get(i) == null && m11654a(i, dkVar, z, sparseArray, sparseArray2)) {
                i4 = 1;
            }
            i2++;
        }
        if (i4 == 0) {
            return null;
        }
        return dkVar;
    }

    private ky<String, View> m11647a(dk dkVar, dr drVar, boolean z) {
        ky kyVar = new ky();
        if (this.f9661u != null) {
            gwb.m1879a((Map) kyVar, drVar.getView());
            if (z) {
                kyVar.m28022b(this.f9662v);
            } else {
                kyVar = dg.m11648a(this.f9661u, this.f9662v, kyVar);
            }
        }
        ho hoVar;
        if (z) {
            if (drVar.ah != null) {
                hoVar = drVar.ah;
            }
            m11670a(dkVar, kyVar, false);
        } else {
            if (drVar.ai != null) {
                hoVar = drVar.ai;
            }
            dg.m11657b(dkVar, kyVar, false);
        }
        return kyVar;
    }

    private boolean m11654a(int i, dk dkVar, boolean z, SparseArray<dr> sparseArray, SparseArray<dr> sparseArray2) {
        View view = (ViewGroup) this.f9642b.f11280p.mo1657a(i);
        if (view == null) {
            return false;
        }
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        ArrayList arrayList;
        View view2;
        Object a;
        fc fcVar;
        ArrayList arrayList2;
        Map kyVar;
        boolean z2;
        Object a2;
        dr drVar = (dr) sparseArray2.get(i);
        dr drVar2 = (dr) sparseArray.get(i);
        if (drVar == null) {
            obj = null;
        } else {
            obj = gwb.m1632a(z ? drVar.getReenterTransition() : drVar.getEnterTransition());
        }
        if (drVar == null || drVar2 == null) {
            obj2 = null;
        } else {
            Object sharedElementReturnTransition;
            if (z) {
                sharedElementReturnTransition = drVar2.getSharedElementReturnTransition();
            } else {
                sharedElementReturnTransition = drVar.getSharedElementEnterTransition();
            }
            obj2 = gwb.m1993b(sharedElementReturnTransition);
        }
        if (drVar2 == null) {
            obj3 = null;
        } else {
            obj3 = gwb.m1632a(z ? drVar2.getReturnTransition() : drVar2.getExitTransition());
        }
        Map map = null;
        ArrayList arrayList3 = new ArrayList();
        if (obj2 != null) {
            map = m11647a(dkVar, drVar2, z);
            if (map.isEmpty()) {
                map = null;
                obj4 = null;
                if (obj != null && obj4 == null && obj3 == null) {
                    return false;
                }
                arrayList = new ArrayList();
                view2 = dkVar.f9982d;
                if (obj3 == null) {
                    a = gwb.m1634a(obj3, drVar2.getView(), arrayList, map, view2);
                } else {
                    a = obj3;
                }
                if (!(this.f9662v == null || map == null)) {
                    view2 = (View) map.get(this.f9662v.get(0));
                    if (view2 != null) {
                        if (a != null) {
                            gwb.m1851a(a, view2);
                        }
                        if (obj4 != null) {
                            gwb.m1851a(obj4, view2);
                        }
                    }
                }
                fcVar = new fc(this, drVar);
                arrayList2 = new ArrayList();
                kyVar = new ky();
                z2 = true;
                if (drVar != null) {
                    if (z) {
                        z2 = drVar.getAllowEnterTransitionOverlap();
                    } else {
                        z2 = drVar.getAllowReturnTransitionOverlap();
                    }
                }
                a2 = gwb.m1636a(obj, a, obj4, z2);
                if (a2 != null) {
                    gwb.m1858a(obj, obj4, a, view, fcVar, dkVar.f9982d, dkVar.f9981c, (Map) dkVar.f9979a, arrayList2, arrayList, map, kyVar, arrayList3);
                    view.getViewTreeObserver().addOnPreDrawListener(new di(this, view, dkVar, i, a2));
                    gwb.m1855a(a2, dkVar.f9982d, true);
                    m11669a(dkVar, i, a2);
                    gwb.m1803a((ViewGroup) view, a2);
                    gwb.m1796a(view, dkVar.f9982d, obj, arrayList2, a, arrayList, obj4, arrayList3, a2, dkVar.f9980b, kyVar);
                }
                if (a2 == null) {
                    return true;
                }
                return false;
            }
            if ((z ? drVar2.ah : drVar.ah) != null) {
                ArrayList arrayList4 = new ArrayList(map.keySet());
                arrayList4 = new ArrayList(map.values());
            }
            if (obj2 != null) {
                view.getViewTreeObserver().addOnPreDrawListener(new dh(this, view, obj2, arrayList3, dkVar, obj, obj3, z, drVar, drVar2));
            }
        }
        obj4 = obj2;
        if (obj != null) {
        }
        arrayList = new ArrayList();
        view2 = dkVar.f9982d;
        if (obj3 == null) {
            a = obj3;
        } else {
            a = gwb.m1634a(obj3, drVar2.getView(), arrayList, map, view2);
        }
        view2 = (View) map.get(this.f9662v.get(0));
        if (view2 != null) {
            if (a != null) {
                gwb.m1851a(a, view2);
            }
            if (obj4 != null) {
                gwb.m1851a(obj4, view2);
            }
        }
        fcVar = new fc(this, drVar);
        arrayList2 = new ArrayList();
        kyVar = new ky();
        z2 = true;
        if (drVar != null) {
            if (z) {
                z2 = drVar.getAllowEnterTransitionOverlap();
            } else {
                z2 = drVar.getAllowReturnTransitionOverlap();
            }
        }
        a2 = gwb.m1636a(obj, a, obj4, z2);
        if (a2 != null) {
            gwb.m1858a(obj, obj4, a, view, fcVar, dkVar.f9982d, dkVar.f9981c, (Map) dkVar.f9979a, arrayList2, arrayList, map, kyVar, arrayList3);
            view.getViewTreeObserver().addOnPreDrawListener(new di(this, view, dkVar, i, a2));
            gwb.m1855a(a2, dkVar.f9982d, true);
            m11669a(dkVar, i, a2);
            gwb.m1803a((ViewGroup) view, a2);
            gwb.m1796a(view, dkVar.f9982d, obj, arrayList2, a, arrayList, obj4, arrayList3, a2, dkVar.f9980b, kyVar);
        }
        if (a2 == null) {
            return false;
        }
        return true;
    }

    static void m11652a(dr drVar, dr drVar2, boolean z, ky kyVar) {
        if ((z ? drVar2.ah : drVar.ah) != null) {
            ArrayList arrayList = new ArrayList(kyVar.keySet());
            arrayList = new ArrayList(kyVar.values());
        }
    }

    static ky<String, View> m11648a(ArrayList<String> arrayList, ArrayList<String> arrayList2, ky<String, View> kyVar) {
        if (kyVar.isEmpty()) {
            return kyVar;
        }
        ky<String, View> kyVar2 = new ky();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) kyVar.get(arrayList.get(i));
            if (view != null) {
                kyVar2.put(arrayList2.get(i), view);
            }
        }
        return kyVar2;
    }

    void m11669a(dk dkVar, int i, Object obj) {
        if (this.f9642b.f11271g != null) {
            for (int i2 = 0; i2 < this.f9642b.f11271g.size(); i2++) {
                dr drVar = (dr) this.f9642b.f11271g.get(i2);
                if (!(drVar.f740S == null || drVar.f739R == null || drVar.f729H != i)) {
                    if (!drVar.f731J) {
                        gwb.m1855a(obj, drVar.f740S, false);
                        dkVar.f9980b.remove(drVar.f740S);
                    } else if (!dkVar.f9980b.contains(drVar.f740S)) {
                        gwb.m1855a(obj, drVar.f740S, true);
                        dkVar.f9980b.add(drVar.f740S);
                    }
                }
            }
        }
    }

    private static void m11653a(ky<String, String> kyVar, String str, String str2) {
        if (str != null && str2 != null) {
            for (int i = 0; i < kyVar.size(); i++) {
                if (str.equals(kyVar.m28018c(i))) {
                    kyVar.m28013a(i, (Object) str2);
                    return;
                }
            }
            kyVar.put(str, str2);
        }
    }

    private static void m11651a(dk dkVar, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                dg.m11653a(dkVar.f9979a, (String) arrayList.get(i), (String) arrayList2.get(i));
            }
        }
    }

    void m11670a(dk dkVar, ky<String, View> kyVar, boolean z) {
        int size = this.f9662v == null ? 0 : this.f9662v.size();
        for (int i = 0; i < size; i++) {
            String str = (String) this.f9661u.get(i);
            View view = (View) kyVar.get((String) this.f9662v.get(i));
            if (view != null) {
                String e = gwb.m2171e(view);
                if (z) {
                    dg.m11653a(dkVar.f9979a, str, e);
                } else {
                    dg.m11653a(dkVar.f9979a, e, str);
                }
            }
        }
    }

    static void m11657b(dk dkVar, ky<String, View> kyVar, boolean z) {
        int size = kyVar.size();
        for (int i = 0; i < size; i++) {
            String str = (String) kyVar.m28017b(i);
            String e = gwb.m2171e((View) kyVar.m28018c(i));
            if (z) {
                dg.m11653a(dkVar.f9979a, str, e);
            } else {
                dg.m11653a(dkVar.f9979a, e, str);
            }
        }
    }
}
