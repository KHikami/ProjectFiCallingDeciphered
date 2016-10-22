package defpackage;

import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.net.Uri;
import android.util.Log;

/* renamed from: aut */
public final class aut<Data> implements auh<Integer, Data> {
    private final auh<Uri, Data> a;
    private final Resources b;

    public aut(Resources resources, auh<Uri, Data> auh_android_net_Uri__Data) {
        this.b = resources;
        this.a = auh_android_net_Uri__Data;
    }

    private aui<Data> a(Integer num, int i, int i2, anz anz) {
        Uri a = a(num);
        return a == null ? null : this.a.a(a, i, i2, anz);
    }

    private Uri a(Integer num) {
        String valueOf;
        try {
            valueOf = String.valueOf("android.resource://");
            String valueOf2 = String.valueOf(this.b.getResourcePackageName(num.intValue()));
            String valueOf3 = String.valueOf(this.b.getResourceTypeName(num.intValue()));
            String valueOf4 = String.valueOf(this.b.getResourceEntryName(num.intValue()));
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
