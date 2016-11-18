package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

public final class gta {
    private static final Lock f16041a = new ReentrantLock();
    private static gta f16042b;
    private final Lock f16043c = new ReentrantLock();
    private final SharedPreferences f16044d;

    private gta(Context context) {
        this.f16044d = context.getSharedPreferences("com.google.android.gms.base.signin", 0);
    }

    private GoogleSignInAccount m18506a(String str) {
        GoogleSignInAccount googleSignInAccount = null;
        if (!TextUtils.isEmpty(str)) {
            String str2 = "googleSignInAccount";
            String valueOf = String.valueOf(":");
            str2 = m18508b(new StringBuilder(((String.valueOf(str2).length() + 0) + String.valueOf(valueOf).length()) + String.valueOf(str).length()).append(str2).append(valueOf).append(str).toString());
            if (str2 != null) {
                try {
                    googleSignInAccount = GoogleSignInAccount.m9638a(str2);
                } catch (JSONException e) {
                }
            }
        }
        return googleSignInAccount;
    }

    public static gta m18507a(Context context) {
        gwb.m1419L((Object) context);
        f16041a.lock();
        try {
            if (f16042b == null) {
                f16042b = new gta(context.getApplicationContext());
            }
            gta gta = f16042b;
            return gta;
        } finally {
            f16041a.unlock();
        }
    }

    private String m18508b(String str) {
        this.f16043c.lock();
        try {
            String string = this.f16044d.getString(str, null);
            return string;
        } finally {
            this.f16043c.unlock();
        }
    }

    public GoogleSignInAccount m18509a() {
        return m18506a(m18508b("defaultGoogleSignInAccount"));
    }
}
