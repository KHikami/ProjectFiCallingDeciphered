package p000;

import android.os.Bundle;

public final class hvw extends huz {
    private final hge<hsi> f17382a;

    public hvw(hge<hsi> hge_hsi) {
        this.f17382a = hge_hsi;
    }

    public void m21114a() {
        this.f17382a.m19728a();
    }

    public void mo2956a(int i, Bundle bundle, Bundle bundle2) {
        if (gwb.ap()) {
            String valueOf = String.valueOf(bundle);
            String valueOf2 = String.valueOf(bundle2);
            gwb.m2253i("PeopleClient", new StringBuilder((String.valueOf(valueOf).length() + 55) + String.valueOf(valueOf2).length()).append("Bundle callback: status=").append(i).append("\nresolution=").append(valueOf).append("\nbundle=").append(valueOf2).toString());
        }
        if (i != 0) {
            gwb.m2279k("PeopleClient", "Non-success data changed callback received.");
        } else {
            this.f17382a.m19729a(new hvu(bundle2.getString("account"), bundle2.getString("pagegaiaid"), bundle2.getInt("scope")));
        }
    }
}
