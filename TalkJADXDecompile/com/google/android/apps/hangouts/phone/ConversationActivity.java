package com.google.android.apps.hangouts.phone;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.widget.TextView;
import ba;
import bc;
import bcc;
import bhl;
import bko;
import com.google.android.apps.hangouts.views.HangoutsToolbar;
import cqo;
import cxg;
import daq;
import das;
import dat;
import dbp;
import dcl;
import dr;
import dza;
import ed;
import ekb;
import fde;
import fkc;
import gld;
import glj;
import glk;
import gma;
import gpc;
import gwb;
import iih;
import jca;
import jcu;
import jyn;
import kae;
import mcq;

public class ConversationActivity extends dcl implements das, fkc {
    private static final boolean s;
    private static final gma t;
    public daq r;
    private bko u;
    private ThreadPolicy v;
    private final jca w;

    public ConversationActivity() {
        this.w = new jcu(this, this.F).a(this.E);
        dza dza = new dza(this, this.F);
    }

    static {
        kae kae = glk.f;
        s = false;
        t = gma.a("Conv_Activity");
    }

    public void onCreate(Bundle bundle) {
        Intent intent;
        String b = t.b("onCreate");
        setTheme(gwb.iC);
        super.onCreate(bundle);
        boolean a = gwb.a((Context) this, "babel_conversation_activity_disable_strict_mode", false);
        if (Build.TYPE.equals("eng") || Build.TYPE.equals("userdebug") || a) {
            this.v = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new Builder().build());
        }
        setContentView(c(gwb.fS));
        HangoutsToolbar hangoutsToolbar = (HangoutsToolbar) this.q;
        hangoutsToolbar.x().setPadding(0, 0, 0, 0);
        TextView y = hangoutsToolbar.y();
        y.setEllipsize(TruncateAt.MARQUEE);
        y.setHorizontalFadingEdgeEnabled(true);
        y.setPadding(0, 0, 0, 0);
        y.setSelected(true);
        Intent intent2 = getIntent();
        this.u = fde.e(this.w.a());
        if (bundle == null) {
            if (intent2.hasExtra("direct_share_guid")) {
                intent = new Intent(this, ConversationActivity.class);
                intent.putExtras(intent2.getExtras());
                intent.putExtra("share_intent", intent2);
                intent.addFlags(1);
                setIntent(intent);
                mcq mcq = new mcq();
                mcq.a = intent.getStringExtra("direct_share_guid");
                mcq.c = Integer.valueOf(intent.getIntExtra("direct_share_target_index", -1));
                ((iih) this.E.a(iih.class)).a(this.w.a()).b().a(mcq).c(3059);
                intent.putExtra("opened_from_impression", 3057);
            } else {
                if (intent2.hasExtra("share_intent")) {
                    intent2.putExtra("opened_from_impression", 2405);
                }
                intent = intent2;
            }
            if (intent.hasExtra("share_intent") && ((cxg) this.E.a(cxg.class)).a("directshare")) {
                String string = intent.getExtras().getString("conversation_id");
                if (string != null) {
                    ((bhl) this.E.a(bhl.class)).a(new cqo(string, this.w.a(), glj.a()));
                }
            }
            gwb.c(intent);
        } else {
            intent = intent2;
        }
        Parcelable c = c(intent);
        ed J_ = J_();
        this.r = (daq) J_.a(daq.class.getName());
        if (this.r == null) {
            String b2 = t.b("instantiate_convfrag_obj");
            this.r = ((dat) jyn.a((Context) this, dat.class)).a();
            t.c(b2);
            J_.a().a(ba.an, this.r, daq.class.getName()).a();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("conversation_parameters", c);
            this.r.setArguments(bundle2);
        }
        this.r.a((das) this);
        t.c(b);
    }

    public void a(dr drVar) {
        if (drVar instanceof dbp) {
            ((dbp) drVar).a(new ekb(this));
        }
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        a(c(intent));
    }

    public void a(bcc bcc) {
        if (glk.a("Babel", 3)) {
            String str = "Babel";
            String str2 = "Restart fragment for new conv id: ";
            String valueOf = String.valueOf(bcc.a);
            glk.b(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        }
        this.r = ((dat) jyn.a((Context) this, dat.class)).a();
        this.r.a((das) this);
        Bundle bundle = new Bundle();
        bundle.putParcelable("conversation_parameters", bcc);
        this.r.setArguments(bundle);
        J_().a().b(ba.an, this.r, daq.class.getName()).a();
    }

    private static bcc c(Intent intent) {
        bcc bcc = (bcc) intent.getParcelableExtra("conversation_parameters");
        if (bcc == null) {
            return new bcc(intent.getStringExtra("conversation_id"), intent.getIntExtra("client_conversation_type", 0));
        }
        return bcc;
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.v != null) {
            StrictMode.setThreadPolicy(this.v);
        }
    }

    public void a(String str, Runnable runnable) {
        String str2 = "Babel_Conv";
        String str3 = "Closing conversation for ";
        String valueOf = String.valueOf(str);
        glk.c(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Throwable());
        finish();
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a(String str) {
        a(str, null);
    }

    public void a(gpc gpc, String str, String str2) {
        gwb.a((Activity) this, this.u, (View) gpc, str, str2);
    }

    public void a(String str, String str2) {
        HangoutsToolbar hangoutsToolbar = (HangoutsToolbar) this.q;
        hangoutsToolbar.c(str);
        hangoutsToolbar.e(str2);
    }

    public void b(String str) {
        setTitle(getString(bc.aw, new Object[]{str}));
        g().a(gld.d(str));
    }

    public void b_(boolean z) {
        this.q.setVisibility(z ? 0 : 8);
    }
}
