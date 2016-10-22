import android.app.ApplicationErrorReport;
import android.app.ApplicationErrorReport.CrashInfo;
import com.google.android.gms.feedback.FeedbackOptions;

public final class gyw extends gyv {
    private final ApplicationErrorReport a;
    private String b;

    public gyw() {
        this.a = new ApplicationErrorReport();
        this.a.crashInfo = new CrashInfo();
        this.a.crashInfo.throwLineNumber = -1;
    }

    public FeedbackOptions a() {
        gwb.L(this.a.crashInfo.exceptionClassName);
        gwb.L(this.a.crashInfo.throwFileName);
        gwb.L(this.a.crashInfo.throwClassName);
        gwb.L(this.a.crashInfo.throwMethodName);
        gwb.L(this.a.crashInfo.stackTrace);
        return super.a().e.crashInfo = this.a.crashInfo.h = this.b;
    }

    public gyw a(int i) {
        this.a.crashInfo.throwLineNumber = i;
        return this;
    }

    public gyw d(String str) {
        this.a.crashInfo.exceptionClassName = str;
        return this;
    }

    public gyw e(String str) {
        this.a.crashInfo.throwFileName = str;
        return this;
    }

    public gyw f(String str) {
        this.a.crashInfo.throwClassName = str;
        return this;
    }

    public gyw g(String str) {
        this.a.crashInfo.throwMethodName = str;
        return this;
    }

    public gyw h(String str) {
        this.a.crashInfo.stackTrace = str;
        return this;
    }
}
