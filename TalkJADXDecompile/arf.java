import java.util.Arrays;

public final class arf implements aqx<byte[]> {
    public /* synthetic */ int a(Object obj) {
        return ((byte[]) obj).length;
    }

    public /* synthetic */ void b(Object obj) {
        Arrays.fill((byte[]) obj, (byte) 0);
    }

    public String a() {
        return "ByteArrayPool";
    }

    public int b() {
        return 1;
    }

    public /* synthetic */ Object a(int i) {
        return new byte[i];
    }
}
