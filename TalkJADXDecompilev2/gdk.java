package defpackage;

import android.content.Context;
import android.os.PowerManager.WakeLock;
import android.telecom.ConnectionRequest;
import android.telecom.TelecomManager;
import com.google.android.apps.hangouts.telephony.TeleConnectionService;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class gdk implements dis, gdn, gds {
    private final TelecomManager a;
    private final List<gdl> b = new CopyOnWriteArrayList();
    private final List<gdp> c = new CopyOnWriteArrayList();

    gdk(TelecomManager telecomManager) {
        this.a = telecomManager;
    }

    static int b(Context context, bko bko) {
        biw g = gwb.g(context);
        if (g.a("babel_incoming_wifi_calls_allowed", true)) {
            ggc a = ggc.a(context);
            if (!a.c()) {
                glk.c("Babel_telephony", "TeleIncomingWifiCallController.getRegistrationState, wifi calling not enabled", new Object[0]);
                return 1;
            } else if (bko.g() == a.f()) {
                return 3;
            } else {
                if (gwb.L(context)) {
                    if (bko.g() != a.b()) {
                        glk.c("Babel_telephony", String.format("TeleIncomingWifiCallController.getRegistrationState, account: %s, index: %d, doesn't match calling account index: %d", new Object[]{gwb.J((Object) bko), Integer.valueOf(bko.g()), Integer.valueOf(a.b())}), new Object[0]);
                        return 1;
                    } else if (bko.I() == 0) {
                        glk.c("Babel_telephony", "TeleIncomingWifiCallController.getRegistrationState, voip calling status is unknown", new Object[0]);
                        return 2;
                    } else if (!g.a("babel_incoming_wifi_calls_require_google_voice_integration", true) || !glq.b(gwb.H()) || bko.b(glq.f(gwb.H()))) {
                        return 3;
                    } else {
                        glk.c("Babel_telephony", "TeleIncomingWifiCallController.getRegistrationState, cell phone number doesn't match Google Voice number", new Object[0]);
                        return 1;
                    }
                }
                glk.c("Babel_telephony", "TeleIncomingWifiCallController.getRegistrationState, not connection manager", new Object[0]);
                return 1;
            }
        }
        glk.c("Babel_telephony", "TeleIncomingWifiCallController.getRegistrationState, not allowed by gservices", new Object[0]);
        return 1;
    }

    public boolean a(Context context, bko bko) {
        return gdk.b(context, bko) == 3;
    }

    public boolean a(Context context, bko bko, dhz dhz, String str, long j) {
        gwb.aJ();
        String valueOf = String.valueOf(dhz);
        String valueOf2 = String.valueOf(gwb.G(str));
        glk.c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 92) + String.valueOf(valueOf2).length()).append("TeleIncomingWifiCallController.onInviteToPhoneNumber, hangoutRequest: ").append(valueOf).append(", inviterPhoneNumber: ").append(valueOf2).toString(), new Object[0]);
        dhz dhz2 = dhz;
        String str2 = str;
        long j2 = j;
        gdl gdl = new gdl(context, this, this.a, new gdo(dhz2, str2, j2, glj.b(), gcw.a(context, gwb.i(gwb.H(), str), true, gfq.a(context)), bko.g(), false, new gec(context, get.a(context))), false);
        if (!gdl.a()) {
            return false;
        }
        this.b.add(gdl);
        gdl.b();
        return true;
    }

    public boolean a(Context context, int i, dhz dhz, int i2) {
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
        glk.c(str2, String.format(str3, objArr), new Object[0]);
        for (gdl a : this.b) {
            boolean z2;
            if (a.a(dhz)) {
                z2 = true;
            } else {
                z2 = z;
            }
            z = z2;
        }
        if (gwb.a(context, i, dhz)) {
            z = true;
        }
        for (gdp a2 : this.c) {
            if (a2.a(dhz, i2)) {
                z = true;
            }
        }
        return z;
    }

    public void a(gdl gdl) {
        gwb.aJ();
        this.b.remove(gdl);
    }

    public void a(gdp gdp) {
        this.c.remove(gdp);
    }

    public gcq a(TeleConnectionService teleConnectionService, ConnectionRequest connectionRequest, gcv gcv, WakeLock wakeLock) {
        gdp gdp = new gdp(teleConnectionService, this, teleConnectionService, connectionRequest, gcv, wakeLock);
        this.c.add(gdp);
        return gdp.a();
    }
}
