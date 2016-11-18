package p000;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public final class jpt {
    private static final int f20746a;
    private final byte[] f20747b;
    private final long f20748c;

    static {
        try {
            f20746a = MessageDigest.getInstance("SHA-1").getDigestLength();
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    private jpt(byte[] bArr, long j) {
        if (bArr == null || bArr.length != f20746a) {
            throw new IllegalArgumentException("Incorrect fingerprint size");
        }
        this.f20747b = bArr;
        this.f20748c = j;
    }

    public static jpt m24959a(InputStream inputStream) {
        Throwable e;
        byte[] bArr = new byte[8192];
        DigestInputStream digestInputStream = null;
        DigestInputStream digestInputStream2;
        try {
            digestInputStream2 = new DigestInputStream(new BufferedInputStream(inputStream, 8192), MessageDigest.getInstance("SHA-1"));
            long j = 0;
            while (true) {
                try {
                    int read = digestInputStream2.read(bArr);
                    if (read >= 0) {
                        j += (long) read;
                    } else {
                        digestInputStream2.close();
                        return new jpt(digestInputStream2.getMessageDigest().digest(), j);
                    }
                } catch (NoSuchAlgorithmException e2) {
                    e = e2;
                }
            }
        } catch (NoSuchAlgorithmException e3) {
            e = e3;
            digestInputStream2 = null;
            try {
                throw new IllegalStateException(e);
            } catch (Throwable th) {
                e = th;
                digestInputStream = digestInputStream2;
                if (digestInputStream != null) {
                    digestInputStream.close();
                }
                throw e;
            }
        } catch (Throwable th2) {
            e = th2;
            if (digestInputStream != null) {
                digestInputStream.close();
            }
            throw e;
        }
    }

    public static String m24958a(String str) {
        if (str == null) {
            return null;
        }
        String str2 = "cs_01_";
        String valueOf = String.valueOf(str.substring(0, 32));
        return valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
    }

    public String m24960a() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < f20746a; i++) {
            byte b = this.f20747b[i];
            stringBuilder.append(Integer.toHexString((b >> 4) & 15));
            stringBuilder.append(Integer.toHexString(b & 15));
        }
        return stringBuilder.toString();
    }

    public long m24961b() {
        return this.f20748c;
    }

    public byte[] m24962c() {
        return this.f20747b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpt)) {
            return false;
        }
        return Arrays.equals(this.f20747b, ((jpt) obj).f20747b);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f20747b);
    }
}
