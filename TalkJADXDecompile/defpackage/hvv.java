package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;

/* renamed from: hvv */
final class hvv extends huz {
    private final huo a;

    public hvv(huo huo) {
        this.a = huo;
    }

    public void a(int i, Bundle bundle, DataHolder[] dataHolderArr) {
        if (gwb.ap()) {
            String valueOf = String.valueOf(bundle);
            String valueOf2 = String.valueOf(Arrays.toString(dataHolderArr));
            gwb.i("PeopleClient", new StringBuilder((String.valueOf(valueOf).length() + 56) + String.valueOf(valueOf2).length()).append("People callback: status=").append(i).append("\nresolution=").append(valueOf).append("\nholders=").append(valueOf2).toString());
        }
        this.a.a(new ConnectionResult(i, hvm.b(bundle)), dataHolderArr);
    }
}
