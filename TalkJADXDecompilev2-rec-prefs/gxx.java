package p000;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

abstract class gxx extends gww {
    private int f16363a;

    protected gxx(byte[] bArr) {
        gwb.m2048b(bArr.length == 25, "cert hash data has incorrect length. length=" + bArr.length);
        this.f16363a = Arrays.hashCode(bArr);
    }

    protected static byte[] m18930a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public gyj mo2361a() {
        return gym.m18961a(mo2414c());
    }

    public int mo2362b() {
        return hashCode();
    }

    abstract byte[] mo2414c();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof gwv)) {
            return false;
        }
        try {
            gwv gwv = (gwv) obj;
            if (gwv.mo2362b() != hashCode()) {
                return false;
            }
            gyj a = gwv.mo2361a();
            if (a == null) {
                return false;
            }
            return Arrays.equals(mo2414c(), (byte[]) gym.m18962a(a));
        } catch (RemoteException e) {
            Log.e("GoogleCertificates", "iCertData failed to retrive data from remote");
            return false;
        }
    }

    public int hashCode() {
        return this.f16363a;
    }
}
