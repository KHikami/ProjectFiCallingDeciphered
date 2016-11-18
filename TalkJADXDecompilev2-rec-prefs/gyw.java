package p000;

import android.app.ApplicationErrorReport;
import android.app.ApplicationErrorReport.CrashInfo;
import com.google.android.gms.feedback.FeedbackOptions;

public final class gyw extends gyv {
    private final ApplicationErrorReport f16415a;
    private String f16416b;

    public gyw() {
        this.f16415a = new ApplicationErrorReport();
        this.f16415a.crashInfo = new CrashInfo();
        this.f16415a.crashInfo.throwLineNumber = -1;
    }

    public FeedbackOptions mo2426a() {
        gwb.m1419L(this.f16415a.crashInfo.exceptionClassName);
        gwb.m1419L(this.f16415a.crashInfo.throwFileName);
        gwb.m1419L(this.f16415a.crashInfo.throwClassName);
        gwb.m1419L(this.f16415a.crashInfo.throwMethodName);
        gwb.m1419L(this.f16415a.crashInfo.stackTrace);
        return super.mo2426a().f7429e.crashInfo = this.f16415a.crashInfo.f7432h = this.f16416b;
    }

    public gyw m19011a(int i) {
        this.f16415a.crashInfo.throwLineNumber = i;
        return this;
    }

    public gyw m19012d(String str) {
        this.f16415a.crashInfo.exceptionClassName = str;
        return this;
    }

    public gyw m19013e(String str) {
        this.f16415a.crashInfo.throwFileName = str;
        return this;
    }

    public gyw m19014f(String str) {
        this.f16415a.crashInfo.throwClassName = str;
        return this;
    }

    public gyw m19015g(String str) {
        this.f16415a.crashInfo.throwMethodName = str;
        return this;
    }

    public gyw m19016h(String str) {
        this.f16415a.crashInfo.stackTrace = str;
        return this;
    }
}
