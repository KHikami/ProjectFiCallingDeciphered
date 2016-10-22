package com.google.android.apps.hangouts.sms;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import fxs;
import glk;
import java.io.File;

public class MmsFileProvider extends fxs {
    static final String b;

    static {
        String str;
        try {
            Class.forName("com.google.android.apps.hangouts.content.EsProvider");
            str = "com.google.android.apps.hangouts.sms.MmsFileProvider";
        } catch (ClassNotFoundException e) {
            str = "com.google.android.apps.hangouts.sms.MmsFileProviderAltBuild";
        }
        b = str;
    }

    public static Uri a(Context context) {
        String str = b;
        long abs = Math.abs(fxs.a.nextLong());
        Builder scheme = new Builder().authority(str).scheme("content");
        scheme.appendPath(String.valueOf(abs));
        if (!TextUtils.isEmpty(null)) {
            scheme.appendQueryParameter("ext", null);
        }
        Uri build = scheme.build();
        File a = a(build.getPath(), context);
        if (!fxs.a(a)) {
            String str2 = "Babel";
            String str3 = "Failed to create temp file ";
            str = String.valueOf(a.getAbsolutePath());
            glk.e(str2, str.length() != 0 ? str3.concat(str) : new String(str3), new Object[0]);
        }
        return build;
    }

    File a(String str) {
        return a(str, getContext());
    }

    public static File a(Uri uri, Context context) {
        return a(uri.getPath(), context);
    }

    private static File a(String str, Context context) {
        return new File(new File(context.getCacheDir(), "rawmms"), String.valueOf(str).concat(".dat"));
    }
}
