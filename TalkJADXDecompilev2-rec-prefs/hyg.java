package p000;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;

public final class hyg {
    private final PutDataRequest f17450a;
    private final hxz f17451b = new hxz();

    public hyg(PutDataRequest putDataRequest, hxz hxz) {
        this.f17450a = putDataRequest;
        if (hxz != null) {
            this.f17451b.m21215a(hxz);
        }
    }

    public static hyg m21248a(String str) {
        return new hyg(PutDataRequest.m10015a(str), null);
    }

    public Uri m21249a() {
        return this.f17450a.m10016a();
    }

    public hxz m21250b() {
        return this.f17451b;
    }

    public PutDataRequest m21251c() {
        hcd a = gwb.m1610a(this.f17451b);
        this.f17450a.m10018a(hcq.m19203a(a.f16572a));
        int size = a.f16573b.size();
        int i = 0;
        while (i < size) {
            String num = Integer.toString(i);
            Asset asset = (Asset) a.f16573b.get(i);
            String valueOf;
            if (num == null) {
                valueOf = String.valueOf(asset);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 26).append("asset key cannot be null: ").append(valueOf).toString());
            } else if (asset == null) {
                String str = "asset cannot be null: key=";
                valueOf = String.valueOf(num);
                throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            } else {
                if (Log.isLoggable("DataMap", 3)) {
                    String valueOf2 = String.valueOf(asset);
                    new StringBuilder((String.valueOf(num).length() + 33) + String.valueOf(valueOf2).length()).append("asPutDataRequest: adding asset: ").append(num).append(" ").append(valueOf2);
                }
                this.f17450a.m10017a(num, asset);
                i++;
            }
        }
        return this.f17450a;
    }
}
