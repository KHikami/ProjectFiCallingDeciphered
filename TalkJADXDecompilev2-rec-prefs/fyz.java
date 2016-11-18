package p000;

import android.app.PendingIntent;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.telephony.PhoneNumberUtils;
import android.telephony.SmsManager;
import android.text.TextUtils;
import com.google.android.apps.hangouts.sms.SendStatusReceiver;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public final class fyz {
    public static final boolean f14408a = false;
    private static ConcurrentHashMap<Long, fza> f14409b = new ConcurrentHashMap();
    private static final Random f14410c = new Random();
    private static Boolean f14411d = null;
    private static final Uri f14412e = Uri.parse("content://babelsmssend");

    static {
        kae kae = glk.f15571r;
    }

    public static void m16653a(long j, int i) {
        if (i != -1) {
            glk.m17982e("Babel_SMS", "SmsSender: failure in sending message part.  requestId=" + j + " resultCode=" + i, new Object[0]);
        } else if (f14408a) {
            new StringBuilder(87).append("SmsSender: received sent result.  requestId=").append(j).append(" resultCode=").append(i);
        }
        if (j >= 0) {
            fza fza = (fza) f14409b.get(Long.valueOf(j));
            if (fza != null) {
                synchronized (fza) {
                    fza.m16657b(i);
                    if (!fza.m16655a()) {
                        fza.notifyAll();
                    }
                }
            }
        }
    }

    public static fza m16652a(Context context, String str, String str2, String str3, boolean z, long j) {
        fza fza = new fza();
        long abs = Math.abs(f14410c.nextLong());
        if (f14408a) {
            String valueOf = String.valueOf(glk.m17974b(str));
            String valueOf2 = String.valueOf(glk.m17974b(str2));
            new StringBuilder(((String.valueOf(valueOf).length() + 116) + String.valueOf(valueOf2).length()) + String.valueOf(str3).length()).append("SmsSender: sending message. dest=").append(valueOf).append(" message=").append(valueOf2).append(" serviceCenter=").append(str3).append(" requireDeliveryReport=").append(z).append(" requestId=").append(abs);
        }
        synchronized (fza) {
            f14409b.put(Long.valueOf(abs), fza);
            int a = fyz.m16650a(context, str, str2, abs, str3, z, j);
            if (f14408a) {
                new StringBuilder(32).append("Sending SMS in ").append(a).append(" parts");
            }
            fza.m16654a(a);
            long a2 = gwb.m1519a(gwb.m1400H(), "babel_sms_send_timeout_in_millis", 300000);
            long a3 = glj.m17956a();
            long j2 = a2;
            while (j2 > 0) {
                try {
                    if (f14408a) {
                        new StringBuilder(28).append("Waiting ").append(j2);
                    }
                    fza.wait(j2);
                } catch (InterruptedException e) {
                    glk.m17982e("Babel_SMS", "SmsSender: sending wait interrupted", new Object[0]);
                }
                if (fza.m16655a()) {
                    j2 = a2 - (glj.m17956a() - a3);
                } else {
                    if (f14408a) {
                        new StringBuilder(59).append("No more pending messages after waiting ").append(j2);
                    }
                    f14409b.remove(Long.valueOf(abs));
                    if (f14408a) {
                        valueOf = String.valueOf(glk.m17974b(str));
                        valueOf2 = String.valueOf(glk.m17974b(str2));
                        String valueOf3 = String.valueOf(fza);
                        new StringBuilder(((String.valueOf(valueOf).length() + 52) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("SmsSender: sending completed. dest=").append(valueOf).append(" message=").append(valueOf2).append(" result=").append(valueOf3);
                    }
                }
            }
            f14409b.remove(Long.valueOf(abs));
            if (f14408a) {
                valueOf = String.valueOf(glk.m17974b(str));
                valueOf2 = String.valueOf(glk.m17974b(str2));
                String valueOf32 = String.valueOf(fza);
                new StringBuilder(((String.valueOf(valueOf).length() + 52) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf32).length()).append("SmsSender: sending completed. dest=").append(valueOf).append(" message=").append(valueOf2).append(" result=").append(valueOf32);
            }
        }
        return fza;
    }

    private static Intent m16651a(Context context, String str, long j) {
        return new Intent(str, ContentUris.withAppendedId(f14412e, j), context, SendStatusReceiver.class);
    }

    private static int m16650a(Context context, String str, String str2, long j, String str3, boolean z, long j2) {
        iil.m21875b("Expected non-null", (Object) context);
        if (TextUtils.isEmpty(str)) {
            throw new fyr("SmsSender: empty destination address");
        } else if (TextUtils.isEmpty(str2)) {
            throw new fyr("SmsSender: empty text message");
        } else {
            ArrayList divideMessage;
            String str4;
            SmsManager smsManager = SmsManager.getDefault();
            String stripSeparators;
            if (ajf.m2609a().mo2127k() == null || !(ajb.m2602b(str) || ajf.m2609a().mo2115a(str))) {
                stripSeparators = PhoneNumberUtils.stripSeparators(str);
                divideMessage = smsManager.divideMessage(str2);
                str4 = stripSeparators;
            } else {
                str4 = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length()).append(str).append(" ").append(str2).toString();
                stripSeparators = ajf.m2609a().mo2127k();
                divideMessage = smsManager.divideMessage(str4);
                str4 = stripSeparators;
            }
            int size = divideMessage.size();
            if (size <= 0) {
                throw new fyr("SmsSender: fails to divide message");
            }
            ArrayList arrayList = new ArrayList(size);
            ArrayList arrayList2 = new ArrayList(size);
            int i = 0;
            while (i < size) {
                if (z && i == size - 1) {
                    arrayList.add(PendingIntent.getBroadcast(context, 0, fyz.m16651a(context, "com.google.android.apps.hangouts.sms.SendStatusReceiver.MESSAGE_DELIVERED", j2), 0));
                } else {
                    arrayList.add(null);
                }
                arrayList2.add(PendingIntent.getBroadcast(context, 0, fyz.m16651a(context, "com.google.android.apps.hangouts.sms.SendStatusReceiver.MESSAGE_SENT", j), 0));
                i++;
            }
            if (f14411d == null) {
                f14411d = Boolean.valueOf(ajf.m2609a().mo2133q());
            }
            if (gwb.m2061b(f14411d)) {
                int i2 = 0;
                while (i2 < size) {
                    try {
                        smsManager.sendTextMessage(str4, str3, (String) divideMessage.get(i2), (PendingIntent) arrayList2.get(i2), (PendingIntent) arrayList.get(i2));
                        i2++;
                    } catch (Throwable e) {
                        throw new fyr("SmsSender: caught exception in sending", e);
                    }
                }
            }
            smsManager.sendMultipartTextMessage(str4, str3, divideMessage, arrayList2, arrayList);
            return size;
        }
    }
}
