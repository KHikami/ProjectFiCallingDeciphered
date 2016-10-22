import android.app.ApplicationErrorReport.CrashInfo;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import java.io.File;
import java.util.ArrayList;

public final class hhw extends gwg<hhx> {
    private Context e;

    public hhw(Context context, Looper looper, guk guk, gul gul, gwa gwa) {
        super(context, looper, 29, gwa, guk, gul);
        this.e = context;
    }

    public static ErrorReport a(FeedbackOptions feedbackOptions, File file) {
        ErrorReport errorReport = new ErrorReport();
        if (feedbackOptions == null) {
            return errorReport;
        }
        if (feedbackOptions.b() != null && feedbackOptions.b().size() > 0) {
            errorReport.E = feedbackOptions.b();
        }
        if (!TextUtils.isEmpty(feedbackOptions.a())) {
            errorReport.C = feedbackOptions.a();
        }
        if (!TextUtils.isEmpty(feedbackOptions.d())) {
            errorReport.c = feedbackOptions.d();
        }
        CrashInfo e = feedbackOptions.e();
        if (e != null) {
            errorReport.N = e.throwMethodName;
            errorReport.L = e.throwLineNumber;
            errorReport.M = e.throwClassName;
            errorReport.O = e.stackTrace;
            errorReport.J = e.exceptionClassName;
            errorReport.P = e.exceptionMessage;
            errorReport.K = e.throwFileName;
        }
        if (feedbackOptions.c() != null) {
            errorReport.Z = feedbackOptions.c();
        }
        if (!TextUtils.isEmpty(feedbackOptions.f())) {
            errorReport.Q = feedbackOptions.f();
        }
        if (!TextUtils.isEmpty(feedbackOptions.h())) {
            errorReport.b.packageName = feedbackOptions.h();
        }
        if (!(feedbackOptions.g() == null || file == null)) {
            errorReport.T = feedbackOptions.g();
            errorReport.T.a(file);
        }
        if (!(feedbackOptions.i() == null || feedbackOptions.i().size() == 0 || file == null)) {
            ArrayList i = feedbackOptions.i();
            int size = i.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = i.get(i2);
                i2++;
                ((FileTeleporter) obj).a(file);
            }
            errorReport.V = (FileTeleporter[]) feedbackOptions.i().toArray(new FileTeleporter[feedbackOptions.i().size()]);
        }
        if (feedbackOptions.k() != null) {
            errorReport.aa = feedbackOptions.k();
        }
        errorReport.X = feedbackOptions.j();
        return errorReport;
    }

    private ErrorReport c(FeedbackOptions feedbackOptions) {
        return a(feedbackOptions, this.e.getCacheDir());
    }

    public void a(FeedbackOptions feedbackOptions) {
        ((hhx) p()).a(c(feedbackOptions));
    }

    public void b(FeedbackOptions feedbackOptions) {
        ((hhx) p()).b(c(feedbackOptions));
    }

    protected String g() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    protected String h() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    protected /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.feedback.internal.IFeedbackService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof hhx)) ? new hhz(iBinder) : (hhx) queryLocalInterface;
    }
}
