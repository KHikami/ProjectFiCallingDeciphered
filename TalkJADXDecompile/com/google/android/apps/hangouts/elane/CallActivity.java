package com.google.android.apps.hangouts.elane;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import ba;
import com.google.android.apps.hangouts.hangout.IncomingRing;
import cqx;
import crh;
import cri;
import crj;
import crk;
import crl;
import crm;
import crn;
import cro;
import crp;
import csf;
import csi;
import csl;
import ctn;
import ctt;
import ctu;
import ctv;
import cui;
import cuj;
import cus;
import cvh;
import cvm;
import cvx;
import cwb;
import cwq;
import cwu;
import dek;
import dhz;
import dlh;
import dr;
import eia;
import eie;
import fde;
import fk;
import glk;
import gwb;
import iil;
import itg;
import java.util.ArrayList;
import java.util.List;
import jca;
import jcu;
import jyn;
import wi;

public class CallActivity extends dek {
    private final cwb A;
    public ctn n;
    public boolean o;
    private cvh p;
    private cqx r;
    private cvx s;
    private cwu t;
    private boolean u;
    private csf v;
    private final itg w;
    private final cvm x;
    private final ctt y;
    private final ctt z;

    public CallActivity() {
        new jcu(this, this.F).a(this.E);
        this.E.a(cuj.class, new crh(this));
        this.E.a(csi.class, new csi());
        this.w = new cri(this);
        this.x = new crj(this);
        this.y = new crk(this);
        this.z = new crl(this);
        this.A = new cwb(this);
    }

    protected void a(Bundle bundle) {
        super.a(bundle);
        ((eia) this.E.a(eia.class)).a(gwb.oR, new crm(this));
        this.E.a(crp.class, new cro(this));
    }

    public void onCreate(Bundle bundle) {
        ctv ctv;
        b("onCreate.enter");
        this.o = false;
        IncomingRing.a(getIntent());
        dhz dhz = (dhz) getIntent().getParcelableExtra("hangout_room_info");
        Context applicationContext = getApplicationContext();
        jyn b = jyn.b(applicationContext);
        csl csl = (csl) b.a(csl.class);
        this.n = csl.a();
        dlh dlh = (dlh) b.a(dlh.class);
        if ((getIntent().getFlags() & 1048576) != 0) {
            if (this.n == null) {
                String e;
                glk.d("Babel_explane", "[CallActivity] no hangoutCall on create from history; redirect to conversation", new Object[0]);
                if (dhz != null) {
                    e = dhz.e();
                } else {
                    e = null;
                }
                a(e);
            }
            ctv = null;
        } else if (dhz == null) {
            glk.d("Babel_explane", "[CallActivity] hangoutRequest is null", new Object[0]);
            gwb.i(applicationContext, 3212);
            ctv = null;
        } else if (this.n == null) {
            glk.c("Babel_explane", "[CallActivity] requesting a new HangoutCall", new Object[0]);
            gwb.i(applicationContext, 3243);
            dlh.a(dhz, null, getIntent().getBooleanExtra("hangout_auto_join", false), false, true, false);
            this.n = csl.a();
            if (this.n == null) {
                glk.d("Babel_explane", "[CallActivity] failed to create a HangoutCall", new Object[0]);
                ctv = new cui(this, ba.jE);
                gwb.i(applicationContext, 3327);
            }
            ctv = null;
        } else if (this.n.a(dhz)) {
            glk.c("Babel_explane", "[CallActivity] returning to same HangoutCall", new Object[0]);
            gwb.i(applicationContext, 3209);
            ctv = null;
        } else {
            glk.c("Babel_explane", "[CallActivity] hangoutRequest refers to a different HangoutCall", new Object[0]);
            if (gwb.l(applicationContext)) {
                glk.c("Babel_explane", "[CallActivity] another HangoutCall is already in progress", new Object[0]);
                ctv = new cui(this, ba.jJ);
                gwb.i(applicationContext, 3211);
            } else {
                glk.c("Babel_explane", "[CallActivity] no other HangoutCall in progress", new Object[0]);
                dlh.a(dhz, (Activity) this);
                gwb.i(applicationContext, 3210);
                ctv = null;
            }
            this.n = null;
        }
        if (ctv != null) {
            super.onCreate(null);
            a(ctv);
            return;
        }
        super.onCreate(bundle);
        this.p = this.n.h();
        this.s = this.n.i();
        this.t = (cwu) jyn.b((Context) this, cwu.class);
        if (this.n.m()) {
            this.n.g().a(true);
        }
        Window window = getWindow();
        int i = 6848640;
        if (VERSION.SDK_INT >= 19) {
            i = 208175232;
        }
        window.addFlags(i);
        setContentView(gwb.pl);
        this.r = new cqx(this, g(), this.n);
        cus g = this.n.g();
        List arrayList = new ArrayList();
        if (!g.m()) {
            arrayList.add("android.permission.RECORD_AUDIO");
        }
        if (!(this.n.m() || g.g() || g.c())) {
            arrayList.add("android.permission.CAMERA");
        }
        if (!arrayList.isEmpty()) {
            ((eia) this.E.a(eia.class)).a(new eie(gwb.oR, 2656), arrayList);
        }
        if (bundle == null) {
            J_().a().a(gwb.oC, j()).a();
        }
        this.n.k().a(1);
        this.n.f().a(this.w);
        this.n.a(this.y);
        b("onCreate.exit");
    }

    public dr j() {
        if (!this.n.m() || this.t == null) {
            return new cwq();
        }
        return this.t.a();
    }

    public void onStart() {
        b("onStart.enter");
        super.onStart();
        if (this.n != null) {
            this.r.a();
            this.p.a(this.x);
            if (this.n.f().n()) {
                finish();
            }
        }
        b("onStart.exit");
    }

    protected void onPostResume() {
        super.onPostResume();
        if (this.n != null) {
            this.n.a(this.z);
            this.s.a(this.A);
        }
        this.u = true;
        if (this.v != null) {
            this.v.a(J_(), "CALL_ERROR_DIALOG_TAG");
            this.v = null;
        }
    }

    protected void onPause() {
        this.u = false;
        if (this.n != null) {
            this.n.b(this.z);
            this.s.b(this.A);
        }
        super.onPause();
    }

    public void onStop() {
        b("onStop.enter");
        if (this.n != null) {
            this.p.b(this.x);
            this.r.b();
        }
        super.onStop();
        b("onStop.exit");
    }

    public void onDestroy() {
        b("onDestroy.enter");
        if (this.n != null) {
            this.n.f().b(this.w);
            this.n.b(this.y);
        }
        super.onDestroy();
        b("onDestroy.exit");
    }

    public void onBackPressed() {
        if (this.n == null || !this.n.f().m()) {
            a(this.n.l());
            return;
        }
        this.n.q();
        gwb.i((Context) this, 3208);
        finish();
    }

    private void a(String str) {
        Intent c = gwb.c(fde.e(((jca) jyn.a((Context) this, jca.class)).a()), str);
        if (!fk.a((Activity) this, c)) {
            startActivity(c);
        }
        finish();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.n != null) {
            this.r.a(menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        if (this.n != null) {
            this.r.b(menu);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        gwb.i((Context) this, 1584);
        return super.onMenuOpened(i, menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.n == null || !this.r.a(menuItem)) {
            return super.onOptionsItemSelected(menuItem);
        }
        return true;
    }

    private static void b(String str) {
        glk.c("Babel_explane", "[CallActivity]: %s", str);
    }

    public void a(ctv ctv) {
        switch (crn.a[ctv.b - 1]) {
            case wi.j /*1*/:
                c(((ctu) ctv).a);
            case wi.l /*2*/:
                d(((cui) ctv).a);
            case wi.z /*3*/:
                glk.c("Babel_explane", "Switching from CallActivity to HangoutActivity", new Object[0]);
                Intent b = gwb.b(getIntent().getExtras());
                if (this.n.g().i()) {
                    b.putExtra("hangout_mute_microphone", true);
                }
                if (this.n.g().c()) {
                    b.putExtra("hangout_mute_camera", true);
                }
                startActivity(b);
                overridePendingTransition(0, 0);
                finish();
            default:
                iil.a("Unknown error type.");
        }
    }

    public void d(int i) {
        String string = getString(i);
        csf csf = new csf();
        Bundle bundle = new Bundle();
        bundle.putString("message", string);
        bundle.putString("positive", getString(17039370));
        csf.setArguments(bundle);
        a(csf);
    }

    private void a(csf csf) {
        if (this.u) {
            csf.a(J_(), "CALL_ERROR_DIALOG_TAG");
        } else {
            this.v = csf;
        }
        gwb.i((Context) this, 3207);
        this.o = true;
    }

    public void c(int i) {
        csf csf = new csf();
        Bundle bundle = new Bundle();
        bundle.putString("message", csf.a(this, i));
        bundle.putString("positive", getString(17039370));
        csf.setArguments(bundle);
        a(csf);
    }
}
