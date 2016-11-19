package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;

public final class aux<Data> implements auh<String, Data> {
    private final auh<Uri, Data> f2385a;

    public aux(auh<Uri, Data> auh_android_net_Uri__Data) {
        this.f2385a = auh_android_net_Uri__Data;
    }

    private static Uri m4081a(String str) {
        return Uri.fromFile(new File(str));
    }

    private aui<Data> m4082a(String str, int i, int i2, anz anz) {
        Object obj;
        if (TextUtils.isEmpty(str)) {
            obj = null;
        } else if (str.startsWith("/")) {
            obj = aux.m4081a(str);
        } else {
            obj = Uri.parse(str);
            if (obj.getScheme() == null) {
                obj = aux.m4081a(str);
            }
        }
        if (obj == null) {
            return null;
        }
        return this.f2385a.mo377a(obj, i, i2, anz);
    }
}
