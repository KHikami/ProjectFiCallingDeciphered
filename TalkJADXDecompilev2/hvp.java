package defpackage;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;

final class hvp extends huz {
    private final hec<hse> a;

    public hvp(hec<hse> hec_hse) {
        this.a = hec_hse;
    }

    public void a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor, Bundle bundle2) {
        boolean z;
        int i2;
        int i3 = 0;
        if (gwb.ap()) {
            String valueOf = String.valueOf(bundle);
            String valueOf2 = String.valueOf(parcelFileDescriptor);
            gwb.i("PeopleClient", new StringBuilder((String.valueOf(valueOf).length() + 52) + String.valueOf(valueOf2).length()).append("Avatar callback: status=").append(i).append(" resolution=").append(valueOf).append(" pfd=").append(valueOf2).toString());
        }
        Status a = new Status(i, null, hvm.b(bundle));
        if (bundle2 != null) {
            z = bundle2.getBoolean("rewindable");
            i2 = bundle2.getInt("width");
            i3 = bundle2.getInt("height");
        } else {
            i2 = 0;
            z = false;
        }
        this.a.a(new hvs(a, parcelFileDescriptor, z, i2, i3));
    }
}
