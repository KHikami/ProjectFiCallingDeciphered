package com.google.android.libraries.componentview.internal;

import android.util.Log;
import com.google.android.libraries.componentview.api.external.ComponentViewErrorCode.Error;
import com.google.android.libraries.componentview.services.application.Logger;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Locale;
import wi;

public class L {

    public final class DebugStackTraceLogger extends Exception {
        public DebugStackTraceLogger() {
            super("DEBUG: NOT a real Exception");
        }
    }

    public static void a(String str, String str2, Object... objArr) {
        a(6, str, null, str2, objArr);
    }

    public static void a(String str, Throwable th, String str2, Object... objArr) {
        a(6, str, th, str2, objArr);
    }

    public static void a(String str, String str2, Error error, Logger logger, String str3, Object... objArr) {
        if (logger != null) {
            logger.a(error);
        }
        a(5, str, null, str2, objArr);
    }

    public static void a(String str, Throwable th, String str2, Error error, Logger logger, String str3, Object... objArr) {
        if (logger != null) {
            logger.b(error);
        }
        if (str3 != null) {
            String valueOf = String.valueOf(str2);
            str2 = new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(str3).length()).append(valueOf).append("\n").append(str3).toString();
        }
        a(5, str, th, str2, objArr);
    }

    private static String a(String str, Object... objArr) {
        if (str == null) {
            return "null";
        }
        if (objArr == null || objArr.length == 0) {
            return str;
        }
        int i = 0;
        while (i < objArr.length) {
            if (objArr[i] != null && objArr[i].getClass().isArray()) {
                String deepToString = Arrays.deepToString(new Object[]{objArr[i]});
                objArr[i] = deepToString.substring(1, deepToString.length() - 1);
            }
            i++;
        }
        try {
            return String.format(Locale.US, str, objArr);
        } catch (IllegalFormatException e) {
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf(Arrays.toString(objArr));
            return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
    }

    public static void a(int i, String str, Throwable th, String str2, Object... objArr) {
        if (str.length() > 23) {
            String substring = str.substring(0, 23);
            a(5, substring, null, "Tag [%s] is too long; truncated to [%s]", str, substring);
            str = substring;
        }
        if (Log.isLoggable(str, i)) {
            substring = a(str2, objArr);
            switch (i) {
                case wi.l /*2*/:
                    if (th != null) {
                    }
                case wi.z /*3*/:
                    if (th != null) {
                    }
                case wi.h /*4*/:
                    if (th != null) {
                    }
                case wi.p /*5*/:
                    if (th != null) {
                    }
                case wi.s /*6*/:
                    if (th != null) {
                        Log.e(str, substring, th);
                    } else {
                        Log.e(str, substring);
                    }
                case wi.q /*7*/:
                    if (th != null) {
                        Log.wtf(str, substring, th);
                    } else {
                        Log.wtf(str, substring);
                    }
                default:
            }
        }
    }
}
