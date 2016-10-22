package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: gkw */
public final class gkw {
    private static final String[] a;

    static {
        int i = 0;
        a = new String[]{"24BB24C05E47E0AEFA68A58A766179D9B613A600", "2A3B2FF537ECE7A1D88388ADDE13DE707B5CAD50", "38918A453D07199354F8B19AF05EC6562CED5788", "3AE924E5358572D2129B3479D99EB2C6D2360161", "5BC4FF008D6CE61D08F0418745EB403753AF76E7", "B6FA7B8B25BF050925AE82CD5608132B5FA0871A", "BE69110A4B3B1626A11F50A5F6A9A0922AD6F5D1", "038BAA00FC34F1EF9F7BE561B8656378863E3019", "D384B03B29D313E480BAF95336973B8698CF09C1", "AF362590931B148FC5D8FC3CAD5D2D2FEFAFE5C4", "58E1C4133F7441EC3D2C270270A14802DA47BA0E"};
        while (i < a.length) {
            a[i] = a[i].toUpperCase(Locale.US);
            i++;
        }
        Arrays.sort(a);
    }

    public static boolean a(Context context, String str) {
        String str2 = "Checking signature of ";
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2.concat(valueOf);
        } else {
            valueOf = new String(str2);
        }
        PackageManager packageManager = context.getPackageManager();
        if (gtw.a(context).a(packageManager, str)) {
            return true;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA1");
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            PackageInfo packageInfo2 = packageManager.getPackageInfo(context.getPackageName(), 64);
            if (packageInfo2.signatures.length != 1) {
                glk.e("Babel", "Self signed with " + packageInfo2.signatures.length + " signatures.", new Object[0]);
                return false;
            }
            Signature signature = packageInfo2.signatures[0];
            str2 = "Self signature: ";
            String valueOf2 = String.valueOf(gwb.c(instance.digest(signature.toByteArray())));
            if (valueOf2.length() != 0) {
                str2.concat(valueOf2);
            } else {
                valueOf2 = new String(str2);
            }
            if (packageInfo.signatures.length <= 0) {
                glk.e("Babel", "Package signed with < 1 signature.", new Object[0]);
                return false;
            }
            Signature[] signatureArr = packageInfo.signatures;
            int length = signatureArr.length;
            int i = 0;
            while (i < length) {
                Signature signature2 = signatureArr[i];
                String c = gwb.c(instance.digest(signature2.toByteArray()));
                String str3 = "Checking signature: ";
                String valueOf3 = String.valueOf(c);
                if (valueOf3.length() != 0) {
                    str3.concat(valueOf3);
                } else {
                    valueOf3 = new String(str3);
                }
                if (Arrays.binarySearch(a, c) >= 0 || signature2.equals(signature)) {
                    i++;
                } else {
                    str2 = String.valueOf(signature2);
                    glk.e("Babel", new StringBuilder(String.valueOf(str2).length() + 30).append("Unrecognized signature found: ").append(str2).toString(), new Object[0]);
                    return false;
                }
            }
            return true;
        } catch (Throwable e) {
            glk.d("Babel", "checkForValidSignature caught", e);
            return false;
        } catch (NameNotFoundException e2) {
            str2 = "Babel";
            valueOf = "checkForValidSignature could not find ";
            String valueOf4 = String.valueOf(str);
            glk.a(str2, valueOf4.length() != 0 ? valueOf.concat(valueOf4) : new String(valueOf), new Object[0]);
            return false;
        }
    }
}
