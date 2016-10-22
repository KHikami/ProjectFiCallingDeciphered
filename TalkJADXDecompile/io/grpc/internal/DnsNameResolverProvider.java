package io.grpc.internal;

import bm;
import io.grpc.NameResolverProvider;
import java.net.URI;
import ojh;
import olk;

public final class DnsNameResolverProvider extends NameResolverProvider {
    public String a() {
        return "dns";
    }

    protected int b() {
        return 5;
    }

    public /* synthetic */ olk a(URI uri, ojh ojh) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        Object obj = (String) bm.a(uri.getPath(), (Object) "targetPath");
        bm.a(obj.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", obj, (Object) uri);
        String substring = obj.substring(1);
        uri.getAuthority();
        return new bb(substring, ojh, bi.k, bi.j);
    }
}
