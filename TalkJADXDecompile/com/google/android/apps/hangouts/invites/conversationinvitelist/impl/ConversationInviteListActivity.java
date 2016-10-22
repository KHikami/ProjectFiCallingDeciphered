package com.google.android.apps.hangouts.invites.conversationinvitelist.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import ba;
import bc;
import bcc;
import dcl;
import dqs;
import edo;
import fkc;
import gwb;
import ik;
import jca;
import jcu;
import jxy;

public class ConversationInviteListActivity extends dcl implements dqs, fkc {
    BroadcastReceiver r;
    BroadcastReceiver s;
    public final jca t;
    public InviteListFragment u;

    public ConversationInviteListActivity() {
        this.t = new jcu(this, this.F).a(this.E);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(gwb.qP);
        boolean booleanExtra = getIntent().getBooleanExtra("is_chat_notification", false);
        this.u = (InviteListFragment) J_().a(gwb.qy);
        this.u.e = this;
        if (VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(getResources().getColor(bc.uI));
        }
        if (bundle == null) {
            gwb.c(getIntent());
            this.u.a(booleanExtra);
        }
    }

    public void a(edo edo, String str, int i, long j) {
        startActivity(gwb.a(this.t.a(), str, edo, i, j));
    }

    public void a(String str) {
        Parcelable bcc = new bcc(str, 0);
        bcc.d = true;
        Intent a = gwb.a(this.t.a(), str, bcc.b);
        a.putExtra("conversation_parameters", bcc);
        a.putExtra("opened_from_impression", 1636);
        startActivity(a);
        finish();
    }

    public void b(String str) {
        jxy a = jxy.a(getString(ba.lz), getString(ba.ly), getString(ba.lx), getString(ba.lw), 0, 0, ba.lL);
        a.setTargetFragment(this.u, 2);
        a.a(this.u.getFragmentManager(), str);
    }

    protected void onStop() {
        ik.a((Context) this).a(this.r);
        ik.a((Context) this).a(this.s);
        super.onStop();
    }
}
