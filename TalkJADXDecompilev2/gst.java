package defpackage;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.auth.TokenData;
import java.io.IOException;

public class gst {
    private static final ComponentName a = new ComponentName("com.google.android.gms", "com.google.android.gms.recovery.RecoveryService");
    public static final String c = "callerUid";
    public static final String d = "androidPackageName";
    static final ComponentName e = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");

    static {
        int i = VERSION.SDK_INT;
        i = VERSION.SDK_INT;
    }

    static <T> T a(Context context, ComponentName componentName, gsw<T> gsw_T) {
        Throwable e;
        ServiceConnection gxv = new gxv();
        gwj a = gwj.a(context);
        if (a.a(componentName, gxv, "GoogleAuthUtil")) {
            try {
                T a2 = gsw_T.a(gxv.a());
                a.b(componentName, gxv, "GoogleAuthUtil");
                return a2;
            } catch (RemoteException e2) {
                e = e2;
                try {
                    throw new IOException("Error on service connection.", e);
                } catch (Throwable th) {
                    a.b(componentName, gxv, "GoogleAuthUtil");
                }
            } catch (InterruptedException e3) {
                e = e3;
                throw new IOException("Error on service connection.", e);
            }
        }
        throw new IOException("Could not bind to service.");
    }

    public static String a(Context context, Account account, String str, Bundle bundle) {
        return gst.b(context, account, str, bundle).a();
    }

    static void a(Context context) {
        try {
            gtv.d(context.getApplicationContext());
        } catch (gts e) {
            throw new gsx(e.a(), e.getMessage(), e.b());
        } catch (gtr e2) {
            throw new gsr(e2.getMessage());
        }
    }

    public static TokenData b(Context context, Account account, String str, Bundle bundle) {
        gwb.O("Calling this from your main thread can lead to deadlock");
        gwb.a(str, (Object) "Scope cannot be empty or null.");
        gwb.f((Object) account, (Object) "Account cannot be null.");
        gst.a(context);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        String str2 = context.getApplicationInfo().packageName;
        bundle2.putString("clientPackageName", str2);
        if (TextUtils.isEmpty(bundle2.getString(d))) {
            bundle2.putString(d, str2);
        }
        bundle2.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
        return (TokenData) gst.a(context, e, new gsu(account, str, bundle2));
    }

    static Account[] d(Context context, String str) {
        int i = 0;
        gtq.d.b(context);
        ContentProviderClient acquireContentProviderClient = ((Context) gwb.L((Object) context)).getContentResolver().acquireContentProviderClient("com.google.android.gms.auth.accounts");
        if (acquireContentProviderClient == null) {
            return new Account[0];
        }
        try {
            Parcelable[] parcelableArray = acquireContentProviderClient.call("get_accounts", str, new Bundle()).getParcelableArray("accounts");
            Account[] accountArr = new Account[parcelableArray.length];
            while (i < parcelableArray.length) {
                accountArr[i] = (Account) parcelableArray[i];
                i++;
            }
            acquireContentProviderClient.release();
            return accountArr;
        } catch (Exception e) {
            String str2 = "Accounts ContentProvider failed: ";
            String valueOf = String.valueOf(e.getMessage());
            throw new RemoteException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } catch (Throwable th) {
            acquireContentProviderClient.release();
        }
    }

    static /* synthetic */ Object a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new IOException("Service unavailable.");
    }
}
