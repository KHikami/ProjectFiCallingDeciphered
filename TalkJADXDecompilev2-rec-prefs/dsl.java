package p000;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.hangouts.invites.offnetwork.impl.OffnetworkInviteActivity;
import com.google.android.apps.hangouts.phone.BabelGatewayActivity;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class dsl extends fip {
    private final Context f10443a;
    private final String f10444b;
    private final String f10445c;
    private final bko f10446d;
    private dsg f10447e;
    private fme f10448f;

    dsl(Context context, String str, String str2) {
        this.f10443a = context;
        this.f10444b = str;
        this.f10445c = str2;
        this.f10446d = fde.m15018e(((jca) jyn.m25426a(context, jca.class)).mo2317a());
    }

    public static String m12611a(bko bko) {
        String b = gwb.m1998b(gwb.m1400H(), "babel_offnetwork_invite_canned_text_hangouts_website", "hangouts.google.com/chat/person");
        if (!gwb.m1906a(gwb.m1400H(), "babel_enable_viral_flow_v1", true)) {
            return b;
        }
        String str = bko.m5632b().f11244a;
        return new StringBuilder((String.valueOf(b).length() + 1) + String.valueOf(str).length()).append(b).append("/").append(str).toString();
    }

    void m12615a(Context context, int i) {
        this.f10447e = (dsg) jyn.m25433b(context, dsg.class);
        if (dak.m11383a(this.f10444b)) {
            czc.m11324a(new dsn(context, this.f10446d, this.f10444b), null).m11327a();
            return;
        }
        String e = glq.m18021e(gwb.m1400H(), this.f10444b);
        if (TextUtils.isEmpty(e)) {
            String str = "Babel_OffnetworkInvite";
            e = "OffnetworkInvite.invite: invalid phone number ";
            String valueOf = String.valueOf(this.f10444b);
            glk.m17982e(str, valueOf.length() != 0 ? e.concat(valueOf) : new String(e), new Object[0]);
            return;
        }
        if (i == dsm.f10451c) {
            String e2 = glq.m18021e(gwb.m1400H(), this.f10444b);
            this.f10448f = ((fmf) jyn.m25426a(this.f10443a, fmf.class)).mo2035a();
            RealTimeChatService.m9040a((fip) this);
            RealTimeChatService.m9102d(this.f10448f, this.f10446d, e2);
        }
        if (i == dsm.f10449a) {
            this.f10443a.startActivity(gwb.m2124d(OffnetworkInviteActivity.m8718a(this.f10445c, e, -1, this.f10446d.m5638g(), null)));
        }
        if (i == dsm.f10450b) {
            Intent d = gwb.m2124d(BabelGatewayActivity.m8797a(-1, "", e, "", false, null));
            d.putExtra("sms_accts_only", true);
            this.f10443a.startActivity(d);
        }
    }

    private void m12612a(String str, bko bko) {
        bko a = fde.m14992a(bko);
        if (this.f10447e != null) {
            String string = this.f10443a.getString(ba.lP, new Object[]{str});
            gwb.m1823a(null, 1898);
            this.f10447e.mo915a(string);
            return;
        }
        int g;
        if (((bbm) jyn.m25426a(this.f10443a, bbm.class)).mo444d(bko.m5638g())) {
            g = bko.m5638g();
        } else if (a != null) {
            g = a.m5638g();
        } else {
            g = -1;
        }
        this.f10443a.startActivity(OffnetworkInviteActivity.m8718a(this.f10445c, glq.m18021e(gwb.m1400H(), this.f10444b), bko.m5638g(), g, str));
    }

    public void mo610a(int i, bko bko, fiu fiu) {
        if (i == this.f10448f.m15674a()) {
            String str = ((exv) fiu.m15392c()).f12448g;
            if (TextUtils.isEmpty(str)) {
                str = dsl.m12611a(bko);
            }
            m12612a(str, bko);
            RealTimeChatService.m9077b((fip) this);
        }
    }

    public void mo640a(int i, bko bko, fok fok, fdo fdo) {
        if (i == this.f10448f.m15674a()) {
            m12612a(dsl.m12611a(bko), bko);
            RealTimeChatService.m9077b((fip) this);
        }
    }
}
