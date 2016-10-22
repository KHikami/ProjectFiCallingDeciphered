package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import com.google.api.client.http.HttpStatusCodes;

/* renamed from: aio */
public final class aio {
    static final byte[] a;
    static final byte[] b;
    static final byte[] c;
    private SparseArray<Object> d;
    private Uri e;
    private byte[] f;

    static {
        a = "from-data".getBytes();
        b = "attachment".getBytes();
        c = "inline".getBytes();
    }

    public aio() {
        this.d = null;
        this.e = null;
        this.f = null;
        this.d = new SparseArray();
    }

    public void a(byte[] bArr) {
        if (bArr != null) {
            this.f = new byte[bArr.length];
            System.arraycopy(bArr, 0, this.f, 0, bArr.length);
        }
    }

    public byte[] a() {
        if (this.f == null) {
            return null;
        }
        byte[] bArr = new byte[this.f.length];
        System.arraycopy(this.f, 0, bArr, 0, this.f.length);
        return bArr;
    }

    public void a(Uri uri) {
        this.e = uri;
    }

    public Uri b() {
        return this.e;
    }

    public void b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("Content-Id may not be null or empty.");
        } else if (bArr.length > 1 && ((char) bArr[0]) == '<' && ((char) bArr[bArr.length - 1]) == '>') {
            this.d.put(192, bArr);
        } else {
            Object obj = new byte[(bArr.length + 2)];
            obj[0] = 60;
            obj[obj.length - 1] = 62;
            System.arraycopy(bArr, 0, obj, 1, bArr.length);
            this.d.put(192, obj);
        }
    }

    public byte[] c() {
        return (byte[]) this.d.get(192);
    }

    public void a(int i) {
        this.d.put(129, Integer.valueOf(i));
    }

    public int d() {
        Integer num = (Integer) this.d.get(129);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public void c(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("null content-location");
        }
        this.d.put(142, bArr);
    }

    public byte[] e() {
        return (byte[]) this.d.get(142);
    }

    public void d(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("null content-disposition");
        }
        this.d.put(197, bArr);
    }

    public byte[] f() {
        return (byte[]) this.d.get(197);
    }

    public void e(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("null content-type");
        }
        this.d.put(145, bArr);
    }

    public byte[] g() {
        return (byte[]) this.d.get(145);
    }

    public void f(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("null content-transfer-encoding");
        }
        this.d.put(HttpStatusCodes.STATUS_CODE_OK, bArr);
    }

    public byte[] h() {
        return (byte[]) this.d.get(HttpStatusCodes.STATUS_CODE_OK);
    }

    public void g(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("null content-id");
        }
        this.d.put(151, bArr);
    }

    public byte[] i() {
        return (byte[]) this.d.get(151);
    }

    public void h(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("null content-id");
        }
        this.d.put(152, bArr);
    }

    public byte[] j() {
        return (byte[]) this.d.get(152);
    }
}
