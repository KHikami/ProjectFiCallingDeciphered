package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.regex.Pattern;

public final class hvl {
    public static final hvl a = new hvl();
    private Pattern[] b = new Pattern[0];
    private String[] c = new String[0];

    private hvl() {
    }

    private synchronized void a(String[] strArr, String[] strArr2) {
        int i = 0;
        synchronized (this) {
            gwb.b(strArr.length == strArr2.length);
            this.b = new Pattern[strArr.length];
            this.c = strArr2;
            while (i < strArr.length) {
                this.b[i] = Pattern.compile(strArr[i]);
                i++;
            }
        }
    }

    public synchronized String a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = null;
        } else {
            int i = 0;
            str2 = str;
            while (i < this.b.length) {
                str = this.b[i].matcher(str2).replaceAll(this.c[i]);
                i++;
                str2 = str;
            }
        }
        return str2;
    }

    public void a(Bundle bundle) {
        a(bundle.getStringArray("config.url_uncompress.patterns"), bundle.getStringArray("config.url_uncompress.replacements"));
    }
}
