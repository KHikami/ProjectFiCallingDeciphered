import java.util.Arrays;

final class bzi extends bwi {
    private final byte[] a;

    bzi(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.a = bArr;
    }

    final byte[] a() {
        return this.a;
    }
}
