package p000;

import android.content.Context;
import android.telecom.DisconnectCause;
import android.telecom.RemoteConnection;
import com.google.android.apps.hangouts.telephony.TeleConnectionService;
import java.util.Collections;
import java.util.List;

public class gey {
    gee f15122a;

    public void m17479a(bko bko, String str) {
        if (this.f15122a != null) {
            gee gee = this.f15122a;
            gee.f14834b.m16950b(bko.m5629a());
            gee.f14834b.m16938a(bko.m5638g());
            TeleConnectionService d = gee.f14834b.m16955d();
            String f = gee.f14834b.m16959f().m17144f();
            if (glq.m18007a(gwb.m1400H(), gee.f14834b.m16959f().m17143e())) {
                f = glq.m18008b(gwb.m1400H(), f);
            }
            String str2 = "Babel_telephony";
            String str3 = "TeleOutgoingCallRequest.startWifiCall, outgoing phone number: ";
            String valueOf = String.valueOf(gwb.m1397G(f));
            if (valueOf.length() != 0) {
                valueOf = str3.concat(valueOf);
            } else {
                valueOf = new String(str3);
            }
            glk.m17979c(str2, valueOf, new Object[0]);
            edk a = gwb.m1599a(gwb.m1400H(), f, gwb.au(), false, null, f, 0);
            List singletonList = Collections.singletonList(a);
            dgg a2 = dgg.m11692a();
            if (a2.m11728t() && gfj.m17505a(d)) {
                gfj.m17504a(d, gee.f14834b);
                str2 = String.valueOf(gee.f14834b);
                glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(str2).length() + 67).append("TeleOutgoingCallRequest.startWifiCall, inviting to existing hangout").append(str2).toString(), new Object[0]);
                a2.m11707b(singletonList);
                gfp.m17568a(d, gee.f14834b);
            } else if (dgg.m11692a().m11722n()) {
                glk.m17979c("Babel_telephony", "TeleOutgoingCallRequest.startWifiCall, hangout in progress, cancelling", new Object[0]);
                gee.m17127b();
            } else {
                String valueOf2 = String.valueOf(gee.f14834b);
                glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf2).length() + 61).append("TeleOutgoingCallRequest.startWifiCall, creating a new hangout").append(valueOf2).toString(), new Object[0]);
                muo muo = new muo();
                mup D = gwb.m1383D(gee.f14834b.m16955d());
                if (D != null) {
                    muo.f28393d = D;
                }
                if (glq.m18019d(gwb.m1400H(), f)) {
                    muq N = gwb.m1429N(gee.f14833a);
                    if (N != null) {
                        muo.f28391b = N;
                    }
                    if (gee.f14834b.m16976w()) {
                        glk.m17979c("Babel_telephony", "TeleOutgoingCallRequest.startWifiCall, setting timestamp for emergency LTE call", new Object[0]);
                        ggc.m17608a(gee.f14833a).m17621b(System.currentTimeMillis());
                    }
                }
                a2.m11697a(new dib(bko.m5629a(), 1).m11911a(2).m11920i(f).m11916e(str).m11910a(), false, singletonList, false, a, 85, true, 1, true, gee.f14835c, muo, gee.f14834b.m16962i());
                a2.m11730v();
                if (gee.f14834b.m16973t() != null) {
                    a2.m11727s().m11984f(gee.f14834b.m16973t().m16992a());
                }
                if (!gee.f14834b.m16975v()) {
                    a2.m11727s().m11984f("tycho_network_auto");
                }
            }
            gcc gfj = new gfj(gee.f14833a, null, null, false);
            gee.f14834b.m16940a(gfj);
            gfj.m17522a(a2.m11727s());
            gee.f14834b.setDialing();
            if (gee.f14834b.m16959f().m17152n()) {
                gee.f14834b.setAddress(gee.f14834b.m16959f().m17147i().getAddress(), 1);
            }
            gee.m17128c();
            this.f15122a = null;
        }
    }

    public void m17478a() {
        if (this.f15122a != null) {
            gee gee = this.f15122a;
            if (gwb.m1906a(gee.f14833a, "babel_remote_connection_allowed", true)) {
                Context d = gee.f14834b.m16955d();
                RemoteConnection createRemoteOutgoingConnection = d.createRemoteOutgoingConnection(gwb.m1409J(d), gee.f14834b.m16957e());
                if (createRemoteOutgoingConnection == null) {
                    glk.m17982e("Babel_telephony", "TeleOutgoingCallRequest.startCellularCall, unable to create remote connection", new Object[0]);
                    gee.f14834b.setDisconnected(new DisconnectCause(10));
                } else {
                    glk.m17979c("Babel_telephony", "TeleOutgoingCallRequest.startCellularCall, starting remote cellular call", new Object[0]);
                    gee.f14834b.m16940a(new gel(gee.f14833a, createRemoteOutgoingConnection, null, null, gee.f14834b.m16962i(), false));
                }
            } else {
                glk.m17979c("Babel_telephony", "TeleOutgoingCallRequest.startCellularCall, remote connection disallowed by gservices", new Object[0]);
                gee.f14834b.setDisconnected(new DisconnectCause(10));
            }
            gee.m17128c();
            this.f15122a = null;
        }
    }

    public void m17480b() {
        if (this.f15122a != null) {
            this.f15122a.m17127b();
            this.f15122a = null;
        }
    }

    gey(gee gee) {
        this.f15122a = gee;
    }

    void m17481c() {
        this.f15122a = null;
    }
}
