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
public final class axk {
    private static boolean a;

    static {
        a = false;
    }

    public static void a(Context context, boolean z) {
        if (h(context)) {
            try {
                j(context).showInCallScreen(z);
            } catch (SecurityException e) {
                Log.w("TelecomUtil", "TelecomManager.showInCallScreen called without permission.");
            }
        }
    }

    public static void a(Context context) {
        if (g(context)) {
            try {
                j(context).silenceRinger();
            } catch (SecurityException e) {
                Log.w("TelecomUtil", "TelecomManager.silenceRinger called without permission.");
            }
        }
    }

    public static void b(Context context) {
        if (g(context)) {
            try {
                j(context).cancelMissedCallsNotification();
            } catch (SecurityException e) {
                Log.w("TelecomUtil", "TelecomManager.cancelMissedCalls called without permission.");
            }
        }
    }

    public static Uri a(Context context, PhoneAccountHandle phoneAccountHandle) {
        if (g(context)) {
            try {
                return j(context).getAdnUriForPhoneAccount(phoneAccountHandle);
            } catch (SecurityException e) {
                Log.w("TelecomUtil", "TelecomManager.getAdnUriForPhoneAccount called without permission.");
            }
        }
        return null;
    }

    public static boolean a(Context context, String str, PhoneAccountHandle phoneAccountHandle) {
        if (g(context)) {
            if (phoneAccountHandle != null) {
                return j(context).handleMmi(str, phoneAccountHandle);
            }
            try {
                return j(context).handleMmi(str);
            } catch (SecurityException e) {
                Log.w("TelecomUtil", "TelecomManager.handleMmi called without permission.");
            }
        }
        return false;
    }

    public static PhoneAccountHandle a(Context context, String str) {
        if (h(context)) {
            return j(context).getDefaultOutgoingPhoneAccount(str);
        }
        return null;
    }

    public static PhoneAccount b(Context context, PhoneAccountHandle phoneAccountHandle) {
        return j(context).getPhoneAccount(phoneAccountHandle);
    }

    public static List c(Context context) {
        if (h(context)) {
            return j(context).getCallCapablePhoneAccounts();
        }
        return new ArrayList();
    }

    public static boolean d(Context context) {
        if (h(context)) {
            return j(context).isInCall();
        }
        return false;
    }

    public static boolean a(Context context, PhoneAccountHandle phoneAccountHandle, String str) {
        if (h(context)) {
            return j(context).isVoiceMailNumber(phoneAccountHandle, str);
        }
        return false;
    }

    public static Uri e(Context context) {
        if (f(context)) {
            return Calls.CONTENT_URI_WITH_VOICEMAIL;
        }
        return Calls.CONTENT_URI;
    }

    public static boolean f(Context context) {
        return i(context) || (b(context, "com.android.voicemail.permission.READ_VOICEMAIL") && b(context, "com.android.voicemail.permission.WRITE_VOICEMAIL"));
    }

    public static boolean g(Context context) {
        return i(context) || b(context, "android.permission.MODIFY_PHONE_STATE");
    }

    public static boolean h(Context context) {
        return i(context) || b(context, "android.permission.READ_PHONE_STATE");
    }

    public static boolean b(Context context, String str) {
        return gd.a(context, str) == 0;
    }

    public static boolean i(Context context) {
        boolean equals = TextUtils.equals(context.getPackageName(), j(context).getDefaultDialerPackage());
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
