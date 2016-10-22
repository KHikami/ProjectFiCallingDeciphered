import android.annotation.TargetApi;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.ContactsContract.Directory;
import android.telephony.PhoneNumberUtils;
import java.util.ArrayList;

@TargetApi(23)
/* compiled from: PG */
public final class bae {
    private static final String[] b;
    bag a;

    static {
        b = new String[]{"_id"};
    }

    private bae() {
    }

    public static void a(int i, Context context, bad bad, bal bal, Object obj) {
        bdf.a("CallerInfoAsyncQuery", "##### CallerInfoAsyncQuery startContactProviderQuery()... #####");
        String str = "CallerInfoAsyncQuery";
        String str2 = "- number: ";
        String valueOf = String.valueOf(bad.c);
        bdf.a(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        str = String.valueOf(obj);
        bdf.a("CallerInfoAsyncQuery", new StringBuilder(String.valueOf(str).length() + 10).append("- cookie: ").append(str).toString());
        if (buf.c(context, "android.permission.READ_CONTACTS")) {
            a(-1, context, bad, new baf(context, bad, bal), obj, awt.a(bad.c));
            return;
        }
        bdf.e("CallerInfoAsyncQuery", "Dialer doesn't have permission to read contacts.");
        bal.a(-1, obj, bad);
    }

    private static bae a(int i, Context context, bad bad, bal bal, Object obj, Uri uri) {
        bae bae = new bae();
        if (context == null || uri == null) {
            throw new bam("Bad context or query uri.");
        }
        bae.a = new bag(bae, context);
        bae.a.a = context;
        bae.a.b = uri;
        bai bai = new bai();
        bai.a = bal;
        bai.b = obj;
        bai.d = bad.c;
        if (PhoneNumberUtils.isLocalEmergencyNumber(context, bad.c)) {
            bai.c = 4;
        } else if (bad.w) {
            bai.c = 5;
        } else {
            bai.c = 1;
        }
        bae.a.startQuery(i, bai, uri, bad.a(uri), null, null, null);
        return bae;
    }

    static boolean b(int i, Context context, bad bad, bal bal, Object obj) {
        int i2 = 0;
        ArrayList arrayList = new ArrayList();
        Uri uri = Directory.CONTENT_URI;
        if (buf.c()) {
            uri = Uri.withAppendedPath(ContactsContract.AUTHORITY_URI, "directories_enterprise");
        }
        a(context.getContentResolver().query(uri, b, null, null, null), arrayList);
        long[] jArr = new long[arrayList.size()];
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            jArr[i3] = ((Long) arrayList.get(i3)).longValue();
        }
        int length = jArr.length;
        if (length == 0) {
            return false;
        }
        baj baj = new baj(context, length, bal);
        while (i2 < length) {
            long j = jArr[i2];
            Uri a = awt.a(bad.c, j);
            a(i, context, bad, new bak(baj, j), obj, a);
            i2++;
        }
        return true;
    }

    private static void a(Cursor cursor, ArrayList arrayList) {
        if (cursor != null) {
            int columnIndex = cursor.getColumnIndex("_id");
            while (cursor.moveToNext()) {
                long j = cursor.getLong(columnIndex);
                if (buf.b(j)) {
                    arrayList.add(Long.valueOf(j));
                }
            }
            cursor.close();
        }
    }

    static String a(Uri uri) {
        if (uri == null) {
            return "";
        }
        String uri2 = uri.toString();
        int lastIndexOf = uri2.lastIndexOf(47);
        if (lastIndexOf > 0) {
            return String.valueOf(uri2.substring(0, lastIndexOf)).concat("/xxxxxxx");
        }
        return uri2;
    }
}
