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
    private static final mjx<Integer, Integer> a;
    private TabHost aj;
    private View ak;
    private LinearLayout al;
    private TextView am;
    private TextView an;
    private View ao;
    private EmojiCategoryPageIndicatorView ap;
    private final OnGlobalLayoutListener aq;
    private final OnGlobalLayoutListener ar;
    final Map<String, Integer> b;
    dbx c;
    ViewPager d;
    dca e;
    int f;
    public final OnClickListener g;
    final Runnable h;
    final Handler i;

    public dbp() {
        this.b = new ky();
        this.f = -1;
        this.g = new dbq(this);
        this.aq = new dbr(this);
        this.ar = new dbs(this);
        this.h = new dbt(this);
        this.i = new Handler();
    }

    static {
        a = new mjz().a(Integer.valueOf(0), Integer.valueOf(R$drawable.aW)).a(Integer.valueOf(1), Integer.valueOf(R$drawable.aS)).a(Integer.valueOf(2), Integer.valueOf(R$drawable.aQ)).a(Integer.valueOf(3), Integer.valueOf(R$drawable.aO)).a(Integer.valueOf(4), Integer.valueOf(R$drawable.aU)).a(Integer.valueOf(5), Integer.valueOf(R$drawable.aY)).a();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (glk.a("Babel", 3)) {
            glk.a("Babel", "Emoji: Fragment onCreate @" + glj.b(), new Object[0]);
        }
    }

    public void a(dbx dbx) {
        this.c = dbx;
    }

    public void onConfigurationChanged(Configuration configuration) {
        int dimensionPixelSize = getActivity().getResources().getDimensionPixelSize(gwb.eI);
        View view = getView();
        if (view != null) {
            view.setLayoutParams(new LayoutParams(-1, dimensionPixelSize));
        }
        this.d.getViewTreeObserver().addOnGlobalLayoutListener(this.aq);
        if (this.al != null) {
            a();
        }
    }

    public void onLowMemory() {
        super.onLowMemory();
        if (this.e != null) {
            this.e.d();
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        gwb.a(this.d, this.aq);
        gwb.a(this.d, this.ar);
    }

    Point s() {
        Point point = new Point();
        getActivity().getWindowManager().getDefaultDisplay().getSize(point);
        return point;
    }

    public ImageView a(Context context, int i) {
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(getResources().getDrawable(gwb.a((Integer) a.get(Integer.valueOf(i)))));
        imageView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(gwb.eN);
        imageView.setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        return imageView;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        long b = glj.b();
        View a = a(layoutInflater, viewGroup);
        this.al = (LinearLayout) a.findViewById(ba.aU);
        a();
        this.am = (TextView) a.findViewById(ba.aY);
        this.am.setOnClickListener(this.g);
        this.an = (TextView) a.findViewById(ba.aZ);
        this.an.setOnClickListener(this.g);
        this.ao = a.findViewById(ba.bb);
        this.ao.setOnClickListener(new dbu(this));
        if (glk.a("Babel", 3)) {
            long b2 = glj.b();
            glk.a("Babel", "Emoji: Fragment onCreateView @" + b2 + " took: " + (b2 - b), new Object[0]);
        }
        return a;
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(d(), viewGroup, false);
        this.aj = (TabHost) inflate.findViewById(ba.aW);
        this.aj.setup();
        a(this.aj, "Recent", ba.eF, gwb.cR, 0);
        a(this.aj, "People", ba.bg, gwb.cP, 1);
        a(this.aj, "Objects", ba.dE, gwb.cO, 2);
        a(this.aj, "Nature", ba.dz, gwb.cN, 3);
        a(this.aj, "Places", ba.eb, gwb.cQ, 4);
        a(this.aj, "Symbols", ba.fA, gwb.cS, 5);
        this.aj.setOnTabChangedListener(new dbv(this));
        this.aj.getTabWidget().setStripEnabled(true);
        this.d = (ViewPager) inflate.findViewById(ba.bc);
        this.d.getViewTreeObserver().addOnGlobalLayoutListener(this.ar);
        this.ap = (EmojiCategoryPageIndicatorView) inflate.findViewById(ba.aV);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.ap.getLayoutParams();
        layoutParams.height = (int) getResources().getDimension(gwb.eL);
        this.ap.setLayoutParams(layoutParams);
        this.ak = inflate.findViewById(ba.ba);
        this.ak.setOnTouchListener(new dbw(this));
        return inflate;
    }

    private void a(TabHost tabHost, String str, int i, int i2, int i3) {
        View a = a(tabHost.getContext(), i3);
        a.setContentDescription(getString(i2));
        TabSpec newTabSpec = tabHost.newTabSpec(str);
        newTabSpec.setContent(i);
        newTabSpec.setIndicator(a);
        tabHost.addTab(newTabSpec);
        this.b.put(str, Integer.valueOf(i3));
    }

    private void a() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.al.getLayoutParams();
        layoutParams.height = Math.round(((float) getActivity().getResources().getDimensionPixelSize(gwb.eI)) * 0.15f);
        this.al.setLayoutParams(layoutParams);
    }

    public int c() {
        return this.d.getHeight();
    }

    public int d() {
        return gwb.gr;
    }

    public Integer e() {
        return null;
    }

    void a(int i, boolean z) {
        if (this.f != i || z) {
            this.f = i;
            int d = this.e.d(i);
            int a = gwb.a((Integer) this.e.b(this.d.c()).first);
            if (z || a != i) {
                this.d.a(d, false);
            }
            View findViewWithTag = this.d.findViewWithTag(Integer.valueOf(d));
            if (findViewWithTag != null) {
                findViewWithTag.sendAccessibilityEvent(2048);
            }
            if (z || this.aj.getCurrentTab() != i) {
                this.aj.setCurrentTab(i);
            }
            a = this.f;
            long b = glj.b();
            Editor edit = getActivity().getSharedPreferences("recentEmoji", 0).edit();
            edit.putInt("lastCategoryKey", a);
            edit.apply();
            if (glk.a("Babel", 3)) {
                long b2 = glj.b();
                glk.a("Babel", "Emoji: Fragment write category " + a + " @" + b2 + " took: " + (b2 - b), new Object[0]);
            }
            c(this.f);
        }
    }

    public void c(int i) {
    }

    void t() {
        if (this.ap != null) {
            Pair b = this.e.b(this.d.c());
            int a = gwb.a((Integer) b.second);
            this.ap.a(this.e.a(gwb.a((Integer) b.first)), a, 0.0f);
        }
    }

    public void a(int i, float f, int i2) {
        Pair b = this.e.b(i);
        int a = gwb.a((Integer) b.first);
        int a2 = gwb.a(Integer.valueOf(this.e.a(a)));
        Pair b2 = this.e.b(this.d.c());
        int a3 = gwb.a((Integer) b2.second);
        int a4 = this.e.a(gwb.a((Integer) b2.first));
        if (a == this.f) {
            this.ap.a(a2, gwb.a((Integer) b.second), f);
        } else if (a > this.f) {
            this.ap.a(a4, a3, f);
        } else if (a < this.f) {
            this.ap.a(a4, a3, f - 1.0f);
        }
    }

    public void a(int i) {
        a(gwb.a((Integer) this.e.b(i).first), false);
        t();
    }

    public void b(int i) {
    }

    public int q() {
        return -1;
    }

    public boolean r() {
        return true;
    }

    public TabWidget u() {
        return this.aj.getTabWidget();
    }
}
