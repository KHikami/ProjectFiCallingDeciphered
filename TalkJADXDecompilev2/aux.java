package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;

public final class aux<Data> implements auh<String, Data> {
    private final auh<Uri, Data> a;

    public aux(auh<Uri, Data> auh_android_net_Uri__Data) {
        this.a = auh_android_net_Uri__Data;
    }

    private static Uri a(String str) {
        return Uri.fromFile(new File(str));
    }

    private aui<Data> a(String str, int i, int i2, anz anz) {
        Object obj;
        if (TextUtils.isEmpty(str)) {
            obj = null;
        } else if (str.startsWith("/")) {
            obj = aux.a(str);
        } else {
            obj = Uri.parse(str);
            if (obj.getScheme() == null) {
                obj = aux.a(str);
            }
        }
        if (obj == null) {
            return null;
        }
        return this.a.a(obj, i, i2, anz);
    }
}
