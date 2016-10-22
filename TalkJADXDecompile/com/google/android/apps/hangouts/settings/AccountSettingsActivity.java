package com.google.android.apps.hangouts.settings;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import ftm;
import gwb;
import jca;
import jch;
import jcu;
import jyj;
import jzc;
import tp;
import uq;

public class AccountSettingsActivity extends jzc {
    public jca n;

    public AccountSettingsActivity() {
        this.n = new jcu(this, this.F).a(this.E).a(false);
        jyj jyj = new jyj((uq) this, this.F);
        ftm ftm = new ftm(this, this, this.F);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(gwb.gm);
        jch c = this.n.c();
        tp g = g();
        CharSequence b = c.b("display_name");
        CharSequence b2 = c.b("account_name");
        c.c("is_plus_page");
        if (g == null) {
            if (TextUtils.isEmpty(b)) {
                b = b2;
            }
            setTitle(b);
        } else if (TextUtils.isEmpty(b)) {
            g.a(b2);
        } else {
            g.a(b);
            b = SpannableStringBuilder.valueOf(b2);
            b.setSpan(new ForegroundColorSpan(getResources().getColor(gwb.ec)), 0, b2.length(), 33);
            g.b(b);
        }
    }
}
