package com.google.android.apps.hangouts.phone;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.AsyncTask.Status;
import android.os.Bundle;
import android.os.Parcelable;
import android.preference.PreferenceManager;
import android.support.v4.widget.DrawerLayout;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Toast;
import ba;
import bbm;
import bc;
import bcc;
import bcj;
import bcn;
import bct;
import bcv;
import bgi;
import bhl;
import biw;
import bkm;
import bko;
import bkq;
import bow;
import box;
import boy;
import bpv;
import bpz;
import bxt;
import com.google.android.apps.hangouts.fragments.CallContactPickerFragment;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;
import com.google.android.apps.hangouts.navigation.NavigationDrawerFragment;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.service.broadcastreceiver.BootReceiver;
import com.google.android.apps.hangouts.util.TabHostEx;
import com.google.android.apps.hangouts.views.BalanceView;
import com.google.android.apps.hangouts.views.HangoutsToolbar;
import com.google.android.apps.hangouts.views.MainViewPager;
import com.google.android.gms.common.ConnectionResult;
import cpe;
import cxm;
import cxo;
import daa;
import dbj;
import dcl;
import dpq;
import dr;
import drc;
import dw;
import dyu;
import ecu;
import ed;
import edk;
import edo;
import ejd;
import eje;
import ejf;
import ejg;
import ejh;
import eji;
import ejj;
import ejk;
import ejl;
import ejm;
import ejn;
import ejo;
import ejp;
import ejq;
import ejr;
import ejs;
import elk;
import eon;
import epi;
import epj;
import erm;
import esd;
import etx;
import ew;
import fbw;
import fbx;
import fde;
import fdv;
import fdx;
import fei;
import fiy;
import fkc;
import fkq;
import fkt;
import flj;
import fls;
import fme;
import fmf;
import fvy;
import fyi;
import fzn;
import fzw;
import fzx;
import gae;
import gag;
import gah;
import gai;
import gao;
import gar;
import gib;
import gie;
import giv;
import gld;
import glj;
import glk;
import glq;
import gma;
import goy;
import guk;
import gul;
import gwb;
import iih;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import jcb;
import jcc;
import jcf;
import jio;
import jmj;
import jmu;
import jna;
import jnb;
import jyn;
import kae;
import pc;
import wi;

public class BabelHomeActivity extends dcl implements daa, dbj, dyu, fdx, fkc, guk, gul, jcc {
    public static LinkedList<ejr> A;
    private static final boolean B;
    private static final gma C;
    private ConversationListFragment D;
    private CallContactPickerFragment G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private BalanceView L;
    private DrawerLayout M;
    private NavigationDrawerFragment N;
    private eon O;
    private boolean P;
    private TabHostEx Q;
    private int R;
    private boolean S;
    private String T;
    private String U;
    private String V;
    private pc W;
    private Menu X;
    private fbx Y;
    private long Z;
    private long aa;
    private long ab;
    private long ac;
    private boolean ad;
    private jio ae;
    private bbm af;
    private gie ag;
    private epi ah;
    private final gao ai;
    private final ejs aj;
    public boolean r;
    public boolean s;
    public MainViewPager t;
    public cxm u;
    public erm v;
    public gag w;
    public iih x;
    public final jmj y;
    public final gai z;

    public BabelHomeActivity() {
        this.R = -1;
        this.Z = -1;
        this.ab = -1;
        this.ac = -1;
        this.y = new jmj(this, this.F).a("active-hangouts-account").a(this.E).b((jcc) this);
        this.z = new gai((Activity) this, this.F).b(this.E);
        this.ai = new gao(this);
        gar gar = new gar(this, this.F);
        esd esd = new esd(this.F);
        fzn fzn = new fzn(this.F, this);
        ecu ecu = new ecu(this.F);
        bgi bgi = new bgi(this.F);
        cpe cpe = new cpe(this.F);
        this.aj = new ejs(this);
    }

    static {
        kae kae = glk.k;
        B = false;
        C = gma.a("HomeActivity");
        A = new LinkedList();
    }

    protected void a(Bundle bundle) {
        super.a(bundle);
        ((dpq) this.E.a(dpq.class)).a(this.F);
        cxo cxo = (cxo) this.E.b(cxo.class);
        if (cxo != null) {
            this.u = cxo.a(this);
            this.E.a(cxm.class, this.u);
        }
        this.Y = (fbx) this.E.a(fbx.class);
        this.E.a(bpz.class, this.aj);
        this.ae = (jio) this.E.a(jio.class);
        this.af = (bbm) this.E.a(bbm.class);
        this.x = (iih) this.E.a(iih.class);
        this.ag = (gie) this.E.a(gie.class);
    }

    public void a(fdv fdv) {
        gwb.a(fdv, fde.e(this.y.a()), (dw) this, (fdx) this);
    }

    public int a() {
        return 1;
    }

    protected void onCreate(Bundle bundle) {
        try {
            this.ab = glj.b();
            setTheme(gwb.iD);
            C.b("onCreate");
            d("onCreate");
            if (B) {
                String valueOf = String.valueOf(bundle);
                new StringBuilder(String.valueOf(valueOf).length() + 30).append("onCreate  savedInstanceState: ").append(valueOf);
            }
            super.onCreate(bundle);
            Intent intent = getIntent();
            this.H = TextUtils.equals(intent.getAction(), "android.intent.action.MAIN");
            giv.a("BabelHomeActivity.onCreate", intent);
            if (!isTaskRoot()) {
                glk.d("Babel_HomeActivity", "BabelHomeActivity was not the root task in onCreate", new Object[0]);
                if (intent.hasCategory("android.intent.category.LAUNCHER") && this.H) {
                    glk.d("Babel_HomeActivity", "Finishing instead of re-launching from the launcher", new Object[0]);
                    finish();
                    new ejl(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                    d("/onCreate");
                    C.c("onCreate");
                    return;
                }
            }
            if (bundle == null) {
                if (!TextUtils.equals(intent.getAction(), "com.google.android.apps.hangouts.phone.conversationlist") && e(intent) && intent.getBooleanExtra("use_dialer_activity", true)) {
                    startActivity(gwb.f(intent));
                    finish();
                    new ejl(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                    d("/onCreate");
                    C.c("onCreate");
                    return;
                }
            }
            this.P = this.E.b("show_dialer_in_tab", true);
            if (!giv.c() && this.P) {
                setRequestedOrientation(1);
            }
            BootReceiver.a(this);
            new ejj(this).execute(new Void[0]);
            if (bundle == null) {
                m();
            } else {
                this.J = bundle.getBoolean("handled_intent_for_action");
                this.K = bundle.getBoolean("is_logging_in");
                this.s = bundle.getBoolean("pending_login_from_intent");
            }
            int i = this.P ? gwb.fK : gwb.fL;
            C.b("setContentView");
            setContentView(i);
            C.c("setContentView");
            if (this.P) {
                this.t = (MainViewPager) findViewById(ba.gj);
                this.t.b((pc) new ejk(this));
                this.t.b(true);
                this.Q = (TabHostEx) findViewById(16908306);
                this.Q.a(this.t);
                this.Q.setup();
            } else {
                ed J_ = J_();
                this.D = (ConversationListFragment) J_.a("conv_list");
                if (this.D != null) {
                    this.D.a((dbj) this);
                }
                this.G = (CallContactPickerFragment) J_.a("dialer");
                if (this.G != null) {
                    this.G.a((daa) this);
                }
            }
            if (bundle == null) {
                if (TextUtils.equals(intent.getAction(), "com.google.android.apps.hangouts.phone.conversationlist")) {
                    this.T = MainViewPager.d.d;
                    gwb.c(intent);
                } else if (e(intent)) {
                    this.T = MainViewPager.e.d;
                }
            }
            glk.c("Babel_HomeActivity", "[BabelHomeActivity.onCreate] setContentView called", new Object[0]);
            this.M = (DrawerLayout) findViewById(ba.aN);
            this.N = (NavigationDrawerFragment) J_().a(ba.dA);
            this.M.e(getResources().getColor(gwb.dV));
            this.O = new eon(this, this.F);
            if (bundle == null && intent.hasCategory("android.intent.category.LAUNCHER") && this.H) {
                this.ad = true;
            }
            new ejl(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            d("/onCreate");
            C.c("onCreate");
        } catch (Throwable th) {
            new ejl(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            d("/onCreate");
            C.c("onCreate");
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("handled_intent_for_action", this.J);
        bundle.putBoolean("is_logging_in", this.K);
        bundle.putBoolean("pending_login_from_intent", this.s);
        this.I = true;
    }

    protected void onStart() {
        String str;
        String str2;
        String valueOf;
        C.b("onStart");
        d("onStart");
        super.onStart();
        if (this.y.d()) {
            if (!(this.t == null || this.t.j())) {
                p();
            }
            z();
            if (this.u != null) {
                this.u.a(o());
            }
        }
        Object c = bkq.c(this);
        if (!TextUtils.isEmpty(c)) {
            bkq.b((Context) this, "");
            try {
                startActivity(Intent.parseUri(c, 1));
                this.x.a(this.y.a()).b().c(1869);
            } catch (URISyntaxException e) {
                str = "Babel_HomeActivity";
                str2 = "Failed to parse refererr url: ";
                valueOf = String.valueOf(c);
                glk.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
            } catch (ActivityNotFoundException e2) {
                str = "Babel_HomeActivity";
                str2 = "Failed to find activity for refererr url: ";
                valueOf = String.valueOf(c);
                glk.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
            }
        }
        this.z.a(this.ai);
        d("/onStart");
        C.c("onStart");
    }

    public void m() {
        if (this.K) {
            this.s = true;
            return;
        }
        this.s = false;
        Intent intent = getIntent();
        if (!d(intent) || intent.hasExtra("account_id")) {
            a(new jmu().a().c().a(jna.class, new jnb().b(false).a()));
        } else if (fde.i()) {
            a(new jmu().a(fde.k().g()).b());
        } else if (jyn.b((Context) this, gae.class) != null) {
            jyn.b((Context) this, gae.class);
            finish();
        } else {
            Toast.makeText(this, bc.ks, 0).show();
            finish();
        }
    }

    private void v() {
        if (!this.J) {
            this.J = true;
            Intent intent = getIntent();
            if (d(intent)) {
                c(intent);
                return;
            }
            CharSequence action = intent.getAction();
            this.H = TextUtils.equals(action, "android.intent.action.MAIN");
            String stringExtra = intent.getStringExtra("conversation_id");
            this.V = null;
            this.U = null;
            if (!TextUtils.isEmpty(stringExtra)) {
                int intExtra = intent.getIntExtra("client_conversation_type", 0);
                edo a = gwb.a(intent.getExtras());
                if (a != null) {
                    a(a, stringExtra, intExtra, intent.getLongExtra("invite_timestamp", 0));
                    return;
                }
                bkm c;
                if (this.D != null) {
                    c = this.D.c(stringExtra);
                } else {
                    c = null;
                }
                bcc bcc = new bcc(stringExtra, intExtra);
                bcc.d = true;
                bcc.f = c;
                bcc.k = intent.getIntExtra("opened_from_impression", 0);
                a(bcc, null, intent.getIntExtra("account_id", this.y.a()));
            } else if (TextUtils.equals(action, "android.intent.action.INSERT")) {
                a(intent);
            } else if (e(intent)) {
                if (intent.getBooleanExtra("use_dialer_activity", true)) {
                    startActivity(gwb.f(intent));
                    finish();
                    return;
                }
                this.U = intent.getAction();
                if (TextUtils.equals(this.U, "com.google.android.apps.hangouts.phone.dialpad")) {
                    this.V = intent.getStringExtra("number_to_call");
                }
                if (!fde.q()) {
                    glk.d("Babel_HomeActivity", "[BabelHomeActivity.onNewIntent] Adding account from dialer intent.", new Object[0]);
                    t();
                }
                u();
            } else if (TextUtils.equals(action, "com.google.android.apps.hangouts.invites.grouplinksharing.open")) {
                drc drc = (drc) this.E.a(drc.class);
                if (drc != null) {
                    int a2 = this.y.a();
                    Object ejq = new ejq(this, this, J_(), box.JOIN_CONVERSATION_BY_LINK);
                    this.ag.a(bow.class, ejq, new gib("account_id", Integer.valueOf(a2)).a("type_of_change", box.JOIN_CONVERSATION_BY_LINK));
                    ejq.a(getResources().getString(bc.am), "", "arg_task_tag", true);
                    drc.b(this.y.a(), intent.getStringExtra("group_conversation_link"));
                }
            }
        }
    }

    protected void onDestroy() {
        d("onDestroy");
        super.onDestroy();
        if (!(this.u == null || ((ViewGroup) findViewById(ba.de)) == null)) {
            this.u.a();
        }
        d("/onDestroy");
    }

    protected void onStop() {
        d("onStop");
        super.onStop();
        this.z.b(this.ai);
        d("/onStop");
    }

    public void onResume() {
        C.b("onResume");
        d("onResume");
        try {
            super.onResume();
            this.r = true;
            int a = this.y.a();
            if (B) {
                new StringBuilder(29).append("onResume account: ").append(a);
            }
            if (fde.e(a) != null) {
                x();
                b(false);
            }
            this.I = false;
            if (this.t != null) {
                p();
            }
            y();
            d("/onResume");
            if (this.ac < 0) {
                this.ac = glj.b();
            }
            w();
            ((bct) this.E.a(bct.class)).a();
            C.c("onResume");
        } catch (Throwable th) {
            Throwable th2 = th;
            d("/onResume");
            if (this.ac < 0) {
                this.ac = glj.b();
            }
            w();
            ((bct) this.E.a(bct.class)).a();
            C.c("onResume");
        }
    }

    private void w() {
        if (this.ad && this.ac > 0) {
            String b = C.b("reportStartup");
            this.ad = false;
            ((bcv) this.E.a(bcv.class)).a(this.ab, this.ac, this.y.a());
            gwb.a(new epj(getApplicationContext()), 1000);
            C.c(b);
        }
    }

    private void x() {
        if (this.y.b() && !((fzw) this.E.a(fzw.class)).a(this.y.a())) {
            s();
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            boolean z = activeNetworkInfo != null && activeNetworkInfo.isConnected();
            if (z) {
                long a = gwb.a((Context) this, "babel_request_voice_account_data_delay_ms", 30000);
                long a2 = glj.a();
                if (a + this.aa <= a2) {
                    this.aa = a2;
                    gwb.a(this.y.a(), (dw) this, false, new ejm(this));
                }
            }
        }
    }

    public void onPause() {
        d("onPause");
        this.r = false;
        super.onPause();
        d("/onPause");
    }

    protected void onNewIntent(Intent intent) {
        d("onNewIntent");
        try {
            super.onNewIntent(intent);
            if (!TextUtils.equals(intent.getAction(), "android.intent.action.MAIN")) {
                String valueOf = String.valueOf(intent);
                glk.c("Babel_HomeActivity", new StringBuilder(String.valueOf(valueOf).length() + 13).append("onNewIntent: ").append(valueOf).toString(), new Object[0]);
                giv.a("BabelHomeActivity.onNewIntent", intent);
                this.J = false;
                if (TextUtils.equals(intent.getAction(), "com.google.android.apps.hangouts.phone.conversationlist")) {
                    this.T = MainViewPager.d.d;
                } else if (e(intent)) {
                    this.T = MainViewPager.e.d;
                }
                m();
                d("/onNewIntent");
            }
        } finally {
            d("/onNewIntent");
        }
    }

    public String C_() {
        return this.U;
    }

    public void c() {
        this.U = null;
    }

    public String d() {
        return this.V;
    }

    public void e() {
        this.V = null;
    }

    public void D_() {
        A();
    }

    public void E_() {
        B();
    }

    public boolean h() {
        if (this.P) {
            if (this.t == null || this.t.i() != MainViewPager.e) {
                return false;
            }
            return true;
        } else if (this.G == null) {
            return false;
        } else {
            return true;
        }
    }

    private static boolean d(Intent intent) {
        if (intent == null) {
            return false;
        }
        if ("android.intent.action.RESPOND_VIA_MESSAGE".equals(intent.getAction())) {
            return true;
        }
        Uri data = intent.getData();
        if (data == null) {
            return false;
        }
        String uri = data.toString();
        if (uri == null) {
            return false;
        }
        if (uri.startsWith("sms:") || uri.startsWith("smsto:") || uri.startsWith("mms:") || uri.startsWith("mmsto:")) {
            return true;
        }
        return false;
    }

    public void c(Intent intent) {
        bkm bkm = new bkm(intent.getStringExtra("sms_body"));
        String b = fyi.b(intent.getData());
        int a = this.y.a();
        bko e = fde.e(a);
        if (TextUtils.isEmpty(b)) {
            Intent a2 = gwb.a(e, null, null, bcj.CREATE_NEW_ONE_ON_ONE, bxt.SMS_MESSAGE);
            Parcelable intent2 = new Intent();
            intent2.setType("text/plain");
            intent2.putExtra("android.intent.extra.TEXT", bkm.a);
            a2.putExtra("share_intent", intent2);
            startActivity(a2);
            overridePendingTransition(gwb.cU, gwb.cV);
            finish();
            return;
        }
        Collection hashSet = new HashSet();
        Collection hashSet2 = new HashSet();
        for (String a3 : b.split(";")) {
            edk a4 = gwb.a(getApplicationContext(), a3, null, null);
            hashSet.add(a4);
            hashSet2.add(bcn.a(fbw.a(a4.b, a4.c, a4.g), a4.e, a4.h));
        }
        int G = e.G();
        int intExtra = intent.getIntExtra("transport_type", G);
        if (((fzw) this.E.a(fzw.class)).d(a) == fzx.c) {
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                if (glq.d((Context) this, ((bcn) it.next()).b().d)) {
                    intExtra = 3;
                    break;
                }
            }
        }
        if (intExtra == 0) {
            glk.c("Babel_HomeActivity", "SMS transport type selector needed.", new Object[0]);
            this.aj.a = intent;
            ((bpv) this.E.a(bpv.class)).a((Context) this, this.F, J_()).a(bxt.SMS_MESSAGE, hashSet2);
            return;
        }
        glk.c("Babel_HomeActivity", "TransportType:" + G, new Object[0]);
        fme a5 = ((fmf) this.E.a(fmf.class)).a();
        RealTimeChatService.a(a5, new fei(getApplicationContext()).a(a).a(gwb.b(hashSet)).a(boy.LOCAL_AND_SERVER).b(intExtra).a());
        RealTimeChatService.a(new ejn(this, a5, b, bkm, intent.getIntExtra("opened_from_impression", 0), a));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(gwb.hN, menu);
        this.X = menu;
        if (this.y.d()) {
            z();
        }
        return super.onCreateOptionsMenu(menu);
    }

    public goy n() {
        if (this.P) {
            return this.t.i();
        }
        if (this.G == null) {
            return MainViewPager.d;
        }
        return MainViewPager.e;
    }

    public int o() {
        if (this.P) {
            return this.t.c();
        }
        if (this.G == null) {
            return 0;
        }
        return 1;
    }

    private void y() {
        if (this.X != null) {
            MenuItem findItem = this.X.findItem(ba.eD);
            if (findItem != null) {
                findItem.setVisible(n() == MainViewPager.d);
            }
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        if (C()) {
            menu.clear();
            return false;
        }
        y();
        if (n() == MainViewPager.e) {
            x();
        } else if (this.L != null) {
            this.L.a(false);
        }
        MenuItem findItem = menu.findItem(ba.aA);
        if (findItem != null) {
            boolean a = gld.a();
            findItem.setVisible(a).setEnabled(a);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public void p() {
        boolean z = false;
        if (!this.I && this.r) {
            boolean z2;
            int a = this.K ? -1 : this.y.a();
            bko e = fde.e(a);
            if (this.K || !this.Y.a((Context) this, e)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (this.P) {
                z = this.t.a(a, J_(), z2);
            } else {
                if (a != this.R) {
                    D();
                }
                if (!(a == this.R && z2 == this.S)) {
                    z = true;
                }
            }
            this.R = a;
            this.S = z2;
            if (z) {
                if (b(this.T)) {
                    this.T = null;
                } else {
                    b(PreferenceManager.getDefaultSharedPreferences(this).getString("last_selected_tab", MainViewPager.d.d));
                }
                if (this.Q != null) {
                    this.Q.a(getLayoutInflater());
                }
                r();
            }
        }
    }

    public boolean b(String str) {
        if (str == null) {
            return false;
        }
        if (this.P) {
            return this.t.a(str);
        }
        goy goy;
        String str2;
        String str3;
        ba.b(this.y.b());
        PreferenceManager.getDefaultSharedPreferences(this).edit().putString("last_selected_tab", str).apply();
        if (!str.equals(MainViewPager.e.d)) {
            if (this.D == null) {
                goy = MainViewPager.d;
                str2 = "dialer";
                str3 = "conv_list";
            } else {
                str3 = null;
                str2 = null;
                goy = null;
            }
            this.G = null;
        } else if (this.S) {
            if (this.G == null) {
                goy = MainViewPager.e;
                str2 = "conv_list";
                str3 = "dialer";
            } else {
                str3 = null;
                str2 = null;
                goy = null;
            }
            this.D = null;
        } else {
            b(MainViewPager.d.d);
            return false;
        }
        if (goy != null) {
            ed J_ = J_();
            ew a = J_.a();
            dr instantiate = dr.instantiate(this, goy.e.getName());
            dr a2 = J_.a(str2);
            if (a2 != null) {
                a.a(a2);
            }
            a.a(ba.ai, instantiate, str3);
            a.b();
            J_.b();
            setTitle(goy.a);
            F_();
        }
        return true;
    }

    public void q() {
        if (!this.y.b()) {
            return;
        }
        if (!this.P || (this.t != null && this.t.j())) {
            p();
        }
    }

    protected boolean a(MenuItem menuItem) {
        if (menuItem.getItemId() == ba.aA) {
            this.x.a(this.y.a()).b().c(1615);
            new elk(this).a(this.O).a(J_()).a().show();
        } else if (menuItem.getItemId() == 16908332) {
            this.M.f(8388611);
            return true;
        }
        return super.a(menuItem);
    }

    public void a(boolean z, jcb jcb, jcb jcb2, int i, int i2) {
        String valueOf = String.valueOf(jcb);
        String valueOf2 = String.valueOf(jcb2);
        glk.c("Babel_HomeActivity", new StringBuilder((String.valueOf(valueOf).length() + 41) + String.valueOf(valueOf2).length()).append("oAHST ").append(z).append(", ").append(valueOf).append(", ").append(valueOf2).append(", ").append(i).append(", ").append(i2).toString(), new Object[0]);
        switch (eji.a[jcb2.ordinal()]) {
            case wi.j /*1*/:
                this.K = false;
                break;
            case wi.l /*2*/:
                finish();
                return;
            case wi.z /*3*/:
                D();
                gwb.a(new ejo(this));
                return;
        }
        if (this.s) {
            gwb.a(new ejp(this));
            return;
        }
        boolean z2 = jcb == jcb.VALID;
        v();
        this.ae.a(new ejd(this));
        bko e = fde.e(i2);
        Context applicationContext = getApplicationContext();
        bhl bhl = (bhl) this.E.a(bhl.class);
        bhl.a(fkt.a(i));
        bhl.a(new fkt(i2, applicationContext));
        bhl.a(new fiy(i2, applicationContext));
        bhl.a(new flj(i2, applicationContext));
        fvy.a(i2, applicationContext);
        bhl.a(new fkq(i2, applicationContext));
        z();
        if (this.u != null) {
            this.u.a(o());
        }
        if (z2) {
            x();
        } else if (e(getIntent())) {
            if (!fde.q()) {
                t();
                glk.d("Babel_HomeActivity", "[BabelHomeActivity.onCreate] Adding account from dialer intent.", new Object[0]);
                return;
            } else if (!this.Y.a(e)) {
                new Builder(this).setMessage(bc.cT).setCancelable(true).setPositiveButton(bc.hR, new ejh(this)).create().show();
            }
        }
        b(true);
        w();
    }

    private void z() {
        if ((this.D == null || !this.D.d()) && this.u != null) {
            ViewGroup viewGroup = (ViewGroup) findViewById(ba.de);
            if (viewGroup != null) {
                this.u.a();
                this.u.a(this, viewGroup, this.X);
                if (this.t != null) {
                    if (this.W == null) {
                        this.W = this.u.b();
                        if (this.W != null) {
                            this.t.b(this.W);
                        }
                    }
                    if (this.W != null) {
                        int c = this.t.c();
                        this.W.a(c);
                        this.W.a(c, 0.0f, 0);
                        return;
                    }
                    return;
                }
                this.u.a(o());
            }
        }
    }

    private void b(boolean z) {
        int i = 1;
        if (!this.K) {
            int i2 = (z || this.Z == -1 || glj.b() - this.Z > ((biw) this.E.a(biw.class)).a("babel_account_snackbar_reshow", fls.q)) ? 1 : 0;
            if (((jcf) this.E.a(jcf.class)).a("logged_in").size() <= 1) {
                i = 0;
            }
            if ((i2 & i) != 0) {
                this.Z = glj.b();
                if (this.y.c().c("sms_only")) {
                    c(null);
                    return;
                }
                if (this.v != null) {
                    this.v.a(null);
                }
                int a = this.y.a();
                this.v = new eje(this, this, this.F, a, etx.STATUS_MESSAGE.l);
                this.v.a(fde.e(a).b().a);
            }
        }
    }

    public void c(String str) {
        int i = this.w != null ? 1 : 0;
        gah gah = new gah(this);
        int a = this.y.a();
        gah.a(getString(bc.kY, new Object[]{this.af.c(a)}));
        gah.b(str);
        gah.a(TimeUnit.SECONDS.toMillis(5));
        gah.a(new ejf(this));
        gag a2 = gah.a();
        if (i != 0) {
            this.z.a(this.w, a2);
        } else {
            this.z.a(a2);
        }
        this.w = a2;
    }

    public void a(Intent intent) {
        gwb.c(intent);
        b(MainViewPager.d.d);
        if (this.u != null) {
            this.u.f();
        }
        if (this.D != null) {
            this.D.c();
        }
    }

    public void a(dr drVar) {
        String str = "onAttachFragment ";
        String valueOf = String.valueOf(drVar.getClass().getSimpleName());
        d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        super.a(drVar);
        if (drVar instanceof ConversationListFragment) {
            this.D = (ConversationListFragment) drVar;
            this.D.a((dbj) this);
            this.D.b(0);
        } else if (drVar instanceof CallContactPickerFragment) {
            this.G = (CallContactPickerFragment) drVar;
            this.G.a((daa) this);
        }
        str = "/onAttachFragment ";
        valueOf = String.valueOf(drVar.getClass().getSimpleName());
        d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    public void r() {
        goy n = n();
        setTitle(n != null ? n.a : bc.fr);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.q.b(charSequence);
    }

    public void s() {
        int a = this.y.a();
        if (this.Y.b(fde.e(a)) && !this.af.f(a)) {
            if (this.L == null) {
                this.L = (BalanceView) getLayoutInflater().inflate(gwb.hA, null);
                ((HangoutsToolbar) this.q).a(this.L);
            }
            this.L.a(n() == MainViewPager.e);
        } else if (this.L != null) {
            this.L.a(false);
        }
    }

    public void a(String str) {
        int b = ((jcf) this.E.a(jcf.class)).b(str);
        if (this.y.a() != b) {
            this.x.a(b).b().c(1561);
            a(new jmu().a(str).b());
        }
    }

    public void t() {
        this.x.a(this.y.a()).b().c(1628);
        glk.c("Babel_HomeActivity", "Adding a new account", new Object[0]);
        gwb.a(new ejg(this));
    }

    public void a(bcc bcc, Intent intent, int i) {
        String str;
        if (B) {
            str = bcc.a;
            new StringBuilder(String.valueOf(str).length() + 51).append("openConversation conversationId: ").append(str).append(" type: ").append(bcc.b);
        }
        Intent a = gwb.a(i, bcc.a, bcc.b);
        a.putExtra("conversation_parameters", bcc);
        a.putExtra("opened_from_impression", bcc.k);
        if (intent != null) {
            glk.a("Babel_HomeActivity", "Injecting share intent.", new Object[0]);
            a.putExtra("share_intent", intent);
        }
        startActivity(a);
        String str2 = "openConversation ";
        str = String.valueOf(bcc.a);
        d(str.length() != 0 ? str2.concat(str) : new String(str2));
    }

    public void a(edo edo, String str, int i, long j) {
        if (B) {
            String str2 = "openInvite ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        startActivity(gwb.a(this.y.a(), str, edo, i, j));
    }

    public static void a(PrintWriter printWriter) {
        Iterator it = A.iterator();
        int i = 0;
        long j = 0;
        while (it.hasNext()) {
            ejr ejr = (ejr) it.next();
            ejr.a(i, printWriter, j);
            i++;
            j = ejr.a;
        }
    }

    public void onBackPressed() {
        if (this.u != null && this.u.g()) {
            return;
        }
        if (!C()) {
            d("onBackPressed");
            if (this.G == null || !this.G.isVisible() || !this.G.d()) {
                if (this.D == null || !this.D.q()) {
                    super.onBackPressed();
                }
            }
        } else if (this.M != null) {
            this.M.b();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        F_();
        z();
    }

    public void a_(Bundle bundle) {
        if (isFinishing()) {
            glk.a("Babel_HomeActivity", "People client connected but home activity is finishing.", new Object[0]);
        }
    }

    public void a(int i) {
    }

    public void a(ConnectionResult connectionResult) {
    }

    private void A() {
        if (this.D != null) {
            this.D.a(false);
        }
        if (this.t != null) {
            this.t.b(false);
            this.Q.a(true);
        }
        this.M.a(1);
    }

    private void B() {
        if (this.D != null) {
            this.D.a(true);
        }
        if (this.t != null) {
            this.t.b(true);
            this.Q.a(false);
        }
        this.M.a(0);
    }

    public void B_() {
        A();
        if (this.u != null && ((ViewGroup) findViewById(ba.de)) != null) {
            this.u.a();
        }
    }

    public void j() {
        B();
        z();
    }

    public void a(gag gag) {
        this.z.a(gag);
    }

    public void a(gag gag, gag gag2) {
        this.z.a(gag, gag2);
    }

    public void b(fdv fdv) {
        switch (fdv.a()) {
            case wi.j /*1*/:
                u();
            case wi.l /*2*/:
                int a = this.y.a();
                gwb.a((dw) this, fdv, a, this.af.a(a));
            default:
                glk.e("Babel_HomeActivity", "Unsupported call action type for BabelHomeActivity!", new Object[0]);
        }
    }

    private static boolean e(Intent intent) {
        return TextUtils.equals(intent.getAction(), "com.google.android.apps.hangouts.phone.recentcalls") || TextUtils.equals(intent.getAction(), "com.google.android.apps.hangouts.phone.dialpad");
    }

    public void u() {
        b(MainViewPager.e.d);
    }

    private boolean C() {
        if (this.M == null || this.N == null || this.N.getView() == null) {
            return false;
        }
        return this.M.j(this.N.getView());
    }

    public void a(jmu jmu) {
        this.K = true;
        D();
        this.y.a(jmu);
    }

    private void D() {
        if (this.P) {
            p();
            return;
        }
        ed J_ = J_();
        ew a = J_.a();
        dr a2 = J_.a("conv_list");
        if (a2 != null) {
            a.a(a2);
        }
        a2 = J_.a("dialer");
        if (a2 != null) {
            a.a(a2);
        }
        a.b();
        J_.b();
        this.D = null;
        this.G = null;
    }

    public void a(bcc bcc) {
        a(bcc, null, this.y.a());
    }

    public void a(String str, boolean z, int i, int i2) {
        d("openHangout");
        if (this.ah == null || this.ah.getStatus() == Status.FINISHED) {
            this.ah = new epi(this, fde.e(this.y.a()), str, z, i, true, i2);
            this.ah.b(new Void[0]);
        }
    }

    private static void d(String str) {
        if (glk.A) {
            A.add(new ejr(str));
            while (A.size() > 40) {
                A.remove(0);
            }
        }
    }
}
