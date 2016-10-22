import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.view.View;

/* compiled from: PG */
public final class abn {
    private static final String a;

    static {
        a = ";";
    }

    public static boolean a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4) {
        if (!TextUtils.equals(charSequence, charSequence3)) {
            return false;
        }
        if (TextUtils.equals(charSequence2, charSequence4)) {
            return true;
        }
        if (charSequence2 == null || charSequence4 == null || !TextUtils.equals("vnd.android.cursor.item/phone_v2", charSequence)) {
            return false;
        }
        return a(charSequence2.toString(), charSequence4.toString());
    }

    private static boolean a(String str, String str2) {
        if (str.contains("#") != str2.contains("#") || str.contains("*") != str2.contains("*")) {
            return false;
        }
        String[] split = str.split(a);
        String[] split2 = str2.split(a);
        if (split.length != split2.length) {
            return false;
        }
        ddk a = ddk.a();
        for (int i = 0; i < split.length; i++) {
            String convertKeypadLettersToDigits = PhoneNumberUtils.convertKeypadLettersToDigits(split[i]);
            String str3 = split2[i];
            if (!TextUtils.equals(convertKeypadLettersToDigits, str3)) {
                switch (abo.a[a.b(convertKeypadLettersToDigits, str3) - 1]) {
                    case rq.b /*1*/:
                    case rq.c /*2*/:
                    case rl.g /*5*/:
                        return false;
                    case rl.e /*3*/:
                        break;
                    case rl.f /*4*/:
                        try {
                            if (a.a(convertKeypadLettersToDigits, null).b == 1 && str3.trim().charAt(0) != '1') {
                                break;
                            }
                            return false;
                        } catch (ddi e) {
                            try {
                                a.a(str3, null);
                                return false;
                            } catch (ddi e2) {
                                break;
                            }
                        }
                        break;
                    default:
                        throw new IllegalStateException("Unknown result value from phone number library");
                }
            }
        }
        return true;
    }

    public static Rect a(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        rect.left = iArr[0];
        rect.top = iArr[1];
        rect.right = iArr[0] + view.getWidth();
        rect.bottom = iArr[1] + view.getHeight();
        return rect;
    }

    public static Intent a(afv afv, Uri uri) {
        Object obj = afv.d;
        Object c = afv.c();
        if (TextUtils.isEmpty(obj) || TextUtils.isEmpty(c)) {
            return null;
        }
        Intent intent = new Intent();
        intent.setClassName(obj, c);
        intent.setAction("com.android.contacts.action.INVITE_CONTACT");
        intent.setData(uri);
        return intent;
    }
}
