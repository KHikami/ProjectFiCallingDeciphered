package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gvi;
import gwb;
import gxw;
import wi;

public final class ConnectionResult extends AbstractSafeParcelable {
    public static final Creator<ConnectionResult> CREATOR;
    public static final ConnectionResult a;
    final int b;
    private final int c;
    private final PendingIntent d;
    private final String e;

    static {
        a = new ConnectionResult(0);
        CREATOR = new gxw();
    }

    public ConnectionResult(int i) {
        this(i, null, null);
    }

    public ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.b = i;
        this.c = i2;
        this.d = pendingIntent;
        this.e = str;
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    private ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, null);
    }

    public boolean a() {
        return (this.c == 0 || this.d == null) ? false : true;
    }

    public boolean b() {
        return this.c == 0;
    }

    public int c() {
        return this.c;
    }

    public PendingIntent d() {
        return this.d;
    }

    public String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.c == connectionResult.c && gwb.e(this.d, connectionResult.d) && gwb.e(this.e, connectionResult.e);
    }

    public int hashCode() {
        return gwb.a(Integer.valueOf(this.c), this.d, this.e);
    }

    public String toString() {
        Object obj;
        gvi K = gwb.K((Object) this);
        String str = "statusCode";
        int i = this.c;
        switch (i) {
            case -1:
                obj = "UNKNOWN";
                break;
            case wi.w /*0*/:
                obj = "SUCCESS";
                break;
            case wi.j /*1*/:
                obj = "SERVICE_MISSING";
                break;
            case wi.l /*2*/:
                obj = "SERVICE_VERSION_UPDATE_REQUIRED";
                break;
            case wi.z /*3*/:
                obj = "SERVICE_DISABLED";
                break;
            case wi.h /*4*/:
                obj = "SIGN_IN_REQUIRED";
                break;
            case wi.p /*5*/:
                obj = "INVALID_ACCOUNT";
                break;
            case wi.s /*6*/:
                obj = "RESOLUTION_REQUIRED";
                break;
            case wi.q /*7*/:
                obj = "NETWORK_ERROR";
                break;
            case wi.m /*8*/:
                obj = "INTERNAL_ERROR";
                break;
            case wi.n /*9*/:
                obj = "SERVICE_INVALID";
                break;
            case wi.dr /*10*/:
                obj = "DEVELOPER_ERROR";
                break;
            case wi.dB /*11*/:
                obj = "LICENSE_CHECK_FAILED";
                break;
            case wi.dD /*13*/:
                obj = "CANCELED";
                break;
            case wi.g /*14*/:
                obj = "TIMEOUT";
                break;
            case wi.dJ /*15*/:
                obj = "INTERRUPTED";
                break;
            case wi.dI /*16*/:
                obj = "API_UNAVAILABLE";
                break;
            case wi.dK /*17*/:
                obj = "SIGN_IN_FAILED";
                break;
            case wi.dH /*18*/:
                obj = "SERVICE_UPDATING";
                break;
            case wi.dL /*19*/:
                obj = "SERVICE_MISSING_PERMISSION";
                break;
            case wi.k /*20*/:
                obj = "RESTRICTED_PROFILE";
                break;
            case wi.f /*21*/:
                obj = "API_VERSION_UPDATE_REQUIRED";
                break;
            case 42:
                obj = "UPDATE_ANDROID_WEAR";
                break;
            case 99:
                obj = "UNFINISHED";
                break;
            case 1500:
                obj = "DRIVE_EXTERNAL_STORAGE_REQUIRED";
                break;
            default:
                obj = "UNKNOWN_ERROR_CODE(" + i + ")";
                break;
        }
        return K.a(str, obj).a("resolution", this.d).a("message", this.e).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.b);
        gwb.d(parcel, 2, c());
        gwb.a(parcel, 3, d(), i, false);
        gwb.a(parcel, 4, e(), false);
        gwb.v(parcel, c);
    }
}
