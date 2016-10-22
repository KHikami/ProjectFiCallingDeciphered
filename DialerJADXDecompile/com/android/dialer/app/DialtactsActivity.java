package com.android.dialer.app;

import acn;
import acy;
import add;
import adi;
import aei;
import ajw;
import ake;
import akl;
import akq;
import akr;
import aks;
import akt;
import aku;
import akv;
import akw;
import akx;
import aky;
import akz;
import alf;
import amr;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.ActivityNotFoundException;
import android.content.ContentValues;
import android.content.Context;
import android.content.CursorLoader;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.provider.CallLog.Calls;
import android.provider.ContactsContract.Contacts;
import android.provider.ContactsContract.Data;
import android.support.design.widget.CoordinatorLayout;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnMenuItemClickListener;
import android.widget.TextView;
import android.widget.Toast;
import aos;
import aot;
import aou;
import aov;
import aow;
import aoy;
import apl;
import aq;
import aqe;
import aqg;
import aqi;
import aqj;
import aqt;
import aqv;
import aqz;
import arb;
import arf;
import arq;
import atd;
import atg;
import avq;
import avw;
import awb;
import axc;
import axd;
import axk;
import buf;
import cob;
import com.android.dialer.app.calllog.CallLogActivity;
import com.android.dialer.app.dialpad.DialpadFragment;
import com.android.dialer.app.list.PhoneFavoriteSquareTileView;
import com.android.dialer.app.settings.DialerSettingsActivity;
import com.android.dialer.app.voicemail.VoicemailArchiveActivity;
import com.android.dialer.app.widget.EmptyContentView;
import com.android.dialer.app.widget.SearchEditTextLayout;
import java.util.ArrayList;
import java.util.List;
import lm;
import pl;

@UsedByReflection
/* compiled from: PG */
public class DialtactsActivity extends alf implements aei, amr, OnClickListener, OnMenuItemClickListener, aos, aot, aqi, aqj, aqz, arf, atg, lm {
    private boolean A;
    private boolean B;
    private boolean C;
    private String D;
    private PopupMenu E;
    private View F;
    private String G;
    private avw H;
    private boolean I;
    private akl J;
    private akl K;
    private final TextWatcher L;
    private final OnClickListener M;
    private int N;
    private int O;
    private final OnKeyListener P;
    private String Q;
    public DialpadFragment g;
    public CoordinatorLayout h;
    public aqt i;
    public arb j;
    public Animation k;
    public aqg l;
    public boolean m;
    public boolean n;
    public boolean o;
    public EditText p;
    public String q;
    public aqe r;
    public atd s;
    public ajw t;
    private Animation v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public DialtactsActivity() {
        this.J = new akq(this);
        this.K = new akr(this);
        this.L = new aks(this);
        this.M = new akt(this);
        this.P = new aku(this);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            add.a.a((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void onCreate(Bundle bundle) {
        Trace.beginSection("DialtactsActivity onCreate");
        super.onCreate(bundle);
        this.C = true;
        this.N = getResources().getDimensionPixelSize(buf.hh);
        Trace.beginSection("DialtactsActivity setContentView");
        setContentView(buf.hG);
        Trace.endSection();
        getWindow().setBackgroundDrawable(null);
        Trace.beginSection("DialtactsActivity setup Views");
        pl a = e().a();
        a.a(buf.hL);
        a.d(true);
        a.a(null);
        View view = (SearchEditTextLayout) a.a().findViewById(aq.bn);
        view.c = this.P;
        this.s = new atd(this, view);
        this.p = (EditText) view.findViewById(aq.bm);
        this.p.addTextChangedListener(this.L);
        this.F = view.findViewById(aq.bI);
        view.findViewById(aq.bl).setOnClickListener(this.M);
        view.findViewById(aq.bj).setOnClickListener(this.M);
        view.setOnClickListener(this.M);
        view.g = new akv(this);
        this.A = getResources().getConfiguration().orientation == 2;
        this.O = 0;
        View findViewById = findViewById(aq.at);
        ImageButton imageButton = (ImageButton) findViewById(aq.as);
        imageButton.setOnClickListener(this);
        this.t = new ajw(this, findViewById, imageButton);
        imageButton = (ImageButton) view.findViewById(aq.aj);
        imageButton.setOnClickListener(this);
        this.E = a(view);
        imageButton.setOnTouchListener(this.E.getDragToOpenListener());
        if (bundle == null) {
            getFragmentManager().beginTransaction().add(aq.ah, new aqg(), "favorites").commit();
        } else {
            this.q = bundle.getString("search_query");
            this.n = bundle.getBoolean("in_regular_search_ui");
            this.m = bundle.getBoolean("in_dialpad_search_ui");
            this.C = bundle.getBoolean("first_launch");
            this.I = bundle.getBoolean("was_configuration_change");
            this.z = bundle.getBoolean("is_dialpad_shown");
            atd atd = this.s;
            atd.c = bundle.getBoolean("key_actionbar_is_slid_up");
            if (bundle.getBoolean("key_actionbar_is_faded_out")) {
                if (!atd.b.b) {
                    atd.b.a(false);
                }
            } else if (atd.b.b) {
                atd.b.a(true);
            }
            if (bundle.getBoolean("key_actionbar_is_expanded")) {
                if (!atd.b.a) {
                    atd.b.a(false, false);
                }
            } else if (atd.b.a) {
                atd.b.b(false);
            }
        }
        boolean k = buf.k();
        if (this.A) {
            this.k = AnimationUtils.loadAnimation(this, k ? buf.hc : buf.hd);
            this.v = AnimationUtils.loadAnimation(this, k ? buf.hf : buf.hg);
        } else {
            this.k = AnimationUtils.loadAnimation(this, buf.hb);
            this.v = AnimationUtils.loadAnimation(this, buf.he);
        }
        this.k.setInterpolator(ake.a);
        this.v.setInterpolator(ake.b);
        this.k.setAnimationListener(this.J);
        this.v.setAnimationListener(this.K);
        this.h = (CoordinatorLayout) findViewById(aq.ai);
        this.h.setOnDragListener(new aky(this));
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new akw(this, findViewById));
        Trace.endSection();
        Trace.beginSection("DialtactsActivity initialize smart dialing");
        this.H = buf.G(this).a(this);
        axd.a((Context) this);
        Trace.endSection();
        Trace.endSection();
    }

    protected void onResume() {
        boolean z;
        Trace.beginSection("DialtactsActivity onResume");
        super.onResume();
        this.w = false;
        if (this.C) {
            c(getIntent());
        } else if (!axk.d(this) && this.B) {
            a(false, true);
            this.B = false;
        } else if (this.z) {
            b(false);
            this.z = false;
        }
        if (!TextUtils.isEmpty(this.Q)) {
            this.s.a();
            this.p.setText(this.Q);
            this.Q = null;
        }
        this.C = false;
        if (this.x) {
            if (this.o) {
                buf.H(this).a(1, this);
            }
            this.x = false;
        }
        List queryIntentActivities = getPackageManager().queryIntentActivities(new Intent("android.speech.action.RECOGNIZE_SPEECH"), 65536);
        if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.F.setVisibility(0);
            this.F.setOnClickListener(this);
        } else {
            this.F.setVisibility(8);
        }
        if (!this.I) {
            avw avw = this.H;
            if (buf.i(avw.b)) {
                new awb(avw).execute(new Object[0]);
            }
        }
        this.t.a(y(), false);
        if ("vnd.android.cursor.dir/calls".equals(getIntent().getType())) {
            Bundle extras = getIntent().getExtras();
            if (extras == null || extras.getInt("android.provider.extra.CALL_TYPE_FILTER") != 4) {
                this.l.c(1);
            } else {
                this.l.c(3);
            }
        } else if (getIntent().hasExtra("EXTRA_SHOW_TAB")) {
            int intExtra = getIntent().getIntExtra("EXTRA_SHOW_TAB", 0);
            if (intExtra < this.l.b.a()) {
                this.l.c(intExtra);
            }
        }
        ((TextView) ((SearchEditTextLayout) e().a().a().findViewById(aq.bn)).findViewById(aq.bj)).setHint(m());
        Trace.endSection();
    }

    protected void onRestart() {
        super.onRestart();
        this.x = true;
    }

    protected void onPause() {
        if (!isChangingConfigurations()) {
            z();
        }
        if (this.y) {
            if (this.o) {
                a(false, true);
            } else {
                n();
            }
            this.y = false;
        }
        if (this.v.hasStarted() && !this.v.hasEnded()) {
            g();
        }
        super.onPause();
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("search_query", this.q);
        bundle.putBoolean("in_regular_search_ui", this.n);
        bundle.putBoolean("in_dialpad_search_ui", this.m);
        bundle.putBoolean("first_launch", this.C);
        bundle.putBoolean("is_dialpad_shown", this.o);
        bundle.putBoolean("was_configuration_change", isChangingConfigurations());
        atd atd = this.s;
        bundle.putBoolean("key_actionbar_is_slid_up", atd.c);
        bundle.putBoolean("key_actionbar_is_faded_out", atd.b.b);
        bundle.putBoolean("key_actionbar_is_expanded", atd.b.a);
        this.w = true;
    }

    public void onAttachFragment(Fragment fragment) {
        if (fragment instanceof DialpadFragment) {
            this.g = (DialpadFragment) fragment;
            if (!this.o && !this.z) {
                FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
                beginTransaction.hide(this.g);
                beginTransaction.commit();
            }
        } else if (fragment instanceof arb) {
            this.j = (arb) fragment;
            this.j.k = this;
            if (!TextUtils.isEmpty(this.G)) {
                this.j.r = this.G;
            }
        } else if (fragment instanceof aqv) {
            this.i = (aqt) fragment;
            this.i.k = this;
        } else if (fragment instanceof aqg) {
            this.l = (aqg) fragment;
            this.l.a((lm) this);
        }
    }

    public void f() {
        startActivity(new Intent(this, DialerSettingsActivity.class));
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == aq.as) {
            if (this.l.j == 2 && !this.n) {
                buf.a((Context) this, buf.l(), cob.aY);
            } else if (!this.o) {
                this.B = false;
                b(true);
            }
        } else if (id == aq.bI) {
            try {
                startActivityForResult(new Intent("android.speech.action.RECOGNIZE_SPEECH"), 1);
            } catch (ActivityNotFoundException e) {
                Toast.makeText(this, cob.dt, 0).show();
            }
        } else if (id == aq.aj) {
            this.E.show();
        } else {
            String valueOf = String.valueOf(view);
            Log.wtf("DialtactsActivity", new StringBuilder(String.valueOf(valueOf).length() + 30).append("Unexpected onClick event from ").append(valueOf).toString());
        }
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        if (!this.u) {
            return true;
        }
        int itemId = menuItem.getItemId();
        if (itemId == aq.aI) {
            startActivity(new Intent(this, CallLogActivity.class));
        } else if (itemId == aq.aC) {
            buf.a((Context) this, buf.l(), cob.aY);
        } else if (itemId == aq.aJ) {
            if (this.l.j == 0) {
                acy.a(getFragmentManager(), true, DialtactsActivity.class, 0);
            } else {
                acy.a(getFragmentManager(), true, DialtactsActivity.class, -1);
            }
            buf.H(this).a(10, this);
            return true;
        } else if (itemId == aq.aH) {
            new acn().show(getFragmentManager(), "clearFrequents");
            buf.H(this).a(11, this);
            return true;
        } else if (itemId == aq.aF) {
            f();
            buf.H(this).a(9, this);
            return true;
        } else if (itemId == aq.aE) {
            startActivity(new Intent(this, VoicemailArchiveActivity.class));
            return true;
        }
        return false;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            if (i2 == -1) {
                ArrayList stringArrayListExtra = intent.getStringArrayListExtra("android.speech.extra.RESULTS");
                if (stringArrayListExtra.size() > 0) {
                    this.Q = (String) stringArrayListExtra.get(0);
                } else {
                    Log.e("DialtactsActivity", "Voice search - nothing heard");
                }
            } else {
                Log.e("DialtactsActivity", "Voice search failed");
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    private final void b(boolean z) {
        if (!this.o && !this.w) {
            this.o = true;
            this.l.setUserVisibleHint(false);
            FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
            if (this.g == null) {
                this.g = new DialpadFragment();
                beginTransaction.add(aq.ag, this.g, "dialpad");
            } else {
                beginTransaction.show(this.g);
            }
            this.g.f = z;
            buf.H(this).a(1, this);
            beginTransaction.commit();
            if (z) {
                this.t.a();
            } else {
                this.t.a(false);
                o();
            }
            atd atd = this.s;
            if (atd.a.i()) {
                atd.a(true, true);
            } else {
                View view = atd.b;
                ake.a(view, 200, atd.d);
                view.b = true;
            }
            this.l.getView().animate().alpha(0.0f).withLayer();
            setTitle(cob.ck);
        }
    }

    public final void a(boolean z, boolean z2) {
        if (this.g != null && this.g.getView() != null) {
            if (z2) {
                this.g.b.setImportantForAccessibility(2);
                this.g.a();
                this.g.b.setImportantForAccessibility(0);
            }
            if (this.o) {
                this.o = false;
                this.g.f = z;
                this.l.setUserVisibleHint(true);
                this.l.b();
                h();
                this.t.a(y(), z);
                if (z) {
                    this.g.getView().startAnimation(this.v);
                } else {
                    g();
                }
                atd atd = this.s;
                if (atd.a.i()) {
                    if (atd.a.j()) {
                        if (atd.b.b) {
                            atd.b.a(true);
                        }
                        if (!atd.b.a) {
                            atd.b.a(false, false);
                        }
                        atd.a(false, true);
                    } else {
                        atd.b.a();
                    }
                }
                if (i() && TextUtils.isEmpty(this.q)) {
                    n();
                }
                setTitle(cob.cj);
            }
        }
    }

    public final void g() {
        if (!(this.w || this.g == null || this.g.isHidden())) {
            FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
            beginTransaction.hide(this.g);
            beginTransaction.commit();
        }
        this.t.a(0);
    }

    public final void h() {
        aqv aqv = null;
        if (this.j != null && this.j.isVisible()) {
            aqv = this.j;
        } else if (this.i != null && this.i.isVisible()) {
            aqv = this.i;
        }
        if (aqv != null && aqv.isVisible()) {
            aqv.h(true);
        }
    }

    public final boolean i() {
        return this.m || this.n;
    }

    public final boolean j() {
        return !TextUtils.isEmpty(this.q);
    }

    public final boolean k() {
        return this.l.a != null;
    }

    public boolean l() {
        return false;
    }

    public int m() {
        return cob.bX;
    }

    public akz a(View view) {
        akz akz = new akz(this, this, view);
        akz.inflate(buf.hT);
        if (buf.l((Context) this).a()) {
            akz.getMenu().findItem(aq.aE).setVisible(true);
        }
        akz.setOnMenuItemClickListener(this);
        return akz;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.D != null) {
            this.p.setText(this.D);
            this.D = null;
        }
        if (this.s != null) {
            atd atd = this.s;
            atd.a(atd.c, false);
        }
        return false;
    }

    private final boolean b(Intent intent) {
        if (!"android.intent.action.CALL_BUTTON".equals(intent.getAction())) {
            return false;
        }
        axk.a((Context) this, false);
        return true;
    }

    private final void c(Intent intent) {
        if (b(intent)) {
            finish();
            return;
        }
        boolean z = axk.d(this) && !DialpadFragment.a(intent);
        if (!z) {
            if (intent.getData() != null) {
                boolean z2;
                String action = intent.getAction();
                if ("android.intent.action.DIAL".equals(action) || "com.android.phone.action.TOUCH_DIALER".equals(action)) {
                    z2 = true;
                } else {
                    if ("android.intent.action.VIEW".equals(action)) {
                        Uri data = intent.getData();
                        if (data != null && "tel".equals(data.getScheme())) {
                            z2 = true;
                        }
                    }
                    z2 = false;
                }
                if (!z2) {
                    return;
                }
            }
            return;
        }
        b(false);
        this.g.e = true;
        if (z && !this.g.isVisible()) {
            this.B = true;
        }
    }

    public void onNewIntent(Intent intent) {
        setIntent(intent);
        this.w = false;
        c(intent);
        invalidateOptionsMenu();
    }

    public final void a(boolean z, String str, boolean z2) {
        if (!this.w && !getFragmentManager().isDestroyed()) {
            String str2;
            boolean z3;
            FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
            if (this.m && this.j != null) {
                beginTransaction.remove(this.j);
            } else if (this.n && this.i != null) {
                beginTransaction.remove(this.i);
            }
            if (z) {
                str2 = "smartdial";
            } else {
                str2 = "search";
            }
            this.m = z;
            if (z) {
                z3 = false;
            } else {
                z3 = true;
            }
            this.n = z3;
            this.t.a();
            adi adi = (aqv) getFragmentManager().findFragmentByTag(str2);
            if (z2) {
                beginTransaction.setCustomAnimations(17498112, 0);
            } else {
                beginTransaction.setTransition(0);
            }
            if (adi == null) {
                if (z) {
                    adi = new arb();
                } else {
                    adi = buf.m((Context) this).a();
                    adi.q = new akx(this);
                }
                beginTransaction.add(aq.ah, adi, str2);
            } else {
                beginTransaction.show(adi);
            }
            adi.setHasOptionsMenu(false);
            adi.e = true;
            if (!z) {
                adi.a(str);
            }
            beginTransaction.commit();
            if (z2) {
                this.l.getView().animate().alpha(0.0f).withLayer();
            }
            this.l.setUserVisibleHint(false);
            if (z) {
                buf.H(this).a(7, this);
            } else {
                buf.H(this).a(6, this);
            }
        }
    }

    public final void n() {
        if (!getFragmentManager().isDestroyed() && !this.w) {
            this.p.setText(null);
            if (this.g != null) {
                this.g.a();
            }
            this.m = false;
            this.n = false;
            if (y() != 2) {
                this.t.a(false);
            }
            this.t.a(300);
            a(this.l.j, 0.0f, 0);
            a(this.l.j);
            FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
            if (this.j != null) {
                beginTransaction.remove(this.j);
            }
            if (this.i != null) {
                beginTransaction.remove(this.i);
            }
            beginTransaction.commit();
            this.l.getView().animate().alpha(1.0f).withLayer();
            if (this.g == null || !this.g.isVisible()) {
                this.l.b();
                this.l.setUserVisibleHint(true);
            }
            atd atd = this.s;
            if (atd.b.a) {
                atd.b.b(true);
            }
            if (atd.b.b) {
                atd.b.a();
            }
            if (atd.a.k()) {
                atd.a(false, false);
            } else {
                atd.a(true, false);
            }
        }
    }

    public void onBackPressed() {
        if (!this.w) {
            if (this.o) {
                if (TextUtils.isEmpty(this.q) || (this.j != null && this.j.isVisible() && this.j.h.getCount() == 0)) {
                    n();
                }
                a(true, false);
            } else if (i()) {
                n();
                buf.y(this.h);
            } else {
                super.onBackPressed();
            }
        }
    }

    public final void o() {
        if (!i()) {
            a(true, this.q, false);
        }
    }

    public void a(String str) {
        this.G = str;
        if (this.j != null) {
            this.j.r = str;
        }
        Object a = axc.a(str, axc.a);
        if (!TextUtils.equals(this.p.getText(), a)) {
            if (this.g != null && this.g.isVisible()) {
                this.p.setText(a);
            } else if (!TextUtils.isEmpty(a)) {
                this.D = a;
                return;
            } else {
                return;
            }
        }
        try {
            if (this.g != null && this.g.isVisible()) {
                DialpadFragment dialpadFragment = this.g;
                if ("01189998819991197253".equals(a)) {
                    if (dialpadFragment.c == null) {
                        dialpadFragment.c = new aou(new aoy(dialpadFragment));
                    }
                    aou aou = dialpadFragment.c;
                    if (aou.b == null) {
                        Integer valueOf = Integer.valueOf(-16776961);
                        Integer valueOf2 = Integer.valueOf(-65536);
                        aou.b = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{valueOf, valueOf2});
                        aou.b.addUpdateListener(new aov(aou));
                        aou.b.addListener(new aow(aou));
                        aou.b.setDuration(200);
                        aou.b.setRepeatMode(2);
                        aou.b.setRepeatCount(6);
                    }
                    if (!aou.b.isStarted()) {
                        aou.b.start();
                    }
                } else if (dialpadFragment.c != null) {
                    dialpadFragment.c.a();
                }
            }
        } catch (Exception e) {
        }
    }

    public final boolean p() {
        if (this.m && this.j != null) {
            boolean z;
            arb arb = this.j;
            if (arb.o != null) {
                EmptyContentView emptyContentView = arb.o;
                if (emptyContentView.a.getVisibility() == 0 || emptyContentView.b.getVisibility() == 0 || emptyContentView.c.getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    z = true;
                    if (!z) {
                        a(true, true);
                        return true;
                    }
                }
            }
            z = false;
            if (z) {
                a(true, true);
                return true;
            }
        }
        return false;
    }

    public final void c(int i) {
        if (i == 1) {
            a(true, false);
            buf.y(this.h);
        }
    }

    public final void a(int i, int i2, PhoneFavoriteSquareTileView phoneFavoriteSquareTileView) {
        this.l.a(true);
    }

    public final void b(int i, int i2, PhoneFavoriteSquareTileView phoneFavoriteSquareTileView) {
    }

    public final void q() {
        this.l.a(false);
    }

    public final void r() {
    }

    public final void a(aqe aqe) {
        this.r = aqe;
        this.l.c.a = aqe;
    }

    public final void s() {
        if (this.l != null) {
            this.l.c(2);
        }
    }

    public final void t() {
        b(true);
    }

    public final void a(Uri uri, boolean z, int i) {
        Uri uri2;
        this.y = true;
        Object apl = new apl(this, 1, null, z, i);
        if (apl.e != null) {
            apl.e.reset();
        }
        apl.d = true;
        String uri3 = uri.toString();
        if (uri3.startsWith(Contacts.CONTENT_URI.toString())) {
            if (uri3.endsWith("data")) {
                uri2 = uri;
            } else {
                uri2 = Uri.withAppendedPath(uri, "data");
            }
        } else if (uri3.startsWith(Data.CONTENT_URI.toString())) {
            uri2 = uri;
        } else {
            uri3 = String.valueOf(uri);
            throw new UnsupportedOperationException(new StringBuilder(String.valueOf(uri3).length() + 53).append("Input Uri must be contact Uri or data Uri (input: \"").append(uri3).append("\")").toString());
        }
        apl.e = new CursorLoader(apl.c, uri2, apl.b, "mimetype IN ('vnd.android.cursor.item/phone_v2', 'vnd.android.cursor.item/sip_address') AND data1 NOT NULL", null, null);
        apl.e.registerListener(0, apl);
        apl.e.startLoading();
    }

    public final void a(String str, boolean z, int i) {
        if (str == null) {
            str = "";
        }
        arq arq = new arq(str);
        arq.c = z;
        arq.a = i;
        buf.d((Context) this, arq.a());
        this.y = true;
    }

    public final void a(Intent intent) {
        String valueOf = String.valueOf(intent);
        Log.w("DialtactsActivity", new StringBuilder(String.valueOf(valueOf).length() + 41).append("Unsupported intent has come (").append(valueOf).append("). Ignoring.").toString());
    }

    public final void b_() {
        n();
    }

    public final void a(int i, float f, int i2) {
        int i3 = this.l.j;
        boolean k = buf.k();
        if (!k && i3 == 0 && !this.A) {
            this.t.a(f);
        } else if (k && i3 == 1 && !this.A) {
            this.t.a(1.0f - f);
        } else if (i3 != 0) {
            this.t.a(1.0f);
        }
    }

    public final void a(int i) {
        z();
        int i2 = this.l.j;
        this.O = i2;
        if (i2 == 2) {
            this.t.a(getResources().getDrawable(cob.aC), getResources().getString(cob.cN));
        } else {
            this.t.a(getResources().getDrawable(cob.an), getResources().getString(cob.aW));
        }
    }

    public final void a_(int i) {
    }

    public final boolean u() {
        atd atd = this.s;
        return (atd.c || atd.b.b) ? false : true;
    }

    public final boolean v() {
        return this.o;
    }

    public final int w() {
        if (this.g == null) {
            return 0;
        }
        DialpadFragment dialpadFragment = this.g;
        if (dialpadFragment.a == null) {
            return 0;
        }
        return dialpadFragment.a.getHeight();
    }

    public final int x() {
        return this.N;
    }

    public final int y() {
        if (this.A || i() || this.l.j != 0) {
            return 2;
        }
        return 0;
    }

    private final void z() {
        if (this.O == 1) {
            aqg aqg = this.l;
            if (aqg.k != null) {
                avq avq = aqg.k;
                if (buf.h(avq.b)) {
                    ContentValues contentValues = new ContentValues(1);
                    contentValues.put("is_read", "1");
                    avq.startUpdate(56, null, Calls.CONTENT_URI, contentValues, avq.d(), null);
                }
                axk.b(aqg.getActivity());
            }
        }
    }

    public final void d(int i) {
        e().a().c(i);
    }
}
