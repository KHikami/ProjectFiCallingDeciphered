package p000;

import android.content.Context;
import android.os.Build.VERSION;
import android.telecom.PhoneAccount.Builder;
import android.telecom.TelecomManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class gdt implements bcp, eni {
    private gdk f14791a;
    private final cxd f14792b = new cxe().m11190a("telephony").m11192b("Provide WiFi calling capability to Android system.").m11191a(true).m11189a();

    public cxd[] m17083a() {
        return new cxd[]{this.f14792b};
    }

    public bcp[] m17082a(Context context) {
        if (gdt.m17080h(context) != null) {
            return (bcp[]) this.f14792b.mo1451a(context, bcp.class, (Object) this);
        }
        return new bcp[0];
    }

    public dis[] m17084b(Context context) {
        m17079g(context);
        if (this.f14791a != null) {
            return (dis[]) this.f14792b.mo1451a(context, dis.class, this.f14791a);
        }
        return new dis[0];
    }

    public eni[] m17085c(Context context) {
        return (eni[]) this.f14792b.mo1451a(context, eni.class, (Object) this);
    }

    public gdk m17086d(Context context) {
        m17079g(context);
        return this.f14791a;
    }

    public void mo466a(Context context, boolean z, bcs bcs) {
        glk.m17979c("Babel_telephony", "TeleModule.onApplicationCreate", new Object[0]);
        bcs.mo469a(new gdu(this, context));
    }

    private void m17079g(Context context) {
        if (this.f14791a == null) {
            TelecomManager h = gdt.m17080h(context);
            if (h != null) {
                this.f14791a = new gdk(h);
            }
        }
    }

    private static TelecomManager m17080h(Context context) {
        if (VERSION.SDK_INT < 22) {
            return null;
        }
        if (!context.getPackageManager().hasSystemFeature("android.software.connectionservice")) {
            return null;
        }
        Object systemService = context.getSystemService("telecom");
        if (systemService == null) {
            return null;
        }
        return (TelecomManager) systemService;
    }

    public static void m17077e(Context context) {
        boolean z = true;
        boolean L = gwb.m1422L(context);
        String b = gwb.m1998b(context, "babel_user_to_allow_wifi_calling_for", "tycho_users");
        if (!"hangouts_testing_users".equals(b)) {
            if (!"tycho_users".equals(b)) {
                z = false;
            } else if (TextUtils.isEmpty(ggc.m17608a(context).m17633i())) {
                z = false;
            }
        }
        glk.m17979c("Babel_telephony", "TeleModule.updateConnectionManagerRegistration, registration preference changed from " + L + " to " + z, new Object[0]);
        if (L && !z) {
            gdt.m17080h(context).clearAccounts();
            gwb.m1455U(context);
        } else if (!L && z) {
            try {
                int i;
                TelecomManager h = gdt.m17080h(context);
                Builder builder = new Builder(gwb.m1409J(context), context.getString(gwb.vo));
                List arrayList = new ArrayList();
                arrayList.add("tel");
                if (TextUtils.isEmpty(ggc.m17608a(context).m17633i())) {
                    i = 2;
                } else {
                    i = 17;
                }
                h.registerPhoneAccount(builder.setCapabilities(i).setShortDescription(context.getString(gwb.vn)).setSupportedUriSchemes(arrayList).build());
                gwb.m1455U(context);
            } catch (Exception e) {
                String valueOf = String.valueOf(e);
                glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 69).append("TeleModule.updateConnectionManagerRegistration, registration failed, ").append(valueOf).toString(), new Object[0]);
            }
        }
    }

    public static void m17078f(Context context) {
        ggc a = ggc.m17608a(context);
        bko e = fde.m15018e(a.m17632h());
        bko e2 = fde.m15018e(ggc.m17608a(context).m17618b());
        if (e2 != null) {
            int b = gdk.m17046b(context, e2);
            switch (b) {
                case 1:
                    e2 = null;
                    break;
                case 2:
                    e2 = null;
                    break;
                case 3:
                    break;
                default:
                    iil.m21870a("Unknown registration state: " + b);
                    e2 = null;
                    break;
            }
        }
        e2 = null;
        String valueOf = String.valueOf(gwb.m1410J((Object) e));
        String valueOf2 = String.valueOf(gwb.m1410J((Object) e2));
        glk.m17979c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 98) + String.valueOf(valueOf2).length()).append("TeleModule.updateIncomingCallRegistration, preferred account for incoming calls changed from: ").append(valueOf).append(" to ").append(valueOf2).toString(), new Object[0]);
        if (!(e == null || e.equals(e2))) {
            fde.m15013c(e);
        }
        if (!(e2 == null || ((fbx) jyn.m25426a(context, fbx.class)).mo1974c(context, e2))) {
            glk.m17979c("Babel_telephony", "TeleModule.updateIncomingCallRegistration, registering new account", new Object[0]);
            fde.m15013c(e2);
        }
        if (!Objects.equals(e, e2)) {
            a.m17619b(e2 == null ? -1 : e2.m5638g());
        }
    }
}
