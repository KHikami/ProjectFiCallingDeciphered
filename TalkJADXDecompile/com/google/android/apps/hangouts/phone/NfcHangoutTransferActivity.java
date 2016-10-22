package com.google.android.apps.hangouts.phone;

import android.os.Bundle;
import dhz;
import giv;
import glj;
import gwb;
import jcb;
import jcc;
import jmj;
import jmu;
import jna;
import jzp;

public class NfcHangoutTransferActivity extends jzp implements jcc {
    private dhz n;
    private jmj o;

    public NfcHangoutTransferActivity() {
        this.o = new jmj(this, this.q).a("active-hangouts-account").a(this.p).b((jcc) this);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (giv.d() && gwb.j(getIntent())) {
            this.n = gwb.i(getIntent());
            this.o.a(new jmu().b().a(this.n.a()).a(jna.class));
            return;
        }
        finish();
    }

    public void a(boolean z, jcb jcb, jcb jcb2, int i, int i2) {
        if (jcb2 == jcb.VALID) {
            this.n = this.n.c(this.o.c().b("account_name"));
            startActivity(gwb.a(this.n, null, false, 51, glj.b()));
        }
        finish();
    }
}
