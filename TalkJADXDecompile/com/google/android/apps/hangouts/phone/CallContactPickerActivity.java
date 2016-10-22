package com.google.android.apps.hangouts.phone;

import android.os.Bundle;
import android.view.MenuItem;
import ba;
import bc;
import bko;
import com.google.android.apps.hangouts.fragments.CallContactPickerFragment;
import daa;
import dcl;
import dgg;
import did;
import dw;
import fde;
import fdv;
import fdx;
import glk;
import gwb;
import java.util.ArrayList;
import java.util.List;
import jca;
import jcu;
import wi;

public class CallContactPickerActivity extends dcl implements daa, fdx {
    private bko r;
    private int s;

    public CallContactPickerActivity() {
        new jcu(this, this.F).a(this.E);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.s = getIntent().getIntExtra("com.google.android.apps.hangouts.voiceCallActionMode", -1);
        if (this.s == -1) {
            glk.e("Babel", "Missing EXTRA_VOICE_CALL_ACTION_MODE", new Object[0]);
            setResult(0);
            finish();
            return;
        }
        this.r = fde.e(((jca) this.E.a(jca.class)).a());
        setContentView(gwb.fH);
        CallContactPickerFragment callContactPickerFragment = (CallContactPickerFragment) J_().a(ba.T);
        callContactPickerFragment.a((daa) this);
        callContactPickerFragment.c();
        if (this.s == 2) {
            setTitle(getString(bc.j));
        }
    }

    protected void onStart() {
        super.onStart();
        g().b(true);
    }

    protected void j() {
        setResult(0);
        finish();
    }

    protected boolean a(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.a(menuItem);
        }
        j();
        return true;
    }

    public int a() {
        return this.s;
    }

    public String C_() {
        return null;
    }

    public void c() {
    }

    public String d() {
        return null;
    }

    public void e() {
    }

    public void D_() {
    }

    public void E_() {
    }

    public boolean h() {
        return true;
    }

    public void a(fdv fdv) {
        if (fdv.a() == 2) {
            gwb.a(fdv, this.r, (dw) this, (fdx) this);
        } else if (fdv.a() == 3) {
            List arrayList = new ArrayList(1);
            arrayList.add(fdv.a(gwb.H()));
            ArrayList arrayList2 = new ArrayList();
            dgg a = dgg.a();
            did s = a.s();
            if (s != null && s.i()) {
                a.b(arrayList);
            }
        }
    }

    public void b(fdv fdv) {
        switch (fdv.a()) {
            case wi.j /*1*/:
            case wi.l /*2*/:
                gwb.a((dw) this, fdv, this.r.g(), this.r.a());
            default:
                glk.e("Babel", "Unrecognized action: " + fdv.a(), new Object[0]);
        }
    }
}
