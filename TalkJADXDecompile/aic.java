import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public final class aic implements Cloneable {
    int a;
    byte[] b;

    public aic(int i, byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("EncodedStringValue: Text-string is null.");
        }
        this.a = i;
        this.b = new byte[bArr.length];
        System.arraycopy(bArr, 0, this.b, 0, bArr.length);
    }

    public aic(byte[] bArr) {
        this(106, bArr);
    }

    public aic(String str) {
        this(106, str);
    }

    public aic(int i, String str) {
        if (str == null) {
            throw new NullPointerException("EncodedStringValue: Text-string is null");
        }
        this.a = i;
        try {
            this.b = str.getBytes(aib.a(i));
        } catch (Throwable e) {
            Log.e("EncodedStringValue", "Input encoding " + i + " must be supported.", e);
            this.b = str.getBytes();
        }
    }

    public int a() {
        return this.a;
    }

    public byte[] b() {
        Object obj = new byte[this.b.length];
        System.arraycopy(this.b, 0, obj, 0, this.b.length);
        return obj;
    }

    public void a(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("EncodedStringValue: Text-string is null.");
        }
        this.b = new byte[bArr.length];
        System.arraycopy(bArr, 0, this.b, 0, bArr.length);
    }

    public String c() {
        if (this.a == 0) {
            return new String(this.b);
        }
        try {
            return new String(this.b, aib.a(this.a));
        } catch (UnsupportedEncodingException e) {
            try {
                return new String(this.b, "iso-8859-1");
            } catch (UnsupportedEncodingException e2) {
                return new String(this.b);
            }
        }
    }

    public void b(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("Text-string is null.");
        } else if (this.b == null) {
            this.b = new byte[bArr.length];
            System.arraycopy(bArr, 0, this.b, 0, bArr.length);
        } else {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(this.b);
                byteArrayOutputStream.write(bArr);
                this.b = byteArrayOutputStream.toByteArray();
            } catch (IOException e) {
                e.printStackTrace();
                throw new NullPointerException("appendTextString: failed when write a new Text-string");
            }
        }
    }

    public Object clone() {
        super.clone();
        int length = this.b.length;
        byte[] bArr = new byte[length];
        System.arraycopy(this.b, 0, bArr, 0, length);
        try {
            return new aic(this.a, bArr);
        } catch (Exception e) {
            String valueOf = String.valueOf(this);
            Log.e("EncodedStringValue", new StringBuilder(String.valueOf(valueOf).length() + 39).append("failed to clone an EncodedStringValue: ").append(valueOf).toString());
            e.printStackTrace();
            throw new CloneNotSupportedException(e.getMessage());
        }
    }

    public static aic[] a(String[] strArr) {
        int length = strArr.length;
        if (length <= 0) {
            return null;
        }
        aic[] aicArr = new aic[length];
        for (int i = 0; i < length; i++) {
            aicArr[i] = new aic(strArr[i]);
        }
        return aicArr;
    }
}
