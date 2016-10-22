package defpackage;

import android.content.Context;
import android.content.Intent;
import java.io.OutputStream;
import org.apache.http.entity.ByteArrayEntity;

/* renamed from: ajo */
public final class ajo extends ByteArrayEntity {
    private final Context a;
    private final byte[] b;
    private final long c;

    public ajo(Context context, long j, byte[] bArr) {
        super(bArr);
        this.a = context;
        this.b = bArr;
        this.c = j;
    }

    public void writeTo(OutputStream outputStream) {
        if (outputStream == null) {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        try {
            a(-1);
            int length = this.b.length;
            int i = 0;
            while (i < length) {
                int i2 = length - i;
                if (i2 > 4096) {
                    i2 = 4096;
                }
                outputStream.write(this.b, i, i2);
                outputStream.flush();
                i2 += i;
                a((i2 * 100) / length);
                i = i2;
            }
        } finally {
            a(-2);
        }
    }

    private void a(int i) {
        if (this.c > 0) {
            Intent intent = new Intent("com.android.mms.PROGRESS_STATUS");
            intent.putExtra("progress", i);
            intent.putExtra("token", this.c);
            this.a.sendBroadcast(intent);
        }
    }
}
