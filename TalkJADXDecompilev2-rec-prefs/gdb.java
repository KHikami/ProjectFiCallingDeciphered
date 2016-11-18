package p000;

import android.content.Context;
import android.telecom.Connection;
import com.google.api.client.http.HttpStatusCodes;

final class gdb implements gdf {
    private final Context f14727a;
    private final dgg f14728b;
    private gdc f14729c;

    gdb(Context context, dgg dgg) {
        this.f14727a = context;
        this.f14728b = dgg;
    }

    void m17016a(gdc gdc) {
        this.f14729c = gdc;
    }

    void m17015a() {
        glk.m17979c("Babel_telephony", "TeleHandoffCellularToWifi.startHandoff", new Object[0]);
        if (!this.f14729c.m17033f()) {
            this.f14729c.m17028a(false, 224);
        } else if (this.f14728b.m11722n()) {
            glk.m17979c("Babel_telephony", "TeleHandoffCellularToWifi.startHandoff, wifi call already exists", new Object[0]);
            this.f14729c.m17028a(false, 221);
        } else {
            gcq a = this.f14729c.m17024a();
            int b = this.f14729c.m17029b();
            if (b != 4) {
                String str = "Babel_telephony";
                String str2 = "TeleHandoffCellularToWifi.isHandoffPossible, not possible for call state: ";
                String valueOf = String.valueOf(Connection.stateToString(b));
                glk.m17979c(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
                this.f14729c.m17028a(false, 227);
            } else if (a.m16968o() == null) {
                glk.m17979c("Babel_telephony", "TeleHandoffCellularToWifi.startHandoff, no account name", new Object[0]);
                this.f14729c.m17028a(false, 225);
            } else if (a.m16970q() == null) {
                glk.m17979c("Babel_telephony", "TeleHandoffCellularToWifi.startHandoff, no hangout id", new Object[0]);
                this.f14729c.m17028a(false, 226);
            } else if (a.getConference() != null) {
                glk.m17979c("Babel_telephony", "TeleHandoffCellularToWifi.startHandoff, in conference", new Object[0]);
                this.f14729c.m17028a(false, 228);
            } else if (gwb.m1407I(this.f14727a)) {
                glk.m17979c("Babel_telephony", "TeleHandoffCellularToWifi.createWifiCall", new Object[0]);
                gcq a2 = this.f14729c.m17024a();
                dhz a3 = new dib(a2.m16968o(), 1).m11911a(2).m11916e(a2.m16970q()).m11919h(a2.m16972s()).m11910a();
                muo muo = new muo();
                mup D = gwb.m1383D(a2.m16955d());
                if (D != null) {
                    muo.f28393d = D;
                }
                this.f14728b.m11697a(a3, false, null, true, gwb.m1599a(gwb.m1400H(), a2.m16959f().m17144f(), gwb.au(), false, null, null, 0), 85, true, 1, true, glj.m17963b(), muo, a2.m16962i());
                this.f14728b.m11730v();
                gcc gfj = new gfj(this.f14727a, null, a2.m16963j().mo2221e(), a2.m16960g());
                gfj.m17522a(this.f14728b.m11727s());
                this.f14729c.m17025a(gfj);
            } else {
                glk.m17979c("Babel_telephony", "TeleHandoffCellularToWifi.startHandoff, not connected to wifi", new Object[0]);
                this.f14729c.m17028a(false, 210);
            }
        }
    }

    public void mo2186b() {
        if (this.f14729c.m17030c() == 6) {
            this.f14729c.m17028a(false, 0);
        } else if (this.f14729c.m17030c() == 4 || this.f14729c.m17029b() == 6) {
            this.f14729c.m17028a(true, 0);
        } else if (this.f14729c.m17031d()) {
            this.f14729c.m17028a(false, (int) HttpStatusCodes.STATUS_CODE_NOT_MODIFIED);
        }
    }

    public void mo2187c() {
    }
}
