package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.telecom.PhoneAccount.Builder;
import android.telecom.TelecomManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class gdt implements bcp, eni {
    private gdk a;
    private final cxd b = new cxe().a("telephony").b("Provide WiFi calling capability to Android system.").a(true).a();

    public cxd[] a() {
        return new cxd[]{this.b};
    }

    public bcp[] a(Context context) {
        if (gdt.h(context) != null) {
            return (bcp[]) this.b.a(context, bcp.class, (Object) this);
        }
        return new bcp[0];
    }

    public dis[] b(Context context) {
        g(context);
        if (this.a != null) {
            return (dis[]) this.b.a(context, dis.class, this.a);
        }
        return new dis[0];
    }

    public eni[] c(Context context) {
        return (eni[]) this.b.a(context, eni.class, (Object) this);
    }

    public gdk d(Context context) {
        g(context);
        return this.a;
    }

    public void a(Context context, boolean z, bcs bcs) {
        glk.c("Babel_telephony", "TeleModule.onApplicationCreate", new Object[0]);
        bcs.a(new gdu(this, context));
    }

    private void g(Context context) {
        if (this.a == null) {
            TelecomManager h = gdt.h(context);
            if (h != null) {
                this.a = new gdk(h);
            }
        }
    }

    private static TelecomManager h(Context context) {
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

    public static void e(Context context) {
        boolean z = true;
        boolean L = gwb.L(context);
        String b = gwb.b(context, "babel_user_to_allow_wifi_calling_for", "tycho_users");
        if (!"hangouts_testing_users".equals(b)) {
            if (!"tycho_users".equals(b)) {
                z = false;
            } else if (TextUtils.isEmpty(ggc.a(context).i())) {
                z = false;
            }
        }
        glk.c("Babel_telephony", "TeleModule.updateConnectionManagerRegistration, registration preference changed from " + L + " to " + z, new Object[0]);
        if (L && !z) {
            gdt.h(context).clearAccounts();
            gwb.U(context);
        } else if (!L && z) {
            try {
                int i;
                TelecomManager h = gdt.h(context);
                Builder builder = new Builder(gwb.J(context), context.getString(gwb.vo));
                List arrayList = new ArrayList();
                arrayList.add("tel");
                if (TextUtils.isEmpty(ggc.a(context).i())) {
                    i = 2;
                } else {
                    i = 17;
                }
                h.registerPhoneAccount(builder.setCapabilities(i).setShortDescription(context.getString(gwb.vn)).setSupportedUriSchemes(arrayList).build());
                gwb.U(context);
            } catch (Exception e) {
                String valueOf = String.valueOf(e);
                glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 69).append("TeleModule.updateConnectionManagerRegistration, registration failed, ").append(valueOf).toString(), new Object[0]);
            }
        }
    }

    public static void f(Context context) {
        ggc a = ggc.a(context);
        bko e = fde.e(a.h());
        bko e2 = fde.e(ggc.a(context).b());
        if (e2 != null) {
            int b = gdk.b(context, e2);
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
                    iil.a("Unknown registration state: " + b);
                    e2 = null;
                    break;
            }
        }
        e2 = null;
        String valueOf = String.valueOf(gwb.J((Object) e));
        String valueOf2 = String.valueOf(gwb.J((Object) e2));
        glk.c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 98) + String.valueOf(valueOf2).length()).append("TeleModule.updateIncomingCallRegistration, preferred account for incoming calls changed from: ").append(valueOf).append(" to ").append(valueOf2).toString(), new Object[0]);
        if (!(e == null || e.equals(e2))) {
            fde.c(e);
        }
        if (!(e2 == null || ((fbx) jyn.a(context, fbx.class)).c(context, e2))) {
            glk.c("Babel_telephony", "TeleModule.updateIncomingCallRegistration, registering new account", new Object[0]);
            fde.c(e2);
        }
        if (!Objects.equals(e, e2)) {
            a.b(e2 == null ? -1 : e2.g());
        }
    }
}
