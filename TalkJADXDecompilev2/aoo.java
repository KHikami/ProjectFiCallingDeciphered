package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import java.util.Map.Entry;

public final class aoo implements aoe<InputStream> {
    static final aop a = new aop();
    private final atu b;
    private final int c;
    private final aop d;
    private HttpURLConnection e;
    private InputStream f;
    private volatile boolean g;

    public aoo(atu atu, int i) {
        this(atu, i, a);
    }

    private aoo(atu atu, int i, aop aop) {
        this.b = atu;
        this.c = i;
        this.d = aop;
    }

    public void a(amq amq, aof<? super InputStream> aof__super_java_io_InputStream) {
        long a = bam.a();
        try {
            Object a2 = a(this.b.a(), 0, null, this.b.c());
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                double a3 = bam.a(a);
                String valueOf = String.valueOf(a2);
                new StringBuilder(String.valueOf(valueOf).length() + 74).append("Finished http url fetcher fetch in ").append(a3).append(" ms and loaded ").append(valueOf);
            }
            aof__super_java_io_InputStream.a(a2);
        } catch (Exception e) {
            aof__super_java_io_InputStream.a(e);
        }
    }

    private InputStream a(URL url, int i, URL url2, Map<String, String> map) {
        URL url3 = url;
        while (i < 5) {
            if (url2 != null) {
                try {
                    if (url3.toURI().equals(url2.toURI())) {
                        throw new anu("In re-direct loop");
                    }
                } catch (URISyntaxException e) {
                }
            }
            this.e = this.d.a(url3);
            for (Entry entry : map.entrySet()) {
                this.e.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            this.e.setConnectTimeout(this.c);
            this.e.setReadTimeout(this.c);
            this.e.setUseCaches(false);
            this.e.setDoInput(true);
            this.e.connect();
            if (this.g) {
                return null;
            }
            int responseCode = this.e.getResponseCode();
            if (responseCode / 100 == 2) {
                HttpURLConnection httpURLConnection = this.e;
                if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                    this.f = new bak(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
                } else {
                    if (Log.isLoggable("HttpUrlFetcher", 3)) {
                        String str = "Got non empty content encoding: ";
                        String valueOf = String.valueOf(httpURLConnection.getContentEncoding());
                        if (valueOf.length() != 0) {
                            str.concat(valueOf);
                        } else {
                            valueOf = new String(str);
                        }
                    }
                    this.f = httpURLConnection.getInputStream();
                }
                return this.f;
            } else if (responseCode / 100 == 3) {
                Object headerField = this.e.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new anu("Received empty or null redirect url");
                }
                i++;
                url2 = url3;
                url3 = new URL(url3, headerField);
            } else if (responseCode == -1) {
                throw new anu(responseCode);
            } else {
                throw new anu(this.e.getResponseMessage(), responseCode);
            }
        }
        throw new anu("Too many (> 5) redirects!");
    }

    public void a() {
        if (this.f != null) {
            try {
                this.f.close();
            } catch (IOException e) {
            }
        }
        if (this.e != null) {
            this.e.disconnect();
        }
    }

    public void b() {
        this.g = true;
    }

    public Class<InputStream> d() {
        return InputStream.class;
    }

    public anq c() {
        return anq.REMOTE;
    }
}
