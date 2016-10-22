import android.text.TextUtils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Locale;

public final class bnh extends bpb {
    private static boolean a;
    private blz b;
    private final boz c;
    private String d;
    private boolean e;
    private Object g;

    bnh(bnp bnp) {
        super(bnp);
        this.e = false;
        this.g = new Object();
        this.c = new boz(bnp.c);
    }

    private static String a(String str) {
        if (bpq.b("MD5") == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, bpq.b("MD5").digest(str.getBytes()))});
    }

    private final boolean a(blz blz, blz blz2) {
        String str = null;
        String str2 = blz2 == null ? null : blz2.a;
        if (TextUtils.isEmpty(str2)) {
            return true;
        }
        String b = this.f.g().b();
        synchronized (this.g) {
            if (!this.e) {
                this.d = m();
                this.e = true;
            } else if (TextUtils.isEmpty(this.d)) {
                if (blz != null) {
                    str = blz.a;
                }
                if (str == null) {
                    boolean g = g(str2 + b);
                    return g;
                }
                this.d = a(str + b);
            }
            Object a = a(str2 + b);
            if (TextUtils.isEmpty(a)) {
                return false;
            } else if (a.equals(this.d)) {
                return true;
            } else {
                if (TextUtils.isEmpty(this.d)) {
                    str = b;
                } else {
                    b("Resetting the client id because Advertising Id changed.");
                    str = this.f.g().c();
                    a("New client Id", str);
                }
                g = g(str2 + str);
                return g;
            }
        }
    }

    private final synchronized blz d() {
        if (this.c.a(1000)) {
            this.c.a();
            blz l = l();
            if (a(this.b, l)) {
                this.b = l;
            } else {
                f("Failed to reset client id on adid change. Not using adid");
                this.b = new blz("", false);
            }
        }
        return this.b;
    }

    private final boolean g(String str) {
        try {
            String a = a(str);
            b("Storing hashed adid.");
            FileOutputStream openFileOutput = this.f.a.openFileOutput("gaClientIdData", 0);
            openFileOutput.write(a.getBytes());
            openFileOutput.close();
            this.d = a;
            return true;
        } catch (IOException e) {
            e("Error creating hash file", e);
            return false;
        }
    }

    private blz l() {
        blz blz = null;
        try {
            blz = bly.a(this.f.a);
        } catch (IllegalStateException e) {
            e("IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added '<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />' to your application manifest file. See http://goo.gl/naFqQk for details.");
        } catch (Throwable th) {
            if (!a) {
                a = true;
                d("Error getting advertiser id", th);
            }
        }
        return blz;
    }

    private String m() {
        Object obj;
        String str = null;
        try {
            FileInputStream openFileInput = this.f.a.openFileInput("gaClientIdData");
            byte[] bArr = new byte[128];
            int read = openFileInput.read(bArr, 0, 128);
            if (openFileInput.available() > 0) {
                e("Hash file seems corrupted, deleting it.");
                openFileInput.close();
                this.f.a.deleteFile("gaClientIdData");
                return null;
            } else if (read <= 0) {
                b("Hash file is empty.");
                openFileInput.close();
                return null;
            } else {
                String str2 = new String(bArr, 0, read);
                try {
                    openFileInput.close();
                    return str2;
                } catch (FileNotFoundException e) {
                    return str2;
                } catch (IOException e2) {
                    IOException iOException = e2;
                    str = str2;
                    IOException iOException2 = iOException;
                    d("Error reading Hash file, deleting it", obj);
                    this.f.a.deleteFile("gaClientIdData");
                    return str;
                }
            }
        } catch (FileNotFoundException e3) {
            return null;
        } catch (IOException e4) {
            obj = e4;
            d("Error reading Hash file, deleting it", obj);
            this.f.a.deleteFile("gaClientIdData");
            return str;
        }
    }

    protected final void a() {
    }

    public final boolean b() {
        o();
        blz d = d();
        return (d == null || d.b) ? false : true;
    }

    public final String c() {
        o();
        blz d = d();
        CharSequence charSequence = d != null ? d.a : null;
        return TextUtils.isEmpty(charSequence) ? null : charSequence;
    }
}
