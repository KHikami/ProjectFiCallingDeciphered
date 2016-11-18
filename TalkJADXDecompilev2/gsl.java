package defpackage;

import android.content.ContentResolver;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class gsl {
    static final Pattern a = Pattern.compile(" +");
    private static final Pattern b = Pattern.compile("\\W");
    private static gsl c = new gsl(new gsm[0]);
    private static Object d;
    private final gsm[] e;
    private final Pattern f;

    private gsl(gsm[] gsmArr) {
        Arrays.sort(gsmArr);
        StringBuilder stringBuilder = new StringBuilder("(");
        for (int i = 0; i < gsmArr.length; i++) {
            if (i > 0) {
                stringBuilder.append(")|(");
            }
            stringBuilder.append(b.matcher(gsmArr[i].b).replaceAll("\\\\$0"));
        }
        this.f = Pattern.compile(stringBuilder.append(")").toString());
        this.e = gsmArr;
    }

    public gsm a(String str) {
        Matcher matcher = this.f.matcher(str);
        if (matcher.lookingAt()) {
            for (int i = 0; i < this.e.length; i++) {
                if (matcher.group(i + 1) != null) {
                    return this.e[i];
                }
            }
        }
        return gsm.e;
    }

    public static synchronized gsl a(ContentResolver contentResolver) {
        gsl gsl;
        synchronized (gsl.class) {
            Object a = icb.a(contentResolver);
            if (a == d) {
                if (Log.isLoggable("UrlRules", 2)) {
                    new StringBuilder("Using cached rules, versionToken: ").append(a);
                }
                gsl = c;
            } else {
                Map a2 = icb.a(contentResolver, "url:");
                ArrayList arrayList = new ArrayList();
                for (Entry entry : a2.entrySet()) {
                    try {
                        String substring = ((String) entry.getKey()).substring(4);
                        String str = (String) entry.getValue();
                        if (!(str == null || str.length() == 0)) {
                            if (Log.isLoggable("UrlRules", 2)) {
                                new StringBuilder("  Rule ").append(substring).append(": ").append(str);
                            }
                            arrayList.add(new gsm(substring, str));
                        }
                    } catch (Throwable e) {
                        Log.e("UrlRules", "Invalid rule from Gservices", e);
                    }
                }
                c = new gsl((gsm[]) arrayList.toArray(new gsm[arrayList.size()]));
                d = a;
                if (Log.isLoggable("UrlRules", 2)) {
                    new StringBuilder("New rules stored, versionToken: ").append(a);
                }
                gsl = c;
            }
        }
        return gsl;
    }
}
