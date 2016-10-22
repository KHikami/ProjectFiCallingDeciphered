import android.net.Uri;
import android.util.Log;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;

public final class hyg {
    private final PutDataRequest a;
    private final hxz b;

    public hyg(PutDataRequest putDataRequest, hxz hxz) {
        this.a = putDataRequest;
        this.b = new hxz();
        if (hxz != null) {
            this.b.a(hxz);
        }
    }

    public static hyg a(String str) {
        return new hyg(PutDataRequest.a(str), null);
    }

    public Uri a() {
        return this.a.a();
    }

    public hxz b() {
        return this.b;
    }

    public PutDataRequest c() {
        hcd a = gwb.a(this.b);
        this.a.a(hcq.a(a.a));
        int size = a.b.size();
        int i = 0;
        while (i < size) {
            String num = Integer.toString(i);
            Asset asset = (Asset) a.b.get(i);
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
                this.a.a(num, asset);
                i++;
            }
        }
        return this.a;
    }
}
