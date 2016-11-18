package p000;

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

public abstract class cyp extends dcj implements OnScrollListener, fsg {
    public static final boolean f9335a = false;
    private ListView aj;
    private boolean ak;
    public gui f9336b;
    public fsb f9337c;
    public hwl f9338d;
    public agg f9339e;
    public View f9340f;
    public jca f9341g;
    public boolean f9342h = false;
    private String f9343i;

    protected abstract agh[] mo495a();

    static {
        kae kae = glk.f15559f;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        guj guj = new guj(activity.getApplicationContext());
        guj.m18640a(hsj.f17166c, new hsm().m20771a(117).m20770a());
        guj.m18641a(new cyq(this));
        guj.m18642a(new cyr(this));
        this.f9336b = guj.m18645b();
        this.f9336b.mo2518b();
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.f9341g = (jca) this.binder.m25443a(jca.class);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, int i) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle, i);
        this.aj = (ListView) onCreateView.findViewById(16908298);
        this.aj.setOnScrollListener(this);
        this.f9340f = onCreateView.findViewById(ba.dC);
        if (this.f9339e != null) {
            this.aj.setAdapter(this.f9339e);
            m11272a(!this.f9339e.isEmpty());
        }
        if (this.ak) {
            m11287s();
        }
        return onCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        m11273t();
        this.f9337c = null;
        this.f9339e = null;
    }

    public void onDetach() {
        super.onDetach();
        if (this.f9336b.mo2524e() || this.f9336b.mo2525f()) {
            this.f9336b.mo2523d();
        }
    }

    public void m11278a(CharSequence charSequence) {
        iil.m21867a();
        if (this.f9339e != null) {
            if (charSequence.length() > 70) {
                charSequence = charSequence.subSequence(0, 70);
            }
            if (!charSequence.equals(this.f9343i)) {
                this.f9343i = TextUtils.isEmpty(charSequence) ? null : charSequence.toString();
                mo1496b(this.f9343i);
            }
        }
    }

    protected ListView m11280b() {
        return this.aj;
    }

    protected void mo1496b(CharSequence charSequence) {
        m11282c();
    }

    public void m11282c() {
        this.f9337c = null;
        if (this.f9336b.mo2524e() && mo1497e()) {
            this.f9337c = new fsb(this.f9336b, m11286r(), this, this.f9343i);
            this.f9337c.m16118b();
        }
    }

    private void m11273t() {
        if (this.f9338d != null && !this.f9338d.mo2076c()) {
            this.f9338d.mo2073b();
            this.f9338d = null;
        }
    }

    protected String m11283d() {
        return this.f9343i;
    }

    protected boolean mo1497e() {
        return true;
    }

    public boolean mo1495q() {
        if (this.f9339e != null) {
            return false;
        }
        m11274u();
        if (mo1497e()) {
            m11282c();
        }
        this.f9342h = true;
        return true;
    }

    protected bko m11286r() {
        return fde.m15018e(this.f9341g.mo2317a());
    }

    public void m11276a(cyt cyt) {
        this.aj.setOnItemClickListener(new cys(this, cyt));
    }

    public void mo1473a(fsb fsb, hwl hwl, hwq hwq) {
        if (fsb == this.f9337c) {
            m11273t();
            this.f9338d = hwl;
            if (this.f9339e == null) {
                m11274u();
            }
        }
    }

    private void m11274u() {
        this.f9339e = new agg(getActivity(), m11286r());
        for (agh a : mo495a()) {
            this.f9339e.m1056a(a);
        }
        if (this.aj != null) {
            this.aj.setAdapter(this.f9339e);
        }
    }

    private void m11272a(boolean z) {
        int i;
        int i2 = 8;
        ListView listView = this.aj;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        listView.setVisibility(i);
        View view = this.f9340f;
        if (!z) {
            i2 = 0;
        }
        view.setVisibility(i2);
    }

    protected void mo1493a(int i, dab dab) {
        if (this.f9339e != null) {
            agh a = this.f9339e.m1050a(i);
            this.f9339e.m1055a(i, (Cursor) dab);
            a.m1063a(this.f9343i);
            if (this.f9340f != null) {
                m11272a(!this.f9339e.isEmpty());
            }
        }
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        switch (i) {
            case 1:
            case 2:
                ((InputMethodManager) absListView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(absListView.getWindowToken(), 0);
                return;
            default:
                return;
        }
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public void m11287s() {
        if (this.aj == null) {
            this.ak = true;
            return;
        }
        this.ak = false;
        this.aj.setSelectionAfterHeaderView();
    }
}
