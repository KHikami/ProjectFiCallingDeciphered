package com.google.android.apps.hangouts.hangout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import ba;
import com.google.android.apps.hangouts.R$drawable;
import dcl;
import dhz;
import dij;
import djn;
import dlb;
import dmo;
import doi;
import dr;
import fde;
import fk;
import fkc;
import giv;
import gje;
import gwb;
import jca;
import jcu;
import tp;

public final class HangoutActivity extends dcl implements fkc {
    final gje r;
    final gje s;
    final jca t;
    private HangoutFragment u;
    private boolean v;
    private boolean w;

    public HangoutActivity() {
        this.r = new gje(this, "com.google.android.apps.hangouts.phone.notify_external_interruption", "com.google.android.apps.hangouts.phone.block_external_interruption");
        this.s = new gje(this, "com.google.android.apps.hangouts.phone.notify_set_active", "com.google.android.apps.hangouts.phone.force_set_active");
        this.t = new jcu(this, this.F).a(this.E);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (giv.d()) {
            gwb.t("Device has NFC. Adding NfcHangoutFragment.");
            J_().a().a(new djn(), null).a();
        }
        a(gwb.gw, R$drawable.bK);
        tp g = g();
        g.c(false);
        g.d(true);
        g.a(new dij(this, null));
        Window window = getWindow();
        int i = 6848512;
        dhz m = m();
        if (!(m == null || m.l() == 2)) {
            i = 6848640;
        }
        window.addFlags(i);
        this.v = bundle != null;
        this.r.a();
        this.s.a();
    }

    public void a(Bundle bundle) {
        super.a(bundle);
        ((doi) this.E.a(doi.class)).a(this, this.F).a(this.E);
        ((dmo) this.E.a(dmo.class)).a(this, this.F).a(this.E);
        for (dlb a : this.E.c(dlb.class)) {
            a.a(this, this.F);
        }
    }

    protected void onStart() {
        super.onStart();
        IncomingRing.a(getIntent());
    }

    public void onRestart() {
        super.onRestart();
        this.v = true;
    }

    public void a(dr drVar) {
        if (drVar instanceof HangoutFragment) {
            this.u = (HangoutFragment) drVar;
        }
    }

    protected void onDestroy() {
        super.onDestroy();
        this.r.b();
        this.s.b();
    }

    protected boolean a(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            gwb.f(1585);
            q();
            return true;
        } else if (itemId != ba.di) {
            return super.a(menuItem);
        } else {
            return true;
        }
    }

    public boolean onMenuOpened(int i, Menu menu) {
        if (menu != null) {
            gwb.f(1584);
        }
        return super.onMenuOpened(i, menu);
    }

    public boolean j() {
        return this.v;
    }

    public dhz m() {
        return (dhz) getIntent().getParcelableExtra("hangout_room_info");
    }

    private void q() {
        Intent c = gwb.c(fde.e(this.t.a()), this.u.u());
        this.u.q();
        startActivity(c);
        finish();
    }

    public void onBackPressed() {
        if (!this.u.q()) {
            if (fk.a((Activity) this, gwb.c(fde.e(this.t.a()), this.u.u()))) {
                finish();
            } else {
                q();
            }
        }
    }

    public void n() {
        b(true);
    }

    public void b(boolean z) {
        if (!this.w) {
            this.w = true;
            if (z) {
                Intent intent = null;
                if ((getIntent().getIntExtra("hangout_pstn_call", 2) & 1) != 0) {
                    intent = gwb.g(fde.e(this.t.a()));
                }
                if (intent != null) {
                    startActivity(intent);
                }
            }
            finish();
        }
    }

    public void overridePendingTransition(int i, int i2) {
        super.overridePendingTransition(i, i2);
    }

    public HangoutFragment o() {
        return this.u;
    }

    public void p() {
        this.u.t().s();
        n();
    }
}
