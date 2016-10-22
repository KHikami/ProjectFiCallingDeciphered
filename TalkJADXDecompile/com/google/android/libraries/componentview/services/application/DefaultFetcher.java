package com.google.android.libraries.componentview.services.application;

import android.content.Context;
import com.google.android.libraries.componentview.inject.annotations.ExecutorType.BACKGROUND;
import com.google.android.libraries.componentview.services.application.Fetcher.Response;
import gwb;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import mqy;
import msp;
import msy;
import mti;
import mtl;

public class DefaultFetcher implements Fetcher {
    private static final Charset a;
    private final mtl b;
    private Context c;

    class 1 implements Callable<Response> {
        final /* synthetic */ URI a;
        final /* synthetic */ byte[] b;
        final /* synthetic */ Map c;
        final /* synthetic */ boolean d;
        final /* synthetic */ DefaultFetcher e;

        1(DefaultFetcher defaultFetcher, URI uri, byte[] bArr, Map map, boolean z) {
            this.e = defaultFetcher;
            this.a = uri;
            this.b = bArr;
            this.c = map;
            this.d = z;
        }

        public /* synthetic */ Object call() {
            return a();
        }

        public Response a() {
            return this.e.b(this.a, this.b, this.c, this.d);
        }
    }

    class 2 implements msp<Throwable, Response> {
        final /* synthetic */ DefaultFetcher a;

        2(DefaultFetcher defaultFetcher) {
            this.a = defaultFetcher;
        }

        public mti<Response> a(Throwable th) {
            return msy.b(th);
        }
    }

    static {
        a = Charset.forName("ISO-8859-1");
    }

    public DefaultFetcher(Context context, @BACKGROUND ExecutorService executorService) {
        this.c = context.getApplicationContext();
        this.b = gwb.a(executorService);
    }

    public mti<Response> a(URI uri, byte[] bArr, Map<String, String> map, boolean z) {
        return msy.a(this.b.a(new 1(this, uri, null, null, z)), Throwable.class, new 2(this), this.b);
    }

    Response b(URI uri, byte[] bArr, Map<String, String> map, boolean z) {
        InputStream open;
        Throwable th;
        try {
            Response response = new Response();
            Charset charset = null;
            String uri2 = uri.toString();
            if (!(!uri2.startsWith("file:/") || uri2.startsWith("file://") || uri2.startsWith("file:///"))) {
                String str = "file:///";
                uri2 = String.valueOf(uri2.substring(6));
                uri2 = uri2.length() != 0 ? str.concat(uri2) : new String(str);
            }
            if (uri2.startsWith("file:///android_asset/")) {
                open = this.c.getAssets().open(uri2.substring(22));
            } else {
                Object obj;
                URLConnection a = a(uri);
                a.setRequestProperty("User-Agent", "Mozilla/5.0 (Linux; Android 5.0; Nexus 5 Build/LRX21N) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/37.0.0.0 Mobile Safari/537.36 GSA/4.1.3.1531624.arm,gzip(gfe)");
                if (map != null) {
                    for (Entry entry : map.entrySet()) {
                        a.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                HttpURLConnection httpURLConnection = null;
                if (a instanceof HttpURLConnection) {
                    obj = 1;
                    httpURLConnection = (HttpURLConnection) a;
                    ((HttpURLConnection) a).setInstanceFollowRedirects(z);
                } else {
                    obj = null;
                }
                if (bArr != null) {
                    a.setDoOutput(true);
                    a.getOutputStream().write(bArr);
                }
                open = a.getInputStream();
                Charset charset2 = a;
                String contentType = a.getContentType();
                if (contentType != null) {
                    int indexOf = contentType.indexOf("charset=");
                    if (indexOf != -1) {
                        charset2 = Charset.forName(contentType.substring(indexOf + 8).trim());
                    }
                }
                if (!(obj == null || httpURLConnection == null)) {
                    String str2;
                    response.d = ((HttpURLConnection) a).getResponseCode();
                    response.e = httpURLConnection.getHeaderFields();
                    List list = (List) response.e.get("Location");
                    if (list == null || list.size() <= 0) {
                        str2 = null;
                    } else {
                        str2 = (String) list.get(0);
                    }
                    response.f = str2;
                }
                charset = charset2;
            }
            try {
                byte[] a2 = mqy.a(open);
                response.b = a2;
                response.a = charset;
                response.c = a2 != null;
                if (open != null) {
                    open.close();
                }
                return response;
            } catch (Throwable th2) {
                th = th2;
                if (open != null) {
                    open.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            open = null;
            if (open != null) {
                open.close();
            }
            throw th;
        }
    }

    protected URLConnection a(URI uri) {
        URLConnection openConnection = uri.toURL().openConnection();
        openConnection.setConnectTimeout(30000);
        openConnection.setReadTimeout(30000);
        return openConnection;
    }
}
