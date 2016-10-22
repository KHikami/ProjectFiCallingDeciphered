import java.math.BigInteger;

enum mol extends moh {
    mol(String str, int i, boolean z, boolean z2) {
        super(3, true, false, (byte) 0);
    }

    public boolean a(Object obj) {
        return (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof BigInteger);
    }
}
