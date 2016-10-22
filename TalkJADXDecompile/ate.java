import java.io.ByteArrayInputStream;
import java.io.InputStream;

final class ate implements atb<InputStream> {
    final /* synthetic */ atd a;

    ate(atd atd) {
        this.a = atd;
    }

    public Class<InputStream> a() {
        return InputStream.class;
    }

    public /* synthetic */ Object a(byte[] bArr) {
        return new ByteArrayInputStream(bArr);
    }
}
