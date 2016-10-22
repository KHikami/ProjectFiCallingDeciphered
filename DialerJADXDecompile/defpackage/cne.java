package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import java.io.File;
import java.util.Iterator;

/* renamed from: cne */
public final class cne extends bui {
    private Context e;

    public cne(Context context, Looper looper, brf brf, brg brg, bue bue) {
        super(context, looper, 29, bue, brf, brg);
        this.e = context;
    }

    public final ErrorReport a(FeedbackOptions feedbackOptions) {
        File cacheDir = this.e.getCacheDir();
        ErrorReport errorReport = new ErrorReport();
        if (feedbackOptions != null) {
            if (feedbackOptions.c != null && feedbackOptions.c.size() > 0) {
                errorReport.E = feedbackOptions.c;
            }
            if (!TextUtils.isEmpty(feedbackOptions.b)) {
                errorReport.C = feedbackOptions.b;
            }
            if (!TextUtils.isEmpty(feedbackOptions.d)) {
                errorReport.c = feedbackOptions.d;
            }
            if (feedbackOptions.a() != null) {
                errorReport.N = feedbackOptions.a().throwMethodName;
                errorReport.L = feedbackOptions.a().throwLineNumber;
                errorReport.M = feedbackOptions.a().throwClassName;
                errorReport.O = feedbackOptions.a().stackTrace;
                errorReport.J = feedbackOptions.a().exceptionClassName;
                errorReport.P = feedbackOptions.a().exceptionMessage;
                errorReport.K = feedbackOptions.a().throwFileName;
            }
            if (feedbackOptions.k != null) {
                errorReport.Z = feedbackOptions.k;
            }
            if (!TextUtils.isEmpty(feedbackOptions.f)) {
                errorReport.Q = feedbackOptions.f;
            }
            if (!TextUtils.isEmpty(feedbackOptions.h)) {
                errorReport.b.packageName = feedbackOptions.h;
            }
            if (!(feedbackOptions.g == null || cacheDir == null)) {
                errorReport.T = feedbackOptions.g;
                BitmapTeleporter bitmapTeleporter = errorReport.T;
                if (cacheDir == null) {
                    throw new NullPointerException("Cannot set null temp directory");
                }
                bitmapTeleporter.d = cacheDir;
            }
            if (!(feedbackOptions.i == null || feedbackOptions.i.size() == 0 || cacheDir == null)) {
                Iterator it = feedbackOptions.i.iterator();
                while (it.hasNext()) {
                    FileTeleporter fileTeleporter = (FileTeleporter) it.next();
                    if (cacheDir == null) {
                        throw new NullPointerException("Cannot set null temp directory");
                    }
                    fileTeleporter.e = cacheDir;
                }
                errorReport.V = (FileTeleporter[]) feedbackOptions.i.toArray(new FileTeleporter[feedbackOptions.i.size()]);
            }
            if (feedbackOptions.l != null) {
                errorReport.aa = feedbackOptions.l;
            }
            errorReport.X = feedbackOptions.j;
        }
        return errorReport;
    }

    protected final String f() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    protected final String g() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    protected final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.feedback.internal.IFeedbackService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof cnf)) ? new cnh(iBinder) : (cnf) queryLocalInterface;
    }
}
