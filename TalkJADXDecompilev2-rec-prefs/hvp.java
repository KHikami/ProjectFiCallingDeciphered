package p000;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;

final class hvp extends huz {
    private final hec<hse> f17367a;

    public hvp(hec<hse> hec_hse) {
        this.f17367a = hec_hse;
    }

    public void mo2958a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor, Bundle bundle2) {
        boolean z;
        int i2;
        int i3 = 0;
        if (gwb.ap()) {
            String valueOf = String.valueOf(bundle);
            String valueOf2 = String.valueOf(parcelFileDescriptor);
            gwb.m2253i("PeopleClient", new StringBuilder((String.valueOf(valueOf).length() + 52) + String.valueOf(valueOf2).length()).append("Avatar callback: status=").append(i).append(" resolution=").append(valueOf).append(" pfd=").append(valueOf2).toString());
        }
        Status a = new Status(i, null, hvm.m21074b(bundle));
        if (bundle2 != null) {
            z = bundle2.getBoolean("rewindable");
            i2 = bundle2.getInt("width");
            i3 = bundle2.getInt("height");
        } else {
            i2 = 0;
            z = false;
        }
        this.f17367a.mo2421a(new hvs(a, parcelFileDescriptor, z, i2, i3));
    }
}
