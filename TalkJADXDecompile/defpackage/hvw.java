package defpackage;

import android.os.Bundle;

/* renamed from: hvw */
public final class hvw extends huz {
    private final hge<hsi> a;

    public hvw(hge<hsi> hge_hsi) {
        this.a = hge_hsi;
    }

    public void a() {
        this.a.a();
    }

    public void a(int i, Bundle bundle, Bundle bundle2) {
        if (gwb.ap()) {
            String valueOf = String.valueOf(bundle);
            String valueOf2 = String.valueOf(bundle2);
            gwb.i("PeopleClient", new StringBuilder((String.valueOf(valueOf).length() + 55) + String.valueOf(valueOf2).length()).append("Bundle callback: status=").append(i).append("\nresolution=").append(valueOf).append("\nbundle=").append(valueOf2).toString());
        }
        if (i != 0) {
            gwb.k("PeopleClient", "Non-success data changed callback received.");
        } else {
            this.a.a(new hvu(bundle2.getString("account"), bundle2.getString("pagegaiaid"), bundle2.getInt("scope")));
        }
    }
}
