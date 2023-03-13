package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner spinner,statesp,citysp;
    EditText editText;
    CheckBox chsub,chgu,chin;
    RadioButton male,female,upi,debit,net,cod;
    Button button;
    String list[]={"Chin","India","United States","Indonesia","Pakistan","Brazil","Dubai","Russia","Turkey","France"};
    String state[]={"goa","Andhra Pradesh","Uttar Pradesh","Kerala","Punjab","Gujarat","Rajasthan","Haryana","Delhi","Jammu & Kashmir"};
    String city[]={"bhuj","Ahmedabad","Vadodara","Surat","Rajkot","Junagadh","Bhavnagar","Porbandar","Ankleshwar"};
    ArrayAdapter arrayAdapter,arrayAdapter1,arrayAdapter2;

     DBhelper dBhelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=findViewById(R.id.filedspinner);
        statesp=findViewById(R.id.statspinner);
        citysp=findViewById(R.id.selectcity);
        button=findViewById(R.id.sumbit);
        editText=findViewById(R.id.emailedt);
        chsub=findViewById(R.id.chsub);
        chgu=findViewById(R.id.chgu);
        chin=findViewById(R.id.chin);
        male=findViewById(R.id.male);
        female=findViewById(R.id.female);
        upi=findViewById(R.id.upi);
        debit=findViewById(R.id.debit);
        net=findViewById(R.id.net);
        cod=findViewById(R.id.cod);
        dBhelper = new DBhelper(MainActivity.this);

        arrayAdapter = new ArrayAdapter(MainActivity.this,R.layout.spinnerlayout,R.id.spinitem,list);
        arrayAdapter1 = new ArrayAdapter(MainActivity.this,R.layout.spinnerlayout,R.id.spinitem,state);
        arrayAdapter2 = new ArrayAdapter(MainActivity.this,R.layout.spinnerlayout,R.id.spinitem,city);
        spinner.setAdapter(arrayAdapter);
        statesp.setAdapter(arrayAdapter1);
        citysp.setAdapter(arrayAdapter2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              String semail = editText.getText().toString();
              String filedspinner = spinner.getSelectedItem().toString();
              String states= statesp.getSelectedItem().toString();
              String city = citysp.getSelectedItem().toString();
              String chaqe = "";
              String gender="";
              String payment="";
              if(chsub.isChecked()){

                  chaqe +="1 yaer subscription";

              }
              if(chgu.isChecked()){

                  chaqe += "1 yaer gurrenty";
              }
              if(chin.isChecked()){

                  chaqe += "1 yaer inusreence";
              }
              if (male.isChecked()){

                  gender = "male";
              }
              else{

                  gender = "female";
                }
              if(upi.isChecked()){

                  payment +="upi";

              }
              if (debit.isChecked()){

                  payment +="debit";
              }
              if (net.isChecked()){

                  payment +="net";
              }
              if (cod.isChecked()){

                  payment +="cod";
              }

             dBhelper.infoadd(new Orderinfo(semail,filedspinner,states,city,chaqe,gender,payment));

            }

        });

    }
}