package defpackage;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;

/* renamed from: cyp */
public abstract class cyp extends dcj implements OnScrollListener, fsg {
    public static final boolean a;
    private ListView aj;
    private boolean ak;
    public gui b;
    public fsb c;
    public hwl d;
    public agg e;
    public View f;
    public jca g;
    public boolean h;
    private String i;

    protected abstract agh[] a();

    public cyp() {
        this.h = false;
    }

    static {
        kae kae = glk.f;
        a = false;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        guj guj = new guj(activity.getApplicationContext());
        guj.a(hsj.c, new hsm().a(117).a());
        guj.a(new cyq(this));
        guj.a(new cyr(this));
        this.b = guj.b();
        this.b.b();
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.g = (jca) this.binder.a(jca.class);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, int i) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle, i);
        this.aj = (ListView) onCreateView.findViewById(16908298);
        this.aj.setOnScrollListener(this);
        this.f = onCreateView.findViewById(ba.dC);
        if (this.e != null) {
            this.aj.setAdapter(this.e);
            a(!this.e.isEmpty());
        }
        if (this.ak) {
            s();
        }
        return onCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        t();
        this.c = null;
        this.e = null;
    }

    public void onDetach() {
        super.onDetach();
        if (this.b.e() || this.b.f()) {
            this.b.d();
        }
    }

    public void a(CharSequence charSequence) {
        iil.a();
        if (this.e != null) {
            if (charSequence.length() > 70) {
                charSequence = charSequence.subSequence(0, 70);
            }
            if (!charSequence.equals(this.i)) {
                this.i = TextUtils.isEmpty(charSequence) ? null : charSequence.toString();
                b(this.i);
            }
        }
    }

    protected ListView b() {
        return this.aj;
    }

    protected void b(CharSequence charSequence) {
        c();
    }

    public void c() {
        this.c = null;
        if (this.b.e() && e()) {
            this.c = new fsb(this.b, r(), this, this.i);
            this.c.b();
        }
    }

    private void t() {
        if (this.d != null && !this.d.c()) {
            this.d.b();
            this.d = null;
        }
    }

    protected String d() {
        return this.i;
    }

    protected boolean e() {
        return true;
    }

    public boolean q() {
        if (this.e != null) {
            return false;
        }
        u();
        if (e()) {
            c();
        }
        this.h = true;
        return true;
    }

    protected bko r() {
        return fde.e(this.g.a());
    }

    public void a(cyt cyt) {
        this.aj.setOnItemClickListener(new cys(this, cyt));
    }

    public void a(fsb fsb, hwl hwl, hwq hwq) {
        if (fsb == this.c) {
            t();
            this.d = hwl;
            if (this.e == null) {
                u();
            }
        }
    }

    private void u() {
        this.e = new agg(getActivity(), r());
        for (agh a : a()) {
            this.e.a(a);
        }
        if (this.aj != null) {
            this.aj.setAdapter(this.e);
        }
    }

    private void a(boolean z) {
        int i;
        int i2 = 8;
        ListView listView = this.aj;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        listView.setVisibility(i);
        View view = this.f;
        if (!z) {
            i2 = 0;
        }
        view.setVisibility(i2);
    }

    protected void a(int i, dab dab) {
        if (this.e != null) {
            agh a = this.e.a(i);
            this.e.a(i, (Cursor) dab);
            a.a(this.i);
            if (this.f != null) {
                a(!this.e.isEmpty());
            }
        }
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        switch (i) {
            case wi.j /*1*/:
            case wi.l /*2*/:
                ((InputMethodManager) absListView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(absListView.getWindowToken(), 0);
            default:
        }
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public void s() {
        if (this.aj == null) {
            this.ak = true;
            return;
        }
        this.ak = false;
        this.aj.setSelectionAfterHeaderView();
    }
}
