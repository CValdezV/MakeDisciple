package edu.cwu.makedisciple;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import edu.cwu.makedisciple.Database.DatabaseAccess;

public class DrawerMainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public TextView result_address;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer_main);
        Toolbar toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);






        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.action_bar, menu);
        return true;
    }

    @Override
    //triple dot navigation
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if(id == R.id.aboutAuthor) {
            // User chose the "Settings" item, show the app settings UI...
            Intent intent = new Intent(DrawerMainActivity.this, About.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override

    //navigation bar selection of items to display content on activity

    public boolean onNavigationItemSelected(MenuItem item) {

        // Handle navigation view item clicks here.
        int id = item.getItemId();
        result_address= findViewById(R.id.displayText);
        String textdisplay ="";

        //calling databaseAccess to open the database to pull information
        DatabaseAccess dataAccess=DatabaseAccess.getInstance(getApplicationContext());
        dataAccess.open();

            //abbreviations page link
        if (id == R.id.abbPage) {

            Intent intent = new Intent(DrawerMainActivity.this, Abbreviations.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);

            //introduction page link
        } else if (id == R.id.introPage) {

            textdisplay  = dataAccess.getContent(2);





        }else if(id == R.id.whereToUse){

            textdisplay  = dataAccess.getContent(3);

        }else if(id == R.id.gospelMessage){

            textdisplay  = dataAccess.getContent(4);

        }else if(id == R.id.liveYourLife){

            textdisplay  = dataAccess.getContent(5);

        }else if(id == R.id.beingDisc){

            textdisplay  = dataAccess.getContent(6);

        }else if(id == R.id.mentorDirec){

            textdisplay  = dataAccess.getContent(7);

        }else if(id == R.id.mentorTopics){

            textdisplay  = dataAccess.getContent(8);

        }else if(id == R.id.goals){

            textdisplay  = dataAccess.getContent(9);

        }else if(id == R.id.yourDisc){

            textdisplay  = dataAccess.getContent(10);

        }else if(id == R.id.readingCheck){
            //this is where brads checklist needs to be put
            //as an intent

            textdisplay  = dataAccess.getContent(11);

        }else if(id == R.id.weekByWeek){
                //need to double check what is supposed
                //to be here
            textdisplay  = dataAccess.getContent(12);

        }else if(id == R.id.howToSOAPT){

            textdisplay  = dataAccess.getContent(13);

        }else if(id == R.id.SOAPT){

            textdisplay  = dataAccess.getContent(14);

        }else if(id == R.id.startSOAPT){

            textdisplay  = dataAccess.getContent(15);

        }else if(id == R.id.prayerPage){

            textdisplay  = dataAccess.getContent(16);

        }else if(id == R.id.evanLog){
                //this is the calendar portion
            textdisplay  = dataAccess.getContent(17);

        }else if(id == R.id.addReading){

            textdisplay  = dataAccess.getContent(18);

        }else if(id == R.id.journalPages){
            //part of the note taking
            //left here for now
            textdisplay  = dataAccess.getContent(19);

        }else if(id == R.id.resHall){

            textdisplay  = dataAccess.getContent(20);

        }else if(id == R.id.startRes){

            textdisplay  = dataAccess.getContent(21);

        }else if(id == R.id.useMat){

            textdisplay  = dataAccess.getContent(22);

        }else if(id == R.id.leadStudy){

            textdisplay  = dataAccess.getContent(2);

        }else if(id == R.id.indexStudy){

            textdisplay  = dataAccess.getContent(2);

        }else if(id == R.id.termPlan){

            textdisplay  = dataAccess.getContent(23);

        }else if(id == R.id.indexGoals){

            textdisplay  = dataAccess.getContent(24);

        }else if(id == R.id.indexGodTime){

            textdisplay  = dataAccess.getContent(25);

        }else if(id == R.id.takeNotes){

            //note taking portion left here for now

        }else if(id == R.id.worshipGathering){
            //more for taking notes


        }else if(id == R.id.localNotes){
            //more note taking will remove later

        }else if(id == R.id.acknowledgements){

            textdisplay  = dataAccess.getContent(31);

        }
        //intent to calendar activity
        else if(id == R.id.calendar){
            Intent intent = new Intent(DrawerMainActivity.this, Calendar.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);

            //intent to notes activity
        }else if(id == R.id.notes){
            Intent intent = new Intent(DrawerMainActivity.this, NoteTaking.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        }

        result_address.setText(textdisplay);
        result_address.setMovementMethod(new ScrollingMovementMethod());
        //close the data accessor
        dataAccess.close();
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
