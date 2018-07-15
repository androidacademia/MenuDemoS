package menu.com.girish.menudemo;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ContextMenu;
import android.view.Gravity;
import android.view.MenuInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    private Button btnClick;
    private LinearLayout linearLayoutMain;
    //Popup menu this listener varialble
    /*private PopupMenu.OnMenuItemClickListener popuplistener = new PopupMenu.OnMenuItemClickListener() {
        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {

            return false;
        }
    };*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnClick = findViewById(R.id.button);
        linearLayoutMain = findViewById(R.id.linearLayoutMain);
        registerForContextMenu(linearLayoutMain);


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
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case R.id.action_settings:
                //between here..
                Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_copy:
                Toast.makeText(this, "Copy", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_paste:
                Toast.makeText(this, "Paste", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_android:
                Toast.makeText(this, "Android", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_arduino:
                Toast.makeText(this, "Arduino", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_java:
                Toast.makeText(this, "Java", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id){
            case R.id.action_settings:
                //between here..
                Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_copy:
                Toast.makeText(this, "Copy", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_paste:
                Toast.makeText(this, "Paste", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_android:
                Toast.makeText(this, "Android", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_arduino:
                Toast.makeText(this, "Arduino", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_java:
                Toast.makeText(this, "Java", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void openPopUp(View view) {
        ////Creating POPUp menu....
        // 1. Create an Object of PopUpMenu
        // 2. Inflate the menu by using menuinflater
        // 3. register a listener
        PopupMenu popupMenu = new PopupMenu(this,view);
        //popupMenu.setGravity(Gravity.CENTER);
        MenuInflater menuInflater = popupMenu.getMenuInflater();
        menuInflater.inflate(R.menu.menu_main,popupMenu.getMenu());
        ///1. Use this and implement OnMenuItemClickListener
         popupMenu.setOnMenuItemClickListener(this);
        //

        // 2. use annonymous inner type...
        /*popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {

                return false;
            }
        });*/
        // 3. use a listener variable.....
       // popupMenu.setOnMenuItemClickListener(popuplistener);
        //4. don't forget to call show...
        popupMenu.show();

    }

    // 1. MenuItemClickListener with this..
    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        int id = menuItem.getItemId();

        switch (id){
            case R.id.action_settings:
                //between here..
                Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_copy:
                Toast.makeText(this, "Copy", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_paste:
                Toast.makeText(this, "Paste", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_android:
                Toast.makeText(this, "Android", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_arduino:
                Toast.makeText(this, "Arduino", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_java:
                Toast.makeText(this, "Java", Toast.LENGTH_SHORT).show();
                break;
        }
        return false;
    }
}



















