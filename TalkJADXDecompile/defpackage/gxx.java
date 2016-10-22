package defpackage;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: gxx */
abstract class gxx extends gww {
    private int a;

    protected gxx(byte[] bArr) {
        gwb.b(bArr.length == 25, "cert hash data has incorrect length. length=" + bArr.length);
        this.a = Arrays.hashCode(bArr);
    }

    protected static byte[] a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public gyj a() {
        return gym.a(c());
    }

    public int b() {
        return hashCode();
    }

    abstract byte[] c();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof gwv)) {
            return false;
        }
        try {
            gwv gwv = (gwv) obj;
            if (gwv.b() != hashCode()) {
                return false;
            }
            gyj a = gwv.a();
            if (a == null) {
                return false;
            }
            return Arrays.equals(c(), (byte[]) gym.a(a));
        } catch (RemoteException e) {
            Log.e("GoogleCertificates", "iCertData failed to retrive data from remote");
            return false;
        }
    }

    public int hashCode() {
        return this.a;
    }
}
