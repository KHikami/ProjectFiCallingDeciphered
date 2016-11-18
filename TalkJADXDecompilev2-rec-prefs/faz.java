package p000;

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

public final class faz {
    public static final gma f12604a = gma.m18073a("BabelClient");
    public static faz f12605b;
    static String f12606c = "none";

    public static faz m14868a() {
        if (f12605b == null) {
            f12605b = new faz();
            f12606c = faz.m14873b();
        }
        return f12605b;
    }

    public static void m14870a(dzh dzh, int i) {
        dzh.m13149d(fde.m15018e(i).m5629a());
    }

    public evz m14875a(GenericUrl genericUrl, esw esw, int i, dzh dzh, boolean z, int i2) {
        if (i == -1) {
            return null;
        }
        evz a;
        eub eub = (eub) jyn.m25433b(gwb.m1400H(), eub.class);
        if (eub != null) {
            a = eub.m14532a();
            if (a != null) {
                return a;
            }
        }
        byte[] b = m14874b(genericUrl, esw, i, dzh, z, i2);
        fas a2 = gwb.m1607a(esw.getClass());
        if (a2 == null) {
            return null;
        }
        evz a3 = a2.f12584b.mo1959a(b);
        eub = (eub) jyn.m25433b(gwb.m1400H(), eub.class);
        if (eub != null) {
            a = eub.m14533b();
            if (a != null) {
                return a;
            }
        }
        return a3;
    }

    private static byte[] m14872a(HttpResponse httpResponse) {
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
            glk.m17978c("BabelClient", "Error reading response stream", (Throwable) e2);
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

    private static HttpRequestInitializer m14867a(int i, dzh dzh, int i2) {
        Long c;
        String a = dzh == null ? null : dzh.m13145a(fde.m15018e(i).m5629a());
        if (a != null) {
            c = dzh.m13148c(a);
        } else {
            c = null;
        }
        keg keg = new keg();
        keg.m25657c(a);
        return new fba(c, a, keg, null, i2);
    }

    private byte[] m14871a(int i, dzh dzh, boolean z, GenericUrl genericUrl, HttpContent httpContent, int i2, int i3) {
        Context H = gwb.m1400H();
        iik iik = (iik) jyn.m25433b(H, iik.class);
        if (iik != null) {
            Map kyVar = new ky();
            if (dzh != null) {
                Object concat;
                String a = dzh.m13145a(fde.m15018e(i).m5629a());
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
                    Long c = dzh.m13148c(a);
                    if (c != null) {
                        concat = c.toString();
                    }
                }
                kyVar.put("X-Auth-Time", concat);
            }
            kyVar.put("X-Device-ID", f12606c);
            kyVar.put("X-Network-ID", giw.m17757b());
            kyVar.put("User-Agent", gwb.m2399z());
            byte[] bArr = null;
            if (z) {
                bArr = nzf.m1029a(((etg) httpContent).f12228a);
            }
            try {
                int i4;
                if (fdq.f12786b.m14370b(i)) {
                    i4 = i3;
                } else {
                    i4 = 3;
                }
                return iik.mo1651a(H, genericUrl.toString(), kyVar, bArr, i2, i4);
            } catch (Exception e) {
                throw fdo.m15081a(e.getStatusCode(), e, null);
            }
        }
        HttpRequest buildPostRequest;
        HttpRequestFactory createRequestFactory = new ken().createRequestFactory(faz.m14867a(i, dzh, i2));
        if (z) {
            buildPostRequest = createRequestFactory.buildPostRequest(genericUrl, httpContent);
        } else {
            buildPostRequest = createRequestFactory.buildGetRequest(genericUrl);
        }
        HttpResponse execute = buildPostRequest.execute();
        if (execute.isSuccessStatusCode()) {
            return faz.m14872a(execute);
        }
        throw fdo.m15081a(execute.getStatusCode(), null, null);
    }

    private static String m14873b() {
        String str = "none";
        try {
            long a = giw.m17752a();
            MessageDigest instance = MessageDigest.getInstance("md5");
            byte[] bArr = new byte[8];
            ByteBuffer.wrap(bArr).asLongBuffer().put(0, a);
            str = gwb.m2087c(instance.digest(bArr));
        } catch (NoSuchAlgorithmException e) {
        }
        return str;
    }

    private byte[] m14874b(GenericUrl genericUrl, esw esw, int i, dzh dzh, boolean z, int i2) {
        esw.m14430h();
        fde.m15018e(i);
        Context H = gwb.m1400H();
        HttpContent b = esw.mo1956b(fde.m15023g(i), i2, i);
        if (b == null) {
            return null;
        }
        return m14871a(i, dzh, z, genericUrl, b, gwb.m1492a(H, "babel_server_request_timeout", 40000), esw.mo1957i());
    }

    public static String m14869a(fok fok) {
        String valueOf = String.valueOf(fok.getClass().getSimpleName());
        return new StringBuilder(String.valueOf(valueOf).length() + 19).append("REQRES_").append(valueOf).append("_").append(fok.L_()).toString();
    }
}
