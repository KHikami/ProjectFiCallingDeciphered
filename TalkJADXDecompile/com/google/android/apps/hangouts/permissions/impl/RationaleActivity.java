package com.google.android.apps.hangouts.permissions.impl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.widget.Button;
import ehz;
import eia;
import eib;
import ein;
import eio;
import gwb;
import jzp;

public class RationaleActivity extends jzp {
    public ehz n;
    public eia o;
    private final OnClickListener r;
    private final eib s;

    public RationaleActivity() {
        this.r = new ein(this);
        this.s = new eio(this);
    }

    protected void a(Bundle bundle) {
        super.a(bundle);
        this.n = (ehz) this.p.a(ehz.class);
        this.o = (eia) this.p.a(eia.class);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(gwb.ts);
        ViewStub viewStub = (ViewStub) findViewById(gwb.tq);
        Intent intent = getIntent();
        viewStub.setBackgroundColor(intent.getIntExtra("background_color_res", 0));
        viewStub.setLayoutResource(intent.getIntExtra("layout_res", 0));
        viewStub.inflate();
        c(gwb.tr);
        c(gwb.tn);
        this.o.a(gwb.to, this.s);
    }

    private void c(int i) {
        Button button = (Button) findViewById(i);
        button.setAllCaps(true);
        button.setOnClickListener(this.r);
    }
}
