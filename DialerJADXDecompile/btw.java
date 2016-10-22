import java.util.Arrays;

final class btw extends btr {
    private /* synthetic */ char[] b;

    btw(char[] cArr) {
        this.b = cArr;
    }

    public final boolean a(char c) {
        return Arrays.binarySearch(this.b, c) >= 0;
    }
}
