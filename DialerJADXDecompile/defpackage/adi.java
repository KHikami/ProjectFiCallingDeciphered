package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.app.LoaderManager;
import android.app.LoaderManager.LoaderCallbacks;
import android.content.Context;
import android.content.CursorLoader;
import android.content.Loader;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: adi */
public abstract class adi extends Fragment implements LoaderCallbacks, OnFocusChangeListener, OnTouchListener, OnScrollListener, OnItemClickListener, OnItemLongClickListener {
    private boolean A;
    private int B;
    private boolean C;
    private Context D;
    private LoaderManager E;
    private Handler F;
    private aie G;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public String f;
    int g;
    public adh h;
    public ListView i;
    public int j;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;
    private boolean o;
    private boolean p;
    private boolean q;
    private View r;
    private int s;
    private int t;
    private Parcelable u;
    private int v;
    private int w;
    private aaz x;
    private aic y;
    private boolean z;

    public abstract adh a();

    public abstract View a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public abstract void a(int i, long j);

    public adi() {
        int i;
        this.b = true;
        this.c = true;
        switch (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault())) {
            case rq.b /*1*/:
                i = 1;
                break;
            default:
                i = 2;
                break;
        }
        this.n = i;
        this.g = 0;
        this.q = true;
        this.j = 20;
        this.B = 0;
        this.F = new adj(this);
        this.G = new aie(this);
    }

    public /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        a(loader, (Cursor) obj);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.D = activity;
        h();
        this.E = super.getLoaderManager();
    }

    public Context getContext() {
        return this.D;
    }

    public LoaderManager getLoaderManager() {
        return this.E;
    }

    public View getView() {
        return this.r;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("sectionHeaderDisplayEnabled", this.a);
        bundle.putBoolean("photoLoaderEnabled", this.k);
        bundle.putBoolean("quickContactEnabled", this.b);
        bundle.putBoolean("adjustSelectionBoundsEnabled", this.c);
        bundle.putBoolean("includeProfile", this.l);
        bundle.putBoolean("searchMode", this.d);
        bundle.putBoolean("visibleScrollbarEnabled", this.m);
        bundle.putInt("scrollbarPosition", this.n);
        bundle.putInt("directorySearchMode", this.g);
        bundle.putBoolean("selectionVisible", this.o);
        bundle.putBoolean("legacyCompatibility", this.p);
        bundle.putString("queryString", this.f);
        bundle.putInt("directoryResultLimit", this.j);
        bundle.putBoolean("darkTheme", this.A);
        if (this.i != null) {
            bundle.putParcelable("liststate", this.i.onSaveInstanceState());
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(bundle);
        this.h = a();
        this.y = new aic(this.D);
    }

    public void a(Bundle bundle) {
        if (bundle != null) {
            this.a = bundle.getBoolean("sectionHeaderDisplayEnabled");
            this.k = bundle.getBoolean("photoLoaderEnabled");
            this.b = bundle.getBoolean("quickContactEnabled");
            this.c = bundle.getBoolean("adjustSelectionBoundsEnabled");
            this.l = bundle.getBoolean("includeProfile");
            this.d = bundle.getBoolean("searchMode");
            this.m = bundle.getBoolean("visibleScrollbarEnabled");
            this.n = bundle.getInt("scrollbarPosition");
            this.g = bundle.getInt("directorySearchMode");
            this.o = bundle.getBoolean("selectionVisible");
            this.p = bundle.getBoolean("legacyCompatibility");
            this.f = bundle.getString("queryString");
            this.j = bundle.getInt("directoryResultLimit");
            this.A = bundle.getBoolean("darkTheme");
            this.u = bundle.getParcelable("liststate");
        }
    }

    public void onStart() {
        super.onStart();
        OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = this.y;
        aie aie = this.G;
        if (onSharedPreferenceChangeListener.e != null) {
            onSharedPreferenceChangeListener.d();
        }
        onSharedPreferenceChangeListener.e = aie;
        onSharedPreferenceChangeListener.c = -1;
        onSharedPreferenceChangeListener.b = -1;
        onSharedPreferenceChangeListener.d = null;
        onSharedPreferenceChangeListener.a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        this.z = d();
        this.B = 0;
        this.C = true;
        f_();
    }

    public void f_() {
        if (this.h != null) {
            e();
            int size = this.h.b.size();
            for (int i = 0; i < size; i++) {
                aax b = this.h.b(i);
                if (b instanceof aef) {
                    aef aef = (aef) b;
                    if (aef.j == 0 && (aef.k || !this.C)) {
                        aef = (aef) this.h.b(i);
                        aef.j = 1;
                        long j = aef.f;
                        if (!this.z) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("directoryId", j);
                            getLoaderManager().initLoader(i, bundle, this);
                        } else if (j == 0) {
                            a(i, aef);
                        } else {
                            this.F.removeMessages(1, aef);
                            this.F.sendMessageDelayed(this.F.obtainMessage(1, i, 0, aef), 300);
                        }
                    }
                } else {
                    getLoaderManager().initLoader(i, null, this);
                }
            }
            this.C = false;
        }
    }

    public Loader onCreateLoader(int i, Bundle bundle) {
        if (i == -1) {
            Loader aec = new aec(this.D);
            aec.a = this.h.q;
            aec.b = false;
            return aec;
        }
        long j;
        CursorLoader adk = new adk(this, this.D, null, null, null, null, null);
        if (bundle == null || !bundle.containsKey("directoryId")) {
            j = 0;
        } else {
            j = bundle.getLong("directoryId");
        }
        this.h.a(adk, j);
        return adk;
    }

    protected final void a(int i, aef aef) {
        Bundle bundle = new Bundle();
        bundle.putLong("directoryId", aef.f);
        getLoaderManager().restartLoader(i, bundle, this);
    }

    private final void f() {
        this.F.removeMessages(1);
    }

    public void a(Loader loader, Cursor cursor) {
        if (this.q) {
            int id = loader.getId();
            if (id == -1) {
                this.B = 2;
                this.h.a(cursor);
                f_();
                return;
            }
            if (id < this.h.b.size()) {
                this.h.a(id, cursor);
                if (this.h != null) {
                    aaw aaw = this.h;
                    int size = aaw.b.size();
                    for (int i = 0; i < size; i++) {
                        aax b = aaw.b(i);
                        if ((b instanceof aef) && ((aef) b).a()) {
                            id = 1;
                            break;
                        }
                    }
                    id = 0;
                    if (id != 0) {
                        id = 1;
                        if (id == 0 && this.u != null) {
                            this.i.onRestoreInstanceState(this.u);
                            this.u = null;
                        }
                    }
                }
                if (this.d && this.g != 0 && (this.B == 0 || this.B == 1)) {
                    id = 1;
                } else {
                    id = 0;
                }
                if (id != 0) {
                    id = 1;
                } else {
                    id = 0;
                }
                this.i.onRestoreInstanceState(this.u);
                this.u = null;
            }
            if (!this.d) {
                this.B = 0;
                getLoaderManager().destroyLoader(-1);
            } else if (this.g == 0) {
            } else {
                if (this.B == 0) {
                    this.B = 1;
                    getLoaderManager().initLoader(-1, null, this);
                    return;
                }
                f_();
            }
        }
    }

    public void onLoaderReset(Loader loader) {
    }

    public void onStop() {
        super.onStop();
        this.y.d();
        this.h.a();
    }

    public final void c_() {
        f();
        aaw aaw = this.h;
        int size = aaw.b.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            aax b = aaw.b(i);
            if (b instanceof aef) {
                aef aef = (aef) b;
                if (!aef.a()) {
                    i2 = true;
                }
                aef.j = 0;
            }
            i++;
            i2 = i2;
        }
        if (i2 != 0) {
            aaw.notifyDataSetChanged();
        }
        this.C = true;
        this.z = true;
        f_();
    }

    public final void a(boolean z) {
        if (this.a != z) {
            this.a = z;
            if (this.h != null) {
                this.h.x = z;
            }
            g();
        }
    }

    public final void b(boolean z) {
        if (this.m != z) {
            this.m = z;
            g();
        }
    }

    public final void c(boolean z) {
        this.k = true;
        h();
    }

    public void d(boolean z) {
        boolean z2 = true;
        if (this.d != z) {
            this.d = z;
            a(!this.d);
            if (!z) {
                this.B = 0;
                getLoaderManager().destroyLoader(-1);
            }
            if (this.h != null) {
                this.h.p = z;
                this.h.a();
                if (!z) {
                    aaw aaw = this.h;
                    for (int size = aaw.b.size() - 1; size >= 0; size--) {
                        aax b = aaw.b(size);
                        if ((b instanceof aef) && ((aef) b).f == 0) {
                            break;
                        }
                        aaw.a(size);
                    }
                }
                this.h.a(false, z);
            }
            if (this.i != null) {
                ListView listView = this.i;
                if (z) {
                    z2 = false;
                }
                listView.setFastScrollEnabled(z2);
            }
        }
    }

    public final void a(String str) {
        if (!TextUtils.equals(this.f, str)) {
            if (!(!this.e || this.h == null || this.i == null)) {
                if (TextUtils.isEmpty(this.f)) {
                    this.i.setAdapter(this.h);
                } else if (TextUtils.isEmpty(str)) {
                    this.i.setAdapter(null);
                }
            }
            this.f = str;
            boolean z = !TextUtils.isEmpty(this.f) || this.e;
            d(z);
            if (this.h != null) {
                this.h.a(str);
                c_();
            }
        }
    }

    public final boolean d() {
        int b;
        boolean z = false;
        if (this.v != this.y.b()) {
            b = this.y.b();
            this.v = b;
            if (this.h != null) {
                this.h.d = b;
            }
            z = true;
        }
        if (this.w == this.y.a()) {
            return z;
        }
        b = this.y.a();
        this.w = b;
        if (this.h == null) {
            return true;
        }
        this.h.e = b;
        return true;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        b(layoutInflater, viewGroup);
        boolean z = this.d;
        this.h.p = z;
        this.h.a(false, z);
        this.h.m = this.x;
        this.i.setAdapter(this.h);
        if (!this.d) {
            this.i.setFocusableInTouchMode(true);
            this.i.requestFocus();
        }
        return this.r;
    }

    public void b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.r = a(layoutInflater, viewGroup);
        this.i = (ListView) this.r.findViewById(16908298);
        if (this.i == null) {
            throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
        }
        View findViewById = this.r.findViewById(16908292);
        if (findViewById != null) {
            this.i.setEmptyView(findViewById);
        }
        this.i.setOnItemClickListener(this);
        this.i.setOnItemLongClickListener(this);
        this.i.setOnFocusChangeListener(this);
        this.i.setOnTouchListener(this);
        this.i.setFastScrollEnabled(!this.d);
        this.i.setDividerHeight(0);
        this.i.setSaveEnabled(false);
        g();
        h();
        this.h.l = getView();
        buf.a(getResources(), this.i, this.r);
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (getActivity() != null && getView() != null && !z) {
            buf.a(getResources(), this.i, getView());
        }
    }

    protected void e() {
        if (this.h != null) {
            this.h.h = this.b;
            this.h.i = this.c;
            this.h.j = this.l;
            this.h.k = false;
            this.h.a(this.f);
            this.h.q = this.g;
            this.h.B = false;
            this.h.d = this.v;
            this.h.e = this.w;
            this.h.x = this.a;
            this.h.s = this.o;
            this.h.r = this.j;
            this.h.u = this.A;
        }
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 2) {
            this.x.a();
        } else if (this.k) {
            this.x.b();
        }
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        i();
        int headerViewsCount = i - this.i.getHeaderViewsCount();
        if (headerViewsCount >= 0) {
            a(headerViewsCount, j);
        }
    }

    public boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        return i - this.i.getHeaderViewsCount() >= 0 ? false : false;
    }

    private final void i() {
        ((InputMethodManager) this.D.getSystemService("input_method")).hideSoftInputFromWindow(this.i.getWindowToken(), 0);
    }

    public void onFocusChange(View view, boolean z) {
        if (view == this.i && z) {
            i();
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (view == this.i) {
            i();
        }
        return false;
    }

    public void onPause() {
        int i = 0;
        this.s = this.i.getFirstVisiblePosition();
        View childAt = this.i.getChildAt(0);
        if (childAt != null) {
            i = childAt.getTop() - this.i.getPaddingTop();
        }
        this.t = i;
        super.onPause();
        f();
    }

    public void onResume() {
        super.onResume();
        this.i.setSelectionFromTop(this.s, this.t);
    }

    public final void e(boolean z) {
        this.A = false;
        if (this.h != null) {
            this.h.u = false;
        }
    }

    private final void g() {
        boolean z = this.m && this.a;
        if (this.i != null) {
            this.i.setFastScrollEnabled(z);
            this.i.setFastScrollAlwaysVisible(z);
            this.i.setVerticalScrollbarPosition(this.n);
            this.i.setScrollBarStyle(33554432);
        }
    }

    private void h() {
        if (this.k && this.D != null) {
            if (this.x == null) {
                this.x = aaz.a(this.D);
            }
            if (this.i != null) {
                this.i.setOnScrollListener(this);
            }
            if (this.h != null) {
                this.h.m = this.x;
            }
        }
    }
}
