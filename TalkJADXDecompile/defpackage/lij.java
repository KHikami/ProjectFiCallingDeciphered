package defpackage;

import android.os.Build.VERSION;
import java.io.IOException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;

/* renamed from: lij */
public final class lij implements lhi {
    public void a() {
        try {
            if (VERSION.SDK_INT >= 16 && VERSION.SDK_INT <= 18) {
                Class.forName("org.apache.harmony.xnet.provider.jsse.NativeCrypto").getMethod("RAND_seed", new Class[]{byte[].class}).invoke(null, new Object[]{jbj.a()});
                int intValue = ((Integer) Class.forName("org.apache.harmony.xnet.provider.jsse.NativeCrypto").getMethod("RAND_load_file", new Class[]{String.class, Long.TYPE}).invoke(null, new Object[]{"/dev/urandom", Integer.valueOf(1024)})).intValue();
                if (intValue != 1024) {
                    throw new IOException("Unexpected number of bytes read from Linux PRNG: " + intValue);
                }
            }
        } catch (Throwable e) {
            throw new SecurityException("Failed to seed OpenSSL PRNG", e);
        } catch (SecurityException e2) {
        }
        try {
            if (VERSION.SDK_INT <= 18) {
                Provider[] providers = Security.getProviders("SecureRandom.SHA1PRNG");
                if (providers == null || providers.length <= 0 || !jbl.class.equals(providers[0].getClass())) {
                    Security.insertProviderAt(new jbl(), 1);
                }
                SecureRandom secureRandom = new SecureRandom();
                String valueOf;
                if (jbl.class.equals(secureRandom.getProvider().getClass())) {
                    secureRandom = SecureRandom.getInstance("SHA1PRNG");
                    if (!jbl.class.equals(secureRandom.getProvider().getClass())) {
                        valueOf = String.valueOf(secureRandom.getProvider().getClass());
                        throw new SecurityException(new StringBuilder(String.valueOf(valueOf).length() + 63).append("SecureRandom.getInstance(\"SHA1PRNG\") backed by wrong Provider: ").append(valueOf).toString());
                    }
                    return;
                }
                valueOf = String.valueOf(secureRandom.getProvider().getClass());
                throw new SecurityException(new StringBuilder(String.valueOf(valueOf).length() + 45).append("new SecureRandom() backed by wrong Provider: ").append(valueOf).toString());
            }
        } catch (Throwable e3) {
            throw new SecurityException("SHA1PRNG not available", e3);
        } catch (SecurityException e4) {
        }
    }
}
