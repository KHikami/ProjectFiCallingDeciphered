package defpackage;

import android.content.Context;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

/* renamed from: faz */
public final class faz {
    public static final gma a;
    public static faz b;
    static String c;

    static {
        a = gma.a("BabelClient");
        c = "none";
    }

    public static faz a() {
        if (b == null) {
            b = new faz();
            c = faz.b();
        }
        return b;
    }

    public static void a(dzh dzh, int i) {
        dzh.d(fde.e(i).a());
    }

    public evz a(GenericUrl genericUrl, esw esw, int i, dzh dzh, boolean z, int i2) {
        if (i == -1) {
            return null;
        }
        evz a;
        eub eub = (eub) jyn.b(gwb.H(), eub.class);
        if (eub != null) {
            a = eub.a();
            if (a != null) {
                return a;
            }
        }
        byte[] b = b(genericUrl, esw, i, dzh, z, i2);
        fas a2 = gwb.a(esw.getClass());
        if (a2 == null) {
            return null;
        }
        evz a3 = a2.b.a(b);
        eub = (eub) jyn.b(gwb.H(), eub.class);
        if (eub != null) {
            a = eub.b();
            if (a != null) {
                return a;
            }
        }
        return a3;
    }

    private static byte[] a(HttpResponse httpResponse) {
        InputStream inputStream = null;
        try {
            inputStream = httpResponse.getContent();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (int read = bufferedInputStream.read(); read != -1; read = bufferedInputStream.read()) {
                byteArrayOutputStream.write((byte) read);
            }
            byte[] toByteArray = byteArrayOutputStream.toByteArray();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                }
            }
            return toByteArray;
        } catch (Exception e2) {
            glk.c("BabelClient", "Error reading response stream", (Throwable) e2);
            throw new fdo(106, e2);
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                }
            }
        }
    }

    private static HttpRequestInitializer a(int i, dzh dzh, int i2) {
        Long c;
        String a = dzh == null ? null : dzh.a(fde.e(i).a());
        if (a != null) {
            c = dzh.c(a);
        } else {
            c = null;
        }
        keg keg = new keg();
        keg.c(a);
        return new fba(c, a, keg, null, i2);
    }

    private byte[] a(int i, dzh dzh, boolean z, GenericUrl genericUrl, HttpContent httpContent, int i2, int i3) {
        Context H = gwb.H();
        iik iik = (iik) jyn.b(H, iik.class);
        if (iik != null) {
            Map kyVar = new ky();
            if (dzh != null) {
                Object concat;
                String a = dzh.a(fde.e(i).a());
                String str = "Authorization";
                String str2 = "Bearer ";
                String valueOf = String.valueOf(a);
                if (valueOf.length() != 0) {
                    concat = str2.concat(valueOf);
                } else {
                    concat = new String(str2);
                }
                kyVar.put(str, concat);
                concat = "none";
                if (a != null) {
                    Long c = dzh.c(a);
                    if (c != null) {
                        concat = c.toString();
                    }
                }
                kyVar.put("X-Auth-Time", concat);
            }
            kyVar.put("X-Device-ID", c);
            kyVar.put("X-Network-ID", giw.b());
            kyVar.put("User-Agent", gwb.z());
            byte[] bArr = null;
            if (z) {
                bArr = nzf.a(((etg) httpContent).a);
            }
            try {
                int i4;
                if (fdq.b.b(i)) {
                    i4 = i3;
                } else {
                    i4 = 3;
                }
                return iik.a(H, genericUrl.toString(), kyVar, bArr, i2, i4);
            } catch (Exception e) {
                throw fdo.a(e.getStatusCode(), e, null);
            }
        }
        HttpRequest buildPostRequest;
        HttpRequestFactory createRequestFactory = new ken().createRequestFactory(faz.a(i, dzh, i2));
        if (z) {
            buildPostRequest = createRequestFactory.buildPostRequest(genericUrl, httpContent);
        } else {
            buildPostRequest = createRequestFactory.buildGetRequest(genericUrl);
        }
        HttpResponse execute = buildPostRequest.execute();
        if (execute.isSuccessStatusCode()) {
            return faz.a(execute);
        }
        throw fdo.a(execute.getStatusCode(), null, null);
    }

    private static String b() {
        String str = "none";
        try {
            long a = giw.a();
            MessageDigest instance = MessageDigest.getInstance("md5");
            byte[] bArr = new byte[8];
            ByteBuffer.wrap(bArr).asLongBuffer().put(0, a);
            str = gwb.c(instance.digest(bArr));
        } catch (NoSuchAlgorithmException e) {
        }
        return str;
    }

    private byte[] b(GenericUrl genericUrl, esw esw, int i, dzh dzh, boolean z, int i2) {
        esw.h();
        fde.e(i);
        Context H = gwb.H();
        HttpContent b = esw.b(fde.g(i), i2, i);
        if (b == null) {
            return null;
        }
        return a(i, dzh, z, genericUrl, b, gwb.a(H, "babel_server_request_timeout", 40000), esw.i());
    }

    public static String a(fok fok) {
        String valueOf = String.valueOf(fok.getClass().getSimpleName());
        return new StringBuilder(String.valueOf(valueOf).length() + 19).append("REQRES_").append(valueOf).append("_").append(fok.L_()).toString();
    }
}
