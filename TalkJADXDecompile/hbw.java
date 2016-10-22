import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

public final class hbw {
    SharedPreferences a;
    Context b;

    public hbw(Context context) {
        this(context, "com.google.android.gms.iid.appid");
    }

    private hbw(Context context, String str) {
        this.b = context;
        this.a = context.getSharedPreferences(str, 4);
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf("-no-backup");
        File file = new File(gwb.Y(this.b), valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !a()) {
                    hbp.a(this.b, this);
                }
            } catch (IOException e) {
                if (Log.isLoggable("InstanceID/Store", 3)) {
                    valueOf = "Error creating file in no backup dir: ";
                    valueOf2 = String.valueOf(e.getMessage());
                    if (valueOf2.length() != 0) {
                        valueOf.concat(valueOf2);
                    } else {
                        valueOf2 = new String(valueOf);
                    }
                }
            }
        }
    }

    private synchronized String a(String str, String str2) {
        SharedPreferences sharedPreferences;
        String valueOf;
        sharedPreferences = this.a;
        valueOf = String.valueOf("|S|");
        return sharedPreferences.getString(new StringBuilder(((String.valueOf(str).length() + 0) + String.valueOf(valueOf).length()) + String.valueOf(str2).length()).append(str).append(valueOf).append(str2).toString(), null);
    }

    private synchronized void a(Editor editor, String str, String str2, String str3) {
        String valueOf = String.valueOf("|S|");
        editor.putString(new StringBuilder(((String.valueOf(str).length() + 0) + String.valueOf(valueOf).length()) + String.valueOf(str2).length()).append(str).append(valueOf).append(str2).toString(), str3);
    }

    private static String b(String str, String str2, String str3) {
        String valueOf = String.valueOf("|T|");
        return new StringBuilder((((String.valueOf(str).length() + 1) + String.valueOf(valueOf).length()) + String.valueOf(str2).length()) + String.valueOf(str3).length()).append(str).append(valueOf).append(str2).append("|").append(str3).toString();
    }

    private synchronized void e(String str) {
        Editor edit = this.a.edit();
        for (String str2 : this.a.getAll().keySet()) {
            if (str2.startsWith(str)) {
                edit.remove(str2);
            }
        }
        edit.commit();
    }

    private KeyPair f(String str) {
        Object e;
        String a = a(str, "|P|");
        String a2 = a(str, "|K|");
        if (a2 == null) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(a, 8);
            byte[] decode2 = Base64.decode(a2, 8);
            KeyFactory instance = KeyFactory.getInstance("RSA");
            return new KeyPair(instance.generatePublic(new X509EncodedKeySpec(decode)), instance.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
        } catch (InvalidKeySpecException e2) {
            e = e2;
            a = String.valueOf(e);
            new StringBuilder(String.valueOf(a).length() + 19).append("Invalid key stored ").append(a);
            hbp.a(this.b, this);
            return null;
        } catch (NoSuchAlgorithmException e3) {
            e = e3;
            a = String.valueOf(e);
            new StringBuilder(String.valueOf(a).length() + 19).append("Invalid key stored ").append(a);
            hbp.a(this.b, this);
            return null;
        }
    }

    synchronized String a(String str) {
        return this.a.getString(str, null);
    }

    public synchronized String a(String str, String str2, String str3) {
        return this.a.getString(b(str, str2, str3), null);
    }

    synchronized KeyPair a(String str, long j) {
        KeyPair am;
        am = gwb.am();
        Editor edit = this.a.edit();
        a(edit, str, "|P|", hbo.a(am.getPublic().getEncoded()));
        a(edit, str, "|K|", hbo.a(am.getPrivate().getEncoded()));
        a(edit, str, "cre", Long.toString(j));
        edit.commit();
        return am;
    }

    public synchronized void a(String str, String str2, String str3, String str4, String str5) {
        String b = b(str, str2, str3);
        Editor edit = this.a.edit();
        edit.putString(b, str4);
        edit.putString("appVersion", str5);
        edit.putString("lastToken", Long.toString(System.currentTimeMillis() / 1000));
        edit.commit();
    }

    public boolean a() {
        return this.a.getAll().isEmpty();
    }

    public KeyPair b(String str) {
        return f(str);
    }

    public synchronized void b() {
        this.a.edit().clear().commit();
    }

    void c(String str) {
        e(String.valueOf(str).concat("|"));
    }

    public void d(String str) {
        e(String.valueOf(str).concat("|T|"));
    }
}
