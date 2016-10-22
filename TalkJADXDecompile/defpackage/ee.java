package defpackage;

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
import oa;

/* renamed from: ee */
final class ee extends ed implements mw {
    static final Interpolator A;
    static final Interpolator B;
    static final Interpolator C;
    static final Interpolator D;
    static boolean a;
    static final boolean b;
    static Field r;
    ArrayList<Runnable> c;
    Runnable[] d;
    boolean e;
    ArrayList<dr> f;
    ArrayList<dr> g;
    ArrayList<Integer> h;
    ArrayList<dg> i;
    ArrayList<dr> j;
    ArrayList<dg> k;
    ArrayList<Integer> l;
    ArrayList<a> m;
    int n;
    ec o;
    ea p;
    dr q;
    boolean s;
    boolean t;
    boolean u;
    String v;
    boolean w;
    Bundle x;
    SparseArray<Parcelable> y;
    Runnable z;

    ee() {
        this.n = 0;
        this.x = null;
        this.y = null;
        this.z = new ef(this);
    }

    static {
        boolean z = false;
        a = false;
        if (VERSION.SDK_INT >= 11) {
            z = true;
        }
        b = z;
        r = null;
        A = new DecelerateInterpolator(2.5f);
        B = new DecelerateInterpolator(1.5f);
        C = new AccelerateInterpolator(2.5f);
        D = new AccelerateInterpolator(1.5f);
    }

    private void a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new lb("FragmentManager"));
        if (this.o != null) {
            try {
                this.o.a("  ", null, printWriter, new String[0]);
            } catch (Throwable e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            try {
                a("  ", null, printWriter, new String[0]);
            } catch (Throwable e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        }
        throw runtimeException;
    }

    public ew a() {
        return new dg(this);
    }

    public boolean b() {
        return g();
    }

    public boolean c() {
        u();
        b();
        return a(null, -1, 0);
    }

    public void a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Bad id: " + i);
        }
        a(new eg(this, i, 1), false);
    }

    private void a(Bundle bundle, String str, dr drVar) {
        if (drVar.p < 0) {
            a(new IllegalStateException("Fragment " + drVar + " is not currently in the FragmentManager"));
        }
        bundle.putInt(str, drVar.p);
    }

    private dr a(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        if (i >= this.f.size()) {
            a(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
        }
        dr drVar = (dr) this.f.get(i);
        if (drVar != null) {
            return drVar;
        }
        a(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
        return drVar;
    }

    public List<dr> d() {
        return this.f;
    }

    public boolean e() {
        return this.u;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("FragmentManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        if (this.q != null) {
            gwb.a(this.q, stringBuilder);
        } else {
            gwb.a(this.o, stringBuilder);
        }
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int i;
        dr drVar;
        int i2 = 0;
        String str2 = str + "    ";
        if (this.f != null) {
            size = this.f.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.print("Active Fragments in ");
                printWriter.print(Integer.toHexString(System.identityHashCode(this)));
                printWriter.println(":");
                for (i = 0; i < size; i++) {
                    drVar = (dr) this.f.get(i);
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
        if (this.g != null) {
            size = this.g.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Added Fragments:");
                for (i = 0; i < size; i++) {
                    drVar = (dr) this.g.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(drVar.toString());
                }
            }
        }
        if (this.j != null) {
            size = this.j.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Fragments Created Menus:");
                for (i = 0; i < size; i++) {
                    drVar = (dr) this.j.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(drVar.toString());
                }
            }
        }
        if (this.i != null) {
            size = this.i.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack:");
                for (i = 0; i < size; i++) {
                    dg dgVar = (dg) this.i.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(dgVar.toString());
                    dgVar.a(str2, printWriter);
                }
            }
        }
        synchronized (this) {
            if (this.k != null) {
                int size2 = this.k.size();
                if (size2 > 0) {
                    printWriter.print(str);
                    printWriter.println("Back Stack Indices:");
                    for (i = 0; i < size2; i++) {
                        dgVar = (dg) this.k.get(i);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i);
                        printWriter.print(": ");
                        printWriter.println(dgVar);
                    }
                }
            }
            if (this.l != null && this.l.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.l.toArray()));
            }
        }
        if (this.c != null) {
            i = this.c.size();
            if (i > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                while (i2 < i) {
                    Runnable runnable = (Runnable) this.c.get(i2);
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
        printWriter.println(this.o);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.p);
        if (this.q != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.q);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.n);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.t);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.u);
        if (this.s) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.s);
        }
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.v);
        }
        if (this.h != null && this.h.size() > 0) {
            printWriter.print(str);
            printWriter.print("  mAvailIndices: ");
            printWriter.println(Arrays.toString(this.h.toArray()));
        }
    }

    private static Animation a(float f, float f2, float f3, float f4) {
        Animation animationSet = new AnimationSet(false);
        Animation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(A);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        scaleAnimation = new AlphaAnimation(f3, f4);
        scaleAnimation.setInterpolator(B);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        return animationSet;
    }

    private static Animation a(float f, float f2) {
        Animation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(B);
        alphaAnimation.setDuration(220);
        return alphaAnimation;
    }

    private Animation a(dr drVar, int i, boolean z, int i2) {
        Animation onCreateAnimation = drVar.onCreateAnimation(i, z, drVar.Q);
        if (onCreateAnimation != null) {
            return onCreateAnimation;
        }
        if (drVar.Q != 0) {
            onCreateAnimation = AnimationUtils.loadAnimation(this.o.i(), drVar.Q);
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
            case wi.j /*1*/:
                return ee.a(1.125f, 1.0f, 0.0f, 1.0f);
            case wi.l /*2*/:
                return ee.a(1.0f, 0.975f, 1.0f, 0.0f);
            case wi.z /*3*/:
                return ee.a(0.975f, 1.0f, 0.0f, 1.0f);
            case wi.h /*4*/:
                return ee.a(1.0f, 1.075f, 1.0f, 0.0f);
            case wi.p /*5*/:
                return ee.a(0.0f, 1.0f);
            case wi.s /*6*/:
                return ee.a(1.0f, 0.0f);
            default:
                if (i2 == 0 && this.o.e()) {
                    i2 = this.o.f();
                }
                if (i2 == 0) {
                    return null;
                }
                return null;
        }
    }

    public void a(dr drVar) {
        if (!drVar.U) {
            return;
        }
        if (this.e) {
            this.w = true;
            return;
        }
        drVar.U = false;
        a(drVar, this.n, 0, 0, false);
    }

    private static void a(View view, Animation animation) {
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
                    if (r == null) {
                        Field declaredField = Animation.class.getDeclaredField("mListener");
                        r = declaredField;
                        declaredField.setAccessible(true);
                    }
                    animationListener = (AnimationListener) r.get(animation);
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

    boolean b(int i) {
        return this.n > 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void a(defpackage.dr r11, int r12, int r13, int r14, boolean r15) {
        /*
        r10 = this;
        r9 = 4;
        r6 = 3;
        r5 = 1;
        r3 = 0;
        r7 = 0;
        r0 = r11.v;
        if (r0 == 0) goto L_0x000d;
    L_0x0009:
        r0 = r11.K;
        if (r0 == 0) goto L_0x0010;
    L_0x000d:
        if (r12 <= r5) goto L_0x0010;
    L_0x000f:
        r12 = r5;
    L_0x0010:
        r0 = r11.w;
        if (r0 == 0) goto L_0x001a;
    L_0x0014:
        r0 = r11.k;
        if (r12 <= r0) goto L_0x001a;
    L_0x0018:
        r12 = r11.k;
    L_0x001a:
        r0 = r11.U;
        if (r0 == 0) goto L_0x0025;
    L_0x001e:
        r0 = r11.k;
        if (r0 >= r9) goto L_0x0025;
    L_0x0022:
        if (r12 <= r6) goto L_0x0025;
    L_0x0024:
        r12 = r6;
    L_0x0025:
        r0 = r11.k;
        if (r0 >= r12) goto L_0x02c0;
    L_0x0029:
        r0 = r11.x;
        if (r0 == 0) goto L_0x0032;
    L_0x002d:
        r0 = r11.y;
        if (r0 != 0) goto L_0x0032;
    L_0x0031:
        return;
    L_0x0032:
        r0 = r11.l;
        if (r0 == 0) goto L_0x0040;
    L_0x0036:
        r11.l = r7;
        r2 = r11.m;
        r0 = r10;
        r1 = r11;
        r4 = r3;
        r0.a(r1, r2, r3, r4, r5);
    L_0x0040:
        r0 = r11.k;
        switch(r0) {
            case 0: goto L_0x006c;
            case 1: goto L_0x0150;
            case 2: goto L_0x028f;
            case 3: goto L_0x0294;
            case 4: goto L_0x02a7;
            default: goto L_0x0045;
        };
    L_0x0045:
        r0 = r11.k;
        if (r0 == r12) goto L_0x0031;
    L_0x0049:
        r0 = new java.lang.StringBuilder;
        r1 = "moveToState: Fragment state for ";
        r0.<init>(r1);
        r0 = r0.append(r11);
        r1 = " not updated inline; expected state ";
        r0 = r0.append(r1);
        r0 = r0.append(r12);
        r1 = " found ";
        r0 = r0.append(r1);
        r1 = r11.k;
        r0.append(r1);
        r11.k = r12;
        goto L_0x0031;
    L_0x006c:
        r0 = a;
        if (r0 == 0) goto L_0x007a;
    L_0x0070:
        r0 = new java.lang.StringBuilder;
        r1 = "moveto CREATED: ";
        r0.<init>(r1);
        r0.append(r11);
    L_0x007a:
        r0 = r11.n;
        if (r0 == 0) goto L_0x00c2;
    L_0x007e:
        r0 = r11.n;
        r1 = r10.o;
        r1 = r1.i();
        r1 = r1.getClassLoader();
        r0.setClassLoader(r1);
        r0 = r11.n;
        r1 = "android:view_state";
        r0 = r0.getSparseParcelableArray(r1);
        r11.o = r0;
        r0 = r11.n;
        r1 = "android:target_state";
        r0 = r10.a(r0, r1);
        r11.s = r0;
        r0 = r11.s;
        if (r0 == 0) goto L_0x00af;
    L_0x00a5:
        r0 = r11.n;
        r1 = "android:target_req_state";
        r0 = r0.getInt(r1, r3);
        r11.u = r0;
    L_0x00af:
        r0 = r11.n;
        r1 = "android:user_visible_hint";
        r0 = r0.getBoolean(r1, r5);
        r11.V = r0;
        r0 = r11.V;
        if (r0 != 0) goto L_0x00c2;
    L_0x00bd:
        r11.U = r5;
        if (r12 <= r6) goto L_0x00c2;
    L_0x00c1:
        r12 = r6;
    L_0x00c2:
        r0 = r10.o;
        r11.C = r0;
        r0 = r10.q;
        r11.F = r0;
        r0 = r10.q;
        if (r0 == 0) goto L_0x00fe;
    L_0x00ce:
        r0 = r10.q;
        r0 = r0.D;
    L_0x00d2:
        r11.B = r0;
        r11.P = r3;
        r0 = r10.o;
        r0 = r0.i();
        r11.onAttach(r0);
        r0 = r11.P;
        if (r0 != 0) goto L_0x0105;
    L_0x00e3:
        r0 = new hp;
        r1 = new java.lang.StringBuilder;
        r2 = "Fragment ";
        r1.<init>(r2);
        r1 = r1.append(r11);
        r2 = " did not call through to super.onAttach()";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x00fe:
        r0 = r10.o;
        r0 = r0.k();
        goto L_0x00d2;
    L_0x0105:
        r0 = r11.F;
        if (r0 != 0) goto L_0x025d;
    L_0x0109:
        r0 = r10.o;
        r0.a(r11);
    L_0x010e:
        r0 = r11.M;
        if (r0 != 0) goto L_0x0264;
    L_0x0112:
        r0 = r11.n;
        r11.c(r0);
    L_0x0117:
        r11.M = r3;
        r0 = r11.x;
        if (r0 == 0) goto L_0x0150;
    L_0x011d:
        r0 = r11.n;
        r0 = r11.getLayoutInflater(r0);
        r1 = r11.n;
        r0 = r11.a(r0, r7, r1);
        r11.S = r0;
        r0 = r11.S;
        if (r0 == 0) goto L_0x0277;
    L_0x012f:
        r0 = r11.S;
        r11.T = r0;
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 11;
        if (r0 < r1) goto L_0x026d;
    L_0x0139:
        r0 = r11.S;
        oa.b(r0, r3);
    L_0x013e:
        r0 = r11.J;
        if (r0 == 0) goto L_0x0149;
    L_0x0142:
        r0 = r11.S;
        r1 = 8;
        r0.setVisibility(r1);
    L_0x0149:
        r0 = r11.S;
        r1 = r11.n;
        r11.onViewCreated(r0, r1);
    L_0x0150:
        if (r12 <= r5) goto L_0x028f;
    L_0x0152:
        r0 = a;
        if (r0 == 0) goto L_0x0160;
    L_0x0156:
        r0 = new java.lang.StringBuilder;
        r1 = "moveto ACTIVITY_CREATED: ";
        r0.<init>(r1);
        r0.append(r11);
    L_0x0160:
        r0 = r11.x;
        if (r0 != 0) goto L_0x0221;
    L_0x0164:
        r0 = r11.H;
        if (r0 == 0) goto L_0x03b0;
    L_0x0168:
        r0 = r11.H;
        r1 = -1;
        if (r0 != r1) goto L_0x018a;
    L_0x016d:
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r2 = "Cannot create fragment ";
        r1.<init>(r2);
        r1 = r1.append(r11);
        r2 = " for a container view with no id";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        r10.a(r0);
    L_0x018a:
        r0 = r10.p;
        r1 = r11.H;
        r0 = r0.a(r1);
        r0 = (android.view.ViewGroup) r0;
        if (r0 != 0) goto L_0x01d5;
    L_0x0196:
        r1 = r11.z;
        if (r1 != 0) goto L_0x01d5;
    L_0x019a:
        r1 = r11.getResources();	 Catch:{ NotFoundException -> 0x027b }
        r2 = r11.H;	 Catch:{ NotFoundException -> 0x027b }
        r1 = r1.getResourceName(r2);	 Catch:{ NotFoundException -> 0x027b }
    L_0x01a4:
        r2 = new java.lang.IllegalArgumentException;
        r4 = new java.lang.StringBuilder;
        r8 = "No view found for id 0x";
        r4.<init>(r8);
        r8 = r11.H;
        r8 = java.lang.Integer.toHexString(r8);
        r4 = r4.append(r8);
        r8 = " (";
        r4 = r4.append(r8);
        r1 = r4.append(r1);
        r4 = ") for fragment ";
        r1 = r1.append(r4);
        r1 = r1.append(r11);
        r1 = r1.toString();
        r2.<init>(r1);
        r10.a(r2);
    L_0x01d5:
        r11.R = r0;
        r1 = r11.n;
        r1 = r11.getLayoutInflater(r1);
        r2 = r11.n;
        r1 = r11.a(r1, r0, r2);
        r11.S = r1;
        r1 = r11.S;
        if (r1 == 0) goto L_0x028a;
    L_0x01e9:
        r1 = r11.S;
        r11.T = r1;
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = 11;
        if (r1 < r2) goto L_0x0280;
    L_0x01f3:
        r1 = r11.S;
        oa.b(r1, r3);
    L_0x01f8:
        if (r0 == 0) goto L_0x020f;
    L_0x01fa:
        r1 = r10.a(r11, r13, r5, r14);
        if (r1 == 0) goto L_0x020a;
    L_0x0200:
        r2 = r11.S;
        defpackage.ee.a(r2, r1);
        r2 = r11.S;
        r2.startAnimation(r1);
    L_0x020a:
        r1 = r11.S;
        r0.addView(r1);
    L_0x020f:
        r0 = r11.J;
        if (r0 == 0) goto L_0x021a;
    L_0x0213:
        r0 = r11.S;
        r1 = 8;
        r0.setVisibility(r1);
    L_0x021a:
        r0 = r11.S;
        r1 = r11.n;
        r11.onViewCreated(r0, r1);
    L_0x0221:
        r0 = r11.n;
        r11.d(r0);
        r0 = r11.S;
        if (r0 == 0) goto L_0x028d;
    L_0x022a:
        r0 = r11.n;
        r1 = r11.o;
        if (r1 == 0) goto L_0x0239;
    L_0x0230:
        r1 = r11.T;
        r2 = r11.o;
        r1.restoreHierarchyState(r2);
        r11.o = r7;
    L_0x0239:
        r11.P = r3;
        r11.onViewStateRestored(r0);
        r0 = r11.P;
        if (r0 != 0) goto L_0x028d;
    L_0x0242:
        r0 = new hp;
        r1 = new java.lang.StringBuilder;
        r2 = "Fragment ";
        r1.<init>(r2);
        r1 = r1.append(r11);
        r2 = " did not call through to super.onViewStateRestored()";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x025d:
        r0 = r11.F;
        r0.onAttachFragment(r11);
        goto L_0x010e;
    L_0x0264:
        r0 = r11.n;
        r11.b(r0);
        r11.k = r5;
        goto L_0x0117;
    L_0x026d:
        r0 = r11.S;
        r0 = defpackage.fn.a(r0);
        r11.S = r0;
        goto L_0x013e;
    L_0x0277:
        r11.T = r7;
        goto L_0x0150;
    L_0x027b:
        r1 = move-exception;
        r1 = "unknown";
        goto L_0x01a4;
    L_0x0280:
        r1 = r11.S;
        r1 = defpackage.fn.a(r1);
        r11.S = r1;
        goto L_0x01f8;
    L_0x028a:
        r11.T = r7;
        goto L_0x0221;
    L_0x028d:
        r11.n = r7;
    L_0x028f:
        r0 = 2;
        if (r12 <= r0) goto L_0x0294;
    L_0x0292:
        r11.k = r6;
    L_0x0294:
        if (r12 <= r6) goto L_0x02a7;
    L_0x0296:
        r0 = a;
        if (r0 == 0) goto L_0x02a4;
    L_0x029a:
        r0 = new java.lang.StringBuilder;
        r1 = "moveto STARTED: ";
        r0.<init>(r1);
        r0.append(r11);
    L_0x02a4:
        r11.h();
    L_0x02a7:
        if (r12 <= r9) goto L_0x0045;
    L_0x02a9:
        r0 = a;
        if (r0 == 0) goto L_0x02b7;
    L_0x02ad:
        r0 = new java.lang.StringBuilder;
        r1 = "moveto RESUMED: ";
        r0.<init>(r1);
        r0.append(r11);
    L_0x02b7:
        r11.i();
        r11.n = r7;
        r11.o = r7;
        goto L_0x0045;
    L_0x02c0:
        r0 = r11.k;
        if (r0 <= r12) goto L_0x0045;
    L_0x02c4:
        r0 = r11.k;
        switch(r0) {
            case 1: goto L_0x02cb;
            case 2: goto L_0x031f;
            case 3: goto L_0x030c;
            case 4: goto L_0x02f9;
            case 5: goto L_0x02e5;
            default: goto L_0x02c9;
        };
    L_0x02c9:
        goto L_0x0045;
    L_0x02cb:
        if (r12 > 0) goto L_0x0045;
    L_0x02cd:
        r0 = r10.u;
        if (r0 == 0) goto L_0x02dc;
    L_0x02d1:
        r0 = r11.l;
        if (r0 == 0) goto L_0x02dc;
    L_0x02d5:
        r0 = r11.l;
        r11.l = r7;
        r0.clearAnimation();
    L_0x02dc:
        r0 = r11.l;
        if (r0 == 0) goto L_0x0380;
    L_0x02e0:
        r11.m = r12;
        r12 = r5;
        goto L_0x0045;
    L_0x02e5:
        r0 = 5;
        if (r12 >= r0) goto L_0x02f9;
    L_0x02e8:
        r0 = a;
        if (r0 == 0) goto L_0x02f6;
    L_0x02ec:
        r0 = new java.lang.StringBuilder;
        r1 = "movefrom RESUMED: ";
        r0.<init>(r1);
        r0.append(r11);
    L_0x02f6:
        r11.k();
    L_0x02f9:
        if (r12 >= r9) goto L_0x030c;
    L_0x02fb:
        r0 = a;
        if (r0 == 0) goto L_0x0309;
    L_0x02ff:
        r0 = new java.lang.StringBuilder;
        r1 = "movefrom STARTED: ";
        r0.<init>(r1);
        r0.append(r11);
    L_0x0309:
        r11.l();
    L_0x030c:
        if (r12 >= r6) goto L_0x031f;
    L_0x030e:
        r0 = a;
        if (r0 == 0) goto L_0x031c;
    L_0x0312:
        r0 = new java.lang.StringBuilder;
        r1 = "movefrom STOPPED: ";
        r0.<init>(r1);
        r0.append(r11);
    L_0x031c:
        r11.m();
    L_0x031f:
        r0 = 2;
        if (r12 >= r0) goto L_0x02cb;
    L_0x0322:
        r0 = a;
        if (r0 == 0) goto L_0x0330;
    L_0x0326:
        r0 = new java.lang.StringBuilder;
        r1 = "movefrom ACTIVITY_CREATED: ";
        r0.<init>(r1);
        r0.append(r11);
    L_0x0330:
        r0 = r11.S;
        if (r0 == 0) goto L_0x0343;
    L_0x0334:
        r0 = r10.o;
        r0 = r0.b();
        if (r0 == 0) goto L_0x0343;
    L_0x033c:
        r0 = r11.o;
        if (r0 != 0) goto L_0x0343;
    L_0x0340:
        r10.e(r11);
    L_0x0343:
        r11.n();
        r0 = r11.S;
        if (r0 == 0) goto L_0x0378;
    L_0x034a:
        r0 = r11.R;
        if (r0 == 0) goto L_0x0378;
    L_0x034e:
        r0 = r10.n;
        if (r0 <= 0) goto L_0x03ae;
    L_0x0352:
        r0 = r10.u;
        if (r0 != 0) goto L_0x03ae;
    L_0x0356:
        r0 = r10.a(r11, r13, r3, r14);
    L_0x035a:
        if (r0 == 0) goto L_0x0371;
    L_0x035c:
        r1 = r11.S;
        r11.l = r1;
        r11.m = r12;
        r1 = r11.S;
        r2 = new eh;
        r2.<init>(r10, r1, r0, r11);
        r0.setAnimationListener(r2);
        r1 = r11.S;
        r1.startAnimation(r0);
    L_0x0371:
        r0 = r11.R;
        r1 = r11.S;
        r0.removeView(r1);
    L_0x0378:
        r11.R = r7;
        r11.S = r7;
        r11.T = r7;
        goto L_0x02cb;
    L_0x0380:
        r0 = a;
        if (r0 == 0) goto L_0x038e;
    L_0x0384:
        r0 = new java.lang.StringBuilder;
        r1 = "movefrom CREATED: ";
        r0.<init>(r1);
        r0.append(r11);
    L_0x038e:
        r0 = r11.M;
        if (r0 != 0) goto L_0x03a3;
    L_0x0392:
        r11.o();
    L_0x0395:
        r11.p();
        if (r15 != 0) goto L_0x0045;
    L_0x039a:
        r0 = r11.M;
        if (r0 != 0) goto L_0x03a6;
    L_0x039e:
        r10.d(r11);
        goto L_0x0045;
    L_0x03a3:
        r11.k = r3;
        goto L_0x0395;
    L_0x03a6:
        r11.C = r7;
        r11.F = r7;
        r11.B = r7;
        goto L_0x0045;
    L_0x03ae:
        r0 = r7;
        goto L_0x035a;
    L_0x03b0:
        r0 = r7;
        goto L_0x01d5;
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.a(dr, int, int, int, boolean):void");
    }

    private void c(dr drVar) {
        a(drVar, this.n, 0, 0, false);
    }

    private void a(int i, boolean z) {
        a(i, 0, 0, false);
    }

    void a(int i, int i2, int i3, boolean z) {
        if (this.o == null && i != 0) {
            throw new IllegalStateException("No host");
        } else if (z || this.n != i) {
            this.n = i;
            if (this.f != null) {
                int i4 = 0;
                int i5 = 0;
                while (i4 < this.f.size()) {
                    int a;
                    dr drVar = (dr) this.f.get(i4);
                    if (drVar != null) {
                        a(drVar, i, i2, i3, false);
                        if (drVar.W != null) {
                            a = i5 | drVar.W.a();
                            i4++;
                            i5 = a;
                        }
                    }
                    a = i5;
                    i4++;
                    i5 = a;
                }
                if (i5 == 0) {
                    f();
                }
                if (this.s && this.o != null && this.n == 5) {
                    this.o.d();
                    this.s = false;
                }
            }
        }
    }

    void f() {
        if (this.f != null) {
            for (int i = 0; i < this.f.size(); i++) {
                dr drVar = (dr) this.f.get(i);
                if (drVar != null) {
                    a(drVar);
                }
            }
        }
    }

    void b(dr drVar) {
        if (drVar.p < 0) {
            if (this.h == null || this.h.size() <= 0) {
                if (this.f == null) {
                    this.f = new ArrayList();
                }
                drVar.a(this.f.size(), this.q);
                this.f.add(drVar);
            } else {
                drVar.a(((Integer) this.h.remove(this.h.size() - 1)).intValue(), this.q);
                this.f.set(drVar.p, drVar);
            }
            if (a) {
                new StringBuilder("Allocated fragment index ").append(drVar);
            }
        }
    }

    private void d(dr drVar) {
        if (drVar.p >= 0) {
            if (a) {
                new StringBuilder("Freeing fragment index ").append(drVar);
            }
            this.f.set(drVar.p, null);
            if (this.h == null) {
                this.h = new ArrayList();
            }
            this.h.add(Integer.valueOf(drVar.p));
            this.o.b(drVar.q);
            drVar.f();
        }
    }

    public void a(dr drVar, boolean z) {
        if (this.g == null) {
            this.g = new ArrayList();
        }
        if (a) {
            new StringBuilder("add: ").append(drVar);
        }
        b(drVar);
        if (!drVar.K) {
            if (this.g.contains(drVar)) {
                throw new IllegalStateException("Fragment already added: " + drVar);
            }
            this.g.add(drVar);
            drVar.v = true;
            drVar.w = false;
            if (drVar.N && drVar.O) {
                this.s = true;
            }
            if (z) {
                c(drVar);
            }
        }
    }

    public void a(dr drVar, int i, int i2) {
        boolean z;
        if (a) {
            new StringBuilder("remove: ").append(drVar).append(" nesting=").append(drVar.A);
        }
        if (drVar.A > 0) {
            z = true;
        } else {
            z = false;
        }
        z = !z;
        if (!drVar.K || z) {
            int i3;
            if (this.g != null) {
                this.g.remove(drVar);
            }
            if (drVar.N && drVar.O) {
                this.s = true;
            }
            drVar.v = false;
            drVar.w = true;
            if (z) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            a(drVar, i3, i, i2, false);
        }
    }

    public void b(dr drVar, int i, int i2) {
        if (a) {
            new StringBuilder("hide: ").append(drVar);
        }
        if (!drVar.J) {
            drVar.J = true;
            if (drVar.S != null) {
                Animation a = a(drVar, i, false, i2);
                if (a != null) {
                    ee.a(drVar.S, a);
                    drVar.S.startAnimation(a);
                }
                drVar.S.setVisibility(8);
            }
            if (drVar.v && drVar.N && drVar.O) {
                this.s = true;
            }
            drVar.onHiddenChanged(true);
        }
    }

    public void c(dr drVar, int i, int i2) {
        if (a) {
            new StringBuilder("show: ").append(drVar);
        }
        if (drVar.J) {
            drVar.J = false;
            if (drVar.S != null) {
                Animation a = a(drVar, i, true, i2);
                if (a != null) {
                    ee.a(drVar.S, a);
                    drVar.S.startAnimation(a);
                }
                drVar.S.setVisibility(0);
            }
            if (drVar.v && drVar.N && drVar.O) {
                this.s = true;
            }
            drVar.onHiddenChanged(false);
        }
    }

    public void d(dr drVar, int i, int i2) {
        if (a) {
            new StringBuilder("detach: ").append(drVar);
        }
        if (!drVar.K) {
            drVar.K = true;
            if (drVar.v) {
                if (this.g != null) {
                    if (a) {
                        new StringBuilder("remove from detach: ").append(drVar);
                    }
                    this.g.remove(drVar);
                }
                if (drVar.N && drVar.O) {
                    this.s = true;
                }
                drVar.v = false;
                a(drVar, 1, i, i2, false);
            }
        }
    }

    public void e(dr drVar, int i, int i2) {
        if (a) {
            new StringBuilder("attach: ").append(drVar);
        }
        if (drVar.K) {
            drVar.K = false;
            if (!drVar.v) {
                if (this.g == null) {
                    this.g = new ArrayList();
                }
                if (this.g.contains(drVar)) {
                    throw new IllegalStateException("Fragment already added: " + drVar);
                }
                if (a) {
                    new StringBuilder("add from attach: ").append(drVar);
                }
                this.g.add(drVar);
                drVar.v = true;
                if (drVar.N && drVar.O) {
                    this.s = true;
                }
                a(drVar, this.n, i, i2, false);
            }
        }
    }

    public dr a(int i) {
        int size;
        dr drVar;
        if (this.g != null) {
            for (size = this.g.size() - 1; size >= 0; size--) {
                drVar = (dr) this.g.get(size);
                if (drVar != null && drVar.G == i) {
                    return drVar;
                }
            }
        }
        if (this.f != null) {
            for (size = this.f.size() - 1; size >= 0; size--) {
                drVar = (dr) this.f.get(size);
                if (drVar != null && drVar.G == i) {
                    return drVar;
                }
            }
        }
        return null;
    }

    public dr a(String str) {
        int size;
        dr drVar;
        if (!(this.g == null || str == null)) {
            for (size = this.g.size() - 1; size >= 0; size--) {
                drVar = (dr) this.g.get(size);
                if (drVar != null && str.equals(drVar.I)) {
                    return drVar;
                }
            }
        }
        if (!(this.f == null || str == null)) {
            for (size = this.f.size() - 1; size >= 0; size--) {
                drVar = (dr) this.f.get(size);
                if (drVar != null && str.equals(drVar.I)) {
                    return drVar;
                }
            }
        }
        return null;
    }

    public dr b(String str) {
        if (!(this.f == null || str == null)) {
            for (int size = this.f.size() - 1; size >= 0; size--) {
                dr drVar = (dr) this.f.get(size);
                if (drVar != null) {
                    drVar = drVar.a(str);
                    if (drVar != null) {
                        return drVar;
                    }
                }
            }
        }
        return null;
    }

    private void u() {
        if (this.t) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.v != null) {
            throw new IllegalStateException("Can not perform this action inside of " + this.v);
        }
    }

    public void a(Runnable runnable, boolean z) {
        if (!z) {
            u();
        }
        synchronized (this) {
            if (this.u || this.o == null) {
                throw new IllegalStateException("Activity has been destroyed");
            }
            if (this.c == null) {
                this.c = new ArrayList();
            }
            this.c.add(runnable);
            if (this.c.size() == 1) {
                this.o.j().removeCallbacks(this.z);
                this.o.j().post(this.z);
            }
        }
    }

    public int a(dg dgVar) {
        int size;
        synchronized (this) {
            if (this.l == null || this.l.size() <= 0) {
                if (this.k == null) {
                    this.k = new ArrayList();
                }
                size = this.k.size();
                if (a) {
                    new StringBuilder("Setting back stack index ").append(size).append(" to ").append(dgVar);
                }
                this.k.add(dgVar);
            } else {
                size = ((Integer) this.l.remove(this.l.size() - 1)).intValue();
                if (a) {
                    new StringBuilder("Adding back stack index ").append(size).append(" with ").append(dgVar);
                }
                this.k.set(size, dgVar);
            }
        }
        return size;
    }

    private void a(int i, dg dgVar) {
        synchronized (this) {
            if (this.k == null) {
                this.k = new ArrayList();
            }
            int size = this.k.size();
            if (i < size) {
                if (a) {
                    new StringBuilder("Setting back stack index ").append(i).append(" to ").append(dgVar);
                }
                this.k.set(i, dgVar);
            } else {
                while (size < i) {
                    this.k.add(null);
                    if (this.l == null) {
                        this.l = new ArrayList();
                    }
                    if (a) {
                        new StringBuilder("Adding available back stack index ").append(size);
                    }
                    this.l.add(Integer.valueOf(size));
                    size++;
                }
                if (a) {
                    new StringBuilder("Adding back stack index ").append(i).append(" with ").append(dgVar);
                }
                this.k.add(dgVar);
            }
        }
    }

    public void c(int i) {
        synchronized (this) {
            this.k.set(i, null);
            if (this.l == null) {
                this.l = new ArrayList();
            }
            if (a) {
                new StringBuilder("Freeing back stack index ").append(i);
            }
            this.l.add(Integer.valueOf(i));
        }
    }

    public void b(Runnable runnable, boolean z) {
        if (this.e) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (Looper.myLooper() != this.o.j().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else {
            this.e = true;
            runnable.run();
            this.e = false;
            v();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean g() {
        /*
        r6 = this;
        r2 = 1;
        r1 = 0;
        r0 = r6.e;
        if (r0 == 0) goto L_0x000e;
    L_0x0006:
        r0 = new java.lang.IllegalStateException;
        r1 = "FragmentManager is already executing transactions";
        r0.<init>(r1);
        throw r0;
    L_0x000e:
        r0 = android.os.Looper.myLooper();
        r3 = r6.o;
        r3 = r3.j();
        r3 = r3.getLooper();
        if (r0 == r3) goto L_0x0026;
    L_0x001e:
        r0 = new java.lang.IllegalStateException;
        r1 = "Must be called from main thread of fragment host";
        r0.<init>(r1);
        throw r0;
    L_0x0026:
        r0 = r1;
    L_0x0027:
        monitor-enter(r6);
        r3 = r6.c;	 Catch:{ all -> 0x0078 }
        if (r3 == 0) goto L_0x0034;
    L_0x002c:
        r3 = r6.c;	 Catch:{ all -> 0x0078 }
        r3 = r3.size();	 Catch:{ all -> 0x0078 }
        if (r3 != 0) goto L_0x0039;
    L_0x0034:
        monitor-exit(r6);	 Catch:{ all -> 0x0078 }
        r6.v();
        return r0;
    L_0x0039:
        r0 = r6.c;	 Catch:{ all -> 0x0078 }
        r3 = r0.size();	 Catch:{ all -> 0x0078 }
        r0 = r6.d;	 Catch:{ all -> 0x0078 }
        if (r0 == 0) goto L_0x0048;
    L_0x0043:
        r0 = r6.d;	 Catch:{ all -> 0x0078 }
        r0 = r0.length;	 Catch:{ all -> 0x0078 }
        if (r0 >= r3) goto L_0x004c;
    L_0x0048:
        r0 = new java.lang.Runnable[r3];	 Catch:{ all -> 0x0078 }
        r6.d = r0;	 Catch:{ all -> 0x0078 }
    L_0x004c:
        r0 = r6.c;	 Catch:{ all -> 0x0078 }
        r4 = r6.d;	 Catch:{ all -> 0x0078 }
        r0.toArray(r4);	 Catch:{ all -> 0x0078 }
        r0 = r6.c;	 Catch:{ all -> 0x0078 }
        r0.clear();	 Catch:{ all -> 0x0078 }
        r0 = r6.o;	 Catch:{ all -> 0x0078 }
        r0 = r0.j();	 Catch:{ all -> 0x0078 }
        r4 = r6.z;	 Catch:{ all -> 0x0078 }
        r0.removeCallbacks(r4);	 Catch:{ all -> 0x0078 }
        monitor-exit(r6);	 Catch:{ all -> 0x0078 }
        r6.e = r2;
        r0 = r1;
    L_0x0067:
        if (r0 >= r3) goto L_0x007b;
    L_0x0069:
        r4 = r6.d;
        r4 = r4[r0];
        r4.run();
        r4 = r6.d;
        r5 = 0;
        r4[r0] = r5;
        r0 = r0 + 1;
        goto L_0x0067;
    L_0x0078:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0078 }
        throw r0;
    L_0x007b:
        r6.e = r1;
        r0 = r2;
        goto L_0x0027;
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.g():boolean");
    }

    private void v() {
        if (this.w) {
            int i = 0;
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                dr drVar = (dr) this.f.get(i2);
                if (!(drVar == null || drVar.W == null)) {
                    i |= drVar.W.a();
                }
            }
            if (i == 0) {
                this.w = false;
                f();
            }
        }
    }

    private void w() {
        if (this.m != null) {
            for (int i = 0; i < this.m.size(); i++) {
                this.m.get(i);
            }
        }
    }

    void b(dg dgVar) {
        if (this.i == null) {
            this.i = new ArrayList();
        }
        this.i.add(dgVar);
        w();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    boolean a(java.lang.String r11, int r12, int r13) {
        /*
        r10 = this;
        r4 = 0;
        r2 = 1;
        r3 = 0;
        r0 = r10.i;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return r3;
    L_0x0008:
        if (r12 >= 0) goto L_0x0039;
    L_0x000a:
        r0 = r13 & 1;
        if (r0 != 0) goto L_0x0039;
    L_0x000e:
        r0 = r10.i;
        r0 = r0.size();
        r0 = r0 + -1;
        if (r0 < 0) goto L_0x0007;
    L_0x0018:
        r1 = r10.i;
        r0 = r1.remove(r0);
        r0 = (defpackage.dg) r0;
        r1 = new android.util.SparseArray;
        r1.<init>();
        r3 = new android.util.SparseArray;
        r3.<init>();
        r5 = r10.n;
        if (r5 <= 0) goto L_0x0031;
    L_0x002e:
        r0.a(r1, r3);
    L_0x0031:
        r0.a(r2, r4, r1, r3);
    L_0x0034:
        r10.w();
        r3 = r2;
        goto L_0x0007;
    L_0x0039:
        r0 = -1;
        if (r12 < 0) goto L_0x0073;
    L_0x003c:
        r0 = r10.i;
        r0 = r0.size();
        r1 = r0 + -1;
    L_0x0044:
        if (r1 < 0) goto L_0x0057;
    L_0x0046:
        r0 = r10.i;
        r0 = r0.get(r1);
        r0 = (defpackage.dg) r0;
        if (r12 < 0) goto L_0x0054;
    L_0x0050:
        r0 = r0.p;
        if (r12 == r0) goto L_0x0057;
    L_0x0054:
        r1 = r1 + -1;
        goto L_0x0044;
    L_0x0057:
        if (r1 < 0) goto L_0x0007;
    L_0x0059:
        r0 = r13 & 1;
        if (r0 == 0) goto L_0x0072;
    L_0x005d:
        r1 = r1 + -1;
    L_0x005f:
        if (r1 < 0) goto L_0x0072;
    L_0x0061:
        r0 = r10.i;
        r0 = r0.get(r1);
        r0 = (defpackage.dg) r0;
        if (r12 < 0) goto L_0x0072;
    L_0x006b:
        r0 = r0.p;
        if (r12 != r0) goto L_0x0072;
    L_0x006f:
        r1 = r1 + -1;
        goto L_0x005f;
    L_0x0072:
        r0 = r1;
    L_0x0073:
        r1 = r10.i;
        r1 = r1.size();
        r1 = r1 + -1;
        if (r0 == r1) goto L_0x0007;
    L_0x007d:
        r6 = new java.util.ArrayList;
        r6.<init>();
        r1 = r10.i;
        r1 = r1.size();
        r1 = r1 + -1;
    L_0x008a:
        if (r1 <= r0) goto L_0x0098;
    L_0x008c:
        r5 = r10.i;
        r5 = r5.remove(r1);
        r6.add(r5);
        r1 = r1 + -1;
        goto L_0x008a;
    L_0x0098:
        r0 = r6.size();
        r7 = r0 + -1;
        r8 = new android.util.SparseArray;
        r8.<init>();
        r9 = new android.util.SparseArray;
        r9.<init>();
        r0 = r10.n;
        if (r0 <= 0) goto L_0x00bc;
    L_0x00ac:
        r1 = r3;
    L_0x00ad:
        if (r1 > r7) goto L_0x00bc;
    L_0x00af:
        r0 = r6.get(r1);
        r0 = (defpackage.dg) r0;
        r0.a(r8, r9);
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x00ad;
    L_0x00bc:
        r5 = r4;
        r4 = r3;
    L_0x00be:
        if (r4 > r7) goto L_0x0034;
    L_0x00c0:
        r0 = a;
        if (r0 == 0) goto L_0x00d2;
    L_0x00c4:
        r0 = new java.lang.StringBuilder;
        r1 = "Popping back stack state: ";
        r0.<init>(r1);
        r1 = r6.get(r4);
        r0.append(r1);
    L_0x00d2:
        r0 = r6.get(r4);
        r0 = (defpackage.dg) r0;
        if (r4 != r7) goto L_0x00e4;
    L_0x00da:
        r1 = r2;
    L_0x00db:
        r1 = r0.a(r1, r5, r8, r9);
        r0 = r4 + 1;
        r4 = r0;
        r5 = r1;
        goto L_0x00be;
    L_0x00e4:
        r1 = r3;
        goto L_0x00db;
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.a(java.lang.String, int, int):boolean");
    }

    el h() {
        List list;
        List list2;
        if (this.f != null) {
            int i = 0;
            list = null;
            list2 = null;
            while (i < this.f.size()) {
                ArrayList arrayList;
                dr drVar = (dr) this.f.get(i);
                if (drVar != null) {
                    boolean z;
                    if (drVar.L) {
                        if (list2 == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(drVar);
                        drVar.M = true;
                        drVar.t = drVar.s != null ? drVar.s.p : -1;
                        if (a) {
                            new StringBuilder("retainNonConfig: keeping retained ").append(drVar);
                        }
                    }
                    if (drVar.D != null) {
                        el h = drVar.D.h();
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

    private void e(dr drVar) {
        if (drVar.T != null) {
            if (this.y == null) {
                this.y = new SparseArray();
            } else {
                this.y.clear();
            }
            drVar.T.saveHierarchyState(this.y);
            if (this.y.size() > 0) {
                drVar.o = this.y;
                this.y = null;
            }
        }
    }

    private Bundle f(dr drVar) {
        Bundle bundle;
        if (this.x == null) {
            this.x = new Bundle();
        }
        drVar.e(this.x);
        if (this.x.isEmpty()) {
            bundle = null;
        } else {
            bundle = this.x;
            this.x = null;
        }
        if (drVar.S != null) {
            e(drVar);
        }
        if (drVar.o != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", drVar.o);
        }
        if (!drVar.V) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", drVar.V);
        }
        return bundle;
    }

    Parcelable i() {
        dl[] dlVarArr = null;
        g();
        if (b) {
            this.t = true;
        }
        if (this.f == null || this.f.size() <= 0) {
            return null;
        }
        int size = this.f.size();
        ep[] epVarArr = new ep[size];
        int i = 0;
        boolean z = false;
        while (i < size) {
            boolean z2;
            dr drVar = (dr) this.f.get(i);
            if (drVar != null) {
                if (drVar.p < 0) {
                    a(new IllegalStateException("Failure saving state: active " + drVar + " has cleared index: " + drVar.p));
                }
                ep epVar = new ep(drVar);
                epVarArr[i] = epVar;
                if (drVar.k <= 0 || epVar.k != null) {
                    epVar.k = drVar.n;
                } else {
                    epVar.k = f(drVar);
                    if (drVar.s != null) {
                        if (drVar.s.p < 0) {
                            a(new IllegalStateException("Failure saving state: " + drVar + " has target not in fragment manager: " + drVar.s));
                        }
                        if (epVar.k == null) {
                            epVar.k = new Bundle();
                        }
                        a(epVar.k, "android:target_state", drVar.s);
                        if (drVar.u != 0) {
                            epVar.k.putInt("android:target_req_state", drVar.u);
                        }
                    }
                }
                if (a) {
                    new StringBuilder("Saved state of ").append(drVar).append(": ").append(epVar.k);
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
        if (this.g != null) {
            i = this.g.size();
            if (i > 0) {
                iArr = new int[i];
                for (i2 = 0; i2 < i; i2++) {
                    iArr[i2] = ((dr) this.g.get(i2)).p;
                    if (iArr[i2] < 0) {
                        a(new IllegalStateException("Failure saving state: active " + this.g.get(i2) + " has cleared index: " + iArr[i2]));
                    }
                    if (a) {
                        new StringBuilder("saveAllState: adding fragment #").append(i2).append(": ").append(this.g.get(i2));
                    }
                }
                if (this.i != null) {
                    i = this.i.size();
                    if (i > 0) {
                        dlVarArr = new dl[i];
                        for (i2 = 0; i2 < i; i2++) {
                            dlVarArr[i2] = new dl((dg) this.i.get(i2));
                            if (a) {
                                new StringBuilder("saveAllState: adding back stack #").append(i2).append(": ").append(this.i.get(i2));
                            }
                        }
                    }
                }
                emVar = new em();
                emVar.a = epVarArr;
                emVar.b = iArr;
                emVar.c = dlVarArr;
                return emVar;
            }
        }
        iArr = null;
        if (this.i != null) {
            i = this.i.size();
            if (i > 0) {
                dlVarArr = new dl[i];
                for (i2 = 0; i2 < i; i2++) {
                    dlVarArr[i2] = new dl((dg) this.i.get(i2));
                    if (a) {
                        new StringBuilder("saveAllState: adding back stack #").append(i2).append(": ").append(this.i.get(i2));
                    }
                }
            }
        }
        emVar = new em();
        emVar.a = epVarArr;
        emVar.b = iArr;
        emVar.c = dlVarArr;
        return emVar;
    }

    void a(Parcelable parcelable, el elVar) {
        if (parcelable != null) {
            em emVar = (em) parcelable;
            if (emVar.a != null) {
                List a;
                int size;
                int i;
                dr drVar;
                List list;
                if (elVar != null) {
                    a = elVar.a();
                    List b = elVar.b();
                    if (a != null) {
                        size = a.size();
                    } else {
                        boolean z = false;
                    }
                    for (i = 0; i < size; i++) {
                        drVar = (dr) a.get(i);
                        if (a) {
                            new StringBuilder("restoreAllState: re-attaching retained ").append(drVar);
                        }
                        ep epVar = emVar.a[drVar.p];
                        epVar.l = drVar;
                        drVar.o = null;
                        drVar.A = 0;
                        drVar.y = false;
                        drVar.v = false;
                        drVar.s = null;
                        if (epVar.k != null) {
                            epVar.k.setClassLoader(this.o.i().getClassLoader());
                            drVar.o = epVar.k.getSparseParcelableArray("android:view_state");
                            drVar.n = epVar.k;
                        }
                    }
                    list = b;
                } else {
                    list = null;
                }
                this.f = new ArrayList(emVar.a.length);
                if (this.h != null) {
                    this.h.clear();
                }
                int i2 = 0;
                while (i2 < emVar.a.length) {
                    ep epVar2 = emVar.a[i2];
                    if (epVar2 != null) {
                        el elVar2;
                        if (list == null || i2 >= list.size()) {
                            elVar2 = null;
                        } else {
                            elVar2 = (el) list.get(i2);
                        }
                        drVar = epVar2.a(this.o, this.q, elVar2);
                        if (a) {
                            new StringBuilder("restoreAllState: active #").append(i2).append(": ").append(drVar);
                        }
                        this.f.add(drVar);
                        epVar2.l = null;
                    } else {
                        this.f.add(null);
                        if (this.h == null) {
                            this.h = new ArrayList();
                        }
                        if (a) {
                            new StringBuilder("restoreAllState: avail #").append(i2);
                        }
                        this.h.add(Integer.valueOf(i2));
                    }
                    i2++;
                }
                if (elVar != null) {
                    a = elVar.a();
                    if (a != null) {
                        i2 = a.size();
                    } else {
                        boolean z2 = false;
                    }
                    for (i = 0; i < i2; i++) {
                        drVar = (dr) a.get(i);
                        if (drVar.t >= 0) {
                            if (drVar.t < this.f.size()) {
                                drVar.s = (dr) this.f.get(drVar.t);
                            } else {
                                new StringBuilder("Re-attaching retained fragment ").append(drVar).append(" target no longer exists: ").append(drVar.t);
                                drVar.s = null;
                            }
                        }
                    }
                }
                if (emVar.b != null) {
                    this.g = new ArrayList(emVar.b.length);
                    for (size = 0; size < emVar.b.length; size++) {
                        drVar = (dr) this.f.get(emVar.b[size]);
                        if (drVar == null) {
                            a(new IllegalStateException("No instantiated fragment for index #" + emVar.b[size]));
                        }
                        drVar.v = true;
                        if (a) {
                            new StringBuilder("restoreAllState: added #").append(size).append(": ").append(drVar);
                        }
                        if (this.g.contains(drVar)) {
                            throw new IllegalStateException("Already added!");
                        }
                        this.g.add(drVar);
                    }
                } else {
                    this.g = null;
                }
                if (emVar.c != null) {
                    this.i = new ArrayList(emVar.c.length);
                    for (int i3 = 0; i3 < emVar.c.length; i3++) {
                        dg a2 = emVar.c[i3].a(this);
                        if (a) {
                            new StringBuilder("restoreAllState: back stack #").append(i3).append(" (index ").append(a2.p).append("): ").append(a2);
                            a2.a("  ", new PrintWriter(new lb("FragmentManager")), false);
                        }
                        this.i.add(a2);
                        if (a2.p >= 0) {
                            a(a2.p, a2);
                        }
                    }
                    return;
                }
                this.i = null;
            }
        }
    }

    public void a(ec ecVar, ea eaVar, dr drVar) {
        if (this.o != null) {
            throw new IllegalStateException("Already attached");
        }
        this.o = ecVar;
        this.p = eaVar;
        this.q = drVar;
    }

    public void noteStateNotSaved() {
        this.t = false;
    }

    public void j() {
        this.t = false;
        a(1, false);
    }

    public void k() {
        this.t = false;
        a(2, false);
    }

    public void l() {
        this.t = false;
        a(4, false);
    }

    public void m() {
        this.t = false;
        a(5, false);
    }

    public void n() {
        a(4, false);
    }

    public void o() {
        this.t = true;
        a(3, false);
    }

    public void p() {
        a(2, false);
    }

    public void q() {
        a(1, false);
    }

    public void r() {
        this.u = true;
        g();
        a(0, false);
        this.o = null;
        this.p = null;
        this.q = null;
    }

    public void a(boolean z) {
        if (this.g != null) {
            for (int size = this.g.size() - 1; size >= 0; size--) {
                dr drVar = (dr) this.g.get(size);
                if (drVar != null) {
                    drVar.d(z);
                }
            }
        }
    }

    public void b(boolean z) {
        if (this.g != null) {
            for (int size = this.g.size() - 1; size >= 0; size--) {
                dr drVar = (dr) this.g.get(size);
                if (drVar != null) {
                    drVar.e(z);
                }
            }
        }
    }

    public void a(Configuration configuration) {
        if (this.g != null) {
            for (int i = 0; i < this.g.size(); i++) {
                dr drVar = (dr) this.g.get(i);
                if (drVar != null) {
                    drVar.a(configuration);
                }
            }
        }
    }

    public void s() {
        if (this.g != null) {
            for (int i = 0; i < this.g.size(); i++) {
                dr drVar = (dr) this.g.get(i);
                if (drVar != null) {
                    drVar.j();
                }
            }
        }
    }

    public boolean a(Menu menu, MenuInflater menuInflater) {
        boolean z;
        dr drVar;
        int i = 0;
        ArrayList arrayList = null;
        if (this.g != null) {
            int i2 = 0;
            z = false;
            while (i2 < this.g.size()) {
                drVar = (dr) this.g.get(i2);
                if (drVar != null && drVar.a(menu, menuInflater)) {
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
        if (this.j != null) {
            while (i < this.j.size()) {
                drVar = (dr) this.j.get(i);
                if (arrayList == null || !arrayList.contains(drVar)) {
                    drVar.onDestroyOptionsMenu();
                }
                i++;
            }
        }
        this.j = arrayList;
        return z;
    }

    public boolean a(Menu menu) {
        if (this.g == null) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.g.size(); i++) {
            dr drVar = (dr) this.g.get(i);
            if (drVar != null && drVar.a(menu)) {
                z = true;
            }
        }
        return z;
    }

    public boolean a(MenuItem menuItem) {
        if (this.g == null) {
            return false;
        }
        for (int i = 0; i < this.g.size(); i++) {
            dr drVar = (dr) this.g.get(i);
            if (drVar != null && drVar.a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean b(MenuItem menuItem) {
        if (this.g == null) {
            return false;
        }
        for (int i = 0; i < this.g.size(); i++) {
            dr drVar = (dr) this.g.get(i);
            if (drVar != null && drVar.b(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void b(Menu menu) {
        if (this.g != null) {
            for (int i = 0; i < this.g.size(); i++) {
                dr drVar = (dr) this.g.get(i);
                if (drVar != null) {
                    drVar.b(menu);
                }
            }
        }
    }

    public static int d(int i) {
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

    public View a(View view, String str, Context context, AttributeSet attributeSet) {
        if (!"fragment".equals(str)) {
            return null;
        }
        String string;
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ek.a);
        if (attributeValue == null) {
            string = obtainStyledAttributes.getString(0);
        } else {
            string = attributeValue;
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string2 = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!dr.a(this.o.i(), string)) {
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
        dr a = resourceId != -1 ? a(resourceId) : null;
        if (a == null && string2 != null) {
            a = a(string2);
        }
        if (a == null && id != -1) {
            a = a(id);
        }
        if (a) {
            new StringBuilder("onCreateView: id=0x").append(Integer.toHexString(resourceId)).append(" fname=").append(string).append(" existing=").append(a);
        }
        if (a == null) {
            dr instantiate = dr.instantiate(context, string);
            instantiate.x = true;
            instantiate.G = resourceId != 0 ? resourceId : id;
            instantiate.H = id;
            instantiate.I = string2;
            instantiate.y = true;
            instantiate.B = this;
            instantiate.C = this.o;
            instantiate.onInflate(this.o.i(), attributeSet, instantiate.n);
            a(instantiate, true);
            drVar = instantiate;
        } else if (a.y) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string2 + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + string);
        } else {
            a.y = true;
            a.C = this.o;
            if (!a.M) {
                a.onInflate(this.o.i(), attributeSet, a.n);
            }
            drVar = a;
        }
        if (this.n > 0 || !drVar.x) {
            c(drVar);
        } else {
            a(drVar, 1, 0, 0, false);
        }
        if (drVar.S == null) {
            throw new IllegalStateException("Fragment " + string + " did not create a view.");
        }
        if (resourceId != 0) {
            drVar.S.setId(resourceId);
        }
        if (drVar.S.getTag() == null) {
            drVar.S.setTag(string2);
        }
        return drVar.S;
    }

    mw t() {
        return this;
    }
}
