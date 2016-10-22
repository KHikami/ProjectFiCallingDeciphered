package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: PG */
/* renamed from: amz */
public final class amz {
    private static amz b;
    public final and a;
    private final Context c;
    private final awt d;
    private final String e;

    private amz(Context context, and and, fr frVar, awt awt, String str) {
        this.c = context;
        this.a = and;
        this.d = awt;
        this.e = str;
    }

    public static amz a(Context context) {
        if (b == null) {
            ContentResolver contentResolver = context.getContentResolver();
            String g = buf.g(context);
            b = new amz(context, new anb(context.getApplicationContext(), contentResolver), new ana(context.getApplicationContext(), contentResolver), new awt(context, g), g);
        }
        return b;
    }

    public final aws a(String str, int i, String str2) {
        if (str2 == null) {
            str2 = this.e;
        }
        if (str == null) {
            str = "";
        }
        aws aws = new aws();
        aws.h = str;
        aws.i = PhoneNumberUtils.formatNumber(str, str2);
        aws.j = PhoneNumberUtils.formatNumberToE164(str, str2);
        aws.d = buf.a(this.c, (CharSequence) str, i, false).toString();
        if (!TextUtils.isEmpty(aws.d)) {
            return aws;
        }
        aws a = this.d.a(str, str2);
        if (a != null && !TextUtils.isEmpty(a.d)) {
            return a;
        }
        if (!TextUtils.isEmpty(aws.i)) {
            aws.d = aws.i;
            return aws;
        } else if (TextUtils.isEmpty(str)) {
            aws.d = this.c.getResources().getString(cob.dq);
            return aws;
        } else {
            aws.d = str;
            return aws;
        }
    }

    public static void b(Context context) {
        if (axk.g(context)) {
            try {
                axk.j(context).cancelMissedCallsNotification();
            } catch (SecurityException e) {
                Log.w("TelecomUtil", "TelecomManager.cancelMissedCalls called without permission.");
            }
        }
    }
}
