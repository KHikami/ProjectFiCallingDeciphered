package defpackage;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: dr */
public class dr implements ComponentCallbacks, OnCreateContextMenuListener {
    private static final lo<String, Class<?>> a;
    static final Object j;
    int A;
    ee B;
    ec C;
    ee D;
    el E;
    dr F;
    int G;
    int H;
    String I;
    boolean J;
    boolean K;
    boolean L;
    boolean M;
    boolean N;
    boolean O;
    boolean P;
    int Q;
    ViewGroup R;
    View S;
    View T;
    boolean U;
    boolean V;
    fi W;
    boolean X;
    boolean Y;
    Object Z;
    Object aa;
    Object ab;
    Object ac;
    Object ad;
    Object ae;
    Boolean af;
    Boolean ag;
    ho ah;
    ho ai;
    int k;
    View l;
    int m;
    Bundle n;
    SparseArray<Parcelable> o;
    int p;
    String q;
    Bundle r;
    dr s;
    int t;
    int u;
    boolean v;
    boolean w;
    boolean x;
    boolean y;
    boolean z;

    static {
        a = new lo();
        j = new Object();
    }

    public dr() {
        this.k = 0;
        this.p = -1;
        this.t = -1;
        this.O = true;
        this.V = true;
        this.Z = null;
        this.aa = j;
        this.ab = null;
        this.ac = j;
        this.ad = null;
        this.ae = j;
        this.ah = null;
        this.ai = null;
    }

    public static dr instantiate(Context context, String str) {
        return dr.instantiate(context, str, null);
    }

    public static dr instantiate(Context context, String str, Bundle bundle) {
        try {
            Class cls = (Class) a.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                a.put(str, cls);
            }
            dr drVar = (dr) cls.newInstance();
            if (bundle != null) {
                bundle.setClassLoader(drVar.getClass().getClassLoader());
                drVar.r = bundle;
            }
            return drVar;
        } catch (Exception e) {
            throw new dt("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (Exception e2) {
            throw new dt("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (Exception e22) {
            throw new dt("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e22);
        }
    }

    static boolean a(Context context, String str) {
        try {
            Class cls = (Class) a.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                a.put(str, cls);
            }
            return dr.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    final void a(int i, dr drVar) {
        this.p = i;
        if (drVar != null) {
            this.q = drVar.q + ":" + this.p;
        } else {
            this.q = "android:fragment:" + this.p;
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
        gwb.a((Object) this, stringBuilder);
        if (this.p >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.p);
        }
        if (this.G != 0) {
            stringBuilder.append(" id=0x");
            stringBuilder.append(Integer.toHexString(this.G));
        }
        if (this.I != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.I);
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final int getId() {
        return this.G;
    }

    public final String getTag() {
        return this.I;
    }

    public void setArguments(Bundle bundle) {
        if (this.p >= 0) {
            throw new IllegalStateException("Fragment already active");
        }
        this.r = bundle;
    }

    public final Bundle getArguments() {
        return this.r;
    }

    public void setInitialSavedState(du duVar) {
        if (this.p >= 0) {
            throw new IllegalStateException("Fragment already active");
        }
        Bundle bundle = (duVar == null || duVar.a == null) ? null : duVar.a;
        this.n = bundle;
    }

    public void setTargetFragment(dr drVar, int i) {
        this.s = drVar;
        this.u = i;
    }

    public final dr getTargetFragment() {
        return this.s;
    }

    public final int getTargetRequestCode() {
        return this.u;
    }

    public Context getContext() {
        return this.C == null ? null : this.C.i();
    }

    public final dw getActivity() {
        return this.C == null ? null : (dw) this.C.h();
    }

    public final Object getHost() {
        return this.C == null ? null : this.C.g();
    }

    public final Resources getResources() {
        if (this.C != null) {
            return this.C.i().getResources();
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public final ed getFragmentManager() {
        return this.B;
    }

    public final ed getChildFragmentManager() {
        if (this.D == null) {
            O_();
            if (this.k >= 5) {
                this.D.m();
            } else if (this.k >= 4) {
                this.D.l();
            } else if (this.k >= 2) {
                this.D.k();
            } else if (this.k > 0) {
                this.D.j();
            }
        }
        return this.D;
    }

    public final dr getParentFragment() {
        return this.F;
    }

    public final boolean isAdded() {
        return this.C != null && this.v;
    }

    public final boolean isDetached() {
        return this.K;
    }

    public final boolean isRemoving() {
        return this.w;
    }

    public final boolean isInLayout() {
        return this.y;
    }

    public final boolean isResumed() {
        return this.k >= 5;
    }

    public final boolean isVisible() {
        return (!isAdded() || isHidden() || this.S == null || this.S.getWindowToken() == null || this.S.getVisibility() != 0) ? false : true;
    }

    public final boolean isHidden() {
        return this.J;
    }

    public final boolean hasOptionsMenu() {
        return this.N;
    }

    public final boolean isMenuVisible() {
        return this.O;
    }

    public void onHiddenChanged(boolean z) {
    }

    public void setRetainInstance(boolean z) {
        this.L = z;
    }

    public final boolean getRetainInstance() {
        return this.L;
    }

    public void setHasOptionsMenu(boolean z) {
        if (this.N != z) {
            this.N = z;
            if (isAdded() && !isHidden()) {
                this.C.d();
            }
        }
    }

    public void setMenuVisibility(boolean z) {
        if (this.O != z) {
            this.O = z;
            if (this.N && isAdded() && !isHidden()) {
                this.C.d();
            }
        }
    }

    public void setUserVisibleHint(boolean z) {
        if (!this.V && z && this.k < 4 && this.B != null && isAdded()) {
            this.B.a(this);
        }
        this.V = z;
        boolean z2 = this.k < 4 && !z;
        this.U = z2;
    }

    public boolean getUserVisibleHint() {
        return this.V;
    }

    public fg getLoaderManager() {
        if (this.W != null) {
            return this.W;
        }
        if (this.C == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.Y = true;
        this.W = this.C.a(this.q, this.X, true);
        return this.W;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        if (this.C == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.C.a(this, intent, -1, bundle);
    }

    public void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (this.C == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.C.a(this, intent, i, bundle);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (this.C == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.C.a(this, intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void requestPermissions(String[] strArr, int i) {
        if (this.C == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.C.a(this, strArr, i);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        if (this.C != null) {
            return this.C.a(str);
        }
        return false;
    }

    public LayoutInflater getLayoutInflater(Bundle bundle) {
        LayoutInflater c = this.C.c();
        getChildFragmentManager();
        mq.a(c, this.D.t());
        return c;
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.P = true;
        Activity h = this.C == null ? null : this.C.h();
        if (h != null) {
            this.P = false;
            onInflate(h, attributeSet, bundle);
        }
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.P = true;
    }

    public void onAttachFragment(dr drVar) {
    }

    public void onAttach(Context context) {
        this.P = true;
        Activity h = this.C == null ? null : this.C.h();
        if (h != null) {
            this.P = false;
            onAttach(h);
        }
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.P = true;
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public void onCreate(Bundle bundle) {
        this.P = true;
        b(bundle);
        if (this.D != null && !this.D.b(1)) {
            this.D.j();
        }
    }

    void b(Bundle bundle) {
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            if (parcelable != null) {
                if (this.D == null) {
                    O_();
                }
                this.D.a(parcelable, this.E);
                this.E = null;
                this.D.j();
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public View getView() {
        return this.S;
    }

    public void onActivityCreated(Bundle bundle) {
        this.P = true;
    }

    public void onViewStateRestored(Bundle bundle) {
        this.P = true;
    }

    public void onStart() {
        this.P = true;
        if (!this.X) {
            this.X = true;
            if (!this.Y) {
                this.Y = true;
                this.W = this.C.a(this.q, this.X, false);
            }
            if (this.W != null) {
                this.W.b();
            }
        }
    }

    public void onResume() {
        this.P = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.P = true;
    }

    public void onPause() {
        this.P = true;
    }

    public void onStop() {
        this.P = true;
    }

    public void onLowMemory() {
        this.P = true;
    }

    public void onDestroyView() {
        this.P = true;
    }

    public void onDestroy() {
        this.P = true;
        if (!this.Y) {
            this.Y = true;
            this.W = this.C.a(this.q, this.X, false);
        }
        if (this.W != null) {
            this.W.h();
        }
    }

    void f() {
        this.p = -1;
        this.q = null;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = false;
        this.A = 0;
        this.B = null;
        this.D = null;
        this.C = null;
        this.G = 0;
        this.H = 0;
        this.I = null;
        this.J = false;
        this.K = false;
        this.M = false;
        this.W = null;
        this.X = false;
        this.Y = false;
    }

    public void onDetach() {
        this.P = true;
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onDestroyOptionsMenu() {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        getActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void setEnterSharedElementCallback(ho hoVar) {
        this.ah = hoVar;
    }

    public void setExitSharedElementCallback(ho hoVar) {
        this.ai = hoVar;
    }

    public void setEnterTransition(Object obj) {
        this.Z = obj;
    }

    public Object getEnterTransition() {
        return this.Z;
    }

    public void setReturnTransition(Object obj) {
        this.aa = obj;
    }

    public Object getReturnTransition() {
        return this.aa == j ? getEnterTransition() : this.aa;
    }

    public void setExitTransition(Object obj) {
        this.ab = obj;
    }

    public Object getExitTransition() {
        return this.ab;
    }

    public void setReenterTransition(Object obj) {
        this.ac = obj;
    }

    public Object getReenterTransition() {
        return this.ac == j ? getExitTransition() : this.ac;
    }

    public void setSharedElementEnterTransition(Object obj) {
        this.ad = obj;
    }

    public Object getSharedElementEnterTransition() {
        return this.ad;
    }

    public void setSharedElementReturnTransition(Object obj) {
        this.ae = obj;
    }

    public Object getSharedElementReturnTransition() {
        return this.ae == j ? getSharedElementEnterTransition() : this.ae;
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        this.ag = Boolean.valueOf(z);
    }

    public boolean getAllowEnterTransitionOverlap() {
        return this.ag == null ? true : this.ag.booleanValue();
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        this.af = Boolean.valueOf(z);
    }

    public boolean getAllowReturnTransitionOverlap() {
        return this.af == null ? true : this.af.booleanValue();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.G));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.H));
        printWriter.print(" mTag=");
        printWriter.println(this.I);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.k);
        printWriter.print(" mIndex=");
        printWriter.print(this.p);
        printWriter.print(" mWho=");
        printWriter.print(this.q);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.A);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.v);
        printWriter.print(" mRemoving=");
        printWriter.print(this.w);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.x);
        printWriter.print(" mInLayout=");
        printWriter.println(this.y);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.J);
        printWriter.print(" mDetached=");
        printWriter.print(this.K);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.O);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.N);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.L);
        printWriter.print(" mRetaining=");
        printWriter.print(this.M);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.V);
        if (this.B != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.B);
        }
        if (this.C != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.C);
        }
        if (this.F != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.F);
        }
        if (this.r != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.r);
        }
        if (this.n != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.n);
        }
        if (this.o != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.o);
        }
        if (this.s != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.s);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.u);
        }
        if (this.Q != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(this.Q);
        }
        if (this.R != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.R);
        }
        if (this.S != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.S);
        }
        if (this.T != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.S);
        }
        if (this.l != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(this.l);
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(this.m);
        }
        if (this.W != null) {
            printWriter.print(str);
            printWriter.println("Loader Manager:");
            this.W.a(str + "  ", fileDescriptor, printWriter, strArr);
        }
        if (this.D != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.D + ":");
            this.D.a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    dr a(String str) {
        if (str.equals(this.q)) {
            return this;
        }
        if (this.D != null) {
            return this.D.b(str);
        }
        return null;
    }

    void O_() {
        this.D = new ee();
        this.D.a(this.C, new ds(this), this);
    }

    void c(Bundle bundle) {
        if (this.D != null) {
            this.D.noteStateNotSaved();
        }
        this.k = 1;
        this.P = false;
        onCreate(bundle);
        if (!this.P) {
            throw new hp("Fragment " + this + " did not call through to super.onCreate()");
        }
    }

    View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.D != null) {
            this.D.noteStateNotSaved();
        }
        return onCreateView(layoutInflater, viewGroup, bundle);
    }

    void d(Bundle bundle) {
        if (this.D != null) {
            this.D.noteStateNotSaved();
        }
        this.k = 2;
        this.P = false;
        onActivityCreated(bundle);
        if (!this.P) {
            throw new hp("Fragment " + this + " did not call through to super.onActivityCreated()");
        } else if (this.D != null) {
            this.D.k();
        }
    }

    void h() {
        if (this.D != null) {
            this.D.noteStateNotSaved();
            this.D.g();
        }
        this.k = 4;
        this.P = false;
        onStart();
        if (this.P) {
            if (this.D != null) {
                this.D.l();
            }
            if (this.W != null) {
                this.W.g();
                return;
            }
            return;
        }
        throw new hp("Fragment " + this + " did not call through to super.onStart()");
    }

    void i() {
        if (this.D != null) {
            this.D.noteStateNotSaved();
            this.D.g();
        }
        this.k = 5;
        this.P = false;
        onResume();
        if (!this.P) {
            throw new hp("Fragment " + this + " did not call through to super.onResume()");
        } else if (this.D != null) {
            this.D.m();
            this.D.g();
        }
    }

    void d(boolean z) {
        onMultiWindowModeChanged(z);
        if (this.D != null) {
            this.D.a(z);
        }
    }

    void e(boolean z) {
        onPictureInPictureModeChanged(z);
        if (this.D != null) {
            this.D.b(z);
        }
    }

    void a(Configuration configuration) {
        onConfigurationChanged(configuration);
        if (this.D != null) {
            this.D.a(configuration);
        }
    }

    void j() {
        onLowMemory();
        if (this.D != null) {
            this.D.s();
        }
    }

    boolean a(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.J) {
            return false;
        }
        if (this.N && this.O) {
            z = true;
            onCreateOptionsMenu(menu, menuInflater);
        }
        if (this.D != null) {
            return z | this.D.a(menu, menuInflater);
        }
        return z;
    }

    boolean a(Menu menu) {
        boolean z = false;
        if (this.J) {
            return false;
        }
        if (this.N && this.O) {
            z = true;
            onPrepareOptionsMenu(menu);
        }
        if (this.D != null) {
            return z | this.D.a(menu);
        }
        return z;
    }

    boolean a(MenuItem menuItem) {
        if (!this.J) {
            if (this.N && this.O && onOptionsItemSelected(menuItem)) {
                return true;
            }
            if (this.D != null && this.D.a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    boolean b(MenuItem menuItem) {
        if (!this.J) {
            if (onContextItemSelected(menuItem)) {
                return true;
            }
            if (this.D != null && this.D.b(menuItem)) {
                return true;
            }
        }
        return false;
    }

    void b(Menu menu) {
        if (!this.J) {
            if (this.N && this.O) {
                onOptionsMenuClosed(menu);
            }
            if (this.D != null) {
                this.D.b(menu);
            }
        }
    }

    void e(Bundle bundle) {
        onSaveInstanceState(bundle);
        if (this.D != null) {
            Parcelable i = this.D.i();
            if (i != null) {
                bundle.putParcelable("android:support:fragments", i);
            }
        }
    }

    void k() {
        if (this.D != null) {
            this.D.n();
        }
        this.k = 4;
        this.P = false;
        onPause();
        if (!this.P) {
            throw new hp("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    void l() {
        if (this.D != null) {
            this.D.o();
        }
        this.k = 3;
        this.P = false;
        onStop();
        if (!this.P) {
            throw new hp("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    void m() {
        if (this.D != null) {
            this.D.p();
        }
        this.k = 2;
        if (this.X) {
            this.X = false;
            if (!this.Y) {
                this.Y = true;
                this.W = this.C.a(this.q, this.X, false);
            }
            if (this.W == null) {
                return;
            }
            if (this.C.m()) {
                this.W.d();
            } else {
                this.W.c();
            }
        }
    }

    void n() {
        if (this.D != null) {
            this.D.q();
        }
        this.k = 1;
        this.P = false;
        onDestroyView();
        if (!this.P) {
            throw new hp("Fragment " + this + " did not call through to super.onDestroyView()");
        } else if (this.W != null) {
            this.W.f();
        }
    }

    void o() {
        if (this.D != null) {
            this.D.r();
        }
        this.k = 0;
        this.P = false;
        onDestroy();
        if (this.P) {
            this.D = null;
            return;
        }
        throw new hp("Fragment " + this + " did not call through to super.onDestroy()");
    }

    void p() {
        this.P = false;
        onDetach();
        if (!this.P) {
            throw new hp("Fragment " + this + " did not call through to super.onDetach()");
        } else if (this.D == null) {
        } else {
            if (this.M) {
                this.D.r();
                this.D = null;
                return;
            }
            throw new IllegalStateException("Child FragmentManager of " + this + " was not  destroyed and this fragment is not retaining instance");
        }
    }
}
