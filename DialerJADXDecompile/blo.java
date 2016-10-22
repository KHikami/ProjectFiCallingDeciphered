import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.SystemClock;
import android.util.Pair;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
public class blo {
    static final String a;

    static {
        a = blo.class.getSimpleName();
    }

    private static byte[] c(Context context, String str, String str2, List list) {
        Throwable th;
        AutoCloseable autoCloseable;
        HttpURLConnection httpURLConnection;
        Throwable th2;
        Objects.requireNonNull(str);
        URL b = b(context, str);
        if (b == null) {
            return null;
        }
        AutoCloseable autoCloseable2 = null;
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) b.openConnection();
            try {
                Object obj;
                a(httpURLConnection2, str2, list);
                int responseCode = httpURLConnection2.getResponseCode();
                bdf.a(a, "response code: " + responseCode);
                if (responseCode / 100 == 2) {
                    autoCloseable2 = httpURLConnection2.getInputStream();
                    obj = null;
                } else {
                    autoCloseable2 = httpURLConnection2.getErrorStream();
                    obj = 1;
                }
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = autoCloseable2.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    if (obj != null) {
                        String url = b.toString();
                        byte[] toByteArray = byteArrayOutputStream.toByteArray();
                        String str3 = a;
                        String str4 = "Got bad response code from url: ";
                        url = String.valueOf(url);
                        if (url.length() != 0) {
                            url = str4.concat(url);
                        } else {
                            url = new String(str4);
                        }
                        bdf.e(str3, url);
                        bdf.e(a, new String(toByteArray));
                        if (responseCode == 401) {
                            throw new bld("Auth error");
                        }
                        buf.a(autoCloseable2);
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        return null;
                    }
                    byte[] toByteArray2 = byteArrayOutputStream.toByteArray();
                    bdf.a(a, "received " + toByteArray2.length + " bytes");
                    bdf.a(a, "fetch took " + (SystemClock.uptimeMillis() - uptimeMillis) + " ms");
                    buf.a(autoCloseable2);
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    return toByteArray2;
                } catch (Throwable th3) {
                    th = th3;
                    autoCloseable = autoCloseable2;
                    httpURLConnection = httpURLConnection2;
                    th2 = th;
                    buf.a(autoCloseable);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th2;
                }
            } catch (Throwable th32) {
                th = th32;
                autoCloseable = autoCloseable2;
                httpURLConnection = httpURLConnection2;
                th2 = th;
                buf.a(autoCloseable);
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            AutoCloseable autoCloseable3 = autoCloseable2;
            httpURLConnection = null;
            autoCloseable = autoCloseable3;
            buf.a(autoCloseable);
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th2;
        }
    }

    public static InputStream a(Context context, String str, String str2, List list) {
        Throwable th;
        HttpURLConnection httpURLConnection = null;
        Objects.requireNonNull(str);
        URL b = b(context, str);
        if (b == null) {
            return null;
        }
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) b.openConnection();
            try {
                a(httpURLConnection2, str2, list);
                int responseCode = httpURLConnection2.getResponseCode();
                bdf.a(a, "response code: " + responseCode);
                if (responseCode == 401) {
                    throw new bld("Auth error");
                }
                if (responseCode / 100 == 2) {
                    InputStream inputStream = httpURLConnection2.getInputStream();
                    if (inputStream != null) {
                        return new blp(httpURLConnection2, inputStream);
                    }
                }
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                return null;
            } catch (Throwable th2) {
                Throwable th3 = th2;
                httpURLConnection = httpURLConnection2;
                th = th3;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    private static void a(HttpURLConnection httpURLConnection, String str, List list) {
        httpURLConnection.setRequestMethod(str);
        if (list != null) {
            for (Pair pair : list) {
                httpURLConnection.setRequestProperty((String) pair.first, (String) pair.second);
            }
        }
    }

    private static String a(String str) {
        Uri parse = Uri.parse(str);
        Builder path = new Builder().scheme(parse.getScheme()).authority(parse.getAuthority()).path(parse.getPath());
        for (String str2 : parse.getQueryParameterNames()) {
            if ("access_token".equals(str2)) {
                path.appendQueryParameter(str2, "token");
            } else {
                String queryParameter = parse.getQueryParameter(str2);
                if ("id".equals(str2)) {
                    path.appendQueryParameter(str2, buf.l(queryParameter));
                } else {
                    path.appendQueryParameter(str2, queryParameter);
                }
            }
        }
        return path.toString();
    }

    public static String a(Context context, String str) {
        return b(context, str, "GET", null);
    }

    public static String b(Context context, String str, String str2, List list) {
        byte[] c = c(context, str, str2, list);
        if (c == null) {
            return null;
        }
        String str3 = new String(c);
        bdf.a(a, "response body: ");
        bdf.a(a, str3);
        return str3;
    }

    private static URL b(Context context, String str) {
        String a = blt.a(context.getContentResolver()).a(str).a(str);
        String valueOf;
        if (a != null) {
            String str2;
            String str3;
            URL url;
            if (bdf.a) {
                str2 = a;
                str3 = "fetching ";
                valueOf = String.valueOf(a(a));
                bdf.a(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                if (!a.equals(str)) {
                    valueOf = a;
                    str2 = String.valueOf(a(str));
                    str3 = String.valueOf(a(a));
                    bdf.a(valueOf, new StringBuilder((String.valueOf(str2).length() + 32) + String.valueOf(str3).length()).append("Original url: ").append(str2).append(", after re-write: ").append(str3).toString());
                }
            }
            try {
                url = new URL(a);
            } catch (Exception e) {
                Exception exception = e;
                str2 = a;
                str3 = "failed to parse url: ";
                valueOf = String.valueOf(str);
                bdf.a(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), exception);
                url = null;
            }
            return url;
        } else if (!bdf.a) {
            return null;
        } else {
            valueOf = a;
            a = String.valueOf(a(str));
            bdf.a(valueOf, new StringBuilder(String.valueOf(a).length() + 35).append("url ").append(a).append(" is blocked.  Ignoring request.").toString());
            return null;
        }
    }
}
