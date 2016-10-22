import android.annotation.TargetApi;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.telecom.PhoneAccountHandle;
import android.text.TextUtils;

@TargetApi(23)
/* compiled from: PG */
public final class ame {
    static String a;
    public static avm b;

    static {
        a = "CallLogAsyncTaskUtil";
    }

    static ala a(Context context, Uri uri) {
        String string;
        Cursor query = context.getContentResolver().query(uri, aml.a, null, null, null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    CharSequence string2;
                    String g;
                    string = query.getString(4);
                    String string3 = query.getString(2);
                    if (buf.c()) {
                        string2 = query.getString(12);
                    } else {
                        Object obj = "";
                    }
                    String string4 = buf.c() ? query.getString(13) : "";
                    int i = query.getInt(6);
                    PhoneAccountHandle c = buf.c(query.getString(7), query.getString(8));
                    awt awt = new awt(context, buf.g(context));
                    boolean a = awy.a(context, c, string3);
                    Object obj2 = (!awy.a((CharSequence) string3, i) || a) ? null : 1;
                    aws aws = aws.a;
                    if (obj2 != null) {
                        aws = awt.a(string3, string);
                        if (aws == null) {
                            aws = aws.a;
                        }
                    }
                    ala ala = new ala(string3, i, string2);
                    ala.a(context, aws.i, a);
                    ala.c = string4;
                    ala.s = c;
                    ala.o = aws.b;
                    ala.j = aws.d;
                    ala.k = aws.e;
                    ala.m = aws.f;
                    ala.n = aws.g;
                    ala.p = aws.l;
                    ala.q = aws.p;
                    ala.r = aws.n;
                    ala.g = new int[]{query.getInt(3)};
                    ala.h = query.getLong(0);
                    ala.i = query.getLong(1);
                    ala.t = query.getInt(9);
                    ala.f = query.getString(5);
                    ala.v = query.getString(11);
                    if (TextUtils.isEmpty(string)) {
                        g = buf.g(context);
                    } else {
                        g = string;
                    }
                    ala.e = g;
                    if (!query.isNull(10)) {
                        ala.u = Long.valueOf(query.getLong(10));
                    }
                    if (query != null) {
                        query.close();
                    }
                    return ala;
                }
            } catch (Throwable th) {
                if (query != null) {
                    query.close();
                }
            }
        }
        string = String.valueOf(uri);
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(string).length() + 21).append("Cannot find content: ").append(string).toString());
    }

    public static void a(Context context, Uri uri, amm amm) {
        if (b == null) {
            b = avn.b();
        }
        avm avm = b;
        amn amn = amn.DELETE_VOICEMAIL;
        avm.a(new ami(context, uri, amm), new Void[0]);
    }
}
