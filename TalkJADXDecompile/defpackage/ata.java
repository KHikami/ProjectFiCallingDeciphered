package defpackage;

import java.nio.ByteBuffer;

/* renamed from: ata */
final class ata implements atb<ByteBuffer> {
    final /* synthetic */ asz a;

    ata(asz asz) {
        this.a = asz;
    }

    public Class<ByteBuffer> a() {
        return ByteBuffer.class;
    }

    public /* synthetic */ Object a(byte[] bArr) {
        return ByteBuffer.wrap(bArr);
    }
}
