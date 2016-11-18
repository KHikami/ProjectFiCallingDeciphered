package p000;

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
    static final aop f1967a = new aop();
    private final atu f1968b;
    private final int f1969c;
    private final aop f1970d;
    private HttpURLConnection f1971e;
    private InputStream f1972f;
    private volatile boolean f1973g;

    public aoo(atu atu, int i) {
        this(atu, i, f1967a);
    }

    private aoo(atu atu, int i, aop aop) {
        this.f1968b = atu;
        this.f1969c = i;
        this.f1970d = aop;
    }

    public void mo312a(amq amq, aof<? super InputStream> aof__super_java_io_InputStream) {
        long a = bam.m4675a();
        try {
            Object a2 = m3572a(this.f1968b.m4017a(), 0, null, this.f1968b.m4020c());
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                double a3 = bam.m4674a(a);
                String valueOf = String.valueOf(a2);
                new StringBuilder(String.valueOf(valueOf).length() + 74).append("Finished http url fetcher fetch in ").append(a3).append(" ms and loaded ").append(valueOf);
            }
            aof__super_java_io_InputStream.mo326a(a2);
        } catch (Exception e) {
            aof__super_java_io_InputStream.mo325a(e);
        }
    }

    private InputStream m3572a(URL url, int i, URL url2, Map<String, String> map) {
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
            this.f1971e = this.f1970d.m3578a(url3);
            for (Entry entry : map.entrySet()) {
                this.f1971e.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            this.f1971e.setConnectTimeout(this.f1969c);
            this.f1971e.setReadTimeout(this.f1969c);
            this.f1971e.setUseCaches(false);
            this.f1971e.setDoInput(true);
            this.f1971e.connect();
            if (this.f1973g) {
                return null;
            }
            int responseCode = this.f1971e.getResponseCode();
            if (responseCode / 100 == 2) {
                HttpURLConnection httpURLConnection = this.f1971e;
                if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                    this.f1972f = new bak(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
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
                    this.f1972f = httpURLConnection.getInputStream();
                }
                return this.f1972f;
            } else if (responseCode / 100 == 3) {
                Object headerField = this.f1971e.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new anu("Received empty or null redirect url");
                }
                i++;
                url2 = url3;
                url3 = new URL(url3, headerField);
            } else if (responseCode == -1) {
                throw new anu(responseCode);
            } else {
                throw new anu(this.f1971e.getResponseMessage(), responseCode);
            }
        }
        throw new anu("Too many (> 5) redirects!");
    }

    public void mo311a() {
        if (this.f1972f != null) {
            try {
                this.f1972f.close();
            } catch (IOException e) {
            }
        }
        if (this.f1971e != null) {
            this.f1971e.disconnect();
        }
    }

    public void mo313b() {
        this.f1973g = true;
    }

    public Class<InputStream> mo321d() {
        return InputStream.class;
    }

    public anq mo314c() {
        return anq.REMOTE;
    }
}
