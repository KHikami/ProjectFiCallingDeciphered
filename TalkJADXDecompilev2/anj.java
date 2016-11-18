package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;

public class anj {
    public final ard a;
    public final aqy b;

    public Bitmap a(int i, int i2, Config config) {
        return this.a.b(i, i2, config);
    }

    public void a(Bitmap bitmap) {
        this.a.a(bitmap);
    }

    public byte[] a(int i) {
        if (this.b == null) {
            return new byte[i];
        }
        return (byte[]) this.b.a(i, byte[].class);
    }

    public void a(byte[] bArr) {
        if (this.b != null) {
            this.b.a((Object) bArr, byte[].class);
        }
    }

    public int[] b(int i) {
        if (this.b == null) {
            return new int[i];
        }
        return (int[]) this.b.a(i, int[].class);
    }

    public void a(int[] iArr) {
        if (this.b != null) {
            this.b.a((Object) iArr, int[].class);
        }
    }

    public anj(ard ard, aqy aqy) {
        this.a = ard;
        this.b = aqy;
    }
}
