package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

final class hvq extends huz {
    private final hec<hsb> f17368a;

    public hvq(hec<hsb> hec_hsb) {
        this.f17368a = hec_hsb;
    }

    public void mo2959a(int i, Bundle bundle, DataHolder dataHolder) {
        if (gwb.ap()) {
            String valueOf = String.valueOf(bundle);
            String valueOf2 = String.valueOf(dataHolder);
            gwb.m2253i("PeopleClient", new StringBuilder((String.valueOf(valueOf).length() + 55) + String.valueOf(valueOf2).length()).append("People callback: status=").append(i).append("\nresolution=").append(valueOf).append("\nholder=").append(valueOf2).toString());
        }
        this.f17368a.mo2421a(new hvt(new Status(i, null, hvm.m21074b(bundle)), hvm.m21072a(dataHolder)));
    }
}
