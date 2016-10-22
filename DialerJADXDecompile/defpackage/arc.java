package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.app.LoaderManager.LoaderCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.android.dialer.app.list.PhoneFavoriteListView;
import com.android.dialer.app.widget.EmptyContentView;
import java.util.HashMap;

/* compiled from: PG */
/* renamed from: arc */
public final class arc extends Fragment implements OnItemClickListener, aqs, ath, cc {
    private static int h;
    final HashMap a;
    final HashMap b;
    int c;
    public aei d;
    aqj e;
    public aqq f;
    PhoneFavoriteListView g;
    private final adz i;
    private final LoaderCallbacks j;
    private final arg k;
    private View l;
    private View m;
    private EmptyContentView n;

    public arc() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.i = new adz();
        this.j = new are(this);
        this.k = new arg(this);
    }

    static {
        h = 1;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f = new aqq(activity, this.i, this);
        this.f.o = aaz.a((Context) activity);
    }

    public final void onCreate(Bundle bundle) {
        Trace.beginSection("SpeedDialFragment onCreate");
        super.onCreate(bundle);
        this.c = getResources().getInteger(buf.hq);
        Trace.endSection();
    }

    public final void onResume() {
        Trace.beginSection("SpeedDialFragment onResume");
        super.onResume();
        if (this.f != null) {
            aqq aqq = this.f;
            aqq.l.a("android.contacts.DISPLAY_ORDER");
            aqq.l.a("android.contacts.SORT_ORDER");
        }
        if (buf.i(getActivity())) {
            if (getLoaderManager().getLoader(h) == null) {
                getLoaderManager().initLoader(h, null, this.j);
            } else {
                getLoaderManager().getLoader(h).forceLoad();
            }
            this.n.a(cob.cZ);
            this.n.c(cob.da);
        } else {
            this.n.a(cob.cC);
            this.n.c(cob.cE);
        }
        Trace.endSection();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Trace.beginSection("SpeedDialFragment onCreateView");
        this.l = layoutInflater.inflate(buf.hN, viewGroup, false);
        this.g = (PhoneFavoriteListView) this.l.findViewById(aq.N);
        this.g.setOnItemClickListener(this);
        this.g.setVerticalScrollBarEnabled(false);
        this.g.setVerticalScrollbarPosition(2);
        this.g.setScrollBarStyle(33554432);
        this.g.h.a(this.f);
        ImageView imageView = (ImageView) getActivity().findViewById(aq.L);
        PhoneFavoriteListView phoneFavoriteListView = this.g;
        phoneFavoriteListView.f = imageView;
        phoneFavoriteListView.g = (View) phoneFavoriteListView.f.getParent();
        this.n = (EmptyContentView) this.l.findViewById(aq.aq);
        this.n.b(cob.am);
        this.n.d = this;
        this.m = this.l.findViewById(aq.M);
        LayoutAnimationController layoutAnimationController = new LayoutAnimationController(AnimationUtils.loadAnimation(getActivity(), 17432576));
        layoutAnimationController.setDelay(0.0f);
        this.g.setLayoutAnimation(layoutAnimationController);
        this.g.setAdapter(this.f);
        this.g.setOnScrollListener(this.k);
        this.g.setFastScrollEnabled(false);
        this.g.setFastScrollAlwaysVisible(false);
        this.g.setAccessibilityLiveRegion(0);
        aqc.a(this.g);
        Trace.endSection();
        return this.l;
    }

    final void a(boolean z) {
        int i;
        int visibility = this.n.getVisibility();
        int i2 = z ? 0 : 8;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        if (visibility != i2) {
            LayoutParams layoutParams = (LayoutParams) this.m.getLayoutParams();
            layoutParams.height = z ? -2 : -1;
            this.m.setLayoutParams(layoutParams);
            this.n.setVisibility(i2);
            this.g.setVisibility(i);
        }
    }

    public final void onStart() {
        super.onStart();
        Context activity = getActivity();
        try {
            this.e = (aqj) activity;
            try {
                this.g.h.a((aqi) activity);
                ((arf) activity).a(this.g.h);
                try {
                    this.d = (aei) activity;
                    if (buf.i(activity)) {
                        getLoaderManager().initLoader(h, null, this.j);
                    } else {
                        a(true);
                    }
                } catch (ClassCastException e) {
                    throw new ClassCastException(String.valueOf(activity.toString()).concat(" must implement PhoneFavoritesFragment.listener"));
                }
            } catch (ClassCastException e2) {
                throw new ClassCastException(String.valueOf(activity.toString()).concat(" must implement OnDragDropListener and HostInterface"));
            }
        } catch (ClassCastException e3) {
            throw new ClassCastException(String.valueOf(activity.toString()).concat(" must implement OnListFragmentScrolledListener"));
        }
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (i <= this.f.getCount()) {
            Log.e("SpeedDialFragment", "onItemClick() event for unexpected position. The position " + i + " is before \"all\" section. Ignored.");
        }
    }

    static boolean a(long[] jArr, long j) {
        for (long j2 : jArr) {
            if (j2 == j) {
                return true;
            }
        }
        return false;
    }

    public final void a() {
        int firstVisiblePosition = this.g.getFirstVisiblePosition();
        for (int i = 0; i < this.g.getChildCount(); i++) {
            View childAt = this.g.getChildAt(i);
            int i2 = firstVisiblePosition + i;
            if (this.f.a(i2)) {
                long itemId = this.f.getItemId(i2);
                this.a.put(Long.valueOf(itemId), Integer.valueOf(childAt.getTop()));
                this.b.put(Long.valueOf(itemId), Integer.valueOf(childAt.getLeft()));
            }
        }
        this.a.put(Long.valueOf(Long.MAX_VALUE), Integer.valueOf(0));
    }

    public final void e_() {
        Context activity = getActivity();
        if (activity != null) {
            if (buf.c(activity, "android.permission.READ_CONTACTS")) {
                ((arf) activity).s();
                return;
            }
            bv.a(this, new String[]{"android.permission.READ_CONTACTS"}, 1);
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 1 && iArr.length == 1 && iArr[0] == 0) {
            buf.d(getActivity(), "android.permission.READ_CONTACTS");
        }
    }

    public final void a(long... jArr) {
        if (!this.a.isEmpty()) {
            ViewTreeObserver viewTreeObserver = this.g.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new ard(this, viewTreeObserver, jArr));
        }
    }
}
