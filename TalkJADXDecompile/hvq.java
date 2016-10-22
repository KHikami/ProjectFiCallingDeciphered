import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

final class hvq extends huz {
    private final hec<hsb> a;

    public hvq(hec<hsb> hec_hsb) {
        this.a = hec_hsb;
    }

    public void a(int i, Bundle bundle, DataHolder dataHolder) {
        if (gwb.ap()) {
            String valueOf = String.valueOf(bundle);
            String valueOf2 = String.valueOf(dataHolder);
            gwb.i("PeopleClient", new StringBuilder((String.valueOf(valueOf).length() + 55) + String.valueOf(valueOf2).length()).append("People callback: status=").append(i).append("\nresolution=").append(valueOf).append("\nholder=").append(valueOf2).toString());
        }
        this.a.a(new hvt(new Status(i, null, hvm.b(bundle)), hvm.a(dataHolder)));
    }
}
