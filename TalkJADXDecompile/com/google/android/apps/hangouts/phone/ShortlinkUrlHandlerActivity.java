package com.google.android.apps.hangouts.phone;

import android.app.AlertDialog.Builder;
import android.os.Bundle;
import bc;
import bko;
import dib;
import epd;
import epe;
import fde;
import glj;
import gwb;
import java.util.List;
import jcb;
import jcc;
import jmd;
import jmj;
import jmu;
import jna;
import jnb;
import jzp;

public class ShortlinkUrlHandlerActivity extends jzp implements jcc {
    private jmj n;

    public ShortlinkUrlHandlerActivity() {
        this.n = new jmj(this, this.q).a("active-hangouts-account").a(this.p).b((jcc) this);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent() == null || getIntent().getData() == null) {
            g();
            return;
        }
        String a;
        List pathSegments = getIntent().getData().getPathSegments();
        bko a2;
        if (pathSegments.size() == 2) {
            a2 = a(null);
            if (a2 != null) {
                a = a2.a();
            } else {
                g();
                return;
            }
        } else if (pathSegments.size() == 3) {
            a2 = a((String) pathSegments.get(1));
            if (a2 != null) {
                a = a2.a();
            } else {
                a = null;
            }
        } else {
            g();
            return;
        }
        this.n.a(new jmu().b().a(a).a(jna.class, new jnb().a(new jmd().a("logged_in").b("sms_only")).a()));
    }

    public void a(boolean z, jcb jcb, jcb jcb2, int i, int i2) {
        if (jcb2 == jcb.VALID) {
            bko e = fde.e(i2);
            List pathSegments = getIntent().getData().getPathSegments();
            if (pathSegments.size() == 2) {
                a(e.a(), e.i(), (String) pathSegments.get(1));
                return;
            } else if (pathSegments.size() == 3) {
                a(e.a(), (String) pathSegments.get(1), (String) pathSegments.get(2));
                return;
            } else {
                return;
            }
        }
        finish();
    }

    private static bko a(String str) {
        for (int e : fde.d()) {
            bko e2 = fde.e(e);
            if (e2.i() != null && (str == null || str.equals(e2.i()))) {
                return e2;
            }
        }
        return null;
    }

    private void a(String str, String str2, String str3) {
        startActivity(gwb.a(new dib(str, 1).d(str2).e(str3).a(), null, false, 48, glj.b()));
        finish();
    }

    private void g() {
        Builder builder = new Builder(this);
        builder.setMessage(bc.en);
        builder.setPositiveButton(bc.hR, new epd(this));
        builder.setOnCancelListener(new epe(this));
        builder.show();
    }
}
