package com.android.incallui;

import abr;
import abw;
import add;
import ajy;
import akd;
import ake;
import akl;
import android.app.ActionBar;
import android.app.ActivityManager;
import android.app.ActivityManager.AppTask;
import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import aq;
import awm;
import axw;
import ayc;
import ayl;
import ayo;
import ayv;
import az;
import azs;
import bao;
import bas;
import bat;
import bbw;
import bbx;
import bbz;
import bca;
import bci;
import bcj;
import bde;
import bdf;
import bdg;
import bdp;
import buf;
import cob;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import rk;
import rl;
import rq;

/* compiled from: PG */
public class InCallActivity extends abr implements bbw { //inherits a boolean a from abr
    private static String h;
    public ayv b;
    DialpadFragment c;
    public AlertDialog d;
    Animation e;
    Animation f;
    public OnTouchListener g;
    private CallButtonFragment i;
    private ayc j;
    private bat k;
    private FragmentManager l;
    private akl m;
    private bci n;
    private int o; //orig value is 1
    private boolean p;
    private String q;
    private boolean r;
    private String s;
    private String t;
    private boolean u;
    private boolean v; //orig value is false
    private int w;
    private int x;
    private akd y;

    public InCallActivity() {
        this.m = new bbz(this);
        this.o = 1;
        this.v = false;
        this.y = new bca(this);
    }

    //creates the new UI for an inCall screen

    static {
        h = InCallActivity.class.getSimpleName();
    }

    protected void onCreate(Bundle bundle) {
        boolean z = true;
        String valueOf = String.valueOf(this);
        bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 22).append("onCreate()...  this = ").append(valueOf).toString());
        super.onCreate(bundle);
        getWindow().addFlags(2654208);
        requestWindowFeature(9);
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowTitleEnabled(true);
            actionBar.hide();
        }
        setContentView(buf.kX);
        a(getIntent());
        this.u = getResources().getConfiguration().orientation == 2;
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) != 1) {
            z = false;
        }
        if (this.u) {
            this.e = AnimationUtils.loadAnimation(this, z ? cob.dJ : cob.dK);
            this.f = AnimationUtils.loadAnimation(this, z ? cob.dM : cob.dN);
        } else {
            this.e = AnimationUtils.loadAnimation(this, cob.dI);
            this.f = AnimationUtils.loadAnimation(this, cob.dL);
        }
        this.e.setInterpolator(ake.a);
        this.f.setInterpolator(ake.b);
        this.f.setAnimationListener(this.m);
        Fragment findFragmentByTag = getFragmentManager().findFragmentByTag(DialpadFragment.class.getName());
        if (findFragmentByTag != null) {
            this.c = (DialpadFragment) findFragmentByTag;
        }
        if (bundle != null) {
            if (bundle.containsKey("InCallActivity.show_dialpad")) {
                this.o = bundle.getBoolean("InCallActivity.show_dialpad") ? 2 : 3;
                this.p = false;
            }
            this.q = bundle.getString("InCallActivity.dialpad_text");
            ajy ajy = (ajy) getFragmentManager().findFragmentByTag("tag_select_acct_fragment");
            if (ajy != null) {
                ajy.e = this.y;
            }
        }
        this.n = new bci(this);
        this.w = getResources().getConfiguration().screenHeightDp;
        this.x = getResources().getConfiguration().screenWidthDp;
        bdf.a((Object) this, "onCreate(): exit");
    }

    protected void onSaveInstanceState(Bundle bundle) {
        boolean z;
        String str = "InCallActivity.show_dialpad";
        if (this.i != null) {
            CallButtonFragment callButtonFragment = this.i;
            if (callButtonFragment.getActivity() == null || !(callButtonFragment.getActivity() instanceof InCallActivity)) {
                z = false;
            } else {
                z = ((InCallActivity) callButtonFragment.getActivity()).a();
            }
            if (z) {
                z = true;
                bundle.putBoolean(str, z);
                if (this.c != null) {
                    bundle.putString("InCallActivity.dialpad_text", this.c.a.getText().toString());
                }
                super.onSaveInstanceState(bundle);
            }
        }
        z = false;
        bundle.putBoolean(str, z);
        if (this.c != null) {
            bundle.putString("InCallActivity.dialpad_text", this.c.a.getText().toString());
        }
        super.onSaveInstanceState(bundle);
    }

    protected void onStart() {
        bdf.a((Object) this, "onStart()...");
        super.onStart();
        bcj b = bcj.b();
        if (this == null) {
            throw new IllegalArgumentException("registerActivity cannot be called with null");
        }
        if (!(b.m == null || b.m == this)) {
            bdf.e(b, "Setting a second activity before destroying the first.");
        }
        b.b(this);
        e(getRequestedOrientation() == bci.d);
        Object b2 = bcj.b();
        bdf.a(b2, "onActivityStarted");
        b2.b(true);
    }

    protected void onResume() {
        bdf.d(this, "onResume()...");
        super.onResume();
        if (bcj.b().i()) {
            bdf.d(this, "InCallPresenter is ready for tear down, not sending updates");
        } else {
            bcj.b().m();
            bcj.b().a(true);
            bcj.b().v = false;
        }
        if (this.o != 1) {
            if (this.o == 2) {
                bcj.b().a(false, true);
                this.i.a(true, this.p);
                this.p = false;
                if (this.c != null) {
                    this.c.a.setText(buf.a(this.q));
                    this.q = null;
                }
            } else {
                bdf.b((Object) this, "onResume : force hide dialpad");
                if (this.c != null) {
                    this.i.a(false, false);
                }
            }
            this.o = 1;
        }
        if (this.r) {
            a(this.s, this.t);
        }
        azs azs = azs.a;
        boolean booleanExtra = getIntent().getBooleanExtra("InCallActivity.for_full_screen_intent", false);
        for (ayo ayo : azs.b.values()) {
            bde bde = ayo.c;
            if (bde.h == -1) {
                boolean z;
                bde.h = SystemClock.elapsedRealtime();
                if (!bde.a || booleanExtra) {
                    z = false;
                } else {
                    z = true;
                }
                bde.i = z;
            }
        }
    }

    protected void onPause() {
        bdf.a((Object) this, "onPause()...");
        if (this.c != null) {
            this.c.a(null);
        }
        bcj.b().a(false);
        if (isFinishing()) {
            bcj.b().a(this);
        }
        super.onPause();
    }

    protected void onStop() {
        bdf.a((Object) this, "onStop()...");
        e(false);
        bcj.b().f();
        Object b = bcj.b();
        bdf.a(b, "onActivityStopped");
        b.b(false);
        super.onStop();
    }

    protected void onDestroy() {
        String valueOf = String.valueOf(this);
        bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 23).append("onDestroy()...  this = ").append(valueOf).toString());
        bcj.b().a(this);
        bcj.b().f();
        super.onDestroy();
    }

    public final void a(Fragment fragment) {
        if (fragment instanceof DialpadFragment) {
            this.c = (DialpadFragment) fragment;
        } else if (fragment instanceof ayc) {
            this.j = (ayc) fragment;
        } else if (fragment instanceof ayv) {
            this.b = (ayv) fragment;
            this.l = this.b.getChildFragmentManager();
        } else if (fragment instanceof bat) {
            this.k = (bat) fragment;
        } else if (fragment instanceof CallButtonFragment) {
            this.i = (CallButtonFragment) fragment;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (a(this.w, configuration.screenHeightDp, 500) || a(this.x, configuration.screenWidthDp, 500)) {
            bdf.d(this, "Recreate activity due to resize beyond threshold");
            bdf.d(this, String.format("Incallui screen size changed: %dh x %dw -> %dh x %dw", new Object[]{Integer.valueOf(this.w), Integer.valueOf(this.x), Integer.valueOf(configuration.screenHeightDp), Integer.valueOf(configuration.screenWidthDp)}));
            recreate();
            return;
        }
        this.w = configuration.screenHeightDp;
        this.x = configuration.screenWidthDp;
    }

    private static boolean a(int i, int i2, int i3) {
        return (i < 500 && i2 >= 500) || (i >= 500 && i2 < 500);
    }

    public void finish() {
        boolean z;
        Object obj = null;
        if (this.d != null) {
            z = true;
        } else {
            z = false;
        }
        bdf.d(this, "finish().  Dialog showing: " + z);
        if (this.d != null || (this.j != null && this.j.d())) {
            obj = 1;
        }
        if (obj == null) {
            super.finish();
        }
    }

    protected void onNewIntent(Intent intent) {
        String valueOf = String.valueOf(intent);
        bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 22).append("onNewIntent: intent = ").append(valueOf).toString());
        setIntent(intent);
        a(intent);
    }

    public void onBackPressed() {
        bdf.d(this, "onBackPressed");
        if (!this.a) {
            return;
        }
        if ((this.k != null && this.k.isVisible()) || (this.b != null && this.b.isVisible())) {
            if (this.c != null && this.c.isVisible()) {
                this.i.a(false, true);
            } else if (this.k != null && this.k.isVisible()) {
                c(false);
            } else if (azs.a.j() != null) {
                bdf.d(this, "Consume Back press for an incoming call");
            } else {
                super.onBackPressed();
            }
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if ((this.c != null && this.c.isVisible() && this.c.a(keyEvent)) || i == 5) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.g == null || !this.g.onTouch(null, motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Object b;
        boolean z = false;
        switch (i) {
            case rl.g /*5*/:
                b = bcj.b();
                bdf.b(b, "handleCallKey");
                azs azs = b.k;
                ayo j = azs.j();
                String valueOf = String.valueOf(j);
                bdf.b(b, new StringBuilder(String.valueOf(valueOf).length() + 14).append("incomingCall: ").append(valueOf).toString());
                if (j != null) {
                    bdp.a().a(j.d, 0);
                    return true;
                }
                ayo e = azs.e();
                if (e != null) {
                    boolean b2 = e.b(4);
                    boolean b3 = e.b(8);
                    String valueOf2 = String.valueOf(e);
                    bdf.b(b, new StringBuilder(String.valueOf(valueOf2).length() + 45).append("activeCall: ").append(valueOf2).append(", canMerge: ").append(b2).append(", canSwap: ").append(b3).toString());
                    if (b2) {
                        bdp.a().d(e.d);
                        return true;
                    } else if (b3) {
                        bdp.a().e(e.d);
                        return true;
                    }
                }
                e = azs.f();
                if (e == null) {
                    return true;
                }
                boolean b4 = e.b(1);
                String valueOf3 = String.valueOf(e);
                bdf.b(b, new StringBuilder(String.valueOf(valueOf3).length() + 26).append("heldCall: ").append(valueOf3).append(", canHold: ").append(b4).toString());
                if (e.c() != 8 || !b4) {
                    return true;
                }
                bdp.a().c(e.d);
                return true;
            case rk.q /*27*/:
                return true;
            case 76:
                if (bdf.b) {
                    bdf.b((Object) this, "----------- InCallActivity View dump --------------");
                    String valueOf4 = String.valueOf(getWindow().getDecorView());
                    bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf4).length() + 10).append("View dump:").append(valueOf4).toString());
                    return true;
                }
                break;
            case 91:
                bdp a = bdp.a();
                if (!ayl.a.d) {
                    z = true;
                }
                a.a(z);
                return true;
        }
        if (keyEvent.getRepeatCount() == 0) {
            String valueOf5 = String.valueOf(keyEvent);
            bdf.b((Object) this, new StringBuilder(String.valueOf(valueOf5).length() + 51).append("handleDialerKeyDown: keyCode ").append(i).append(", event ").append(valueOf5).append("...").toString());
            if (this.c != null && this.c.isVisible()) {
                b = this.c;
                bdf.a(b, "Notifying dtmf key down.");
                if (b.b != null) {
                    z = b.b.a(keyEvent);
                }
            }
            if (z) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    private final void a(Intent intent) {
        if (intent.getAction().equals("android.intent.action.MAIN")) {
            boolean booleanExtra;
            ayo i;
            Bundle intentExtras;
            if (intent.hasExtra("InCallActivity.show_dialpad")) {
                booleanExtra = intent.getBooleanExtra("InCallActivity.show_dialpad", false);
                bdf.a((Object) this, "- internalResolveIntent: SHOW_DIALPAD_EXTRA: " + booleanExtra);
                this.o = booleanExtra ? 2 : 1;
                this.p = true;
                if (this.o == 2) {
                    i = azs.a.i();
                    if (i != null && i.c() == 8) {
                        bdp.a().c(i.d);
                    }
                }
            }
            if (intent.getBooleanExtra("InCallActivity.new_outgoing_call", false)) {
                ayo c;
                boolean z;
                Point point;
                intent.removeExtra("InCallActivity.new_outgoing_call");
                i = azs.a.d();
                if (i == null) {
                    c = azs.a.c();
                } else {
                    c = i;
                }
                if (c != null) {
                    intentExtras = c.b.getDetails().getIntentExtras();
                } else {
                    intentExtras = null;
                }
                if (intentExtras == null) {
                    intentExtras = new Bundle();
                }
                add add = add.a;
                if (add.b.x == 0 && add.b.y == 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    point = add.a.b;
                } else if (c != null) {
                    point = (Point) intentExtras.getParcelable("touchPoint");
                } else {
                    point = null;
                }
                FragmentManager fragmentManager = getFragmentManager();
                bas b = bcj.b();
                if (fragmentManager.findFragmentByTag("CircularRevealFragment") == null) {
                    fragmentManager.beginTransaction().add(az.ab, new bao(point, b), "CircularRevealFragment").commitAllowingStateLoss();
                } else {
                    bdf.e("CircularRevealFragment", "An instance of CircularRevealFragment already exists");
                }
                if (abw.b() && bcj.d(c)) {
                    bdp.a().b(c.d);
                }
                a(true);
                booleanExtra = true;
            } else {
                booleanExtra = false;
            }
            ayo b2 = azs.a.b();
            if (b2 != null) {
                List parcelableArrayList;
                b(false);
                intentExtras = b2.b.getDetails().getIntentExtras();
                if (intentExtras != null) {
                    parcelableArrayList = intentExtras.getParcelableArrayList("selectPhoneAccountAccounts");
                } else {
                    parcelableArrayList = new ArrayList();
                }
                ajy.a(aq.dp, true, parcelableArrayList, this.y).show(getFragmentManager(), "tag_select_acct_fragment");
            } else if (!booleanExtra) {
                b(true);
            }
        }
    }

    public final void a(boolean z) {
        if (this.v != z) {
            this.v = z;
            if (z) {
                getWindow().addFlags(4194304);
            } else {
                getWindow().clearFlags(4194304);
            }
        }
    }

    public final void a(String str, boolean z, boolean z2) {
        FragmentManager fragmentManager;
        String str2 = "showFragment - ";
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            valueOf = str2.concat(valueOf);
        } else {
            valueOf = new String(str2);
        }
        Trace.beginSection(valueOf);
        if ("tag_dialpad_fragment".equals(str)) {
            fragmentManager = this.l;
        } else if ("tag_answer_fragment".equals(str)) {
            fragmentManager = this.l;
        } else if ("tag_conference_manager_fragment".equals(str)) {
            fragmentManager = getFragmentManager();
        } else if ("tag_callcard_fragment".equals(str)) {
            fragmentManager = getFragmentManager();
        } else {
            String str3 = "Unexpected fragment: ";
            valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        }
        if (fragmentManager == null) {
            str2 = h;
            str3 = "Fragment manager is null for : ";
            valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                valueOf = str3.concat(valueOf);
            } else {
                valueOf = new String(str3);
            }
            bdf.e(str2, valueOf);
            return;
        }
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag(str);
        if (z || findFragmentByTag != null) {
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            if (z) {
                int i;
                if (findFragmentByTag == null) {
                    int i2;
                    if ("tag_dialpad_fragment".equals(str)) {
                        this.c = new DialpadFragment();
                        findFragmentByTag = this.c;
                    } else if ("tag_answer_fragment".equals(str)) {
                        if (buf.N(this)) {
                            this.j = new axw();
                        } else {
                            this.j = new bbx();
                        }
                        findFragmentByTag = this.j;
                    } else if ("tag_conference_manager_fragment".equals(str)) {
                        this.k = new bat();
                        findFragmentByTag = this.k;
                    } else if ("tag_callcard_fragment".equals(str)) {
                        this.b = new ayv();
                        findFragmentByTag = this.b;
                    } else {
                        str3 = "Unexpected fragment: ";
                        valueOf = String.valueOf(str);
                        throw new IllegalStateException(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                    }
                    if ("tag_dialpad_fragment".equals(str)) {
                        i2 = az.e;
                    } else if ("tag_answer_fragment".equals(str)) {
                        i2 = az.e;
                    } else if ("tag_conference_manager_fragment".equals(str)) {
                        i2 = az.ab;
                    } else if ("tag_callcard_fragment".equals(str)) {
                        i2 = az.ab;
                    } else {
                        str3 = "Unexpected fragment: ";
                        valueOf = String.valueOf(str);
                        throw new IllegalStateException(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                    }
                    beginTransaction.add(i2, findFragmentByTag, str);
                } else {
                    beginTransaction.show(findFragmentByTag);
                }
                awm H = buf.H(this);
                Object obj = -1;
                switch (str.hashCode()) {
                    case -1946906724:
                        if (str.equals("tag_callcard_fragment")) {
                            obj = 1;
                            break;
                        }
                        break;
                    case -775206132:
                        if (str.equals("tag_answer_fragment")) {
                            obj = 3;
                            break;
                        }
                        break;
                    case -318683663:
                        if (str.equals("tag_dialpad_fragment")) {
                            obj = null;
                            break;
                        }
                        break;
                    case 1571897408:
                        if (str.equals("tag_conference_manager_fragment")) {
                            obj = 2;
                            break;
                        }
                        break;
                }
                switch (obj) {
                    case rl.c /*0*/:
                        i = 16;
                        break;
                    case rq.b /*1*/:
                        i = 13;
                        break;
                    case rq.c /*2*/:
                        i = 15;
                        break;
                    case rl.e /*3*/:
                        i = 14;
                        break;
                    default:
                        i = 0;
                        break;
                }
                H.a(i, this);
            } else {
                beginTransaction.hide(findFragmentByTag);
            }
            beginTransaction.commitAllowingStateLoss();
            if (z2) {
                fragmentManager.executePendingTransactions();
            }
            Trace.endSection();
        }
    }

    public final boolean a() {
        return this.c != null && this.c.isVisible();
    }

    public final void b(boolean z) {
        a("tag_callcard_fragment", z, true);
    }

    public final void c(boolean z) {
        a("tag_conference_manager_fragment", z, true);
        this.k.a(z);
        this.b.getView().setVisibility(z ? 8 : 0);
    }

    public final void a(String str, String str2) {
        if (this.a) {
            new bdg(str, str2).show(getFragmentManager(), "postCharWait");
            this.r = false;
            this.s = null;
            this.t = null;
            return;
        }
        this.r = true;
        this.s = str;
        this.t = str2;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (this.b != null) {
            this.b.a(accessibilityEvent);
        }
        return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public final void b() {
        boolean z = false;
        if (this.d != null) {
            this.d.dismiss();
            this.d = null;
        }
        if (this.j != null) {
            boolean isShowing;
            ayc ayc = this.j;
            if (ayc.c != null) {
                isShowing = ayc.c.isShowing();
            } else {
                isShowing = false;
            }
            if (isShowing) {
                ayc.b();
            }
            if (ayc.d != null) {
                z = ayc.d.isShowing();
            }
            if (z) {
                ayc.c();
            }
        }
    }

    public final void d(boolean z) {
        List appTasks = ((ActivityManager) getSystemService("activity")).getAppTasks();
        int taskId = getTaskId();
        for (int i = 0; i < appTasks.size(); i++) {
            AppTask appTask = (AppTask) appTasks.get(i);
            if (appTask.getTaskInfo().id == taskId) {
                try {
                    appTask.setExcludeFromRecents(z);
                } catch (Exception e) {
                    bdf.a(h, "RuntimeException when excluding task from recents.", e);
                }
            }
        }
    }

    public final void e(boolean z) {
        if (z) {
            this.n.a(z);
        } else {
            this.n.disable();
        }
    }
}
