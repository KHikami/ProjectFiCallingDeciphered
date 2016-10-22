import android.content.Context;
import android.os.Handler;
import android.os.PowerManager.WakeLock;
import android.os.SystemClock;
import android.telecom.ConnectionRequest;
import android.telecom.DisconnectCause;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.telephony.TeleConnectionService;

final class gdp implements gfn {
    final Handler a;
    private final Context b;
    private final gds c;
    private final gcv d;
    private final gcq e;
    private final gdo f;
    private final long g;
    private gfj h;
    private itg i;
    private WakeLock j;
    private boolean k;

    gdp(Context context, gds gds, TeleConnectionService teleConnectionService, ConnectionRequest connectionRequest, gcv gcv, WakeLock wakeLock) {
        this.g = System.currentTimeMillis();
        this.a = new Handler();
        this.b = context;
        this.c = gds;
        this.d = gcv;
        this.j = wakeLock;
        if (wakeLock != null) {
            wakeLock.acquire();
        }
        this.f = gdo.a(connectionRequest.getExtras());
        this.e = new gcq(new gef(teleConnectionService, new ConnectionRequest(connectionRequest.getAccountHandle(), gwb.F(this.f.b), connectionRequest.getExtras()), new gec(teleConnectionService, get.a(teleConnectionService)), true));
        this.e.c();
        this.e.a(this.f.e);
        this.e.c(this.f.g);
    }

    gcq a() {
        glk.c("Babel_telephony", "TeleIncomingWifiCallRequest.startRequest", new Object[0]);
        boolean a = gwb.a(this.b, this.f.f, this.f.a);
        if (this.d != null && this.d.a(this.e.e(), true)) {
            glk.c("Babel_telephony", "TeleIncomingWifiCallRequest.startRequest, call is duplicate", new Object[0]);
            this.e.setDisconnected(new DisconnectCause(4));
            gwb.a(this.b, this.f.f, this.f.b, 2337);
            f();
        } else if (a) {
            this.h = new gfj(this.b, this, null, true);
            this.e.a(this.h);
            this.e.setRinging();
            this.e.b(this.f.a.a());
            this.e.a(this.f.f);
            if (!dgg.a().n()) {
                e();
            }
            if (((TelephonyManager) this.b.getSystemService("phone")).getCallState() != 1) {
                glk.c("Babel_telephony", "TeleIncomingWifiCallRequest.checkEmergencyCallbackWorkaround, no other incoming calls on device", new Object[0]);
                a = false;
            } else {
                String c = this.e.f().c();
                if (TextUtils.isEmpty(c)) {
                    glk.c("Babel_telephony", "TeleIncomingWifiCallRequest.checkEmergencyCallbackWorkaround, empty number", new Object[0]);
                    a = false;
                } else if (glq.d(this.b, c)) {
                    glk.c("Babel_telephony", "TeleIncomingWifiCallRequest.checkEmergencyCallbackWorkaround, call is from an emergency number", new Object[0]);
                    a = true;
                } else if (c.startsWith("+") && glq.d(this.b, c.substring(1))) {
                    glk.c("Babel_telephony", "TeleIncomingWifiCallRequest.checkEmergencyCallbackWorkaround, call is from an emergency number (using substring)", new Object[0]);
                    a = true;
                } else {
                    glk.c("Babel_telephony", "TeleIncomingWifiCallRequest.checkEmergencyCallbackWorkaround, call is not from an emergency number", new Object[0]);
                    a = false;
                }
            }
            this.k = a;
            gwb.a(this.b, this.e);
            gwb.a(this.b, this.f.f, this.f.b, 2336);
        } else {
            glk.c("Babel_telephony", "TeleIncomingWifiCallRequest.startRequest, pending invite was cancelled", new Object[0]);
            this.e.setDisconnected(new DisconnectCause(5));
            gwb.a(this.b, this.f.f, this.f.b, 2336);
            f();
        }
        return this.e;
    }

    boolean a(dhz dhz, int i) {
        if (!this.f.a.equals(dhz)) {
            return false;
        }
        if (this.h != null) {
            this.h.b(i);
        }
        f();
        return true;
    }

    public void b() {
        glk.c("Babel_telephony", "TeleIncomingWifiCallRequest.onAnswer", new Object[0]);
        if (this.h.p() == null && dgg.a().n()) {
            glk.c("Babel_telephony", "TeleIncomingWifiCallRequest.onAnswer, exiting existing hangout", new Object[0]);
            iil.a("Expected null", this.i);
            this.i = new gdq(this);
            dgg.a().a(this.i);
            dgg.a().s().b(11006);
            return;
        }
        d();
    }

    public void c() {
        glk.c("Babel_telephony", "TeleIncomingWifiCallRequest.onReject, treatRejectAsDismiss: " + this.k, new Object[0]);
        if (!this.k) {
            a(2);
        }
        if (this.h.p() != null) {
            this.h.p().b(11011);
        }
        f();
    }

    void d() {
        glk.c("Babel_telephony", "TeleIncomingWifiCallRequest.performAnswer, answering call", new Object[0]);
        a(1);
        if (this.h.p() == null) {
            e();
        }
        dgg.a().v();
        this.e.setActive();
        this.e.x();
        f();
    }

    private void e() {
        boolean z = true;
        dgg.a().a(this.f.a, false, null, z, gwb.a(gwb.H(), this.e.f().f(), gwb.au(), false, null, null, 0), 86, true, 1, true, SystemClock.elapsedRealtime(), null, this.e.i());
        this.h.a(dgg.a().s());
    }

    private void a(int i) {
        glk.c("Babel_telephony", "TeleIncomingWifiCallRequest.sendIncomingHangoutInviteResponse, HangoutInvitationAck.UserAction: " + i, new Object[0]);
        mbr mbr = new mbr();
        mbr.a = Long.valueOf(this.f.c);
        mbr.b = this.f.a.g();
        mbr.c = Long.valueOf(this.g * 1000);
        mbr.d = Long.valueOf(System.currentTimeMillis() - this.g);
        mbr.f = Integer.valueOf(i);
        RealTimeChatService.a(fde.e(this.f.f), mbr);
    }

    private void f() {
        glk.c("Babel_telephony", "TeleIncomingWifiCallRequest.cleanupRequest", new Object[0]);
        if (this.i != null) {
            dgg.a().b(this.i);
            this.i = null;
        }
        this.a.removeCallbacksAndMessages(null);
        this.h = null;
        this.c.a(this);
        if (this.j != null) {
            this.j.release();
            this.j = null;
        }
    }
}
