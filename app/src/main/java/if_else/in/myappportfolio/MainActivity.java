package if_else.in.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // Called when the user touches the button
    public void showMessage(View view) {

        String message;

        Integer clickedButtonId = view.getId();

        //assign proper text message based on button clicked
        switch (clickedButtonId){
            case R.id.button_capstone:
                message = getResources().getString(R.string.button_capstone_text);
                break;
            case R.id.button_spotify_streamer:
                message  = getResources().getString(R.string.button_spotify_streamer_text);
                break;
            case R.id.button_scores_app:
                message  = getResources().getString(R.string.button_scores_app_text);
                break;
            case R.id.button_build_it_bigger:
                message  = getResources().getString(R.string.button_build_it_bigger_text);
                break;
            case R.id.button_xyz_reader:
                message  = getResources().getString(R.string.button_xyz_reader_text);
                break;
            default:
                message  = getResources().getString(R.string.default_welcome_message);
        }
        Toast.makeText(getApplicationContext(), "This button will launch " + message, Toast.LENGTH_SHORT).show();
    }
}
