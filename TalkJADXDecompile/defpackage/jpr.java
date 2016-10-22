package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Pattern;

@Deprecated
/* renamed from: jpr */
public final class jpr {
    private static final Pattern a;
    private static int b;

    static {
        a = Pattern.compile("^(((http(s)?):)?\\/\\/images(\\d)?-.+-opensocial\\.googleusercontent\\.com\\/gadgets\\/proxy\\?)");
    }

    static String a(int i, String str) {
        if (str == null) {
            return str;
        }
        String str2;
        if (jpr.a(str)) {
            str2 = null;
        } else {
            str2 = str;
            str = jpr.a();
        }
        return jpr.a(i, i, Uri.parse(str), str2).toString();
    }

    static String a(int i, int i2, String str) {
        if (str == null) {
            return str;
        }
        String str2;
        if (jpr.a(str)) {
            str2 = null;
        } else {
            str2 = str;
            str = jpr.a();
        }
        return jpr.a(i, i2, Uri.parse(str), str2).toString();
    }

    private static String a() {
        String valueOf = String.valueOf("https://images");
        int b = jpr.b();
        String valueOf2 = String.valueOf("-esmobile-opensocial.googleusercontent.com/gadgets/proxy");
        return new StringBuilder((String.valueOf(valueOf).length() + 11) + String.valueOf(valueOf2).length()).append(valueOf).append(b).append(valueOf2).toString();
    }

    private static synchronized int b() {
        int i;
        synchronized (jpr.class) {
            i = b + 1;
            b = i;
            b %= 3;
        }
        return i;
    }

    private static Uri a(int i, int i2, Uri uri, String str) {
        Builder buildUpon = Uri.EMPTY.buildUpon();
        buildUpon.authority(uri.getAuthority());
        buildUpon.scheme(uri.getScheme());
        buildUpon.path(uri.getPath());
        if (!(i == -1 || i2 == -1)) {
            buildUpon.appendQueryParameter("resize_w", Integer.toString(i));
            buildUpon.appendQueryParameter("resize_h", Integer.toString(i2));
            buildUpon.appendQueryParameter("no_expand", "1");
        }
        Uri build = buildUpon.build();
        if (uri.isOpaque()) {
            throw new UnsupportedOperationException("This isn't a hierarchical URI.");
        }
        String encodedQuery = uri.getEncodedQuery();
        Set emptySet;
        if (encodedQuery == null) {
            emptySet = Collections.emptySet();
        } else {
            Set linkedHashSet = new LinkedHashSet();
            int i3 = 0;
            do {
                int indexOf = encodedQuery.indexOf(38, i3);
                if (indexOf == -1) {
                    indexOf = encodedQuery.length();
                }
                int indexOf2 = encodedQuery.indexOf(61, i3);
                if (indexOf2 > indexOf || indexOf2 == -1) {
                    indexOf2 = indexOf;
                }
                linkedHashSet.add(Uri.decode(encodedQuery.substring(i3, indexOf2)));
                i3 = indexOf + 1;
            } while (i3 < encodedQuery.length());
            emptySet = Collections.unmodifiableSet(linkedHashSet);
        }
        Uri uri2 = build;
        for (String str2 : r0) {
            if (uri2.getQueryParameter(str2) == null) {
                Object obj;
                Object obj2 = ("resize_w".equals(str2) || "resize_h".equals(str2) || "no_expand".equals(str2)) ? 1 : null;
                if (i == -1 || i2 == -1) {
                    obj = 1;
                } else {
                    obj = null;
                }
                Builder buildUpon2 = uri2.buildUpon();
                if ("url".equals(str2)) {
                    buildUpon2.appendQueryParameter("url", uri.getQueryParameter("url"));
                } else if (obj == null || obj2 == null) {
                    for (String appendQueryParameter : uri.getQueryParameters(str2)) {
                        buildUpon2.appendQueryParameter(str2, appendQueryParameter);
                    }
                }
                uri2 = buildUpon2.build();
            }
        }
        if (str != null && uri2.getQueryParameter("url") == null) {
            buildUpon = uri2.buildUpon();
            buildUpon.appendQueryParameter("url", str);
            uri2 = buildUpon.build();
        }
        if (uri2.getQueryParameter("container") == null) {
            buildUpon = uri2.buildUpon();
            buildUpon.appendQueryParameter("container", "esmobile");
            uri2 = buildUpon.build();
        }
        if (uri2.getQueryParameter("gadget") == null) {
            buildUpon = uri2.buildUpon();
            buildUpon.appendQueryParameter("gadget", "a");
            uri2 = buildUpon.build();
        }
        if (uri2.getQueryParameter("rewriteMime") != null) {
            return uri2;
        }
        buildUpon = uri2.buildUpon();
        buildUpon.appendQueryParameter("rewriteMime", "image/*");
        return buildUpon.build();
    }

    private static boolean a(String str) {
        if (str == null) {
            return false;
        }
        return a.matcher(str).find();
    }
}
