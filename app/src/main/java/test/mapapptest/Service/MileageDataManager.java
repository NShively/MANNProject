package test.mapapptest.Service;

import android.os.AsyncTask;

import test.mapapptest.Interface.IHttpCallbackListner;
import test.mapapptest.Model.MileageModel;
import test.mapapptest.Parser.MileageParser;

import java.net.URL;

/**
 * Created by nathan on 3/14/15.
 */
public class MileageDataManager extends AsyncTask<MileageSearchRequestArgs, String, MileageModel>{
    private IHttpCallbackListner callback;

    @Override
    protected MileageModel doInBackground(MileageSearchRequestArgs...params){

        MileageSearchRequestArgs args = params[0];

        callback=args.getListner();
        String urlString=args.getUrl();

        HttpRequestManager hrm=new HttpRequestManager();
        String response="";

        try
        {
        URL url = new URL(urlString);

        response=hrm.initiateHttpGet(url.toURI());
        }catch(Exception exception){

        }

        MileageModel model=MileageParser.JSONtoModel(response);

        return model;
        }

        @Override
        protected void onPostExecute(MileageModel mileageModel){
        super.onPostExecute(mileageModel);

     //   callback.onMileageCallback(mileageModel);
        }

}
