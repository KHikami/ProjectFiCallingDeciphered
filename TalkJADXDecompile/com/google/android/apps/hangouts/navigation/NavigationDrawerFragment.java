package com.google.android.apps.hangouts.navigation;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.widget.DrawerLayout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import ba;
import bc;
import bko;
import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;
import dyh;
import dyi;
import dyj;
import dyk;
import dyl;
import dym;
import dyn;
import dyo;
import dyr;
import dyt;
import dyu;
import dyx;
import dyy;
import dyz;
import dzb;
import dzd;
import dze;
import dzf;
import fde;
import fzw;
import gld;
import gui;
import guj;
import guk;
import gwb;
import hry;
import hsj;
import hsm;
import hst;
import htc;
import hte;
import htg;
import hth;
import htq;
import hts;
import htt;
import htv;
import hwn;
import iih;
import iil;
import java.util.List;
import jcb;
import jcc;
import jcf;
import jmj;
import jzn;
import tt;

public final class NavigationDrawerFragment extends jzn implements htq, hts, jcc {
    public static boolean a;
    private guk aA;
    public ListView aj;
    public List<hwn> ak;
    public hwn al;
    public hwn am;
    public hwn an;
    public Runnable ao;
    public boolean ap;
    public hwn aq;
    public jmj ar;
    public jcf as;
    public iih at;
    public hth au;
    public OnItemClickListener av;
    public htg aw;
    public hte ax;
    public htv ay;
    public htt az;
    public DrawerLayout b;
    public dyu c;
    public tt d;
    public SelectedAccountNavigationView e;
    public gui f;
    public hst g;
    public dyx h;
    public htc i;

    public NavigationDrawerFragment() {
        this.aA = new dyn(this);
        this.av = new dyo(this);
        this.aw = new dyr(this);
        this.ax = new hte(this);
        this.ay = new dyi(this);
        this.az = new htt(this);
    }

    static {
        a = false;
    }

    public void a(hwn hwn) {
        if (this.ao == null) {
            c(hwn);
            this.b.i(getView());
            this.e.c(0);
            this.ao = new dyh(this, hwn);
            b(this.al);
        }
    }

    public void a(SelectedAccountNavigationView selectedAccountNavigationView) {
        b(selectedAccountNavigationView);
    }

    public void b(SelectedAccountNavigationView selectedAccountNavigationView) {
        int a = selectedAccountNavigationView.a();
        if (a == 0) {
            this.aj.setAdapter(this.h);
        } else if (a == 1) {
            this.aj.setAdapter(this.i);
        } else {
            iil.a("Unknown navigation mode: " + a);
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.c = (dyu) activity;
    }

    public void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.binder.a(dyy.class, new dzb(), new dzd(this.binder), new dze(), new dzf());
        this.ar = ((jmj) this.binder.a(jmj.class)).b((jcc) this);
        this.as = (jcf) this.binder.a(jcf.class);
        this.at = (iih) this.binder.a(iih.class);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        setHasOptionsMenu(true);
        this.aq = new dyz(this.context);
        this.f = new guj(this.context).a(hsj.c, new hsm().a(407).a()).a(this.aA).b();
        this.g = new hst(getActivity(), this.f);
        this.h = new dyx(this);
        this.h.a();
        View viewStub = new ViewStub(this.context);
        viewStub.setId(1);
        viewStub.setLayoutResource(gwb.hg);
        viewStub.setOnInflateListener(new dyj(this, layoutInflater, viewGroup));
        View frameLayout = new FrameLayout(this.context);
        frameLayout.addView(viewStub);
        return frameLayout;
    }

    public void a(boolean z, jcb jcb, jcb jcb2, int i, int i2) {
        if (!a) {
            if (jcb2 == jcb.VALID) {
                if (!(this.f == null || this.f.e() || this.f.f())) {
                    this.f.b();
                }
                a();
            } else if (this.f != null && (this.f.e() || this.f.f())) {
                this.f.d();
            }
            this.h.a();
        }
    }

    public final void onStart() {
        super.onStart();
        this.b = (DrawerLayout) getActivity().findViewById(ba.aN);
        this.d = new dyt(this);
        this.b.a(this.d);
        View findViewById = getActivity().findViewById(ba.dA);
        if (VERSION.SDK_INT >= 20) {
            findViewById.setOnApplyWindowInsetsListener(new dym(this));
        }
        findViewById.setFitsSystemWindows(true);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        if (!defaultSharedPreferences.getBoolean("navigation_drawer_shown", false)) {
            defaultSharedPreferences.edit().putBoolean("navigation_drawer_shown", true).apply();
            b();
            this.b.h(getView());
        }
    }

    public final void onStop() {
        if (this.f != null && (this.f.e() || this.f.f())) {
            this.f.d();
        }
        super.onStop();
    }

    public final void onResume() {
        super.onResume();
        if (!(this.f == null || this.f.e() || this.f.f())) {
            this.f.b();
        }
        this.b.post(new dyk(this));
    }

    public final void onPause() {
        super.onPause();
        this.b.i(getView());
        this.h.a(false);
    }

    public void a() {
        if (this.ar.b()) {
            hsj.e.a(this.f, new hry().a(false)).a(new dyl(this));
        }
    }

    public void b(hwn hwn) {
        if (hwn == null) {
            this.al = null;
            return;
        }
        hwn hwn2 = this.al;
        this.al = hwn;
        if (this.ak != null) {
            this.ak = htc.a(this.ak, hwn2, this.al);
            if (this.e != null) {
                this.e.a(this.al);
            }
            this.i.b(this.ak);
        }
    }

    public void c(hwn hwn) {
        iil.b("Selected owner was null", (Object) hwn);
        if (this.al != null) {
            if (!a(this.al, hwn)) {
                if (a(hwn, this.am)) {
                    this.am = this.al;
                } else if (a(hwn, this.an)) {
                    this.an = this.al;
                } else {
                    this.an = this.am;
                    this.am = this.al;
                }
            } else {
                return;
            }
        }
        this.al = hwn;
    }

    private static boolean a(hwn hwn, hwn hwn2) {
        if (hwn == null) {
            if (hwn2 == null) {
                return true;
            }
            return false;
        } else if (hwn2 == null) {
            return false;
        } else {
            if (hwn.a().equals(hwn2.a()) && TextUtils.equals(hwn.g(), hwn2.g())) {
                return true;
            }
            return false;
        }
    }

    public boolean d(hwn hwn) {
        if (hwn == this.aq) {
            if (!((fzw) this.binder.a(fzw.class)).c(this.as.b(hwn.a()))) {
                return false;
            }
        }
        int b = this.as.b(hwn.a());
        return this.as.c(b) && !this.as.e(b);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.d != null) {
            this.d.b();
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.d != null) {
            return this.d.a(menuItem) || super.onOptionsItemSelected(menuItem);
        } else {
            return super.onOptionsItemSelected(menuItem);
        }
    }

    private static void a(ImageView imageView, boolean z) {
        if (z) {
            imageView.setVisibility(0);
            imageView.bringToFront();
            return;
        }
        imageView.setVisibility(8);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            int intExtra = intent.getIntExtra("account_id", -1);
            if (intExtra >= 0) {
                this.c.a(this.as.a(intExtra).b("account_name"));
            }
        }
    }

    public CharSequence a(CharSequence charSequence, boolean z, boolean z2) {
        Resources resources = this.context.getResources();
        StringBuilder stringBuilder = new StringBuilder();
        int i = bc.h;
        Object[] objArr = new Object[1];
        if (z) {
            charSequence = resources.getString(bc.hd, new Object[]{charSequence});
        }
        objArr[0] = charSequence;
        gld.a(stringBuilder, resources.getString(i, objArr));
        if (z2) {
            gld.a(stringBuilder, resources.getText(bc.kI));
        }
        return stringBuilder.toString();
    }

    private void a(hwn hwn, View view, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4) {
        if (d(hwn)) {
            bko a = fde.a(hwn.a());
            boolean z = true;
            boolean z2 = false;
            if (a != null) {
                z = fde.d(a);
                z2 = a.m();
            }
            a(imageView, z);
            a(imageView2, z);
            a(imageView3, z2);
            a(imageView4, z2);
            view.setContentDescription(a(a.a(), z, z2));
            return;
        }
        imageView.setVisibility(8);
        imageView2.setVisibility(8);
        imageView3.setVisibility(8);
        imageView4.setVisibility(8);
    }

    public void b() {
        View view = getView();
        if (view != null) {
            ViewStub viewStub = (ViewStub) view.findViewById(1);
            if (viewStub != null) {
                viewStub.inflate();
            }
        }
    }
}
