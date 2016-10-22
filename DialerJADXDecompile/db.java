import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: PG */
public class db implements ComponentCallbacks, OnCreateContextMenuListener {
    private static final ij a;
    static final Object b;
    String A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    boolean F;
    boolean G;
    boolean H;
    int I;
    ViewGroup J;
    View K;
    View L;
    boolean M;
    boolean N;
    eg O;
    boolean P;
    boolean Q;
    Object R;
    Object S;
    Object T;
    fx U;
    fx V;
    private Object W;
    private Object X;
    private Object Y;
    int c;
    View d;
    int e;
    Bundle f;
    SparseArray g;
    int h;
    String i;
    public Bundle j;
    db k;
    int l;
    int m;
    boolean n;
    public boolean o;
    boolean p;
    boolean q;
    boolean r;
    int s;
    dm t;
    public dk u;
    dm v;
    dt w;
    db x;
    int y;
    int z;

    static {
        a = new ij();
        b = new Object();
    }

    public db() {
        this.c = 0;
        this.h = -1;
        this.l = -1;
        this.G = true;
        this.N = true;
        this.W = null;
        this.R = b;
        this.X = null;
        this.S = b;
        this.Y = null;
        this.T = b;
        this.U = null;
        this.V = null;
    }

    public static db a(Context context, String str) {
        return a(context, str, null);
    }

    public static db a(Context context, String str, Bundle bundle) {
        try {
            Class cls = (Class) a.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                a.put(str, cls);
            }
            db dbVar = (db) cls.newInstance();
            if (bundle != null) {
                bundle.setClassLoader(dbVar.getClass().getClassLoader());
                dbVar.j = bundle;
            }
            return dbVar;
        } catch (Exception e) {
            throw new dd("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (Exception e2) {
            throw new dd("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (Exception e22) {
            throw new dd("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e22);
        }
    }

    static boolean b(Context context, String str) {
        try {
            Class cls = (Class) a.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                a.put(str, cls);
            }
            return db.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    final void a(int i, db dbVar) {
        this.h = i;
        if (dbVar != null) {
            this.i = dbVar.i + ":" + this.h;
        } else {
            this.i = "android:fragment:" + this.h;
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        buf.a((Object) this, stringBuilder);
        if (this.h >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.h);
        }
        if (this.y != 0) {
            stringBuilder.append(" id=0x");
            stringBuilder.append(Integer.toHexString(this.y));
        }
        if (this.A != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.A);
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final void f(Bundle bundle) {
        if (this.h >= 0) {
            throw new IllegalStateException("Fragment already active");
        }
        this.j = bundle;
    }

    public final de e() {
        if (this.u == null) {
            return null;
        }
        return (de) this.u.a;
    }

    public final Resources f() {
        if (this.u != null) {
            return this.u.b.getResources();
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final String a(int i) {
        return f().getString(i);
    }

    public final String a(int i, Object... objArr) {
        return f().getString(i, objArr);
    }

    public final boolean g() {
        return this.u != null && this.n;
    }

    public static void h() {
    }

    public void a(int i, int i2) {
    }

    public static void i() {
    }

    public LayoutInflater b(Bundle bundle) {
        LayoutInflater c = this.u.c();
        if (this.v == null) {
            q();
            if (this.c >= 5) {
                this.v.l();
            } else if (this.c >= 4) {
                this.v.k();
            } else if (this.c >= 2) {
                this.v.j();
            } else if (this.c > 0) {
                this.v.i();
            }
        }
        dm dmVar = this.v;
        jf.a(c, this.v);
        return c;
    }

    public final void a(AttributeSet attributeSet, Bundle bundle) {
        Activity activity;
        this.H = true;
        if (this.u == null) {
            activity = null;
        } else {
            activity = this.u.a;
        }
        if (activity != null) {
            this.H = false;
            this.H = true;
        }
    }

    public static void j() {
    }

    public void a(Context context) {
        Activity activity;
        this.H = true;
        if (this.u == null) {
            activity = null;
        } else {
            activity = this.u.a;
        }
        if (activity != null) {
            this.H = false;
            this.H = true;
        }
    }

    public static Animation k() {
        return null;
    }

    public void a(Bundle bundle) {
        boolean z = true;
        this.H = true;
        g(bundle);
        if (this.v != null) {
            if (this.v.g <= 0) {
                z = false;
            }
            if (!z) {
                this.v.i();
            }
        }
    }

    final void g(Bundle bundle) {
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            if (parcelable != null) {
                if (this.v == null) {
                    q();
                }
                this.v.a(parcelable, this.w);
                this.w = null;
                this.v.i();
            }
        }
    }

    public static void l() {
    }

    public void d(Bundle bundle) {
        this.H = true;
    }

    public void b() {
        this.H = true;
        if (!this.P) {
            this.P = true;
            if (!this.Q) {
                this.Q = true;
                this.O = this.u.a(this.i, this.P, false);
            }
            if (this.O != null) {
                this.O.b();
            }
        }
    }

    public void e(Bundle bundle) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.H = true;
    }

    public void m() {
        this.H = true;
    }

    public void c() {
        this.H = true;
    }

    public void onLowMemory() {
        this.H = true;
    }

    public void d() {
        this.H = true;
    }

    public void a() {
        this.H = true;
    }

    public static void n() {
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        e().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.y));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.z));
        printWriter.print(" mTag=");
        printWriter.println(this.A);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.c);
        printWriter.print(" mIndex=");
        printWriter.print(this.h);
        printWriter.print(" mWho=");
        printWriter.print(this.i);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.s);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.n);
        printWriter.print(" mRemoving=");
        printWriter.print(this.o);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.p);
        printWriter.print(" mInLayout=");
        printWriter.println(this.q);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.B);
        printWriter.print(" mDetached=");
        printWriter.print(this.C);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.G);
        printWriter.print(" mHasMenu=");
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.D);
        printWriter.print(" mRetaining=");
        printWriter.print(this.E);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.N);
        if (this.t != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.t);
        }
        if (this.u != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.u);
        }
        if (this.x != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.x);
        }
        if (this.j != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.j);
        }
        if (this.f != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f);
        }
        if (this.g != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.g);
        }
        if (this.k != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.k);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.m);
        }
        if (this.I != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(this.I);
        }
        if (this.J != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.J);
        }
        if (this.K != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.K);
        }
        if (this.L != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.K);
        }
        if (this.d != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(this.d);
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(this.e);
        }
        if (this.O != null) {
            printWriter.print(str);
            printWriter.println("Loader Manager:");
            this.O.a(str + "  ", fileDescriptor, printWriter, strArr);
        }
        if (this.v != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.v + ":");
            this.v.a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    private void q() {
        this.v = new dm();
        this.v.a(this.u, new dc(this), this);
    }

    final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.v != null) {
            this.v.j = false;
        }
        return null;
    }

    final void h(Bundle bundle) {
        e(bundle);
        if (this.v != null) {
            Parcelable h = this.v.h();
            if (h != null) {
                bundle.putParcelable("android:support:fragments", h);
            }
        }
    }

    final void o() {
        if (this.v != null) {
            this.v.a(2, false);
        }
        this.c = 2;
        if (this.P) {
            this.P = false;
            if (!this.Q) {
                this.Q = true;
                this.O = this.u.a(this.i, this.P, false);
            }
            if (this.O == null) {
                return;
            }
            if (this.u.f) {
                this.O.d();
            } else {
                this.O.c();
            }
        }
    }

    final void p() {
        if (this.v != null) {
            this.v.n();
        }
        this.c = 0;
        this.H = false;
        this.H = true;
        if (!this.Q) {
            this.Q = true;
            this.O = this.u.a(this.i, this.P, false);
        }
        if (this.O != null) {
            this.O.g();
        }
        if (this.H) {
            this.v = null;
            return;
        }
        throw new fy("Fragment " + this + " did not call through to super.onDestroy()");
    }
}
