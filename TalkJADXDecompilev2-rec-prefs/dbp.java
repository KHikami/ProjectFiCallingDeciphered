package p000;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TabWidget;
import android.widget.TextView;
import com.google.android.apps.hangouts.R$drawable;
import com.google.android.apps.hangouts.views.EmojiCategoryPageIndicatorView;
import java.util.Map;

public class dbp extends jzn implements pc {
    private static final mjx<Integer, Integer> f5428a = new mjz().mo3837a(Integer.valueOf(0), Integer.valueOf(R$drawable.aW)).mo3837a(Integer.valueOf(1), Integer.valueOf(R$drawable.aS)).mo3837a(Integer.valueOf(2), Integer.valueOf(R$drawable.aQ)).mo3837a(Integer.valueOf(3), Integer.valueOf(R$drawable.aO)).mo3837a(Integer.valueOf(4), Integer.valueOf(R$drawable.aU)).mo3837a(Integer.valueOf(5), Integer.valueOf(R$drawable.aY)).mo3836a();
    private TabHost aj;
    private View ak;
    private LinearLayout al;
    private TextView am;
    private TextView an;
    private View ao;
    private EmojiCategoryPageIndicatorView ap;
    private final OnGlobalLayoutListener aq = new dbr(this);
    private final OnGlobalLayoutListener ar = new dbs(this);
    final Map<String, Integer> f5429b = new ky();
    dbx f5430c;
    ViewPager f5431d;
    dca f5432e;
    int f5433f = -1;
    public final OnClickListener f5434g = new dbq(this);
    final Runnable f5435h = new dbt(this);
    final Handler f5436i = new Handler();

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (glk.m17973a("Babel", 3)) {
            glk.m17970a("Babel", "Emoji: Fragment onCreate @" + glj.m17963b(), new Object[0]);
        }
    }

    public void m7782a(dbx dbx) {
        this.f5430c = dbx;
    }

    public void onConfigurationChanged(Configuration configuration) {
        int dimensionPixelSize = getActivity().getResources().getDimensionPixelSize(gwb.eI);
        View view = getView();
        if (view != null) {
            view.setLayoutParams(new LayoutParams(-1, dimensionPixelSize));
        }
        this.f5431d.getViewTreeObserver().addOnGlobalLayoutListener(this.aq);
        if (this.al != null) {
            mo495a();
        }
    }

    public void onLowMemory() {
        super.onLowMemory();
        if (this.f5432e != null) {
            this.f5432e.m11439d();
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        gwb.m1797a(this.f5431d, this.aq);
        gwb.m1797a(this.f5431d, this.ar);
    }

    Point m7790s() {
        Point point = new Point();
        getActivity().getWindowManager().getDefaultDisplay().getSize(point);
        return point;
    }

    public ImageView mo989a(Context context, int i) {
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(getResources().getDrawable(gwb.m1507a((Integer) f5428a.get(Integer.valueOf(i)))));
        imageView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(gwb.eN);
        imageView.setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        return imageView;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        long b = glj.m17963b();
        View a = m7777a(layoutInflater, viewGroup);
        this.al = (LinearLayout) a.findViewById(ba.aU);
        mo495a();
        this.am = (TextView) a.findViewById(ba.aY);
        this.am.setOnClickListener(this.f5434g);
        this.an = (TextView) a.findViewById(ba.aZ);
        this.an.setOnClickListener(this.f5434g);
        this.ao = a.findViewById(ba.bb);
        this.ao.setOnClickListener(new dbu(this));
        if (glk.m17973a("Babel", 3)) {
            long b2 = glj.m17963b();
            glk.m17970a("Babel", "Emoji: Fragment onCreateView @" + b2 + " took: " + (b2 - b), new Object[0]);
        }
        return a;
    }

    public View m7777a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(mo992d(), viewGroup, false);
        this.aj = (TabHost) inflate.findViewById(ba.aW);
        this.aj.setup();
        m7776a(this.aj, "Recent", ba.eF, gwb.cR, 0);
        m7776a(this.aj, "People", ba.bg, gwb.cP, 1);
        m7776a(this.aj, "Objects", ba.dE, gwb.cO, 2);
        m7776a(this.aj, "Nature", ba.dz, gwb.cN, 3);
        m7776a(this.aj, "Places", ba.eb, gwb.cQ, 4);
        m7776a(this.aj, "Symbols", ba.fA, gwb.cS, 5);
        this.aj.setOnTabChangedListener(new dbv(this));
        this.aj.getTabWidget().setStripEnabled(true);
        this.f5431d = (ViewPager) inflate.findViewById(ba.bc);
        this.f5431d.getViewTreeObserver().addOnGlobalLayoutListener(this.ar);
        this.ap = (EmojiCategoryPageIndicatorView) inflate.findViewById(ba.aV);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.ap.getLayoutParams();
        layoutParams.height = (int) getResources().getDimension(gwb.eL);
        this.ap.setLayoutParams(layoutParams);
        this.ak = inflate.findViewById(ba.ba);
        this.ak.setOnTouchListener(new dbw(this));
        return inflate;
    }

    private void m7776a(TabHost tabHost, String str, int i, int i2, int i3) {
        View a = mo989a(tabHost.getContext(), i3);
        a.setContentDescription(getString(i2));
        TabSpec newTabSpec = tabHost.newTabSpec(str);
        newTabSpec.setContent(i);
        newTabSpec.setIndicator(a);
        tabHost.addTab(newTabSpec);
        this.f5429b.put(str, Integer.valueOf(i3));
    }

    private void mo495a() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.al.getLayoutParams();
        layoutParams.height = Math.round(((float) getActivity().getResources().getDimensionPixelSize(gwb.eI)) * 0.15f);
        this.al.setLayoutParams(layoutParams);
    }

    public int mo990c() {
        return this.f5431d.getHeight();
    }

    public int mo992d() {
        return gwb.gr;
    }

    public Integer mo993e() {
        return null;
    }

    void m7781a(int i, boolean z) {
        if (this.f5433f != i || z) {
            this.f5433f = i;
            int d = this.f5432e.m11438d(i);
            int a = gwb.m1507a((Integer) this.f5432e.m11437b(this.f5431d.m3192c()).first);
            if (z || a != i) {
                this.f5431d.m3178a(d, false);
            }
            View findViewWithTag = this.f5431d.findViewWithTag(Integer.valueOf(d));
            if (findViewWithTag != null) {
                findViewWithTag.sendAccessibilityEvent(2048);
            }
            if (z || this.aj.getCurrentTab() != i) {
                this.aj.setCurrentTab(i);
            }
            a = this.f5433f;
            long b = glj.m17963b();
            Editor edit = getActivity().getSharedPreferences("recentEmoji", 0).edit();
            edit.putInt("lastCategoryKey", a);
            edit.apply();
            if (glk.m17973a("Babel", 3)) {
                long b2 = glj.m17963b();
                glk.m17970a("Babel", "Emoji: Fragment write category " + a + " @" + b2 + " took: " + (b2 - b), new Object[0]);
            }
            mo991c(this.f5433f);
        }
    }

    public void mo991c(int i) {
    }

    void m7791t() {
        if (this.ap != null) {
            Pair b = this.f5432e.m11437b(this.f5431d.m3192c());
            int a = gwb.m1507a((Integer) b.second);
            this.ap.m9391a(this.f5432e.m11431a(gwb.m1507a((Integer) b.first)), a, 0.0f);
        }
    }

    public void m7780a(int i, float f, int i2) {
        Pair b = this.f5432e.m11437b(i);
        int a = gwb.m1507a((Integer) b.first);
        int a2 = gwb.m1507a(Integer.valueOf(this.f5432e.m11431a(a)));
        Pair b2 = this.f5432e.m11437b(this.f5431d.m3192c());
        int a3 = gwb.m1507a((Integer) b2.second);
        int a4 = this.f5432e.m11431a(gwb.m1507a((Integer) b2.first));
        if (a == this.f5433f) {
            this.ap.m9391a(a2, gwb.m1507a((Integer) b.second), f);
        } else if (a > this.f5433f) {
            this.ap.m9391a(a4, a3, f);
        } else if (a < this.f5433f) {
            this.ap.m9391a(a4, a3, f - 1.0f);
        }
    }

    public void m7779a(int i) {
        m7781a(gwb.m1507a((Integer) this.f5432e.m11437b(i).first), false);
        m7791t();
    }

    public void m7783b(int i) {
    }

    public int mo994q() {
        return -1;
    }

    public boolean mo995r() {
        return true;
    }

    public TabWidget m7792u() {
        return this.aj.getTabWidget();
    }
}
