package p000;

import android.net.Uri;
import android.util.SparseArray;
import com.google.api.client.http.HttpStatusCodes;

public final class aio {
    static final byte[] f943a = "from-data".getBytes();
    static final byte[] f944b = "attachment".getBytes();
    static final byte[] f945c = "inline".getBytes();
    private SparseArray<Object> f946d;
    private Uri f947e;
    private byte[] f948f;

    public aio() {
        this.f946d = null;
        this.f947e = null;
        this.f948f = null;
        this.f946d = new SparseArray();
    }

    public void m2522a(byte[] bArr) {
        if (bArr != null) {
            this.f948f = new byte[bArr.length];
            System.arraycopy(bArr, 0, this.f948f, 0, bArr.length);
        }
    }

    public byte[] m2523a() {
        if (this.f948f == null) {
            return null;
        }
        byte[] bArr = new byte[this.f948f.length];
        System.arraycopy(this.f948f, 0, bArr, 0, this.f948f.length);
        return bArr;
    }

    public void m2521a(Uri uri) {
        this.f947e = uri;
    }

    public Uri m2524b() {
        return this.f947e;
    }

    public void m2525b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("Content-Id may not be null or empty.");
        } else if (bArr.length > 1 && ((char) bArr[0]) == '<' && ((char) bArr[bArr.length - 1]) == '>') {
            this.f946d.put(192, bArr);
        } else {
            Object obj = new byte[(bArr.length + 2)];
            obj[0] = 60;
            obj[obj.length - 1] = 62;
            System.arraycopy(bArr, 0, obj, 1, bArr.length);
            this.f946d.put(192, obj);
        }
    }

    public byte[] m2527c() {
        return (byte[]) this.f946d.get(192);
    }

    public void m2520a(int i) {
        this.f946d.put(129, Integer.valueOf(i));
    }

    public int m2528d() {
        Integer num = (Integer) this.f946d.get(129);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public void m2526c(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("null content-location");
        }
        this.f946d.put(142, bArr);
    }

    public byte[] m2531e() {
        return (byte[]) this.f946d.get(142);
    }

    public void m2529d(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("null content-disposition");
        }
        this.f946d.put(197, bArr);
    }

    public byte[] m2533f() {
        return (byte[]) this.f946d.get(197);
    }

    public void m2530e(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("null content-type");
        }
        this.f946d.put(145, bArr);
    }

    public byte[] m2535g() {
        return (byte[]) this.f946d.get(145);
    }

    public void m2532f(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("null content-transfer-encoding");
        }
        this.f946d.put(HttpStatusCodes.STATUS_CODE_OK, bArr);
    }

    public byte[] m2537h() {
        return (byte[]) this.f946d.get(HttpStatusCodes.STATUS_CODE_OK);
    }

    public void m2534g(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("null content-id");
        }
        this.f946d.put(151, bArr);
    }

    public byte[] m2538i() {
        return (byte[]) this.f946d.get(151);
    }

    public void m2536h(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("null content-id");
        }
        this.f946d.put(152, bArr);
    }

    public byte[] m2539j() {
        return (byte[]) this.f946d.get(152);
    }
}
