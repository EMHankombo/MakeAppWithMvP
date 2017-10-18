package com.example.enoch.makeapp.data.network;

import com.example.enoch.makeapp.data.model.ProductModel;
import com.example.enoch.makeapp.data.network.service.ConnectionService;
import com.example.enoch.makeapp.data.network.service.IRequestInterface;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by mainza1992 on 18/10/2017.
 */

public class AppApiHelper implements ApiHelper {

    private IRequestInterface requestInterface;

    //empty constructor
    public AppApiHelper() {
        this.requestInterface = ConnectionService.getConnectionService();
    }

    @Override
    public Observable<List<ProductModel>> useCaseLipstick() {
        return requestInterface.getLipStick();
    }

    @Override
    public Observable<List<ProductModel>> useCaseMascara() {
        return requestInterface.getMascara();
    }

    @Override
    public Observable<List<ProductModel>> useCaseNailPolish() {
        return requestInterface.getNailPolish();
    }

    @Override
    public Observable<List<ProductModel>> useCaseFoundation() {
        return requestInterface.getFoundation();
    }
}
