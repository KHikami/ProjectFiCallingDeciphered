package org.chromium.net;

import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.interfaces.ECKey;
import java.security.interfaces.RSAKey;
import java.security.interfaces.RSAPrivateKey;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.JNINamespace;
import ots;

@JNINamespace
public class AndroidKeyStore {
    @CalledByNative
    private static byte[] getRSAKeyModulus(PrivateKey privateKey) {
        if (privateKey instanceof RSAKey) {
            return ((RSAKey) privateKey).getModulus().toByteArray();
        }
        ots.c("AndroidKeyStore", "Not a RSAKey instance!", new Object[0]);
        return null;
    }

    @CalledByNative
    private static byte[] getECKeyOrder(PrivateKey privateKey) {
        if (privateKey instanceof ECKey) {
            return ((ECKey) privateKey).getParams().getOrder().toByteArray();
        }
        ots.c("AndroidKeyStore", "Not an ECKey instance!", new Object[0]);
        return null;
    }

    @CalledByNative
    private static byte[] rawSignDigestWithPrivateKey(PrivateKey privateKey, byte[] bArr) {
        Signature instance;
        byte[] bArr2 = null;
        try {
            String algorithm = privateKey.getAlgorithm();
            if ("RSA".equalsIgnoreCase(algorithm)) {
                instance = Signature.getInstance("NONEwithRSA");
            } else {
                if ("EC".equalsIgnoreCase(algorithm)) {
                    instance = Signature.getInstance("NONEwithECDSA");
                }
                instance = bArr2;
            }
        } catch (NoSuchAlgorithmException e) {
        }
        if (instance == null) {
            ots.d("AndroidKeyStore", "Unsupported private key algorithm: " + privateKey.getAlgorithm(), new Object[0]);
        } else {
            try {
                instance.initSign(privateKey);
                instance.update(bArr);
                bArr2 = instance.sign();
            } catch (Exception e2) {
                ots.d("AndroidKeyStore", "Exception while signing message with " + privateKey.getAlgorithm() + " private key: " + e2, new Object[0]);
            }
        }
        return bArr2;
    }

    @CalledByNative
    private static int getPrivateKeyType(PrivateKey privateKey) {
        String algorithm = privateKey.getAlgorithm();
        if ("RSA".equalsIgnoreCase(algorithm)) {
            return 0;
        }
        if ("EC".equalsIgnoreCase(algorithm)) {
            return 2;
        }
        return 255;
    }

    private static Object a(PrivateKey privateKey) {
        if (privateKey == null) {
            ots.d("AndroidKeyStore", "privateKey == null", new Object[0]);
            return null;
        } else if (privateKey instanceof RSAPrivateKey) {
            try {
                Class cls = Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLRSAPrivateKey");
                if (cls.isInstance(privateKey)) {
                    Method declaredMethod;
                    try {
                        declaredMethod = cls.getDeclaredMethod("getOpenSSLKey", new Class[0]);
                        declaredMethod.setAccessible(true);
                        Object invoke = declaredMethod.invoke(privateKey, new Object[0]);
                        declaredMethod.setAccessible(false);
                        if (invoke != null) {
                            return invoke;
                        }
                        ots.d("AndroidKeyStore", "getOpenSSLKey() returned null", new Object[0]);
                        return null;
                    } catch (Exception e) {
                        ots.d("AndroidKeyStore", "Exception while trying to retrieve system EVP_PKEY handle: " + e, new Object[0]);
                        return null;
                    } catch (Throwable th) {
                        declaredMethod.setAccessible(false);
                    }
                }
                ots.d("AndroidKeyStore", "Private key is not an OpenSSLRSAPrivateKey instance, its class name is:" + privateKey.getClass().getCanonicalName(), new Object[0]);
                return null;
            } catch (Exception e2) {
                ots.d("AndroidKeyStore", "Cannot find system OpenSSLRSAPrivateKey class: " + e2, new Object[0]);
                return null;
            }
        } else {
            ots.d("AndroidKeyStore", "does not implement RSAPrivateKey", new Object[0]);
            return null;
        }
    }

    @CalledByNative
    private static long getOpenSSLHandleForPrivateKey(PrivateKey privateKey) {
        Object a = a(privateKey);
        if (a == null) {
            return 0;
        }
        try {
            Method declaredMethod = a.getClass().getDeclaredMethod("getPkeyContext", new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                long longValue = ((Number) declaredMethod.invoke(a, new Object[0])).longValue();
                declaredMethod.setAccessible(false);
                if (longValue != 0) {
                    return longValue;
                }
                ots.d("AndroidKeyStore", "getPkeyContext() returned null", new Object[0]);
                return longValue;
            } catch (Exception e) {
                ots.d("AndroidKeyStore", "Exception while trying to retrieve system EVP_PKEY handle: " + e, new Object[0]);
                return 0;
            } catch (Throwable th) {
                declaredMethod.setAccessible(false);
            }
        } catch (Exception e2) {
            ots.d("AndroidKeyStore", "No getPkeyContext() method on OpenSSLKey member:" + e2, new Object[0]);
            return 0;
        }
    }

    @CalledByNative
    private static Object getOpenSSLEngineForPrivateKey(PrivateKey privateKey) {
        try {
            Class cls = Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLEngine");
            Object a = a(privateKey);
            if (a == null) {
                return null;
            }
            try {
                Method declaredMethod = a.getClass().getDeclaredMethod("getEngine", new Class[0]);
                try {
                    declaredMethod.setAccessible(true);
                    a = declaredMethod.invoke(a, new Object[0]);
                    declaredMethod.setAccessible(false);
                    if (a == null) {
                        ots.d("AndroidKeyStore", "getEngine() returned null", new Object[0]);
                    }
                    if (cls.isInstance(a)) {
                        return a;
                    }
                    ots.d("AndroidKeyStore", "Engine is not an OpenSSLEngine instance, its class name is:" + a.getClass().getCanonicalName(), new Object[0]);
                    return null;
                } catch (Exception e) {
                    ots.d("AndroidKeyStore", "Exception while trying to retrieve OpenSSLEngine object: " + e, new Object[0]);
                    return null;
                } catch (Throwable th) {
                    declaredMethod.setAccessible(false);
                }
            } catch (Exception e2) {
                ots.d("AndroidKeyStore", "No getEngine() method on OpenSSLKey member:" + e2, new Object[0]);
                return null;
            }
        } catch (Exception e22) {
            ots.d("AndroidKeyStore", "Cannot find system OpenSSLEngine class: " + e22, new Object[0]);
            return null;
        }
    }
}
