package ucb.bo.edu.menuprincipal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MenuPrincipalActivity extends AppCompatActivity {

    private TextView txtSelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        this.txtSelected = (TextView) findViewById(R.id.txtSelected);
    }


    public void selectButton(View view) {
        if (view.getId() == R.id.btnEventos) {
            Intent i = new Intent(this, ServiciosActivity.class);
            startActivity(i);
        } else if (view.getId() == R.id.btnPortafolio) {
            this.txtSelected.setText("Portafolio");
        }
    }
}
