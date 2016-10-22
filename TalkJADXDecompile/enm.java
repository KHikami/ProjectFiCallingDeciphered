import android.net.Uri;
import android.net.Uri.Builder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;

public final class enm {
    private static final enp a;
    private static final enp b;
    private static final eno c;
    private static final Pattern d;

    static {
        a = enp.a("=").a();
        b = enp.a("/").a();
        c = new eno("/");
        d = Pattern.compile("^((http(s)?):)?\\/\\/((((lh[3-6]\\.((ggpht)|(googleusercontent)|(google)))|([1-4]\\.bp\\.blogspot)|(bp[0-3]\\.blogger))\\.com)|(www\\.google\\.com\\/visualsearch\\/lh))\\/");
    }

    public static Uri a(String str, String str2) {
        int i = 1;
        if (str2 == null) {
            return null;
        }
        boolean z;
        if (str2 == null) {
            z = false;
        } else {
            z = d.matcher(str2).find();
        }
        if (!z) {
            return Uri.parse(str2);
        }
        int i2;
        Uri parse = Uri.parse(str2);
        List a = a(b.a(parse.getPath()));
        int size = a.size();
        if (a.size() <= 1 || !((String) a.get(0)).equals("image")) {
            i2 = size;
        } else {
            i2 = size - 1;
        }
        String valueOf;
        if (i2 >= 4 && i2 <= 6) {
            CharSequence path = parse.getPath();
            Object a2 = a(b.a(path));
            if (a2.size() <= 0 || !((String) a2.get(0)).equals("image")) {
                size = 0;
            } else {
                a2.remove(0);
                size = 1;
            }
            int size2 = a2.size();
            boolean endsWith = path.endsWith("/");
            i2 = (endsWith || size2 != 5) ? 0 : 1;
            if (size2 != 4) {
                i = 0;
            }
            if (i2 != 0) {
                a2.add((String) a2.get(4));
            }
            if (i != 0) {
                a2.add(str);
            } else {
                a2.set(4, str);
            }
            if (size != 0) {
                a2.add(0, "image");
            }
            if (endsWith) {
                a2.add("");
            }
            Builder buildUpon = parse.buildUpon();
            String str3 = "/";
            valueOf = String.valueOf(c.a(new StringBuilder(), a2).toString());
            if (valueOf.length() != 0) {
                valueOf = str3.concat(valueOf);
            } else {
                valueOf = new String(str3);
            }
            return buildUpon.path(valueOf).build();
        } else if (i2 != 1) {
            return parse;
        } else {
            valueOf = (String) a(a.a(parse.getPath())).get(0);
            return parse.buildUpon().path(new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(str).length()).append(valueOf).append("=").append(str).toString()).build();
        }
    }

    private static <E> ArrayList<E> a(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList<E> arrayList = new ArrayList();
        for (Object add : iterable) {
            arrayList.add(add);
        }
        return arrayList;
    }
}
