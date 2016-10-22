import android.os.Bundle;
import java.util.regex.Pattern;

public final class hvl {
    public static final hvl a;
    private Pattern[] b;
    private String[] c;

    static {
        a = new hvl();
    }

    private hvl() {
        this.b = new Pattern[0];
        this.c = new String[0];
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

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String a(java.lang.String r4) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = android.text.TextUtils.isEmpty(r4);	 Catch:{ all -> 0x0027 }
        if (r0 == 0) goto L_0x000a;
    L_0x0007:
        r0 = 0;
    L_0x0008:
        monitor-exit(r3);
        return r0;
    L_0x000a:
        r0 = 0;
        r1 = r0;
        r0 = r4;
    L_0x000d:
        r2 = r3.b;	 Catch:{ all -> 0x0027 }
        r2 = r2.length;	 Catch:{ all -> 0x0027 }
        if (r1 >= r2) goto L_0x0008;
    L_0x0012:
        r2 = r3.b;	 Catch:{ all -> 0x0027 }
        r2 = r2[r1];	 Catch:{ all -> 0x0027 }
        r0 = r2.matcher(r0);	 Catch:{ all -> 0x0027 }
        r2 = r3.c;	 Catch:{ all -> 0x0027 }
        r2 = r2[r1];	 Catch:{ all -> 0x0027 }
        r4 = r0.replaceAll(r2);	 Catch:{ all -> 0x0027 }
        r0 = r1 + 1;
        r1 = r0;
        r0 = r4;
        goto L_0x000d;
    L_0x0027:
        r0 = move-exception;
        monitor-exit(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: hvl.a(java.lang.String):java.lang.String");
    }

    public void a(Bundle bundle) {
        a(bundle.getStringArray("config.url_uncompress.patterns"), bundle.getStringArray("config.url_uncompress.replacements"));
    }
}
