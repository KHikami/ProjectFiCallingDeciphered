package com.google.android.apps.hangouts.phone;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import ba;
import bcc;
import bko;
import dbn;
import dbo;
import dcl;
import ddt;
import dhz;
import dib;
import dlh;
import ed;
import fde;
import fdq;
import fdv;
import fdx;
import gai;
import glj;
import glk;
import gwb;
import iil;
import java.util.ArrayList;
import jca;
import jcu;
import juh;
import jyn;
import tp;

public class EditAudienceActivity extends dcl implements dbo, fdx {
    private final jca r;
    private bko s;
    private dbn t;

    public EditAudienceActivity() {
        this.r = new jcu(this, this.F).a(this.E);
        new gai((Activity) this, this.F).b(this.E);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.s = fde.e(this.r.a());
        setContentView(gwb.gq);
        ed J_ = J_();
        this.t = (dbn) J_.a(ba.aQ);
        if (this.t == null) {
            this.t = ((ddt) jyn.a((Context) this, ddt.class)).a();
            J_.a().a(ba.aQ, this.t, dbn.class.getName()).a();
        }
        this.t.a(this);
    }

    protected void onStart() {
        super.onStart();
        tp g = g();
        if (g != null) {
            g.b(true);
        }
    }

    protected boolean a(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.a(menuItem);
        }
        finish();
        return true;
    }

    public void a(String str, int i, boolean z, juh juh) {
        Intent intent;
        if (z) {
            boolean b = fdq.R.b(this.r.a());
            int i2 = b ? 7 : 1;
            glk.a("Babel_EditAudience", "Starting new call; canCreateExpressLane = " + b, new Object[0]);
            dhz a = new dib(this.s.a(), i2).a("conversation").b(str).a();
            ArrayList a2 = gwb.a(this.s, (Context) this, juh);
            ((dlh) jyn.a((Context) this, dlh.class)).a(a, a2);
            startActivity(gwb.a(a, a2, true, 61, glj.b(), b));
        } else {
            Intent a3 = gwb.a(this.s.g(), str, i);
            Parcelable bcc = new bcc(str, i);
            bcc.d = true;
            bcc.k = getIntent().getIntExtra("opened_from_impression", 0);
            bcc.t = this.t.a();
            a3.putExtra("conversation_parameters", bcc);
            intent = (Intent) getIntent().getParcelableExtra("share_intent");
            if (intent != null) {
                intent.putExtra("conversation_id", str);
                a3.putExtra("share_intent", intent);
                a3.setFlags(a3.getFlags() & -67108865);
            }
            startActivity(a3);
        }
        intent = new Intent();
        intent.putExtra("new_conversation_created", true);
        setResult(-1, intent);
        finish();
    }

    public void a(Intent intent) {
        setResult(-1, intent);
        finish();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 5100 && i2 == -1) {
            b((fdv) intent.getParcelableExtra("com.google.android.apps.hangouts.voiceCallActionInfo"));
        } else if (i == 1001 && i2 == -1) {
            a(null);
        }
    }

    public void b(fdv fdv) {
        boolean z = true;
        if (fdv.a() != 1) {
            z = false;
        }
        iil.a("Expected condition to be true", z);
        startActivityForResult(gwb.l(this.s), 1001);
    }
}
