import android.accounts.Account;
import android.content.Context;
import android.net.TrafficStats;
import android.util.Log;
import java.net.URLEncoder;

/* compiled from: PG */
public final class bhz {
    private static boolean a;

    static {
        a = false;
    }

    public static boolean a(Context context, bjg bjg) {
        String str = true;
        Account[] a = blm.a(context);
        if (a.length == 0) {
            return false;
        }
        String str2 = null;
        for (Account account : a) {
            str2 = blm.a(context, account.name, "oauth2:https://www.googleapis.com/auth/plus.peopleapi.readwrite");
            if (str2 != null) {
                break;
            }
        }
        if (str2 == null) {
            Log.e("GoogleCallerIdReporter", "No token with the scope that we need...exiting");
            return false;
        }
        try {
            String format = String.format("%s/%s/report?category=incorrect&field=phone&container=place&lookupKey=%s", new Object[]{"https://www.googleapis.com/plus/v2whitelisted/people", bjg.a.n, URLEncoder.encode(bjg.a.j, "UTF-8")});
            TrafficStats.setThreadStatsTag(51882);
            blo.b(context, format, "POST", blm.a(str2));
            return str;
        } catch (Throwable e) {
            str = "Error encoding phone number.";
            Log.e("GoogleCallerIdReporter", str, e);
            return false;
        } catch (Throwable e2) {
            str = "Error fetching oauth token.";
            Log.e("GoogleCallerIdReporter", str, e2);
            return false;
        } catch (bld e3) {
            bps.a(context, str2);
            return false;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }
}
