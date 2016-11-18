package p000;

import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.net.Uri;
import android.util.Log;

public final class aut<Data> implements auh<Integer, Data> {
    private final auh<Uri, Data> f2380a;
    private final Resources f2381b;

    public aut(Resources resources, auh<Uri, Data> auh_android_net_Uri__Data) {
        this.f2381b = resources;
        this.f2380a = auh_android_net_Uri__Data;
    }

    private aui<Data> m4074a(Integer num, int i, int i2, anz anz) {
        Uri a = m4073a(num);
        return a == null ? null : this.f2380a.mo377a(a, i, i2, anz);
    }

    private Uri m4073a(Integer num) {
        String valueOf;
        try {
            valueOf = String.valueOf("android.resource://");
            String valueOf2 = String.valueOf(this.f2381b.getResourcePackageName(num.intValue()));
            String valueOf3 = String.valueOf(this.f2381b.getResourceTypeName(num.intValue()));
            String valueOf4 = String.valueOf(this.f2381b.getResourceEntryName(num.intValue()));
            return Uri.parse(new StringBuilder((((String.valueOf(valueOf).length() + 2) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()).append(valueOf).append(valueOf2).append("/").append(valueOf3).append("/").append(valueOf4).toString());
        } catch (NotFoundException e) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                valueOf = String.valueOf(num);
                new StringBuilder(String.valueOf(valueOf).length() + 30).append("Received invalid resource id: ").append(valueOf);
            }
            return null;
        }
    }
}
