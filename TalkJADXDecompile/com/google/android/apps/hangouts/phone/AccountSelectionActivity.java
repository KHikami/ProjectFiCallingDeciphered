package com.google.android.apps.hangouts.phone;

import android.content.Intent;
import android.os.Bundle;
import bc;
import eir;
import jcb;
import jcc;
import jmd;
import jmj;
import jmu;
import jna;
import jnb;
import jzc;

public class AccountSelectionActivity extends jzc implements jcc {
    private jmj n;

    public AccountSelectionActivity() {
        this.n = new jmj(this, this.F).a(this.E).b((jcc) this);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean booleanExtra = getIntent().getBooleanExtra("sms_accts_only", false);
        jmu jmu = new jmu();
        if (booleanExtra) {
            jmu.a(jna.class, new jnb().a(getString(bc.cO)).a(false).a(new eir()).a());
        } else {
            jmu.a(jna.class, new jnb().a(getString(bc.cO)).a(false).a(new jmd().b("sms_only")).a());
        }
        this.n.a(jmu);
    }

    public void a(boolean z, jcb jcb, jcb jcb2, int i, int i2) {
        if (jcb2 == jcb.VALID) {
            Intent intent = (Intent) getIntent().getParcelableExtra("intent");
            intent.putExtra("account_id", i2);
            startActivity(intent);
        }
        finish();
    }
}
