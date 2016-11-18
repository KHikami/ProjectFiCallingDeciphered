package p000;

import java.math.BigInteger;
import java.util.Locale;

final class mqf extends mps<Number> {
    final /* synthetic */ boolean f28109a;

    mqf(Number number, boolean z) {
        this.f28109a = z;
        super(number);
    }

    public String mo3904a() {
        Number number = (Number) this.f28019b;
        long longValue = number.longValue();
        if (number instanceof Long) {
            return mqb.m32685a(longValue, new char[16], this.f28109a);
        }
        if (number instanceof Integer) {
            return mqb.m32685a(4294967295L & longValue, new char[8], this.f28109a);
        }
        if (number instanceof Byte) {
            return mqb.m32685a(255 & longValue, new char[2], this.f28109a);
        }
        if (number instanceof Short) {
            return mqb.m32685a(65535 & longValue, new char[4], this.f28109a);
        }
        String bigInteger = ((BigInteger) number).toString(16);
        return this.f28109a ? bigInteger.toUpperCase(Locale.ROOT) : bigInteger;
    }
}
