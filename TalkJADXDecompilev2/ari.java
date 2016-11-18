package defpackage;

import java.util.Arrays;

public final class ari implements aqx<int[]> {
    public /* synthetic */ int a(Object obj) {
        return ((int[]) obj).length;
    }

    public /* synthetic */ void b(Object obj) {
        Arrays.fill((int[]) obj, 0);
    }

    public String a() {
        return "IntegerArrayPool";
    }

    public int b() {
        return 4;
    }

    public /* synthetic */ Object a(int i) {
        return new int[i];
    }
}
