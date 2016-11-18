package p000;

import java.security.Provider;

public class jbl extends Provider {
    public jbl() {
        super("LinuxPRNG", 1.0d, "A Linux-specific random number provider that uses /dev/urandom");
        put("SecureRandom.SHA1PRNG", jbk.class.getName());
        put("SecureRandom.SHA1PRNG ImplementedIn", "Software");
    }
}
