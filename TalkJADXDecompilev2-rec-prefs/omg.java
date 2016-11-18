package p000;

import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream.Builder;
import org.chromium.net.BidirectionalStream.Callback;
import org.chromium.net.CronetEngine;

public class omg {
    final /* synthetic */ CronetEngine f33202a;

    public Builder m38718a(String str, Callback callback, Executor executor) {
        return new Builder(str, callback, executor, this.f33202a);
    }

    omg(CronetEngine cronetEngine) {
        this.f33202a = cronetEngine;
        this();
    }
}
