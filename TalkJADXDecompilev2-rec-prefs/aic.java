package p000;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public final class aic implements Cloneable {
    int f914a;
    byte[] f915b;

    public aic(int i, byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("EncodedStringValue: Text-string is null.");
        }
        this.f914a = i;
        this.f915b = new byte[bArr.length];
        System.arraycopy(bArr, 0, this.f915b, 0, bArr.length);
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
        this.f914a = i;
        try {
            this.f915b = str.getBytes(aib.m2438a(i));
        } catch (Throwable e) {
            Log.e("EncodedStringValue", "Input encoding " + i + " must be supported.", e);
            this.f915b = str.getBytes();
        }
    }

    public int m2440a() {
        return this.f914a;
    }

    public byte[] m2443b() {
        Object obj = new byte[this.f915b.length];
        System.arraycopy(this.f915b, 0, obj, 0, this.f915b.length);
        return obj;
    }

    public void m2441a(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("EncodedStringValue: Text-string is null.");
        }
        this.f915b = new byte[bArr.length];
        System.arraycopy(bArr, 0, this.f915b, 0, bArr.length);
    }

    public String m2444c() {
        if (this.f914a == 0) {
            return new String(this.f915b);
        }
        try {
            return new String(this.f915b, aib.m2438a(this.f914a));
        } catch (UnsupportedEncodingException e) {
            try {
                return new String(this.f915b, "iso-8859-1");
            } catch (UnsupportedEncodingException e2) {
                return new String(this.f915b);
            }
        }
    }

    public void m2442b(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("Text-string is null.");
        } else if (this.f915b == null) {
            this.f915b = new byte[bArr.length];
            System.arraycopy(bArr, 0, this.f915b, 0, bArr.length);
        } else {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(this.f915b);
                byteArrayOutputStream.write(bArr);
                this.f915b = byteArrayOutputStream.toByteArray();
            } catch (IOException e) {
                e.printStackTrace();
                throw new NullPointerException("appendTextString: failed when write a new Text-string");
            }
        }
    }

    public Object clone() {
        super.clone();
        int length = this.f915b.length;
        byte[] bArr = new byte[length];
        System.arraycopy(this.f915b, 0, bArr, 0, length);
        try {
            return new aic(this.f914a, bArr);
        } catch (Exception e) {
            String valueOf = String.valueOf(this);
            Log.e("EncodedStringValue", new StringBuilder(String.valueOf(valueOf).length() + 39).append("failed to clone an EncodedStringValue: ").append(valueOf).toString());
            e.printStackTrace();
            throw new CloneNotSupportedException(e.getMessage());
        }
    }

    public static aic[] m2439a(String[] strArr) {
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
