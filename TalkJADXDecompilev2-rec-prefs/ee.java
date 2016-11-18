package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class ee extends ed implements mw {
    static final Interpolator f11260A = new DecelerateInterpolator(2.5f);
    static final Interpolator f11261B = new DecelerateInterpolator(1.5f);
    static final Interpolator f11262C = new AccelerateInterpolator(2.5f);
    static final Interpolator f11263D = new AccelerateInterpolator(1.5f);
    static boolean f11264a = false;
    static final boolean f11265b;
    static Field f11266r = null;
    ArrayList<Runnable> f11267c;
    Runnable[] f11268d;
    boolean f11269e;
    ArrayList<dr> f11270f;
    ArrayList<dr> f11271g;
    ArrayList<Integer> f11272h;
    ArrayList<dg> f11273i;
    ArrayList<dr> f11274j;
    ArrayList<dg> f11275k;
    ArrayList<Integer> f11276l;
    ArrayList<C0000a> f11277m;
    int f11278n = 0;
    ec f11279o;
    ea f11280p;
    dr f11281q;
    boolean f11282s;
    boolean f11283t;
    boolean f11284u;
    String f11285v;
    boolean f11286w;
    Bundle f11287x = null;
    SparseArray<Parcelable> f11288y = null;
    Runnable f11289z = new ef(this);

    ee() {
    }

    static {
        boolean z = false;
        if (VERSION.SDK_INT >= 11) {
            z = true;
        }
        f11265b = z;
    }

    private void m13640a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new lb("FragmentManager"));
        if (this.f11279o != null) {
            try {
                this.f11279o.mo1766a("  ", null, printWriter, new String[0]);
            } catch (Throwable e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            try {
                mo1847a("  ", null, printWriter, new String[0]);
            } catch (Throwable e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        }
        throw runtimeException;
    }

    public ew mo1845a() {
        return new dg(this);
    }

    public boolean mo1848b() {
        return m13688g();
    }

    public boolean mo1849c() {
        m13646u();
        mo1848b();
        return m13669a(null, -1, 0);
    }

    public void mo1846a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Bad id: " + i);
        }
        m13663a(new eg(this, i, 1), false);
    }

    private void m13638a(Bundle bundle, String str, dr drVar) {
        if (drVar.f753p < 0) {
            m13640a(new IllegalStateException("Fragment " + drVar + " is not currently in the FragmentManager"));
        }
        bundle.putInt(str, drVar.f753p);
    }

    private dr m13635a(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        if (i >= this.f11270f.size()) {
            m13640a(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
        }
        dr drVar = (dr) this.f11270f.get(i);
        if (drVar != null) {
            return drVar;
        }
        m13640a(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
        return drVar;
    }

    public List<dr> mo1850d() {
        return this.f11270f;
    }

    public boolean mo1851e() {
        return this.f11284u;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("FragmentManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        if (this.f11281q != null) {
            gwb.m1860a(this.f11281q, stringBuilder);
        } else {
            gwb.m1860a(this.f11279o, stringBuilder);
        }
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }

    public void mo1847a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int i;
        dr drVar;
        int i2 = 0;
        String str2 = str + "    ";
        if (this.f11270f != null) {
            size = this.f11270f.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.print("Active Fragments in ");
                printWriter.print(Integer.toHexString(System.identityHashCode(this)));
                printWriter.println(":");
                for (i = 0; i < size; i++) {
                    drVar = (dr) this.f11270f.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(drVar);
                    if (drVar != null) {
                        drVar.dump(str2, fileDescriptor, printWriter, strArr);
                    }
                }
            }
        }
        if (this.f11271g != null) {
            size = this.f11271g.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Added Fragments:");
                for (i = 0; i < size; i++) {
                    drVar = (dr) this.f11271g.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(drVar.toString());
                }
            }
        }
        if (this.f11274j != null) {
            size = this.f11274j.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Fragments Created Menus:");
                for (i = 0; i < size; i++) {
                    drVar = (dr) this.f11274j.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(drVar.toString());
                }
            }
        }
        if (this.f11273i != null) {
            size = this.f11273i.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack:");
                for (i = 0; i < size; i++) {
                    dg dgVar = (dg) this.f11273i.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(dgVar.toString());
                    dgVar.m11671a(str2, printWriter);
                }
            }
        }
        synchronized (this) {
            if (this.f11275k != null) {
                int size2 = this.f11275k.size();
                if (size2 > 0) {
                    printWriter.print(str);
                    printWriter.println("Back Stack Indices:");
                    for (i = 0; i < size2; i++) {
                        dgVar = (dg) this.f11275k.get(i);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i);
                        printWriter.print(": ");
                        printWriter.println(dgVar);
                    }
                }
            }
            if (this.f11276l != null && this.f11276l.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f11276l.toArray()));
            }
        }
        if (this.f11267c != null) {
            i = this.f11267c.size();
            if (i > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                while (i2 < i) {
                    Runnable runnable = (Runnable) this.f11267c.get(i2);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i2);
                    printWriter.print(": ");
                    printWriter.println(runnable);
                    i2++;
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f11279o);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f11280p);
        if (this.f11281q != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f11281q);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f11278n);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f11283t);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f11284u);
        if (this.f11282s) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f11282s);
        }
        if (this.f11285v != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.f11285v);
        }
        if (this.f11272h != null && this.f11272h.size() > 0) {
            printWriter.print(str);
            printWriter.print("  mAvailIndices: ");
            printWriter.println(Arrays.toString(this.f11272h.toArray()));
        }
    }

    private static Animation m13633a(float f, float f2, float f3, float f4) {
        Animation animationSet = new AnimationSet(false);
        Animation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f11260A);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        scaleAnimation = new AlphaAnimation(f3, f4);
        scaleAnimation.setInterpolator(f11261B);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        return animationSet;
    }

    private static Animation m13632a(float f, float f2) {
        Animation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(f11261B);
        alphaAnimation.setDuration(220);
        return alphaAnimation;
    }

    private Animation m13634a(dr drVar, int i, boolean z, int i2) {
        Animation onCreateAnimation = drVar.onCreateAnimation(i, z, drVar.f738Q);
        if (onCreateAnimation != null) {
            return onCreateAnimation;
        }
        if (drVar.f738Q != 0) {
            onCreateAnimation = AnimationUtils.loadAnimation(this.f11279o.m13033i(), drVar.f738Q);
            if (onCreateAnimation != null) {
                return onCreateAnimation;
            }
        }
        if (i == 0) {
            return null;
        }
        Object obj = -1;
        switch (i) {
            case 4097:
                if (!z) {
                    obj = 2;
                    break;
                }
                obj = 1;
                break;
            case 4099:
                if (!z) {
                    obj = 6;
                    break;
                }
                obj = 5;
                break;
            case 8194:
                if (!z) {
                    obj = 4;
                    break;
                }
                obj = 3;
                break;
        }
        if (obj < null) {
            return null;
        }
        switch (obj) {
            case 1:
                return ee.m13633a(1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return ee.m13633a(1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return ee.m13633a(0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return ee.m13633a(1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return ee.m13632a(0.0f, 1.0f);
            case 6:
                return ee.m13632a(1.0f, 0.0f);
            default:
                if (i2 == 0 && this.f11279o.mo1771e()) {
                    i2 = this.f11279o.mo1772f();
                }
                if (i2 == 0) {
                    return null;
                }
                return null;
        }
    }

    public void m13658a(dr drVar) {
        if (!drVar.f742U) {
            return;
        }
        if (this.f11269e) {
            this.f11286w = true;
            return;
        }
        drVar.f742U = false;
        m13660a(drVar, this.f11278n, 0, 0, false);
    }

    private static void m13639a(View view, Animation animation) {
        Object obj = null;
        if (view != null && animation != null) {
            if (VERSION.SDK_INT >= 19 && oa.a.b(view) == 0 && oa.a.t(view)) {
                Object obj2;
                if (animation instanceof AlphaAnimation) {
                    obj2 = 1;
                } else {
                    if (animation instanceof AnimationSet) {
                        List animations = ((AnimationSet) animation).getAnimations();
                        for (int i = 0; i < animations.size(); i++) {
                            if (animations.get(i) instanceof AlphaAnimation) {
                                i = 1;
                                break;
                            }
                        }
                    }
                    obj2 = null;
                }
                if (obj2 != null) {
                    obj = 1;
                }
            }
            if (obj != null) {
                AnimationListener animationListener;
                try {
                    if (f11266r == null) {
                        Field declaredField = Animation.class.getDeclaredField("mListener");
                        f11266r = declaredField;
                        declaredField.setAccessible(true);
                    }
                    animationListener = (AnimationListener) f11266r.get(animation);
                } catch (Throwable e) {
                    Log.e("FragmentManager", "No field with the name mListener is found in Animation class", e);
                    animationListener = null;
                } catch (Throwable e2) {
                    Log.e("FragmentManager", "Cannot access Animation's mListener field", e2);
                    animationListener = null;
                }
                oa.a(view, 2, null);
                animation.setAnimationListener(new ei(view, animation, animationListener));
            }
        }
    }

    boolean m13678b(int i) {
        return this.f11278n > 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void m13660a(dr drVar, int i, int i2, int i3, boolean z) {
        if ((!drVar.f759v || drVar.f732K) && i > 1) {
            i = 1;
        }
        if (drVar.f760w && r12 > drVar.f748k) {
            i = drVar.f748k;
        }
        if (drVar.f742U && drVar.f748k < 4 && r12 > 3) {
            i = 3;
        }
        if (drVar.f748k >= i) {
            if (drVar.f748k > i) {
                switch (drVar.f748k) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        if (i < 5) {
                            if (f11264a) {
                                new StringBuilder("movefrom RESUMED: ").append(drVar);
                            }
                            drVar.m1245k();
                            break;
                        }
                        break;
                    default:
                        break;
                }
            }
        } else if (!drVar.f761x || drVar.f762y) {
            if (drVar.f749l != null) {
                drVar.f749l = null;
                m13660a(drVar, drVar.f750m, 0, 0, true);
            }
            switch (drVar.f748k) {
                case 0:
                    ee eeVar;
                    if (f11264a) {
                        new StringBuilder("moveto CREATED: ").append(drVar);
                    }
                    if (drVar.f751n != null) {
                        drVar.f751n.setClassLoader(this.f11279o.m13033i().getClassLoader());
                        drVar.f752o = drVar.f751n.getSparseParcelableArray("android:view_state");
                        drVar.f756s = m13635a(drVar.f751n, "android:target_state");
                        if (drVar.f756s != null) {
                            drVar.f758u = drVar.f751n.getInt("android:target_req_state", 0);
                        }
                        drVar.f743V = drVar.f751n.getBoolean("android:user_visible_hint", true);
                        if (!drVar.f743V) {
                            drVar.f742U = true;
                            if (i > 3) {
                                i = 3;
                            }
                        }
                    }
                    drVar.f724C = this.f11279o;
                    drVar.f727F = this.f11281q;
                    if (this.f11281q != null) {
                        eeVar = this.f11281q.f725D;
                    } else {
                        eeVar = this.f11279o.m13035k();
                    }
                    drVar.f723B = eeVar;
                    drVar.f737P = false;
                    drVar.onAttach(this.f11279o.m13033i());
                    if (drVar.f737P) {
                        if (drVar.f727F == null) {
                            this.f11279o.mo1762a(drVar);
                        } else {
                            drVar.f727F.onAttachFragment(drVar);
                        }
                        if (drVar.f734M) {
                            drVar.m1233b(drVar.f751n);
                            drVar.f748k = 1;
                        } else {
                            drVar.m1236c(drVar.f751n);
                        }
                        drVar.f734M = false;
                        if (drVar.f761x) {
                            drVar.f740S = drVar.m1226a(drVar.getLayoutInflater(drVar.f751n), null, drVar.f751n);
                            if (drVar.f740S == null) {
                                drVar.f741T = null;
                                break;
                            }
                            drVar.f741T = drVar.f740S;
                            if (VERSION.SDK_INT >= 11) {
                                oa.b(drVar.f740S, false);
                            } else {
                                drVar.f740S = fn.m15691a(drVar.f740S);
                            }
                            if (drVar.f731J) {
                                drVar.f740S.setVisibility(8);
                            }
                            drVar.onViewCreated(drVar.f740S, drVar.f751n);
                            break;
                        }
                    }
                    throw new hp("Fragment " + drVar + " did not call through to super.onAttach()");
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        } else {
            return;
        }
        if (drVar.f748k != i) {
            new StringBuilder("moveToState: Fragment state for ").append(drVar).append(" not updated inline; expected state ").append(i).append(" found ").append(drVar.f748k);
            drVar.f748k = i;
        }
        m13640a(new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(drVar.f729H) + " (" + r1 + ") for fragment " + drVar));
        drVar.f739R = r0;
        drVar.f740S = drVar.m1226a(drVar.getLayoutInflater(drVar.f751n), r0, drVar.f751n);
        if (drVar.f740S != null) {
            drVar.f741T = drVar.f740S;
            if (VERSION.SDK_INT >= 11) {
                oa.b(drVar.f740S, false);
            } else {
                drVar.f740S = fn.m15691a(drVar.f740S);
            }
            if (r0 != null) {
                Animation a = m13634a(drVar, i2, true, i3);
                if (a != null) {
                    ee.m13639a(drVar.f740S, a);
                    drVar.f740S.startAnimation(a);
                }
                r0.addView(drVar.f740S);
            }
            if (drVar.f731J) {
                drVar.f740S.setVisibility(8);
            }
            drVar.onViewCreated(drVar.f740S, drVar.f751n);
        } else {
            drVar.f741T = null;
        }
        drVar.m1237d(drVar.f751n);
        if (drVar.f740S != null) {
            Bundle bundle = drVar.f751n;
            if (drVar.f752o != null) {
                drVar.f741T.restoreHierarchyState(drVar.f752o);
                drVar.f752o = null;
            }
            drVar.f737P = false;
            drVar.onViewStateRestored(bundle);
            if (!drVar.f737P) {
                throw new hp("Fragment " + drVar + " did not call through to super.onViewStateRestored()");
            }
        }
        drVar.f751n = null;
        if (i > 2) {
            drVar.f748k = 3;
        }
        if (i > 3) {
            if (f11264a) {
                new StringBuilder("moveto STARTED: ").append(drVar);
            }
            drVar.m1242h();
        }
        if (i > 4) {
            if (f11264a) {
                new StringBuilder("moveto RESUMED: ").append(drVar);
            }
            drVar.m1243i();
            drVar.f751n = null;
            drVar.f752o = null;
        }
        if (drVar.f748k != i) {
            new StringBuilder("moveToState: Fragment state for ").append(drVar).append(" not updated inline; expected state ").append(i).append(" found ").append(drVar.f748k);
            drVar.f748k = i;
        }
    }

    private void m13641c(dr drVar) {
        m13660a(drVar, this.f11278n, 0, 0, false);
    }

    private void m13637a(int i, boolean z) {
        m13655a(i, 0, 0, false);
    }

    void m13655a(int i, int i2, int i3, boolean z) {
        if (this.f11279o == null && i != 0) {
            throw new IllegalStateException("No host");
        } else if (z || this.f11278n != i) {
            this.f11278n = i;
            if (this.f11270f != null) {
                int i4 = 0;
                int i5 = 0;
                while (i4 < this.f11270f.size()) {
                    int a;
                    dr drVar = (dr) this.f11270f.get(i4);
                    if (drVar != null) {
                        m13660a(drVar, i, i2, i3, false);
                        if (drVar.f744W != null) {
                            a = i5 | drVar.f744W.mo1996a();
                            i4++;
                            i5 = a;
                        }
                    }
                    a = i5;
                    i4++;
                    i5 = a;
                }
                if (i5 == 0) {
                    m13687f();
                }
                if (this.f11282s && this.f11279o != null && this.f11278n == 5) {
                    this.f11279o.mo1770d();
                    this.f11282s = false;
                }
            }
        }
    }

    void m13687f() {
        if (this.f11270f != null) {
            for (int i = 0; i < this.f11270f.size(); i++) {
                dr drVar = (dr) this.f11270f.get(i);
                if (drVar != null) {
                    m13658a(drVar);
                }
            }
        }
    }

    void m13673b(dr drVar) {
        if (drVar.f753p < 0) {
            if (this.f11272h == null || this.f11272h.size() <= 0) {
                if (this.f11270f == null) {
                    this.f11270f = new ArrayList();
                }
                drVar.m1228a(this.f11270f.size(), this.f11281q);
                this.f11270f.add(drVar);
            } else {
                drVar.m1228a(((Integer) this.f11272h.remove(this.f11272h.size() - 1)).intValue(), this.f11281q);
                this.f11270f.set(drVar.f753p, drVar);
            }
            if (f11264a) {
                new StringBuilder("Allocated fragment index ").append(drVar);
            }
        }
    }

    private void m13643d(dr drVar) {
        if (drVar.f753p >= 0) {
            if (f11264a) {
                new StringBuilder("Freeing fragment index ").append(drVar);
            }
            this.f11270f.set(drVar.f753p, null);
            if (this.f11272h == null) {
                this.f11272h = new ArrayList();
            }
            this.f11272h.add(Integer.valueOf(drVar.f753p));
            this.f11279o.m13024b(drVar.f754q);
            drVar.m1241f();
        }
    }

    public void m13661a(dr drVar, boolean z) {
        if (this.f11271g == null) {
            this.f11271g = new ArrayList();
        }
        if (f11264a) {
            new StringBuilder("add: ").append(drVar);
        }
        m13673b(drVar);
        if (!drVar.f732K) {
            if (this.f11271g.contains(drVar)) {
                throw new IllegalStateException("Fragment already added: " + drVar);
            }
            this.f11271g.add(drVar);
            drVar.f759v = true;
            drVar.f760w = false;
            if (drVar.f735N && drVar.f736O) {
                this.f11282s = true;
            }
            if (z) {
                m13641c(drVar);
            }
        }
    }

    public void m13659a(dr drVar, int i, int i2) {
        boolean z;
        if (f11264a) {
            new StringBuilder("remove: ").append(drVar).append(" nesting=").append(drVar.f722A);
        }
        if (drVar.f722A > 0) {
            z = true;
        } else {
            z = false;
        }
        z = !z;
        if (!drVar.f732K || z) {
            int i3;
            if (this.f11271g != null) {
                this.f11271g.remove(drVar);
            }
            if (drVar.f735N && drVar.f736O) {
                this.f11282s = true;
            }
            drVar.f759v = false;
            drVar.f760w = true;
            if (z) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            m13660a(drVar, i3, i, i2, false);
        }
    }

    public void m13674b(dr drVar, int i, int i2) {
        if (f11264a) {
            new StringBuilder("hide: ").append(drVar);
        }
        if (!drVar.f731J) {
            drVar.f731J = true;
            if (drVar.f740S != null) {
                Animation a = m13634a(drVar, i, false, i2);
                if (a != null) {
                    ee.m13639a(drVar.f740S, a);
                    drVar.f740S.startAnimation(a);
                }
                drVar.f740S.setVisibility(8);
            }
            if (drVar.f759v && drVar.f735N && drVar.f736O) {
                this.f11282s = true;
            }
            drVar.onHiddenChanged(true);
        }
    }

    public void m13681c(dr drVar, int i, int i2) {
        if (f11264a) {
            new StringBuilder("show: ").append(drVar);
        }
        if (drVar.f731J) {
            drVar.f731J = false;
            if (drVar.f740S != null) {
                Animation a = m13634a(drVar, i, true, i2);
                if (a != null) {
                    ee.m13639a(drVar.f740S, a);
                    drVar.f740S.startAnimation(a);
                }
                drVar.f740S.setVisibility(0);
            }
            if (drVar.f759v && drVar.f735N && drVar.f736O) {
                this.f11282s = true;
            }
            drVar.onHiddenChanged(false);
        }
    }

    public void m13684d(dr drVar, int i, int i2) {
        if (f11264a) {
            new StringBuilder("detach: ").append(drVar);
        }
        if (!drVar.f732K) {
            drVar.f732K = true;
            if (drVar.f759v) {
                if (this.f11271g != null) {
                    if (f11264a) {
                        new StringBuilder("remove from detach: ").append(drVar);
                    }
                    this.f11271g.remove(drVar);
                }
                if (drVar.f735N && drVar.f736O) {
                    this.f11282s = true;
                }
                drVar.f759v = false;
                m13660a(drVar, 1, i, i2, false);
            }
        }
    }

    public void m13685e(dr drVar, int i, int i2) {
        if (f11264a) {
            new StringBuilder("attach: ").append(drVar);
        }
        if (drVar.f732K) {
            drVar.f732K = false;
            if (!drVar.f759v) {
                if (this.f11271g == null) {
                    this.f11271g = new ArrayList();
                }
                if (this.f11271g.contains(drVar)) {
                    throw new IllegalStateException("Fragment already added: " + drVar);
                }
                if (f11264a) {
                    new StringBuilder("add from attach: ").append(drVar);
                }
                this.f11271g.add(drVar);
                drVar.f759v = true;
                if (drVar.f735N && drVar.f736O) {
                    this.f11282s = true;
                }
                m13660a(drVar, this.f11278n, i, i2, false);
            }
        }
    }

    public dr mo1843a(int i) {
        int size;
        dr drVar;
        if (this.f11271g != null) {
            for (size = this.f11271g.size() - 1; size >= 0; size--) {
                drVar = (dr) this.f11271g.get(size);
                if (drVar != null && drVar.f728G == i) {
                    return drVar;
                }
            }
        }
        if (this.f11270f != null) {
            for (size = this.f11270f.size() - 1; size >= 0; size--) {
                drVar = (dr) this.f11270f.get(size);
                if (drVar != null && drVar.f728G == i) {
                    return drVar;
                }
            }
        }
        return null;
    }

    public dr mo1844a(String str) {
        int size;
        dr drVar;
        if (!(this.f11271g == null || str == null)) {
            for (size = this.f11271g.size() - 1; size >= 0; size--) {
                drVar = (dr) this.f11271g.get(size);
                if (drVar != null && str.equals(drVar.f730I)) {
                    return drVar;
                }
            }
        }
        if (!(this.f11270f == null || str == null)) {
            for (size = this.f11270f.size() - 1; size >= 0; size--) {
                drVar = (dr) this.f11270f.get(size);
                if (drVar != null && str.equals(drVar.f730I)) {
                    return drVar;
                }
            }
        }
        return null;
    }

    public dr m13670b(String str) {
        if (!(this.f11270f == null || str == null)) {
            for (int size = this.f11270f.size() - 1; size >= 0; size--) {
                dr drVar = (dr) this.f11270f.get(size);
                if (drVar != null) {
                    drVar = drVar.m1227a(str);
                    if (drVar != null) {
                        return drVar;
                    }
                }
            }
        }
        return null;
    }

    private void m13646u() {
        if (this.f11283t) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.f11285v != null) {
            throw new IllegalStateException("Can not perform this action inside of " + this.f11285v);
        }
    }

    public void m13663a(Runnable runnable, boolean z) {
        if (!z) {
            m13646u();
        }
        synchronized (this) {
            if (this.f11284u || this.f11279o == null) {
                throw new IllegalStateException("Activity has been destroyed");
            }
            if (this.f11267c == null) {
                this.f11267c = new ArrayList();
            }
            this.f11267c.add(runnable);
            if (this.f11267c.size() == 1) {
                this.f11279o.m13034j().removeCallbacks(this.f11289z);
                this.f11279o.m13034j().post(this.f11289z);
            }
        }
    }

    public int m13649a(dg dgVar) {
        int size;
        synchronized (this) {
            if (this.f11276l == null || this.f11276l.size() <= 0) {
                if (this.f11275k == null) {
                    this.f11275k = new ArrayList();
                }
                size = this.f11275k.size();
                if (f11264a) {
                    new StringBuilder("Setting back stack index ").append(size).append(" to ").append(dgVar);
                }
                this.f11275k.add(dgVar);
            } else {
                size = ((Integer) this.f11276l.remove(this.f11276l.size() - 1)).intValue();
                if (f11264a) {
                    new StringBuilder("Adding back stack index ").append(size).append(" with ").append(dgVar);
                }
                this.f11275k.set(size, dgVar);
            }
        }
        return size;
    }

    private void m13636a(int i, dg dgVar) {
        synchronized (this) {
            if (this.f11275k == null) {
                this.f11275k = new ArrayList();
            }
            int size = this.f11275k.size();
            if (i < size) {
                if (f11264a) {
                    new StringBuilder("Setting back stack index ").append(i).append(" to ").append(dgVar);
                }
                this.f11275k.set(i, dgVar);
            } else {
                while (size < i) {
                    this.f11275k.add(null);
                    if (this.f11276l == null) {
                        this.f11276l = new ArrayList();
                    }
                    if (f11264a) {
                        new StringBuilder("Adding available back stack index ").append(size);
                    }
                    this.f11276l.add(Integer.valueOf(size));
                    size++;
                }
                if (f11264a) {
                    new StringBuilder("Adding back stack index ").append(i).append(" with ").append(dgVar);
                }
                this.f11275k.add(dgVar);
            }
        }
    }

    public void m13680c(int i) {
        synchronized (this) {
            this.f11275k.set(i, null);
            if (this.f11276l == null) {
                this.f11276l = new ArrayList();
            }
            if (f11264a) {
                new StringBuilder("Freeing back stack index ").append(i);
            }
            this.f11276l.add(Integer.valueOf(i));
        }
    }

    public void m13675b(Runnable runnable, boolean z) {
        if (this.f11269e) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (Looper.myLooper() != this.f11279o.m13034j().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else {
            this.f11269e = true;
            runnable.run();
            this.f11269e = false;
            m13647v();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m13688g() {
        if (this.f11269e) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (Looper.myLooper() != this.f11279o.m13034j().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else {
            boolean z = false;
            while (true) {
                synchronized (this) {
                    if (this.f11267c == null || this.f11267c.size() == 0) {
                    } else {
                        int size = this.f11267c.size();
                        if (this.f11268d == null || this.f11268d.length < size) {
                            this.f11268d = new Runnable[size];
                        }
                        this.f11267c.toArray(this.f11268d);
                        this.f11267c.clear();
                        this.f11279o.m13034j().removeCallbacks(this.f11289z);
                    }
                }
                this.f11269e = false;
                z = true;
            }
            m13647v();
            return z;
        }
    }

    private void m13647v() {
        if (this.f11286w) {
            int i = 0;
            for (int i2 = 0; i2 < this.f11270f.size(); i2++) {
                dr drVar = (dr) this.f11270f.get(i2);
                if (!(drVar == null || drVar.f744W == null)) {
                    i |= drVar.f744W.mo1996a();
                }
            }
            if (i == 0) {
                this.f11286w = false;
                m13687f();
            }
        }
    }

    private void m13648w() {
        if (this.f11277m != null) {
            for (int i = 0; i < this.f11277m.size(); i++) {
                this.f11277m.get(i);
            }
        }
    }

    void m13672b(dg dgVar) {
        if (this.f11273i == null) {
            this.f11273i = new ArrayList();
        }
        this.f11273i.add(dgVar);
        m13648w();
    }

    boolean m13669a(String str, int i, int i2) {
        if (this.f11273i == null) {
            return false;
        }
        int i3;
        dg dgVar;
        if (i >= 0 || (i2 & 1) != 0) {
            int size;
            i3 = -1;
            if (i >= 0) {
                size = this.f11273i.size() - 1;
                while (size >= 0) {
                    dgVar = (dg) this.f11273i.get(size);
                    if (i >= 0 && i == dgVar.f9656p) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    size--;
                    while (size >= 0) {
                        dgVar = (dg) this.f11273i.get(size);
                        if (i < 0 || i != dgVar.f9656p) {
                            break;
                        }
                        size--;
                    }
                }
                i3 = size;
            }
            if (i3 == this.f11273i.size() - 1) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (size = this.f11273i.size() - 1; size > i3; size--) {
                arrayList.add(this.f11273i.remove(size));
            }
            int size2 = arrayList.size() - 1;
            SparseArray sparseArray = new SparseArray();
            SparseArray sparseArray2 = new SparseArray();
            if (this.f11278n > 0) {
                for (size = 0; size <= size2; size++) {
                    ((dg) arrayList.get(size)).m11667a(sparseArray, sparseArray2);
                }
            }
            dk dkVar = null;
            int i4 = 0;
            while (i4 <= size2) {
                boolean z;
                if (f11264a) {
                    new StringBuilder("Popping back stack state: ").append(arrayList.get(i4));
                }
                dgVar = (dg) arrayList.get(i4);
                if (i4 == size2) {
                    z = true;
                } else {
                    z = false;
                }
                i4++;
                dkVar = dgVar.m11660a(z, dkVar, sparseArray, sparseArray2);
            }
        } else {
            i3 = this.f11273i.size() - 1;
            if (i3 < 0) {
                return false;
            }
            dgVar = (dg) this.f11273i.remove(i3);
            SparseArray sparseArray3 = new SparseArray();
            SparseArray sparseArray4 = new SparseArray();
            if (this.f11278n > 0) {
                dgVar.m11667a(sparseArray3, sparseArray4);
            }
            dgVar.m11660a(true, null, sparseArray3, sparseArray4);
        }
        m13648w();
        return true;
    }

    el m13689h() {
        List list;
        List list2;
        if (this.f11270f != null) {
            int i = 0;
            list = null;
            list2 = null;
            while (i < this.f11270f.size()) {
                ArrayList arrayList;
                dr drVar = (dr) this.f11270f.get(i);
                if (drVar != null) {
                    boolean z;
                    if (drVar.f733L) {
                        if (list2 == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(drVar);
                        drVar.f734M = true;
                        drVar.f757t = drVar.f756s != null ? drVar.f756s.f753p : -1;
                        if (f11264a) {
                            new StringBuilder("retainNonConfig: keeping retained ").append(drVar);
                        }
                    }
                    if (drVar.f725D != null) {
                        el h = drVar.f725D.m13689h();
                        if (h != null) {
                            ArrayList arrayList2;
                            if (list == null) {
                                arrayList2 = new ArrayList();
                                for (int i2 = 0; i2 < i; i2++) {
                                    arrayList2.add(null);
                                }
                            } else {
                                arrayList2 = list;
                            }
                            arrayList2.add(h);
                            list = arrayList2;
                            z = true;
                            if (!(list == null || r0)) {
                                list.add(null);
                            }
                        }
                    }
                    z = false;
                    list.add(null);
                }
                i++;
                Object obj = arrayList;
            }
        } else {
            list = null;
            list2 = null;
        }
        if (list2 == null && list == null) {
            return null;
        }
        return new el(list2, list);
    }

    private void m13644e(dr drVar) {
        if (drVar.f741T != null) {
            if (this.f11288y == null) {
                this.f11288y = new SparseArray();
            } else {
                this.f11288y.clear();
            }
            drVar.f741T.saveHierarchyState(this.f11288y);
            if (this.f11288y.size() > 0) {
                drVar.f752o = this.f11288y;
                this.f11288y = null;
            }
        }
    }

    private Bundle m13645f(dr drVar) {
        Bundle bundle;
        if (this.f11287x == null) {
            this.f11287x = new Bundle();
        }
        drVar.m1239e(this.f11287x);
        if (this.f11287x.isEmpty()) {
            bundle = null;
        } else {
            bundle = this.f11287x;
            this.f11287x = null;
        }
        if (drVar.f740S != null) {
            m13644e(drVar);
        }
        if (drVar.f752o != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", drVar.f752o);
        }
        if (!drVar.f743V) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", drVar.f743V);
        }
        return bundle;
    }

    Parcelable m13690i() {
        dl[] dlVarArr = null;
        m13688g();
        if (f11265b) {
            this.f11283t = true;
        }
        if (this.f11270f == null || this.f11270f.size() <= 0) {
            return null;
        }
        int size = this.f11270f.size();
        ep[] epVarArr = new ep[size];
        int i = 0;
        boolean z = false;
        while (i < size) {
            boolean z2;
            dr drVar = (dr) this.f11270f.get(i);
            if (drVar != null) {
                if (drVar.f753p < 0) {
                    m13640a(new IllegalStateException("Failure saving state: active " + drVar + " has cleared index: " + drVar.f753p));
                }
                ep epVar = new ep(drVar);
                epVarArr[i] = epVar;
                if (drVar.f748k <= 0 || epVar.f11969k != null) {
                    epVar.f11969k = drVar.f751n;
                } else {
                    epVar.f11969k = m13645f(drVar);
                    if (drVar.f756s != null) {
                        if (drVar.f756s.f753p < 0) {
                            m13640a(new IllegalStateException("Failure saving state: " + drVar + " has target not in fragment manager: " + drVar.f756s));
                        }
                        if (epVar.f11969k == null) {
                            epVar.f11969k = new Bundle();
                        }
                        m13638a(epVar.f11969k, "android:target_state", drVar.f756s);
                        if (drVar.f758u != 0) {
                            epVar.f11969k.putInt("android:target_req_state", drVar.f758u);
                        }
                    }
                }
                if (f11264a) {
                    new StringBuilder("Saved state of ").append(drVar).append(": ").append(epVar.f11969k);
                }
                z2 = true;
            } else {
                z2 = z;
            }
            i++;
            z = z2;
        }
        if (!z) {
            return null;
        }
        int[] iArr;
        int i2;
        em emVar;
        if (this.f11271g != null) {
            i = this.f11271g.size();
            if (i > 0) {
                iArr = new int[i];
                for (i2 = 0; i2 < i; i2++) {
                    iArr[i2] = ((dr) this.f11271g.get(i2)).f753p;
                    if (iArr[i2] < 0) {
                        m13640a(new IllegalStateException("Failure saving state: active " + this.f11271g.get(i2) + " has cleared index: " + iArr[i2]));
                    }
                    if (f11264a) {
                        new StringBuilder("saveAllState: adding fragment #").append(i2).append(": ").append(this.f11271g.get(i2));
                    }
                }
                if (this.f11273i != null) {
                    i = this.f11273i.size();
                    if (i > 0) {
                        dlVarArr = new dl[i];
                        for (i2 = 0; i2 < i; i2++) {
                            dlVarArr[i2] = new dl((dg) this.f11273i.get(i2));
                            if (f11264a) {
                                new StringBuilder("saveAllState: adding back stack #").append(i2).append(": ").append(this.f11273i.get(i2));
                            }
                        }
                    }
                }
                emVar = new em();
                emVar.f11833a = epVarArr;
                emVar.f11834b = iArr;
                emVar.f11835c = dlVarArr;
                return emVar;
            }
        }
        iArr = null;
        if (this.f11273i != null) {
            i = this.f11273i.size();
            if (i > 0) {
                dlVarArr = new dl[i];
                for (i2 = 0; i2 < i; i2++) {
                    dlVarArr[i2] = new dl((dg) this.f11273i.get(i2));
                    if (f11264a) {
                        new StringBuilder("saveAllState: adding back stack #").append(i2).append(": ").append(this.f11273i.get(i2));
                    }
                }
            }
        }
        emVar = new em();
        emVar.f11833a = epVarArr;
        emVar.f11834b = iArr;
        emVar.f11835c = dlVarArr;
        return emVar;
    }

    void m13657a(Parcelable parcelable, el elVar) {
        if (parcelable != null) {
            em emVar = (em) parcelable;
            if (emVar.f11833a != null) {
                List a;
                int size;
                int i;
                dr drVar;
                List list;
                if (elVar != null) {
                    a = elVar.m14097a();
                    List b = elVar.m14098b();
                    if (a != null) {
                        size = a.size();
                    } else {
                        boolean z = false;
                    }
                    for (i = 0; i < size; i++) {
                        drVar = (dr) a.get(i);
                        if (f11264a) {
                            new StringBuilder("restoreAllState: re-attaching retained ").append(drVar);
                        }
                        ep epVar = emVar.f11833a[drVar.f753p];
                        epVar.f11970l = drVar;
                        drVar.f752o = null;
                        drVar.f722A = 0;
                        drVar.f762y = false;
                        drVar.f759v = false;
                        drVar.f756s = null;
                        if (epVar.f11969k != null) {
                            epVar.f11969k.setClassLoader(this.f11279o.m13033i().getClassLoader());
                            drVar.f752o = epVar.f11969k.getSparseParcelableArray("android:view_state");
                            drVar.f751n = epVar.f11969k;
                        }
                    }
                    list = b;
                } else {
                    list = null;
                }
                this.f11270f = new ArrayList(emVar.f11833a.length);
                if (this.f11272h != null) {
                    this.f11272h.clear();
                }
                int i2 = 0;
                while (i2 < emVar.f11833a.length) {
                    ep epVar2 = emVar.f11833a[i2];
                    if (epVar2 != null) {
                        el elVar2;
                        if (list == null || i2 >= list.size()) {
                            elVar2 = null;
                        } else {
                            elVar2 = (el) list.get(i2);
                        }
                        drVar = epVar2.m14208a(this.f11279o, this.f11281q, elVar2);
                        if (f11264a) {
                            new StringBuilder("restoreAllState: active #").append(i2).append(": ").append(drVar);
                        }
                        this.f11270f.add(drVar);
                        epVar2.f11970l = null;
                    } else {
                        this.f11270f.add(null);
                        if (this.f11272h == null) {
                            this.f11272h = new ArrayList();
                        }
                        if (f11264a) {
                            new StringBuilder("restoreAllState: avail #").append(i2);
                        }
                        this.f11272h.add(Integer.valueOf(i2));
                    }
                    i2++;
                }
                if (elVar != null) {
                    a = elVar.m14097a();
                    if (a != null) {
                        i2 = a.size();
                    } else {
                        boolean z2 = false;
                    }
                    for (i = 0; i < i2; i++) {
                        drVar = (dr) a.get(i);
                        if (drVar.f757t >= 0) {
                            if (drVar.f757t < this.f11270f.size()) {
                                drVar.f756s = (dr) this.f11270f.get(drVar.f757t);
                            } else {
                                new StringBuilder("Re-attaching retained fragment ").append(drVar).append(" target no longer exists: ").append(drVar.f757t);
                                drVar.f756s = null;
                            }
                        }
                    }
                }
                if (emVar.f11834b != null) {
                    this.f11271g = new ArrayList(emVar.f11834b.length);
                    for (size = 0; size < emVar.f11834b.length; size++) {
                        drVar = (dr) this.f11270f.get(emVar.f11834b[size]);
                        if (drVar == null) {
                            m13640a(new IllegalStateException("No instantiated fragment for index #" + emVar.f11834b[size]));
                        }
                        drVar.f759v = true;
                        if (f11264a) {
                            new StringBuilder("restoreAllState: added #").append(size).append(": ").append(drVar);
                        }
                        if (this.f11271g.contains(drVar)) {
                            throw new IllegalStateException("Already added!");
                        }
                        this.f11271g.add(drVar);
                    }
                } else {
                    this.f11271g = null;
                }
                if (emVar.f11835c != null) {
                    this.f11273i = new ArrayList(emVar.f11835c.length);
                    for (int i3 = 0; i3 < emVar.f11835c.length; i3++) {
                        dg a2 = emVar.f11835c[i3].m12181a(this);
                        if (f11264a) {
                            new StringBuilder("restoreAllState: back stack #").append(i3).append(" (index ").append(a2.f9656p).append("): ").append(a2);
                            a2.m11672a("  ", new PrintWriter(new lb("FragmentManager")), false);
                        }
                        this.f11273i.add(a2);
                        if (a2.f9656p >= 0) {
                            m13636a(a2.f9656p, a2);
                        }
                    }
                    return;
                }
                this.f11273i = null;
            }
        }
    }

    public void m13662a(ec ecVar, ea eaVar, dr drVar) {
        if (this.f11279o != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f11279o = ecVar;
        this.f11280p = eaVar;
        this.f11281q = drVar;
    }

    public void noteStateNotSaved() {
        this.f11283t = false;
    }

    public void m13691j() {
        this.f11283t = false;
        m13637a(1, false);
    }

    public void m13692k() {
        this.f11283t = false;
        m13637a(2, false);
    }

    public void m13693l() {
        this.f11283t = false;
        m13637a(4, false);
    }

    public void m13694m() {
        this.f11283t = false;
        m13637a(5, false);
    }

    public void m13695n() {
        m13637a(4, false);
    }

    public void m13696o() {
        this.f11283t = true;
        m13637a(3, false);
    }

    public void m13697p() {
        m13637a(2, false);
    }

    public void m13698q() {
        m13637a(1, false);
    }

    public void m13699r() {
        this.f11284u = true;
        m13688g();
        m13637a(0, false);
        this.f11279o = null;
        this.f11280p = null;
        this.f11281q = null;
    }

    public void m13665a(boolean z) {
        if (this.f11271g != null) {
            for (int size = this.f11271g.size() - 1; size >= 0; size--) {
                dr drVar = (dr) this.f11271g.get(size);
                if (drVar != null) {
                    drVar.m1238d(z);
                }
            }
        }
    }

    public void m13676b(boolean z) {
        if (this.f11271g != null) {
            for (int size = this.f11271g.size() - 1; size >= 0; size--) {
                dr drVar = (dr) this.f11271g.get(size);
                if (drVar != null) {
                    drVar.m1240e(z);
                }
            }
        }
    }

    public void m13656a(Configuration configuration) {
        if (this.f11271g != null) {
            for (int i = 0; i < this.f11271g.size(); i++) {
                dr drVar = (dr) this.f11271g.get(i);
                if (drVar != null) {
                    drVar.m1229a(configuration);
                }
            }
        }
    }

    public void m13700s() {
        if (this.f11271g != null) {
            for (int i = 0; i < this.f11271g.size(); i++) {
                dr drVar = (dr) this.f11271g.get(i);
                if (drVar != null) {
                    drVar.m1244j();
                }
            }
        }
    }

    public boolean m13667a(Menu menu, MenuInflater menuInflater) {
        boolean z;
        dr drVar;
        int i = 0;
        ArrayList arrayList = null;
        if (this.f11271g != null) {
            int i2 = 0;
            z = false;
            while (i2 < this.f11271g.size()) {
                drVar = (dr) this.f11271g.get(i2);
                if (drVar != null && drVar.m1231a(menu, menuInflater)) {
                    z = true;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(drVar);
                }
                i2++;
                z = z;
            }
        } else {
            z = false;
        }
        if (this.f11274j != null) {
            while (i < this.f11274j.size()) {
                drVar = (dr) this.f11274j.get(i);
                if (arrayList == null || !arrayList.contains(drVar)) {
                    drVar.onDestroyOptionsMenu();
                }
                i++;
            }
        }
        this.f11274j = arrayList;
        return z;
    }

    public boolean m13666a(Menu menu) {
        if (this.f11271g == null) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.f11271g.size(); i++) {
            dr drVar = (dr) this.f11271g.get(i);
            if (drVar != null && drVar.m1230a(menu)) {
                z = true;
            }
        }
        return z;
    }

    public boolean m13668a(MenuItem menuItem) {
        if (this.f11271g == null) {
            return false;
        }
        for (int i = 0; i < this.f11271g.size(); i++) {
            dr drVar = (dr) this.f11271g.get(i);
            if (drVar != null && drVar.m1232a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean m13679b(MenuItem menuItem) {
        if (this.f11271g == null) {
            return false;
        }
        for (int i = 0; i < this.f11271g.size(); i++) {
            dr drVar = (dr) this.f11271g.get(i);
            if (drVar != null && drVar.m1235b(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void m13671b(Menu menu) {
        if (this.f11271g != null) {
            for (int i = 0; i < this.f11271g.size(); i++) {
                dr drVar = (dr) this.f11271g.get(i);
                if (drVar != null) {
                    drVar.m1234b(menu);
                }
            }
        }
    }

    public static int m13642d(int i) {
        switch (i) {
            case 4097:
                return 8194;
            case 4099:
                return 4099;
            case 8194:
                return 4097;
            default:
                return 0;
        }
    }

    public View mo1842a(View view, String str, Context context, AttributeSet attributeSet) {
        if (!"fragment".equals(str)) {
            return null;
        }
        String string;
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ek.f11677a);
        if (attributeValue == null) {
            string = obtainStyledAttributes.getString(0);
        } else {
            string = attributeValue;
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string2 = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!dr.m1225a(this.f11279o.m13033i(), string)) {
            return null;
        }
        int id;
        if (view != null) {
            id = view.getId();
        } else {
            id = 0;
        }
        if (id == -1 && resourceId == -1 && string2 == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + string);
        }
        dr drVar;
        dr a = resourceId != -1 ? mo1843a(resourceId) : null;
        if (a == null && string2 != null) {
            a = mo1844a(string2);
        }
        if (a == null && id != -1) {
            a = mo1843a(id);
        }
        if (f11264a) {
            new StringBuilder("onCreateView: id=0x").append(Integer.toHexString(resourceId)).append(" fname=").append(string).append(" existing=").append(a);
        }
        if (a == null) {
            dr instantiate = dr.instantiate(context, string);
            instantiate.f761x = true;
            instantiate.f728G = resourceId != 0 ? resourceId : id;
            instantiate.f729H = id;
            instantiate.f730I = string2;
            instantiate.f762y = true;
            instantiate.f723B = this;
            instantiate.f724C = this.f11279o;
            instantiate.onInflate(this.f11279o.m13033i(), attributeSet, instantiate.f751n);
            m13661a(instantiate, true);
            drVar = instantiate;
        } else if (a.f762y) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string2 + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + string);
        } else {
            a.f762y = true;
            a.f724C = this.f11279o;
            if (!a.f734M) {
                a.onInflate(this.f11279o.m13033i(), attributeSet, a.f751n);
            }
            drVar = a;
        }
        if (this.f11278n > 0 || !drVar.f761x) {
            m13641c(drVar);
        } else {
            m13660a(drVar, 1, 0, 0, false);
        }
        if (drVar.f740S == null) {
            throw new IllegalStateException("Fragment " + string + " did not create a view.");
        }
        if (resourceId != 0) {
            drVar.f740S.setId(resourceId);
        }
        if (drVar.f740S.getTag() == null) {
            drVar.f740S.setTag(string2);
        }
        return drVar.f740S;
    }

    mw m13701t() {
        return this;
    }
}
