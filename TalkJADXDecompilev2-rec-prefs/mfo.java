package p000;

import java.security.SecureRandom;
import java.util.Random;

public final class mfo {
    public static final SecureRandom f27617a;
    private static final Random f27618b = new mfp();

    static {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        f27617a = secureRandom;
    }
}
