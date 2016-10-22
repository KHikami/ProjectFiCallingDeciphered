package defpackage;

import android.content.Context;
import android.net.Uri;
import android.provider.CallLog.Calls;
import android.telecom.PhoneAccount;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: axk */
public final class axk {
    private static boolean a;

    static {
        a = false;
    }

    public static void a(Context context, boolean z) {
        if (axk.h(context)) {
            try {
                axk.j(context).showInCallScreen(z);
            } catch (SecurityException e) {
                Log.w("TelecomUtil", "TelecomManager.showInCallScreen called without permission.");
            }
        }
    }

    public static void a(Context context) {
        if (axk.g(context)) {
            try {
                axk.j(context).silenceRinger();
            } catch (SecurityException e) {
                Log.w("TelecomUtil", "TelecomManager.silenceRinger called without permission.");
            }
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

    public static Uri a(Context context, PhoneAccountHandle phoneAccountHandle) {
        if (axk.g(context)) {
            try {
                return axk.j(context).getAdnUriForPhoneAccount(phoneAccountHandle);
            } catch (SecurityException e) {
                Log.w("TelecomUtil", "TelecomManager.getAdnUriForPhoneAccount called without permission.");
            }
        }
        return null;
    }

    public static boolean a(Context context, String str, PhoneAccountHandle phoneAccountHandle) {
        if (axk.g(context)) {
            if (phoneAccountHandle != null) {
                return axk.j(context).handleMmi(str, phoneAccountHandle);
            }
            try {
                return axk.j(context).handleMmi(str);
            } catch (SecurityException e) {
                Log.w("TelecomUtil", "TelecomManager.handleMmi called without permission.");
            }
        }
        return false;
    }

    public static PhoneAccountHandle a(Context context, String str) {
        if (axk.h(context)) {
            return axk.j(context).getDefaultOutgoingPhoneAccount(str);
        }
        return null;
    }

    public static PhoneAccount b(Context context, PhoneAccountHandle phoneAccountHandle) {
        return axk.j(context).getPhoneAccount(phoneAccountHandle);
    }

    public static List c(Context context) {
        if (axk.h(context)) {
            return axk.j(context).getCallCapablePhoneAccounts();
        }
        return new ArrayList();
    }

    public static boolean d(Context context) {
        if (axk.h(context)) {
            return axk.j(context).isInCall();
        }
        return false;
    }

    public static boolean a(Context context, PhoneAccountHandle phoneAccountHandle, String str) {
        if (axk.h(context)) {
            return axk.j(context).isVoiceMailNumber(phoneAccountHandle, str);
        }
        return false;
    }

    public static Uri e(Context context) {
        if (axk.f(context)) {
            return Calls.CONTENT_URI_WITH_VOICEMAIL;
        }
        return Calls.CONTENT_URI;
    }

    public static boolean f(Context context) {
        return axk.i(context) || (axk.b(context, "com.android.voicemail.permission.READ_VOICEMAIL") && axk.b(context, "com.android.voicemail.permission.WRITE_VOICEMAIL"));
    }

    public static boolean g(Context context) {
        return axk.i(context) || axk.b(context, "android.permission.MODIFY_PHONE_STATE");
    }

    public static boolean h(Context context) {
        return axk.i(context) || axk.b(context, "android.permission.READ_PHONE_STATE");
    }

    public static boolean b(Context context, String str) {
        return gd.a(context, str) == 0;
    }

    public static boolean i(Context context) {
        boolean equals = TextUtils.equals(context.getPackageName(), axk.j(context).getDefaultDialerPackage());
        if (equals) {
            a = false;
        } else if (!a) {
            Log.w("TelecomUtil", "Dialer is not currently set to be default dialer");
            a = true;
        }
        return equals;
    }

    public static TelecomManager j(Context context) {
        return (TelecomManager) context.getSystemService("telecom");
    }
}
