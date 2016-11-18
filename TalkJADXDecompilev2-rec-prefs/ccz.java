package p000;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.ContentObserver;
import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings.Secure;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabSpec;
import android.widget.TabWidget;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class ccz extends jzn implements OnClickListener, OnTabChangeListener, bxp {
    ArrayList<cdd> f5029a = new ArrayList();
    private final jhq aj = new jhq(this);
    private ContentObserver ak;
    public int f5030b = -1;
    bxq f5031c;
    int f5032d = -1;
    private cdf f5033e;
    private TabWidget f5034f;
    private String f5035g = "";
    private cgr f5036h;
    private SharedPreferences f5037i;

    private List<cdd> m7236e() {
        ArrayList arrayList = new ArrayList();
        m7234a(arrayList, cjj.class, 2294);
        m7234a(arrayList, cjq.class, 2159);
        if (getResources().getConfiguration().smallestScreenWidthDp < 360 && m7233a(cnk.class) && (m7233a(ckq.class) || m7233a(cja.class))) {
            m7234a(arrayList, clp.class, 3197);
        } else {
            if (!m7234a(arrayList, ckq.class, 2160)) {
                m7234a(arrayList, cja.class, 2160);
            }
            m7234a(arrayList, cnk.class, 3023);
        }
        m7234a(arrayList, clx.class, 1922);
        m7234a(arrayList, cli.class, 2265);
        return arrayList;
    }

    private <T extends cia> boolean m7234a(ArrayList<cdd> arrayList, Class<T> cls, int i) {
        cia cia = (cia) this.binder.m25454b((Class) cls);
        if (cia == null || !cia.mo985a(m7240t(), this.f5036h)) {
            return false;
        }
        arrayList.add(new cdd(cia, i));
        return true;
    }

    private <T extends cia> boolean m7233a(Class<T> cls) {
        cia cia = (cia) this.binder.m25454b((Class) cls);
        return cia != null && cia.mo985a(m7240t(), this.f5036h);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.ak = new cda(this, new Handler());
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.f5031c = (bxq) this.binder.m25443a(bxq.class);
        this.f5036h = (cgr) this.binder.m25454b(cgr.class);
        ((jho) this.binder.m25443a(jho.class)).m24282a(this.aj);
        ((eia) this.binder.m25443a(eia.class)).mo1884a(gwb.lv, new cdb(this));
        this.f5029a.addAll(m7236e());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f5037i = this.context.getSharedPreferences("attachment_prefs", 0);
        if (getActivity().getResources().getConfiguration().orientation == 2) {
            str = "attachment_area_height_landscape";
        } else {
            str = "attachment_area_height_portrait";
        }
        this.f5035g = str;
        this.f5032d = this.f5037i.getInt(this.f5035g, getResources().getDimensionPixelSize(gwb.lg));
        View inflate = layoutInflater.inflate(gwb.lO, viewGroup, false);
        er erVar = (er) inflate.findViewById(gwb.lo);
        erVar.m9212a(getActivity(), getChildFragmentManager(), gwb.lt);
        this.f5034f = erVar.getTabWidget();
        m7247d().setStripEnabled(false);
        m7247d().setDividerDrawable(gwb.li);
        m7247d().setLeftStripDrawable(gwb.li);
        m7247d().setRightStripDrawable(gwb.li);
        m7232a(erVar);
        return inflate;
    }

    public void onPause() {
        this.context.getContentResolver().unregisterContentObserver(this.ak);
        this.f5031c.mo894a();
        m7244b(-1);
        super.onPause();
    }

    public void onResume() {
        m7244b(-1);
        super.onResume();
        this.context.getContentResolver().registerContentObserver(Secure.getUriFor("default_input_method"), false, this.ak);
    }

    private void m7232a(er erVar) {
        erVar.setOnTabChangedListener(null);
        erVar.clearAllTabs();
        for (int i = 0; i < this.f5029a.size(); i++) {
            cia cia = ((cdd) this.f5029a.get(i)).f5054a;
            TabSpec newTabSpec = erVar.newTabSpec(cia.mo987c().getName());
            View inflate = View.inflate(getActivity(), cia.mo984a(), null);
            gld.m17934a(inflate, true);
            newTabSpec.setIndicator(inflate);
            erVar.m9213a(newTabSpec, chk.class, null);
            inflate.setOnClickListener(new cde(this, i));
        }
        erVar.setOnTabChangedListener(this);
    }

    public void m7244b(int i) {
        if (i == -1) {
            m7238r();
            m7239s();
            this.f5030b = -1;
        } else if (isResumed()) {
            if (this.f5030b != i) {
                m7239s();
                cdd cdd = (cdd) this.f5029a.get(i);
                chz b = cdd.f5054a.mo986b();
                if (b != null) {
                    boolean z;
                    if (b.f5354a.isEmpty()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    iil.m21874a("Expected condition to be true", z);
                    if (!((ehz) this.binder.m25443a(ehz.class)).mo1883a(b.f5354a)) {
                        eia eia = (eia) this.binder.m25443a(eia.class);
                        Bundle bundle = new Bundle();
                        bundle.putString("permission_picker_name", cdd.m7251a());
                        eia.mo1886a(new eie(gwb.lv, b.f5355b, bundle), b.f5354a);
                        return;
                    }
                }
                this.f5033e = m7235d(i);
                ((iih) this.binder.m25443a(iih.class)).mo1979a(((jca) this.binder.m25443a(jca.class)).mo2317a()).mo1693b().mo1714c(cdd.f5055b);
            }
            if (this.f5033e == null) {
                this.f5033e = m7235d(i);
            }
            if (this.f5030b == i && !(((cdd) this.f5029a.get(i)).f5054a instanceof clp)) {
                return;
            }
            if (this.f5033e.mo495a()) {
                m7237q();
                this.f5030b = i;
                return;
            }
            this.f5031c.mo894a();
            m7238r();
            this.f5030b = -1;
        }
    }

    private cdf m7235d(int i) {
        dr instantiate = dr.instantiate(this.context, ((cdd) this.f5029a.get(i)).f5054a.mo987c().getName());
        cdf cdf = (cdf) instantiate;
        ed childFragmentManager = getChildFragmentManager();
        childFragmentManager.mo1845a().mo1530b(gwb.lp, instantiate).mo1523a(0).mo1522a();
        childFragmentManager.mo1848b();
        return cdf;
    }

    void m7246c(int i) {
        TabWidget d = m7247d();
        for (int i2 = 0; i2 < d.getTabCount(); i2++) {
            View childTabViewAt = d.getChildTabViewAt(i2);
            if (childTabViewAt != null) {
                ImageView imageView = (ImageView) childTabViewAt.findViewWithTag("icon");
                imageView.setColorFilter(getResources().getColor(ba.jd), Mode.SRC_IN);
                imageView.setBackground(null);
                imageView.setSelected(false);
                childTabViewAt.setSelected(false);
            }
        }
        if (i >= 0) {
            View childTabViewAt2 = d.getChildTabViewAt(i);
            if (childTabViewAt2 != null) {
                imageView = (ImageView) childTabViewAt2.findViewWithTag("icon");
                imageView.setColorFilter(getResources().getColor(ba.ja), Mode.SRC_IN);
                imageView.setBackgroundResource(gwb.lj);
                imageView.setSelected(true);
                childTabViewAt2.setSelected(true);
            }
        }
    }

    public void onTabChanged(String str) {
        for (int i = 0; i < this.f5029a.size(); i++) {
            if (((cdd) this.f5029a.get(i)).f5054a.mo987c().getName().equals(str)) {
                m7244b(i);
                return;
            }
        }
        String str2 = "Unknown ";
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }

    public void onClick(View view) {
        m7237q();
    }

    private void m7237q() {
        this.f5031c.mo894a();
        gwb.m1864a(new cdc(this), 67);
    }

    private void m7238r() {
        getView().findViewById(gwb.lp).setVisibility(8);
        m7246c(-1);
        m7239s();
        m7247d().setStripEnabled(false);
        if (this.f5030b != -1) {
            this.f5031c.mo897c();
        }
    }

    private void m7239s() {
        if (this.f5033e != null) {
            View view = getView();
            if (view != null) {
                ((ViewGroup) view.findViewById(gwb.lp)).removeAllViews();
            }
            this.f5033e = null;
        }
    }

    public void mo495a() {
        if (this.f5033e != null && this.f5033e.mo988b()) {
            mo813b();
        }
    }

    public void mo812a(int i) {
        if (i > 0) {
            this.f5032d = i;
            Editor edit = this.f5037i.edit();
            edit.putInt(this.f5035g, i);
            edit.apply();
        }
    }

    public void mo813b() {
        m7244b(-1);
    }

    public void mo814c() {
        if (getView() != null) {
            Collection e = m7236e();
            if (!this.f5029a.equals(e)) {
                m7244b(-1);
                this.f5029a.clear();
                this.f5029a.addAll(e);
                m7232a((er) getView().findViewById(gwb.lo));
            }
        }
    }

    TabWidget m7247d() {
        return (TabWidget) ba.m4536a(this.f5034f);
    }

    private bko m7240t() {
        return fde.m15018e(((jca) this.binder.m25443a(jca.class)).mo2317a());
    }
}
