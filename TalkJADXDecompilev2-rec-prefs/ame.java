package p000;

import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

public final class ame implements amg {
    public final HttpClient f1281a;

    public ame(HttpClient httpClient) {
        this.f1281a = httpClient;
    }

    private static void m2897a(HttpUriRequest httpUriRequest, Map<String, String> map) {
        for (String str : map.keySet()) {
            httpUriRequest.setHeader(str, (String) map.get(str));
        }
    }

    private static void m2896a(HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase, alo<?> alo_) {
        byte[] n = alo_.m2858n();
        if (n != null) {
            httpEntityEnclosingRequestBase.setEntity(new ByteArrayEntity(n));
        }
    }

    public HttpResponse mo259a(alo<?> alo_, Map<String, String> map) {
        HttpUriRequest httpGet;
        HttpEntityEnclosingRequestBase httpPost;
        switch (alo_.m2835a()) {
            case -1:
                byte[] k = alo_.m2855k();
                if (k == null) {
                    httpGet = new HttpGet(alo_.m2847c());
                    break;
                }
                httpGet = new HttpPost(alo_.m2847c());
                httpGet.addHeader("Content-Type", alo_.m2854j());
                httpGet.setEntity(new ByteArrayEntity(k));
                break;
            case 0:
                httpGet = new HttpGet(alo_.m2847c());
                break;
            case 1:
                httpPost = new HttpPost(alo_.m2847c());
                httpPost.addHeader("Content-Type", alo_.m2857m());
                ame.m2896a(httpPost, (alo) alo_);
                break;
            case 2:
                httpPost = new HttpPut(alo_.m2847c());
                httpPost.addHeader("Content-Type", alo_.m2857m());
                ame.m2896a(httpPost, (alo) alo_);
                break;
            case 3:
                httpGet = new HttpDelete(alo_.m2847c());
                break;
            case 4:
                httpGet = new HttpHead(alo_.m2847c());
                break;
            case 5:
                httpGet = new HttpOptions(alo_.m2847c());
                break;
            case 6:
                httpGet = new HttpTrace(alo_.m2847c());
                break;
            case 7:
                httpPost = new amf(alo_.m2847c());
                httpPost.addHeader("Content-Type", alo_.m2857m());
                ame.m2896a(httpPost, (alo) alo_);
                break;
            default:
                throw new IllegalStateException("Unknown request method.");
        }
        ame.m2897a(httpGet, (Map) map);
        ame.m2897a(httpGet, alo_.mo462g());
        HttpParams params = httpGet.getParams();
        int p = alo_.m2860p();
        HttpConnectionParams.setConnectionTimeout(params, 5000);
        HttpConnectionParams.setSoTimeout(params, p);
        return this.f1281a.execute(httpGet);
    }
}
