package com.android.contacts.common.activity;

import abq;
import android.app.Activity;

/* compiled from: PG */
public class RequestImportVCardPermissionsActivity extends RequestPermissionsActivity {
    private static final String[] b;

    static {
        b = new String[]{"android.permission.READ_CONTACTS", "android.permission.READ_EXTERNAL_STORAGE"};
    }

    public static boolean a(Activity activity) {
        return abq.a(activity, b, RequestImportVCardPermissionsActivity.class);
    }

    protected final String[] a() {
        return b;
    }

    protected final String[] b() {
        return b;
    }
}
