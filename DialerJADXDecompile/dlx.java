import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* compiled from: PG */
public class dlx implements Serializable, Comparable {
    public static final dlx a;
    private static char[] c = null;
    private static final long serialVersionUID = 1;
    public final byte[] b;
    private transient int d;
    private transient String e;

    public /* synthetic */ int compareTo(Object obj) {
        dlx dlx = (dlx) obj;
        int length = this.b.length;
        int length2 = dlx.b.length;
        int min = Math.min(length, length2);
        int i = 0;
        while (i < min) {
            int i2 = this.b[i] & 255;
            int i3 = dlx.b[i] & 255;
            if (i2 == i3) {
                i++;
            } else if (i2 < i3) {
                return -1;
            } else {
                return 1;
            }
        }
        if (length == length2) {
            return 0;
        }
        if (length >= length2) {
            return 1;
        }
        return -1;
    }

    static {
        c = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        a = a(new byte[0]);
    }

    dlx(byte[] bArr) {
        this.b = bArr;
    }

    public static dlx a(byte... bArr) {
        if (bArr != null) {
            return new dlx((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public static dlx a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        dlx dlx = new dlx(str.getBytes(dmk.a));
        dlx.e = str;
        return dlx;
    }

    public final String a() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        str = new String(this.b, dmk.a);
        this.e = str;
        return str;
    }

    private final dlx b(String str) {
        try {
            return a(MessageDigest.getInstance(str).digest(this.b));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public final String b() {
        int i = 0;
        char[] cArr = new char[(this.b.length << 1)];
        byte[] bArr = this.b;
        int length = bArr.length;
        int i2 = 0;
        while (i < length) {
            byte b = bArr[i];
            int i3 = i2 + 1;
            cArr[i2] = c[(b >> 4) & 15];
            i2 = i3 + 1;
            cArr[i3] = c[b & 15];
            i++;
        }
        return new String(cArr);
    }

    public final dlx c() {
        int i = 0;
        while (i < this.b.length) {
            byte b = this.b[i];
            if (b < (byte) 65 || b > (byte) 90) {
                i++;
            } else {
                byte[] bArr = (byte[]) this.b.clone();
                int i2 = i + 1;
                bArr[i] = (byte) (b + 32);
                for (i = i2; i < bArr.length; i++) {
                    byte b2 = bArr[i];
                    if (b2 >= (byte) 65 && b2 <= (byte) 90) {
                        bArr[i] = (byte) (b2 + 32);
                    }
                }
                return new dlx(bArr);
            }
        }
        return this;
    }

    public final byte[] d() {
        return (byte[]) this.b.clone();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof dlx) && ((dlx) obj).b.length == this.b.length) {
            int i;
            dlx dlx = (dlx) obj;
            byte[] bArr = this.b;
            int length = this.b.length;
            if (dlx.b.length - length < 0 || bArr.length - length < 0 || !dmk.a(dlx.b, 0, bArr, 0, length)) {
                i = 0;
            } else {
                i = 1;
            }
            if (i != 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        i = Arrays.hashCode(this.b);
        this.d = i;
        return i;
    }

    public String toString() {
        if (this.b.length == 0) {
            return "ByteString[size=0]";
        }
        if (this.b.length <= 16) {
            return String.format("ByteString[size=%s data=%s]", new Object[]{Integer.valueOf(this.b.length), b()});
        }
        return String.format("ByteString[size=%s md5=%s]", new Object[]{Integer.valueOf(this.b.length), b("MD5").b()});
    }

    private void readObject(ObjectInputStream objectInputStream) {
        int readInt = objectInputStream.readInt();
        if (objectInputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (readInt < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + readInt);
        } else {
            byte[] bArr = new byte[readInt];
            int i = 0;
            while (i < readInt) {
                int read = objectInputStream.read(bArr, i, readInt - i);
                if (read == -1) {
                    throw new EOFException();
                }
                i += read;
            }
            dlx dlx = new dlx(bArr);
            try {
                Field declaredField = dlx.class.getDeclaredField("b");
                declaredField.setAccessible(true);
                declaredField.set(this, dlx.b);
            } catch (NoSuchFieldException e) {
                throw new AssertionError();
            } catch (IllegalAccessException e2) {
                throw new AssertionError();
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.b.length);
        objectOutputStream.write(this.b);
    }
}
