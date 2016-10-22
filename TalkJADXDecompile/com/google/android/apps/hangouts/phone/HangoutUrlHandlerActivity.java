package com.google.android.apps.hangouts.phone;

import android.app.AlertDialog.Builder;
import android.os.Bundle;
import bc;
import dhz;
import eob;
import eoc;
import fde;
import glj;
import gwb;
import jcb;
import jcc;
import jmb;
import jmd;
import jmj;
import jmu;
import jna;
import jnb;
import jzp;

public class HangoutUrlHandlerActivity extends jzp implements jcc {
    private jmj n;

    public HangoutUrlHandlerActivity() {
        this.n = new jmj(this, this.q).a("active-hangouts-account").a(this.p).b((jcc) this);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        jmb b = new jmd().b("sms_only");
        if (fde.g().length > 0) {
            b.a("logged_in");
        }
        this.n.a(new jmu().b().a(jna.class, new jnb().a(true).a(b).a()));
    }

    public void a(boolean z, jcb jcb, jcb jcb2, int i, int i2) {
        if (jcb2 == jcb.VALID) {
            dhz a = dhz.a(getIntent().getData(), this.n.c().b("account_name"), null);
            if (a == null) {
                Builder builder = new Builder(this);
                builder.setMessage(bc.en);
                builder.setPositiveButton(bc.hR, new eob(this));
                builder.setOnCancelListener(new eoc(this));
                builder.show();
                return;
            }
            startActivity(gwb.a(a, null, false, 51, glj.b()));
            finish();
            return;
        }
        finish();
    }
}
