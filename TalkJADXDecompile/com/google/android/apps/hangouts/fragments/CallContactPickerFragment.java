package com.google.android.apps.hangouts.fragments;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import ba;
import bc;
import cxm;
import cxn;
import cyt;
import czq;
import czr;
import czs;
import czt;
import czu;
import czv;
import czw;
import czx;
import czy;
import czz;
import daa;
import dak;
import dap;
import dcj;
import ddu;
import ddv;
import ddy;
import deb;
import des;
import det;
import fde;
import fdv;
import glk;
import gnj;
import gwb;
import iil;
import jca;
import wi;

public class CallContactPickerFragment extends dcj implements cxn, cyt, deb, det {
    public ddy a;
    private FrameLayout aj;
    private FrameLayout ak;
    private FrameLayout al;
    private ImageView am;
    private ddv an;
    private int ao;
    private boolean ap;
    private boolean aq;
    private boolean ar;
    private OnClickListener as;
    public des b;
    public View c;
    public View d;
    public int e;
    public daa f;
    public cxm g;
    private jca h;
    private EditText i;

    public CallContactPickerFragment() {
        this.ao = -1;
        this.e = -1;
    }

    protected boolean isEmpty() {
        return false;
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.h = (jca) this.binder.a(jca.class);
        if (getUserVisibleHint()) {
            gwb.a(fde.e(this.h.a()), 854);
        }
        this.g = (cxm) this.binder.b(cxm.class);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        super.onCreateView(layoutInflater, viewGroup, bundle);
        setHasOptionsMenu(true);
        View inflate = layoutInflater.inflate(gwb.fQ, viewGroup, false);
        this.i = (EditText) inflate.findViewById(ba.ac);
        this.i.setCustomSelectionActionModeCallback(new czq(this));
        this.i.addTextChangedListener(new czs(this));
        this.i.setInputType(this.i.getInputType() | 524288);
        this.i.setOnClickListener(new czt(this));
        inflate.getViewTreeObserver().addOnGlobalLayoutListener(new czu(this, inflate));
        this.c = inflate.findViewById(ba.cP);
        OnClickListener czv = new czv(this);
        this.d = inflate.findViewById(ba.aG);
        OnClickListener czw = new czw(this);
        this.d.setOnLongClickListener(new czx(this));
        if (this.g != null) {
            this.c.setVisibility(8);
            this.d.setVisibility(8);
            this.as = new czy(this);
            this.g.a(this.as);
            this.g.c(czw);
            this.g.a((cxn) this);
        } else {
            this.c.setOnClickListener(czv);
            this.d.setOnClickListener(czw);
        }
        this.aj = (FrameLayout) inflate.findViewById(ba.dc);
        this.ak = (FrameLayout) inflate.findViewById(ba.eG);
        this.al = (FrameLayout) inflate.findViewById(ba.dY);
        this.al.setAccessibilityDelegate(new czz(this));
        this.a = (ddy) getChildFragmentManager().a(ddy.class.getName());
        this.an = (ddv) getChildFragmentManager().a(ddv.class.getName());
        this.b = (des) getChildFragmentManager().a(des.class.getName());
        if (this.a == null) {
            z = true;
        } else {
            z = false;
        }
        if (this.an == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z == z2) {
            z = true;
        } else {
            z = false;
        }
        iil.a("Expected condition to be true", z);
        if (this.a == null) {
            z = true;
        } else {
            z = false;
        }
        if (this.b == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z == z2) {
            z3 = true;
        }
        iil.a("Expected condition to be true", z3);
        if (this.a == null) {
            this.a = new ddy();
            this.an = new ddv();
            this.b = new des();
            getChildFragmentManager().a().a(ba.dc, this.a, ddy.class.getName()).a(ba.eG, this.an, ddv.class.getName()).a(ba.dY, this.b, des.class.getName()).a();
        }
        this.am = (ImageView) inflate.findViewById(ba.aL);
        this.am.setOnClickListener(new czr(this));
        this.aq = true;
        if (this.ar) {
            c();
        }
        this.a.a(this);
        this.b.a((det) this);
        return inflate;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 102) {
            this.an.c();
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.as != null) {
            this.g.b(this.as);
        }
        this.aq = false;
    }

    public void onDestroy() {
        this.f.E_();
        super.onDestroy();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.al.getVisibility() == 0 && getResources().getConfiguration().orientation == 2) {
            this.i.setVisibility(8);
        } else {
            this.i.setVisibility(0);
        }
    }

    public void onStart() {
        super.onStart();
        this.a.a((cyt) this);
        this.an.a((cyt) this);
        s();
        c();
        gwb.a(fde.e(this.h.a()), 854);
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z && isAdded()) {
            gwb.a(fde.e(this.h.a()), 854);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 1) {
            return super.onOptionsItemSelected(menuItem);
        }
        ddu.a(getResources()).a(getFragmentManager());
        return true;
    }

    public int a() {
        if (this.e == 1) {
            return 1;
        }
        return 2;
    }

    private void s() {
        boolean h = this.f.h();
        boolean z = PreferenceManager.getDefaultSharedPreferences(getActivity()).getBoolean("dialpad_visible", false);
        if (h && z) {
            a(1, false);
            if (this.g == null) {
                this.c.setVisibility(8);
                this.d.setVisibility(0);
                return;
            }
            this.g.d();
            return;
        }
        a(0, false);
    }

    public void onResume() {
        super.onResume();
        glk.a("Babel", "Resuming CallContactPickerFragment", new Object[0]);
        b();
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            t();
        } else {
            s();
        }
    }

    public void onPause() {
        super.onPause();
        t();
    }

    public void b() {
        CharSequence C_ = this.f.C_();
        if (TextUtils.equals(C_, "com.google.android.apps.hangouts.phone.dialpad")) {
            a(1, false);
            String d = this.f.d();
            if (d != null) {
                this.b.b(d);
                this.f.e();
            }
        } else if (TextUtils.equals(C_, "com.google.android.apps.hangouts.phone.recentcalls")) {
            a(0, false);
        }
        this.f.c();
    }

    private void t() {
        PreferenceManager.getDefaultSharedPreferences(getActivity()).edit().putBoolean("dialpad_visible", this.e == 1).apply();
        a(-1, false);
        a(-1);
        if (this.g == null) {
            this.c.setVisibility(0);
        } else {
            this.g.a(true);
        }
    }

    public void a(daa daa) {
        this.f = daa;
    }

    public void c() {
        if (this.aq) {
            boolean z;
            this.ar = false;
            if (this.a.q()) {
                z = true;
            } else {
                z = false;
            }
            if (this.an.q()) {
                z = true;
            }
            if (z) {
                if (this.ap || this.i.getText().length() <= 0) {
                    this.i.setText("");
                    this.b.d();
                    this.an.s();
                    this.a.s();
                    a(0, false);
                    a(0);
                } else {
                    this.a.a(this.i.getText());
                }
                this.ap = true;
                return;
            }
            return;
        }
        this.ar = true;
    }

    public boolean d() {
        if (this.e == 1) {
            a(0, true);
            if (this.i.length() != 0) {
                return true;
            }
            a(0);
            return true;
        } else if (this.e != 2) {
            return false;
        } else {
            a(0, false);
            return true;
        }
    }

    public void a(boolean z) {
        if (z == (this.am.getVisibility() == 0)) {
            return;
        }
        if (z) {
            this.am.setVisibility(0);
            this.am.startAnimation(AnimationUtils.loadAnimation(getActivity(), gwb.db));
            return;
        }
        this.am.setVisibility(8);
        this.am.startAnimation(AnimationUtils.loadAnimation(getActivity(), gwb.dc));
    }

    public void a(int i) {
        a(i, this.e);
    }

    private void a(int i, int i2) {
        boolean z = true;
        if (i != this.ao) {
            switch (i) {
                case wi.w /*0*/:
                    if (i2 == 1) {
                        z = false;
                    }
                    iil.a("Expected condition to be true", z);
                    this.ak.setVisibility(0);
                    this.aj.setVisibility(8);
                    a(false);
                    break;
                case wi.j /*1*/:
                    this.ak.setVisibility(8);
                    this.aj.setVisibility(0);
                    a(false);
                    break;
                case wi.l /*2*/:
                    this.ak.setVisibility(8);
                    this.aj.setVisibility(8);
                    a(true);
                    break;
            }
            this.ao = i;
        }
    }

    public void a(int i, boolean z) {
        int i2 = 1;
        if (i != this.e) {
            switch (i) {
                case wi.w /*0*/:
                    if (this.g == null) {
                        this.c.setVisibility(0);
                        this.d.setVisibility(8);
                    } else {
                        this.g.e();
                    }
                    if (this.al.getVisibility() != 8) {
                        this.al.setVisibility(8);
                        if (this.e != -1) {
                            this.al.sendAccessibilityEvent(32);
                        }
                    }
                    this.i.setSelection(this.i.getText().length());
                    this.i.setVisibility(0);
                    if (this.i.length() == 0) {
                        i2 = 0;
                    }
                    a(i2, 0);
                    if (z) {
                        this.al.startAnimation(AnimationUtils.loadAnimation(getActivity(), gwb.de));
                    }
                    this.f.E_();
                    break;
                case wi.j /*1*/:
                    if (this.g == null) {
                        this.c.setVisibility(8);
                        this.d.setVisibility(0);
                    } else {
                        this.g.c();
                    }
                    if (this.al.getVisibility() != 0) {
                        this.al.setVisibility(0);
                        if (this.e != -1) {
                            this.al.sendAccessibilityEvent(32);
                        }
                    }
                    if (z) {
                        this.al.startAnimation(AnimationUtils.loadAnimation(getActivity(), gwb.dd));
                    }
                    if (this.b.c()) {
                        a(2);
                    } else {
                        a(1);
                    }
                    this.i.setVisibility(8);
                    this.f.D_();
                    ba.v(getActivity().getCurrentFocus());
                    break;
                case wi.l /*2*/:
                    if (this.g == null) {
                        this.c.setVisibility(0);
                        this.d.setVisibility(8);
                    } else {
                        this.g.e();
                    }
                    if (this.al.getVisibility() != 8) {
                        this.al.setVisibility(8);
                        if (this.e != -1) {
                            this.al.sendAccessibilityEvent(32);
                        }
                    }
                    this.i.setVisibility(8);
                    if (z) {
                        this.al.startAnimation(AnimationUtils.loadAnimation(getActivity(), gwb.de));
                        break;
                    }
                    break;
            }
            this.e = i;
        }
    }

    public void a(gnj gnj) {
        if (this.f != null) {
            this.i.setText("");
            dak a = gnj.a();
            int h = gnj.h();
            String e = gnj.e();
            String f = gnj.f();
            String g = gnj.g();
            fdv fdv = new fdv(b(this.f.a()), ((dap) a.f().get(0)).a, gnj.c(), h, e, f, g, 61);
            if (TextUtils.isEmpty(fdv.b())) {
                Toast.makeText(this.context, bc.th, 0).show();
            } else {
                this.f.a(fdv);
            }
        }
    }

    public void e() {
        a(1);
    }

    public void q() {
        if (this.e == 1) {
            a(0, true);
        }
    }

    public void r() {
        if (this.e == 1) {
            a(2, true);
        }
    }

    public void b(String str) {
        this.i.setText(str);
        this.i.setSelection(this.i.getText().length());
    }

    public void b(boolean z) {
        this.d.setEnabled(z);
    }

    public void c(String str) {
        a(0, true);
        this.f.a(new fdv(b(this.f.a()), str, null, 0, null, null, null, 61));
        gwb.a(fde.e(this.h.a()), 858);
    }

    private static int b(int i) {
        switch (i) {
            case wi.j /*1*/:
                return 2;
            case wi.l /*2*/:
                return 3;
            default:
                glk.e("Babel", "Unsupported call action type for CallContactPickerFragment!", new Object[0]);
                return -1;
        }
    }
}
