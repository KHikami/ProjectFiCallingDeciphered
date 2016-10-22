package io.grpc.okhttp;

import io.grpc.ManagedChannelProvider;
import io.grpc.internal.bi;

public final class OkHttpChannelProvider extends ManagedChannelProvider {
    public int b() {
        return (bi.a || ManagedChannelProvider.a()) ? 8 : 3;
    }
}
