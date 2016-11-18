package p000;

import android.content.Context;
import android.content.Intent;
import java.io.OutputStream;
import org.apache.http.entity.ByteArrayEntity;

public final class ajo extends ByteArrayEntity {
    private final Context f1020a;
    private final byte[] f1021b;
    private final long f1022c;

    public ajo(Context context, long j, byte[] bArr) {
        super(bArr);
        this.f1020a = context;
        this.f1021b = bArr;
        this.f1022c = j;
    }

    public void writeTo(OutputStream outputStream) {
        if (outputStream == null) {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        try {
            m2641a(-1);
            int length = this.f1021b.length;
            int i = 0;
            while (i < length) {
                int i2 = length - i;
                if (i2 > 4096) {
                    i2 = 4096;
                }
                outputStream.write(this.f1021b, i, i2);
                outputStream.flush();
                i2 += i;
                m2641a((i2 * 100) / length);
                i = i2;
            }
        } finally {
            m2641a(-2);
        }
    }

    private void m2641a(int i) {
        if (this.f1022c > 0) {
            Intent intent = new Intent("com.android.mms.PROGRESS_STATUS");
            intent.putExtra("progress", i);
            intent.putExtra("token", this.f1022c);
            this.f1020a.sendBroadcast(intent);
        }
    }
}
