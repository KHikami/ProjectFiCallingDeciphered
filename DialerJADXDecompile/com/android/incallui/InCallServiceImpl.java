package com.android.incallui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.telecom.Call;
import android.telecom.CallAudioState;
import android.telecom.DisconnectCause;
import android.telecom.InCallService;
import android.telecom.PhoneAccountHandle;
import android.telephony.TelephonyManager;
import aup;
import axs;
import ayl;
import aym;
import ayo;
import azs;
import baa;
import bbc;
import bbq;
import bbt;
import bcj;
import bco;
import bcp;
import bcq;
import bcv;
import bcx;
import bda;
import bde;
import bdf;
import bdk;
import bdn;
import bdp;
import bdx;
import bez;
import buf;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public class InCallServiceImpl extends InCallService {
    public void onBringToForeground(boolean z) {
        bcj b = bcj.b();
        bdf.d(b, "Bringing UI to foreground.");
        b.c(z);
    }

    public void onCallAdded(Call call) {
        boolean z;
        bcj b = bcj.b();
        bde bde = new bde(call);
        if (call.getState() != 2) { //as long as phone is not rining => z = false
            z = false;
        } else if (buf.b(call)) { //is callee emergency # => z = false
            bdf.d(b, "Not attempting to block incoming emergency call");
            z = false;
        } else if (buf.C(b.i)) { //is caller possibly an emergency number
            bdf.d(b, "Not attempting to block incoming call due to recent emergency call");
            z = false;
        } else if (call.getDetails().hasProperty(64)) {
            z = false; //is an External Call (as in not calling self)
        } else {
            z = true; //z is set to true
        }
        if (z) { //block the call?
            String g = buf.g(b.i);
            String c = buf.c(call);
            long currentTimeMillis = System.currentTimeMillis();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            Handler handler = new Handler();
            Runnable bco = new bco(b, atomicBoolean, bde, call);
            handler.postDelayed(bco, 1000);
            b.t.a(new bcp(b, atomicBoolean, handler, bco, bde, call, c, currentTimeMillis), c, g);
        } else if (call.getDetails().hasProperty(64)) { //is External Call
            bbq bbq = b.l; //get related bbq for bcj
            if (call.getDetails().hasProperty(64)) {//verify still an external call???
                bbq.a.add(call);
                call.registerCallback(bbq.c, new Handler(Looper.getMainLooper()));
                bbq.b(call);
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            bde.a(); //set call's clock with call completion time
            b.k.a(b.i, call, bde); //azs.a(Context, call, call clock)
        }
        b.a(false, null); //make sure phone cannot make outbound call while servicing an incoming call
        call.registerCallback(b.n); //set the callBack to this call w/ bcj's callback
    }

    public void onCallRemoved(Call call) {
        bcj b = bcj.b();
        if (call.getDetails().hasProperty(64)) {
            b.l.a(call);
            return;
        }
        azs azs = b.k;
        Context context = b.i;
        if (azs.c.containsKey(call)) {
            ayo ayo = (ayo) azs.c.get(call);
            if (!(ayo.g == null || ayo.g.g)) {
                buf.L(context).a(ayo);
                ayo.g.g = true;
            }
            if (azs.g(ayo)) {
                String str = "Removing call not previously disconnected ";
                String valueOf = String.valueOf(ayo.d);
                bdf.e(azs, valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
            azs.a(ayo, null);
        }
        call.unregisterCallback(b.n);
    }

    public void onCanAddCallChanged(boolean z) {
        for (bcq a : bcj.b().b) {
            a.a();
        }
    }

    public IBinder onBind(Intent intent) {
        Context applicationContext = getApplicationContext();
        bbc a = bbc.a(applicationContext);
        Object b = bcj.b();
        Context applicationContext2 = getApplicationContext();
        azs azs = azs.a;
        bbq bbq = new bbq();
        ayl ayl = ayl.a;
        bdn bdn = new bdn(applicationContext, a);
        bbt bbt = new bbt(applicationContext, a);
        bdk bdk = new bdk(applicationContext, ayl.a, new axs(applicationContext));
        if (b.q) {
            bdf.d(b, "New service connection replacing existing one.");
            if (!(applicationContext2 == b.i && azs == b.k && ayl == b.e)) {
                throw new IllegalStateException();
            }
        }
        Objects.requireNonNull(applicationContext2);
        b.i = applicationContext2;
        b.h = a;
        b.f = bdn;
        b.g = bbt;
        b.a(b.f);
        b.e = ayl;
        b.p = bdk;
        b.a(b.p);
        b.a(b.s);
        b.a(b.s);
        b.k = azs;
        b.l = bbq;
        bbq.a(b.g);
        bbq.a(b.B);
        b.q = true;
        b.k.a((baa) b);
        b.u = new bez(applicationContext2);
        b.k.a(b.u);
        bcx a2 = bdx.a();
        a2.a("setUp");
        a2.a = (bcj) Objects.requireNonNull(b);
        a2.a.a((bcv) a2);
        a2.a.a(a2);
        bda bda = bda.a;
        Objects.requireNonNull(b);
        bda.b.add(b);
        b.t = new aup(applicationContext2);
        b.z = (TelephonyManager) applicationContext2.getSystemService("phone");
        b.z.listen(b.w, 32);
        bdf.a(b, "Finished InCallPresenter.setUp");
        bcj.b();
        bcj b2 = bcj.b();
        if (intent != null && b2.m == null) {
            Bundle bundleExtra = intent.getBundleExtra("android.telecom.extra.OUTGOING_CALL_EXTRAS");
            if (!(bundleExtra == null || bundleExtra.containsKey("selectPhoneAccountAccounts"))) {
                Point point = (Point) bundleExtra.getParcelable("touchPoint");
                bcj.b().a(true, (PhoneAccountHandle) intent.getParcelableExtra("android.telecom.extra.PHONE_ACCOUNT_HANDLE"));
                Intent b3 = b2.b(false, true);
                b3.putExtra("touchPoint", point);
                b2.i.startActivity(b3);
            }
        }
        bdp.a().a = this;
        return super.onBind(intent);
    }

    public boolean onUnbind(Intent intent) {
        super.onUnbind(intent);
        bcj.b();
        bcj.b().a(false, null);
        bdf.b((Object) this, "tearDown");
        bdp.a().a = null;
        Object b = bcj.b();
        bdf.a(b, "tearDown");
        azs azs = b.k;
        for (ayo ayo : azs.b.values()) {
            int c = ayo.c();
            if (!(c == 2 || c == 0 || c == 10)) {
                ayo.a(10);
                ayo.a(new DisconnectCause(0));
                azs.g(ayo);
            }
        }
        azs.m();
        b.q = false;
        b.j();
        b.z.listen(b.w, 0);
        bcx a = bdx.a();
        a.a("tearDown...");
        a.a.b((bcv) a);
        a.a.b(a);
        a.a = null;
        a.b = null;
        a.c = false;
        bda bda = bda.a;
        if (b != null) {
            bda.b.remove(b);
        }
        return false;
    }

    public void onCallAudioStateChanged(CallAudioState callAudioState) {
        ayl ayl = ayl.a;
        boolean isMuted = callAudioState.isMuted();
        int route = callAudioState.getRoute();
        int supportedRouteMask = callAudioState.getSupportedRouteMask();
        if (ayl.c != route) {
            ayl.c = route;
            for (aym b : ayl.b) {
                b.b(ayl.c);
            }
        }
        if (ayl.d != isMuted) {
            ayl.d = isMuted;
            for (aym b2 : ayl.b) {
                b2.a(ayl.d);
            }
        }
        ayl.e = supportedRouteMask;
        for (aym b22 : ayl.b) {
            b22.c(ayl.e);
        }
    }
}
