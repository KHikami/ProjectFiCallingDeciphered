package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.hangouts.invites.offnetwork.impl.OffnetworkInviteActivity;
import com.google.android.apps.hangouts.phone.BabelGatewayActivity;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class dsl extends fip {
    private final Context a;
    private final String b;
    private final String c;
    private final bko d;
    private dsg e;
    private fme f;

    dsl(Context context, String str, String str2) {
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = fde.e(((jca) jyn.a(context, jca.class)).a());
    }

    public static String a(bko bko) {
        String b = gwb.b(gwb.H(), "babel_offnetwork_invite_canned_text_hangouts_website", "hangouts.google.com/chat/person");
        if (!gwb.a(gwb.H(), "babel_enable_viral_flow_v1", true)) {
            return b;
        }
        String str = bko.b().a;
        return new StringBuilder((String.valueOf(b).length() + 1) + String.valueOf(str).length()).append(b).append("/").append(str).toString();
    }

    void a(Context context, int i) {
        this.e = (dsg) jyn.b(context, dsg.class);
        if (dak.a(this.b)) {
            czc.a(new dsn(context, this.d, this.b), null).a();
            return;
        }
        String e = glq.e(gwb.H(), this.b);
        if (TextUtils.isEmpty(e)) {
            String str = "Babel_OffnetworkInvite";
            e = "OffnetworkInvite.invite: invalid phone number ";
            String valueOf = String.valueOf(this.b);
            glk.e(str, valueOf.length() != 0 ? e.concat(valueOf) : new String(e), new Object[0]);
            return;
        }
        if (i == dsm.c) {
            String e2 = glq.e(gwb.H(), this.b);
            this.f = ((fmf) jyn.a(this.a, fmf.class)).a();
            RealTimeChatService.a((fip) this);
            RealTimeChatService.d(this.f, this.d, e2);
        }
        if (i == dsm.a) {
            this.a.startActivity(gwb.d(OffnetworkInviteActivity.a(this.c, e, -1, this.d.g(), null)));
        }
        if (i == dsm.b) {
            Intent d = gwb.d(BabelGatewayActivity.a(-1, "", e, "", false, null));
            d.putExtra("sms_accts_only", true);
            this.a.startActivity(d);
        }
    }

    private void a(String str, bko bko) {
        bko a = fde.a(bko);
        if (this.e != null) {
            String string = this.a.getString(ba.lP, new Object[]{str});
            gwb.a(null, 1898);
            this.e.a(string);
            return;
        }
        int g;
        if (((bbm) jyn.a(this.a, bbm.class)).d(bko.g())) {
            g = bko.g();
        } else if (a != null) {
            g = a.g();
        } else {
            g = -1;
        }
        this.a.startActivity(OffnetworkInviteActivity.a(this.c, glq.e(gwb.H(), this.b), bko.g(), g, str));
    }

    public void a(int i, bko bko, fiu fiu) {
        if (i == this.f.a()) {
            String str = ((exv) fiu.c()).g;
            if (TextUtils.isEmpty(str)) {
                str = dsl.a(bko);
            }
            a(str, bko);
            RealTimeChatService.b((fip) this);
        }
    }

    public void a(int i, bko bko, fok fok, fdo fdo) {
        if (i == this.f.a()) {
            a(dsl.a(bko), bko);
            RealTimeChatService.b((fip) this);
        }
    }
}
