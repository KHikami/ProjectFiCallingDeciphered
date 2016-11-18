package defpackage;

import java.security.SecureRandom;
import java.util.Random;

public final class mfo {
    public static final SecureRandom a;
    private static final Random b = new mfp();

    static {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        a = secureRandom;
    }
}
