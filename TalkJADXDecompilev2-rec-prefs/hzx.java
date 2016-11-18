package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.AddLocalCapabilityResponse;
import com.google.android.gms.wearable.internal.ChannelReceiveFileResponse;
import com.google.android.gms.wearable.internal.ChannelSendFileResponse;
import com.google.android.gms.wearable.internal.CloseChannelResponse;
import com.google.android.gms.wearable.internal.DeleteDataItemsResponse;
import com.google.android.gms.wearable.internal.GetAllCapabilitiesResponse;
import com.google.android.gms.wearable.internal.GetCapabilityResponse;
import com.google.android.gms.wearable.internal.GetChannelInputStreamResponse;
import com.google.android.gms.wearable.internal.GetChannelOutputStreamResponse;
import com.google.android.gms.wearable.internal.GetCloudSyncOptInOutDoneResponse;
import com.google.android.gms.wearable.internal.GetCloudSyncOptInStatusResponse;
import com.google.android.gms.wearable.internal.GetCloudSyncSettingResponse;
import com.google.android.gms.wearable.internal.GetConfigResponse;
import com.google.android.gms.wearable.internal.GetConfigsResponse;
import com.google.android.gms.wearable.internal.GetConnectedNodesResponse;
import com.google.android.gms.wearable.internal.GetDataItemResponse;
import com.google.android.gms.wearable.internal.GetFdForAssetResponse;
import com.google.android.gms.wearable.internal.GetLocalNodeResponse;
import com.google.android.gms.wearable.internal.OpenChannelResponse;
import com.google.android.gms.wearable.internal.PutDataResponse;
import com.google.android.gms.wearable.internal.RemoveLocalCapabilityResponse;
import com.google.android.gms.wearable.internal.SendMessageResponse;
import com.google.android.gms.wearable.internal.StorageInfoResponse;

public abstract class hzx extends Binder implements hzw {
    public hzx() {
        attachInterface(this, "com.google.android.gms.wearable.internal.IWearableCallbacks");
    }

    public static hzw m21299a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof hzw)) ? new hzy(iBinder) : (hzw) queryLocalInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        RemoveLocalCapabilityResponse removeLocalCapabilityResponse = null;
        CloseChannelResponse closeChannelResponse;
        switch (i) {
            case 2:
                GetConfigResponse getConfigResponse;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    getConfigResponse = (GetConfigResponse) GetConfigResponse.CREATOR.createFromParcel(parcel);
                }
                mo3070a(getConfigResponse);
                parcel2.writeNoException();
                return true;
            case 3:
                PutDataResponse putDataResponse;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    putDataResponse = (PutDataResponse) PutDataResponse.CREATOR.createFromParcel(parcel);
                }
                mo3077a(putDataResponse);
                parcel2.writeNoException();
                return true;
            case 4:
                GetDataItemResponse getDataItemResponse;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    getDataItemResponse = (GetDataItemResponse) GetDataItemResponse.CREATOR.createFromParcel(parcel);
                }
                mo3073a(getDataItemResponse);
                parcel2.writeNoException();
                return true;
            case 5:
                DataHolder dataHolder;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    dataHolder = (DataHolder) DataHolder.CREATOR.createFromParcel(parcel);
                }
                mo3057a(dataHolder);
                parcel2.writeNoException();
                return true;
            case 6:
                DeleteDataItemsResponse deleteDataItemsResponse;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    deleteDataItemsResponse = (DeleteDataItemsResponse) DeleteDataItemsResponse.CREATOR.createFromParcel(parcel);
                }
                mo3062a(deleteDataItemsResponse);
                parcel2.writeNoException();
                return true;
            case 7:
                SendMessageResponse sendMessageResponse;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    sendMessageResponse = (SendMessageResponse) SendMessageResponse.CREATOR.createFromParcel(parcel);
                }
                mo3079a(sendMessageResponse);
                parcel2.writeNoException();
                return true;
            case 8:
                GetFdForAssetResponse getFdForAssetResponse;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    getFdForAssetResponse = (GetFdForAssetResponse) GetFdForAssetResponse.CREATOR.createFromParcel(parcel);
                }
                mo3074a(getFdForAssetResponse);
                parcel2.writeNoException();
                return true;
            case 9:
                GetLocalNodeResponse getLocalNodeResponse;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    getLocalNodeResponse = (GetLocalNodeResponse) GetLocalNodeResponse.CREATOR.createFromParcel(parcel);
                }
                mo3075a(getLocalNodeResponse);
                parcel2.writeNoException();
                return true;
            case 10:
                GetConnectedNodesResponse getConnectedNodesResponse;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    getConnectedNodesResponse = (GetConnectedNodesResponse) GetConnectedNodesResponse.CREATOR.createFromParcel(parcel);
                }
                mo3072a(getConnectedNodesResponse);
                parcel2.writeNoException();
                return true;
            case 11:
                Status status;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    status = (Status) Status.CREATOR.createFromParcel(parcel);
                }
                mo3056a(status);
                parcel2.writeNoException();
                return true;
            case 12:
                StorageInfoResponse storageInfoResponse;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    storageInfoResponse = (StorageInfoResponse) StorageInfoResponse.CREATOR.createFromParcel(parcel);
                }
                mo3080a(storageInfoResponse);
                parcel2.writeNoException();
                return true;
            case 13:
                GetConfigsResponse getConfigsResponse;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    getConfigsResponse = (GetConfigsResponse) GetConfigsResponse.CREATOR.createFromParcel(parcel);
                }
                mo3071a(getConfigsResponse);
                parcel2.writeNoException();
                return true;
            case 14:
                OpenChannelResponse openChannelResponse;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    openChannelResponse = (OpenChannelResponse) OpenChannelResponse.CREATOR.createFromParcel(parcel);
                }
                mo3076a(openChannelResponse);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    closeChannelResponse = (CloseChannelResponse) CloseChannelResponse.CREATOR.createFromParcel(parcel);
                }
                mo3061a(closeChannelResponse);
                parcel2.writeNoException();
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    closeChannelResponse = (CloseChannelResponse) CloseChannelResponse.CREATOR.createFromParcel(parcel);
                }
                mo3081b(closeChannelResponse);
                parcel2.writeNoException();
                return true;
            case wi.dK /*17*/:
                GetChannelInputStreamResponse getChannelInputStreamResponse;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    getChannelInputStreamResponse = (GetChannelInputStreamResponse) GetChannelInputStreamResponse.CREATOR.createFromParcel(parcel);
                }
                mo3065a(getChannelInputStreamResponse);
                parcel2.writeNoException();
                return true;
            case wi.dH /*18*/:
                GetChannelOutputStreamResponse getChannelOutputStreamResponse;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    getChannelOutputStreamResponse = (GetChannelOutputStreamResponse) GetChannelOutputStreamResponse.CREATOR.createFromParcel(parcel);
                }
                mo3066a(getChannelOutputStreamResponse);
                parcel2.writeNoException();
                return true;
            case wi.dL /*19*/:
                ChannelReceiveFileResponse channelReceiveFileResponse;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    channelReceiveFileResponse = (ChannelReceiveFileResponse) ChannelReceiveFileResponse.CREATOR.createFromParcel(parcel);
                }
                mo3059a(channelReceiveFileResponse);
                parcel2.writeNoException();
                return true;
            case 20:
                ChannelSendFileResponse channelSendFileResponse;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    channelSendFileResponse = (ChannelSendFileResponse) ChannelSendFileResponse.CREATOR.createFromParcel(parcel);
                }
                mo3060a(channelSendFileResponse);
                parcel2.writeNoException();
                return true;
            case 22:
                GetCapabilityResponse getCapabilityResponse;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    getCapabilityResponse = (GetCapabilityResponse) GetCapabilityResponse.CREATOR.createFromParcel(parcel);
                }
                mo3064a(getCapabilityResponse);
                parcel2.writeNoException();
                return true;
            case wi.f29038do /*23*/:
                GetAllCapabilitiesResponse getAllCapabilitiesResponse;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    getAllCapabilitiesResponse = (GetAllCapabilitiesResponse) GetAllCapabilitiesResponse.CREATOR.createFromParcel(parcel);
                }
                mo3063a(getAllCapabilitiesResponse);
                parcel2.writeNoException();
                return true;
            case wi.dx /*26*/:
                AddLocalCapabilityResponse addLocalCapabilityResponse;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    addLocalCapabilityResponse = (AddLocalCapabilityResponse) AddLocalCapabilityResponse.CREATOR.createFromParcel(parcel);
                }
                mo3058a(addLocalCapabilityResponse);
                parcel2.writeNoException();
                return true;
            case 27:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    removeLocalCapabilityResponse = (RemoveLocalCapabilityResponse) RemoveLocalCapabilityResponse.CREATOR.createFromParcel(parcel);
                }
                mo3078a(removeLocalCapabilityResponse);
                parcel2.writeNoException();
                return true;
            case 28:
                GetCloudSyncOptInOutDoneResponse getCloudSyncOptInOutDoneResponse;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    getCloudSyncOptInOutDoneResponse = (GetCloudSyncOptInOutDoneResponse) GetCloudSyncOptInOutDoneResponse.CREATOR.createFromParcel(parcel);
                }
                mo3067a(getCloudSyncOptInOutDoneResponse);
                parcel2.writeNoException();
                return true;
            case 29:
                GetCloudSyncSettingResponse getCloudSyncSettingResponse;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    getCloudSyncSettingResponse = (GetCloudSyncSettingResponse) GetCloudSyncSettingResponse.CREATOR.createFromParcel(parcel);
                }
                mo3069a(getCloudSyncSettingResponse);
                parcel2.writeNoException();
                return true;
            case 30:
                GetCloudSyncOptInStatusResponse getCloudSyncOptInStatusResponse;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    getCloudSyncOptInStatusResponse = (GetCloudSyncOptInStatusResponse) GetCloudSyncOptInStatusResponse.CREATOR.createFromParcel(parcel);
                }
                mo3068a(getCloudSyncOptInStatusResponse);
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.wearable.internal.IWearableCallbacks");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
