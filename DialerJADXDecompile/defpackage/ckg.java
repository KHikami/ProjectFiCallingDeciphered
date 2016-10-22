package defpackage;

import android.annotation.TargetApi;
import android.app.ApplicationErrorReport;
import android.app.ApplicationErrorReport.CrashInfo;
import com.google.android.gms.feedback.FeedbackOptions;

@TargetApi(14)
/* renamed from: ckg */
public final class ckg extends ckf {
    private final ApplicationErrorReport f;

    public ckg() {
        this.f = new ApplicationErrorReport();
        this.f.crashInfo = new CrashInfo();
        this.f.crashInfo.throwLineNumber = -1;
    }

    public ckg(Throwable th) {
        this();
        this.f.crashInfo = new CrashInfo(th);
    }

    public final FeedbackOptions a() {
        buf.A(this.f.crashInfo.exceptionClassName);
        buf.A(this.f.crashInfo.throwFileName);
        buf.A(this.f.crashInfo.throwClassName);
        buf.A(this.f.crashInfo.throwMethodName);
        buf.A(this.f.crashInfo.stackTrace);
        return super.a().e.crashInfo = this.f.crashInfo.h = null;
    }
}
