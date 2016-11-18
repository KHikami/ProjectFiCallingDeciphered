package p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;

final class hvv extends huz {
    private final huo f17381a;

    public hvv(huo huo) {
        this.f17381a = huo;
    }

    public void mo2960a(int i, Bundle bundle, DataHolder[] dataHolderArr) {
        if (gwb.ap()) {
            String valueOf = String.valueOf(bundle);
            String valueOf2 = String.valueOf(Arrays.toString(dataHolderArr));
            gwb.m2253i("PeopleClient", new StringBuilder((String.valueOf(valueOf).length() + 56) + String.valueOf(valueOf2).length()).append("People callback: status=").append(i).append("\nresolution=").append(valueOf).append("\nholders=").append(valueOf2).toString());
        }
        this.f17381a.m20885a(new ConnectionResult(i, hvm.m21074b(bundle)), dataHolderArr);
    }
}
