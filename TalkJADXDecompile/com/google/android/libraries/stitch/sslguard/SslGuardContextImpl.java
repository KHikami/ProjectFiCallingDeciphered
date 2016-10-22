package com.google.android.libraries.stitch.sslguard;

import com.google.android.apps.common.proguard.UsedByReflection;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContextSpi;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSessionContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

@UsedByReflection
public class SslGuardContextImpl extends SSLContextSpi {
    private static final String a;

    public /* bridge */ /* synthetic */ SSLSessionContext engineGetClientSessionContext() {
        return null;
    }

    public /* bridge */ /* synthetic */ SSLSessionContext engineGetServerSessionContext() {
        return null;
    }

    static {
        a = SslGuardContextImpl.class.getSimpleName();
    }

    public void engineInit(KeyManager[] keyManagerArr, TrustManager[] trustManagerArr, SecureRandom secureRandom) {
    }

    public SSLSocketFactory engineGetSocketFactory() {
        return new SslGuardSocketFactory();
    }

    public SSLServerSocketFactory engineGetServerSocketFactory() {
        return null;
    }

    public SSLEngine engineCreateSSLEngine(String str, int i) {
        return null;
    }

    public SSLEngine engineCreateSSLEngine() {
        return null;
    }
}
