package test.mapapptest.Service;

import test.mapapptest.Interface.IHttpCallbackListner;

/**
 * Created by nathan on 3/14/15.
 */
public class MileageSearchRequestArgs {
    private IHttpCallbackListner listner;
    private String url;

    public IHttpCallbackListner getListner()
    {
        return listner;
    }

    public void setListner(IHttpCallbackListner listner)
    {
        this.listner = listner;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }
}
