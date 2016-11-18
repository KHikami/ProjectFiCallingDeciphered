package p000;

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
    private static final ComponentName f16024a = new ComponentName("com.google.android.gms", "com.google.android.gms.recovery.RecoveryService");
    public static final String f16025c = "callerUid";
    public static final String f16026d = "androidPackageName";
    static final ComponentName f16027e = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");

    static {
        int i = VERSION.SDK_INT;
        i = VERSION.SDK_INT;
    }

    static <T> T m18479a(Context context, ComponentName componentName, gsw<T> gsw_T) {
        Throwable e;
        ServiceConnection gxv = new gxv();
        gwj a = gwj.m18777a(context);
        if (a.mo2356a(componentName, gxv, "GoogleAuthUtil")) {
            try {
                T a2 = gsw_T.mo2332a(gxv.m18929a());
                a.mo2358b(componentName, gxv, "GoogleAuthUtil");
                return a2;
            } catch (RemoteException e2) {
                e = e2;
                try {
                    throw new IOException("Error on service connection.", e);
                } catch (Throwable th) {
                    a.mo2358b(componentName, gxv, "GoogleAuthUtil");
                }
            } catch (InterruptedException e3) {
                e = e3;
                throw new IOException("Error on service connection.", e);
            }
        }
        throw new IOException("Could not bind to service.");
    }

    public static String m18481a(Context context, Account account, String str, Bundle bundle) {
        return gst.m18483b(context, account, str, bundle).m9633a();
    }

    static void m18482a(Context context) {
        try {
            gtv.m18574d(context.getApplicationContext());
        } catch (gts e) {
            throw new gsx(e.m18567a(), e.getMessage(), e.m18566b());
        } catch (gtr e2) {
            throw new gsr(e2.getMessage());
        }
    }

    public static TokenData m18483b(Context context, Account account, String str, Bundle bundle) {
        gwb.m1434O("Calling this from your main thread can lead to deadlock");
        gwb.m1665a(str, (Object) "Scope cannot be empty or null.");
        gwb.m2195f((Object) account, (Object) "Account cannot be null.");
        gst.m18482a(context);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        String str2 = context.getApplicationInfo().packageName;
        bundle2.putString("clientPackageName", str2);
        if (TextUtils.isEmpty(bundle2.getString(f16026d))) {
            bundle2.putString(f16026d, str2);
        }
        bundle2.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
        return (TokenData) gst.m18479a(context, f16027e, new gsu(account, str, bundle2));
    }

    static Account[] m18484d(Context context, String str) {
        int i = 0;
        gtq.f16130d.m18551b(context);
        ContentProviderClient acquireContentProviderClient = ((Context) gwb.m1419L((Object) context)).getContentResolver().acquireContentProviderClient("com.google.android.gms.auth.accounts");
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

    static /* synthetic */ Object m18480a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new IOException("Service unavailable.");
    }
}
