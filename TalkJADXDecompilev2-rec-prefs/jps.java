package p000;

import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import java.util.Arrays;
import java.util.Set;

public final class jps {
    private static final Set<String> f20745a;

    static {
        Set ice = new ice();
        f20745a = ice;
        ice.addAll(Arrays.asList(new String[]{"expire", "signature"}));
    }

    public static String m24957a(String str) {
        if (VERSION.SDK_INT < 11) {
            return str;
        }
        Uri parse = Uri.parse(str);
        String host = parse.getHost();
        if (host == null || !host.contains("google")) {
            return str;
        }
        Builder buildUpon = parse.buildUpon();
        buildUpon.clearQuery();
        Object obj = null;
        for (String host2 : parse.getQueryParameterNames()) {
            if (f20745a.contains(host2)) {
                obj = 1;
            } else {
                for (String appendQueryParameter : parse.getQueryParameters(host2)) {
                    buildUpon.appendQueryParameter(host2, appendQueryParameter);
                }
            }
        }
        return obj != null ? buildUpon.toString() : str;
    }
}
