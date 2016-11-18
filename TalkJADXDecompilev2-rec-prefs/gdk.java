package p000;

import android.content.Context;
import android.os.PowerManager.WakeLock;
import android.telecom.ConnectionRequest;
import android.telecom.TelecomManager;
import com.google.android.apps.hangouts.telephony.TeleConnectionService;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class gdk implements dis, gdn, gds {
    private final TelecomManager f14757a;
    private final List<gdl> f14758b = new CopyOnWriteArrayList();
    private final List<gdp> f14759c = new CopyOnWriteArrayList();

    gdk(TelecomManager telecomManager) {
        this.f14757a = telecomManager;
    }

    static int m17046b(Context context, bko bko) {
        biw g = gwb.m2214g(context);
        if (g.mo564a("babel_incoming_wifi_calls_allowed", true)) {
            ggc a = ggc.m17608a(context);
            if (!a.m17626c()) {
                glk.m17979c("Babel_telephony", "TeleIncomingWifiCallController.getRegistrationState, wifi calling not enabled", new Object[0]);
                return 1;
            } else if (bko.m5638g() == a.m17630f()) {
                return 3;
            } else {
                if (gwb.m1422L(context)) {
                    if (bko.m5638g() != a.m17618b()) {
                        glk.m17979c("Babel_telephony", String.format("TeleIncomingWifiCallController.getRegistrationState, account: %s, index: %d, doesn't match calling account index: %d", new Object[]{gwb.m1410J((Object) bko), Integer.valueOf(bko.m5638g()), Integer.valueOf(a.m17618b())}), new Object[0]);
                        return 1;
                    } else if (bko.m5622I() == 0) {
                        glk.m17979c("Babel_telephony", "TeleIncomingWifiCallController.getRegistrationState, voip calling status is unknown", new Object[0]);
                        return 2;
                    } else if (!g.mo564a("babel_incoming_wifi_calls_require_google_voice_integration", true) || !glq.m18010b(gwb.m1400H()) || bko.m5633b(glq.m18025f(gwb.m1400H()))) {
                        return 3;
                    } else {
                        glk.m17979c("Babel_telephony", "TeleIncomingWifiCallController.getRegistrationState, cell phone number doesn't match Google Voice number", new Object[0]);
                        return 1;
                    }
                }
                glk.m17979c("Babel_telephony", "TeleIncomingWifiCallController.getRegistrationState, not connection manager", new Object[0]);
                return 1;
            }
        }
        glk.m17979c("Babel_telephony", "TeleIncomingWifiCallController.getRegistrationState, not allowed by gservices", new Object[0]);
        return 1;
    }

    public boolean mo2193a(Context context, bko bko) {
        return gdk.m17046b(context, bko) == 3;
    }

    public boolean mo2194a(Context context, bko bko, dhz dhz, String str, long j) {
        gwb.aJ();
        String valueOf = String.valueOf(dhz);
        String valueOf2 = String.valueOf(gwb.m1397G(str));
        glk.m17979c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 92) + String.valueOf(valueOf2).length()).append("TeleIncomingWifiCallController.onInviteToPhoneNumber, hangoutRequest: ").append(valueOf).append(", inviterPhoneNumber: ").append(valueOf2).toString(), new Object[0]);
        dhz dhz2 = dhz;
        String str2 = str;
        long j2 = j;
        gdl gdl = new gdl(context, this, this.f14757a, new gdo(dhz2, str2, j2, glj.m17963b(), gcw.m16990a(context, gwb.m2250i(gwb.m1400H(), str), true, gfq.m17570a(context)), bko.m5638g(), false, new gec(context, get.m17420a(context))), false);
        if (!gdl.m17058a()) {
            return false;
        }
        this.f14758b.add(gdl);
        gdl.m17060b();
        return true;
    }

    public boolean mo2192a(Context context, int i, dhz dhz, int i2) {
        String str;
        boolean z = false;
        gwb.aJ();
        String str2 = "Babel_telephony";
        String str3 = "TeleIncomingWifiCallController.onCancelInvite, hangoutRequest: %s, dismissReason: %s";
        Object[] objArr = new Object[2];
        objArr[0] = dhz;
        switch (i2) {
            case 0:
                str = "UNKNOWN";
                break;
            case 1:
                str = "USER_RESPONDED";
                break;
            case 2:
                str = "USER_KICKED";
                break;
            case 3:
                str = "INVITER_CANCELLED";
                break;
            case 4:
                str = "INVITE_TIMEOUT";
                break;
            default:
                str = "OTHER: " + i2;
                break;
        }
        objArr[1] = str;
        glk.m17979c(str2, String.format(str3, objArr), new Object[0]);
        for (gdl a : this.f14758b) {
            boolean z2;
            if (a.m17059a(dhz)) {
                z2 = true;
            } else {
                z2 = z;
            }
            z = z2;
        }
        if (gwb.m1896a(context, i, dhz)) {
            z = true;
        }
        for (gdp a2 : this.f14759c) {
            if (a2.m17072a(dhz, i2)) {
                z = true;
            }
        }
        return z;
    }

    public void mo1207a(gdl gdl) {
        gwb.aJ();
        this.f14758b.remove(gdl);
    }

    public void mo2191a(gdp gdp) {
        this.f14759c.remove(gdp);
    }

    public gcq m17047a(TeleConnectionService teleConnectionService, ConnectionRequest connectionRequest, gcv gcv, WakeLock wakeLock) {
        gdp gdp = new gdp(teleConnectionService, this, teleConnectionService, connectionRequest, gcv, wakeLock);
        this.f14759c.add(gdp);
        return gdp.m17071a();
    }
}
