package defpackage;

import android.os.Build.VERSION;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: dg */
final class dg extends ew implements Runnable {
    static final boolean a;
    final ee b;
    dj c;
    dj d;
    int e;
    int f;
    int g;
    int h;
    int i;
    int j;
    int k;
    boolean l;
    boolean m;
    String n;
    boolean o;
    int p;
    int q;
    CharSequence r;
    int s;
    CharSequence t;
    ArrayList<String> u;
    ArrayList<String> v;

    static {
        a = VERSION.SDK_INT >= 21;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("BackStackEntry{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.p >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.p);
        }
        if (this.n != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.n);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public void a(String str, PrintWriter printWriter) {
        a(str, printWriter, true);
    }

    public void a(String str, PrintWriter printWriter, boolean z) {
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.n);
            printWriter.print(" mIndex=");
            printWriter.print(this.p);
            printWriter.print(" mCommitted=");
            printWriter.println(this.o);
            if (this.j != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.j));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.k));
            }
            if (!(this.f == 0 && this.g == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.g));
            }
            if (!(this.h == 0 && this.i == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.h));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.i));
            }
            if (!(this.q == 0 && this.r == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.q));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.r);
            }
            if (!(this.s == 0 && this.t == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.s));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.t);
            }
        }
        if (this.c != null) {
            printWriter.print(str);
            printWriter.println("Operations:");
            String str2 = str + "    ";
            int i = 0;
            dj djVar = this.c;
            while (djVar != null) {
                String str3;
                switch (djVar.c) {
                    case wi.w /*0*/:
                        str3 = "NULL";
                        break;
                    case wi.j /*1*/:
                        str3 = "ADD";
                        break;
                    case wi.l /*2*/:
                        str3 = "REPLACE";
                        break;
                    case wi.z /*3*/:
                        str3 = "REMOVE";
                        break;
                    case wi.h /*4*/:
                        str3 = "HIDE";
                        break;
                    case wi.p /*5*/:
                        str3 = "SHOW";
                        break;
                    case wi.s /*6*/:
                        str3 = "DETACH";
                        break;
                    case wi.q /*7*/:
                        str3 = "ATTACH";
                        break;
                    default:
                        str3 = "cmd=" + djVar.c;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str3);
                printWriter.print(" ");
                printWriter.println(djVar.d);
                if (z) {
                    if (!(djVar.e == 0 && djVar.f == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(djVar.e));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(djVar.f));
                    }
                    if (!(djVar.g == 0 && djVar.h == 0)) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(djVar.g));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(djVar.h));
                    }
                }
                if (djVar.i != null && djVar.i.size() > 0) {
                    for (int i2 = 0; i2 < djVar.i.size(); i2++) {
                        printWriter.print(str2);
                        if (djVar.i.size() == 1) {
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
                        printWriter.println(djVar.i.get(i2));
                    }
                }
                djVar = djVar.a;
                i++;
            }
        }
    }

    public dg(ee eeVar) {
        this.m = true;
        this.p = -1;
        this.b = eeVar;
    }

    void a(dj djVar) {
        if (this.c == null) {
            this.d = djVar;
            this.c = djVar;
        } else {
            djVar.b = this.d;
            this.d.a = djVar;
            this.d = djVar;
        }
        djVar.e = this.f;
        djVar.f = this.g;
        djVar.g = this.h;
        djVar.h = this.i;
        this.e++;
    }

    public ew a(dr drVar, String str) {
        a(0, drVar, str, 1);
        return this;
    }

    public ew a(int i, dr drVar) {
        a(i, drVar, null, 1);
        return this;
    }

    public ew a(int i, dr drVar, String str) {
        a(i, drVar, str, 1);
        return this;
    }

    private void a(int i, dr drVar, String str, int i2) {
        Class cls = drVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        drVar.B = this.b;
        if (str != null) {
            if (drVar.I == null || str.equals(drVar.I)) {
                drVar.I = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + drVar + ": was " + drVar.I + " now " + str);
            }
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + drVar + " with tag " + str + " to container view with no id");
            } else if (drVar.G == 0 || drVar.G == i) {
                drVar.G = i;
                drVar.H = i;
            } else {
                throw new IllegalStateException("Can't change container ID of fragment " + drVar + ": was " + drVar.G + " now " + i);
            }
        }
        dj djVar = new dj();
        djVar.c = i2;
        djVar.d = drVar;
        a(djVar);
    }

    public ew b(int i, dr drVar) {
        return b(i, drVar, null);
    }

    public ew b(int i, dr drVar, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        a(i, drVar, str, 2);
        return this;
    }

    public ew a(dr drVar) {
        dj djVar = new dj();
        djVar.c = 3;
        djVar.d = drVar;
        a(djVar);
        return this;
    }

    public ew b(dr drVar) {
        dj djVar = new dj();
        djVar.c = 4;
        djVar.d = drVar;
        a(djVar);
        return this;
    }

    public ew c(dr drVar) {
        dj djVar = new dj();
        djVar.c = 5;
        djVar.d = drVar;
        a(djVar);
        return this;
    }

    public ew d(dr drVar) {
        dj djVar = new dj();
        djVar.c = 6;
        djVar.d = drVar;
        a(djVar);
        return this;
    }

    public ew e(dr drVar) {
        dj djVar = new dj();
        djVar.c = 7;
        djVar.d = drVar;
        a(djVar);
        return this;
    }

    public ew a(int i, int i2) {
        return a(i, i2, 0, 0);
    }

    private ew a(int i, int i2, int i3, int i4) {
        this.f = i;
        this.g = i2;
        this.h = 0;
        this.i = 0;
        return this;
    }

    public ew a(int i) {
        this.j = 0;
        return this;
    }

    private ew d() {
        if (this.l) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.m = false;
        return this;
    }

    void b(int i) {
        if (this.l) {
            if (ee.a) {
                new StringBuilder("Bump nesting in ").append(this).append(" by ").append(i);
            }
            for (dj djVar = this.c; djVar != null; djVar = djVar.a) {
                dr drVar;
                if (djVar.d != null) {
                    drVar = djVar.d;
                    drVar.A += i;
                    if (ee.a) {
                        new StringBuilder("Bump nesting of ").append(djVar.d).append(" to ").append(djVar.d.A);
                    }
                }
                if (djVar.i != null) {
                    for (int size = djVar.i.size() - 1; size >= 0; size--) {
                        drVar = (dr) djVar.i.get(size);
                        drVar.A += i;
                        if (ee.a) {
                            new StringBuilder("Bump nesting of ").append(drVar).append(" to ").append(drVar.A);
                        }
                    }
                }
            }
        }
    }

    public int a() {
        return a(false);
    }

    public int b() {
        return a(true);
    }

    public void c() {
        d();
        this.b.b(this, true);
    }

    private int a(boolean z) {
        if (this.o) {
            throw new IllegalStateException("commit already called");
        }
        if (ee.a) {
            new StringBuilder("Commit: ").append(this);
            a("  ", new PrintWriter(new lb("FragmentManager")));
        }
        this.o = true;
        if (this.l) {
            this.p = this.b.a(this);
        } else {
            this.p = -1;
        }
        this.b.a((Runnable) this, z);
        return this.p;
    }

    public void run() {
        if (ee.a) {
            new StringBuilder("Run: ").append(this);
        }
        if (!this.l || this.p >= 0) {
            dk a;
            b(1);
            if (!a || this.b.n <= 0) {
                Object obj = null;
            } else {
                SparseArray sparseArray = new SparseArray();
                SparseArray sparseArray2 = new SparseArray();
                b(sparseArray, sparseArray2);
                a = a(sparseArray, sparseArray2, false);
            }
            int i = a != null ? 0 : this.k;
            int i2 = a != null ? 0 : this.j;
            dj djVar = this.c;
            while (djVar != null) {
                int i3 = a != null ? 0 : djVar.e;
                int i4 = a != null ? 0 : djVar.f;
                dr drVar;
                switch (djVar.c) {
                    case wi.j /*1*/:
                        drVar = djVar.d;
                        drVar.Q = i3;
                        this.b.a(drVar, false);
                        break;
                    case wi.l /*2*/:
                        dr drVar2 = djVar.d;
                        int i5 = drVar2.H;
                        if (this.b.g != null) {
                            int size = this.b.g.size() - 1;
                            while (size >= 0) {
                                drVar = (dr) this.b.g.get(size);
                                if (ee.a) {
                                    new StringBuilder("OP_REPLACE: adding=").append(drVar2).append(" old=").append(drVar);
                                }
                                if (drVar.H == i5) {
                                    if (drVar == drVar2) {
                                        djVar.d = null;
                                        drVar = null;
                                        size--;
                                        drVar2 = drVar;
                                    } else {
                                        if (djVar.i == null) {
                                            djVar.i = new ArrayList();
                                        }
                                        djVar.i.add(drVar);
                                        drVar.Q = i4;
                                        if (this.l) {
                                            drVar.A++;
                                            if (ee.a) {
                                                new StringBuilder("Bump nesting of ").append(drVar).append(" to ").append(drVar.A);
                                            }
                                        }
                                        this.b.a(drVar, i2, i);
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
                        drVar2.Q = i3;
                        this.b.a(drVar2, false);
                        break;
                    case wi.z /*3*/:
                        drVar = djVar.d;
                        drVar.Q = i4;
                        this.b.a(drVar, i2, i);
                        break;
                    case wi.h /*4*/:
                        drVar = djVar.d;
                        drVar.Q = i4;
                        this.b.b(drVar, i2, i);
                        break;
                    case wi.p /*5*/:
                        drVar = djVar.d;
                        drVar.Q = i3;
                        this.b.c(drVar, i2, i);
                        break;
                    case wi.s /*6*/:
                        drVar = djVar.d;
                        drVar.Q = i4;
                        this.b.d(drVar, i2, i);
                        break;
                    case wi.q /*7*/:
                        drVar = djVar.d;
                        drVar.Q = i3;
                        this.b.e(drVar, i2, i);
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown cmd: " + djVar.c);
                }
                djVar = djVar.a;
            }
            this.b.a(this.b.n, i2, i, true);
            if (this.l) {
                this.b.b(this);
                return;
            }
            return;
        }
        throw new IllegalStateException("addToBackStack() called after commit()");
    }

    private static void a(SparseArray<dr> sparseArray, SparseArray<dr> sparseArray2, dr drVar) {
        if (drVar != null) {
            int i = drVar.H;
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

    private void b(SparseArray<dr> sparseArray, SparseArray<dr> sparseArray2, dr drVar) {
        if (drVar != null) {
            int i = drVar.H;
            if (i != 0) {
                if (!drVar.isAdded()) {
                    sparseArray2.put(i, drVar);
                }
                if (sparseArray.get(i) == drVar) {
                    sparseArray.remove(i);
                }
            }
            if (drVar.k <= 0 && this.b.n > 0) {
                this.b.b(drVar);
                this.b.a(drVar, 1, 0, 0, false);
            }
        }
    }

    private void b(SparseArray<dr> sparseArray, SparseArray<dr> sparseArray2) {
        if (this.b.p.a()) {
            for (dj djVar = this.c; djVar != null; djVar = djVar.a) {
                switch (djVar.c) {
                    case wi.j /*1*/:
                        b((SparseArray) sparseArray, (SparseArray) sparseArray2, djVar.d);
                        break;
                    case wi.l /*2*/:
                        dr drVar = djVar.d;
                        if (this.b.g != null) {
                            dr drVar2 = drVar;
                            for (int i = 0; i < this.b.g.size(); i++) {
                                dr drVar3 = (dr) this.b.g.get(i);
                                if (drVar2 == null || drVar3.H == drVar2.H) {
                                    if (drVar3 == drVar2) {
                                        drVar2 = null;
                                        sparseArray2.remove(drVar3.H);
                                    } else {
                                        dg.a((SparseArray) sparseArray, (SparseArray) sparseArray2, drVar3);
                                    }
                                }
                            }
                        }
                        b((SparseArray) sparseArray, (SparseArray) sparseArray2, djVar.d);
                        break;
                    case wi.z /*3*/:
                        dg.a((SparseArray) sparseArray, (SparseArray) sparseArray2, djVar.d);
                        break;
                    case wi.h /*4*/:
                        dg.a((SparseArray) sparseArray, (SparseArray) sparseArray2, djVar.d);
                        break;
                    case wi.p /*5*/:
                        b((SparseArray) sparseArray, (SparseArray) sparseArray2, djVar.d);
                        break;
                    case wi.s /*6*/:
                        dg.a((SparseArray) sparseArray, (SparseArray) sparseArray2, djVar.d);
                        break;
                    case wi.q /*7*/:
                        b((SparseArray) sparseArray, (SparseArray) sparseArray2, djVar.d);
                        break;
                    default:
                        break;
                }
            }
        }
    }

    public void a(SparseArray<dr> sparseArray, SparseArray<dr> sparseArray2) {
        if (this.b.p.a()) {
            for (dj djVar = this.d; djVar != null; djVar = djVar.b) {
                switch (djVar.c) {
                    case wi.j /*1*/:
                        dg.a((SparseArray) sparseArray, (SparseArray) sparseArray2, djVar.d);
                        break;
                    case wi.l /*2*/:
                        if (djVar.i != null) {
                            for (int size = djVar.i.size() - 1; size >= 0; size--) {
                                b((SparseArray) sparseArray, (SparseArray) sparseArray2, (dr) djVar.i.get(size));
                            }
                        }
                        dg.a((SparseArray) sparseArray, (SparseArray) sparseArray2, djVar.d);
                        break;
                    case wi.z /*3*/:
                        b((SparseArray) sparseArray, (SparseArray) sparseArray2, djVar.d);
                        break;
                    case wi.h /*4*/:
                        b((SparseArray) sparseArray, (SparseArray) sparseArray2, djVar.d);
                        break;
                    case wi.p /*5*/:
                        dg.a((SparseArray) sparseArray, (SparseArray) sparseArray2, djVar.d);
                        break;
                    case wi.s /*6*/:
                        b((SparseArray) sparseArray, (SparseArray) sparseArray2, djVar.d);
                        break;
                    case wi.q /*7*/:
                        dg.a((SparseArray) sparseArray, (SparseArray) sparseArray2, djVar.d);
                        break;
                    default:
                        break;
                }
            }
        }
    }

    public dk a(boolean z, dk dkVar, SparseArray<dr> sparseArray, SparseArray<dr> sparseArray2) {
        if (ee.a) {
            new StringBuilder("popFromBackStack: ").append(this);
            a("  ", new PrintWriter(new lb("FragmentManager")));
        }
        if (a && this.b.n > 0) {
            if (dkVar == null) {
                if (!(sparseArray.size() == 0 && sparseArray2.size() == 0)) {
                    dkVar = a((SparseArray) sparseArray, (SparseArray) sparseArray2, true);
                }
            } else if (!z) {
                dg.a(dkVar, this.v, this.u);
            }
        }
        b(-1);
        int i = dkVar != null ? 0 : this.k;
        int i2 = dkVar != null ? 0 : this.j;
        dj djVar = this.d;
        while (djVar != null) {
            int i3 = dkVar != null ? 0 : djVar.g;
            int i4 = dkVar != null ? 0 : djVar.h;
            dr drVar;
            dr drVar2;
            switch (djVar.c) {
                case wi.j /*1*/:
                    drVar = djVar.d;
                    drVar.Q = i4;
                    this.b.a(drVar, ee.d(i2), i);
                    break;
                case wi.l /*2*/:
                    drVar = djVar.d;
                    if (drVar != null) {
                        drVar.Q = i4;
                        this.b.a(drVar, ee.d(i2), i);
                    }
                    if (djVar.i == null) {
                        break;
                    }
                    for (int i5 = 0; i5 < djVar.i.size(); i5++) {
                        drVar2 = (dr) djVar.i.get(i5);
                        drVar2.Q = i3;
                        this.b.a(drVar2, false);
                    }
                    break;
                case wi.z /*3*/:
                    drVar2 = djVar.d;
                    drVar2.Q = i3;
                    this.b.a(drVar2, false);
                    break;
                case wi.h /*4*/:
                    drVar2 = djVar.d;
                    drVar2.Q = i3;
                    this.b.c(drVar2, ee.d(i2), i);
                    break;
                case wi.p /*5*/:
                    drVar = djVar.d;
                    drVar.Q = i4;
                    this.b.b(drVar, ee.d(i2), i);
                    break;
                case wi.s /*6*/:
                    drVar2 = djVar.d;
                    drVar2.Q = i3;
                    this.b.e(drVar2, ee.d(i2), i);
                    break;
                case wi.q /*7*/:
                    drVar2 = djVar.d;
                    drVar2.Q = i3;
                    this.b.d(drVar2, ee.d(i2), i);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + djVar.c);
            }
            djVar = djVar.b;
        }
        if (z) {
            this.b.a(this.b.n, ee.d(i2), i, true);
            dkVar = null;
        }
        if (this.p >= 0) {
            this.b.c(this.p);
            this.p = -1;
        }
        return dkVar;
    }

    private dk a(SparseArray<dr> sparseArray, SparseArray<dr> sparseArray2, boolean z) {
        int i;
        int i2 = 0;
        dk dkVar = new dk(this);
        dkVar.d = new View(this.b.o.i());
        int i3 = 0;
        int i4 = 0;
        while (i3 < sparseArray.size()) {
            if (a(sparseArray.keyAt(i3), dkVar, z, sparseArray, sparseArray2)) {
                i = 1;
            } else {
                i = i4;
            }
            i3++;
            i4 = i;
        }
        while (i2 < sparseArray2.size()) {
            i = sparseArray2.keyAt(i2);
            if (sparseArray.get(i) == null && a(i, dkVar, z, sparseArray, sparseArray2)) {
                i4 = 1;
            }
            i2++;
        }
        if (i4 == 0) {
            return null;
        }
        return dkVar;
    }

    private ky<String, View> a(dk dkVar, dr drVar, boolean z) {
        ky kyVar = new ky();
        if (this.u != null) {
            gwb.a((Map) kyVar, drVar.getView());
            if (z) {
                kyVar.b(this.v);
            } else {
                kyVar = dg.a(this.u, this.v, kyVar);
            }
        }
        ho hoVar;
        if (z) {
            if (drVar.ah != null) {
                hoVar = drVar.ah;
            }
            a(dkVar, kyVar, false);
        } else {
            if (drVar.ai != null) {
                hoVar = drVar.ai;
            }
            dg.b(dkVar, kyVar, false);
        }
        return kyVar;
    }

    private boolean a(int i, dk dkVar, boolean z, SparseArray<dr> sparseArray, SparseArray<dr> sparseArray2) {
        View view = (ViewGroup) this.b.p.a(i);
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
            obj = gwb.a(z ? drVar.getReenterTransition() : drVar.getEnterTransition());
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
            obj2 = gwb.b(sharedElementReturnTransition);
        }
        if (drVar2 == null) {
            obj3 = null;
        } else {
            obj3 = gwb.a(z ? drVar2.getReturnTransition() : drVar2.getExitTransition());
        }
        Map map = null;
        ArrayList arrayList3 = new ArrayList();
        if (obj2 != null) {
            map = a(dkVar, drVar2, z);
            if (map.isEmpty()) {
                map = null;
                obj4 = null;
                if (obj != null && obj4 == null && obj3 == null) {
                    return false;
                }
                arrayList = new ArrayList();
                view2 = dkVar.d;
                if (obj3 == null) {
                    a = gwb.a(obj3, drVar2.getView(), arrayList, map, view2);
                } else {
                    a = obj3;
                }
                if (!(this.v == null || map == null)) {
                    view2 = (View) map.get(this.v.get(0));
                    if (view2 != null) {
                        if (a != null) {
                            gwb.a(a, view2);
                        }
                        if (obj4 != null) {
                            gwb.a(obj4, view2);
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
                a2 = gwb.a(obj, a, obj4, z2);
                if (a2 != null) {
                    gwb.a(obj, obj4, a, view, fcVar, dkVar.d, dkVar.c, dkVar.a, arrayList2, arrayList, map, kyVar, arrayList3);
                    view.getViewTreeObserver().addOnPreDrawListener(new di(this, view, dkVar, i, a2));
                    gwb.a(a2, dkVar.d, true);
                    a(dkVar, i, a2);
                    gwb.a((ViewGroup) view, a2);
                    gwb.a(view, dkVar.d, obj, arrayList2, a, arrayList, obj4, arrayList3, a2, dkVar.b, kyVar);
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
        view2 = dkVar.d;
        if (obj3 == null) {
            a = obj3;
        } else {
            a = gwb.a(obj3, drVar2.getView(), arrayList, map, view2);
        }
        view2 = (View) map.get(this.v.get(0));
        if (view2 != null) {
            if (a != null) {
                gwb.a(a, view2);
            }
            if (obj4 != null) {
                gwb.a(obj4, view2);
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
        a2 = gwb.a(obj, a, obj4, z2);
        if (a2 != null) {
            gwb.a(obj, obj4, a, view, fcVar, dkVar.d, dkVar.c, dkVar.a, arrayList2, arrayList, map, kyVar, arrayList3);
            view.getViewTreeObserver().addOnPreDrawListener(new di(this, view, dkVar, i, a2));
            gwb.a(a2, dkVar.d, true);
            a(dkVar, i, a2);
            gwb.a((ViewGroup) view, a2);
            gwb.a(view, dkVar.d, obj, arrayList2, a, arrayList, obj4, arrayList3, a2, dkVar.b, kyVar);
        }
        if (a2 == null) {
            return false;
        }
        return true;
    }

    static void a(dr drVar, dr drVar2, boolean z, ky kyVar) {
        if ((z ? drVar2.ah : drVar.ah) != null) {
            ArrayList arrayList = new ArrayList(kyVar.keySet());
            arrayList = new ArrayList(kyVar.values());
        }
    }

    static ky<String, View> a(ArrayList<String> arrayList, ArrayList<String> arrayList2, ky<String, View> kyVar) {
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

    void a(dk dkVar, int i, Object obj) {
        if (this.b.g != null) {
            for (int i2 = 0; i2 < this.b.g.size(); i2++) {
                dr drVar = (dr) this.b.g.get(i2);
                if (!(drVar.S == null || drVar.R == null || drVar.H != i)) {
                    if (!drVar.J) {
                        gwb.a(obj, drVar.S, false);
                        dkVar.b.remove(drVar.S);
                    } else if (!dkVar.b.contains(drVar.S)) {
                        gwb.a(obj, drVar.S, true);
                        dkVar.b.add(drVar.S);
                    }
                }
            }
        }
    }

    private static void a(ky<String, String> kyVar, String str, String str2) {
        if (str != null && str2 != null) {
            for (int i = 0; i < kyVar.size(); i++) {
                if (str.equals(kyVar.c(i))) {
                    kyVar.a(i, (Object) str2);
                    return;
                }
            }
            kyVar.put(str, str2);
        }
    }

    private static void a(dk dkVar, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                dg.a(dkVar.a, (String) arrayList.get(i), (String) arrayList2.get(i));
            }
        }
    }

    void a(dk dkVar, ky<String, View> kyVar, boolean z) {
        int size = this.v == null ? 0 : this.v.size();
        for (int i = 0; i < size; i++) {
            String str = (String) this.u.get(i);
            View view = (View) kyVar.get((String) this.v.get(i));
            if (view != null) {
                String e = gwb.e(view);
                if (z) {
                    dg.a(dkVar.a, str, e);
                } else {
                    dg.a(dkVar.a, e, str);
                }
            }
        }
    }

    static void b(dk dkVar, ky<String, View> kyVar, boolean z) {
        int size = kyVar.size();
        for (int i = 0; i < size; i++) {
            String str = (String) kyVar.b(i);
            String e = gwb.e((View) kyVar.c(i));
            if (z) {
                dg.a(dkVar.a, str, e);
            } else {
                dg.a(dkVar.a, e, str);
            }
        }
    }
}
