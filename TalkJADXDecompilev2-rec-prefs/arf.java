package p000;

import java.util.Arrays;

public final class arf implements aqx<byte[]> {
    public /* synthetic */ int mo363a(Object obj) {
        return ((byte[]) obj).length;
    }

    public /* synthetic */ void mo367b(Object obj) {
        Arrays.fill((byte[]) obj, (byte) 0);
    }

    public String mo365a() {
        return "ByteArrayPool";
    }

    public int mo366b() {
        return 1;
    }

    public /* synthetic */ Object mo364a(int i) {
        return new byte[i];
    }
}
