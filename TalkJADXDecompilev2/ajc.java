package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.provider.Telephony.MmsSms;
import android.provider.Telephony.ThreadsColumns;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

public final class ajc implements ThreadsColumns {
    public static final Uri a = Uri.withAppendedPath(MmsSms.CONTENT_URI, "conversations");
    private static final String[] b = new String[]{"_id"};
    private static final Uri c = Uri.parse("content://mms-sms/threadID");

    public static long a(Context context, String str) {
        Set hashSet = new HashSet();
        hashSet.add(str);
        return ajc.a(context, hashSet);
    }

    public static long a(Context context, Set<String> set) {
        String a;
        Builder buildUpon = c.buildUpon();
        for (String a2 : set) {
            if (ajb.b(a2)) {
                a2 = ajb.a(a2);
            }
            buildUpon.appendQueryParameter("recipient", a2);
        }
        Uri build = buildUpon.build();
        Cursor a3 = gwb.a(context.getContentResolver(), build, b, null, null, null);
        if (a3 != null) {
            try {
                if (a3.moveToFirst()) {
                    long j = a3.getLong(0);
                    return j;
                }
                Log.e("Telephony", "getOrCreateThreadId returned no rows!");
                a3.close();
            } finally {
                a3.close();
            }
        }
        String str = "Telephony";
        String str2 = "getOrCreateThreadId failed with uri ";
        a2 = String.valueOf(build.toString());
        Log.e(str, a2.length() != 0 ? str2.concat(a2) : new String(str2));
        throw new IllegalArgumentException("Unable to find or allocate a thread ID.");
    }
}
