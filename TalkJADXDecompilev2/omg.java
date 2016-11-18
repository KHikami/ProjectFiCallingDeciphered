package defpackage;

import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream.Builder;
import org.chromium.net.BidirectionalStream.Callback;
import org.chromium.net.CronetEngine;

public class omg {
    final /* synthetic */ CronetEngine a;

    public Builder a(String str, Callback callback, Executor executor) {
        return new Builder(str, callback, executor, this.a);
    }

    omg(CronetEngine cronetEngine) {
        this.a = cronetEngine;
        this();
    }
}
