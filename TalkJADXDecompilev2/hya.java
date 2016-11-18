package defpackage;

import android.net.Uri;
import android.util.Base64;
import com.google.android.gms.wearable.Asset;
import java.util.ArrayList;
import java.util.List;

public final class hya {
    private final Uri a;
    private final hxz b;

    private hya(hxw hxw) {
        this.a = hxw.a();
        this.b = hya.b((hxw) hxw.f());
    }

    public static hya a(hxw hxw) {
        if (hxw != null) {
            return new hya(hxw);
        }
        throw new IllegalStateException("provided dataItem is null");
    }

    private static hxz b(hxw hxw) {
        Throwable e;
        if (hxw.b() == null && hxw.c().size() > 0) {
            throw new IllegalArgumentException("Cannot create DataMapItem from a DataItem  that wasn't made with DataMapItem.");
        } else if (hxw.b() == null) {
            return new hxz();
        } else {
            try {
                List arrayList = new ArrayList();
                int size = hxw.c().size();
                for (int i = 0; i < size; i++) {
                    hxx hxx = (hxx) hxw.c().get(Integer.toString(i));
                    if (hxx == null) {
                        String valueOf = String.valueOf(hxw);
                        throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 64).append("Cannot find DataItemAsset referenced in data at ").append(i).append(" for ").append(valueOf).toString());
                    }
                    arrayList.add(Asset.a(hxx.a()));
                }
                return gwb.a(new hcd(hce.a(hxw.b()), arrayList));
            } catch (hcp e2) {
                e = e2;
            } catch (NullPointerException e3) {
                e = e3;
            }
        }
        String valueOf2 = String.valueOf(hxw.a());
        String valueOf3 = String.valueOf(Base64.encodeToString(hxw.b(), 0));
        new StringBuilder((String.valueOf(valueOf2).length() + 50) + String.valueOf(valueOf3).length()).append("Unable to parse datamap from dataItem. uri=").append(valueOf2).append(", data=").append(valueOf3);
        valueOf3 = String.valueOf(hxw.a());
        throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf3).length() + 44).append("Unable to parse datamap from dataItem.  uri=").append(valueOf3).toString(), e);
    }

    public Uri a() {
        return this.a;
    }

    public hxz b() {
        return this.b;
    }
}
