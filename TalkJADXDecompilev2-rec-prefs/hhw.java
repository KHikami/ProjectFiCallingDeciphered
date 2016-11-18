package p000;

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
    private Context f16983e;

    public hhw(Context context, Looper looper, guk guk, gul gul, gwa gwa) {
        super(context, looper, 29, gwa, guk, gul);
        this.f16983e = context;
    }

    public static ErrorReport m19820a(FeedbackOptions feedbackOptions, File file) {
        ErrorReport errorReport = new ErrorReport();
        if (feedbackOptions == null) {
            return errorReport;
        }
        if (feedbackOptions.m9714b() != null && feedbackOptions.m9714b().size() > 0) {
            errorReport.f7377E = feedbackOptions.m9714b();
        }
        if (!TextUtils.isEmpty(feedbackOptions.m9713a())) {
            errorReport.f7375C = feedbackOptions.m9713a();
        }
        if (!TextUtils.isEmpty(feedbackOptions.m9716d())) {
            errorReport.f7401c = feedbackOptions.m9716d();
        }
        CrashInfo e = feedbackOptions.m9717e();
        if (e != null) {
            errorReport.f7386N = e.throwMethodName;
            errorReport.f7384L = e.throwLineNumber;
            errorReport.f7385M = e.throwClassName;
            errorReport.f7387O = e.stackTrace;
            errorReport.f7382J = e.exceptionClassName;
            errorReport.f7388P = e.exceptionMessage;
            errorReport.f7383K = e.throwFileName;
        }
        if (feedbackOptions.m9715c() != null) {
            errorReport.f7398Z = feedbackOptions.m9715c();
        }
        if (!TextUtils.isEmpty(feedbackOptions.m9718f())) {
            errorReport.f7389Q = feedbackOptions.m9718f();
        }
        if (!TextUtils.isEmpty(feedbackOptions.m9720h())) {
            errorReport.f7400b.packageName = feedbackOptions.m9720h();
        }
        if (!(feedbackOptions.m9719g() == null || file == null)) {
            errorReport.f7392T = feedbackOptions.m9719g();
            errorReport.f7392T.m9669a(file);
        }
        if (!(feedbackOptions.m9721i() == null || feedbackOptions.m9721i().size() == 0 || file == null)) {
            ArrayList i = feedbackOptions.m9721i();
            int size = i.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = i.get(i2);
                i2++;
                ((FileTeleporter) obj).m9732a(file);
            }
            errorReport.f7394V = (FileTeleporter[]) feedbackOptions.m9721i().toArray(new FileTeleporter[feedbackOptions.m9721i().size()]);
        }
        if (feedbackOptions.m9723k() != null) {
            errorReport.aa = feedbackOptions.m9723k();
        }
        errorReport.f7396X = feedbackOptions.m9722j();
        return errorReport;
    }

    private ErrorReport m19821c(FeedbackOptions feedbackOptions) {
        return hhw.m19820a(feedbackOptions, this.f16983e.getCacheDir());
    }

    public void m19823a(FeedbackOptions feedbackOptions) {
        ((hhx) m18714p()).mo2549a(m19821c(feedbackOptions));
    }

    public void m19824b(FeedbackOptions feedbackOptions) {
        ((hhx) m18714p()).mo2550b(m19821c(feedbackOptions));
    }

    protected String mo2346g() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    protected String mo2347h() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    protected /* synthetic */ IInterface mo2345a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.feedback.internal.IFeedbackService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof hhx)) ? new hhz(iBinder) : (hhx) queryLocalInterface;
    }
}
