package p000;

import android.content.ContentResolver;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class gsl {
    static final Pattern f16012a = Pattern.compile(" +");
    private static final Pattern f16013b = Pattern.compile("\\W");
    private static gsl f16014c = new gsl(new gsm[0]);
    private static Object f16015d;
    private final gsm[] f16016e;
    private final Pattern f16017f;

    private gsl(gsm[] gsmArr) {
        Arrays.sort(gsmArr);
        StringBuilder stringBuilder = new StringBuilder("(");
        for (int i = 0; i < gsmArr.length; i++) {
            if (i > 0) {
                stringBuilder.append(")|(");
            }
            stringBuilder.append(f16013b.matcher(gsmArr[i].f16020b).replaceAll("\\\\$0"));
        }
        this.f16017f = Pattern.compile(stringBuilder.append(")").toString());
        this.f16016e = gsmArr;
    }

    public gsm m18473a(String str) {
        Matcher matcher = this.f16017f.matcher(str);
        if (matcher.lookingAt()) {
            for (int i = 0; i < this.f16016e.length; i++) {
                if (matcher.group(i + 1) != null) {
                    return this.f16016e[i];
                }
            }
        }
        return gsm.f16018e;
    }

    public static synchronized gsl m18472a(ContentResolver contentResolver) {
        gsl gsl;
        synchronized (gsl.class) {
            Object a = icb.m21562a(contentResolver);
            if (a == f16015d) {
                if (Log.isLoggable("UrlRules", 2)) {
                    new StringBuilder("Using cached rules, versionToken: ").append(a);
                }
                gsl = f16014c;
            } else {
                Map a2 = icb.m21565a(contentResolver, "url:");
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
                f16014c = new gsl((gsm[]) arrayList.toArray(new gsm[arrayList.size()]));
                f16015d = a;
                if (Log.isLoggable("UrlRules", 2)) {
                    new StringBuilder("New rules stored, versionToken: ").append(a);
                }
                gsl = f16014c;
            }
        }
        return gsl;
    }
}
