package com.google.android.apps.hangouts.phone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import ba;
import bcc;
import bko;
import com.google.android.apps.hangouts.fragments.InvitationFragment;
import das;
import dcl;
import ddi;
import dza;
import fde;
import gpc;
import gwb;
import jca;
import jcu;

public class InvitationActivity extends dcl implements das, ddi {
    private bko r;
    private InvitationFragment s;
    private final jca t;

    public InvitationActivity() {
        this.t = new jcu(this, this.F).a(this.E);
        dza dza = new dza(this, this.F);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(c(gwb.gS));
        Intent intent = getIntent();
        this.r = fde.e(this.t.a());
        this.s = (InvitationFragment) J_().a(ba.cE);
        this.s.setHostInterface(this, this);
        this.s.initialize(intent.getExtras());
        if (bundle == null) {
            gwb.c(intent);
        }
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.s.initialize(intent.getExtras());
    }

    public void a(bcc bcc) {
        this.s.scheduleFragmentRestart(bcc);
    }

    public void c(String str) {
        Parcelable bcc = new bcc(str, 0);
        bcc.d = true;
        Intent a = gwb.a(this.r.g(), str, bcc.b);
        a.putExtra("conversation_parameters", bcc);
        a.putExtra("opened_from_impression", 1636);
        startActivity(a);
        finish();
    }

    public void a() {
        finish();
    }

    public void a(String str, Runnable runnable) {
        finish();
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a(String str) {
        a(str, null);
    }

    public void a(gpc gpc, String str, String str2) {
        gwb.a((Activity) this, this.r, (View) gpc, str, str2);
    }

    public void a(String str, String str2) {
    }

    public void b(String str) {
    }

    public void b_(boolean z) {
        this.q.setVisibility(z ? 0 : 8);
    }
}
