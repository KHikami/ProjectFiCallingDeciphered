package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
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

/* compiled from: PG */
/* renamed from: dm */
final class dm extends dl implements jl {
    private static Interpolator A;
    static boolean a;
    private static boolean l;
    private static Field s;
    private static Interpolator z;
    ArrayList b;
    ArrayList c;
    ArrayList d;
    ArrayList e;
    ArrayList f;
    int g;
    dk h;
    di i;
    boolean j;
    String k;
    private ArrayList m;
    private Runnable[] n;
    private boolean o;
    private ArrayList p;
    private ArrayList q;
    private db r;
    private boolean t;
    private boolean u;
    private boolean v;
    private Bundle w;
    private SparseArray x;
    private Runnable y;

    dm() {
        this.g = 0;
        this.w = null;
        this.x = null;
        this.y = new dn(this);
    }

    static {
        boolean z = false;
        a = false;
        if (VERSION.SDK_INT >= 11) {
            z = true;
        }
        l = z;
        s = null;
        z = new DecelerateInterpolator(2.5f);
        A = new DecelerateInterpolator(1.5f);
        AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator(2.5f);
        accelerateInterpolator = new AccelerateInterpolator(1.5f);
    }

    private final void a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new hy("FragmentManager"));
        if (this.h != null) {
            try {
                this.h.a("  ", null, printWriter, new String[0]);
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

    public final dy a() {
        return new cp(this);
    }

    public final boolean b() {
        return f();
    }

    public final boolean c() {
        q();
        f();
        return a(null, -1, 0);
    }

    public final void a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Bad id: " + i);
        }
        a(new do(this, i, 1), false);
    }

    private db a(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        if (i >= this.b.size()) {
            a(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
        }
        db dbVar = (db) this.b.get(i);
        if (dbVar != null) {
            return dbVar;
        }
        a(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
        return dbVar;
    }

    public final List d() {
        return this.b;
    }

    public final boolean e() {
        return this.u;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("FragmentManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        if (this.r != null) {
            buf.a(this.r, stringBuilder);
        } else {
            buf.a(this.h, stringBuilder);
        }
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }

    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int i;
        db dbVar;
        int i2 = 0;
        String str2 = str + "    ";
        if (this.b != null) {
            size = this.b.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.print("Active Fragments in ");
                printWriter.print(Integer.toHexString(System.identityHashCode(this)));
                printWriter.println(":");
                for (i = 0; i < size; i++) {
                    dbVar = (db) this.b.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(dbVar);
                    if (dbVar != null) {
                        dbVar.a(str2, fileDescriptor, printWriter, strArr);
                    }
                }
            }
        }
        if (this.c != null) {
            size = this.c.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Added Fragments:");
                for (i = 0; i < size; i++) {
                    dbVar = (db) this.c.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(dbVar.toString());
                }
            }
        }
        if (this.q != null) {
            size = this.q.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Fragments Created Menus:");
                for (i = 0; i < size; i++) {
                    dbVar = (db) this.q.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(dbVar.toString());
                }
            }
        }
        if (this.d != null) {
            size = this.d.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack:");
                for (i = 0; i < size; i++) {
                    cp cpVar = (cp) this.d.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(cpVar.toString());
                    cpVar.a(str2, printWriter);
                }
            }
        }
        synchronized (this) {
            if (this.e != null) {
                int size2 = this.e.size();
                if (size2 > 0) {
                    printWriter.print(str);
                    printWriter.println("Back Stack Indices:");
                    for (i = 0; i < size2; i++) {
                        cpVar = (cp) this.e.get(i);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i);
                        printWriter.print(": ");
                        printWriter.println(cpVar);
                    }
                }
            }
            if (this.f != null && this.f.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f.toArray()));
            }
        }
        if (this.m != null) {
            i = this.m.size();
            if (i > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                while (i2 < i) {
                    Runnable runnable = (Runnable) this.m.get(i2);
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
        printWriter.println(this.h);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.i);
        if (this.r != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.r);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.g);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.j);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.u);
        if (this.t) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.t);
        }
        if (this.k != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.k);
        }
        if (this.p != null && this.p.size() > 0) {
            printWriter.print(str);
            printWriter.print("  mAvailIndices: ");
            printWriter.println(Arrays.toString(this.p.toArray()));
        }
    }

    private static Animation a(float f, float f2, float f3, float f4) {
        Animation animationSet = new AnimationSet(false);
        Animation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(z);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        scaleAnimation = new AlphaAnimation(f3, f4);
        scaleAnimation.setInterpolator(A);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        return animationSet;
    }

    private static Animation a(float f, float f2) {
        Animation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(A);
        alphaAnimation.setDuration(220);
        return alphaAnimation;
    }

    private Animation a(db dbVar, int i, boolean z, int i2) {
        int i3 = dbVar.I;
        db.k();
        if (dbVar.I != 0) {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.h.b, dbVar.I);
            if (loadAnimation != null) {
                return loadAnimation;
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
            case rq.b /*1*/:
                return dm.a(1.125f, 1.0f, 0.0f, 1.0f);
            case rq.c /*2*/:
                return dm.a(1.0f, 0.975f, 1.0f, 0.0f);
            case rl.e /*3*/:
                return dm.a(0.975f, 1.0f, 0.0f, 1.0f);
            case rl.f /*4*/:
                return dm.a(1.0f, 1.075f, 1.0f, 0.0f);
            case rl.g /*5*/:
                return dm.a(0.0f, 1.0f);
            case rl.i /*6*/:
                return dm.a(1.0f, 0.0f);
            default:
                if (i2 == 0 && this.h.e()) {
                    i2 = this.h.f();
                }
                if (i2 == 0) {
                    return null;
                }
                return null;
        }
    }

    private static void a(View view, Animation animation) {
        Object obj = null;
        if (view != null && animation != null) {
            if (VERSION.SDK_INT >= 19 && kn.a.c(view) == 0 && kn.a.t(view)) {
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
                    if (s == null) {
                        Field declaredField = Animation.class.getDeclaredField("mListener");
                        s = declaredField;
                        declaredField.setAccessible(true);
                    }
                    animationListener = (AnimationListener) s.get(animation);
                } catch (Throwable e) {
                    Log.e("FragmentManager", "No field with the name mListener is found in Animation class", e);
                    animationListener = null;
                } catch (Throwable e2) {
                    Log.e("FragmentManager", "Cannot access Animation's mListener field", e2);
                    animationListener = null;
                }
                kn.a(view, 2, null);
                animation.setAnimationListener(new dq(view, animation, animationListener));
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final void a(defpackage.db r11, int r12, int r13, int r14, boolean r15) {
        /*
        r10 = this;
        r9 = 4;
        r6 = 3;
        r5 = 1;
        r7 = 0;
        r3 = 0;
        r0 = r11.n;
        if (r0 == 0) goto L_0x000d;
    L_0x0009:
        r0 = r11.C;
        if (r0 == 0) goto L_0x0010;
    L_0x000d:
        if (r12 <= r5) goto L_0x0010;
    L_0x000f:
        r12 = r5;
    L_0x0010:
        r0 = r11.o;
        if (r0 == 0) goto L_0x001a;
    L_0x0014:
        r0 = r11.c;
        if (r12 <= r0) goto L_0x001a;
    L_0x0018:
        r12 = r11.c;
    L_0x001a:
        r0 = r11.M;
        if (r0 == 0) goto L_0x0025;
    L_0x001e:
        r0 = r11.c;
        if (r0 >= r9) goto L_0x0025;
    L_0x0022:
        if (r12 <= r6) goto L_0x0025;
    L_0x0024:
        r12 = r6;
    L_0x0025:
        r0 = r11.c;
        if (r0 >= r12) goto L_0x0361;
    L_0x0029:
        r0 = r11.p;
        if (r0 == 0) goto L_0x0032;
    L_0x002d:
        r0 = r11.q;
        if (r0 != 0) goto L_0x0032;
    L_0x0031:
        return;
    L_0x0032:
        r0 = r11.d;
        if (r0 == 0) goto L_0x0040;
    L_0x0036:
        r11.d = r7;
        r2 = r11.e;
        r0 = r10;
        r1 = r11;
        r4 = r3;
        r0.a(r1, r2, r3, r4, r5);
    L_0x0040:
        r0 = r11.c;
        switch(r0) {
            case 0: goto L_0x0076;
            case 1: goto L_0x0178;
            case 2: goto L_0x02cc;
            case 3: goto L_0x02d1;
            case 4: goto L_0x0318;
            default: goto L_0x0045;
        };
    L_0x0045:
        r0 = r11.c;
        if (r0 == r12) goto L_0x0031;
    L_0x0049:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r2 = "moveToState: Fragment state for ";
        r1.<init>(r2);
        r1 = r1.append(r11);
        r2 = " not updated inline; expected state ";
        r1 = r1.append(r2);
        r1 = r1.append(r12);
        r2 = " found ";
        r1 = r1.append(r2);
        r2 = r11.c;
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.w(r0, r1);
        r11.c = r12;
        goto L_0x0031;
    L_0x0076:
        r0 = r11.f;
        if (r0 == 0) goto L_0x00bc;
    L_0x007a:
        r0 = r11.f;
        r1 = r10.h;
        r1 = r1.b;
        r1 = r1.getClassLoader();
        r0.setClassLoader(r1);
        r0 = r11.f;
        r1 = "android:view_state";
        r0 = r0.getSparseParcelableArray(r1);
        r11.g = r0;
        r0 = r11.f;
        r1 = "android:target_state";
        r0 = r10.a(r0, r1);
        r11.k = r0;
        r0 = r11.k;
        if (r0 == 0) goto L_0x00a9;
    L_0x009f:
        r0 = r11.f;
        r1 = "android:target_req_state";
        r0 = r0.getInt(r1, r3);
        r11.m = r0;
    L_0x00a9:
        r0 = r11.f;
        r1 = "android:user_visible_hint";
        r0 = r0.getBoolean(r1, r5);
        r11.N = r0;
        r0 = r11.N;
        if (r0 != 0) goto L_0x00bc;
    L_0x00b7:
        r11.M = r5;
        if (r12 <= r6) goto L_0x00bc;
    L_0x00bb:
        r12 = r6;
    L_0x00bc:
        r0 = r10.h;
        r11.u = r0;
        r0 = r10.r;
        r11.x = r0;
        r0 = r10.r;
        if (r0 == 0) goto L_0x00f6;
    L_0x00c8:
        r0 = r10.r;
        r0 = r0.v;
    L_0x00cc:
        r11.t = r0;
        r11.H = r3;
        r0 = r10.h;
        r0 = r0.b;
        r11.a(r0);
        r0 = r11.H;
        if (r0 != 0) goto L_0x00fb;
    L_0x00db:
        r0 = new fy;
        r1 = new java.lang.StringBuilder;
        r2 = "Fragment ";
        r1.<init>(r2);
        r1 = r1.append(r11);
        r2 = " did not call through to super.onAttach()";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x00f6:
        r0 = r10.h;
        r0 = r0.d;
        goto L_0x00cc;
    L_0x00fb:
        r0 = r11.x;
        if (r0 == 0) goto L_0x0104;
    L_0x00ff:
        r0 = r11.x;
        defpackage.db.j();
    L_0x0104:
        r0 = r11.E;
        if (r0 != 0) goto L_0x0138;
    L_0x0108:
        r0 = r11.f;
        r1 = r11.v;
        if (r1 == 0) goto L_0x0112;
    L_0x010e:
        r1 = r11.v;
        r1.j = r3;
    L_0x0112:
        r11.c = r5;
        r11.H = r3;
        r11.a(r0);
        r0 = r11.H;
        if (r0 != 0) goto L_0x013f;
    L_0x011d:
        r0 = new fy;
        r1 = new java.lang.StringBuilder;
        r2 = "Fragment ";
        r1.<init>(r2);
        r1 = r1.append(r11);
        r2 = " did not call through to super.onCreate()";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0138:
        r0 = r11.f;
        r11.g(r0);
        r11.c = r5;
    L_0x013f:
        r11.E = r3;
        r0 = r11.p;
        if (r0 == 0) goto L_0x0178;
    L_0x0145:
        r0 = r11.f;
        r0 = r11.b(r0);
        r1 = r11.f;
        r0 = r11.a(r0, r7, r1);
        r11.K = r0;
        r0 = r11.K;
        if (r0 == 0) goto L_0x0276;
    L_0x0157:
        r0 = r11.K;
        r11.L = r0;
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 11;
        if (r0 < r1) goto L_0x026c;
    L_0x0161:
        r0 = r11.K;
        defpackage.kn.b(r0, r3);
    L_0x0166:
        r0 = r11.B;
        if (r0 == 0) goto L_0x0171;
    L_0x016a:
        r0 = r11.K;
        r1 = 8;
        r0.setVisibility(r1);
    L_0x0171:
        r0 = r11.K;
        r0 = r11.f;
        defpackage.db.l();
    L_0x0178:
        if (r12 <= r5) goto L_0x02cc;
    L_0x017a:
        r0 = r11.p;
        if (r0 != 0) goto L_0x023b;
    L_0x017e:
        r0 = r11.z;
        if (r0 == 0) goto L_0x0538;
    L_0x0182:
        r0 = r11.z;
        r1 = -1;
        if (r0 != r1) goto L_0x01a4;
    L_0x0187:
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
    L_0x01a4:
        r0 = r10.i;
        r1 = r11.z;
        r0 = r0.a(r1);
        r0 = (android.view.ViewGroup) r0;
        if (r0 != 0) goto L_0x01ef;
    L_0x01b0:
        r1 = r11.r;
        if (r1 != 0) goto L_0x01ef;
    L_0x01b4:
        r1 = r11.f();	 Catch:{ NotFoundException -> 0x027a }
        r2 = r11.z;	 Catch:{ NotFoundException -> 0x027a }
        r1 = r1.getResourceName(r2);	 Catch:{ NotFoundException -> 0x027a }
    L_0x01be:
        r2 = new java.lang.IllegalArgumentException;
        r4 = new java.lang.StringBuilder;
        r8 = "No view found for id 0x";
        r4.<init>(r8);
        r8 = r11.z;
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
    L_0x01ef:
        r11.J = r0;
        r1 = r11.f;
        r1 = r11.b(r1);
        r2 = r11.f;
        r1 = r11.a(r1, r0, r2);
        r11.K = r1;
        r1 = r11.K;
        if (r1 == 0) goto L_0x0288;
    L_0x0203:
        r1 = r11.K;
        r11.L = r1;
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = 11;
        if (r1 < r2) goto L_0x027f;
    L_0x020d:
        r1 = r11.K;
        defpackage.kn.b(r1, r3);
    L_0x0212:
        if (r0 == 0) goto L_0x0229;
    L_0x0214:
        r1 = r10.a(r11, r13, r5, r14);
        if (r1 == 0) goto L_0x0224;
    L_0x021a:
        r2 = r11.K;
        defpackage.dm.a(r2, r1);
        r2 = r11.K;
        r2.startAnimation(r1);
    L_0x0224:
        r1 = r11.K;
        r0.addView(r1);
    L_0x0229:
        r0 = r11.B;
        if (r0 == 0) goto L_0x0234;
    L_0x022d:
        r0 = r11.K;
        r1 = 8;
        r0.setVisibility(r1);
    L_0x0234:
        r0 = r11.K;
        r0 = r11.f;
        defpackage.db.l();
    L_0x023b:
        r0 = r11.f;
        r1 = r11.v;
        if (r1 == 0) goto L_0x0245;
    L_0x0241:
        r1 = r11.v;
        r1.j = r3;
    L_0x0245:
        r1 = 2;
        r11.c = r1;
        r11.H = r3;
        r11.d(r0);
        r0 = r11.H;
        if (r0 != 0) goto L_0x028b;
    L_0x0251:
        r0 = new fy;
        r1 = new java.lang.StringBuilder;
        r2 = "Fragment ";
        r1.<init>(r2);
        r1 = r1.append(r11);
        r2 = " did not call through to super.onActivityCreated()";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x026c:
        r0 = r11.K;
        r0 = defpackage.el.a(r0);
        r11.K = r0;
        goto L_0x0166;
    L_0x0276:
        r11.L = r7;
        goto L_0x0178;
    L_0x027a:
        r1 = move-exception;
        r1 = "unknown";
        goto L_0x01be;
    L_0x027f:
        r1 = r11.K;
        r1 = defpackage.el.a(r1);
        r11.K = r1;
        goto L_0x0212;
    L_0x0288:
        r11.L = r7;
        goto L_0x023b;
    L_0x028b:
        r0 = r11.v;
        if (r0 == 0) goto L_0x0294;
    L_0x028f:
        r0 = r11.v;
        r0.j();
    L_0x0294:
        r0 = r11.K;
        if (r0 == 0) goto L_0x02ca;
    L_0x0298:
        r0 = r11.f;
        r0 = r11.g;
        if (r0 == 0) goto L_0x02a7;
    L_0x029e:
        r0 = r11.L;
        r1 = r11.g;
        r0.restoreHierarchyState(r1);
        r11.g = r7;
    L_0x02a7:
        r11.H = r3;
        r11.H = r5;
        r0 = r11.H;
        if (r0 != 0) goto L_0x02ca;
    L_0x02af:
        r0 = new fy;
        r1 = new java.lang.StringBuilder;
        r2 = "Fragment ";
        r1.<init>(r2);
        r1 = r1.append(r11);
        r2 = " did not call through to super.onViewStateRestored()";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x02ca:
        r11.f = r7;
    L_0x02cc:
        r0 = 2;
        if (r12 <= r0) goto L_0x02d1;
    L_0x02cf:
        r11.c = r6;
    L_0x02d1:
        if (r12 <= r6) goto L_0x0318;
    L_0x02d3:
        r0 = r11.v;
        if (r0 == 0) goto L_0x02e0;
    L_0x02d7:
        r0 = r11.v;
        r0.j = r3;
        r0 = r11.v;
        r0.f();
    L_0x02e0:
        r11.c = r9;
        r11.H = r3;
        r11.b();
        r0 = r11.H;
        if (r0 != 0) goto L_0x0306;
    L_0x02eb:
        r0 = new fy;
        r1 = new java.lang.StringBuilder;
        r2 = "Fragment ";
        r1.<init>(r2);
        r1 = r1.append(r11);
        r2 = " did not call through to super.onStart()";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0306:
        r0 = r11.v;
        if (r0 == 0) goto L_0x030f;
    L_0x030a:
        r0 = r11.v;
        r0.k();
    L_0x030f:
        r0 = r11.O;
        if (r0 == 0) goto L_0x0318;
    L_0x0313:
        r0 = r11.O;
        r0.f();
    L_0x0318:
        if (r12 <= r9) goto L_0x0045;
    L_0x031a:
        r0 = r11.v;
        if (r0 == 0) goto L_0x0327;
    L_0x031e:
        r0 = r11.v;
        r0.j = r3;
        r0 = r11.v;
        r0.f();
    L_0x0327:
        r0 = 5;
        r11.c = r0;
        r11.H = r3;
        r11.H = r5;
        r0 = r11.H;
        if (r0 != 0) goto L_0x034d;
    L_0x0332:
        r0 = new fy;
        r1 = new java.lang.StringBuilder;
        r2 = "Fragment ";
        r1.<init>(r2);
        r1 = r1.append(r11);
        r2 = " did not call through to super.onResume()";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x034d:
        r0 = r11.v;
        if (r0 == 0) goto L_0x035b;
    L_0x0351:
        r0 = r11.v;
        r0.l();
        r0 = r11.v;
        r0.f();
    L_0x035b:
        r11.f = r7;
        r11.g = r7;
        goto L_0x0045;
    L_0x0361:
        r0 = r11.c;
        if (r0 <= r12) goto L_0x0045;
    L_0x0365:
        r0 = r11.c;
        switch(r0) {
            case 1: goto L_0x036c;
            case 2: goto L_0x03ee;
            case 3: goto L_0x03e9;
            case 4: goto L_0x03b8;
            case 5: goto L_0x0386;
            default: goto L_0x036a;
        };
    L_0x036a:
        goto L_0x0045;
    L_0x036c:
        if (r12 > 0) goto L_0x0045;
    L_0x036e:
        r0 = r10.u;
        if (r0 == 0) goto L_0x037d;
    L_0x0372:
        r0 = r11.d;
        if (r0 == 0) goto L_0x037d;
    L_0x0376:
        r0 = r11.d;
        r11.d = r7;
        r0.clearAnimation();
    L_0x037d:
        r0 = r11.d;
        if (r0 == 0) goto L_0x0476;
    L_0x0381:
        r11.e = r12;
        r12 = r5;
        goto L_0x0045;
    L_0x0386:
        r0 = 5;
        if (r12 >= r0) goto L_0x03b8;
    L_0x0389:
        r0 = r11.v;
        if (r0 == 0) goto L_0x0392;
    L_0x038d:
        r0 = r11.v;
        r0.a(r9, r3);
    L_0x0392:
        r11.c = r9;
        r11.H = r3;
        r11.m();
        r0 = r11.H;
        if (r0 != 0) goto L_0x03b8;
    L_0x039d:
        r0 = new fy;
        r1 = new java.lang.StringBuilder;
        r2 = "Fragment ";
        r1.<init>(r2);
        r1 = r1.append(r11);
        r2 = " did not call through to super.onPause()";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x03b8:
        if (r12 >= r9) goto L_0x03e9;
    L_0x03ba:
        r0 = r11.v;
        if (r0 == 0) goto L_0x03c3;
    L_0x03be:
        r0 = r11.v;
        r0.m();
    L_0x03c3:
        r11.c = r6;
        r11.H = r3;
        r11.c();
        r0 = r11.H;
        if (r0 != 0) goto L_0x03e9;
    L_0x03ce:
        r0 = new fy;
        r1 = new java.lang.StringBuilder;
        r2 = "Fragment ";
        r1.<init>(r2);
        r1 = r1.append(r11);
        r2 = " did not call through to super.onStop()";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x03e9:
        if (r12 >= r6) goto L_0x03ee;
    L_0x03eb:
        r11.o();
    L_0x03ee:
        r0 = 2;
        if (r12 >= r0) goto L_0x036c;
    L_0x03f1:
        r0 = r11.K;
        if (r0 == 0) goto L_0x0404;
    L_0x03f5:
        r0 = r10.h;
        r0 = r0.b();
        if (r0 == 0) goto L_0x0404;
    L_0x03fd:
        r0 = r11.g;
        if (r0 != 0) goto L_0x0404;
    L_0x0401:
        r10.c(r11);
    L_0x0404:
        r0 = r11.v;
        if (r0 == 0) goto L_0x040d;
    L_0x0408:
        r0 = r11.v;
        r0.a(r5, r3);
    L_0x040d:
        r11.c = r5;
        r11.H = r3;
        r11.d();
        r0 = r11.H;
        if (r0 != 0) goto L_0x0433;
    L_0x0418:
        r0 = new fy;
        r1 = new java.lang.StringBuilder;
        r2 = "Fragment ";
        r1.<init>(r2);
        r1 = r1.append(r11);
        r2 = " did not call through to super.onDestroyView()";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0433:
        r0 = r11.O;
        if (r0 == 0) goto L_0x043c;
    L_0x0437:
        r0 = r11.O;
        r0.e();
    L_0x043c:
        r0 = r11.K;
        if (r0 == 0) goto L_0x046e;
    L_0x0440:
        r0 = r11.J;
        if (r0 == 0) goto L_0x046e;
    L_0x0444:
        r0 = r10.g;
        if (r0 <= 0) goto L_0x0535;
    L_0x0448:
        r0 = r10.u;
        if (r0 != 0) goto L_0x0535;
    L_0x044c:
        r0 = r10.a(r11, r13, r3, r14);
    L_0x0450:
        if (r0 == 0) goto L_0x0467;
    L_0x0452:
        r1 = r11.K;
        r11.d = r1;
        r11.e = r12;
        r1 = r11.K;
        r2 = new dp;
        r2.<init>(r10, r1, r0, r11);
        r0.setAnimationListener(r2);
        r1 = r11.K;
        r1.startAnimation(r0);
    L_0x0467:
        r0 = r11.J;
        r1 = r11.K;
        r0.removeView(r1);
    L_0x046e:
        r11.J = r7;
        r11.K = r7;
        r11.L = r7;
        goto L_0x036c;
    L_0x0476:
        r0 = r11.E;
        if (r0 != 0) goto L_0x04a1;
    L_0x047a:
        r11.p();
    L_0x047d:
        r11.H = r3;
        r11.a();
        r0 = r11.H;
        if (r0 != 0) goto L_0x04a4;
    L_0x0486:
        r0 = new fy;
        r1 = new java.lang.StringBuilder;
        r2 = "Fragment ";
        r1.<init>(r2);
        r1 = r1.append(r11);
        r2 = " did not call through to super.onDetach()";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x04a1:
        r11.c = r3;
        goto L_0x047d;
    L_0x04a4:
        r0 = r11.v;
        if (r0 == 0) goto L_0x04d4;
    L_0x04a8:
        r0 = r11.E;
        if (r0 != 0) goto L_0x04cd;
    L_0x04ac:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r2 = "Child FragmentManager of ";
        r1.<init>(r2);
        r1 = r1.append(r11);
        r2 = " was not ";
        r1 = r1.append(r2);
        r2 = " destroyed and this fragment is not retaining instance";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x04cd:
        r0 = r11.v;
        r0.n();
        r11.v = r7;
    L_0x04d4:
        if (r15 != 0) goto L_0x0045;
    L_0x04d6:
        r0 = r11.E;
        if (r0 != 0) goto L_0x052d;
    L_0x04da:
        r0 = r11.h;
        if (r0 < 0) goto L_0x0045;
    L_0x04de:
        r0 = r10.b;
        r1 = r11.h;
        r0.set(r1, r7);
        r0 = r10.p;
        if (r0 != 0) goto L_0x04f0;
    L_0x04e9:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r10.p = r0;
    L_0x04f0:
        r0 = r10.p;
        r1 = r11.h;
        r1 = java.lang.Integer.valueOf(r1);
        r0.add(r1);
        r0 = r10.h;
        r1 = r11.i;
        r0.a(r1);
        r0 = -1;
        r11.h = r0;
        r11.i = r7;
        r11.n = r3;
        r11.o = r3;
        r11.p = r3;
        r11.q = r3;
        r11.r = r3;
        r11.s = r3;
        r11.t = r7;
        r11.v = r7;
        r11.u = r7;
        r11.y = r3;
        r11.z = r3;
        r11.A = r7;
        r11.B = r3;
        r11.C = r3;
        r11.E = r3;
        r11.O = r7;
        r11.P = r3;
        r11.Q = r3;
        goto L_0x0045;
    L_0x052d:
        r11.u = r7;
        r11.x = r7;
        r11.t = r7;
        goto L_0x0045;
    L_0x0535:
        r0 = r7;
        goto L_0x0450;
    L_0x0538:
        r0 = r7;
        goto L_0x01ef;
        */
        throw new UnsupportedOperationException("Method not decompiled: dm.a(db, int, int, int, boolean):void");
    }

    private void b(db dbVar) {
        a(dbVar, this.g, 0, 0, false);
    }

    final void a(int i, boolean z) {
        a(i, 0, 0, false);
    }

    final void a(int i, int i2, int i3, boolean z) {
        if (this.h == null && i != 0) {
            throw new IllegalStateException("No host");
        } else if (z || this.g != i) {
            this.g = i;
            if (this.b != null) {
                int i4 = 0;
                int i5 = 0;
                while (i4 < this.b.size()) {
                    int a;
                    db dbVar = (db) this.b.get(i4);
                    if (dbVar != null) {
                        a(dbVar, i, i2, i3, false);
                        if (dbVar.O != null) {
                            a = i5 | dbVar.O.a();
                            i4++;
                            i5 = a;
                        }
                    }
                    a = i5;
                    i4++;
                    i5 = a;
                }
                if (i5 == 0) {
                    p();
                }
                if (this.t && this.h != null && this.g == 5) {
                    this.h.d();
                    this.t = false;
                }
            }
        }
    }

    private void p() {
        if (this.b != null) {
            for (int i = 0; i < this.b.size(); i++) {
                db dbVar = (db) this.b.get(i);
                if (dbVar != null && dbVar.M) {
                    if (this.o) {
                        this.v = true;
                    } else {
                        dbVar.M = false;
                        a(dbVar, this.g, 0, 0, false);
                    }
                }
            }
        }
    }

    final void a(db dbVar) {
        if (dbVar.h < 0) {
            if (this.p == null || this.p.size() <= 0) {
                if (this.b == null) {
                    this.b = new ArrayList();
                }
                dbVar.a(this.b.size(), this.r);
                this.b.add(dbVar);
                return;
            }
            dbVar.a(((Integer) this.p.remove(this.p.size() - 1)).intValue(), this.r);
            this.b.set(dbVar.h, dbVar);
        }
    }

    public final void a(db dbVar, boolean z) {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        a(dbVar);
        if (!dbVar.C) {
            if (this.c.contains(dbVar)) {
                throw new IllegalStateException("Fragment already added: " + dbVar);
            }
            this.c.add(dbVar);
            dbVar.n = true;
            dbVar.o = false;
            boolean z2 = dbVar.F;
            if (z) {
                b(dbVar);
            }
        }
    }

    public final void a(db dbVar, int i, int i2) {
        boolean z;
        if (dbVar.s > 0) {
            z = true;
        } else {
            z = false;
        }
        z = !z;
        if (!dbVar.C || z) {
            int i3;
            if (this.c != null) {
                this.c.remove(dbVar);
            }
            boolean z2 = dbVar.F;
            dbVar.n = false;
            dbVar.o = true;
            if (z) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            a(dbVar, i3, i, i2, false);
        }
    }

    public final void b(db dbVar, int i, int i2) {
        if (!dbVar.B) {
            dbVar.B = true;
            if (dbVar.K != null) {
                Animation a = a(dbVar, i, false, i2);
                if (a != null) {
                    dm.a(dbVar.K, a);
                    dbVar.K.startAnimation(a);
                }
                dbVar.K.setVisibility(8);
            }
            if (dbVar.n) {
                boolean z = dbVar.F;
            }
            db.h();
        }
    }

    public final void c(db dbVar, int i, int i2) {
        if (dbVar.B) {
            dbVar.B = false;
            if (dbVar.K != null) {
                Animation a = a(dbVar, i, true, i2);
                if (a != null) {
                    dm.a(dbVar.K, a);
                    dbVar.K.startAnimation(a);
                }
                dbVar.K.setVisibility(0);
            }
            if (dbVar.n) {
                boolean z = dbVar.F;
            }
            db.h();
        }
    }

    public final void d(db dbVar, int i, int i2) {
        if (!dbVar.C) {
            dbVar.C = true;
            if (dbVar.n) {
                if (this.c != null) {
                    this.c.remove(dbVar);
                }
                boolean z = dbVar.F;
                dbVar.n = false;
                a(dbVar, 1, i, i2, false);
            }
        }
    }

    public final void e(db dbVar, int i, int i2) {
        if (dbVar.C) {
            dbVar.C = false;
            if (!dbVar.n) {
                if (this.c == null) {
                    this.c = new ArrayList();
                }
                if (this.c.contains(dbVar)) {
                    throw new IllegalStateException("Fragment already added: " + dbVar);
                }
                this.c.add(dbVar);
                dbVar.n = true;
                boolean z = dbVar.F;
                a(dbVar, this.g, i, i2, false);
            }
        }
    }

    private db b(int i) {
        int size;
        db dbVar;
        if (this.c != null) {
            for (size = this.c.size() - 1; size >= 0; size--) {
                dbVar = (db) this.c.get(size);
                if (dbVar != null && dbVar.y == i) {
                    return dbVar;
                }
            }
        }
        if (this.b != null) {
            for (size = this.b.size() - 1; size >= 0; size--) {
                dbVar = (db) this.b.get(size);
                if (dbVar != null && dbVar.y == i) {
                    return dbVar;
                }
            }
        }
        return null;
    }

    public final db a(String str) {
        int size;
        db dbVar;
        if (!(this.c == null || str == null)) {
            for (size = this.c.size() - 1; size >= 0; size--) {
                dbVar = (db) this.c.get(size);
                if (dbVar != null && str.equals(dbVar.A)) {
                    return dbVar;
                }
            }
        }
        if (!(this.b == null || str == null)) {
            for (size = this.b.size() - 1; size >= 0; size--) {
                dbVar = (db) this.b.get(size);
                if (dbVar != null && str.equals(dbVar.A)) {
                    return dbVar;
                }
            }
        }
        return null;
    }

    public final db b(String str) {
        if (!(this.b == null || str == null)) {
            for (int size = this.b.size() - 1; size >= 0; size--) {
                db dbVar = (db) this.b.get(size);
                if (dbVar != null) {
                    if (!str.equals(dbVar.i)) {
                        dbVar = dbVar.v != null ? dbVar.v.b(str) : null;
                    }
                    if (dbVar != null) {
                        return dbVar;
                    }
                }
            }
        }
        return null;
    }

    private final void q() {
        if (this.j) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.k != null) {
            throw new IllegalStateException("Can not perform this action inside of " + this.k);
        }
    }

    public final void a(Runnable runnable, boolean z) {
        if (!z) {
            q();
        }
        synchronized (this) {
            if (this.u || this.h == null) {
                throw new IllegalStateException("Activity has been destroyed");
            }
            if (this.m == null) {
                this.m = new ArrayList();
            }
            this.m.add(runnable);
            if (this.m.size() == 1) {
                this.h.c.removeCallbacks(this.y);
                this.h.c.post(this.y);
            }
        }
    }

    public final int a(cp cpVar) {
        int size;
        synchronized (this) {
            if (this.f == null || this.f.size() <= 0) {
                if (this.e == null) {
                    this.e = new ArrayList();
                }
                size = this.e.size();
                this.e.add(cpVar);
            } else {
                size = ((Integer) this.f.remove(this.f.size() - 1)).intValue();
                this.e.set(size, cpVar);
            }
        }
        return size;
    }

    private void a(int i, cp cpVar) {
        synchronized (this) {
            if (this.e == null) {
                this.e = new ArrayList();
            }
            int size = this.e.size();
            if (i < size) {
                this.e.set(i, cpVar);
            } else {
                while (size < i) {
                    this.e.add(null);
                    if (this.f == null) {
                        this.f = new ArrayList();
                    }
                    this.f.add(Integer.valueOf(size));
                    size++;
                }
                this.e.add(cpVar);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f() {
        /*
        r6 = this;
        r2 = 1;
        r1 = 0;
        r0 = r6.o;
        if (r0 == 0) goto L_0x000e;
    L_0x0006:
        r0 = new java.lang.IllegalStateException;
        r1 = "FragmentManager is already executing transactions";
        r0.<init>(r1);
        throw r0;
    L_0x000e:
        r0 = android.os.Looper.myLooper();
        r3 = r6.h;
        r3 = r3.c;
        r3 = r3.getLooper();
        if (r0 == r3) goto L_0x0024;
    L_0x001c:
        r0 = new java.lang.IllegalStateException;
        r1 = "Must be called from main thread of fragment host";
        r0.<init>(r1);
        throw r0;
    L_0x0024:
        r0 = r1;
    L_0x0025:
        monitor-enter(r6);
        r3 = r6.m;	 Catch:{ all -> 0x0074 }
        if (r3 == 0) goto L_0x0032;
    L_0x002a:
        r3 = r6.m;	 Catch:{ all -> 0x0074 }
        r3 = r3.size();	 Catch:{ all -> 0x0074 }
        if (r3 != 0) goto L_0x0037;
    L_0x0032:
        monitor-exit(r6);	 Catch:{ all -> 0x0074 }
        r6.r();
        return r0;
    L_0x0037:
        r0 = r6.m;	 Catch:{ all -> 0x0074 }
        r3 = r0.size();	 Catch:{ all -> 0x0074 }
        r0 = r6.n;	 Catch:{ all -> 0x0074 }
        if (r0 == 0) goto L_0x0046;
    L_0x0041:
        r0 = r6.n;	 Catch:{ all -> 0x0074 }
        r0 = r0.length;	 Catch:{ all -> 0x0074 }
        if (r0 >= r3) goto L_0x004a;
    L_0x0046:
        r0 = new java.lang.Runnable[r3];	 Catch:{ all -> 0x0074 }
        r6.n = r0;	 Catch:{ all -> 0x0074 }
    L_0x004a:
        r0 = r6.m;	 Catch:{ all -> 0x0074 }
        r4 = r6.n;	 Catch:{ all -> 0x0074 }
        r0.toArray(r4);	 Catch:{ all -> 0x0074 }
        r0 = r6.m;	 Catch:{ all -> 0x0074 }
        r0.clear();	 Catch:{ all -> 0x0074 }
        r0 = r6.h;	 Catch:{ all -> 0x0074 }
        r0 = r0.c;	 Catch:{ all -> 0x0074 }
        r4 = r6.y;	 Catch:{ all -> 0x0074 }
        r0.removeCallbacks(r4);	 Catch:{ all -> 0x0074 }
        monitor-exit(r6);	 Catch:{ all -> 0x0074 }
        r6.o = r2;
        r0 = r1;
    L_0x0063:
        if (r0 >= r3) goto L_0x0077;
    L_0x0065:
        r4 = r6.n;
        r4 = r4[r0];
        r4.run();
        r4 = r6.n;
        r5 = 0;
        r4[r0] = r5;
        r0 = r0 + 1;
        goto L_0x0063;
    L_0x0074:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0074 }
        throw r0;
    L_0x0077:
        r6.o = r1;
        r0 = r2;
        goto L_0x0025;
        */
        throw new UnsupportedOperationException("Method not decompiled: dm.f():boolean");
    }

    private void r() {
        if (this.v) {
            int i = 0;
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                db dbVar = (db) this.b.get(i2);
                if (!(dbVar == null || dbVar.O == null)) {
                    i |= dbVar.O.a();
                }
            }
            if (i == 0) {
                this.v = false;
                p();
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final boolean a(java.lang.String r11, int r12, int r13) {
        /*
        r10 = this;
        r4 = 0;
        r2 = 1;
        r3 = 0;
        r0 = r10.d;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return r3;
    L_0x0008:
        if (r12 >= 0) goto L_0x0036;
    L_0x000a:
        r0 = r13 & 1;
        if (r0 != 0) goto L_0x0036;
    L_0x000e:
        r0 = r10.d;
        r0 = r0.size();
        r0 = r0 + -1;
        if (r0 < 0) goto L_0x0007;
    L_0x0018:
        r1 = r10.d;
        r0 = r1.remove(r0);
        r0 = (defpackage.cp) r0;
        r1 = new android.util.SparseArray;
        r1.<init>();
        r3 = new android.util.SparseArray;
        r3.<init>();
        r5 = r10.g;
        if (r5 <= 0) goto L_0x0031;
    L_0x002e:
        r0.a(r1, r3);
    L_0x0031:
        r0.a(r2, r4, r1, r3);
    L_0x0034:
        r3 = r2;
        goto L_0x0007;
    L_0x0036:
        r0 = -1;
        if (r12 < 0) goto L_0x0070;
    L_0x0039:
        r0 = r10.d;
        r0 = r0.size();
        r1 = r0 + -1;
    L_0x0041:
        if (r1 < 0) goto L_0x0054;
    L_0x0043:
        r0 = r10.d;
        r0 = r0.get(r1);
        r0 = (defpackage.cp) r0;
        if (r12 < 0) goto L_0x0051;
    L_0x004d:
        r0 = r0.k;
        if (r12 == r0) goto L_0x0054;
    L_0x0051:
        r1 = r1 + -1;
        goto L_0x0041;
    L_0x0054:
        if (r1 < 0) goto L_0x0007;
    L_0x0056:
        r0 = r13 & 1;
        if (r0 == 0) goto L_0x006f;
    L_0x005a:
        r1 = r1 + -1;
    L_0x005c:
        if (r1 < 0) goto L_0x006f;
    L_0x005e:
        r0 = r10.d;
        r0 = r0.get(r1);
        r0 = (defpackage.cp) r0;
        if (r12 < 0) goto L_0x006f;
    L_0x0068:
        r0 = r0.k;
        if (r12 != r0) goto L_0x006f;
    L_0x006c:
        r1 = r1 + -1;
        goto L_0x005c;
    L_0x006f:
        r0 = r1;
    L_0x0070:
        r1 = r10.d;
        r1 = r1.size();
        r1 = r1 + -1;
        if (r0 == r1) goto L_0x0007;
    L_0x007a:
        r6 = new java.util.ArrayList;
        r6.<init>();
        r1 = r10.d;
        r1 = r1.size();
        r1 = r1 + -1;
    L_0x0087:
        if (r1 <= r0) goto L_0x0095;
    L_0x0089:
        r5 = r10.d;
        r5 = r5.remove(r1);
        r6.add(r5);
        r1 = r1 + -1;
        goto L_0x0087;
    L_0x0095:
        r0 = r6.size();
        r7 = r0 + -1;
        r8 = new android.util.SparseArray;
        r8.<init>();
        r9 = new android.util.SparseArray;
        r9.<init>();
        r0 = r10.g;
        if (r0 <= 0) goto L_0x00b9;
    L_0x00a9:
        r1 = r3;
    L_0x00aa:
        if (r1 > r7) goto L_0x00b9;
    L_0x00ac:
        r0 = r6.get(r1);
        r0 = (defpackage.cp) r0;
        r0.a(r8, r9);
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x00aa;
    L_0x00b9:
        r5 = r4;
        r4 = r3;
    L_0x00bb:
        if (r4 > r7) goto L_0x0034;
    L_0x00bd:
        r0 = r6.get(r4);
        r0 = (defpackage.cp) r0;
        if (r4 != r7) goto L_0x00cf;
    L_0x00c5:
        r1 = r2;
    L_0x00c6:
        r1 = r0.a(r1, r5, r8, r9);
        r0 = r4 + 1;
        r4 = r0;
        r5 = r1;
        goto L_0x00bb;
    L_0x00cf:
        r1 = r3;
        goto L_0x00c6;
        */
        throw new UnsupportedOperationException("Method not decompiled: dm.a(java.lang.String, int, int):boolean");
    }

    final dt g() {
        List list;
        List list2;
        if (this.b != null) {
            int i = 0;
            list = null;
            list2 = null;
            while (i < this.b.size()) {
                ArrayList arrayList;
                db dbVar = (db) this.b.get(i);
                if (dbVar != null) {
                    boolean z;
                    if (dbVar.D) {
                        if (list2 == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(dbVar);
                        dbVar.E = true;
                        dbVar.l = dbVar.k != null ? dbVar.k.h : -1;
                    }
                    if (dbVar.v != null) {
                        dt g = dbVar.v.g();
                        if (g != null) {
                            ArrayList arrayList2;
                            if (list == null) {
                                arrayList2 = new ArrayList();
                                for (int i2 = 0; i2 < i; i2++) {
                                    arrayList2.add(null);
                                }
                            } else {
                                arrayList2 = list;
                            }
                            arrayList2.add(g);
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
        return new dt(list2, list);
    }

    private void c(db dbVar) {
        if (dbVar.L != null) {
            if (this.x == null) {
                this.x = new SparseArray();
            } else {
                this.x.clear();
            }
            dbVar.L.saveHierarchyState(this.x);
            if (this.x.size() > 0) {
                dbVar.g = this.x;
                this.x = null;
            }
        }
    }

    final Parcelable h() {
        cu[] cuVarArr = null;
        f();
        if (l) {
            this.j = true;
        }
        if (this.b == null || this.b.size() <= 0) {
            return null;
        }
        int size = this.b.size();
        dw[] dwVarArr = new dw[size];
        int i = 0;
        boolean z = false;
        while (i < size) {
            boolean z2;
            db dbVar = (db) this.b.get(i);
            if (dbVar != null) {
                if (dbVar.h < 0) {
                    a(new IllegalStateException("Failure saving state: active " + dbVar + " has cleared index: " + dbVar.h));
                }
                dw dwVar = new dw(dbVar);
                dwVarArr[i] = dwVar;
                if (dbVar.c <= 0 || dwVar.k != null) {
                    dwVar.k = dbVar.f;
                } else {
                    Bundle bundle;
                    if (this.w == null) {
                        this.w = new Bundle();
                    }
                    dbVar.h(this.w);
                    if (this.w.isEmpty()) {
                        bundle = null;
                    } else {
                        bundle = this.w;
                        this.w = null;
                    }
                    if (dbVar.K != null) {
                        c(dbVar);
                    }
                    if (dbVar.g != null) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putSparseParcelableArray("android:view_state", dbVar.g);
                    }
                    if (!dbVar.N) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putBoolean("android:user_visible_hint", dbVar.N);
                    }
                    dwVar.k = bundle;
                    if (dbVar.k != null) {
                        if (dbVar.k.h < 0) {
                            a(new IllegalStateException("Failure saving state: " + dbVar + " has target not in fragment manager: " + dbVar.k));
                        }
                        if (dwVar.k == null) {
                            dwVar.k = new Bundle();
                        }
                        bundle = dwVar.k;
                        String str = "android:target_state";
                        db dbVar2 = dbVar.k;
                        if (dbVar2.h < 0) {
                            a(new IllegalStateException("Fragment " + dbVar2 + " is not currently in the FragmentManager"));
                        }
                        bundle.putInt(str, dbVar2.h);
                        if (dbVar.m != 0) {
                            dwVar.k.putInt("android:target_req_state", dbVar.m);
                            z2 = true;
                        }
                    }
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
        du duVar;
        if (this.c != null) {
            i = this.c.size();
            if (i > 0) {
                iArr = new int[i];
                for (i2 = 0; i2 < i; i2++) {
                    iArr[i2] = ((db) this.c.get(i2)).h;
                    if (iArr[i2] < 0) {
                        a(new IllegalStateException("Failure saving state: active " + this.c.get(i2) + " has cleared index: " + iArr[i2]));
                    }
                }
                if (this.d != null) {
                    i = this.d.size();
                    if (i > 0) {
                        cuVarArr = new cu[i];
                        for (i2 = 0; i2 < i; i2++) {
                            cuVarArr[i2] = new cu((cp) this.d.get(i2));
                        }
                    }
                }
                duVar = new du();
                duVar.a = dwVarArr;
                duVar.b = iArr;
                duVar.c = cuVarArr;
                return duVar;
            }
        }
        iArr = null;
        if (this.d != null) {
            i = this.d.size();
            if (i > 0) {
                cuVarArr = new cu[i];
                for (i2 = 0; i2 < i; i2++) {
                    cuVarArr[i2] = new cu((cp) this.d.get(i2));
                }
            }
        }
        duVar = new du();
        duVar.a = dwVarArr;
        duVar.b = iArr;
        duVar.c = cuVarArr;
        return duVar;
    }

    final void a(Parcelable parcelable, dt dtVar) {
        int i = 0;
        if (parcelable != null) {
            du duVar = (du) parcelable;
            if (duVar.a != null) {
                List list;
                int size;
                int i2;
                db dbVar;
                List list2;
                if (dtVar != null) {
                    list = dtVar.a;
                    List list3 = dtVar.b;
                    if (list != null) {
                        size = list.size();
                    } else {
                        size = 0;
                    }
                    for (i2 = 0; i2 < size; i2++) {
                        dbVar = (db) list.get(i2);
                        dw dwVar = duVar.a[dbVar.h];
                        dwVar.l = dbVar;
                        dbVar.g = null;
                        dbVar.s = 0;
                        dbVar.q = false;
                        dbVar.n = false;
                        dbVar.k = null;
                        if (dwVar.k != null) {
                            dwVar.k.setClassLoader(this.h.b.getClassLoader());
                            dbVar.g = dwVar.k.getSparseParcelableArray("android:view_state");
                            dbVar.f = dwVar.k;
                        }
                    }
                    list2 = list3;
                } else {
                    list2 = null;
                }
                this.b = new ArrayList(duVar.a.length);
                if (this.p != null) {
                    this.p.clear();
                }
                int i3 = 0;
                while (i3 < duVar.a.length) {
                    dw dwVar2 = duVar.a[i3];
                    if (dwVar2 != null) {
                        dt dtVar2;
                        if (list2 == null || i3 >= list2.size()) {
                            dtVar2 = null;
                        } else {
                            dtVar2 = (dt) list2.get(i3);
                        }
                        dk dkVar = this.h;
                        db dbVar2 = this.r;
                        if (dwVar2.l == null) {
                            Context context = dkVar.b;
                            if (dwVar2.i != null) {
                                dwVar2.i.setClassLoader(context.getClassLoader());
                            }
                            dwVar2.l = db.a(context, dwVar2.a, dwVar2.i);
                            if (dwVar2.k != null) {
                                dwVar2.k.setClassLoader(context.getClassLoader());
                                dwVar2.l.f = dwVar2.k;
                            }
                            dwVar2.l.a(dwVar2.b, dbVar2);
                            dwVar2.l.p = dwVar2.c;
                            dwVar2.l.r = true;
                            dwVar2.l.y = dwVar2.d;
                            dwVar2.l.z = dwVar2.e;
                            dwVar2.l.A = dwVar2.f;
                            dwVar2.l.D = dwVar2.g;
                            dwVar2.l.C = dwVar2.h;
                            dwVar2.l.B = dwVar2.j;
                            dwVar2.l.t = dkVar.d;
                            boolean z = a;
                        }
                        dwVar2.l.w = dtVar2;
                        this.b.add(dwVar2.l);
                        dwVar2.l = null;
                    } else {
                        this.b.add(null);
                        if (this.p == null) {
                            this.p = new ArrayList();
                        }
                        this.p.add(Integer.valueOf(i3));
                    }
                    i3++;
                }
                if (dtVar != null) {
                    list = dtVar.a;
                    if (list != null) {
                        i3 = list.size();
                    } else {
                        i3 = 0;
                    }
                    for (i2 = 0; i2 < i3; i2++) {
                        dbVar = (db) list.get(i2);
                        if (dbVar.l >= 0) {
                            if (dbVar.l < this.b.size()) {
                                dbVar.k = (db) this.b.get(dbVar.l);
                            } else {
                                Log.w("FragmentManager", "Re-attaching retained fragment " + dbVar + " target no longer exists: " + dbVar.l);
                                dbVar.k = null;
                            }
                        }
                    }
                }
                if (duVar.b != null) {
                    this.c = new ArrayList(duVar.b.length);
                    for (size = 0; size < duVar.b.length; size++) {
                        dbVar = (db) this.b.get(duVar.b[size]);
                        if (dbVar == null) {
                            a(new IllegalStateException("No instantiated fragment for index #" + duVar.b[size]));
                        }
                        dbVar.n = true;
                        if (this.c.contains(dbVar)) {
                            throw new IllegalStateException("Already added!");
                        }
                        this.c.add(dbVar);
                    }
                } else {
                    this.c = null;
                }
                if (duVar.c != null) {
                    this.d = new ArrayList(duVar.c.length);
                    while (i < duVar.c.length) {
                        cp a = duVar.c[i].a(this);
                        this.d.add(a);
                        if (a.k >= 0) {
                            a(a.k, a);
                        }
                        i++;
                    }
                    return;
                }
                this.d = null;
            }
        }
    }

    public final void a(dk dkVar, di diVar, db dbVar) {
        if (this.h != null) {
            throw new IllegalStateException("Already attached");
        }
        this.h = dkVar;
        this.i = diVar;
        this.r = dbVar;
    }

    public final void i() {
        this.j = false;
        a(1, false);
    }

    public final void j() {
        this.j = false;
        a(2, false);
    }

    public final void k() {
        this.j = false;
        a(4, false);
    }

    public final void l() {
        this.j = false;
        a(5, false);
    }

    public final void m() {
        this.j = true;
        a(3, false);
    }

    public final void n() {
        this.u = true;
        f();
        a(0, false);
        this.h = null;
        this.i = null;
        this.r = null;
    }

    public final void a(boolean z) {
        if (this.c != null) {
            for (int size = this.c.size() - 1; size >= 0; size--) {
                db dbVar = (db) this.c.get(size);
                if (!(dbVar == null || dbVar.v == null)) {
                    dbVar.v.a(z);
                }
            }
        }
    }

    public final void b(boolean z) {
        if (this.c != null) {
            for (int size = this.c.size() - 1; size >= 0; size--) {
                db dbVar = (db) this.c.get(size);
                if (!(dbVar == null || dbVar.v == null)) {
                    dbVar.v.b(z);
                }
            }
        }
    }

    public final void a(Configuration configuration) {
        if (this.c != null) {
            for (int i = 0; i < this.c.size(); i++) {
                db dbVar = (db) this.c.get(i);
                if (dbVar != null) {
                    dbVar.onConfigurationChanged(configuration);
                    if (dbVar.v != null) {
                        dbVar.v.a(configuration);
                    }
                }
            }
        }
    }

    public final void o() {
        if (this.c != null) {
            for (int i = 0; i < this.c.size(); i++) {
                db dbVar = (db) this.c.get(i);
                if (dbVar != null) {
                    dbVar.onLowMemory();
                    if (dbVar.v != null) {
                        dbVar.v.o();
                    }
                }
            }
        }
    }

    public final boolean a(Menu menu, MenuInflater menuInflater) {
        boolean z;
        int i = 0;
        ArrayList arrayList = null;
        if (this.c != null) {
            int i2 = 0;
            z = false;
            while (i2 < this.c.size()) {
                db dbVar = (db) this.c.get(i2);
                if (dbVar != null) {
                    int i3;
                    if (dbVar.B || dbVar.v == null) {
                        i3 = 0;
                    } else {
                        i3 = dbVar.v.a(menu, menuInflater) | 0;
                    }
                    if (i3 != 0) {
                        z = true;
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(dbVar);
                    }
                }
                i2++;
                z = z;
            }
        } else {
            z = false;
        }
        if (this.q != null) {
            while (i < this.q.size()) {
                dbVar = (db) this.q.get(i);
                if (arrayList == null || !arrayList.contains(dbVar)) {
                    db.n();
                }
                i++;
            }
        }
        this.q = arrayList;
        return z;
    }

    public final boolean a(Menu menu) {
        if (this.c == null) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.c.size(); i++) {
            db dbVar = (db) this.c.get(i);
            if (dbVar != null) {
                int i2;
                if (dbVar.B || dbVar.v == null) {
                    i2 = 0;
                } else {
                    i2 = dbVar.v.a(menu) | 0;
                }
                if (i2 != 0) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final boolean a(MenuItem menuItem) {
        if (this.c == null) {
            return false;
        }
        for (int i = 0; i < this.c.size(); i++) {
            db dbVar = (db) this.c.get(i);
            if (dbVar != null) {
                boolean z;
                if (dbVar.B || dbVar.v == null || !dbVar.v.a(menuItem)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(MenuItem menuItem) {
        if (this.c == null) {
            return false;
        }
        for (int i = 0; i < this.c.size(); i++) {
            db dbVar = (db) this.c.get(i);
            if (dbVar != null) {
                boolean z;
                if (dbVar.B || dbVar.v == null || !dbVar.v.b(menuItem)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b(Menu menu) {
        if (this.c != null) {
            for (int i = 0; i < this.c.size(); i++) {
                db dbVar = (db) this.c.get(i);
                if (!(dbVar == null || dbVar.B || dbVar.v == null)) {
                    dbVar.v.b(menu);
                }
            }
        }
    }

    public static int a(int i) {
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

    public final View a(View view, String str, Context context, AttributeSet attributeSet) {
        if (!"fragment".equals(str)) {
            return null;
        }
        String string;
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ds.a);
        if (attributeValue == null) {
            string = obtainStyledAttributes.getString(0);
        } else {
            string = attributeValue;
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string2 = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!db.b(this.h.b, string)) {
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
        db dbVar;
        db b = resourceId != -1 ? b(resourceId) : null;
        if (b == null && string2 != null) {
            b = a(string2);
        }
        if (b == null && id != -1) {
            b = b(id);
        }
        if (b == null) {
            db a = db.a(context, string);
            a.p = true;
            a.y = resourceId != 0 ? resourceId : id;
            a.z = id;
            a.A = string2;
            a.q = true;
            a.t = this;
            a.u = this.h;
            a.a(attributeSet, a.f);
            a(a, true);
            dbVar = a;
        } else if (b.q) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string2 + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + string);
        } else {
            b.q = true;
            b.u = this.h;
            if (!b.E) {
                b.a(attributeSet, b.f);
            }
            dbVar = b;
        }
        if (this.g > 0 || !dbVar.p) {
            b(dbVar);
        } else {
            a(dbVar, 1, 0, 0, false);
        }
        if (dbVar.K == null) {
            throw new IllegalStateException("Fragment " + string + " did not create a view.");
        }
        if (resourceId != 0) {
            dbVar.K.setId(resourceId);
        }
        if (dbVar.K.getTag() == null) {
            dbVar.K.setTag(string2);
        }
        return dbVar.K;
    }
}
