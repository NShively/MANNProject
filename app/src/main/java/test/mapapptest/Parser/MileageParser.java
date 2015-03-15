package test.mapapptest.Parser;

import test.mapapptest.Model.MileageModel;

import android.net.Uri;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/**
 * Created by nathan on 3/14/15.
 */
public class MileageParser
{
    static public MileageModel JSONtoModel(String input)
    {
        MileageModel model = new MileageModel();

        JSONObject json;

        try {
            json = (JSONObject) new JSONTokener(input).nextValue();
            JSONArray array = json.getJSONArray("results");
            JSONObject mileage = array.getJSONObject(0);
            
            model.setUserMileage((int) mileage.get("mileage"));
       //     model.setYear((String) year.get("year"));
       //     model.setMake((String) make.get("make"));
       //     model.setModel((String) carModel.get("carModel"));
       //     model.setModel((String) options.get("options"));
        }
        catch (JSONException exception)
        {
            exception.getCause();
        }

        return model;
    }
}
