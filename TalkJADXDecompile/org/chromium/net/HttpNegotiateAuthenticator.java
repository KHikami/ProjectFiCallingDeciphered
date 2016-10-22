package org.chromium.net;

import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.ContextUtils;
import org.chromium.base.ThreadUtils;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.JNINamespace;
import ots;
import ouh;
import oui;
import ouk;

@JNINamespace
public class HttpNegotiateAuthenticator {
    public Bundle a;
    private final String b;

    public native void nativeSetResult(long j, int i, String str);

    private HttpNegotiateAuthenticator(String str) {
        this.a = null;
        this.b = str;
    }

    @CalledByNative
    static HttpNegotiateAuthenticator create(String str) {
        return new HttpNegotiateAuthenticator(str);
    }

    public boolean a(Context context, String str, boolean z) {
        if ((!z || VERSION.SDK_INT < 23) && context.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
            return true;
        }
        return false;
    }

    @CalledByNative
    void getNextAuthToken(long j, String str, String str2, boolean z) {
        Context context = ContextUtils.a;
        ouk ouk = new ouk();
        ouk.d = "SPNEGO:HOSTBASED:" + str;
        ouk.b = AccountManager.get(context);
        ouk.a = j;
        String[] strArr = new String[]{"SPNEGO"};
        ouk.c = new Bundle();
        if (str2 != null) {
            ouk.c.putString("incomingAuthToken", str2);
        }
        if (this.a != null) {
            ouk.c.putBundle("spnegoContext", this.a);
        }
        ouk.c.putBoolean("canDelegate", z);
        Activity activity = ApplicationStatus.a;
        if (activity != null) {
            String str3;
            boolean z2 = VERSION.SDK_INT < 23;
            if (z2) {
                str3 = "android.permission.MANAGE_ACCOUNTS";
            } else {
                str3 = "android.permission.GET_ACCOUNTS";
            }
            if (a(context, str3, z2)) {
                ots.d("net_auth", "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: %s permission not granted. Aborting authentication", new Object[]{str3});
                nativeSetResult(ouk.a, -343, null);
                return;
            }
            ouk.b.getAuthTokenByFeatures(this.b, ouk.d, strArr, activity, null, ouk.c, new oui(this, ouk), new Handler(ThreadUtils.a().getLooper()));
        } else if (a(context, "android.permission.GET_ACCOUNTS", true)) {
            ots.d("net_auth", "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: GET_ACCOUNTS permission not granted. Aborting authentication.", new Object[0]);
            nativeSetResult(ouk.a, -343, null);
        } else {
            ouk.b.getAccountsByTypeAndFeatures(this.b, strArr, new ouh(this, ouk), new Handler(ThreadUtils.a().getLooper()));
        }
    }
}
