package p000;

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

public class dr implements ComponentCallbacks, OnCreateContextMenuListener {
    private static final lo<String, Class<?>> f720a = new lo();
    static final Object f721j = new Object();
    int f722A;
    ee f723B;
    ec f724C;
    ee f725D;
    el f726E;
    dr f727F;
    int f728G;
    int f729H;
    String f730I;
    boolean f731J;
    boolean f732K;
    boolean f733L;
    boolean f734M;
    boolean f735N;
    boolean f736O = true;
    boolean f737P;
    int f738Q;
    ViewGroup f739R;
    View f740S;
    View f741T;
    boolean f742U;
    boolean f743V = true;
    fi f744W;
    boolean f745X;
    boolean f746Y;
    Object f747Z = null;
    Object aa = f721j;
    Object ab = null;
    Object ac = f721j;
    Object ad = null;
    Object ae = f721j;
    Boolean af;
    Boolean ag;
    ho ah = null;
    ho ai = null;
    int f748k = 0;
    View f749l;
    int f750m;
    Bundle f751n;
    SparseArray<Parcelable> f752o;
    int f753p = -1;
    String f754q;
    Bundle f755r;
    dr f756s;
    int f757t = -1;
    int f758u;
    boolean f759v;
    boolean f760w;
    boolean f761x;
    boolean f762y;
    boolean f763z;

    public static dr instantiate(Context context, String str) {
        return dr.instantiate(context, str, null);
    }

    public static dr instantiate(Context context, String str, Bundle bundle) {
        try {
            Class cls = (Class) f720a.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f720a.put(str, cls);
            }
            dr drVar = (dr) cls.newInstance();
            if (bundle != null) {
                bundle.setClassLoader(drVar.getClass().getClassLoader());
                drVar.f755r = bundle;
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

    static boolean m1225a(Context context, String str) {
        try {
            Class cls = (Class) f720a.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f720a.put(str, cls);
            }
            return dr.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    final void m1228a(int i, dr drVar) {
        this.f753p = i;
        if (drVar != null) {
            this.f754q = drVar.f754q + ":" + this.f753p;
        } else {
            this.f754q = "android:fragment:" + this.f753p;
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
        gwb.m1860a((Object) this, stringBuilder);
        if (this.f753p >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.f753p);
        }
        if (this.f728G != 0) {
            stringBuilder.append(" id=0x");
            stringBuilder.append(Integer.toHexString(this.f728G));
        }
        if (this.f730I != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.f730I);
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final int getId() {
        return this.f728G;
    }

    public final String getTag() {
        return this.f730I;
    }

    public void setArguments(Bundle bundle) {
        if (this.f753p >= 0) {
            throw new IllegalStateException("Fragment already active");
        }
        this.f755r = bundle;
    }

    public final Bundle getArguments() {
        return this.f755r;
    }

    public void setInitialSavedState(du duVar) {
        if (this.f753p >= 0) {
            throw new IllegalStateException("Fragment already active");
        }
        Bundle bundle = (duVar == null || duVar.f10522a == null) ? null : duVar.f10522a;
        this.f751n = bundle;
    }

    public void setTargetFragment(dr drVar, int i) {
        this.f756s = drVar;
        this.f758u = i;
    }

    public final dr getTargetFragment() {
        return this.f756s;
    }

    public final int getTargetRequestCode() {
        return this.f758u;
    }

    public Context getContext() {
        return this.f724C == null ? null : this.f724C.m13033i();
    }

    public final dw getActivity() {
        return this.f724C == null ? null : (dw) this.f724C.m13032h();
    }

    public final Object getHost() {
        return this.f724C == null ? null : this.f724C.mo1773g();
    }

    public final Resources getResources() {
        if (this.f724C != null) {
            return this.f724C.m13033i().getResources();
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
        return this.f723B;
    }

    public final ed getChildFragmentManager() {
        if (this.f725D == null) {
            O_();
            if (this.f748k >= 5) {
                this.f725D.m13694m();
            } else if (this.f748k >= 4) {
                this.f725D.m13693l();
            } else if (this.f748k >= 2) {
                this.f725D.m13692k();
            } else if (this.f748k > 0) {
                this.f725D.m13691j();
            }
        }
        return this.f725D;
    }

    public final dr getParentFragment() {
        return this.f727F;
    }

    public final boolean isAdded() {
        return this.f724C != null && this.f759v;
    }

    public final boolean isDetached() {
        return this.f732K;
    }

    public final boolean isRemoving() {
        return this.f760w;
    }

    public final boolean isInLayout() {
        return this.f762y;
    }

    public final boolean isResumed() {
        return this.f748k >= 5;
    }

    public final boolean isVisible() {
        return (!isAdded() || isHidden() || this.f740S == null || this.f740S.getWindowToken() == null || this.f740S.getVisibility() != 0) ? false : true;
    }

    public final boolean isHidden() {
        return this.f731J;
    }

    public final boolean hasOptionsMenu() {
        return this.f735N;
    }

    public final boolean isMenuVisible() {
        return this.f736O;
    }

    public void onHiddenChanged(boolean z) {
    }

    public void setRetainInstance(boolean z) {
        this.f733L = z;
    }

    public final boolean getRetainInstance() {
        return this.f733L;
    }

    public void setHasOptionsMenu(boolean z) {
        if (this.f735N != z) {
            this.f735N = z;
            if (isAdded() && !isHidden()) {
                this.f724C.mo1770d();
            }
        }
    }

    public void setMenuVisibility(boolean z) {
        if (this.f736O != z) {
            this.f736O = z;
            if (this.f735N && isAdded() && !isHidden()) {
                this.f724C.mo1770d();
            }
        }
    }

    public void setUserVisibleHint(boolean z) {
        if (!this.f743V && z && this.f748k < 4 && this.f723B != null && isAdded()) {
            this.f723B.m13658a(this);
        }
        this.f743V = z;
        boolean z2 = this.f748k < 4 && !z;
        this.f742U = z2;
    }

    public boolean getUserVisibleHint() {
        return this.f743V;
    }

    public fg getLoaderManager() {
        if (this.f744W != null) {
            return this.f744W;
        }
        if (this.f724C == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.f746Y = true;
        this.f744W = this.f724C.m13014a(this.f754q, this.f745X, true);
        return this.f744W;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        if (this.f724C == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.f724C.mo1763a(this, intent, -1, bundle);
    }

    public void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (this.f724C == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.f724C.mo1763a(this, intent, i, bundle);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (this.f724C == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.f724C.mo1764a(this, intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void requestPermissions(String[] strArr, int i) {
        if (this.f724C == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.f724C.mo1765a(this, strArr, i);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        if (this.f724C != null) {
            return this.f724C.mo1767a(str);
        }
        return false;
    }

    public LayoutInflater getLayoutInflater(Bundle bundle) {
        LayoutInflater c = this.f724C.mo1769c();
        getChildFragmentManager();
        mq.m32683a(c, this.f725D.m13701t());
        return c;
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f737P = true;
        Activity h = this.f724C == null ? null : this.f724C.m13032h();
        if (h != null) {
            this.f737P = false;
            onInflate(h, attributeSet, bundle);
        }
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f737P = true;
    }

    public void onAttachFragment(dr drVar) {
    }

    public void onAttach(Context context) {
        this.f737P = true;
        Activity h = this.f724C == null ? null : this.f724C.m13032h();
        if (h != null) {
            this.f737P = false;
            onAttach(h);
        }
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.f737P = true;
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public void onCreate(Bundle bundle) {
        this.f737P = true;
        m1233b(bundle);
        if (this.f725D != null && !this.f725D.m13678b(1)) {
            this.f725D.m13691j();
        }
    }

    void m1233b(Bundle bundle) {
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            if (parcelable != null) {
                if (this.f725D == null) {
                    O_();
                }
                this.f725D.m13657a(parcelable, this.f726E);
                this.f726E = null;
                this.f725D.m13691j();
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public View getView() {
        return this.f740S;
    }

    public void onActivityCreated(Bundle bundle) {
        this.f737P = true;
    }

    public void onViewStateRestored(Bundle bundle) {
        this.f737P = true;
    }

    public void onStart() {
        this.f737P = true;
        if (!this.f745X) {
            this.f745X = true;
            if (!this.f746Y) {
                this.f746Y = true;
                this.f744W = this.f724C.m13014a(this.f754q, this.f745X, false);
            }
            if (this.f744W != null) {
                this.f744W.m15332b();
            }
        }
    }

    public void onResume() {
        this.f737P = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f737P = true;
    }

    public void onPause() {
        this.f737P = true;
    }

    public void onStop() {
        this.f737P = true;
    }

    public void onLowMemory() {
        this.f737P = true;
    }

    public void onDestroyView() {
        this.f737P = true;
    }

    public void onDestroy() {
        this.f737P = true;
        if (!this.f746Y) {
            this.f746Y = true;
            this.f744W = this.f724C.m13014a(this.f754q, this.f745X, false);
        }
        if (this.f744W != null) {
            this.f744W.m15338h();
        }
    }

    void m1241f() {
        this.f753p = -1;
        this.f754q = null;
        this.f759v = false;
        this.f760w = false;
        this.f761x = false;
        this.f762y = false;
        this.f763z = false;
        this.f722A = 0;
        this.f723B = null;
        this.f725D = null;
        this.f724C = null;
        this.f728G = 0;
        this.f729H = 0;
        this.f730I = null;
        this.f731J = false;
        this.f732K = false;
        this.f734M = false;
        this.f744W = null;
        this.f745X = false;
        this.f746Y = false;
    }

    public void onDetach() {
        this.f737P = true;
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
        this.f747Z = obj;
    }

    public Object getEnterTransition() {
        return this.f747Z;
    }

    public void setReturnTransition(Object obj) {
        this.aa = obj;
    }

    public Object getReturnTransition() {
        return this.aa == f721j ? getEnterTransition() : this.aa;
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
        return this.ac == f721j ? getExitTransition() : this.ac;
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
        return this.ae == f721j ? getSharedElementEnterTransition() : this.ae;
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
        printWriter.print(Integer.toHexString(this.f728G));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f729H));
        printWriter.print(" mTag=");
        printWriter.println(this.f730I);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f748k);
        printWriter.print(" mIndex=");
        printWriter.print(this.f753p);
        printWriter.print(" mWho=");
        printWriter.print(this.f754q);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f722A);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f759v);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f760w);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f761x);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f762y);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f731J);
        printWriter.print(" mDetached=");
        printWriter.print(this.f732K);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f736O);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f735N);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f733L);
        printWriter.print(" mRetaining=");
        printWriter.print(this.f734M);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f743V);
        if (this.f723B != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f723B);
        }
        if (this.f724C != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f724C);
        }
        if (this.f727F != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f727F);
        }
        if (this.f755r != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f755r);
        }
        if (this.f751n != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f751n);
        }
        if (this.f752o != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f752o);
        }
        if (this.f756s != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.f756s);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f758u);
        }
        if (this.f738Q != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(this.f738Q);
        }
        if (this.f739R != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f739R);
        }
        if (this.f740S != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f740S);
        }
        if (this.f741T != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.f740S);
        }
        if (this.f749l != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(this.f749l);
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(this.f750m);
        }
        if (this.f744W != null) {
            printWriter.print(str);
            printWriter.println("Loader Manager:");
            this.f744W.m15328a(str + "  ", fileDescriptor, printWriter, strArr);
        }
        if (this.f725D != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.f725D + ":");
            this.f725D.mo1847a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    dr m1227a(String str) {
        if (str.equals(this.f754q)) {
            return this;
        }
        if (this.f725D != null) {
            return this.f725D.m13670b(str);
        }
        return null;
    }

    void O_() {
        this.f725D = new ee();
        this.f725D.m13662a(this.f724C, new ds(this), this);
    }

    void m1236c(Bundle bundle) {
        if (this.f725D != null) {
            this.f725D.noteStateNotSaved();
        }
        this.f748k = 1;
        this.f737P = false;
        onCreate(bundle);
        if (!this.f737P) {
            throw new hp("Fragment " + this + " did not call through to super.onCreate()");
        }
    }

    View m1226a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f725D != null) {
            this.f725D.noteStateNotSaved();
        }
        return onCreateView(layoutInflater, viewGroup, bundle);
    }

    void m1237d(Bundle bundle) {
        if (this.f725D != null) {
            this.f725D.noteStateNotSaved();
        }
        this.f748k = 2;
        this.f737P = false;
        onActivityCreated(bundle);
        if (!this.f737P) {
            throw new hp("Fragment " + this + " did not call through to super.onActivityCreated()");
        } else if (this.f725D != null) {
            this.f725D.m13692k();
        }
    }

    void m1242h() {
        if (this.f725D != null) {
            this.f725D.noteStateNotSaved();
            this.f725D.m13688g();
        }
        this.f748k = 4;
        this.f737P = false;
        onStart();
        if (this.f737P) {
            if (this.f725D != null) {
                this.f725D.m13693l();
            }
            if (this.f744W != null) {
                this.f744W.m15337g();
                return;
            }
            return;
        }
        throw new hp("Fragment " + this + " did not call through to super.onStart()");
    }

    void m1243i() {
        if (this.f725D != null) {
            this.f725D.noteStateNotSaved();
            this.f725D.m13688g();
        }
        this.f748k = 5;
        this.f737P = false;
        onResume();
        if (!this.f737P) {
            throw new hp("Fragment " + this + " did not call through to super.onResume()");
        } else if (this.f725D != null) {
            this.f725D.m13694m();
            this.f725D.m13688g();
        }
    }

    void m1238d(boolean z) {
        onMultiWindowModeChanged(z);
        if (this.f725D != null) {
            this.f725D.m13665a(z);
        }
    }

    void m1240e(boolean z) {
        onPictureInPictureModeChanged(z);
        if (this.f725D != null) {
            this.f725D.m13676b(z);
        }
    }

    void m1229a(Configuration configuration) {
        onConfigurationChanged(configuration);
        if (this.f725D != null) {
            this.f725D.m13656a(configuration);
        }
    }

    void m1244j() {
        onLowMemory();
        if (this.f725D != null) {
            this.f725D.m13700s();
        }
    }

    boolean m1231a(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.f731J) {
            return false;
        }
        if (this.f735N && this.f736O) {
            z = true;
            onCreateOptionsMenu(menu, menuInflater);
        }
        if (this.f725D != null) {
            return z | this.f725D.m13667a(menu, menuInflater);
        }
        return z;
    }

    boolean m1230a(Menu menu) {
        boolean z = false;
        if (this.f731J) {
            return false;
        }
        if (this.f735N && this.f736O) {
            z = true;
            onPrepareOptionsMenu(menu);
        }
        if (this.f725D != null) {
            return z | this.f725D.m13666a(menu);
        }
        return z;
    }

    boolean m1232a(MenuItem menuItem) {
        if (!this.f731J) {
            if (this.f735N && this.f736O && onOptionsItemSelected(menuItem)) {
                return true;
            }
            if (this.f725D != null && this.f725D.m13668a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    boolean m1235b(MenuItem menuItem) {
        if (!this.f731J) {
            if (onContextItemSelected(menuItem)) {
                return true;
            }
            if (this.f725D != null && this.f725D.m13679b(menuItem)) {
                return true;
            }
        }
        return false;
    }

    void m1234b(Menu menu) {
        if (!this.f731J) {
            if (this.f735N && this.f736O) {
                onOptionsMenuClosed(menu);
            }
            if (this.f725D != null) {
                this.f725D.m13671b(menu);
            }
        }
    }

    void m1239e(Bundle bundle) {
        onSaveInstanceState(bundle);
        if (this.f725D != null) {
            Parcelable i = this.f725D.m13690i();
            if (i != null) {
                bundle.putParcelable("android:support:fragments", i);
            }
        }
    }

    void m1245k() {
        if (this.f725D != null) {
            this.f725D.m13695n();
        }
        this.f748k = 4;
        this.f737P = false;
        onPause();
        if (!this.f737P) {
            throw new hp("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    void m1246l() {
        if (this.f725D != null) {
            this.f725D.m13696o();
        }
        this.f748k = 3;
        this.f737P = false;
        onStop();
        if (!this.f737P) {
            throw new hp("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    void m1247m() {
        if (this.f725D != null) {
            this.f725D.m13697p();
        }
        this.f748k = 2;
        if (this.f745X) {
            this.f745X = false;
            if (!this.f746Y) {
                this.f746Y = true;
                this.f744W = this.f724C.m13014a(this.f754q, this.f745X, false);
            }
            if (this.f744W == null) {
                return;
            }
            if (this.f724C.m13037m()) {
                this.f744W.m15334d();
            } else {
                this.f744W.m15333c();
            }
        }
    }

    void m1248n() {
        if (this.f725D != null) {
            this.f725D.m13698q();
        }
        this.f748k = 1;
        this.f737P = false;
        onDestroyView();
        if (!this.f737P) {
            throw new hp("Fragment " + this + " did not call through to super.onDestroyView()");
        } else if (this.f744W != null) {
            this.f744W.m15336f();
        }
    }

    void m1249o() {
        if (this.f725D != null) {
            this.f725D.m13699r();
        }
        this.f748k = 0;
        this.f737P = false;
        onDestroy();
        if (this.f737P) {
            this.f725D = null;
            return;
        }
        throw new hp("Fragment " + this + " did not call through to super.onDestroy()");
    }

    void m1250p() {
        this.f737P = false;
        onDetach();
        if (!this.f737P) {
            throw new hp("Fragment " + this + " did not call through to super.onDetach()");
        } else if (this.f725D == null) {
        } else {
            if (this.f734M) {
                this.f725D.m13699r();
                this.f725D = null;
                return;
            }
            throw new IllegalStateException("Child FragmentManager of " + this + " was not  destroyed and this fragment is not retaining instance");
        }
    }
}
