package p000;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.regex.Pattern;

public final class hvl {
    public static final hvl f17354a = new hvl();
    private Pattern[] f17355b = new Pattern[0];
    private String[] f17356c = new String[0];

    private hvl() {
    }

    private synchronized void m21067a(String[] strArr, String[] strArr2) {
        int i = 0;
        synchronized (this) {
            gwb.m2047b(strArr.length == strArr2.length);
            this.f17355b = new Pattern[strArr.length];
            this.f17356c = strArr2;
            while (i < strArr.length) {
                this.f17355b[i] = Pattern.compile(strArr[i]);
                i++;
            }
        }
    }

    public synchronized String m21068a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = null;
        } else {
            int i = 0;
            str2 = str;
            while (i < this.f17355b.length) {
                str = this.f17355b[i].matcher(str2).replaceAll(this.f17356c[i]);
                i++;
                str2 = str;
            }
        }
        return str2;
    }

    public void m21069a(Bundle bundle) {
        m21067a(bundle.getStringArray("config.url_uncompress.patterns"), bundle.getStringArray("config.url_uncompress.replacements"));
    }
}
