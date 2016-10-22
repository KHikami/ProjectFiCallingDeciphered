import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.telecom.PhoneAccount;
import android.util.Log;

/* compiled from: PG */
public class aby {
    private static final String a;

    static {
        a = aby.class.getSimpleName();
    }

    public static Drawable a(PhoneAccount phoneAccount, Context context) {
        if (phoneAccount == null || context == null) {
            return null;
        }
        if (abw.g()) {
            Icon icon;
            if (phoneAccount == null || !abw.g()) {
                icon = null;
            } else {
                icon = phoneAccount.getIcon();
            }
            if (icon != null) {
                return icon.loadDrawable(context);
            }
            return null;
        } else if (abw.f()) {
            return b(phoneAccount, context);
        } else {
            return null;
        }
    }

    private static Drawable b(PhoneAccount phoneAccount, Context context) {
        try {
            return (Drawable) PhoneAccount.class.getMethod("createIconDrawable", new Class[]{Context.class}).invoke(phoneAccount, new Object[]{context});
        } catch (ReflectiveOperationException e) {
            return null;
        } catch (Throwable th) {
            Log.e(a, "Unexpected exception when attempting to call android.telecom.PhoneAccount#createIconDrawable", th);
            return null;
        }
    }
}
