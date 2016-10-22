package com.google.android.apps.hangouts.quickreply.impl;

import android.content.Intent;
import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import bhl;
import blo;
import cnt;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import fcc;
import fcd;
import fce;
import fcf;
import fcg;
import fde;
import gwb;
import hg;
import iih;
import jca;
import jcu;
import jzc;

public class QuickReplyActivity extends jzc {
    private cnt A;
    public bhl n;
    public boolean o;
    public View p;
    public ImageButton q;
    public int r;
    public String s;
    public boolean t;
    public int u;
    public int v;
    public int w;
    private final jca x;
    private iih y;
    private boolean z;

    public QuickReplyActivity() {
        this.x = new jcu(this, this.F).a(this.E);
    }

    protected void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.r = this.x.a();
        this.s = intent.getStringExtra("conversation_id");
        this.u = intent.getIntExtra("transport_type", 1);
        this.v = intent.getIntExtra("conversation_type", 0);
        this.w = intent.getIntExtra("opened_from_impression", 0);
        this.z = intent.getBooleanExtra("is_group", false);
        String stringExtra = intent.getStringExtra("conversation_name");
        String stringExtra2 = intent.getStringExtra("send_from_name");
        if (bundle == null) {
            this.y.a(this.r).b().c(2855);
        }
        RealTimeChatService.b(fde.e(this.r), this.s, 0);
        if (!(TextUtils.isEmpty(this.s) || blo.a(this.s))) {
            this.A.a(this.r, this.s, true);
        }
        Bundle a = hg.a(getIntent());
        if (a != null) {
            CharSequence charSequence = a.getCharSequence("android.intent.extra.TEXT");
            if (!TextUtils.isEmpty(charSequence)) {
                a(charSequence.toString());
                z = true;
                if (z) {
                    setContentView(gwb.uq);
                    ((ImageButton) findViewById(gwb.ui)).setOnClickListener(new fcc(this));
                    findViewById(gwb.uj).setOnClickListener(new fcd(this));
                    ((TextView) findViewById(gwb.un)).setText(getResources().getString(gwb.ut, new Object[]{stringExtra}));
                    ((TextView) findViewById(gwb.um)).setText(getResources().getString(gwb.us, new Object[]{stringExtra2}));
                    EditText editText = (EditText) findViewById(gwb.uk);
                    editText.getBackground().setColorFilter(getResources().getColor(17170443), Mode.SRC_IN);
                    editText.addTextChangedListener(new fce(this, editText));
                    this.q = (ImageButton) findViewById(gwb.uo);
                    this.p = findViewById(gwb.up);
                    this.p.setOnClickListener(new fcf(this, editText));
                    this.p.setClickable(false);
                    findViewById(gwb.ul).setOnClickListener(new fcg(this, editText));
                    j();
                    return;
                }
                finish();
            }
        }
        z = false;
        if (z) {
            setContentView(gwb.uq);
            ((ImageButton) findViewById(gwb.ui)).setOnClickListener(new fcc(this));
            findViewById(gwb.uj).setOnClickListener(new fcd(this));
            ((TextView) findViewById(gwb.un)).setText(getResources().getString(gwb.ut, new Object[]{stringExtra}));
            ((TextView) findViewById(gwb.um)).setText(getResources().getString(gwb.us, new Object[]{stringExtra2}));
            EditText editText2 = (EditText) findViewById(gwb.uk);
            editText2.getBackground().setColorFilter(getResources().getColor(17170443), Mode.SRC_IN);
            editText2.addTextChangedListener(new fce(this, editText2));
            this.q = (ImageButton) findViewById(gwb.uo);
            this.p = findViewById(gwb.up);
            this.p.setOnClickListener(new fcf(this, editText2));
            this.p.setClickable(false);
            findViewById(gwb.ul).setOnClickListener(new fcg(this, editText2));
            j();
            return;
        }
        finish();
    }

    public void a(String str) {
        String str2 = str;
        this.A.a(this.r, this.s, str2, null, this.z, blo.a(this.r, 4));
        this.y.a(this.r).b().c(2856);
    }

    protected void a(Bundle bundle) {
        super.a(bundle);
        this.n = (bhl) this.E.a(bhl.class);
        this.y = (iih) this.E.a(iih.class);
        this.A = (cnt) this.E.a(cnt.class);
    }

    public void j() {
        this.q.setBackgroundDrawable(getResources().getDrawable(gwb.uh));
        this.q.setColorFilter(getResources().getColor(gwb.ue), Mode.SRC_IN);
    }
}
