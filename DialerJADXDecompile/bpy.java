import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

public final class bpy {
    private static final Lock a;
    private static bpy b;
    private final Lock c;
    private final SharedPreferences d;

    static {
        a = new ReentrantLock();
    }

    private bpy(Context context) {
        this.c = new ReentrantLock();
        this.d = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static bpy a(Context context) {
        buf.A((Object) context);
        a.lock();
        try {
            if (b == null) {
                b = new bpy(context.getApplicationContext());
            }
            bpy bpy = b;
            return bpy;
        } finally {
            a.unlock();
        }
    }

    public final GoogleSignInAccount a(String str) {
        GoogleSignInAccount googleSignInAccount = null;
        if (!TextUtils.isEmpty(str)) {
            String b = b("googleSignInAccount" + ":" + str);
            if (b != null) {
                try {
                    googleSignInAccount = GoogleSignInAccount.a(b);
                } catch (JSONException e) {
                }
            }
        }
        return googleSignInAccount;
    }

    public final String b(String str) {
        this.c.lock();
        try {
            String string = this.d.getString(str, null);
            return string;
        } finally {
            this.c.unlock();
        }
    }
}
