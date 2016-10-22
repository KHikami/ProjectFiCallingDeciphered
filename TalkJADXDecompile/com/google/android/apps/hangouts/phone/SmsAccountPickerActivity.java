package com.google.android.apps.hangouts.phone;

import android.os.Bundle;
import bc;
import epg;
import fde;
import jcb;
import jcc;
import jmj;
import jmu;
import jna;
import jnb;
import jzp;

public class SmsAccountPickerActivity extends jzp implements jcc {
    private jmj n;

    public SmsAccountPickerActivity() {
        this.n = new jmj(this, this.q).a(this.p).b((jcc) this);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.n.a(new jmu().a(false).a(jna.class, new jnb().a(new epg()).a(getString(bc.km)).a()));
    }

    public void a(boolean z, jcb jcb, jcb jcb2, int i, int i2) {
        if (jcb2 == jcb.VALID) {
            fde.b(fde.e(i2));
        }
        finish();
    }
}
