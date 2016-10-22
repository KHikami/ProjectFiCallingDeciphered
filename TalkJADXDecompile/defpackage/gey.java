package defpackage;

import android.content.Context;
import android.telecom.DisconnectCause;
import android.telecom.RemoteConnection;
import com.google.android.apps.hangouts.telephony.TeleConnectionService;
import java.util.Collections;
import java.util.List;

/* renamed from: gey */
public class gey {
    gee a;

    public void a(bko bko, String str) {
        if (this.a != null) {
            gee gee = this.a;
            gee.b.b(bko.a());
            gee.b.a(bko.g());
            TeleConnectionService d = gee.b.d();
            String f = gee.b.f().f();
            if (glq.a(gwb.H(), gee.b.f().e())) {
                f = glq.b(gwb.H(), f);
            }
            String str2 = "Babel_telephony";
            String str3 = "TeleOutgoingCallRequest.startWifiCall, outgoing phone number: ";
            String valueOf = String.valueOf(gwb.G(f));
            if (valueOf.length() != 0) {
                valueOf = str3.concat(valueOf);
            } else {
                valueOf = new String(str3);
            }
            glk.c(str2, valueOf, new Object[0]);
            edk a = gwb.a(gwb.H(), f, gwb.au(), false, null, f, 0);
            List singletonList = Collections.singletonList(a);
            dgg a2 = dgg.a();
            if (a2.t() && gfj.a(d)) {
                gfj.a(d, gee.b);
                str2 = String.valueOf(gee.b);
                glk.c("Babel_telephony", new StringBuilder(String.valueOf(str2).length() + 67).append("TeleOutgoingCallRequest.startWifiCall, inviting to existing hangout").append(str2).toString(), new Object[0]);
                a2.b(singletonList);
                gfp.a(d, gee.b);
            } else if (dgg.a().n()) {
                glk.c("Babel_telephony", "TeleOutgoingCallRequest.startWifiCall, hangout in progress, cancelling", new Object[0]);
                gee.b();
            } else {
                String valueOf2 = String.valueOf(gee.b);
                glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf2).length() + 61).append("TeleOutgoingCallRequest.startWifiCall, creating a new hangout").append(valueOf2).toString(), new Object[0]);
                muo muo = new muo();
                mup D = gwb.D(gee.b.d());
                if (D != null) {
                    muo.d = D;
                }
                if (glq.d(gwb.H(), f)) {
                    muq N = gwb.N(gee.a);
                    if (N != null) {
                        muo.b = N;
                    }
                    if (gee.b.w()) {
                        glk.c("Babel_telephony", "TeleOutgoingCallRequest.startWifiCall, setting timestamp for emergency LTE call", new Object[0]);
                        ggc.a(gee.a).b(System.currentTimeMillis());
                    }
                }
                a2.a(new dib(bko.a(), 1).a(2).i(f).e(str).a(), false, singletonList, false, a, 85, true, 1, true, gee.c, muo, gee.b.i());
                a2.v();
                if (gee.b.t() != null) {
                    a2.s().f(gee.b.t().a());
                }
                if (!gee.b.v()) {
                    a2.s().f("tycho_network_auto");
                }
            }
            gcc gfj = new gfj(gee.a, null, null, false);
            gee.b.a(gfj);
            gfj.a(a2.s());
            gee.b.setDialing();
            if (gee.b.f().n()) {
                gee.b.setAddress(gee.b.f().i().getAddress(), 1);
            }
            gee.c();
            this.a = null;
        }
    }

    public void a() {
        if (this.a != null) {
            gee gee = this.a;
            if (gwb.a(gee.a, "babel_remote_connection_allowed", true)) {
                Context d = gee.b.d();
                RemoteConnection createRemoteOutgoingConnection = d.createRemoteOutgoingConnection(gwb.J(d), gee.b.e());
                if (createRemoteOutgoingConnection == null) {
                    glk.e("Babel_telephony", "TeleOutgoingCallRequest.startCellularCall, unable to create remote connection", new Object[0]);
                    gee.b.setDisconnected(new DisconnectCause(10));
                } else {
                    glk.c("Babel_telephony", "TeleOutgoingCallRequest.startCellularCall, starting remote cellular call", new Object[0]);
                    gee.b.a(new gel(gee.a, createRemoteOutgoingConnection, null, null, gee.b.i(), false));
                }
            } else {
                glk.c("Babel_telephony", "TeleOutgoingCallRequest.startCellularCall, remote connection disallowed by gservices", new Object[0]);
                gee.b.setDisconnected(new DisconnectCause(10));
            }
            gee.c();
            this.a = null;
        }
    }

    public void b() {
        if (this.a != null) {
            this.a.b();
            this.a = null;
        }
    }

    gey(gee gee) {
        this.a = gee;
    }

    void c() {
        this.a = null;
    }
}
