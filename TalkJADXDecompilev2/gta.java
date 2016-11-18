package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

public final class gta {
    private static final Lock a = new ReentrantLock();
    private static gta b;
    private final Lock c = new ReentrantLock();
    private final SharedPreferences d;

    private gta(Context context) {
        this.d = context.getSharedPreferences("com.google.android.gms.base.signin", 0);
    }

    private GoogleSignInAccount a(String str) {
        GoogleSignInAccount googleSignInAccount = null;
        if (!TextUtils.isEmpty(str)) {
            String str2 = "googleSignInAccount";
            String valueOf = String.valueOf(":");
            str2 = b(new StringBuilder(((String.valueOf(str2).length() + 0) + String.valueOf(valueOf).length()) + String.valueOf(str).length()).append(str2).append(valueOf).append(str).toString());
            if (str2 != null) {
                try {
                    googleSignInAccount = GoogleSignInAccount.a(str2);
                } catch (JSONException e) {
                }
            }
        }
        return googleSignInAccount;
    }

    public static gta a(Context context) {
        gwb.L((Object) context);
        a.lock();
        try {
            if (b == null) {
                b = new gta(context.getApplicationContext());
            }
            gta gta = b;
            return gta;
        } finally {
            a.unlock();
        }
    }

    private String b(String str) {
        this.c.lock();
        try {
            String string = this.d.getString(str, null);
            return string;
        } finally {
            this.c.unlock();
        }
    }

    public GoogleSignInAccount a() {
        return a(b("defaultGoogleSignInAccount"));
    }
}
