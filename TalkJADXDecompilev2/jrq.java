package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

final class jrq extends UploadDataProvider {
    final AtomicReference<ReadableByteChannel> a = new AtomicReference(null);
    final long b;
    long c = 0;
    final /* synthetic */ jro d;

    jrq(jro jro, long j) {
        this.d = jro;
        this.b = j;
    }

    public long a() {
        return this.b;
    }

    public void a(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        while (position == byteBuffer.position()) {
            if (c().read(byteBuffer) == -1) {
                throw new IOException("Insufficient bytes");
            }
        }
        this.c = ((long) (byteBuffer.position() - position)) + this.c;
        if (this.c > this.b) {
            throw new IOException("Incorrect length");
        }
        uploadDataSink.a(false);
    }

    public void a(UploadDataSink uploadDataSink) {
        this.c = 0;
        ba.a((ReadableByteChannel) this.a.getAndSet(b()));
    }

    private jsl<ReadableByteChannel> b() {
        return new jsl(Channels.newChannel(this.d.j.a()), this.d.k, this.b);
    }

    private ReadableByteChannel c() {
        ReadableByteChannel readableByteChannel = (ReadableByteChannel) this.a.get();
        if (readableByteChannel != null) {
            return readableByteChannel;
        }
        synchronized (this.a) {
            if (this.a.get() == null) {
                Closeable b = b();
                if (!this.a.compareAndSet(null, b)) {
                    ba.a(b);
                }
            }
        }
        return (ReadableByteChannel) this.a.get();
    }

    public void close() {
        ba.a((Closeable) this.a.getAndSet(null));
    }
}
