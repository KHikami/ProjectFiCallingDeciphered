import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

public final class jxp {
    private final Context a;

    public jxp(Context context) {
        this.a = context;
    }

    public void a(Throwable th, String str) {
        a(this.a, th, str);
    }

    public static void a(Context context, Throwable th, String str) {
        Intent b = b(context, th, str);
        if (b != null) {
            context.startService(b);
        }
    }

    private static void a(Throwable th, StringBuilder stringBuilder, Set<Throwable> set, String str) {
        while (th != null && !set.contains(th)) {
            set.add(th);
            if (str != null) {
                stringBuilder.append(str);
            }
            stringBuilder.append(th.getClass().getName());
            stringBuilder.append(':');
            for (Object obj : th.getStackTrace()) {
                stringBuilder.append("\n\tat ");
                stringBuilder.append(obj);
            }
            if (VERSION.SDK_INT >= 19) {
                for (Throwable a : th.getSuppressed()) {
                    a(a, stringBuilder, set, "\nSuppressed: ");
                }
            }
            if (th.getCause() != null) {
                th = th.getCause();
                str = "\nCaused by: ";
            } else {
                return;
            }
        }
    }

    private static Intent b(Context context, Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (th.getStackTrace().length == 0) {
            return null;
        }
        try {
            String str2;
            for (ServiceInfo serviceInfo : context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 4).services) {
                if (serviceInfo.name.matches("com\\.google\\.android\\.libraries\\.social\\.silentfeedback\\.\\w*\\.SilentFeedbackService")) {
                    str2 = serviceInfo.name;
                    break;
                }
            }
            str2 = null;
            if (str2 == null) {
                Log.e("SilentFeedback", "Could not find SilentFeedbackService, not sending crash info.");
                return null;
            }
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(context.getApplicationContext(), str2));
            intent.setPackage(context.getApplicationContext().getPackageName());
            StringBuilder stringBuilder = new StringBuilder();
            a(th, stringBuilder, new HashSet(), null);
            StackTraceElement stackTraceElement = stackTrace[0];
            String fileName = stackTraceElement.getFileName() != null ? stackTraceElement.getFileName() : "Unknown Source";
            intent.putExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.exceptionClass", th.getClass().getName());
            intent.putExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.stackTrace", stringBuilder.toString());
            intent.putExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingClass", stackTraceElement.getClassName());
            intent.putExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingFile", fileName);
            intent.putExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingLine", stackTraceElement.getLineNumber());
            intent.putExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingMethod", stackTraceElement.getMethodName());
            if (str != null) {
                intent.putExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.categoryTag", str);
            }
            return intent;
        } catch (Throwable e) {
            Log.e("SilentFeedback", "Could not find our own package. This should never happen. Not sending crash info.", e);
            return null;
        }
    }
}
