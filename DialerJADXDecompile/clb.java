import java.util.Arrays;

final class clb {
    public final boolean equals(Object obj) {
        return obj == this ? true : !(obj instanceof clb) ? false : Arrays.equals(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(null) + 16337;
    }
}
