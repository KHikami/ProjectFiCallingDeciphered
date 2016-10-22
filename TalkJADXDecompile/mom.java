import java.math.BigDecimal;

enum mom extends moh {
    mom(String str, int i, boolean z, boolean z2) {
        super(4, true, true, (byte) 0);
    }

    public boolean a(Object obj) {
        return (obj instanceof Double) || (obj instanceof Float) || (obj instanceof BigDecimal);
    }
}
