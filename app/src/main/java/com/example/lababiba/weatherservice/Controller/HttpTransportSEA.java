package com.example.lababiba.weatherservice.Controller;

import org.ksoap2.transport.HttpTransportSE;
import org.ksoap2.transport.ServiceConnection;

import java.io.IOException;

/**
 * Created by lexa on 20.04.16.
 */
public class HttpTransportSEA extends HttpTransportSE {
    public HttpTransportSEA(String url) {
        super(url);
    }

    public HttpTransportSEA(String url, int timeout) {
        super(url, timeout);
    }

    public ServiceConnection getHttpConnect() {

        try {
            return this.getServiceConnection();

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }


    }

}
