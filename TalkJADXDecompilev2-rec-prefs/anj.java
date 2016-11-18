package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;

public class anj {
    public final ard f1872a;
    public final aqy f1873b;

    public Bitmap m3479a(int i, int i2, Config config) {
        return this.f1872a.mo362b(i, i2, config);
    }

    public void m3480a(Bitmap bitmap) {
        this.f1872a.mo361a(bitmap);
    }

    public byte[] m3483a(int i) {
        if (this.f1873b == null) {
            return new byte[i];
        }
        return (byte[]) this.f1873b.m3780a(i, byte[].class);
    }

    public void m3481a(byte[] bArr) {
        if (this.f1873b != null) {
            this.f1873b.m3785a((Object) bArr, byte[].class);
        }
    }

    public int[] m3484b(int i) {
        if (this.f1873b == null) {
            return new int[i];
        }
        return (int[]) this.f1873b.m3780a(i, int[].class);
    }

    public void m3482a(int[] iArr) {
        if (this.f1873b != null) {
            this.f1873b.m3785a((Object) iArr, int[].class);
        }
    }

    public anj(ard ard, aqy aqy) {
        this.f1872a = ard;
        this.f1873b = aqy;
    }
}
