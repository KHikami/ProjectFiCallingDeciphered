package defpackage;

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
    ArrayList<cdd> a = new ArrayList();
    private final jhq aj = new jhq(this);
    private ContentObserver ak;
    public int b = -1;
    bxq c;
    int d = -1;
    private cdf e;
    private TabWidget f;
    private String g = "";
    private cgr h;
    private SharedPreferences i;

    private List<cdd> e() {
        ArrayList arrayList = new ArrayList();
        a(arrayList, cjj.class, 2294);
        a(arrayList, cjq.class, 2159);
        if (getResources().getConfiguration().smallestScreenWidthDp < 360 && a(cnk.class) && (a(ckq.class) || a(cja.class))) {
            a(arrayList, clp.class, 3197);
        } else {
            if (!a(arrayList, ckq.class, 2160)) {
                a(arrayList, cja.class, 2160);
            }
            a(arrayList, cnk.class, 3023);
        }
        a(arrayList, clx.class, 1922);
        a(arrayList, cli.class, 2265);
        return arrayList;
    }

    private <T extends cia> boolean a(ArrayList<cdd> arrayList, Class<T> cls, int i) {
        cia cia = (cia) this.binder.b((Class) cls);
        if (cia == null || !cia.a(t(), this.h)) {
            return false;
        }
        arrayList.add(new cdd(cia, i));
        return true;
    }

    private <T extends cia> boolean a(Class<T> cls) {
        cia cia = (cia) this.binder.b((Class) cls);
        return cia != null && cia.a(t(), this.h);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.ak = new cda(this, new Handler());
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.c = (bxq) this.binder.a(bxq.class);
        this.h = (cgr) this.binder.b(cgr.class);
        ((jho) this.binder.a(jho.class)).a(this.aj);
        ((eia) this.binder.a(eia.class)).a(gwb.lv, new cdb(this));
        this.a.addAll(e());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.i = this.context.getSharedPreferences("attachment_prefs", 0);
        if (getActivity().getResources().getConfiguration().orientation == 2) {
            str = "attachment_area_height_landscape";
        } else {
            str = "attachment_area_height_portrait";
        }
        this.g = str;
        this.d = this.i.getInt(this.g, getResources().getDimensionPixelSize(gwb.lg));
        View inflate = layoutInflater.inflate(gwb.lO, viewGroup, false);
        er erVar = (er) inflate.findViewById(gwb.lo);
        erVar.a(getActivity(), getChildFragmentManager(), gwb.lt);
        this.f = erVar.getTabWidget();
        d().setStripEnabled(false);
        d().setDividerDrawable(gwb.li);
        d().setLeftStripDrawable(gwb.li);
        d().setRightStripDrawable(gwb.li);
        a(erVar);
        return inflate;
    }

    public void onPause() {
        this.context.getContentResolver().unregisterContentObserver(this.ak);
        this.c.a();
        b(-1);
        super.onPause();
    }

    public void onResume() {
        b(-1);
        super.onResume();
        this.context.getContentResolver().registerContentObserver(Secure.getUriFor("default_input_method"), false, this.ak);
    }

    private void a(er erVar) {
        erVar.setOnTabChangedListener(null);
        erVar.clearAllTabs();
        for (int i = 0; i < this.a.size(); i++) {
            cia cia = ((cdd) this.a.get(i)).a;
            TabSpec newTabSpec = erVar.newTabSpec(cia.c().getName());
            View inflate = View.inflate(getActivity(), cia.a(), null);
            gld.a(inflate, true);
            newTabSpec.setIndicator(inflate);
            erVar.a(newTabSpec, chk.class, null);
            inflate.setOnClickListener(new cde(this, i));
        }
        erVar.setOnTabChangedListener(this);
    }

    public void b(int i) {
        if (i == -1) {
            r();
            s();
            this.b = -1;
        } else if (isResumed()) {
            if (this.b != i) {
                s();
                cdd cdd = (cdd) this.a.get(i);
                chz b = cdd.a.b();
                if (b != null) {
                    boolean z;
                    if (b.a.isEmpty()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    iil.a("Expected condition to be true", z);
                    if (!((ehz) this.binder.a(ehz.class)).a(b.a)) {
                        eia eia = (eia) this.binder.a(eia.class);
                        Bundle bundle = new Bundle();
                        bundle.putString("permission_picker_name", cdd.a());
                        eia.a(new eie(gwb.lv, b.b, bundle), b.a);
                        return;
                    }
                }
                this.e = d(i);
                ((iih) this.binder.a(iih.class)).a(((jca) this.binder.a(jca.class)).a()).b().c(cdd.b);
            }
            if (this.e == null) {
                this.e = d(i);
            }
            if (this.b == i && !(((cdd) this.a.get(i)).a instanceof clp)) {
                return;
            }
            if (this.e.a()) {
                q();
                this.b = i;
                return;
            }
            this.c.a();
            r();
            this.b = -1;
        }
    }

    private cdf d(int i) {
        dr instantiate = dr.instantiate(this.context, ((cdd) this.a.get(i)).a.c().getName());
        cdf cdf = (cdf) instantiate;
        ed childFragmentManager = getChildFragmentManager();
        childFragmentManager.a().b(gwb.lp, instantiate).a(0).a();
        childFragmentManager.b();
        return cdf;
    }

    void c(int i) {
        TabWidget d = d();
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
        for (int i = 0; i < this.a.size(); i++) {
            if (((cdd) this.a.get(i)).a.c().getName().equals(str)) {
                b(i);
                return;
            }
        }
        String str2 = "Unknown ";
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }

    public void onClick(View view) {
        q();
    }

    private void q() {
        this.c.a();
        gwb.a(new cdc(this), 67);
    }

    private void r() {
        getView().findViewById(gwb.lp).setVisibility(8);
        c(-1);
        s();
        d().setStripEnabled(false);
        if (this.b != -1) {
            this.c.c();
        }
    }

    private void s() {
        if (this.e != null) {
            View view = getView();
            if (view != null) {
                ((ViewGroup) view.findViewById(gwb.lp)).removeAllViews();
            }
            this.e = null;
        }
    }

    public void a() {
        if (this.e != null && this.e.b()) {
            b();
        }
    }

    public void a(int i) {
        if (i > 0) {
            this.d = i;
            Editor edit = this.i.edit();
            edit.putInt(this.g, i);
            edit.apply();
        }
    }

    public void b() {
        b(-1);
    }

    public void c() {
        if (getView() != null) {
            Collection e = e();
            if (!this.a.equals(e)) {
                b(-1);
                this.a.clear();
                this.a.addAll(e);
                a((er) getView().findViewById(gwb.lo));
            }
        }
    }

    TabWidget d() {
        return (TabWidget) ba.a(this.f);
    }

    private bko t() {
        return fde.e(((jca) this.binder.a(jca.class)).a());
    }
}
