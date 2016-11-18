package p000;

import android.net.Uri;
import android.util.Base64;
import com.google.android.gms.wearable.Asset;
import java.util.ArrayList;
import java.util.List;

public final class hya {
    private final Uri f17446a;
    private final hxz f17447b;

    private hya(hxw hxw) {
        this.f17446a = hxw.mo1291a();
        this.f17447b = hya.m21243b((hxw) hxw.mo1288f());
    }

    public static hya m21242a(hxw hxw) {
        if (hxw != null) {
            return new hya(hxw);
        }
        throw new IllegalStateException("provided dataItem is null");
    }

    private static hxz m21243b(hxw hxw) {
        Throwable e;
        if (hxw.mo1292b() == null && hxw.mo1293c().size() > 0) {
            throw new IllegalArgumentException("Cannot create DataMapItem from a DataItem  that wasn't made with DataMapItem.");
        } else if (hxw.mo1292b() == null) {
            return new hxz();
        } else {
            try {
                List arrayList = new ArrayList();
                int size = hxw.mo1293c().size();
                for (int i = 0; i < size; i++) {
                    hxx hxx = (hxx) hxw.mo1293c().get(Integer.toString(i));
                    if (hxx == null) {
                        String valueOf = String.valueOf(hxw);
                        throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 64).append("Cannot find DataItemAsset referenced in data at ").append(i).append(" for ").append(valueOf).toString());
                    }
                    arrayList.add(Asset.m9999a(hxx.mo1289a()));
                }
                return gwb.m1614a(new hcd(hce.m19215a(hxw.mo1292b()), arrayList));
            } catch (hcp e2) {
                e = e2;
            } catch (NullPointerException e3) {
                e = e3;
            }
        }
        String valueOf2 = String.valueOf(hxw.mo1291a());
        String valueOf3 = String.valueOf(Base64.encodeToString(hxw.mo1292b(), 0));
        new StringBuilder((String.valueOf(valueOf2).length() + 50) + String.valueOf(valueOf3).length()).append("Unable to parse datamap from dataItem. uri=").append(valueOf2).append(", data=").append(valueOf3);
        valueOf3 = String.valueOf(hxw.mo1291a());
        throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf3).length() + 44).append("Unable to parse datamap from dataItem.  uri=").append(valueOf3).toString(), e);
    }

    public Uri m21244a() {
        return this.f17446a;
    }

    public hxz m21245b() {
        return this.f17447b;
    }
}
