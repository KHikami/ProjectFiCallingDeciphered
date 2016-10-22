package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.Space;
import com.android.dialer.app.widget.EmptyContentView;

/* compiled from: PG */
/* renamed from: aqv */
public class aqv extends aem {
    private static final String n;
    public EmptyContentView o;
    aqj p;
    public OnTouchListener q;
    public String r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private Space x;
    private aqz y;

    static {
        n = aqv.class.getSimpleName();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.b = true;
        this.c = false;
        e(false);
        int a = adr.a(false);
        this.m = a;
        aej aej = (aej) this.h;
        if (aej != null) {
            aej.y = a;
        }
        this.l = true;
        try {
            this.p = (aqj) activity;
        } catch (ClassCastException e) {
            String.valueOf(activity.toString()).concat(" doesn't implement OnListFragmentScrolledListener. Ignoring.");
        }
    }

    public void onStart() {
        super.onStart();
        if (this.d) {
            this.h.a(0, false);
        }
        this.y = (aqz) getActivity();
        Resources resources = getResources();
        this.s = this.y.x();
        this.t = resources.getDrawable(cob.aS).getIntrinsicHeight();
        this.u = resources.getDimensionPixelSize(buf.hn);
        this.v = resources.getInteger(buf.ho);
        this.w = resources.getInteger(buf.hp);
        getView();
        View view = this.i;
        if (this.o == null) {
            this.o = new EmptyContentView(getActivity());
            ((ViewGroup) this.i.getParent()).addView(this.o);
            this.i.setEmptyView(this.o);
            f();
        }
        view.setBackgroundColor(resources.getColor(cob.V));
        view.setClipToPadding(false);
        b(false);
        view.setAccessibilityLiveRegion(0);
        aqc.a(view);
        view.setOnScrollListener(new aqw(this));
        if (this.q != null) {
            view.setOnTouchListener(this.q);
        }
        h(false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        aix.a(this.i, getResources());
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        Animator animator = null;
        if (i2 != 0) {
            animator = AnimatorInflater.loadAnimator(getActivity(), i2);
        }
        if (animator != null) {
            View view = getView();
            animator.addListener(new aqx(this, view, view.getLayerType()));
        }
        return animator;
    }

    protected final void d(boolean z) {
        super.d(z);
        adh adh = this.h;
        if (adh != null) {
            adh.a(0, false);
        }
    }

    private boolean b(String str) {
        Object string = getResources().getString(cob.bC);
        if (str == null || TextUtils.isEmpty(string) || !str.matches(string)) {
            return false;
        }
        if (getActivity() != null) {
            aoq.a(cob.ca).show(getFragmentManager(), "phone_prohibited_dialog");
        }
        return true;
    }

    protected adh a() {
        adh aqd = new aqd(getActivity());
        aqd.f = true;
        aqd.z = this.l;
        aqd.A = this;
        return aqd;
    }

    protected void a(int i, long j) {
        aqd aqd = (aqd) this.h;
        int n = aqd.n(i);
        new StringBuilder(37).append("onItemClick: shortcutType=").append(n);
        String str;
        aei aei;
        switch (n) {
            case oe.HOST_ID /*-1*/:
                super.a(i, j);
            case rl.c /*0*/:
                str = aqd.n;
                aei = this.k;
                if (aei != null && !b(str)) {
                    aei.a(str, false, g(false));
                }
            case rq.b /*1*/:
                buf.d(getActivity(), buf.e(TextUtils.isEmpty(this.r) ? aqd.e() : this.r));
            case rq.c /*2*/:
                buf.a(getActivity(), buf.f(TextUtils.isEmpty(this.r) ? aqd.e() : this.r), cob.aY);
            case rl.e /*3*/:
                buf.d(getActivity(), buf.d(aqd.e()));
            case rl.f /*4*/:
                if (TextUtils.isEmpty(this.r)) {
                    str = aqd.n;
                } else {
                    str = this.r;
                }
                aei = this.k;
                if (aei != null && !b(str)) {
                    aei.a(str, true, g(false));
                }
            default:
        }
    }

    public final void h(boolean z) {
        int i;
        int i2 = 0;
        int i3 = this.y.v() ? this.s - this.t : -this.t;
        if (z || this.y.u()) {
            i = this.y.v() ? 0 : this.s - this.t;
        } else {
            i = 0;
        }
        if (z) {
            TimeInterpolator timeInterpolator;
            boolean v = this.y.v();
            if (v) {
                timeInterpolator = ake.a;
            } else {
                Object obj = ake.b;
            }
            int i4 = v ? this.v : this.w;
            getView().setTranslationY((float) i3);
            getView().animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration((long) i4).setListener(new aqy(this, v));
        } else {
            getView().setTranslationY((float) i);
            g();
        }
        if (!this.y.v()) {
            i2 = this.u;
        }
        ListView listView = this.i;
        listView.setPaddingRelative(listView.getPaddingStart(), i2, listView.getPaddingEnd(), listView.getPaddingBottom());
    }

    public final void g() {
        if (this.x != null) {
            int w = this.y.v() ? this.y.w() : 0;
            if (w != this.x.getHeight()) {
                LayoutParams layoutParams = (LayoutParams) this.x.getLayoutParams();
                layoutParams.height = w;
                this.x.setLayoutParams(layoutParams);
            }
        }
    }

    protected final void f_() {
        if (getActivity() != null) {
            if (buf.i(getActivity())) {
                super.f_();
            } else if (TextUtils.isEmpty(this.f)) {
                ((aqd) this.h).d();
            } else {
                this.h.notifyDataSetChanged();
            }
            f();
        }
    }

    protected final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) super.a(layoutInflater, viewGroup);
        if (getResources().getConfiguration().orientation == 1) {
            this.x = new Space(getActivity());
            linearLayout.addView(this.x, new LayoutParams(-1, 0));
        }
        return linearLayout;
    }

    public void f() {
    }
}
