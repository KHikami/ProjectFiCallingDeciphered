import android.content.Context;
import android.telecom.Connection;
import com.google.api.client.http.HttpStatusCodes;

final class gdb implements gdf {
    private final Context a;
    private final dgg b;
    private gdc c;

    gdb(Context context, dgg dgg) {
        this.a = context;
        this.b = dgg;
    }

    void a(gdc gdc) {
        this.c = gdc;
    }

    // Called by gdc.b(Context, gcq, int)
    void a() {
        // Log start of handoff
        glk.c("Babel_telephony", "TeleHandoffCellularToWifi.startHandoff", new Object[0]);
        // If handoff is not possible...
        if (!this.c.f()) {
            this.c.a(false, 224);
        // If there is already a wifi call...
        } else if (this.b.n()) {
            glk.c("Babel_telephony", "TeleHandoffCellularToWifi.startHandoff, wifi call already exists", new Object[0]);
            this.c.a(false, 221);
        // Otherwise handoff is possible and no wifi call currently exists
        } else {
            gcq a = this.c.a();
            int b = this.c.b();
            if (b != 4) {
                String str = "Babel_telephony";
                String str2 = "TeleHandoffCellularToWifi.isHandoffPossible, not possible for call state: ";
                String valueOf = String.valueOf(Connection.stateToString(b));
                glk.c(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
                this.c.a(false, 227);
            } else if (a.o() == null) {
                glk.c("Babel_telephony", "TeleHandoffCellularToWifi.startHandoff, no account name", new Object[0]);
                this.c.a(false, 225);
            } else if (a.q() == null) {
                glk.c("Babel_telephony", "TeleHandoffCellularToWifi.startHandoff, no hangout id", new Object[0]);
                this.c.a(false, 226);
            } else if (a.getConference() != null) {
                glk.c("Babel_telephony", "TeleHandoffCellularToWifi.startHandoff, in conference", new Object[0]);
                this.c.a(false, 228);
            } else if (gwb.I(this.a)) {
                glk.c("Babel_telephony", "TeleHandoffCellularToWifi.createWifiCall", new Object[0]);
                gcq a2 = this.c.a();
                dhz a3 = new dib(a2.o(), 1).a(2).e(a2.q()).h(a2.s()).a();
                muo muo = new muo();
                mup D = gwb.D(a2.d());
                if (D != null) {
                    muo.d = D;
                }
                this.b.a(a3, false, null, true, gwb.a(gwb.H(), a2.f().f(), gwb.au(), false, null, null, 0), 85, true, 1, true, glj.b(), muo, a2.i());
                this.b.v();
                gcc gfj = new gfj(this.a, null, a2.j().e(), a2.g());
                gfj.a(this.b.s());
                this.c.a(gfj);
            } else {
                glk.c("Babel_telephony", "TeleHandoffCellularToWifi.startHandoff, not connected to wifi", new Object[0]);
                this.c.a(false, 210);
            }
        }
    }

    public void b() {
        // gdc c
        // If new Connection state is STATE_DISCONNECTED...
        if (this.c.c() == 6) {
            this.c.a(false, 0);
        // If new Connection state is STATE_ACTIVE or old Connection state is STATE_DISCONNECTED...
        } else if (this.c.c() == 4 || this.c.b() == 6) {
            this.c.a(true, 0);
        // If mysterious boolean is true, then... TODO
        } else if (this.c.d()) {
            this.c.a(false, (int) HttpStatusCodes.STATUS_CODE_NOT_MODIFIED);
        }
    }

    public void c() {
    }
}
