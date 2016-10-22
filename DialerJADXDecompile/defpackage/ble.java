package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: ble */
public final class ble {
    private static final blg a;
    private static final blg b;
    private static final Pattern c;

    static {
        a = blg.a("=").a();
        b = blg.a("/").a();
        c = Pattern.compile("^((http(s)?):)?\\/\\/((((lh[3-6]\\.((ggpht)|(googleusercontent)|(google)))|(bp[0-3]\\.blogger))\\.com)|(www\\.google\\.com\\/visualsearch\\/lh))\\/");
    }

    public static String a(int i, String str, boolean z, boolean z2) {
        int i2 = 1;
        if (str == null) {
            return str;
        }
        boolean z3;
        if (str == null) {
            z3 = false;
        } else {
            z3 = c.matcher(str).find();
        }
        if (!z3) {
            return str;
        }
        int i3;
        String str2;
        Uri build;
        StringBuffer stringBuffer = new StringBuffer();
        if (i != -1) {
            stringBuffer.append("s").append(i);
        }
        stringBuffer.append("-d-no");
        String stringBuffer2 = stringBuffer.toString();
        Uri parse = Uri.parse(str);
        List a = ble.a(b.a(parse.getPath()));
        int size = a.size();
        if (a.size() <= 1 || !((String) a.get(0)).equals("image")) {
            i3 = size;
        } else {
            i3 = size - 1;
        }
        String valueOf;
        if (i3 >= 4 && i3 <= 6) {
            CharSequence path = parse.getPath();
            Object a2 = ble.a(b.a(path));
            if (a2.size() <= 0 || !((String) a2.get(0)).equals("image")) {
                size = 0;
            } else {
                a2.remove(0);
                size = 1;
            }
            int size2 = a2.size();
            boolean endsWith = path.endsWith("/");
            i3 = (endsWith || size2 != 5) ? 0 : 1;
            if (size2 != 4) {
                i2 = 0;
            }
            if (i3 != 0) {
                a2.add((String) a2.get(4));
            }
            if (i2 != 0) {
                a2.add(stringBuffer2);
            } else {
                a2.set(4, stringBuffer2);
            }
            if (size != 0) {
                a2.add(0, "image");
            }
            if (endsWith) {
                a2.add("");
            }
            Builder buildUpon = parse.buildUpon();
            str2 = "/";
            valueOf = String.valueOf(TextUtils.join("/", a2));
            if (valueOf.length() != 0) {
                valueOf = str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
            build = buildUpon.path(valueOf).build();
        } else if (i3 == 1) {
            valueOf = (String) ble.a(a.a(parse.getPath())).get(0);
            build = parse.buildUpon().path(new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(stringBuffer2).length()).append(valueOf).append("=").append(stringBuffer2).toString()).build();
        } else {
            build = parse;
        }
        StringBuilder stringBuilder = new StringBuilder();
        str2 = build.getScheme();
        if (str2 != null) {
            stringBuilder.append(str2).append(':');
        }
        str2 = build.getEncodedAuthority();
        if (str2 != null) {
            stringBuilder.append("//").append(str2);
        }
        str2 = Uri.encode(build.getPath(), "/=");
        if (str2 != null) {
            stringBuilder.append(str2);
        }
        Object encodedQuery = build.getEncodedQuery();
        if (!TextUtils.isEmpty(encodedQuery)) {
            stringBuilder.append('?').append(encodedQuery);
        }
        Object encodedFragment = build.getEncodedFragment();
        if (!TextUtils.isEmpty(encodedFragment)) {
            stringBuilder.append('#').append(encodedFragment);
        }
        return stringBuilder.toString();
    }

    private static ArrayList a(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        for (Object add : iterable) {
            arrayList.add(add);
        }
        return arrayList;
    }
}
