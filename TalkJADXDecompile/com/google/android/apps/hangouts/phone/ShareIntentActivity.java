package com.google.android.apps.hangouts.phone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import ba;
import bbm;
import bc;
import bcj;
import bko;
import bm;
import bxt;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;
import dr;
import eoy;
import eoz;
import epa;
import epb;
import ew;
import fde;
import fdq;
import fwn;
import fwo;
import fzw;
import glk;
import gwb;
import jcb;
import jcc;
import jmj;
import jmu;
import jna;
import jnb;
import jxy;
import jzp;

public class ShareIntentActivity extends jzp implements jcc {
    public bko n;
    private ConversationListFragment o;
    private boolean r;
    private boolean s;
    private jmj t;

    public ShareIntentActivity() {
        this.t = new jmj(this, this.q).a(this.p).b((jcc) this);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            glk.d("Babel", "Sharing detail is not attached", new Object[0]);
            finish();
            return;
        }
        if (intent.getBooleanExtra("sms_convs_only", false)) {
            this.r = true;
        }
        this.s = ba.d(getIntent().getType());
        if (this.r && !fde.i() && fde.j() == null) {
            a(getString(bc.tF));
            return;
        }
        setContentView(gwb.ht);
        jnb jnb = new jnb();
        jnb.b(false);
        if (this.r) {
            jnb.a(((bbm) this.p.a(bbm.class)).a());
        }
        if (this.s) {
            jnb.a(false);
            jnb.a(new epb());
        }
        this.t.a(new jmu().a(jna.class, jnb.a()));
        fwn fwn = (fwn) this.p.a(fwn.class);
        if (fwn.a(intent)) {
            fwn.a();
        }
    }

    protected void a(Bundle bundle) {
        super.a(bundle);
        this.p.a(fwo.class, new eoy(this));
    }

    private void a(String str) {
        jxy a = jxy.a(getString(bc.tG), str, getString(bc.tH), "", 0, 0, gwb.iE);
        a.a(new eoz(this));
        a.a(J_(), "");
    }

    public void a(dr drVar) {
        int i = 8;
        boolean z = false;
        super.a(drVar);
        if (drVar instanceof ConversationListFragment) {
            this.o = (ConversationListFragment) drVar;
            this.o.a(new epa(this));
            this.o.b(this.r);
            this.o.c(this.s);
            this.o.b(3);
            if (this.o != null) {
                ew a = J_().a();
                if (this.n != null) {
                    Button button = (Button) findViewById(ba.Q);
                    bbm bbm = (bbm) this.p.a(bbm.class);
                    int a2 = this.t.a();
                    int i2 = (!bbm.d(a2) || this.s) ? 8 : 0;
                    button.setVisibility(i2);
                    Button button2 = (Button) findViewById(ba.P);
                    if (!(((fzw) this.p.a(fzw.class)).a(a2) || this.r)) {
                        i = 0;
                    }
                    button2.setVisibility(i);
                    if (button.getVisibility() == 0 || button2.getVisibility() == 0) {
                        z = true;
                    }
                    bm.b(z, (Object) "At least one button must be made visible");
                    a.c(this.o);
                } else {
                    a.b(this.o);
                }
                a.a();
            }
        }
    }

    public void a(boolean z, jcb jcb, jcb jcb2, int i, int i2) {
        if (jcb2 == jcb.VALID) {
            this.n = fde.e(i2);
            ew a = J_().a();
            this.o = new ConversationListFragment();
            a.a(ba.ap, this.o, ConversationListFragment.class.getName());
            a.a();
        } else if (this.s) {
            a(getString(bc.tZ));
        } else {
            finish();
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0 || i == 1) {
            finish();
        }
    }

    public void onStartNewHangoutButtonClick(View view) {
        a(bxt.HANGOUTS_MESSAGE);
    }

    public void onStartNewSmsButtonClick(View view) {
        a(bxt.SMS_MESSAGE);
    }

    private void a(bxt bxt) {
        bcj bcj = bcj.CREATE_NEW_GROUP_CONVERSATION;
        if (fdq.j.b(this.t.a())) {
            bcj = bcj.CREATE_NEW_ONE_ON_ONE;
        }
        Intent a = gwb.a(this.n, null, null, bcj, bxt);
        a.putExtra("share_intent", getIntent());
        a.addFlags(1);
        startActivityForResult(a, 1);
        overridePendingTransition(gwb.cU, gwb.cV);
    }
}
