import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.zip.GZIPOutputStream;

final class bov extends bpb {
    static final byte[] b;
    final boz a;
    private final String c;

    static {
        b = "\n".getBytes();
    }

    bov(bnp bnp) {
        super(bnp);
        String str = bpc.a;
        String str2 = VERSION.RELEASE;
        String a = bpq.a(Locale.getDefault());
        String str3 = Build.MODEL;
        String str4 = Build.ID;
        this.c = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[]{"GoogleAnalytics", str, str2, a, str3, str4});
        this.a = new boz(bnp.c);
    }

    private final int a(URL url) {
        buf.A((Object) url);
        b("GET request", url);
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnection = b(url);
            httpURLConnection.connect();
            a(httpURLConnection);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                this.f.c().d();
            }
            b("GET status", Integer.valueOf(responseCode));
            if (httpURLConnection == null) {
                return responseCode;
            }
            httpURLConnection.disconnect();
            return responseCode;
        } catch (IOException e) {
            d("Network GET connection error", e);
            return 0;
        } finally {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
    }

    private final int a(URL url, byte[] bArr) {
        HttpURLConnection b;
        Object e;
        Throwable th;
        OutputStream outputStream = null;
        buf.A((Object) url);
        buf.A((Object) bArr);
        b("POST bytes, url", Integer.valueOf(bArr.length), url);
        if (bno.k()) {
            a("Post payload\n", new String(bArr));
        }
        try {
            b = b(url);
            try {
                b.setDoOutput(true);
                b.setFixedLengthStreamingMode(bArr.length);
                b.connect();
                outputStream = b.getOutputStream();
                outputStream.write(bArr);
                a(b);
                int responseCode = b.getResponseCode();
                if (responseCode == 200) {
                    this.f.c().d();
                }
                b("POST status", Integer.valueOf(responseCode));
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException e2) {
                        e("Error closing http post connection output stream", e2);
                    }
                }
                if (b == null) {
                    return responseCode;
                }
                b.disconnect();
                return responseCode;
            } catch (IOException e3) {
                e = e3;
                try {
                    d("Network POST connection error", e);
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e4) {
                            e("Error closing http post connection output stream", e4);
                        }
                    }
                    if (b != null) {
                        b.disconnect();
                    }
                    return 0;
                } catch (Throwable th2) {
                    th = th2;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e22) {
                            e("Error closing http post connection output stream", e22);
                        }
                    }
                    if (b != null) {
                        b.disconnect();
                    }
                    throw th;
                }
            }
        } catch (IOException e5) {
            e = e5;
            b = outputStream;
            d("Network POST connection error", e);
            if (outputStream != null) {
                outputStream.close();
            }
            if (b != null) {
                b.disconnect();
            }
            return 0;
        } catch (Throwable th3) {
            th = th3;
            b = outputStream;
            if (outputStream != null) {
                outputStream.close();
            }
            if (b != null) {
                b.disconnect();
            }
            throw th;
        }
    }

    private static void a(StringBuilder stringBuilder, String str, String str2) {
        if (stringBuilder.length() != 0) {
            stringBuilder.append('&');
        }
        stringBuilder.append(URLEncoder.encode(str, "UTF-8"));
        stringBuilder.append('=');
        stringBuilder.append(URLEncoder.encode(str2, "UTF-8"));
    }

    private final void a(HttpURLConnection httpURLConnection) {
        InputStream inputStream = null;
        try {
            inputStream = httpURLConnection.getInputStream();
            do {
            } while (inputStream.read(new byte[1024]) > 0);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e("Error closing http connection input stream", e);
                }
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    e("Error closing http connection input stream", e2);
                }
            }
        }
    }

    private final int b(URL url, byte[] bArr) {
        HttpURLConnection b;
        OutputStream outputStream;
        Object e;
        HttpURLConnection httpURLConnection;
        Throwable th;
        OutputStream outputStream2 = null;
        buf.A((Object) url);
        buf.A((Object) bArr);
        try {
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            byte[] toByteArray = byteArrayOutputStream.toByteArray();
            super.a(3, "POST compressed size, ratio %, url", Integer.valueOf(toByteArray.length), Long.valueOf((100 * ((long) toByteArray.length)) / ((long) bArr.length)), url);
            if (toByteArray.length > bArr.length) {
                c("Compressed payload is larger then uncompressed. compressed, uncompressed", Integer.valueOf(toByteArray.length), Integer.valueOf(bArr.length));
            }
            if (bno.k()) {
                a("Post payload", "\n" + new String(bArr));
            }
            b = b(url);
            try {
                b.setDoOutput(true);
                b.addRequestProperty("Content-Encoding", "gzip");
                b.setFixedLengthStreamingMode(toByteArray.length);
                b.connect();
                outputStream = b.getOutputStream();
            } catch (IOException e2) {
                e = e2;
                outputStream = null;
                httpURLConnection = b;
                try {
                    d("Network compressed POST connection error", e);
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e3) {
                            e("Error closing http compressed post connection output stream", e3);
                        }
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return 0;
                } catch (Throwable th2) {
                    th = th2;
                    b = httpURLConnection;
                    outputStream2 = outputStream;
                    if (outputStream2 != null) {
                        try {
                            outputStream2.close();
                        } catch (IOException e4) {
                            e("Error closing http compressed post connection output stream", e4);
                        }
                    }
                    if (b != null) {
                        b.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                if (outputStream2 != null) {
                    outputStream2.close();
                }
                if (b != null) {
                    b.disconnect();
                }
                throw th;
            }
            try {
                outputStream.write(toByteArray);
                outputStream.close();
                a(b);
                int responseCode = b.getResponseCode();
                if (responseCode == 200) {
                    this.f.c().d();
                }
                b("POST status", Integer.valueOf(responseCode));
                if (b == null) {
                    return responseCode;
                }
                b.disconnect();
                return responseCode;
            } catch (IOException e5) {
                e = e5;
                httpURLConnection = b;
                d("Network compressed POST connection error", e);
                if (outputStream != null) {
                    outputStream.close();
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return 0;
            } catch (Throwable th4) {
                th = th4;
                outputStream2 = outputStream;
                if (outputStream2 != null) {
                    outputStream2.close();
                }
                if (b != null) {
                    b.disconnect();
                }
                throw th;
            }
        } catch (IOException e6) {
            e = e6;
            outputStream = null;
            d("Network compressed POST connection error", e);
            if (outputStream != null) {
                outputStream.close();
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            return 0;
        } catch (Throwable th5) {
            th = th5;
            b = null;
            if (outputStream2 != null) {
                outputStream2.close();
            }
            if (b != null) {
                b.disconnect();
            }
            throw th;
        }
    }

    private HttpURLConnection b(URL url) {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(((Integer) boq.w.a()).intValue());
            httpURLConnection.setReadTimeout(((Integer) boq.x.a()).intValue());
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestProperty("User-Agent", this.c);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain http connection");
    }

    private final URL c() {
        try {
            return new URL(bom.h() + ((String) boq.n.a()));
        } catch (MalformedURLException e) {
            e("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    final String a(bos bos, boolean z) {
        buf.A((Object) bos);
        StringBuilder stringBuilder = new StringBuilder();
        try {
            for (Entry entry : bos.a.entrySet()) {
                String str = (String) entry.getKey();
                if (!("ht".equals(str) || "qt".equals(str) || "AppUID".equals(str) || "z".equals(str) || "_gmsv".equals(str))) {
                    a(stringBuilder, str, (String) entry.getValue());
                }
            }
            a(stringBuilder, "ht", String.valueOf(bos.d));
            a(stringBuilder, "qt", String.valueOf(f().a() - bos.d));
            if (btq.a) {
                a(stringBuilder, "_gmsv", bpc.a);
            }
            if (z) {
                String valueOf;
                long a = bpq.a(bos.a("_s", "0"));
                if (a != 0) {
                    valueOf = String.valueOf(a);
                } else {
                    valueOf = String.valueOf(bos.c);
                }
                a(stringBuilder, "z", valueOf);
            }
            return stringBuilder.toString();
        } catch (UnsupportedEncodingException e) {
            e("Failed to encode name or value", e);
            return null;
        }
    }

    final List a(List list) {
        List arrayList = new ArrayList(list.size());
        for (bos bos : list) {
            boolean z;
            buf.A((Object) bos);
            if (bos.f) {
                z = false;
            } else {
                z = true;
            }
            String a = a(bos, z);
            if (a == null) {
                this.f.a().a(bos, "Error formatting hit for upload");
                z = true;
            } else {
                URL a2;
                if (a.length() <= ((Integer) boq.o.a()).intValue()) {
                    a2 = a(bos, a);
                    if (a2 == null) {
                        f("Failed to build collect GET endpoint url");
                    } else {
                        z = a(a2) == 200;
                    }
                } else {
                    String a3 = a(bos, false);
                    if (a3 == null) {
                        this.f.a().a(bos, "Error formatting hit for POST upload");
                        z = true;
                    } else {
                        byte[] bytes = a3.getBytes();
                        if (bytes.length > ((Integer) boq.s.a()).intValue()) {
                            this.f.a().a(bos, "Hit payload exceeds size limit");
                            z = true;
                        } else {
                            a2 = a(bos);
                            if (a2 == null) {
                                f("Failed to build collect POST endpoint url");
                            } else if (a(a2, bytes) == 200) {
                                z = true;
                            }
                        }
                    }
                }
                z = false;
            }
            if (!z) {
                break;
            }
            arrayList.add(Long.valueOf(bos.c));
            if (arrayList.size() >= bom.f()) {
                break;
            }
        }
        return arrayList;
    }

    final List a(List list, boolean z) {
        boolean z2;
        if (list.isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        buf.b(z2);
        a("Uploading batched hits. compression, count", Boolean.valueOf(z), Integer.valueOf(list.size()));
        bow bow = new bow(this);
        List arrayList = new ArrayList();
        for (bos bos : list) {
            if (!bow.a(bos)) {
                break;
            }
            arrayList.add(Long.valueOf(bos.c));
        }
        if (bow.a == 0) {
            return arrayList;
        }
        URL c = c();
        if (c == null) {
            f("Failed to build batching endpoint url");
            return Collections.emptyList();
        }
        int b = z ? b(c, bow.b.toByteArray()) : a(c, bow.b.toByteArray());
        if (200 == b) {
            a("Batched upload completed. Hits batched", Integer.valueOf(bow.a));
            return arrayList;
        }
        a("Network error uploading hits. status code", Integer.valueOf(b));
        if (h().k().contains(Integer.valueOf(b))) {
            e("Server instructed the client to stop batching");
            this.a.a();
        }
        return Collections.emptyList();
    }

    protected final void a() {
        a("Network initialized. User agent", this.c);
    }

    public final boolean b() {
        NetworkInfo activeNetworkInfo;
        cqn.b();
        o();
        try {
            activeNetworkInfo = ((ConnectivityManager) g().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException e) {
            activeNetworkInfo = null;
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        b("No network connectivity");
        return false;
    }

    private final URL a(bos bos) {
        try {
            return new URL(bos.f ? bom.h() + bom.j() : bom.i() + bom.j());
        } catch (MalformedURLException e) {
            e("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    private final URL a(bos bos, String str) {
        try {
            return new URL(bos.f ? bom.h() + bom.j() + "?" + str : bom.i() + bom.j() + "?" + str);
        } catch (MalformedURLException e) {
            e("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }
}
