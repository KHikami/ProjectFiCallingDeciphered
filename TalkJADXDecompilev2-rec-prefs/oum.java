package p000;

import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetEngine;
import org.chromium.net.RequestFinishedInfo.Listener;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlRequest.Callback;

public final class oum extends CronetEngine {
    private final String f34313a;
    private final ExecutorService f34314b = Executors.newCachedThreadPool(new oun(this));

    public oum(String str) {
        this.f34313a = str;
    }

    public UrlRequest m39732a(String str, Callback callback, Executor executor, int i, Collection<Object> collection, boolean z, boolean z2) {
        return new oup(callback, this.f34314b, executor, str, this.f34313a);
    }

    public BidirectionalStream m39731a(String str, BidirectionalStream.Callback callback, Executor executor, String str2, List<Entry<String, String>> list, int i, boolean z) {
        throw new UnsupportedOperationException("Can't create a bidi stream - httpurlconnection doesn't have those APIs");
    }

    public boolean m39734a() {
        return true;
    }

    public String m39735b() {
        return "CronetHttpURLConnection/" + ("54.0.2837.2@" + "789710f0a9f32a61c3a52b33e9852e98c58027e5-refs/branch-heads/2837@{#3}".substring(0, 8));
    }

    public void m39736c() {
        this.f34314b.shutdown();
    }

    public void m39733a(Listener listener) {
    }
}
