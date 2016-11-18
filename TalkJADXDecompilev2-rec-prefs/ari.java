package p000;

import java.util.Arrays;

public final class ari implements aqx<int[]> {
    public /* synthetic */ int mo363a(Object obj) {
        return ((int[]) obj).length;
    }

    public /* synthetic */ void mo367b(Object obj) {
        Arrays.fill((int[]) obj, 0);
    }

    public String mo365a() {
        return "IntegerArrayPool";
    }

    public int mo366b() {
        return 4;
    }

    public /* synthetic */ Object mo364a(int i) {
        return new int[i];
    }
}
