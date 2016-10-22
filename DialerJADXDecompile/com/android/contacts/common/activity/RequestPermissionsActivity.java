package com.android.contacts.common.activity;

import abq;
import android.app.Activity;
import android.widget.Toast;
import buf;
import java.util.Arrays;

/* compiled from: PG */
public class RequestPermissionsActivity extends abq {
    private static final String[] b;

    static {
        b = new String[]{"android.permission.READ_CONTACTS", "android.permission.READ_CALL_LOG"};
    }

    public static boolean b(Activity activity) {
        return abq.a(activity, b, RequestPermissionsActivity.class);
    }

    protected String[] a() {
        return b;
    }

    protected String[] b() {
        return new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.READ_CONTACTS", "android.permission.READ_CALL_LOG", "android.permission.READ_CALENDAR", "android.permission.READ_SMS"};
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (strArr != null && strArr.length > 0) {
            int i2;
            for (i2 = 0; i2 < strArr.length; i2++) {
                if (iArr[i2] != 0) {
                    if (Arrays.asList(a()).contains(strArr[i2])) {
                        i2 = 0;
                        break;
                    }
                }
            }
            i2 = 1;
            if (i2 != 0) {
                this.a.setFlags(65536);
                startActivity(this.a);
                finish();
                overridePendingTransition(0, 0);
                return;
            }
        }
        Toast.makeText(this, buf.fJ, 0).show();
        finish();
    }
}
