package com.google.android.apps.hangouts.hangout;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.Toast;
import ba;
import bc;
import bcn;
import bko;
import com.google.android.apps.hangouts.R$drawable;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import dgg;
import dgu;
import dhe;
import dhj;
import dhl;
import dhp;
import dhq;
import dhr;
import dhs;
import dht;
import dhu;
import dhv;
import dhz;
import did;
import djd;
import dkr;
import dlh;
import doh;
import edk;
import ehz;
import eia;
import eie;
import fde;
import fln;
import gie;
import giv;
import glk;
import gwb;
import icb;
import iih;
import iil;
import iro;
import irq;
import iry;
import ish;
import ism;
import isq;
import isr;
import ito;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import jca;
import juh;
import jyn;
import jzn;
import kae;
import wi;

public final class HangoutFragment extends jzn {
    public static final int a;
    private static final boolean at;
    private static final int au;
    private boolean aA;
    private djd aB;
    private ParticipantTrayView aC;
    private FocusedParticipantView aD;
    private dgu aE;
    private ProximityCoverView aF;
    private final dhu aG;
    private boolean aH;
    private Menu aI;
    private boolean aJ;
    private dhj aK;
    private int aL;
    private boolean aM;
    public ViewGroup aj;
    public bko ak;
    public int al;
    public ish am;
    public boolean an;
    public boolean ao;
    public boolean ap;
    public boolean aq;
    public boolean ar;
    public int as;
    private jca av;
    private dhz aw;
    private boolean ax;
    private dhs ay;
    private final ArrayList<dht> az;
    public eia b;
    public ehz c;
    public HangoutActivity d;
    public dhz e;
    public final dgg f;
    public AccessibilityManager g;
    public boolean h;
    public Button i;

    public HangoutFragment() {
        this.f = dgg.a();
        this.az = new ArrayList();
        this.al = 0;
        this.aG = new dhu(this);
    }

    static {
        kae kae = glk.g;
        at = false;
        au = ba.gg;
        a = ba.gh;
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.av = (jca) this.binder.a(jca.class);
        this.b = (eia) this.binder.a(eia.class);
        this.c = (ehz) this.binder.a(ehz.class);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.d = (HangoutActivity) activity;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.aw = this.d.m();
        if (glk.a("Babel_calls", 3)) {
            glk.a("Babel_calls", String.format(Locale.US, "HangoutFragment.onCreate: this=%s activity=%s hangoutRequest=%s", new Object[]{this, this.d, this.aw}), new Object[0]);
        }
        if (bundle == null) {
            this.e = this.aw.r();
        } else {
            this.e = (dhz) bundle.getParcelable("HangoutFragment_current_request");
            this.an = bundle.getBoolean("HangoutFragment_waiting_for_result");
            this.ax = bundle.getBoolean("HangoutFragment_hangout_initiated", false);
            this.ap = bundle.getBoolean("HangoutFragment_audio_muted_awaiting_result");
        }
        this.ak = fde.e(this.av.a());
        setHasOptionsMenu(true);
        this.g = (AccessibilityManager) this.d.getSystemService("accessibility");
        Intent intent = this.d.getIntent();
        boolean z = (this.aw.l() == 2 || intent.getBooleanExtra("hangout_mute_camera", false)) ? false : true;
        if (intent.getIntExtra("hangout_pstn_call", 2) == 1) {
            this.aL = 1;
        } else if (z) {
            this.aL = 3;
        } else {
            this.aL = 2;
        }
        List arrayList = new ArrayList();
        if (!this.c.a("android.permission.RECORD_AUDIO")) {
            arrayList.add("android.permission.RECORD_AUDIO");
        }
        if (!this.c.a("android.permission.CAMERA") && this.aL == 3) {
            arrayList.add("android.permission.CAMERA");
        }
        if (arrayList.size() > 0) {
            this.b.a(au, new dhp(this));
            this.b.a(new eie(au, 2656), arrayList);
        } else {
            this.ao = true;
        }
        if (!this.c.a("android.permission.CAMERA")) {
            this.b.a(a, new dhq(this));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        dhz dhz;
        String g;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(gwb.gA, null);
        this.aB = new djd(this, viewGroup2);
        ((doh) jyn.a(this.d, doh.class)).a((Snackbar) viewGroup2.findViewById(ba.cd));
        this.aE = new dgu(this.d, this.lifecycle);
        this.aC = (ParticipantTrayView) viewGroup2.findViewById(ba.cb);
        this.aC.a(this.aB);
        this.aD = (FocusedParticipantView) viewGroup2.findViewById(ba.bJ);
        this.aD.a(this.aB, this.aC);
        this.aC.a(this.aD);
        this.aF = (ProximityCoverView) viewGroup2.findViewById(ba.ek);
        this.h = false;
        BroadcastOverlayView broadcastOverlayView = (BroadcastOverlayView) viewGroup2.findViewById(ba.bC);
        this.i = (Button) viewGroup2.findViewById(ba.cQ);
        this.aj = (ViewGroup) viewGroup2.findViewById(ba.cR);
        String e = this.aw.e();
        Context context = this.d;
        bko bko = this.ak;
        did s = this.f.s();
        if (s == null) {
            dhz = this.aw;
        } else {
            dhz = s.d();
        }
        if (dhz.q()) {
            g = dhz.g();
        } else {
            g = null;
        }
        this.aK = new dhj(context, bko, e, g);
        this.az.add(broadcastOverlayView);
        this.az.add(this.aD);
        this.az.add(this.aC);
        this.az.add(this.aB);
        this.az.add(this.aK);
        ((gie) this.binder.a(gie.class)).a(fln.class, new dhv(this), fln.a(e));
        return viewGroup2;
    }

    public void onConfigurationChanged(Configuration configuration) {
        ArrayList arrayList = this.az;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((dht) obj).onConfigurationChanged(configuration);
        }
    }

    private void c(boolean z) {
        Intent intent = this.d.getIntent();
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra("hangout_invitee_users");
        boolean booleanExtra = intent.getBooleanExtra("hangout_is_joining_non_empty_hangout", false);
        edk edk = (edk) intent.getParcelableExtra("pstn_caller");
        int intExtra = intent.getIntExtra("hangout_start_source", 51);
        int intExtra2 = intent.getIntExtra("hangout_pstn_call", 2);
        long longExtra = intent.getLongExtra("extra_hangout_start_time", 0);
        boolean z2 = z;
        this.f.a(this.aw.r(), z2, arrayList, booleanExtra, edk, intExtra, intent.getBooleanExtra("hangout_auto_join", false), this.aL, false, longExtra, null, null);
        did s = this.f.s();
        if (((TelephonyManager) gwb.H().getSystemService("phone")).getCallState() == 2) {
            a(null, 11013);
            a(3);
            s.b(11013);
            return;
        }
        this.f.x();
        if (this.aL == 3 && this.c.a("android.permission.CAMERA")) {
            a();
        }
        if (intent.getBooleanExtra("hangout_mute_microphone", false)) {
            this.f.a(true);
        }
        if (intent.getBooleanExtra("hangout_mute_playback", false)) {
            this.f.b(true);
        }
        ((iih) this.binder.a(iih.class)).a(((jca) this.binder.a(jca.class)).a()).a();
        s.a(intExtra2);
        if (this.ap) {
            this.f.a(true);
            this.ap = false;
        }
        this.ax = true;
    }

    public void a() {
        if (this.f.n()) {
            ito iro;
            glk.c("Babel_calls", "Creating camera capturer", new Object[0]);
            Context activity = getActivity();
            if (!icb.a(activity.getContentResolver(), "babel_hangout_enable_camera2", VERSION.SDK_INT >= 23 ? irq.a(activity) : false) || VERSION.SDK_INT < 21) {
                iro = new iro(activity);
            } else {
                iro = new irq(activity, false);
            }
            iro.b(true);
            iro.a(true);
            if (this.f.g() == null) {
                glk.e("Babel_calls", "Call was not created before initiating capturer", new Object[0]);
            } else {
                this.f.g().a(iro);
            }
            a(true);
            if (this.aC.f() != null) {
                this.aC.f().n();
            }
        }
    }

    public void b() {
        boolean z = true;
        if (this.aI != null && isAdded()) {
            MenuItem findItem = this.aI.findItem(ba.cL);
            int h = this.aG.h();
            findItem.setVisible(h != 0);
            if (h != 0) {
                if (h != 2) {
                    z = false;
                }
                findItem.setEnabled(z);
            }
            d();
            c();
        }
    }

    public void c() {
        if (this.aI != null && isAdded()) {
            MenuItem findItem = this.aI.findItem(ba.bT);
            findItem.setVisible(this.as == 0);
            if (findItem.isVisible() && findItem.isEnabled()) {
                int i = bc.eE;
                iry l = this.f.l();
                if (l != null) {
                    switch (l.h()) {
                        case wi.j /*1*/:
                            if (l.b()) {
                                i = bc.eF;
                                break;
                            }
                            break;
                        case wi.l /*2*/:
                            if (l.a()) {
                                i = bc.eG;
                                break;
                            }
                            break;
                        default:
                            glk.d("Babel_calls", "Unknown camera type: " + l.h(), new Object[0]);
                            break;
                    }
                }
                findItem.setTitle(getString(i));
            }
        }
    }

    public void d() {
        ism k = this.f.k();
        if (k != null) {
            a(k.c(), k.d());
        }
    }

    public void a(isr isr, Set<isq> set) {
        boolean z = true;
        int i = 0;
        if (this.aI != null && set != null) {
            MenuItem findItem = this.aI.findItem(ba.y);
            if (findItem != null) {
                int i2;
                if (set.size() <= 1) {
                    z = false;
                }
                findItem.setVisible(z);
                int i3 = bc.gd;
                switch (dhr.b[isr.ordinal()]) {
                    case wi.j /*1*/:
                    case wi.l /*2*/:
                    case wi.z /*3*/:
                        i = R$drawable.bL;
                        i2 = bc.ga;
                        break;
                    case wi.h /*4*/:
                        i = R$drawable.cp;
                        i2 = bc.gc;
                        break;
                    case wi.p /*5*/:
                        i = R$drawable.ci;
                        i2 = bc.gb;
                        break;
                    case wi.s /*6*/:
                        i = R$drawable.cc;
                        i2 = bc.gd;
                        break;
                    default:
                        i2 = i3;
                        break;
                }
                if (i != 0) {
                    findItem.setIcon(i);
                    Drawable icon = findItem.getIcon();
                    if (isr == isr.BLUETOOTH_TURNING_ON || isr == isr.BLUETOOTH_TURNING_OFF) {
                        i3 = 127;
                    } else {
                        i3 = 255;
                    }
                    icon.setAlpha(i3);
                }
                findItem.setTitle(getText(i2));
            }
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        menuInflater.inflate(gwb.hL, menu);
        this.aI = menu;
        c();
        MenuItem findItem = this.aI.findItem(ba.y);
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null || defaultAdapter.getProfileConnectionState(1) != 2) {
            boolean z2 = false;
        } else {
            int i = 1;
        }
        ism k = this.f.k();
        if (i != 0 || (k != null && k.l())) {
            z = true;
        }
        findItem.setVisible(z);
    }

    public void onPrepareOptionsMenu(Menu menu) {
        b();
    }

    public void onDestroyOptionsMenu() {
        super.onDestroyOptionsMenu();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == ba.cL) {
            gwb.f(889);
            this.aB.d();
        } else if (menuItem.getItemId() == ba.y) {
            this.aB.f();
        } else if (menuItem.getItemId() == ba.bT) {
            this.aB.e();
        }
        return false;
    }

    private void b(String str) {
        if (glk.a("Babel_calls", 3)) {
            glk.a("Babel_calls", String.format("Lifecycle HangoutFragment.%s(this=%s) activity=%s hangoutRequest=%s", new Object[]{str, this, this.d, this.aw}), new Object[0]);
        }
    }

    public void onStart() {
        super.onStart();
        b("onStart.enter");
        this.aH = true;
        e();
        b("onStart.done");
    }

    public void e() {
        if (this.aH && this.ao) {
            b("maybeDoStartup.enter");
            if (this.c.a("android.permission.RECORD_AUDIO")) {
                this.ay = new dhs(this);
                this.f.a(this.ay);
                iry l = this.f.l();
                if (l != null) {
                    l.a(x());
                }
                if (this.f.e() != null) {
                    this.ay.a(this.f.e().c());
                }
                int f = this.an ? 5 : f(false);
                glk.c("Babel_calls", String.format(Locale.US, "maybeDoStartup.changeUiState: %s->%s", new Object[]{c(this.al), c(f)}), new Object[0]);
                this.al = f;
                d(f);
                if (this.al == 4) {
                    b("maybeDoStartup.finish");
                    return;
                }
                if (this.f.g() != null) {
                    this.am = new ish(this.f.g());
                    this.am.a(4);
                }
                ArrayList arrayList = this.az;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((dht) obj).a(this.aG);
                }
                this.aA = true;
                this.aE.a(this.aG.c());
                this.aK.a(this.d.g());
            } else {
                e(bc.eL);
                a(3);
            }
            b("maybeDoStartup.done");
            return;
        }
        glk.a("Babel_calls", "maybeDoStartup: HangoutFragment not ready to start mOnStartComplete=" + this.aH + " mPermissionsRequested=" + this.ao, new Object[0]);
    }

    private int f(boolean z) {
        boolean booleanExtra = getActivity().getIntent().getBooleanExtra("hangout_auto_join", false);
        boolean d = ((dlh) this.binder.a(dlh.class)).d();
        glk.c("Babel_calls", "Is in Express Lane call: " + d, new Object[0]);
        if (this.f.n() || d) {
            if (d || !this.f.s().a((HangoutActivity) getActivity())) {
                glk.c("Babel_calls", "There's a different joined ongoing gcomm or EL call.", new Object[0]);
                this.aw.s();
                e(bc.em);
                return 3;
            }
            glk.c("Babel_calls", "Continuing call where previous activity left off.", new Object[0]);
            this.e = this.f.s().e();
            this.ax = true;
            if (booleanExtra || this.f.m()) {
                return 2;
            }
            return 1;
        } else if (this.ax) {
            dhe dhe;
            Context context = this.d;
            dhz dhz = this.e;
            SharedPreferences sharedPreferences = context.getSharedPreferences(dhe.class.getName(), 0);
            if (!(sharedPreferences.getBoolean("HISTORY_HAS_EVENT", false) && dhz.equals(dhz.a(sharedPreferences)))) {
                sharedPreferences = null;
            }
            if (sharedPreferences != null) {
                dhe = new dhe(sharedPreferences.getInt("HISTORY_ERROR", 11004), sharedPreferences.getBoolean("HISTORY_EXIT_REPORTED", false));
            } else {
                dhe = null;
            }
            if (dhe == null) {
                this.d.finish();
                return 4;
            }
            int a = dhe.a();
            if (dhe.b() || b(a)) {
                if (glk.a("Babel_calls", 3)) {
                    glk.a("Babel_calls", "Hangout previously exited: " + a, new Object[0]);
                }
                this.d.n();
                return 4;
            }
            a(null, a);
            dhe.a(this.d, this.e);
            return 3;
        } else {
            bko a2 = fde.a(this.aw.a());
            if (TextUtils.isEmpty(fde.g(a2.g()))) {
                fde.f(a2.g());
                a(null, 11019);
                return 3;
            }
            c(z);
            if (this.f.s() == null) {
                return 3;
            }
            if (!booleanExtra && !z) {
                return 1;
            }
            this.f.v();
            if (this.f.s() == null) {
                return 3;
            }
            return 2;
        }
    }

    boolean q() {
        if (this.h) {
            a(null, false);
            return true;
        } else if (this.al != 1) {
            return false;
        } else {
            this.f.f();
            return true;
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 0) {
            if (i2 == -1) {
                a(f(false));
                this.an = false;
                return;
            }
            this.d.n();
        } else if (i == 1) {
            this.h = false;
        } else if (i == 2 && i2 == -1) {
            juh juh = (juh) intent.getSerializableExtra("audience");
            List arrayList = new ArrayList();
            for (bcn h : juh.g()) {
                arrayList.add(h.h());
            }
            dgg.a().b(arrayList);
        }
    }

    public void onResume() {
        b("onResume.enter");
        super.onResume();
        if (dkr.a(getContext())) {
            glk.c("Babel_calls", "Using service proximity.", new Object[0]);
            this.f.b();
        } else {
            glk.c("Babel_calls", "Using legacy proximity.", new Object[0]);
            this.aF.a(this.aB);
            this.aF.a(this.aB);
        }
        if (this.f.o()) {
            b(true);
        }
        b("onResume.done");
    }

    public void onPause() {
        b("onPause.enter");
        super.onPause();
        this.aF.b();
        this.aF.d();
        this.aF.e();
        b("onPause.done");
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("HangoutFragment_current_request", this.e);
        bundle.putBoolean("HangoutFragment_waiting_for_result", this.an);
        bundle.putBoolean("HangoutFragment_hangout_initiated", this.ax);
        bundle.putBoolean("HangoutFragment_audio_muted_awaiting_result", this.ap);
        this.aM = false;
    }

    public void a(boolean z) {
        if (this.f.s() != null) {
            this.f.s().a(z);
        }
    }

    private boolean x() {
        if (this.f.s() != null) {
            return this.f.s().h();
        }
        return false;
    }

    public void onStop() {
        b("onStop.enter");
        super.onStop();
        iry l = this.f.l();
        if (l != null) {
            a(l.g());
            l.a(false);
        }
        if (this.ay != null) {
            this.f.b(this.ay);
            this.ay = null;
        }
        if (this.al == 4) {
            b("onStop.finish");
            return;
        }
        if (this.aA) {
            ArrayList arrayList = this.az;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((dht) obj).y_();
            }
            b("onStop.stopped");
        }
        if (this.am != null) {
            this.am.a();
            this.am = null;
        }
        b("onStop.done");
    }

    public void onDestroy() {
        b("onDestroy.enter");
        super.onDestroy();
        b("onDestroy.done");
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.aM = true;
    }

    private static String c(int i) {
        switch (i) {
            case wi.w /*0*/:
                return "START";
            case wi.j /*1*/:
                return "GREEN_ROOM";
            case wi.l /*2*/:
                return "HANGOUT";
            case wi.z /*3*/:
                return "ERROR_DIALOG";
            case wi.h /*4*/:
                return "ACTIVITY_FINISHED";
            case wi.p /*5*/:
                return "WAITING_FOR_RESULT";
            default:
                String str = "UNKNOWN_";
                String valueOf = String.valueOf(String.valueOf(i));
                if (valueOf.length() != 0) {
                    return str.concat(valueOf);
                }
                return new String(str);
        }
    }

    public void a(int i) {
        glk.c("Babel_calls", String.format(Locale.US, "changeUiState: %s->%s", new Object[]{c(this.al), c(i)}), new Object[0]);
        if (i != this.al) {
            this.al = i;
            d(i);
            if (i == 2) {
                iil.a(Integer.valueOf(this.aG.c()), Integer.valueOf(2));
                if (this.e.l() != 2) {
                    s();
                }
            }
            ArrayList arrayList = this.az;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((dht) obj).a(i);
            }
            this.aE.a(i);
        }
    }

    public void s() {
        this.d.getWindow().addFlags(128);
    }

    private static void d(int i) {
        int i2 = 1586;
        switch (i) {
            case wi.j /*1*/:
                i2 = 1588;
                break;
            case wi.l /*2*/:
                i2 = 1589;
                break;
            case wi.z /*3*/:
                i2 = 1590;
                break;
            case wi.h /*4*/:
                i2 = 1587;
                break;
            case wi.p /*5*/:
                i2 = 2389;
                break;
            default:
                iil.a("Call in unknown UI state: " + i);
                break;
        }
        gwb.f(i2);
    }

    public void b(boolean z) {
        iil.a("Expected condition to be true", this.f.o());
        ((DebugOverlayTextView) getView().findViewById(ba.bF)).a(this.f.g());
        if (z || !this.aJ) {
            this.aF.a();
        }
        if (!this.aJ) {
            w();
            this.aJ = true;
        }
    }

    private void e(int i) {
        String string = getResources().getString(i);
        if (glk.a("Babel_calls", 3)) {
            glk.a("Babel_calls", String.format(Locale.US, "showError:%s (%s)", new Object[]{string, this.d}), new Object[0]);
        }
        dhl.a(string, 10000).a(getFragmentManager(), null);
    }

    public void a(String str, int i) {
        if (this.aM) {
            dhl.a(str, i).a(getFragmentManager(), null);
            return;
        }
        Toast.makeText(getActivity(), dhl.a(getContext(), str, i), 1).show();
        ((HangoutActivity) getActivity()).n();
    }

    dhz t() {
        return this.e;
    }

    String u() {
        return t().e();
    }

    public static boolean b(int i) {
        return i == 11004 || i == 10030 || i == 11005 || i == 11011 || i == 11010;
    }

    public int v() {
        if (this.al != 2 || this.f.s() == null) {
            return this.d.getIntent().getIntExtra("hangout_pstn_call", 2);
        }
        return this.f.s().J();
    }

    public void a(String str, boolean z) {
        if (this.h != z) {
            int i;
            if (z) {
                startActivityForResult(gwb.B(str), 1);
            }
            this.h = z;
            w();
            if (this.h) {
                i = 1582;
            } else {
                i = 1583;
            }
            gwb.f(i);
        }
    }

    public void w() {
        if (!giv.c()) {
            if (this.f.u() || this.h) {
                this.d.setRequestedOrientation(1);
            } else {
                this.d.setRequestedOrientation(-1);
            }
        }
    }

    public void r() {
        this.ax = false;
        this.an = false;
        int f = f(true);
        if (this.am != null) {
            this.am.a();
            this.am = new ish(this.f.g());
        }
        if (this.c.a("android.permission.CAMERA")) {
            a();
        }
        a(f);
    }
}
