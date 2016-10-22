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
    public final HttpClient a;

    public ame(HttpClient httpClient) {
        this.a = httpClient;
    }

    private static void a(HttpUriRequest httpUriRequest, Map<String, String> map) {
        for (String str : map.keySet()) {
            httpUriRequest.setHeader(str, (String) map.get(str));
        }
    }

    private static void a(HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase, alo<?> alo_) {
        byte[] n = alo_.n();
        if (n != null) {
            httpEntityEnclosingRequestBase.setEntity(new ByteArrayEntity(n));
        }
    }

    public HttpResponse a(alo<?> alo_, Map<String, String> map) {
        HttpUriRequest httpGet;
        HttpEntityEnclosingRequestBase httpPost;
        switch (alo_.a()) {
            case -1:
                byte[] k = alo_.k();
                if (k == null) {
                    httpGet = new HttpGet(alo_.c());
                    break;
                }
                httpGet = new HttpPost(alo_.c());
                httpGet.addHeader("Content-Type", alo_.j());
                httpGet.setEntity(new ByteArrayEntity(k));
                break;
            case wi.w /*0*/:
                httpGet = new HttpGet(alo_.c());
                break;
            case wi.j /*1*/:
                httpPost = new HttpPost(alo_.c());
                httpPost.addHeader("Content-Type", alo_.m());
                a(httpPost, (alo) alo_);
                break;
            case wi.l /*2*/:
                httpPost = new HttpPut(alo_.c());
                httpPost.addHeader("Content-Type", alo_.m());
                a(httpPost, (alo) alo_);
                break;
            case wi.z /*3*/:
                httpGet = new HttpDelete(alo_.c());
                break;
            case wi.h /*4*/:
                httpGet = new HttpHead(alo_.c());
                break;
            case wi.p /*5*/:
                httpGet = new HttpOptions(alo_.c());
                break;
            case wi.s /*6*/:
                httpGet = new HttpTrace(alo_.c());
                break;
            case wi.q /*7*/:
                httpPost = new amf(alo_.c());
                httpPost.addHeader("Content-Type", alo_.m());
                a(httpPost, (alo) alo_);
                break;
            default:
                throw new IllegalStateException("Unknown request method.");
        }
        a(httpGet, (Map) map);
        a(httpGet, alo_.g());
        HttpParams params = httpGet.getParams();
        int p = alo_.p();
        HttpConnectionParams.setConnectionTimeout(params, 5000);
        HttpConnectionParams.setSoTimeout(params, p);
        return this.a.execute(httpGet);
    }
}
