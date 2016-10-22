package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.content.Intent;
import android.util.ArrayMap;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: blm */
public final class blm {
    private static ArrayMap a;

    static {
        a = new ArrayMap();
    }

    public static Account[] a(Context context) {
        return AccountManager.get(context).getAccountsByType("com.google");
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList(1);
        String str2 = "Authorization";
        String str3 = "Bearer ";
        String valueOf = String.valueOf(str);
        arrayList.add(Pair.create(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3)));
        return arrayList;
    }

    public static synchronized String a(Context context, String str, String str2) {
        String str3;
        Object obj = null;
        synchronized (blm.class) {
            if (str == null) {
                str3 = null;
            } else {
                str3 = (String) a.get(Pair.create(str, str2));
                if (str3 == null) {
                    try {
                        str3 = bps.a(context, str, str2, null);
                        a.put(Pair.create(str, str2), str3);
                    } catch (bpw e) {
                        String str4 = "GoogleAuthTokenFetcher";
                        if (e.b != null) {
                            obj = new Intent(e.b);
                        }
                        String valueOf = String.valueOf(obj);
                        Log.e(str4, new StringBuilder(String.valueOf(valueOf).length() + 20).append("Need user approval: ").append(valueOf).toString());
                    } catch (Throwable e2) {
                        Log.e("GoogleAuthTokenFetcher", "Error fetching oauth token.", e2);
                    } catch (Throwable e22) {
                        Log.e("GoogleAuthTokenFetcher", "Error authenticating via oauth.", e22);
                    }
                }
            }
        }
        return str3;
    }
}
