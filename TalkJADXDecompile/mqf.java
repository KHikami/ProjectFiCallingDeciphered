import java.math.BigInteger;
import java.util.Locale;

final class mqf extends mps<Number> {
    final /* synthetic */ boolean a;

    mqf(Number number, boolean z) {
        this.a = z;
        super(number);
    }

    public String a() {
        Number number = (Number) this.b;
        long longValue = number.longValue();
        if (number instanceof Long) {
            return mqb.a(longValue, new char[16], this.a);
        }
        if (number instanceof Integer) {
            return mqb.a(4294967295L & longValue, new char[8], this.a);
        }
        if (number instanceof Byte) {
            return mqb.a(255 & longValue, new char[2], this.a);
        }
        if (number instanceof Short) {
            return mqb.a(65535 & longValue, new char[4], this.a);
        }
        String bigInteger = ((BigInteger) number).toString(16);
        return this.a ? bigInteger.toUpperCase(Locale.ROOT) : bigInteger;
    }
}
