package org.chromium.net;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.JNINamespace;

@JNINamespace
public class AndroidCertVerifyResult {
    private final int a;
    private final boolean b;
    private final List<X509Certificate> c;

    public AndroidCertVerifyResult(int i, boolean z, List<X509Certificate> list) {
        this.a = 0;
        this.b = z;
        this.c = new ArrayList(list);
    }

    public AndroidCertVerifyResult(int i) {
        this.a = i;
        this.b = false;
        this.c = Collections.emptyList();
    }

    @CalledByNative
    public int getStatus() {
        return this.a;
    }

    @CalledByNative
    public boolean isIssuedByKnownRoot() {
        return this.b;
    }

    @CalledByNative
    public byte[][] getCertificateChainEncoded() {
        byte[][] bArr = new byte[this.c.size()][];
        int i = 0;
        while (i < this.c.size()) {
            try {
                bArr[i] = ((X509Certificate) this.c.get(i)).getEncoded();
                i++;
            } catch (CertificateEncodingException e) {
                return new byte[0][];
            }
        }
        return bArr;
    }
}
