package org.chromium.net;

import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;
import org.chromium.base.ContextUtils;
import org.chromium.base.annotations.JNINamespace;
import owl;
import owm;
import own;
import owo;

@JNINamespace
public class X509Util {
    static KeyStore a;
    static final Object b;
    private static CertificateFactory c;
    private static own d;
    private static owl e;
    private static own f;
    private static KeyStore g;
    private static File h;
    private static Set<Pair<X500Principal, PublicKey>> i;
    private static boolean j;
    private static boolean k;
    private static final char[] l;

    private static native void nativeNotifyKeyChainChanged();

    private static native void nativeRecordCertVerifyCapabilitiesHistogram(boolean z);

    static {
        b = new Object();
        k = false;
        l = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }

    static void a() {
        synchronized (b) {
            d();
        }
    }

    private static void d() {
        if (c == null) {
            c = CertificateFactory.getInstance("X.509");
        }
        if (d == null) {
            d = a(null);
        }
        if (!j) {
            try {
                g = KeyStore.getInstance("AndroidCAStore");
                try {
                    g.load(null);
                } catch (IOException e) {
                }
                h = new File(System.getenv("ANDROID_ROOT") + "/etc/security/cacerts");
            } catch (KeyStoreException e2) {
            }
            if (!k) {
                nativeRecordCertVerifyCapabilitiesHistogram(g != null);
            }
            j = true;
        }
        if (i == null) {
            i = new HashSet();
        }
        if (a == null) {
            a = KeyStore.getInstance(KeyStore.getDefaultType());
            try {
                a.load(null);
            } catch (IOException e3) {
            }
        }
        if (f == null) {
            f = a(a);
        }
        if (!k && e == null) {
            e = new owl();
            ContextUtils.a.registerReceiver(e, new IntentFilter("android.security.STORAGE_CHANGED"));
        }
    }

    private static own a(KeyStore keyStore) {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init(keyStore);
        TrustManager[] trustManagers = instance.getTrustManagers();
        int length = trustManagers.length;
        int i = 0;
        while (i < length) {
            Object obj = trustManagers[i];
            if (obj instanceof X509TrustManager) {
                try {
                    if (VERSION.SDK_INT >= 17) {
                        return new owo((X509TrustManager) obj);
                    }
                    return new owm((X509TrustManager) obj);
                } catch (IllegalArgumentException e) {
                    Log.e("X509Util", "Error creating trust manager (" + obj.getClass().getName() + "): " + e);
                }
            } else {
                i++;
            }
        }
        Log.e("X509Util", "Could not find suitable trust manager");
        return null;
    }

    static void b() {
        f = a(a);
    }

    public static void c() {
        synchronized (b) {
            d = null;
            i = null;
            d();
        }
        nativeNotifyKeyChainChanged();
    }

    public static X509Certificate a(byte[] bArr) {
        a();
        return (X509Certificate) c.generateCertificate(new ByteArrayInputStream(bArr));
    }

    private static String a(X500Principal x500Principal) {
        byte[] digest = MessageDigest.getInstance("MD5").digest(x500Principal.getEncoded());
        char[] cArr = new char[8];
        for (int i = 0; i < 4; i++) {
            cArr[i * 2] = l[(digest[3 - i] >> 4) & 15];
            cArr[(i * 2) + 1] = l[digest[3 - i] & 15];
        }
        return new String(cArr);
    }

    private static boolean a(X509Certificate x509Certificate) {
        if (g == null) {
            return false;
        }
        Pair pair = new Pair(x509Certificate.getSubjectX500Principal(), x509Certificate.getPublicKey());
        if (i.contains(pair)) {
            return true;
        }
        String a = a(x509Certificate.getSubjectX500Principal());
        int i = 0;
        while (true) {
            String str = a + '.' + i;
            if (!new File(h, str).exists()) {
                return false;
            }
            Certificate certificate = g.getCertificate("system:" + str);
            if (certificate != null) {
                if (certificate instanceof X509Certificate) {
                    X509Certificate x509Certificate2 = (X509Certificate) certificate;
                    if (x509Certificate.getSubjectX500Principal().equals(x509Certificate2.getSubjectX500Principal()) && x509Certificate.getPublicKey().equals(x509Certificate2.getPublicKey())) {
                        i.add(pair);
                        return true;
                    }
                }
                Log.e("X509Util", "Anchor " + str + " not an X509Certificate: " + certificate.getClass().getName());
            }
            i++;
        }
    }

    private static boolean b(X509Certificate x509Certificate) {
        try {
            List<String> extendedKeyUsage = x509Certificate.getExtendedKeyUsage();
            if (extendedKeyUsage == null) {
                return true;
            }
            for (String str : extendedKeyUsage) {
                if (str.equals("1.3.6.1.5.5.7.3.1") || str.equals("2.5.29.37.0") || str.equals("2.16.840.1.113730.4.1")) {
                    return true;
                }
                if (str.equals("1.3.6.1.4.1.311.10.3.3")) {
                    return true;
                }
            }
            return false;
        } catch (NullPointerException e) {
            return false;
        }
    }

    public static AndroidCertVerifyResult a(byte[][] bArr, String str, String str2) {
        boolean z = false;
        if (bArr == null || bArr.length == 0 || bArr[0] == null) {
            throw new IllegalArgumentException("Expected non-null and non-empty certificate chain passed as |certChain|. |certChain|=" + Arrays.deepToString(bArr));
        }
        try {
            a();
            X509Certificate[] x509CertificateArr = new X509Certificate[bArr.length];
            int i = 0;
            while (i < bArr.length) {
                try {
                    x509CertificateArr[i] = a(bArr[i]);
                    i++;
                } catch (CertificateException e) {
                    return new AndroidCertVerifyResult(-5);
                }
            }
            try {
                x509CertificateArr[0].checkValidity();
                if (!b(x509CertificateArr[0])) {
                    return new AndroidCertVerifyResult(-6);
                }
                synchronized (b) {
                    AndroidCertVerifyResult androidCertVerifyResult;
                    if (d == null) {
                        androidCertVerifyResult = new AndroidCertVerifyResult(-1);
                        return androidCertVerifyResult;
                    }
                    List a;
                    try {
                        a = d.a(x509CertificateArr, str, str2);
                    } catch (CertificateException e2) {
                        try {
                            a = f.a(x509CertificateArr, str, str2);
                        } catch (CertificateException e3) {
                            new StringBuilder("Failed to validate the certificate chain, error: ").append(e2.getMessage());
                            return new AndroidCertVerifyResult(-2);
                        }
                    }
                    if (a.size() > 0) {
                        z = a((X509Certificate) a.get(a.size() - 1));
                    }
                    androidCertVerifyResult = new AndroidCertVerifyResult(0, z, a);
                    return androidCertVerifyResult;
                }
            } catch (CertificateExpiredException e4) {
                return new AndroidCertVerifyResult(-3);
            } catch (CertificateNotYetValidException e5) {
                return new AndroidCertVerifyResult(-4);
            } catch (CertificateException e6) {
                return new AndroidCertVerifyResult(-1);
            }
        } catch (CertificateException e7) {
            return new AndroidCertVerifyResult(-1);
        }
    }
}
