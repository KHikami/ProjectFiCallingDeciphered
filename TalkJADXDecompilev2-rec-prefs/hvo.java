package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

final class hvo extends huz {
    private final hec<hrz> f17366a;

    public hvo(hec<hrz> hec_hrz) {
        this.f17366a = hec_hrz;
    }

    public void mo2959a(int i, Bundle bundle, DataHolder dataHolder) {
        hwo hwo = null;
        if (gwb.ap()) {
            String valueOf = String.valueOf(bundle);
            String valueOf2 = String.valueOf(dataHolder);
            gwb.m2253i("PeopleClient", new StringBuilder((String.valueOf(valueOf).length() + 54) + String.valueOf(valueOf2).length()).append("Owner callback: status=").append(i).append("\nresolution=").append(valueOf).append("\nholder=").append(valueOf2).toString());
        }
        Status a = new Status(i, null, hvm.m21074b(bundle));
        if (dataHolder != null) {
            hwo = new hwo(dataHolder);
        }
        this.f17366a.mo2421a(new hvr(a, hwo));
    }
}
