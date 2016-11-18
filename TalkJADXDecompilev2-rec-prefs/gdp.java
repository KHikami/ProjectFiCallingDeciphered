package p000;

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
    final Handler f14778a = new Handler();
    private final Context f14779b;
    private final gds f14780c;
    private final gcv f14781d;
    private final gcq f14782e;
    private final gdo f14783f;
    private final long f14784g = System.currentTimeMillis();
    private gfj f14785h;
    private itg f14786i;
    private WakeLock f14787j;
    private boolean f14788k;

    gdp(Context context, gds gds, TeleConnectionService teleConnectionService, ConnectionRequest connectionRequest, gcv gcv, WakeLock wakeLock) {
        this.f14779b = context;
        this.f14780c = gds;
        this.f14781d = gcv;
        this.f14787j = wakeLock;
        if (wakeLock != null) {
            wakeLock.acquire();
        }
        this.f14783f = gdo.m17063a(connectionRequest.getExtras());
        this.f14782e = new gcq(new gef(teleConnectionService, new ConnectionRequest(connectionRequest.getAccountHandle(), gwb.m1390F(this.f14783f.f14771b), connectionRequest.getExtras()), new gec(teleConnectionService, get.m17420a(teleConnectionService)), true));
        this.f14782e.m16952c();
        this.f14782e.m16943a(this.f14783f.f14774e);
        this.f14782e.m16954c(this.f14783f.f14776g);
    }

    gcq m17071a() {
        glk.m17979c("Babel_telephony", "TeleIncomingWifiCallRequest.startRequest", new Object[0]);
        boolean a = gwb.m1896a(this.f14779b, this.f14783f.f14775f, this.f14783f.f14770a);
        if (this.f14781d != null && this.f14781d.m16989a(this.f14782e.m16957e(), true)) {
            glk.m17979c("Babel_telephony", "TeleIncomingWifiCallRequest.startRequest, call is duplicate", new Object[0]);
            this.f14782e.setDisconnected(new DisconnectCause(4));
            gwb.m1745a(this.f14779b, this.f14783f.f14775f, this.f14783f.f14771b, 2337);
            m17070f();
        } else if (a) {
            this.f14785h = new gfj(this.f14779b, this, null, true);
            this.f14782e.m16940a(this.f14785h);
            this.f14782e.setRinging();
            this.f14782e.m16950b(this.f14783f.f14770a.m11885a());
            this.f14782e.m16938a(this.f14783f.f14775f);
            if (!dgg.m11692a().m11722n()) {
                m17069e();
            }
            if (((TelephonyManager) this.f14779b.getSystemService("phone")).getCallState() != 1) {
                glk.m17979c("Babel_telephony", "TeleIncomingWifiCallRequest.checkEmergencyCallbackWorkaround, no other incoming calls on device", new Object[0]);
                a = false;
            } else {
                String c = this.f14782e.m16959f().m17141c();
                if (TextUtils.isEmpty(c)) {
                    glk.m17979c("Babel_telephony", "TeleIncomingWifiCallRequest.checkEmergencyCallbackWorkaround, empty number", new Object[0]);
                    a = false;
                } else if (glq.m18019d(this.f14779b, c)) {
                    glk.m17979c("Babel_telephony", "TeleIncomingWifiCallRequest.checkEmergencyCallbackWorkaround, call is from an emergency number", new Object[0]);
                    a = true;
                } else if (c.startsWith("+") && glq.m18019d(this.f14779b, c.substring(1))) {
                    glk.m17979c("Babel_telephony", "TeleIncomingWifiCallRequest.checkEmergencyCallbackWorkaround, call is from an emergency number (using substring)", new Object[0]);
                    a = true;
                } else {
                    glk.m17979c("Babel_telephony", "TeleIncomingWifiCallRequest.checkEmergencyCallbackWorkaround, call is not from an emergency number", new Object[0]);
                    a = false;
                }
            }
            this.f14788k = a;
            gwb.m1751a(this.f14779b, this.f14782e);
            gwb.m1745a(this.f14779b, this.f14783f.f14775f, this.f14783f.f14771b, 2336);
        } else {
            glk.m17979c("Babel_telephony", "TeleIncomingWifiCallRequest.startRequest, pending invite was cancelled", new Object[0]);
            this.f14782e.setDisconnected(new DisconnectCause(5));
            gwb.m1745a(this.f14779b, this.f14783f.f14775f, this.f14783f.f14771b, 2336);
            m17070f();
        }
        return this.f14782e;
    }

    boolean m17072a(dhz dhz, int i) {
        if (!this.f14783f.f14770a.equals(dhz)) {
            return false;
        }
        if (this.f14785h != null) {
            this.f14785h.m17531b(i);
        }
        m17070f();
        return true;
    }

    public void mo2196b() {
        glk.m17979c("Babel_telephony", "TeleIncomingWifiCallRequest.onAnswer", new Object[0]);
        if (this.f14785h.m17552p() == null && dgg.m11692a().m11722n()) {
            glk.m17979c("Babel_telephony", "TeleIncomingWifiCallRequest.onAnswer, exiting existing hangout", new Object[0]);
            iil.m21872a("Expected null", this.f14786i);
            this.f14786i = new gdq(this);
            dgg.m11692a().m11701a(this.f14786i);
            dgg.m11692a().m11727s().m11973b(11006);
            return;
        }
        m17075d();
    }

    public void mo2197c() {
        glk.m17979c("Babel_telephony", "TeleIncomingWifiCallRequest.onReject, treatRejectAsDismiss: " + this.f14788k, new Object[0]);
        if (!this.f14788k) {
            m17068a(2);
        }
        if (this.f14785h.m17552p() != null) {
            this.f14785h.m17552p().m11973b(11011);
        }
        m17070f();
    }

    void m17075d() {
        glk.m17979c("Babel_telephony", "TeleIncomingWifiCallRequest.performAnswer, answering call", new Object[0]);
        m17068a(1);
        if (this.f14785h.m17552p() == null) {
            m17069e();
        }
        dgg.m11692a().m11730v();
        this.f14782e.setActive();
        this.f14782e.m16977x();
        m17070f();
    }

    private void m17069e() {
        boolean z = true;
        dgg.m11692a().m11697a(this.f14783f.f14770a, false, null, z, gwb.m1599a(gwb.m1400H(), this.f14782e.m16959f().m17144f(), gwb.au(), false, null, null, 0), 86, true, 1, true, SystemClock.elapsedRealtime(), null, this.f14782e.m16962i());
        this.f14785h.m17522a(dgg.m11692a().m11727s());
    }

    private void m17068a(int i) {
        glk.m17979c("Babel_telephony", "TeleIncomingWifiCallRequest.sendIncomingHangoutInviteResponse, HangoutInvitationAck.UserAction: " + i, new Object[0]);
        mbr mbr = new mbr();
        mbr.f27262a = Long.valueOf(this.f14783f.f14772c);
        mbr.f27263b = this.f14783f.f14770a.m11897g();
        mbr.f27264c = Long.valueOf(this.f14784g * 1000);
        mbr.f27265d = Long.valueOf(System.currentTimeMillis() - this.f14784g);
        mbr.f27267f = Integer.valueOf(i);
        RealTimeChatService.m9030a(fde.m15018e(this.f14783f.f14775f), mbr);
    }

    private void m17070f() {
        glk.m17979c("Babel_telephony", "TeleIncomingWifiCallRequest.cleanupRequest", new Object[0]);
        if (this.f14786i != null) {
            dgg.m11692a().m11705b(this.f14786i);
            this.f14786i = null;
        }
        this.f14778a.removeCallbacksAndMessages(null);
        this.f14785h = null;
        this.f14780c.mo2191a(this);
        if (this.f14787j != null) {
            this.f14787j.release();
            this.f14787j = null;
        }
    }
}
