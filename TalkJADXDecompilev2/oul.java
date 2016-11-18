package defpackage;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.atomic.AtomicBoolean;

final class oul implements ReadableByteChannel {
    private final InputStream a;
    private final AtomicBoolean b = new AtomicBoolean(true);

    private oul(InputStream inputStream) {
        this.a = inputStream;
    }

    static ReadableByteChannel a(InputStream inputStream) {
        if (inputStream instanceof FileInputStream) {
            return ((FileInputStream) inputStream).getChannel();
        }
        return new oul(inputStream);
    }

    public int read(ByteBuffer byteBuffer) {
        int read;
        if (byteBuffer.hasArray()) {
            read = this.a.read(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            if (read > 0) {
                byteBuffer.position(byteBuffer.position() + read);
            }
        } else {
            byte[] bArr = new byte[Math.min(16384, Math.min(Math.max(this.a.available(), 4096), byteBuffer.remaining()))];
            read = this.a.read(bArr);
            if (read > 0) {
                byteBuffer.put(bArr, 0, read);
            }
        }
        return read;
    }

    public boolean isOpen() {
        return this.b.get();
    }

    public void close() {
        if (this.b.compareAndSet(true, false)) {
            this.a.close();
        }
    }
}
